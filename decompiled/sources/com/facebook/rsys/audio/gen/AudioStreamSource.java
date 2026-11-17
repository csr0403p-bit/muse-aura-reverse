package com.facebook.rsys.audio.gen;

import X.C8923Ftf;
import X.G50;
import X.GUX;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.frame.gen.AudioFrame;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class AudioStreamSource {
    public static G50<AudioStreamSource> CONVERTER = C8923Ftf.A00(45);

    public final class CProxy extends AudioStreamSource {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioStreamSource createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.audio.gen.AudioStreamSource
        public native AudioMetrics createAudioMetrics();

        @Override // com.facebook.rsys.audio.gen.AudioStreamSource
        public native AudioFrame getAudioFrame(int i, int i2);

        @Override // com.facebook.rsys.audio.gen.AudioStreamSource
        public native int getAudioLevel();

        public native int hashCode();

        @Override // com.facebook.rsys.audio.gen.AudioStreamSource
        public native void setPlayoutEnabled(boolean z);

        @Override // com.facebook.rsys.audio.gen.AudioStreamSource
        public native void setPlayoutVolume(float f);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioStreamSource)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GUX.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract AudioMetrics createAudioMetrics();

    public abstract AudioFrame getAudioFrame(int i, int i2);

    public abstract int getAudioLevel();

    public abstract void setPlayoutEnabled(boolean z);

    public abstract void setPlayoutVolume(float f);
}
