package com.facebook.rsys.camera.gen;

import X.C8926Fti;
import X.G50;
import X.GZ7;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class CameraProxy {
    public static G50<CameraProxy> CONVERTER = C8926Fti.A00(40);

    public final class CProxy extends CameraProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CameraProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.camera.gen.CameraProxy
        public native ArrayList<Camera> createAvailableCameras();

        public native int hashCode();

        @Override // com.facebook.rsys.camera.gen.CameraProxy
        public native void release();

        @Override // com.facebook.rsys.camera.gen.CameraProxy
        public native void setApi(CameraApi cameraApi);

        @Override // com.facebook.rsys.camera.gen.CameraProxy
        public native void setCamera(Camera camera);

        @Override // com.facebook.rsys.camera.gen.CameraProxy
        public native void setCameraMode(int i);

        @Override // com.facebook.rsys.camera.gen.CameraProxy
        public native void setCameraOn(boolean z, int i);

        @Override // com.facebook.rsys.camera.gen.CameraProxy
        public native void setTargetCaptureResolution(int i, int i2);

        @Override // com.facebook.rsys.camera.gen.CameraProxy
        public native int setTargetCaptureSettings(int i, int i2, int i3);

        @Override // com.facebook.rsys.camera.gen.CameraProxy
        public native void setTargetFps(int i);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CameraProxy)) {
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

    public abstract ArrayList<Camera> createAvailableCameras();

    public abstract void release();

    public abstract void setApi(CameraApi cameraApi);

    public abstract void setCamera(Camera camera);

    public abstract void setCameraMode(int i);

    public abstract void setCameraOn(boolean z, int i);

    public abstract void setTargetCaptureResolution(int i, int i2);

    public abstract int setTargetCaptureSettings(int i, int i2, int i3);

    public abstract void setTargetFps(int i);
}
