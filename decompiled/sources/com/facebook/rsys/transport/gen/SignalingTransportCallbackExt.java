package com.facebook.rsys.transport.gen;

import X.C8922Fte;
import X.G50;
import X.GUi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class SignalingTransportCallbackExt {
    public static G50<SignalingTransportCallbackExt> CONVERTER = C8922Fte.A00(38);

    public final class CProxy extends SignalingTransportCallbackExt {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native SignalingTransportCallbackExt createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.transport.gen.SignalingTransportCallbackExt
        public native void sendAttemptCallbackExt(SendMessageAttemptStats sendMessageAttemptStats);

        @Override // com.facebook.rsys.transport.gen.SignalingTransportCallbackExt
        public native void sendCompleteCallbackExt(SendMessageStats sendMessageStats);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SignalingTransportCallbackExt)) {
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

    public abstract void sendAttemptCallbackExt(SendMessageAttemptStats sendMessageAttemptStats);

    public abstract void sendCompleteCallbackExt(SendMessageStats sendMessageStats);
}
