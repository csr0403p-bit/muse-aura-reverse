package com.facebook.rsys.mediastats.gen;

import X.C8925Fth;
import X.G50;
import X.GUd;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class AudioLevelsCallback {
    public static G50<AudioLevelsCallback> CONVERTER = C8925Fth.A00(46);

    public final class CProxy extends AudioLevelsCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioLevelsCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.mediastats.gen.AudioLevelsCallback
        public native void complete(Map<String, Integer> map);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioLevelsCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GUd.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void complete(Map<String, Integer> map);
}
