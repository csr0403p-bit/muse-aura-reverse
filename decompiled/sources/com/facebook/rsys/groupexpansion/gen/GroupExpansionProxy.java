package com.facebook.rsys.groupexpansion.gen;

import X.C8925Fth;
import X.G50;
import X.GYn;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class GroupExpansionProxy {
    public static G50<GroupExpansionProxy> CONVERTER = C8925Fth.A00(39);

    public final class CProxy extends GroupExpansionProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native GroupExpansionProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.groupexpansion.gen.GroupExpansionProxy
        public native void expand(String str, String str2, ArrayList<String> arrayList, ArrayList<String> arrayList2, int i, int i2, GroupExpansionCompletedCallback groupExpansionCompletedCallback);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof GroupExpansionProxy)) {
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

    public abstract void expand(String str, String str2, ArrayList<String> arrayList, ArrayList<String> arrayList2, int i, int i2, GroupExpansionCompletedCallback groupExpansionCompletedCallback);
}
