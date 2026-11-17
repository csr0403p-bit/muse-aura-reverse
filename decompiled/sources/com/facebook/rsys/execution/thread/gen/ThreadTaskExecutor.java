package com.facebook.rsys.execution.thread.gen;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.ETi;
import X.GWx;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mci.Execution;
import com.facebook.rsys.execution.gen.TaskExecutor;

/* loaded from: classes6.dex */
public abstract class ThreadTaskExecutor {

    public final class CProxy extends ThreadTaskExecutor {
        public static native ThreadTaskExecutor createFromMcfType(McfReference mcfReference);

        public static native TaskExecutor createTaskExecutor(String str);

        public static native long nativeGetMcfTypeId();

        static {
            if (GWx.A00) {
                return;
            }
            try {
                AbstractC7607F5u.A1F();
                Execution.initialize();
                ETi.loadLibrary("jniperflogger");
                ETi.loadLibrary("rsysthreadexecutionjniLatest");
                GWx.A00 = true;
            } catch (ClassNotFoundException e) {
                throw AbstractC7608F5v.A0m(e);
            }
        }
    }
}
