package com.facebook.rsys.appstate.gen;

import X.C8923Ftf;
import X.G50;
import X.GVb;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class AppstateApi {
    public static G50<AppstateApi> CONVERTER = C8923Ftf.A00(26);

    public final class CProxy extends AppstateApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AppstateApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.appstate.gen.AppstateApi
        public native void setIsBackgrounded(boolean z);

        @Override // com.facebook.rsys.appstate.gen.AppstateApi
        public native void setIsInAppBackgrounded(boolean z);

        @Override // com.facebook.rsys.appstate.gen.AppstateApi
        public native void setIsPictureInPicture(boolean z);

        @Override // com.facebook.rsys.appstate.gen.AppstateApi
        public native void setIsScreenOff(boolean z);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AppstateApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GVb.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void setIsBackgrounded(boolean z);

    public abstract void setIsInAppBackgrounded(boolean z);

    public abstract void setIsPictureInPicture(boolean z);

    public abstract void setIsScreenOff(boolean z);
}
