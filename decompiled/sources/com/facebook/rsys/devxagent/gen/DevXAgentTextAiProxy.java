package com.facebook.rsys.devxagent.gen;

import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class DevXAgentTextAiProxy {
    public static G50<DevXAgentTextAiProxy> CONVERTER = C8925Fth.A00(9);

    public final class CProxy extends DevXAgentTextAiProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native DevXAgentTextAiProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.devxagent.gen.DevXAgentTextAiProxy
        public native void textAiCommand(DevXAgentTextAiParams devXAgentTextAiParams);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof DevXAgentTextAiProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void textAiCommand(DevXAgentTextAiParams devXAgentTextAiParams);
}
