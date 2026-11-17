package com.facebook.rsys.perf.holders.gen;

import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class PerfListenerFactory {
    public static G50<PerfListenerFactory> CONVERTER = C8922Fte.A00(13);

    public final class CProxy extends PerfListenerFactory {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native PerfListenerFactory createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.perf.holders.gen.PerfListenerFactory
        public native PerfListener createPerfListener(String str, String str2);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof PerfListenerFactory)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract PerfListener createPerfListener(String str, String str2);
}
