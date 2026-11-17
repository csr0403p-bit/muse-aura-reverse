package com.facebook.aura.notifications.push;

import X.AbstractC3358CGz;
import X.C60O;
import X.C7384Etj;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;

/* loaded from: classes3.dex */
public final class HatchChatPushHistoryPrefetchObserver implements PushDataObserver {
    public static final HatchChatPushHistoryPrefetchObserver INSTANCE = new HatchChatPushHistoryPrefetchObserver();

    @Override // com.facebook.aura.notifications.push.PushDataObserver
    public void onPushReceived(AuraPushNotificationData auraPushNotificationData) {
        AbstractC3358CGz currentUserSession;
        C7384Etj.A0Y(auraPushNotificationData, 0);
        if (!"hatch_bot_message".equals(auraPushNotificationData.notificationType) || AuraAppLifecycleManager.INSTANCE.isAppInForeground() || (currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession()) == null) {
            return;
        }
        String strThreadKeyFromPath = HatchChatNotificationIds.INSTANCE.threadKeyFromPath(C60O.A0p("path", auraPushNotificationData.params));
        HatchChatPushHistoryPrefetcher companion = HatchChatPushHistoryPrefetcher.Companion.getInstance(currentUserSession);
        if ("main".equals(strThreadKeyFromPath)) {
            strThreadKeyFromPath = null;
        }
        companion.prefetch(strThreadKeyFromPath);
    }
}
