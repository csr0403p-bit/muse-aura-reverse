package com.facebook.aura.partners.voice.intf;

import X.AbstractC3358CGz;
import X.C7384Etj;
import android.content.Context;
import com.facebook.aura.navigation.AuraNavigator;

/* loaded from: classes2.dex */
public interface VoiceIntegration {

    /* renamed from: com.facebook.aura.partners.voice.intf.VoiceIntegration$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static /* synthetic */ BackgroundVoiceCall startBackgroundCall$default(VoiceIntegration voiceIntegration, Context context, AbstractC3358CGz abstractC3358CGz, String str, VoiceAudioOnlyReason voiceAudioOnlyReason, VoiceCallAccessory voiceCallAccessory, VoiceCallEntryPoint voiceCallEntryPoint, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startBackgroundCall");
            }
            if ((i & 16) != 0) {
                voiceCallAccessory = null;
            }
            if ((i & 32) != 0) {
                voiceCallEntryPoint = null;
            }
            return voiceIntegration.startBackgroundCall(context, abstractC3358CGz, str, voiceAudioOnlyReason, voiceCallAccessory, voiceCallEntryPoint);
        }

        public static void $default$prepareAccessoryCall(VoiceIntegration voiceIntegration, AbstractC3358CGz abstractC3358CGz) {
        }

        public static /* synthetic */ void access$prepareAccessoryCall$jd(VoiceIntegration voiceIntegration, AbstractC3358CGz abstractC3358CGz) {
        }
    }

    BackgroundCallAvailability backgroundCallAvailability(Context context, AbstractC3358CGz abstractC3358CGz);

    void endCall(AbstractC3358CGz abstractC3358CGz);

    VoiceUi getUi();

    boolean hasSeenCallIntro(AbstractC3358CGz abstractC3358CGz);

    boolean isCallSupported(AbstractC3358CGz abstractC3358CGz);

    boolean isEmbodimentEnabled();

    boolean isVoiceDesignSupported();

    void prepareAccessoryCall(AbstractC3358CGz abstractC3358CGz);

    boolean sendInput(AbstractC3358CGz abstractC3358CGz, long j, String str);

    BackgroundVoiceCall startBackgroundCall(Context context, AbstractC3358CGz abstractC3358CGz, String str, VoiceAudioOnlyReason voiceAudioOnlyReason, VoiceCallAccessory voiceCallAccessory, VoiceCallEntryPoint voiceCallEntryPoint);

    void startCall(AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, String str);

    public abstract class DefaultImpls {
        @Deprecated
        public static void prepareAccessoryCall(VoiceIntegration voiceIntegration, AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 1);
        }
    }
}
