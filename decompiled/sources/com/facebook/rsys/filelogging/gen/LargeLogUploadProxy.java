package com.facebook.rsys.filelogging.gen;

import X.C8925Fth;
import X.G50;
import X.GX3;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class LargeLogUploadProxy {
    public static G50<LargeLogUploadProxy> CONVERTER = C8925Fth.A00(34);

    public final class CProxy extends LargeLogUploadProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native LargeLogUploadProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
        public native void setStructuredLogger(McfReference mcfReference);

        @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
        public native void uploadAudioInput(String str, String str2);

        @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
        public native void uploadAudioOutput(String str, String str2);

        @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
        public native void uploadConsoleLog(String str, String str2);

        @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
        public native void uploadOnDemand(byte[] bArr);

        @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
        public native void uploadRtcEventLog(String str, String str2);

        @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
        public native void uploadSdpLog(String str, String str2);

        @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
        public native void uploadZtConsoleLog(String str, String str2);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof LargeLogUploadProxy)) {
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

    public abstract void setStructuredLogger(McfReference mcfReference);

    public abstract void uploadAudioInput(String str, String str2);

    public abstract void uploadAudioOutput(String str, String str2);

    public abstract void uploadConsoleLog(String str, String str2);

    public abstract void uploadOnDemand(byte[] bArr);

    public abstract void uploadRtcEventLog(String str, String str2);

    public abstract void uploadSdpLog(String str, String str2);

    public abstract void uploadZtConsoleLog(String str, String str2);
}
