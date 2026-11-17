package com.facebook.rsys.audio.gen;

import X.C8923Ftf;
import X.G50;
import X.GUX;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.frame.gen.AudioFrame;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class AudioApi {
    public static G50<AudioApi> CONVERTER = C8923Ftf.A00(33);

    public final class CProxy extends AudioApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void addSink(String str, int i, AudioSourceSink audioSourceSink);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native AudioMetrics createAudioMetrics(String str, int i);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void enableAudio(ArrayList<EnableAudioParameters> arrayList);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void enableNoiseSuppression(boolean z);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native AudioFrame getAudioFrame(String str, int i, int i2, int i3);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native AudioFrame getAudioFrameFromServiceStream(String str, int i, int i2);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native int getAudioLevel(String str, int i);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void handleEncodedPacket(AudioEncodedPacket audioEncodedPacket);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void handleEncodedPacketData(byte[] bArr, short s, int i);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void handleFrame(AudioFrame audioFrame);

        public native int hashCode();

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void removeSink(String str, int i, AudioSourceSink audioSourceSink);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void setCodec(int i, String str);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void setPlaybackVolume(ArrayList<PlaybackVolumeParameters> arrayList);

        @Override // com.facebook.rsys.audio.gen.AudioApi
        public native void setPlayoutDelay(String str, int i, int i2);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioApi)) {
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

    public abstract void addSink(String str, int i, AudioSourceSink audioSourceSink);

    public abstract AudioMetrics createAudioMetrics(String str, int i);

    public abstract void enableAudio(ArrayList<EnableAudioParameters> arrayList);

    public abstract void enableNoiseSuppression(boolean z);

    public abstract AudioFrame getAudioFrame(String str, int i, int i2, int i3);

    public abstract AudioFrame getAudioFrameFromServiceStream(String str, int i, int i2);

    public abstract int getAudioLevel(String str, int i);

    public abstract void handleEncodedPacket(AudioEncodedPacket audioEncodedPacket);

    public abstract void handleEncodedPacketData(byte[] bArr, short s, int i);

    public abstract void handleFrame(AudioFrame audioFrame);

    public abstract void removeSink(String str, int i, AudioSourceSink audioSourceSink);

    public abstract void setCodec(int i, String str);

    public abstract void setPlaybackVolume(ArrayList<PlaybackVolumeParameters> arrayList);

    public abstract void setPlayoutDelay(String str, int i, int i2);
}
