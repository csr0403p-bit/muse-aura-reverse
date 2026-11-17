package com.facebook.rsys.voiceads.gen;

import X.GZA;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: classes6.dex */
public abstract class VoiceAdsFeatureFactory {

    public final class CProxy extends VoiceAdsFeatureFactory {
        public static native FeatureHolder create(AdContext adContext);

        public static native VoiceAdsFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();

        static {
            GZA.A00();
        }
    }
}
