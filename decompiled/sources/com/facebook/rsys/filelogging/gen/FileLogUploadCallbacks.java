package com.facebook.rsys.filelogging.gen;

import X.C8925Fth;
import X.G50;
import X.GX3;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class FileLogUploadCallbacks {
    public static G50<FileLogUploadCallbacks> CONVERTER = C8925Fth.A00(32);

    public final class CProxy extends FileLogUploadCallbacks {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native FileLogUploadCallbacks createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.filelogging.gen.FileLogUploadCallbacks
        public native void cancel();

        @Override // com.facebook.rsys.filelogging.gen.FileLogUploadCallbacks
        public native void failure();

        public native int hashCode();

        @Override // com.facebook.rsys.filelogging.gen.FileLogUploadCallbacks
        public native void success(String str);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof FileLogUploadCallbacks)) {
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

    public abstract void cancel();

    public abstract void failure();

    public abstract void success(String str);
}
