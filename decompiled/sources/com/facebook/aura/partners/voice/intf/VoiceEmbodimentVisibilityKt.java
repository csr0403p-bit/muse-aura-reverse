package com.facebook.aura.partners.voice.intf;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C3cG;
import X.C7384Etj;

/* loaded from: classes2.dex */
public abstract class VoiceEmbodimentVisibilityKt {
    public static final boolean getShowsEmbodiment(VoiceEmbodimentPlacement voiceEmbodimentPlacement) {
        switch (AnonymousClass001.A0E(voiceEmbodimentPlacement, 0)) {
            case 0:
            case 1:
            case 2:
            case 4:
                return true;
            case 3:
            case 5:
            case 6:
                return false;
            default:
                throw C3cG.A0q();
        }
    }

    public static final boolean isActivity(VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia) {
        C7384Etj.A0Y(voiceEmbodimentPaintedMedia, 0);
        return voiceEmbodimentPaintedMedia == VoiceEmbodimentPaintedMedia.WORKING || voiceEmbodimentPaintedMedia == VoiceEmbodimentPaintedMedia.MAKING_SOMETHING;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoiceEmbodimentPlacement.values().length];
            try {
                AnonymousClass002.A13(VoiceEmbodimentPlacement.AVATAR, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(VoiceEmbodimentPlacement.HALF_SCREEN, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(VoiceEmbodimentPlacement.FULL_SCREEN, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(VoiceEmbodimentPlacement.SYSTEM_PIP, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(VoiceEmbodimentPlacement.HIDDEN, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(VoiceEmbodimentPlacement.BACKGROUND, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(VoiceEmbodimentPlacement.UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
