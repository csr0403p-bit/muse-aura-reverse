package com.facebook.aura.notifications.push;

import X.C7384Etj;

/* loaded from: classes3.dex */
public abstract class HatchChatNotificationIdsKt {
    public static final boolean isBrowserWake(AuraPushNotificationData auraPushNotificationData) {
        C7384Etj.A0Y(auraPushNotificationData, 0);
        return "hatch_browser_needs_you".equals(auraPushNotificationData.notificationType) && C7384Etj.areEqual(auraPushNotificationData.params.get("reason"), HatchChatNotificationIds.BROWSER_WAKE_REASON);
    }
}
