package com.facebook.aura.notifications.push;

import X.AnonymousClass005;
import android.app.NotificationManager;
import android.content.Context;
import com.facebook.aura.partners.voice.background.VoiceNotificationChannel;

/* loaded from: classes3.dex */
public class NotificationChannelContributorStatic {
    public static void ensureChannels(int i, Context context, NotificationManager notificationManager) {
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        VoiceNotificationChannel.INSTANCE.ensureChannels(context, notificationManager);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
