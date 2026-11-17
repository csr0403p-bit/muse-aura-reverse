package com.facebook.rsys.execution.gen;

import X.C8925Fth;
import X.G50;
import X.GVI;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes6.dex */
public abstract class TaskExecutor {
    public static G50<TaskExecutor> CONVERTER = C8925Fth.A00(31);

    public final class CProxy extends TaskExecutor {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native TaskExecutor createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.execution.gen.TaskExecutor
        public native void execute(Task task, long j);

        public native int hashCode();

        @Override // com.facebook.rsys.execution.gen.TaskExecutor
        public native boolean isCurrent();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof TaskExecutor)) {
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

    public abstract void execute(Task task, long j);

    public abstract boolean isCurrent();
}
