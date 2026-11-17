package com.facebook.rsys.tslog.gen;

import X.C8922Fte;
import X.G50;
import X.GZ6;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class TslogCounterApi {
    public static G50<TslogCounterApi> CONVERTER = C8922Fte.A00(45);

    public final class CProxy extends TslogCounterApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native TslogCounterApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.tslog.gen.TslogCounterApi
        public native void addSample(int i);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof TslogCounterApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GZ6.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void addSample(int i);
}
