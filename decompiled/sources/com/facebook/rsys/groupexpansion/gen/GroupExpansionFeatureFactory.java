package com.facebook.rsys.groupexpansion.gen;

import X.GYn;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: classes6.dex */
public abstract class GroupExpansionFeatureFactory {

    public final class CProxy extends GroupExpansionFeatureFactory {
        public static native FeatureHolder create(GroupExpansionProxy groupExpansionProxy);

        public static native GroupExpansionFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();

        static {
            GYn.A00();
        }
    }
}
