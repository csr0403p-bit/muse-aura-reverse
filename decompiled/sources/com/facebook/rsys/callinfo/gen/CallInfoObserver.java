package com.facebook.rsys.callinfo.gen;

import X.C8926Fti;
import X.G50;
import X.GUa;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class CallInfoObserver {
    public static G50<CallInfoObserver> CONVERTER = C8926Fti.A00(18);

    public final class CProxy extends CallInfoObserver {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CallInfoObserver createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.callinfo.gen.CallInfoObserver
        public native void onUpdate();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CallInfoObserver)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GUa.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onUpdate();
}
