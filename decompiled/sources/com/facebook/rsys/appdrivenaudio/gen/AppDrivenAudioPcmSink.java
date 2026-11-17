package com.facebook.rsys.appdrivenaudio.gen;

import X.C8923Ftf;
import X.G50;
import X.GUW;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.frame.gen.AudioFrame;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class AppDrivenAudioPcmSink {
    public static G50<AppDrivenAudioPcmSink> CONVERTER = C8923Ftf.A00(19);

    public final class CProxy extends AppDrivenAudioPcmSink {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AppDrivenAudioPcmSink createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioPcmSink
        public native void onPcmFrame(AudioFrame audioFrame);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AppDrivenAudioPcmSink)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GUW.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onPcmFrame(AudioFrame audioFrame);
}
