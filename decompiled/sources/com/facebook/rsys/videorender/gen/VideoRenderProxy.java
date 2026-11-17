package com.facebook.rsys.videorender.gen;

import X.C8924Ftg;
import X.G50;
import X.GUn;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class VideoRenderProxy {
    public static G50<VideoRenderProxy> CONVERTER = new C8924Ftg(5);

    public final class CProxy extends VideoRenderProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native VideoRenderProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.videorender.gen.VideoRenderProxy
        public native void renderFrame(RSVideoFrame rSVideoFrame, Object obj, int i);

        @Override // com.facebook.rsys.videorender.gen.VideoRenderProxy
        public native void setApi(VideoRenderApi videoRenderApi);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoRenderProxy)) {
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

    public abstract void renderFrame(RSVideoFrame rSVideoFrame, Object obj, int i);

    public abstract void setApi(VideoRenderApi videoRenderApi);
}
