AndroidHeartBeatFixer
=====================

Way to set heartbeat interval and the User receive PushNotifications from GCM. Based on a Google Forums post about HeartBeat problem.
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-AndroidHeartBeatFixer-brightgreen.svg?style=flat)](http://android-arsenal.com/details/3/2772)

How GCM push notifications connection works?
==================================================

"Android push notifications works through one TCP connection on the port 5228 between the phone and google servers. This connection is established when the phone connect to a network. All android push apps (gmail, whatsapp, hangouts, etc.) use Google Cloud Messaging (GCM) to send and receive push notifications thought that connection."

What's "HeartBeat"?
===================

"Android have a mechanism to send a little network packet (called heartbeat) every x minutes to avoid the tcp connection timeout and check if the connection is alive; that is a wide common and working practice. If the connection is not alive, the GCM connection is re-established and previously  notifications and new one come again."

What's the problem?
====================

"The problem is that the heartbeat is sent with the following intervals: 
- every 28 minutes on mobile connection, 2g/3g/4g;
- every 15 minutes on wifi;"

Can I solve this problem?
===============

You can "solve" this problem today setting heartbeat interval from your app calling two intents from android:
* ``com.google.android.intent.action.MCS_HEARTBEAT``
* ``com.google.android.intent.action.GTALK_HEARTBEAT``

Source of explanations about HeartBeat - https://productforums.google.com/forum/#!msg/nexus/fslYqYrULto/lU2D3Qe1mugJ


