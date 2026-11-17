package com.facebook.aura.commands.notifications.intf;

import X.G0U;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

/* loaded from: classes3.dex */
public interface NotificationListenerObserverFactory {
    NotificationListenerObserver create(NotificationListenerService notificationListenerService, G0U<? super StatusBarNotification, Boolean> g0u);
}
