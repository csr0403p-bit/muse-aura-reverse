package com.facebook.rsys.log.gen;

import X.C8925Fth;
import X.G50;
import X.GZ3;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class LogApi {
    public static G50<LogApi> CONVERTER = C8925Fth.A00(42);

    public final class CProxy extends LogApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native void consoleLog(int i, String str, ConsoleLogMetadata consoleLogMetadata);

        public static native LogApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.log.gen.LogApi
        public native void flush();

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof LogApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GZ3.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void flush();
}
