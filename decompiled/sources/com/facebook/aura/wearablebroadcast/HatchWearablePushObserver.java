package com.facebook.aura.wearablebroadcast;

import X.C3cG;
import X.C60O;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchNotificationRelayDropReason;
import com.facebook.aura.notifications.push.AuraPushNotificationData;
import com.facebook.aura.notifications.push.PushDataObserver;

/* loaded from: classes3.dex */
public final class HatchWearablePushObserver implements PushDataObserver {
    public static final HatchWearablePushObserver INSTANCE = new HatchWearablePushObserver();

    @Override // com.facebook.aura.notifications.push.PushDataObserver
    public void onPushReceived(AuraPushNotificationData auraPushNotificationData) {
        C7384Etj.A0Y(auraPushNotificationData, 0);
        String strA0p = C60O.A0p(HatchBroadcastForwarder.PARAM_FORWARD_TO_WEARABLE, auraPushNotificationData.params);
        String str = auraPushNotificationData.params.get(HatchBroadcastForwarder.PARAM_AUDIO_WEARABLE_TTS);
        HatchBroadcastForwarder hatchBroadcastForwarder = HatchBroadcastForwarder.INSTANCE;
        if (hatchBroadcastForwarder.isMarkedForWearable(strA0p, str)) {
            HatchNotificationRelayDropReason hatchNotificationRelayDropReasonSkipReason = hatchBroadcastForwarder.skipReason(strA0p, str);
            if (hatchNotificationRelayDropReasonSkipReason != null) {
                hatchBroadcastForwarder.logRelayDrop$fbandroid_express_aura_java_com_facebook_aura_wearablebroadcast_wearablebroadcast(auraPushNotificationData.notificationType, auraPushNotificationData.ndid, auraPushNotificationData.vmId, hatchNotificationRelayDropReasonSkipReason);
                return;
            }
            String str2 = auraPushNotificationData.title;
            if (str == null) {
                throw C3cG.A0Q("Required value was null.");
            }
            hatchBroadcastForwarder.forward(str2, str, auraPushNotificationData.params.get("client_interaction_id"), auraPushNotificationData.notificationType, auraPushNotificationData.ndid, auraPushNotificationData.vmId);
        }
    }
}
