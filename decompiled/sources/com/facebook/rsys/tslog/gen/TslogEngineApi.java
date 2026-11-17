package com.facebook.rsys.tslog.gen;

import X.C8922Fte;
import X.G50;
import X.GZ6;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class TslogEngineApi {
    public static G50<TslogEngineApi> CONVERTER = C8922Fte.A00(46);

    public final class CProxy extends TslogEngineApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native TslogEngineApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.tslog.gen.TslogEngineApi
        public native TslogStreamApi createStream(String str, int i);

        @Override // com.facebook.rsys.tslog.gen.TslogEngineApi
        public native TslogStreamApi createStreamWithProps(String str, int i, Map<String, String> map);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof TslogEngineApi)) {
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

    public abstract TslogStreamApi createStream(String str, int i);

    public abstract TslogStreamApi createStreamWithProps(String str, int i, Map<String, String> map);
}
