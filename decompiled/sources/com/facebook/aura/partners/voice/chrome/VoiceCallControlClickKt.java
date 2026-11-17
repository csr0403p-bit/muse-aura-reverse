package com.facebook.aura.partners.voice.chrome;

import X.AnonymousClass002;
import X.C3cG;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.partners.voice.intf.VoiceCallControlLoggingKt;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;

/* loaded from: classes2.dex */
public abstract class VoiceCallControlClickKt {
    public static final boolean onVoiceControlClick(VoiceCallStateHolder voiceCallStateHolder, VoiceCallControl voiceCallControl) {
        boolean zA1a = AnonymousClass002.A1a(voiceCallStateHolder, voiceCallControl);
        switch (voiceCallControl.ordinal()) {
            case 0:
                VoiceCallControlLoggingKt.logCallControlClick(voiceCallStateHolder, HatchComponent.END_VOICE_BUTTON);
                break;
            case 1:
            case 2:
                VoiceCallControlLoggingKt.logCallControlToggle(voiceCallStateHolder, voiceCallControl == VoiceCallControl.MUTE, HatchComponent.MUTE_BUTTON);
                break;
            case 3:
            case 4:
            case 5:
                return false;
            default:
                throw C3cG.A0q();
        }
        if (voiceCallControl == VoiceCallControl.END) {
            voiceCallStateHolder.requestEndCall(null, null, null);
            return zA1a;
        }
        voiceCallStateHolder.requestToggleMute();
        return zA1a;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoiceCallControl.values().length];
            try {
                AnonymousClass002.A13(VoiceCallControl.END, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(VoiceCallControl.MUTE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(VoiceCallControl.UNMUTE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(VoiceCallControl.COLLAPSE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(VoiceCallControl.EXPAND, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(VoiceCallControl.MIC_PAUSED, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
