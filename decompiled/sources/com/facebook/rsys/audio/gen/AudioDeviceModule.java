package com.facebook.rsys.audio.gen;

import X.C8923Ftf;
import X.G50;
import X.GUX;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class AudioDeviceModule {
    public static G50<AudioDeviceModule> CONVERTER = C8923Ftf.A00(35);

    public final class CProxy extends AudioDeviceModule {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioDeviceModule createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.audio.gen.AudioDeviceModule
        public native void startPlayout();

        @Override // com.facebook.rsys.audio.gen.AudioDeviceModule
        public native void startRecording();

        @Override // com.facebook.rsys.audio.gen.AudioDeviceModule
        public native void stopPlayout();

        @Override // com.facebook.rsys.audio.gen.AudioDeviceModule
        public native void stopRecording();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioDeviceModule)) {
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

    public abstract void startPlayout();

    public abstract void startRecording();

    public abstract void stopPlayout();

    public abstract void stopRecording();
}
