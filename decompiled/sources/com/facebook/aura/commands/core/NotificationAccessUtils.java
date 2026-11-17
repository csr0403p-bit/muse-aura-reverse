package com.facebook.aura.commands.core;

import X.C7384Etj;
import X.C7BY;
import android.content.Context;
import android.provider.Settings;

/* loaded from: classes3.dex */
public final class NotificationAccessUtils {
    public static final int $stable = 0;
    public static final NotificationAccessUtils INSTANCE = new NotificationAccessUtils();

    public final boolean isNotificationAccessGranted(Context context) {
        C7384Etj.A0Y(context, 0);
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        if (string != null) {
            return C7BY.A0q(string, context.getPackageName(), false);
        }
        return false;
    }
}
