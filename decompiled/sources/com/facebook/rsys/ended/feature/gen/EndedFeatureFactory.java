package com.facebook.rsys.ended.feature.gen;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.ETi;
import X.GWB;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mci.Execution;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: classes6.dex */
public abstract class EndedFeatureFactory {

    public final class CProxy extends EndedFeatureFactory {
        public static native FeatureHolder create();

        public static native EndedFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();

        static {
            if (GWB.A00) {
                return;
            }
            try {
                AbstractC7607F5u.A1F();
                Execution.initialize();
                ETi.loadLibrary("jniperflogger");
                ETi.loadLibrary("rsysfeatureendedjniLatest");
                GWB.A00 = true;
            } catch (ClassNotFoundException e) {
                throw AbstractC7608F5v.A0m(e);
            }
        }
    }
}
