package com.facebook.rsys.transport.gen;

import X.C8922Fte;
import X.G50;
import X.GUi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class MessageReceiveCallbacks {
    public static G50<MessageReceiveCallbacks> CONVERTER = C8922Fte.A00(30);

    public final class CProxy extends MessageReceiveCallbacks {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native MessageReceiveCallbacks createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.transport.gen.MessageReceiveCallbacks
        public native void onError(int i, String str);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof MessageReceiveCallbacks)) {
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

    public abstract void onError(int i, String str);
}
