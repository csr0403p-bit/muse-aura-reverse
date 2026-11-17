package com.facebook.aura.notifications.push;

import X.C7384Etj;

/* loaded from: classes3.dex */
public final class VmLockedVisiblePushObserver implements PushDataObserver {
    public static final VmLockedVisiblePushObserver INSTANCE = new VmLockedVisiblePushObserver();

    @Override // com.facebook.aura.notifications.push.PushDataObserver
    public void onPushReceived(AuraPushNotificationData auraPushNotificationData) {
        C7384Etj.A0Y(auraPushNotificationData, 0);
        if (VmLockedPushHandler.VISIBLE_NOTIFICATION_TYPE.equals(auraPushNotificationData.notificationType)) {
            VmLockedPushHandler.Companion.onVisiblePushReceived(auraPushNotificationData);
        }
    }
}
