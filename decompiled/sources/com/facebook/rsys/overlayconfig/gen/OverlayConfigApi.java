package com.facebook.rsys.overlayconfig.gen;

import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class OverlayConfigApi {
    public static G50<OverlayConfigApi> CONVERTER = C8922Fte.A00(11);

    public final class CProxy extends OverlayConfigApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native OverlayConfigApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.overlayconfig.gen.OverlayConfigApi
        public native boolean fetchParameterBoolean(int i, boolean z);

        @Override // com.facebook.rsys.overlayconfig.gen.OverlayConfigApi
        public native int fetchParameterInt32(int i, boolean z);

        public native int hashCode();

        @Override // com.facebook.rsys.overlayconfig.gen.OverlayConfigApi
        public native void logExposure(int i);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof OverlayConfigApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract boolean fetchParameterBoolean(int i, boolean z);

    public abstract int fetchParameterInt32(int i, boolean z);

    public abstract void logExposure(int i);
}
