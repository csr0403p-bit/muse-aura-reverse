package com.facebook.rsys.audio.gen;

import X.C8923Ftf;
import X.G50;
import X.GUX;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.frame.gen.AudioFrame;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class AudioSourceSink {
    public static G50<AudioSourceSink> CONVERTER = C8923Ftf.A00(43);

    public final class CProxy extends AudioSourceSink {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioSourceSink createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.audio.gen.AudioSourceSink
        public native void onEncodedPacket(AudioEncodedPacket audioEncodedPacket);

        @Override // com.facebook.rsys.audio.gen.AudioSourceSink
        public native void onFrame(AudioFrame audioFrame);

        @Override // com.facebook.rsys.audio.gen.AudioSourceSink
        public native void onPositionUpdate(float f, float f2, float f3);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioSourceSink)) {
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

    public abstract void onEncodedPacket(AudioEncodedPacket audioEncodedPacket);

    public abstract void onFrame(AudioFrame audioFrame);

    public abstract void onPositionUpdate(float f, float f2, float f3);
}
