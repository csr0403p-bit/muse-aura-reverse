package com.facebook.rsys.execution.gen;

import X.C8925Fth;
import X.G50;
import X.GVI;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class Task {
    public static G50<Task> CONVERTER = C8925Fth.A00(30);

    public final class CProxy extends Task {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native Task createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        @Override // com.facebook.rsys.execution.gen.Task
        public native void run();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Task)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            GVI.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void run();
}
