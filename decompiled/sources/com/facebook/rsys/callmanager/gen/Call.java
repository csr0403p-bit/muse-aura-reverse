package com.facebook.rsys.callmanager.gen;

import X.C8926Fti;
import X.G50;
import X.GUR;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class Call {
    public static G50<Call> CONVERTER = C8926Fti.A00(32);

    public final class CProxy extends Call {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native Call createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.callmanager.gen.Call
        public native ApiBag getApis();

        @Override // com.facebook.rsys.callmanager.gen.Call
        public native String getLocalCallId();

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Call)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GUR.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract ApiBag getApis();

    public abstract String getLocalCallId();
}
