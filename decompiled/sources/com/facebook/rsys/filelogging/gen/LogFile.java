package com.facebook.rsys.filelogging.gen;

import X.C8925Fth;
import X.G50;
import X.GX3;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class LogFile {
    public static G50<LogFile> CONVERTER = C8925Fth.A00(35);

    public final class CProxy extends LogFile {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native LogFile createFromMcfType(McfReference mcfReference);

        public static native LogFile createLogFile(String str, int i, String str2);

        public static native LogFileStats createLogFileStats(String str);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.filelogging.gen.LogFile
        public native LogFileData createFileData();

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof LogFile)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GX3.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract LogFileData createFileData();
}
