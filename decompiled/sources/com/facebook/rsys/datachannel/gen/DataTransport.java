package com.facebook.rsys.datachannel.gen;

import X.C8925Fth;
import X.G50;
import X.GYm;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class DataTransport {
    public static G50<DataTransport> CONVERTER = C8925Fth.A00(0);

    public final class CProxy extends DataTransport {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native DataTransport createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.datachannel.gen.DataTransport
        public native void sendData(byte[] bArr);

        @Override // com.facebook.rsys.datachannel.gen.DataTransport
        public native void sendDataWithParams(DataChannelMessageParams dataChannelMessageParams, byte[] bArr);

        @Override // com.facebook.rsys.datachannel.gen.DataTransport
        public native void setListener(DataTransportListener dataTransportListener);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof DataTransport)) {
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

    public abstract void sendData(byte[] bArr);

    public abstract void sendDataWithParams(DataChannelMessageParams dataChannelMessageParams, byte[] bArr);

    public abstract void setListener(DataTransportListener dataTransportListener);
}
