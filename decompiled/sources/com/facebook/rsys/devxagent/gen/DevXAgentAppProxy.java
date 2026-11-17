package com.facebook.rsys.devxagent.gen;

import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class DevXAgentAppProxy {
    public static G50<DevXAgentAppProxy> CONVERTER = C8925Fth.A00(5);

    public final class CProxy extends DevXAgentAppProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native DevXAgentAppProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.devxagent.gen.DevXAgentAppProxy
        public native void appCommand(String str);

        public native int hashCode();

        @Override // com.facebook.rsys.devxagent.gen.DevXAgentAppProxy
        public native void openUrl(String str);

        @Override // com.facebook.rsys.devxagent.gen.DevXAgentAppProxy
        public native void startCall(DevXAgentCallStartParams devXAgentCallStartParams);

        @Override // com.facebook.rsys.devxagent.gen.DevXAgentAppProxy
        public native void uploadImage(String str, String str2);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof DevXAgentAppProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void appCommand(String str);

    public abstract void openUrl(String str);

    public abstract void startCall(DevXAgentCallStartParams devXAgentCallStartParams);

    public abstract void uploadImage(String str, String str2);
}
