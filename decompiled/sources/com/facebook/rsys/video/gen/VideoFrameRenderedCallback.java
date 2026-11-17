package com.facebook.rsys.video.gen;

import X.C8924Ftg;
import X.G50;
import X.GYS;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class VideoFrameRenderedCallback {
    public static G50<VideoFrameRenderedCallback> CONVERTER = new C8924Ftg(0);

    public final class CProxy extends VideoFrameRenderedCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native VideoFrameRenderedCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.video.gen.VideoFrameRenderedCallback
        public native void onCallbackRegistered();

        @Override // com.facebook.rsys.video.gen.VideoFrameRenderedCallback
        public native void onFrameRendered(RSVideoFrame rSVideoFrame);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoFrameRenderedCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GYS.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onCallbackRegistered();

    public abstract void onFrameRendered(RSVideoFrame rSVideoFrame);
}
