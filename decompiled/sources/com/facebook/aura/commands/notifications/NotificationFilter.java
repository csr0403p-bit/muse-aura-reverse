package com.facebook.aura.commands.notifications;

import android.service.notification.StatusBarNotification;

/* loaded from: classes3.dex */
public interface NotificationFilter {
    boolean shouldBlock(StatusBarNotification statusBarNotification);

    boolean shouldBlockPackage(String str);
}
