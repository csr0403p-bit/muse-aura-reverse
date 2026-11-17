package com.facebook.rsys.audio.frame.gen;

import X.C8923Ftf;
import X.G50;
import X.GUQ;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.frame.AudioFrameData;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class AudioFrame {
    public static G50<AudioFrame> CONVERTER = C8923Ftf.A00(28);

    public final class CProxy extends AudioFrame {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioFrame createFrame(AudioFrameData audioFrameData, AudioFrameMetadata audioFrameMetadata);

        public static native AudioFrame createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.audio.frame.gen.AudioFrame
        public native AudioFrameData getAudioData();

        @Override // com.facebook.rsys.audio.frame.gen.AudioFrame
        public native AudioFrameMetadata getMetadata();

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioFrame)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GUQ.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract AudioFrameData getAudioData();

    public abstract AudioFrameMetadata getMetadata();
}
