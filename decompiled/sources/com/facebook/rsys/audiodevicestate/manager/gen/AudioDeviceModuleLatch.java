package com.facebook.rsys.audiodevicestate.manager.gen;

import X.C8926Fti;
import X.G50;
import X.GVh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class AudioDeviceModuleLatch {
    public static G50<AudioDeviceModuleLatch> CONVERTER = C8926Fti.A00(1);

    public final class CProxy extends AudioDeviceModuleLatch {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioDeviceModuleLatch createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceModuleLatch
        public native void setReadyForMedia();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioDeviceModuleLatch)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GVh.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void setReadyForMedia();
}
