package com.facebook.rsys.video.gen;

import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.UserStreamInfo;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class MediaProcessor {
    public static G50<MediaProcessor> CONVERTER = C8922Fte.A00(48);

    public final class CProxy extends MediaProcessor {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native MediaProcessor createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.video.gen.MediaProcessor
        public native boolean processFrame(RSVideoFrame rSVideoFrame, UserStreamInfo userStreamInfo);

        @Override // com.facebook.rsys.video.gen.MediaProcessor
        public native void setFrameCallback(UserStreamInfo userStreamInfo, ProcessedFrameCallbacks processedFrameCallbacks);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof MediaProcessor)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract boolean processFrame(RSVideoFrame rSVideoFrame, UserStreamInfo userStreamInfo);

    public abstract void setFrameCallback(UserStreamInfo userStreamInfo, ProcessedFrameCallbacks processedFrameCallbacks);
}
