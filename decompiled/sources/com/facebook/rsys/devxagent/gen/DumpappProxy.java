package com.facebook.rsys.devxagent.gen;

import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class DumpappProxy {
    public static G50<DumpappProxy> CONVERTER = C8925Fth.A00(17);

    public final class CProxy extends DumpappProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native DumpappProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.devxagent.gen.DumpappProxy
        public native void dispatchCommand(String str, long j);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof DumpappProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void dispatchCommand(String str, long j);
}
