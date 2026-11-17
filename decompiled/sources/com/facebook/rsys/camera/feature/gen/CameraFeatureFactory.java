package com.facebook.rsys.camera.feature.gen;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.ETi;
import X.GW3;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mci.Execution;
import com.facebook.rsys.base.gen.FeatureHolder;
import com.facebook.rsys.camera.gen.CameraProxy;

/* loaded from: classes6.dex */
public abstract class CameraFeatureFactory {

    public final class CProxy extends CameraFeatureFactory {
        public static native FeatureHolder create(CameraProxy cameraProxy);

        public static native CameraFeatureFactory createFromMcfType(McfReference mcfReference);

        public static native long nativeGetMcfTypeId();

        static {
            if (GW3.A00) {
                return;
            }
            try {
                AbstractC7607F5u.A1F();
                Execution.initialize();
                ETi.loadLibrary("jniperflogger");
                ETi.loadLibrary("rsysfeaturecamerajni");
                GW3.A00 = true;
            } catch (ClassNotFoundException e) {
                throw AbstractC7608F5v.A0m(e);
            }
        }
    }
}
