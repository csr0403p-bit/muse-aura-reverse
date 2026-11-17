package com.facebook.rsys.callinfo.gen;

import X.C8926Fti;
import X.G50;
import X.GUa;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class CallInfoReadCallback {
    public static G50<CallInfoReadCallback> CONVERTER = C8926Fti.A00(19);

    public final class CProxy extends CallInfoReadCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CallInfoReadCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.callinfo.gen.CallInfoReadCallback
        public native void complete(CallInfo callInfo, ArrayList<String> arrayList);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CallInfoReadCallback)) {
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

    public abstract void complete(CallInfo callInfo, ArrayList<String> arrayList);
}
