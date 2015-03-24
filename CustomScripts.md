# Introduction #

Advanced DroidWall users may wish to define a custom script to be executed by DroidWall.

Once a custom script is defined, it will be automatically executed every time that the DroidWall rules are applied (inclusive on startup, if the firewall is enabled).

To define a custom script, just choose "Set custom script" from the menu.

<font color='red'>WARNING: This functionality should be used only by experienced users that know what they are doing.</font>

# Adding custom rules #

If you want to add custom iptables rules, just use the **$IPTABLES** shell variable to call iptables.

The following iptables chains can be used to add custom rules:
  * **droidwall** - This is the main DroidWall chain. All OUTPUT packets will pass through it. It is therefore the perfect place if you want to add rules that apply to any interface.
  * **droidwall-3g** - This chain will only receive OUTPUT packets for the cellular network interface (no matter if it is 2G,3G,4G, etc).
  * **droidwall-wifi** - This chain will only receive OUTPUT packets for the Wi-Fi interface.
  * **droidwall-reject** - This chain should be used as a **target** when you want to reject and log a packet. When the logging is disabled, this is exactly the same as the built-in **REJECT** target

Please note that all those chains are guaranteed to be cleared before the custom script is executed, so you don't need to worry about rules cleanup on your script **IF** you are using those chains.

If you use any chain not listed above, then you need to manually purge it BEFORE adding your custom rules (otherwise the rules will be duplicated every time they are applied). **On this case, you will also need to manually purge you rules when the firewall is disabled, by defining a custom shutdown script**

**IMPORTANT: Never manually purge the OUTPUT chain - this will cause DroidWall rules to be ignored. Use the 'droidwall' chain instead**

## Examples ##
```
# Always allow connections to 192.168.0.1, no matter the interface
$IPTABLES -A "droidwall" --destination "192.168.0.1" -j RETURN
```
```
# Allow all connections to the local network (192.168.0.XXX) on Wi-fi
$IPTABLES -A "droidwall-wifi" --destination "192.168.0.0/24" -j RETURN
```
```
# Block all connections in the TCP port 80 (http) 
$IPTABLES -A "droidwall" -p TCP --destination-port 80 -j "droidwall-reject"
```
```
# Block HTTP connections, but only on cellular interface
$IPTABLES -A "droidwall-3g" -p TCP --destination-port 80 -j "droidwall-reject"
```

If you want DroidWall to report failures on your rules, you must manually "exit" from the script on error. E.g.:
```
# Try to apply my custom rule, but report any failure (and abort)
$IPTABLES -A "droidwall" --destination "192.168.0.1" -j RETURN || exit
# Try to apply another custom rule, but ignore any errors on it
$IPTABLES -A "droidwall" -p TCP --destination-port 80 -j "droidwall-reject"
```

# Loading scripts from files #

Big scripts can be quite hard to edit in the "Set custom script" screen, so it may be a good idea to put your script in a file, then load it from there.

To do that, just use the "." (dot) shell command in the "Set custom script" dialog to load your script from an external file. E.g.:
```
. /path/to/script.sh
```
This will cause your script file to be loaded and executed every time the rules are applied.

You can even have multiple scripts executed in sequence...
```
. /path/to/load-modules.sh
. /path/to/myrules.sh
. /path/to/myscript.sh
```

However, please note that this can create a serious security breach on your device, since the script will be always executed as **root**!
You must place your script where other applications will not be able to modify it (the sdcard is NOT a good place).