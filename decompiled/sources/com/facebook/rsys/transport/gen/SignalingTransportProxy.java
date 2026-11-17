package com.facebook.rsys.transport.gen;

import X.C8922Fte;
import X.G50;
import X.GUi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class SignalingTransportProxy {
    public static G50<SignalingTransportProxy> CONVERTER = C8922Fte.A00(39);

    public final class CProxy extends SignalingTransportProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native SignalingTransportProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.transport.gen.SignalingTransportProxy
        public native SignalingTransportSink getTransportSink();

        public native int hashCode();

        @Override // com.facebook.rsys.transport.gen.SignalingTransportProxy
        public native void onStatusUpdate(StatusUpdate statusUpdate);

        @Override // com.facebook.rsys.transport.gen.SignalingTransportProxy
        public native void sendSignalingMessage(SignalingMessage signalingMessage, SignalingTransportCallback signalingTransportCallback, SignalingTransportCallbackExt signalingTransportCallbackExt, int i);

        @Override // com.facebook.rsys.transport.gen.SignalingTransportProxy
        public native void setSink(SignalingTransportSink signalingTransportSink);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SignalingTransportProxy)) {
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

    public abstract SignalingTransportSink getTransportSink();

    public abstract void onStatusUpdate(StatusUpdate statusUpdate);

    public abstract void sendSignalingMessage(SignalingMessage signalingMessage, SignalingTransportCallback signalingTransportCallback, SignalingTransportCallbackExt signalingTransportCallbackExt, int i);

    public abstract void setSink(SignalingTransportSink signalingTransportSink);
}
