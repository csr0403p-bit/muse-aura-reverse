package com.facebook.rsys.audio.gen;

import X.C8923Ftf;
import X.G50;
import X.GUX;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.frame.gen.AudioFrame;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class AudioSource {
    public static G50<AudioSource> CONVERTER = C8923Ftf.A00(42);

    public final class CProxy extends AudioSource {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioSource createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native AudioMetrics createAudioMetrics();

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native int getAudioLevel();

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native ArrayList<AudioSourceSink> getSinks();

        public native int hashCode();

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native void notifyNewAudioFrame(AudioFrame audioFrame);

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native void notifyNewAudioPosition(float f, float f2, float f3);

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native void notifyNewEncodedAudioPacket(AudioEncodedPacket audioEncodedPacket);

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native void setPlayoutEnabled(boolean z);

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native void setPlayoutVolume(float f);

        @Override // com.facebook.rsys.audio.gen.AudioSource
        public native void setSinks(ArrayList<AudioSourceSink> arrayList);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioSource)) {
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

    public abstract int getAudioLevel();

    public abstract ArrayList<AudioSourceSink> getSinks();

    public abstract void notifyNewAudioFrame(AudioFrame audioFrame);

    public abstract void notifyNewAudioPosition(float f, float f2, float f3);

    public abstract void notifyNewEncodedAudioPacket(AudioEncodedPacket audioEncodedPacket);

    public abstract void setPlayoutEnabled(boolean z);

    public abstract void setPlayoutVolume(float f);

    public abstract void setSinks(ArrayList<AudioSourceSink> arrayList);
}
