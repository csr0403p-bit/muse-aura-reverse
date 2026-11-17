package com.facebook.rsys.callinfo.gen;

import X.GUa;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: classes6.dex */
public abstract class CallInfoFeatureFactory {

    public final class CProxy extends CallInfoFeatureFactory {
        public static native FeatureHolder create(CallInfoStore callInfoStore);

        public static native CallInfoFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();

        static {
            GUa.A00();
        }
    }
}
