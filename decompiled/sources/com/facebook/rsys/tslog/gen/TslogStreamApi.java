package com.facebook.rsys.tslog.gen;

import X.C8922Fte;
import X.G50;
import X.GZ6;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class TslogStreamApi {
    public static G50<TslogStreamApi> CONVERTER = C8922Fte.A00(47);

    public final class CProxy extends TslogStreamApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native TslogStreamApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.tslog.gen.TslogStreamApi
        public native TslogCounterApi createCounter(String str, int i);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof TslogStreamApi)) {
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

    public abstract TslogCounterApi createCounter(String str, int i);
}
