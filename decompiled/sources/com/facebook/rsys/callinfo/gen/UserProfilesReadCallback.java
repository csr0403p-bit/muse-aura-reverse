package com.facebook.rsys.callinfo.gen;

import X.C8926Fti;
import X.G50;
import X.GUa;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class UserProfilesReadCallback {
    public static G50<UserProfilesReadCallback> CONVERTER = C8926Fti.A00(21);

    public final class CProxy extends UserProfilesReadCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native UserProfilesReadCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.callinfo.gen.UserProfilesReadCallback
        public native void complete(ArrayList<UserProfile> arrayList);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof UserProfilesReadCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GUa.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void complete(ArrayList<UserProfile> arrayList);
}
