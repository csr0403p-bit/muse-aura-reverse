package com.facebook.aura.notifications.push;

import android.app.NotificationManager;
import android.content.Context;

/* loaded from: classes2.dex */
public interface NotificationChannelContributor {
    void ensureChannels(Context context, NotificationManager notificationManager);
}
