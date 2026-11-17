package com.facebook.rsys.devxagent.gen;

import X.C8925Fth;
import X.G50;
import X.GYi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.HashSet;

/* loaded from: classes6.dex */
public abstract class DevXAgentApi {
    public static G50<DevXAgentApi> CONVERTER = C8925Fth.A00(3);

    public final class CProxy extends DevXAgentApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native DevXAgentApi createApi();

        public static native DevXAgentApi createFromMcfType(McfReference mcfReference);

        public static native int getApiStatus();

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public static native void reportError(DevXAgentAppError devXAgentAppError);

        public static native DevXAgentApi tryGetApi();

        @Override // com.facebook.rsys.devxagent.gen.DevXAgentApi
        public native DevXAgentTextAiResponseHandler getTextAiResponseHandler();

        @Override // com.facebook.rsys.devxagent.gen.DevXAgentApi
        public native DevXAgentUploadImageResultHandler getUploadImageResultHandler();

        public native int hashCode();

        @Override // com.facebook.rsys.devxagent.gen.DevXAgentApi
        public native void setProxy(DevXAgentAppProxy devXAgentAppProxy, HashSet<Integer> hashSet);

        @Override // com.facebook.rsys.devxagent.gen.DevXAgentApi
        public native void setTextAiProxy(DevXAgentTextAiProxy devXAgentTextAiProxy, HashSet<Integer> hashSet);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof DevXAgentApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GYi.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract DevXAgentTextAiResponseHandler getTextAiResponseHandler();

    public abstract DevXAgentUploadImageResultHandler getUploadImageResultHandler();

    public abstract void setProxy(DevXAgentAppProxy devXAgentAppProxy, HashSet<Integer> hashSet);

    public abstract void setTextAiProxy(DevXAgentTextAiProxy devXAgentTextAiProxy, HashSet<Integer> hashSet);
}
