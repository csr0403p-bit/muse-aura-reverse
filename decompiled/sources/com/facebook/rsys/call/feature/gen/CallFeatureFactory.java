package com.facebook.rsys.call.feature.gen;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.ETi;
import X.GW7;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mci.Execution;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: classes6.dex */
public abstract class CallFeatureFactory {

    public final class CProxy extends CallFeatureFactory {
        public static native FeatureHolder create();

        public static native CallFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();

        static {
            if (GW7.A00) {
                return;
            }
            try {
                AbstractC7607F5u.A1F();
                Execution.initialize();
                ETi.loadLibrary("jniperflogger");
                ETi.loadLibrary("rsysfeaturecalljniLatest");
                GW7.A00 = true;
            } catch (ClassNotFoundException e) {
                throw AbstractC7608F5v.A0m(e);
            }
        }
    }
}
