package com.facebook.rsys.devxcallagent.gen;

import X.C8925Fth;
import X.G50;
import X.GYj;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class DevXAgentCallApi {
    public static G50<DevXAgentCallApi> CONVERTER = C8925Fth.A00(20);

    public final class CProxy extends DevXAgentCallApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native DevXAgentCallApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.devxcallagent.gen.DevXAgentCallApi
        public native DevXAgentCallConfig copyCallConfig(String str);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof DevXAgentCallApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GYj.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract DevXAgentCallConfig copyCallConfig(String str);
}
