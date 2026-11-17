package com.facebook.rsys.base.gen;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.C8926Fti;
import X.ETi;
import X.G50;
import X.GZH;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mci.Execution;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class FeatureHolder {
    public static G50<FeatureHolder> CONVERTER = C8926Fti.A00(8);

    public final class CProxy extends FeatureHolder {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native FeatureHolder createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.base.gen.FeatureHolder
        public native boolean hasBeenBound();

        public native int hashCode();

        static {
            if (GZH.A00) {
                return;
            }
            try {
                AbstractC7607F5u.A1F();
                Execution.initialize();
                ETi.loadLibrary("jniperflogger");
                ETi.loadLibrary("rsysbasejniLatest");
                GZH.A00 = true;
            } catch (ClassNotFoundException e) {
                throw AbstractC7608F5v.A0m(e);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof FeatureHolder)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract boolean hasBeenBound();
}
