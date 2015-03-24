# DroidWall change log #

**Please, consider [donating](https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=G3SNNAKRK5YV4&lc=US&item_name=DroidWall&item_number=DroidWall&currency_code=USD&bn=PP-DonationsBF:btn_donate_LG.gif:NonHosted) if you like this product and want to contribute with its development. Thank you very much.**

**DroidWall v1.5.7** - December/14/2011 _(Latest version)_
  * Fixed rules restore on boot on Ice Cream Sandwich.

**DroidWall v1.5.6** - December/09/2011
  * Load application icons on a background task to reduce the overhead.
  * Added application UIDs back to the list.

**DroidWall v1.5.5** - December/01/2011
  * Added application icons to the list.
  * New applications are shown on the top of the list.
  * Enabled hardware acceleration on Android >= 3.0.

**DroidWall v1.5.4** - October/14/2011
  * Fixed OK button not showing in the Custom Script dialog on some devices. Pressing "back" also asks to apply on that screen now.
  * Added support for a custom shutdown script, which can be used to define cleanup rules when the firewall is disabled.
  * Avoid reloading the apps list all the time.
  * Various bug fixes and enhancements.

**DroidWall v1.5.3** - September/29/2011
  * Added support for custom scripts. See CustomScripts for more details.
  * Added Czech Translation (Česky)

**DroidWall v1.5.2** - July/20/2011
  * Fixed "Exit code: -1" errors!
  * Compatibility fixes for some devices.
  * New iptables 1.4.10 binary, compiled using Android NDKr6 and with support for almost all iptables targets.
  * Updated translations for Russian, Italian and French.

**DroidWall v1.5.1** - April/28/2011
  * Now using a home-made iptables 1.4.10 binary, which should work on all ARM devices (no more segfaults/illegal instructions - hopefully).
  * Changed the directory for binary files. This should avoid problems after running "fix permissions".
  * Case-insensitive sorting on the list of applications.
  * Added "GPS" application to the list on systems that have a separated ID for it.
  * Fixed ANR on boot and when using the widget.
  * Added support for more 3G and 4G interfaces.

**DroidWall v1.5.0** - February/25/2011
  * New "OFF" widget icon, which should work better for colorblind sufferers.
  * Added German (de) translation. Thanks to "zionis...@googlemail.com"
  * Added Russian (ru) translation. Thanks to "DeathSta...@gmail.com"

**DroidWall v1.4.9** - February/23/2011
  * New icon! Thanks to Alfredo and Fernando Vicente
  * Added Chinese (zh-CN) translation. Thanks to "Cye3s...@gmail.com"
  * Added Arabic (ar) translation. Thanks to "lio...@gmail.com"
  * Added French (fr) translation. Thanks to Massedil "g.desp...@gmail.com"

**DroidWall v1.4.8** - February/02/2011
  * Fixed a bug introduced on v1.4.7 where updated applications would be erroneously deselected on DroidWall

**DroidWall v1.4.7** - February/01/2011
  * Added support for blocking/unblocking connections from the kernel. This fixes compatibility with applications such as CifsManager.
  * Fixed a bug where newly installed apps would be selected on DroidWall if you had removed a selected app ([issue 79](https://code.google.com/p/droidwall/issues/detail?id=79)).

**DroidWall v1.4.6** - December/29/2010
  * Added support for Wimax interfaces
  * Fixed force-close on rare situation while switching orientation
  * Happy new year! :)

**DroidWall v1.4.5** - November/25/2010
  * This is a minor bug-fix release
  * Definitive fix for the "Reading applications" dialog getting stuck.

**DroidWall v1.4.4** - November/24/2010
  * ~~Fixed a bug where application list refresh could get stuck forever.~~ _(not for all situations. definitive fix will be on v1.4.5)_
  * Changed the default firewall state to "disabled" right after installing DroidWall. This avoids problems if you install it and forget to set the rules.
  * Added "Exit" menu option to completely exit the application. Please note that this does not affect the firewall state at all.
  * Added "pt-BR" Portuguese (Brazilian) translation.
  * Resolution independent UI for better visualization on tablets.

**DroidWall v1.4.3** - November/16/2010
  * Application list is now automatically refreshed.
  * Log output now displays the number of packets blocked per destination IP address.
  * Fixed "Exit code: -1" error on some devices.

**DroidWall v1.4.2** - September/29/2010
  * Fixed compatibility with devices without the "test" command available.
  * Fixed a bug where one of the selected applications would be ignored, as if it was not selected at all.
  * Fixed "grep command is required" error on phones that have busybox grep but the link is not in the system path.
  * Added support for some 4G/Wi-max interfaces.
  * Added a simple logging support! It is now possible to determine which applications have been blocked by DroidWall, if your kernel supports this functionality.
  * Added a simple busybox binary, so you don't have to install busybox manually anymore.

**DroidWall v1.4.1** - September/08/2010
  * Fix segfault on newer devices.
  * This version includes two different iptables binaries, and choose which to use on run-time. If none of the included versions work, it will still attempt to use the system version (if any).

**DroidWall v1.4.0** - September/06/2010
  * **IMPORTANT: If you have DroidWall enabled and update to this version, please reboot your phone to flush old iptables rules. If you disable DroidWall before updating, this is not necessary.**
  * Don't use system iptables anymore. An iptables binary is bundled with DroidWall now.
  * Show Rules now display detailed output (iptables -L -v).
  * Avoid conflicts with other application that use iptables by defining a custom netfilter chain.
  * Added widget to easily enable/disable the firewall from home (official now)
  * Improved "reading installed applications" performance by caching the necessary data (only the first load after installing will still be slow).
  * Fixed compatibility with many devices.
  * Better compatibility with some "Superuser Permissions" versions.

**DroidWall v1.3.7** - April/28/2010 _(Latest version)_
  * Only show "Internet-enabled" applications in the list.
  * Added per-application independent interface selection. You can now allow some applications to use only Wi-fi while others can use both Wi-fi and 3G, for example. Thanks to Adrian Pasvante.
  * Fix a problem restoring rules at startup by storing only the application UID. This has a possible side-effect if you remove and install many applications since the UID might be reused, but the benefit seems worth the risk on this case. Thanks to Adrian Pasvante.

**DroidWall v1.3.6** - January/14/2010
  * Much faster rules restore on reboot - fixes "not responding" and force close on start up
  * It is now possible to completely disable the firewall functionality (and it won't re-enable on reboot). Check the new "Disable Firewall" menu item
  * Removed the "Purge Rules" menu item (replaced by the new "Disable Firewall")
  * If you receive an error during the update, please uninstall the previous version and try again

**DroidWall v1.3.5** - September/10/2009
  * Tests are now being performed on Cyanogen's ROM
  * Added "Media server" to the applications list. This process is used to download media in the background. This fixes You-Tube for Cyanogen users.

**DroidWall v1.3.4** - September/10/2009
  * Added "(Applications running as root)" to the applications list. This fixes problems with some applications (such as You-tube) that download things as root.

**DroidWall v1.3.3** - August/10/2009
  * Increased timeouts for root commands.

**DroidWall v1.3.2** - August/03/2009
  * Bug fix: DroidWall was blocking DHCP requests when "White listing" Wi-fi.

**DroidWall v1.3.1** - August/03/2009
  * Added optional password protection lock
  * Added network interfaces selection (2G/3G, Wi-fi, Both)
  * Added "White list" or "Black list" operation mode
  * Added a protection against getting "stuck" while running **su**
  * Much better help dialog :)
  * Minor performance enhancements
  * Reduced application size by removing unnecessary images

**DroidWall v1.3.0** - July/29/2009
  * Better handling of root commands and errors
  * Removed temporary shell script for a better compatibility with some ROMs. All root commands are now executed through a shell session
  * Added root permission check before executing commands, giving a much better message to the user when root access cannot be acquired
  * Added specific iptables error verification, informing the user why it has failed and how to fix the problem if possible
  * Added a verification and warning when the "Wireless Tether for Root Users" application is installed, since DroidWall may conflict with it.
  * Minor performance enhancements

**DroidWall v1.2** - July/28/2009
  * Added error detection while applying iptable rules. The ouput will be displayed on a dialog box to help tracking the problem
  * Minor performance improvements

**DroidWall v1.1** - July/27/2009
  * Better help instructions