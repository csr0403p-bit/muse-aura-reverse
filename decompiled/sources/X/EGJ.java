package X;

import android.app.Notification;

/* loaded from: classes5.dex */
public abstract class EGJ {
    public static void A00(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void A01(Notification.Builder builder) {
        builder.setForegroundServiceBehavior(1);
    }
}
