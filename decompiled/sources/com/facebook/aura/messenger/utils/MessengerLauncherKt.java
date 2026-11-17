package com.facebook.aura.messenger.utils;

import X.C7384Etj;
import android.content.Context;
import com.facebook.aura.channels.ChannelApp;
import com.facebook.aura.channels.ChannelAppLauncherKt;

/* loaded from: classes.dex */
public abstract class MessengerLauncherKt {
    public static final String HATCH_PIN_RESET_DEEPLINK = "fb-messenger://encrypted_backups_reset_pin_from_hatch";

    public static final void launchMessengerForPinReset(Context context) {
        C7384Etj.A0Y(context, 0);
        ChannelAppLauncherKt.openChannelApp(context, ChannelApp.MESSENGER, HATCH_PIN_RESET_DEEPLINK);
    }
}
