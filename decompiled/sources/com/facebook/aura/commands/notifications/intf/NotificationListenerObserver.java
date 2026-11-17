package com.facebook.aura.commands.notifications.intf;

import X.AbstractC3358CGz;
import X.C7384Etj;
import android.service.notification.StatusBarNotification;

/* loaded from: classes3.dex */
public interface NotificationListenerObserver {

    public abstract class DefaultImpls {
        @Deprecated
        public static void onNotificationRemoved(NotificationListenerObserver notificationListenerObserver, StatusBarNotification statusBarNotification) {
            C7384Etj.A0Y(statusBarNotification, 1);
        }
    }

    void close();

    void onNotificationPosted(StatusBarNotification statusBarNotification, AbstractC3358CGz abstractC3358CGz);

    void onNotificationRemoved(StatusBarNotification statusBarNotification);

    /* renamed from: com.facebook.aura.commands.notifications.intf.NotificationListenerObserver$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static void $default$onNotificationRemoved(NotificationListenerObserver notificationListenerObserver, StatusBarNotification statusBarNotification) {
        }

        public static /* synthetic */ void access$onNotificationRemoved$jd(NotificationListenerObserver notificationListenerObserver, StatusBarNotification statusBarNotification) {
        }
    }
}
