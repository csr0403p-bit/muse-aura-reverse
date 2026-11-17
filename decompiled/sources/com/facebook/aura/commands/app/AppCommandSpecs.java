package com.facebook.aura.commands.app;

import com.facebook.aura.nodes.core.NodeCommandSpec;

/* loaded from: classes5.dex */
public final class AppCommandSpecs {
    public static final AppCommandSpecs INSTANCE = new AppCommandSpecs();
    public static final NodeCommandSpec APP_INFO = new NodeCommandSpec("Reports the state of this app on the device: the installed app version, where the app was installed from, whether it is the device's default digital assistant and whether the device lets the user make it the default, whether its home screen shortcut is supported and already added, whether Run in background is on, and which setup actions are available right now (available_actions, as command ids). Use when the user asks which app version they have, how the app is set up, or how to make it the default assistant or add it to the home screen.", null, null, null, null, "The current state of this app on the device.", 0, 94, null);
    public static final NodeCommandSpec APP_UPDATE_CHECK = new NodeCommandSpec("Checks Google Play for a newer version of this app. Reports the installed version, whether an update is available and its version code, how many days Play has known about it, and whether an update is already downloading, downloaded and waiting to install, or failed. Use when the user asks whether there is an app update, whether their app is up to date, or why a new feature is missing.", null, null, null, null, "The Google Play update status of this app.", 20000, 30, null);
    public static final NodeCommandSpec ASSISTANT_SET_DEFAULT = new NodeCommandSpec("Helps the user make this app the device's default digital assistant. Shows a card in the conversation; when the user taps it, the system settings open where they choose the default assistant app. Waits for the user. Use when the user asks to make this app their default assistant or to open it with the assistant gesture or button. Call it even if the app may already be the default assistant; it then reports already_done without showing a card, so tell the user it is already set. The result's outcome is completed when the user finished it, declined when they turned it down or did not finish, failed when it could not be started, expired when they did not respond in time, not_shown when no conversation was on screen to show the card, already_done when nothing was needed, or unsupported when this device can't do it.", null, null, null, null, "What happened when the user was offered to make this app the default assistant.", 120000, 30, null);
    public static final NodeCommandSpec SHORTCUT_ADD_HOME = new NodeCommandSpec("Helps the user add a shortcut to this assistant on their home screen. Shows a card in the conversation; when the user taps it, the launcher asks them to confirm adding the shortcut. Waits for the user. Use when the user asks to add this app or assistant to their home screen. The result's outcome is completed when the user finished it, declined when they turned it down or did not finish, failed when it could not be started, expired when they did not respond in time, not_shown when no conversation was on screen to show the card, already_done when nothing was needed, or unsupported when this device can't do it.", null, null, null, null, "What happened when the user was offered the home screen shortcut.", 120000, 30, null);
    public static final NodeCommandSpec APP_UPDATE_START = new NodeCommandSpec("Helps the user update this app from Google Play. Shows a card in the conversation; when the user taps it, Google Play asks them to confirm, the update downloads in the background, and the app offers a restart when it is ready. Waits for the user. Use when the user asks to update the app. The result's outcome is completed when the user finished it, declined when they turned it down or did not finish, failed when it could not be started, expired when they did not respond in time, not_shown when no conversation was on screen to show the card, already_done when nothing was needed, or unsupported when this device can't do it. already_done here means the app is up to date. It can also be in_progress when an update is already downloading or downloaded and waiting for a restart, or use_play_store when the update can't run in the app (an earlier download failed or was cancelled, or Google Play doesn't allow it), in which case tell the user to update it from the Google Play Store. Call it even if the user turned an update down before; asking again shows the card again.", null, null, null, null, "What happened when the user was offered the app update.", 120000, 30, null);

    public final NodeCommandSpec getAPP_INFO() {
        return APP_INFO;
    }

    public final NodeCommandSpec getAPP_UPDATE_CHECK() {
        return APP_UPDATE_CHECK;
    }

    public final NodeCommandSpec getAPP_UPDATE_START() {
        return APP_UPDATE_START;
    }

    public final NodeCommandSpec getASSISTANT_SET_DEFAULT() {
        return ASSISTANT_SET_DEFAULT;
    }

    public final NodeCommandSpec getSHORTCUT_ADD_HOME() {
        return SHORTCUT_ADD_HOME;
    }
}
