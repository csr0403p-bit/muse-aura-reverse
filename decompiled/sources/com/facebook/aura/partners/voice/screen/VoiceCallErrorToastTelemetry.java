package com.facebook.aura.partners.voice.screen;

import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.CFK;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import java.util.Map;

/* loaded from: classes2.dex */
public final class VoiceCallErrorToastTelemetry {
    public static final int $stable = 0;
    public static final VoiceCallErrorToastTelemetry INSTANCE = new VoiceCallErrorToastTelemetry();
    public static final String TAG = "VoiceCallErrorToast";

    public final Map<String, String> errorTypeMetadata(VoiceCallErrorToastReason voiceCallErrorToastReason) {
        C7384Etj.A0Y(voiceCallErrorToastReason, 0);
        return AnonymousClass006.A10(HatchMetadataKey.ERROR_TYPE.getValue(), voiceCallErrorToastReason.getValue());
    }

    public final void logRetryTapped(VoiceCallErrorToastReason voiceCallErrorToastReason) {
        C7384Etj.A0Y(voiceCallErrorToastReason, 0);
        CFK.A03(voiceCallErrorToastReason.getValue(), TAG, "retry tapped error_type=%s");
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, HatchScreen.MAIN_CHAT, HatchComponent.RETRY_BUTTON, null, errorTypeMetadata(voiceCallErrorToastReason), null);
    }

    public final void logShown(VoiceCallErrorToastReason voiceCallErrorToastReason, VoiceCallErrorToastAction voiceCallErrorToastAction) {
        C7384Etj.A0Y(voiceCallErrorToastReason, 0);
        C7384Etj.A0Y(voiceCallErrorToastAction, 1);
        AuraAppLifecycleManager auraAppLifecycleManager = AuraAppLifecycleManager.INSTANCE;
        String str = AnonymousClass003.A1Z(AuraAppLifecycleManager._isAssistOverlayActive) ? "assist" : "main_app";
        boolean zIsAppInForeground = auraAppLifecycleManager.isAppInForeground();
        CFK.A00(voiceCallErrorToastReason.getValue(), voiceCallErrorToastAction.getValue(), str, Boolean.valueOf(zIsAppInForeground), TAG, "shown error_type=%s action=%s host=%s foreground=%s");
        HatchAppEventLogger.INSTANCE.logEvent("voice_call_error_toast", "voice_mode", null, "shown", "call_error_toast", C3cH.A0n("foreground", String.valueOf(zIsAppInForeground), C3cG.A0r(HatchMetadataKey.ERROR_TYPE.getValue(), voiceCallErrorToastReason.getValue()), C3cG.A0r("action", voiceCallErrorToastAction.getValue()), C3cG.A0r("host", str)), null);
    }
}
