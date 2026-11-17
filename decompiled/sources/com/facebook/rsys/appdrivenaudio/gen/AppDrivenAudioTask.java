package com.facebook.rsys.appdrivenaudio.gen;

import X.C8923Ftf;
import X.G50;
import X.GUW;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class AppDrivenAudioTask {
    public static G50<AppDrivenAudioTask> CONVERTER = C8923Ftf.A00(20);

    public final class CProxy extends AppDrivenAudioTask {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AppDrivenAudioTask createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioTask
        public native void run();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AppDrivenAudioTask)) {
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

    public abstract void run();
}
