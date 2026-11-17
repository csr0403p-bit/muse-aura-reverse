package com.facebook.rsys.environmentvariables.gen;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.C8925Fth;
import X.ETi;
import X.G50;
import X.GZN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mci.Execution;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class EnvironmentVariablesProxy {
    public static G50<EnvironmentVariablesProxy> CONVERTER = C8925Fth.A00(29);

    public final class CProxy extends EnvironmentVariablesProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native EnvironmentVariablesProxy createFromMcfType(McfReference mcfReference);

        public static native EnvironmentVariablesProxy createWithOverrides(EnvironmentVariablesProxy environmentVariablesProxy);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.environmentvariables.gen.EnvironmentVariablesProxy
        public native String copyValue(int i);

        public native int hashCode();

        static {
            if (GZN.A00) {
                return;
            }
            try {
                AbstractC7607F5u.A1F();
                Execution.initialize();
                ETi.loadLibrary("jniperflogger");
                ETi.loadLibrary("rsysenvvarsjni");
                GZN.A00 = true;
            } catch (ClassNotFoundException e) {
                throw AbstractC7608F5v.A0m(e);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof EnvironmentVariablesProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract String copyValue(int i);
}
