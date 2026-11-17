package com.facebook.rsys.groupexpansion.gen;

import X.C8925Fth;
import X.G50;
import X.GYn;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class GroupExpansionCompletedCallback {
    public static G50<GroupExpansionCompletedCallback> CONVERTER = C8925Fth.A00(38);

    public final class CProxy extends GroupExpansionCompletedCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native GroupExpansionCompletedCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.groupexpansion.gen.GroupExpansionCompletedCallback
        public native void onFailure(int i);

        @Override // com.facebook.rsys.groupexpansion.gen.GroupExpansionCompletedCallback
        public native void onSuccess(String str, boolean z);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof GroupExpansionCompletedCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GYn.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onFailure(int i);

    public abstract void onSuccess(String str, boolean z);
}
