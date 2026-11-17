package com.facebook.rsys.appdrivenaudio.gen;

import X.C8923Ftf;
import X.G50;
import X.GUW;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class AudioStateManagerTaskRunner {
    public static G50<AudioStateManagerTaskRunner> CONVERTER = C8923Ftf.A00(24);

    public final class CProxy extends AudioStateManagerTaskRunner {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioStateManagerTaskRunner createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerTaskRunner
        public native void post(AppDrivenAudioTask appDrivenAudioTask, long j);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioStateManagerTaskRunner)) {
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

    public abstract void post(AppDrivenAudioTask appDrivenAudioTask, long j);
}
