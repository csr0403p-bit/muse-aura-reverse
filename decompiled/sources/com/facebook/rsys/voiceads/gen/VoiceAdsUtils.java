package com.facebook.rsys.voiceads.gen;

import X.GZA;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.outgoingcallconfig.gen.StateSyncMessage;

/* loaded from: classes6.dex */
public abstract class VoiceAdsUtils {

    public final class CProxy extends VoiceAdsUtils {
        public static native VoiceAdsUtils createFromMcfType(McfReference mcfReference);

        public static native StateSyncMessage createInitialStateSyncMessage(AdContext adContext, String str, String str2);

        public static native long nativeGetMcfTypeId();

        static {
            GZA.A00();
        }
    }
}
