package com.facebook.rsys.videorender.feature.gen;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.ETi;
import X.GWK;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mci.Execution;
import com.facebook.rsys.base.gen.FeatureHolder;

/* loaded from: classes6.dex */
public abstract class VideoRenderFeatureFactory {

    public final class CProxy extends VideoRenderFeatureFactory {
        public static native FeatureHolder create();

        public static native VideoRenderFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();

        static {
            if (GWK.A00) {
                return;
            }
            try {
                AbstractC7607F5u.A1F();
                Execution.initialize();
                ETi.loadLibrary("jniperflogger");
                ETi.loadLibrary("rsysfeaturevideorenderjni");
                GWK.A00 = true;
            } catch (ClassNotFoundException e) {
                throw AbstractC7608F5v.A0m(e);
            }
        }
    }
}
