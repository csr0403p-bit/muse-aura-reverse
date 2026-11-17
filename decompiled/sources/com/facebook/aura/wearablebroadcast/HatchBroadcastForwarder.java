package com.facebook.aura.wearablebroadcast;

import X.AnonymousClass007;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.CFK;
import com.facebook.aura.analytics.hatch.HatchNotificationChannel;
import com.facebook.aura.analytics.hatch.HatchNotificationEventsLogger;
import com.facebook.aura.analytics.hatch.HatchNotificationOrigin;
import com.facebook.aura.analytics.hatch.HatchNotificationRelayDropReason;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.wearablebroadcast.MetaAiAppBroadcastSender;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class HatchBroadcastForwarder {
    public static final HatchBroadcastForwarder INSTANCE = new HatchBroadcastForwarder();
    public static final String PARAM_AUDIO_WEARABLE_TTS = "audio_wearable_tts";
    public static final String PARAM_CLIENT_INTERACTION_ID = "client_interaction_id";
    public static final String PARAM_FORWARD_TO_WEARABLE = "forward_to_wearable";
    public static final String REQUEST_ORIGIN = "hatch_broadcast";
    public static final String TAG = "HatchBroadcastForwarder";

    public final void forward(String str, final String str2, final String str3, final String str4, final String str5, final String str6) {
        final String str7 = str;
        C7384Etj.A0Y(str2, 1);
        final String strA0a = (str5 == null || C7BY.A0j(str5)) ? AnonymousClass007.A0a("fallback-", UUID.randomUUID()) : str5;
        if (!HatchBroadcastOptIn.INSTANCE.isEnabled()) {
            CFK.A03(strA0a, TAG, "not forwarding, opt-in disabled id=%s");
            logRelayDrop$fbandroid_express_aura_java_com_facebook_aura_wearablebroadcast_wearablebroadcast(str4, str5, str6, HatchNotificationRelayDropReason.OPT_IN_DISABLED);
        } else {
            if (str == null || C7BY.A0j(str)) {
                str7 = HatchAppName.value;
            }
            C60O.A1D().execute(new Runnable() { // from class: com.facebook.aura.wearablebroadcast.HatchBroadcastForwarder.forward.1
                @Override // java.lang.Runnable
                public final void run() {
                    HatchBroadcastForwarder hatchBroadcastForwarder;
                    String str8;
                    String str9;
                    String str10;
                    HatchNotificationRelayDropReason hatchNotificationRelayDropReason;
                    MetaAiAppBroadcastSender.Result resultSend = MetaAiAppBroadcastSender.INSTANCE.send(str7, str2, HatchBroadcastForwarder.REQUEST_ORIGIN, strA0a, str3);
                    if (C7384Etj.areEqual(resultSend, MetaAiAppBroadcastSender.Result.Sent.INSTANCE)) {
                        CFK.A03(strA0a, HatchBroadcastForwarder.TAG, "sent id=%s");
                        HatchNotificationEventsLogger.INSTANCE.logRelaySent(HatchNotificationChannel.PUSH, str4, HatchNotificationOrigin.SERVER, str5, str6);
                        return;
                    }
                    if (C7384Etj.areEqual(resultSend, MetaAiAppBroadcastSender.Result.NotInstalled.INSTANCE)) {
                        CFK.A03(strA0a, HatchBroadcastForwarder.TAG, "Meta AI app not installed id=%s");
                        hatchBroadcastForwarder = HatchBroadcastForwarder.INSTANCE;
                        str8 = str4;
                        str9 = str5;
                        str10 = str6;
                        hatchNotificationRelayDropReason = HatchNotificationRelayDropReason.NOT_INSTALLED;
                    } else if (C7384Etj.areEqual(resultSend, MetaAiAppBroadcastSender.Result.Untrusted.INSTANCE)) {
                        CFK.A0H(HatchBroadcastForwarder.TAG, "Meta AI app package is not signed by us id=%s", strA0a);
                        hatchBroadcastForwarder = HatchBroadcastForwarder.INSTANCE;
                        str8 = str4;
                        str9 = str5;
                        str10 = str6;
                        hatchNotificationRelayDropReason = HatchNotificationRelayDropReason.UNTRUSTED;
                    } else {
                        if (!(resultSend instanceof MetaAiAppBroadcastSender.Result.Failed)) {
                            throw C3cG.A0q();
                        }
                        CFK.A0D(HatchBroadcastForwarder.TAG, "forward failed id=%s", ((MetaAiAppBroadcastSender.Result.Failed) resultSend).cause, strA0a);
                        hatchBroadcastForwarder = HatchBroadcastForwarder.INSTANCE;
                        str8 = str4;
                        str9 = str5;
                        str10 = str6;
                        hatchNotificationRelayDropReason = HatchNotificationRelayDropReason.FAILED;
                    }
                    hatchBroadcastForwarder.logRelayDrop$fbandroid_express_aura_java_com_facebook_aura_wearablebroadcast_wearablebroadcast(str8, str9, str10, hatchNotificationRelayDropReason);
                }
            });
        }
    }

    public final void logRelayDrop$fbandroid_express_aura_java_com_facebook_aura_wearablebroadcast_wearablebroadcast(String str, String str2, String str3, HatchNotificationRelayDropReason hatchNotificationRelayDropReason) {
        C7384Etj.A0Y(hatchNotificationRelayDropReason, 3);
        HatchNotificationEventsLogger.INSTANCE.logRelayDrop(HatchNotificationChannel.PUSH, str, HatchNotificationOrigin.SERVER, str2, str3, hatchNotificationRelayDropReason);
    }

    public final boolean isMarkedForWearable(String str, String str2) {
        if ("true".equals(str)) {
            return true;
        }
        return (str2 == null || C7BY.A0j(str2)) ? false : true;
    }

    public final HatchNotificationRelayDropReason skipReason(String str, String str2) {
        if (!"true".equals(str)) {
            return HatchNotificationRelayDropReason.MISSING_FLAG;
        }
        if (str2 == null || C7BY.A0j(str2)) {
            return HatchNotificationRelayDropReason.MISSING_TTS;
        }
        return null;
    }
}
