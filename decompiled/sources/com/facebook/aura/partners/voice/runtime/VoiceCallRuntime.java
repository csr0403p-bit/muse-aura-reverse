package com.facebook.aura.partners.voice.runtime;

import X.AGH;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import android.content.Context;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import com.facebook.aura.partners.voice.api.PlayoutInjection;
import com.facebook.aura.partners.voice.api.VoiceCallManager;
import com.facebook.aura.partners.voice.intf.BackgroundCallAvailability;
import com.facebook.aura.partners.voice.intf.BackgroundVoiceCall;
import com.facebook.aura.partners.voice.intf.DeviceCallStateTracker;
import com.facebook.aura.partners.voice.intf.VoiceAudioOnlyReason;
import com.facebook.aura.partners.voice.intf.VoiceCallAccessory;
import com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint;
import com.facebook.aura.partners.voice.intf.VoiceCallPhase;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.prefs.VoicePrefs;
import com.facebook.aura.partners.voice.session.intf.VoiceCallSupport;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import com.facebook.aura.utils.HatchPermissionUtils;

/* loaded from: classes2.dex */
public final class VoiceCallRuntime {
    public static final VoiceCallRuntime INSTANCE = new VoiceCallRuntime();

    public final BackgroundVoiceCall callFor$fbandroid_express_aura_java_com_facebook_aura_partners_voice_runtime_runtime(AbstractC3358CGz abstractC3358CGz, long j) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        VoiceCallSessionOwner companion = VoiceCallSessionOwner.Companion.getInstance(abstractC3358CGz);
        VoiceCallManager voiceCallManagerCurrentManager$fbandroid_express_aura_java_com_facebook_aura_partners_voice_runtime_runtime = companion.currentManager$fbandroid_express_aura_java_com_facebook_aura_partners_voice_runtime_runtime();
        if (voiceCallManagerCurrentManager$fbandroid_express_aura_java_com_facebook_aura_partners_voice_runtime_runtime == null) {
            return null;
        }
        VoiceCallStateHolder voiceCallStateHolderA0K = C3cG.A0K(abstractC3358CGz);
        if (C3cH.A1P(voiceCallStateHolderA0K) && C3cH.A09(voiceCallStateHolderA0K.callGeneration) == j) {
            return new RuntimeVoiceCall(companion, voiceCallManagerCurrentManager$fbandroid_express_aura_java_com_facebook_aura_partners_voice_runtime_runtime, voiceCallStateHolderA0K, j);
        }
        return null;
    }

    public final BackgroundVoiceCall currentCall(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return callFor$fbandroid_express_aura_java_com_facebook_aura_partners_voice_runtime_runtime(abstractC3358CGz, C3cH.A09(C3cG.A0K(abstractC3358CGz).callGeneration));
    }

    public final void endCall(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        C3cG.A0K(abstractC3358CGz).requestEndCall(null, null, null);
    }

    public final boolean isCallSupported(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return !ConfidentialSessionGate.Companion.getInstance(abstractC3358CGz).getShouldHideUnsupportedCvmFeatures() && VoiceCallSupport.INSTANCE.isVoiceCallSupported();
    }

    public final synchronized BackgroundVoiceCall start(Context context, AbstractC3358CGz abstractC3358CGz, String str, VoiceAudioOnlyReason voiceAudioOnlyReason, Boolean bool, VoiceCallAccessory voiceCallAccessory, VoiceCallEntryPoint voiceCallEntryPoint) {
        BackgroundVoiceCall backgroundVoiceCallCurrentCall;
        VoiceCallManager voiceCallManagerAcquireUntilEnded;
        AnonymousClass003.A0u(context, abstractC3358CGz);
        backgroundVoiceCallCurrentCall = null;
        if (availability(context, abstractC3358CGz) == BackgroundCallAvailability.AVAILABLE && (voiceCallManagerAcquireUntilEnded = VoiceCallSessionOwner.Companion.getInstance(abstractC3358CGz).acquireUntilEnded(context, abstractC3358CGz)) != null && voiceCallManagerAcquireUntilEnded.getCallState().getValue().phase == VoiceCallPhase.ENDED) {
            C3cG.A0K(abstractC3358CGz).setActiveThreadId(str);
            voiceCallManagerAcquireUntilEnded.startCall(voiceAudioOnlyReason, bool, voiceCallEntryPoint, AGH.A0E(), voiceCallAccessory);
            backgroundVoiceCallCurrentCall = currentCall(abstractC3358CGz);
        }
        return backgroundVoiceCallCurrentCall;
    }

    public static /* synthetic */ BackgroundVoiceCall start$default(VoiceCallRuntime voiceCallRuntime, Context context, AbstractC3358CGz abstractC3358CGz, String str, VoiceAudioOnlyReason voiceAudioOnlyReason, Boolean bool, VoiceCallAccessory voiceCallAccessory, VoiceCallEntryPoint voiceCallEntryPoint, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            voiceAudioOnlyReason = null;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        if ((i & 32) != 0) {
            voiceCallAccessory = null;
        }
        if ((i & 64) != 0) {
            voiceCallEntryPoint = null;
        }
        return voiceCallRuntime.start(context, abstractC3358CGz, str, voiceAudioOnlyReason, bool, voiceCallAccessory, voiceCallEntryPoint);
    }

    public final BackgroundCallAvailability availability(Context context, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass003.A0u(context, abstractC3358CGz);
        VoiceCallStateHolder voiceCallStateHolderA0K = C3cG.A0K(abstractC3358CGz);
        return !isCallSupported(abstractC3358CGz) ? BackgroundCallAvailability.UNSUPPORTED : (DeviceCallStateTracker.INSTANCE.isInCallNow() || C3cH.A1P(voiceCallStateHolderA0K) || voiceCallStateHolderA0K.pendingCallStart.getValue() != null) ? BackgroundCallAvailability.BUSY : !HatchPermissionUtils.INSTANCE.hasPermission(context, "android.permission.RECORD_AUDIO") ? BackgroundCallAvailability.MIC_PERMISSION_REQUIRED : AuraSubscriptionRepository.Companion.getInstance(abstractC3358CGz).isOutOfVoiceCredits() ? BackgroundCallAvailability.OUT_OF_CREDITS : !VoicePrefs.INSTANCE.hasSeenVoiceNux(abstractC3358CGz) ? BackgroundCallAvailability.SETUP_REQUIRED : BackgroundCallAvailability.AVAILABLE;
    }

    public final PlayoutInjection injectPlayoutPcm48k(AbstractC3358CGz abstractC3358CGz, long j, short[] sArr) {
        PlayoutInjection playoutInjectionInjectPlayoutPcm48k;
        AnonymousClass003.A0v(abstractC3358CGz, sArr);
        VoiceCallManager voiceCallManagerCurrentManager$fbandroid_express_aura_java_com_facebook_aura_partners_voice_runtime_runtime = VoiceCallSessionOwner.Companion.getInstance(abstractC3358CGz).currentManager$fbandroid_express_aura_java_com_facebook_aura_partners_voice_runtime_runtime();
        return (voiceCallManagerCurrentManager$fbandroid_express_aura_java_com_facebook_aura_partners_voice_runtime_runtime == null || (playoutInjectionInjectPlayoutPcm48k = voiceCallManagerCurrentManager$fbandroid_express_aura_java_com_facebook_aura_partners_voice_runtime_runtime.injectPlayoutPcm48k(j, sArr)) == null) ? PlayoutInjection.REJECTED : playoutInjectionInjectPlayoutPcm48k;
    }
}
