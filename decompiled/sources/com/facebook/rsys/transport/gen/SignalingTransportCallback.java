package com.facebook.rsys.transport.gen;

import X.C8922Fte;
import X.G50;
import X.GUi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class SignalingTransportCallback {
    public static G50<SignalingTransportCallback> CONVERTER = C8922Fte.A00(37);

    public final class CProxy extends SignalingTransportCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native SignalingTransportCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.transport.gen.SignalingTransportCallback
        public native void sendFailureCallback();

        @Override // com.facebook.rsys.transport.gen.SignalingTransportCallback
        public native void sendSuccessCallback();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SignalingTransportCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GUi.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void sendFailureCallback();

    public abstract void sendSuccessCallback();
}
