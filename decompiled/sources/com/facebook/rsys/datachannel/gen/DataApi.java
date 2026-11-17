package com.facebook.rsys.datachannel.gen;

import X.C8926Fti;
import X.G50;
import X.GYm;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class DataApi {
    public static G50<DataApi> CONVERTER = C8926Fti.A00(47);

    public final class CProxy extends DataApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native DataApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.datachannel.gen.DataApi
        public native DataTransport createTransport(String str, DataChannelConfig dataChannelConfig);

        public native int hashCode();

        @Override // com.facebook.rsys.datachannel.gen.DataApi
        public native void removeTransport(String str, DataTransport dataTransport);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof DataApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GYm.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract DataTransport createTransport(String str, DataChannelConfig dataChannelConfig);

    public abstract void removeTransport(String str, DataTransport dataTransport);
}
