package com.facebook.rsys.devxagent.gen;

import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class DevXAgentUploadImageResultHandler {
    public static G50<DevXAgentUploadImageResultHandler> CONVERTER = C8925Fth.A00(13);

    public final class CProxy extends DevXAgentUploadImageResultHandler {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native DevXAgentUploadImageResultHandler createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.devxagent.gen.DevXAgentUploadImageResultHandler
        public native void onResult(DevXAgentUploadImageResult devXAgentUploadImageResult);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof DevXAgentUploadImageResultHandler)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onResult(DevXAgentUploadImageResult devXAgentUploadImageResult);
}
