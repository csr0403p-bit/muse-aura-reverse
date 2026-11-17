package com.facebook.rsys.transport.gen;

import X.C8922Fte;
import X.G50;
import X.GUi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class SignalingTransportSink {
    public static G50<SignalingTransportSink> CONVERTER = C8922Fte.A00(40);

    public final class CProxy extends SignalingTransportSink {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native SignalingTransportSink createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.transport.gen.SignalingTransportSink
        public native void signalingMessageReceived(SignalingMessage signalingMessage, MessageReceiveCallbacks messageReceiveCallbacks);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SignalingTransportSink)) {
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

    public abstract void signalingMessageReceived(SignalingMessage signalingMessage, MessageReceiveCallbacks messageReceiveCallbacks);
}
