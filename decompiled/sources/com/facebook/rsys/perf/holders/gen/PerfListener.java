package com.facebook.rsys.perf.holders.gen;

import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class PerfListener {
    public static G50<PerfListener> CONVERTER = C8922Fte.A00(12);

    public final class CProxy extends PerfListener {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native PerfListener createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.perf.holders.gen.PerfListener
        public native void onMarkerStart(String str, String str2);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof PerfListener)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onMarkerStart(String str, String str2);
}
