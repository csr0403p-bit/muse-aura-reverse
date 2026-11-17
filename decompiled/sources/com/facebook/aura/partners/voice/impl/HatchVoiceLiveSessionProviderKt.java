package com.facebook.aura.partners.voice.impl;

import X.AnonymousClass002;
import X.C3cG;
import com.facebook.aura.R;
import com.facebook.aura.partners.voice.intf.VoiceCallStatusLine;

/* loaded from: classes2.dex */
public abstract class HatchVoiceLiveSessionProviderKt {
    public static final long AUDIO_PLAYBACK_END_TIMEOUT_MS = 10000;
    public static final String TAG = "HatchVoiceLiveSession";

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoiceCallStatusLine.values().length];
            try {
                AnonymousClass002.A13(VoiceCallStatusLine.RECONNECTING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(VoiceCallStatusLine.UPDATING_LIVE_AVATAR, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(VoiceCallStatusLine.LIVE_AVATAR_COULD_NOT_UPDATE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(VoiceCallStatusLine.LIVE_AVATAR_NOT_AVAILABLE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getStringRes(VoiceCallStatusLine voiceCallStatusLine) {
        int iOrdinal = voiceCallStatusLine.ordinal();
        if (iOrdinal == 0) {
            return R.string._name_removed__res_0x7f121036;
        }
        if (iOrdinal == 1) {
            return R.string._name_removed__res_0x7f121148;
        }
        if (iOrdinal == 2) {
            return R.string._name_removed__res_0x7f121141;
        }
        if (iOrdinal == 3) {
            return R.string._name_removed__res_0x7f121142;
        }
        throw C3cG.A0q();
    }
}
