package com.facebook.rsys.tslog.gen;

import X.C8922Fte;
import X.G50;
import X.GZ6;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class TslogApi {
    public static G50<TslogApi> CONVERTER = C8922Fte.A00(44);

    public final class CProxy extends TslogApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native TslogApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.tslog.gen.TslogApi
        public native void getEngine(GetTslogEngineCallback getTslogEngineCallback);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof TslogApi)) {
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

    public abstract void getEngine(GetTslogEngineCallback getTslogEngineCallback);
}
