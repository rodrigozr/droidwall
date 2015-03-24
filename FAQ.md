# FAQ - Frequently Asked Questions #

## Common error messages: ##

**1. can't initialize iptables table 'filter': Table does not exist (do you need to insmod?) Perhaps iptables or your kernel needs to be upgraded.**

> This error message unfortunately means that your kernel does not support iptables/netfilter, so DroidWall will not work.

> The only possible solution is to flash a customized ROM (or kernel) with full netfilter support.

**2. no chains/target/match by that name**
> This error message unfortunately means that your kernel does not support **netfilter owner match** module, so DroidWall will not work.

> The only possible solution is to flash a customized ROM (or kernel) with full netfilter support.

> ROM developers, please ensure that the following configuration option is enabled in the kernel (either built-in or as a module): **CONFIG\_NETFILTER\_XT\_MATCH\_OWNER**


---

## Common problems: ##

**1. I cannot send/receive MMS with the firewall enabled.**

> Enable the **"Messaging"** application to access your 2G/3G network.

**2. I cannot watch YouTube videos.**

> Enable the **"YouTube"** application (for searching) and the **"Media Server"** (for playback).

**3. I cannot use the Market.**

> Enable the following applications: **"Market"**; **"Media Storage, DRM Protected Content Storage, Download Manager"** and **"Calendar Sync Adapter, Google Services Framework, Contacts Sync Adapter"** (for download)