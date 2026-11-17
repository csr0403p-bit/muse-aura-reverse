package com.facebook.rsys.camera.gen;

import X.C8926Fti;
import X.G50;
import X.GZ7;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class CameraStallHandler {
    public static G50<CameraStallHandler> CONVERTER = C8926Fti.A00(41);

    public final class CProxy extends CameraStallHandler {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CameraStallHandler createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.camera.gen.CameraStallHandler
        public native void onCameraStallDetected();

        @Override // com.facebook.rsys.camera.gen.CameraStallHandler
        public native void onCameraStallRecovered();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CameraStallHandler)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GZ7.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onCameraStallDetected();

    public abstract void onCameraStallRecovered();
}
