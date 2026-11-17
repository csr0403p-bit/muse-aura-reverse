package com.facebook.rsys.videorender.gen;

import X.C8924Ftg;
import X.G50;
import X.GUn;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class VideoRenderFrameCallback {
    public static G50<VideoRenderFrameCallback> CONVERTER = new C8924Ftg(3);

    public final class CProxy extends VideoRenderFrameCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native VideoRenderFrameCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.videorender.gen.VideoRenderFrameCallback
        public native void onFrame(RSVideoFrame rSVideoFrame, int i);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoRenderFrameCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GUn.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onFrame(RSVideoFrame rSVideoFrame, int i);
}
