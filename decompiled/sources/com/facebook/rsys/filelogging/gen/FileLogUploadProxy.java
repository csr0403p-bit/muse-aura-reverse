package com.facebook.rsys.filelogging.gen;

import X.C8925Fth;
import X.G50;
import X.GX3;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class FileLogUploadProxy {
    public static G50<FileLogUploadProxy> CONVERTER = C8925Fth.A00(33);

    public final class CProxy extends FileLogUploadProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native FileLogUploadProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.filelogging.gen.FileLogUploadProxy
        public native String getUploaderName();

        public native int hashCode();

        @Override // com.facebook.rsys.filelogging.gen.FileLogUploadProxy
        public native void upload(byte[] bArr, String str, FileLogUploadCallbacks fileLogUploadCallbacks);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof FileLogUploadProxy)) {
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

    public abstract String getUploaderName();

    public abstract void upload(byte[] bArr, String str, FileLogUploadCallbacks fileLogUploadCallbacks);
}
