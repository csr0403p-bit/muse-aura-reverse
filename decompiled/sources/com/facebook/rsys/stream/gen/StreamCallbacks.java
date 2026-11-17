package com.facebook.rsys.stream.gen;

import X.C8922Fte;
import X.G50;
import X.GUj;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class StreamCallbacks {
    public static G50<StreamCallbacks> CONVERTER = C8922Fte.A00(23);

    public final class CProxy extends StreamCallbacks {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native StreamCallbacks createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.stream.gen.StreamCallbacks
        public native void onFailure(int i);

        @Override // com.facebook.rsys.stream.gen.StreamCallbacks
        public native void onSuccess();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof StreamCallbacks)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GUj.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onFailure(int i);

    public abstract void onSuccess();
}
