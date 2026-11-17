package com.facebook.msys.mci;

import X.BV5;
import X.BV6;
import X.BV7;
import X.C60O;
import X.C7320Ekq;
import X.C7402Eug;
import X.C8j4;
import X.Esh;
import X.Esi;
import X.Esj;
import X.FGI;
import android.os.Process;
import android.os.Trace;
import android.util.Pair;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public class Execution {
    public static volatile boolean sInitialized;
    public static final ThreadLocal<Pair<Integer, Long>> sThreadLocalExecutionContext;
    public static final ConcurrentHashMap<Integer, Integer> sThreadPriorityMap;

    public static native void endFlowTracking(int i, int i2);

    public static native boolean getIsUserScopedExecutionExperimentValue();

    public static native int nativeGetExecutionContext();

    public static native Long nativeGetSessionedExecutionKey();

    public static native void nativeInitialize();

    public static native void nativeResetExecutorsTestingOnly();

    public static native boolean nativeScheduleTask(Runnable runnable, AccountSession accountSession, int i, int i2, double d, String str);

    public static native void nativeSetDeferExecutionInstrumentation(boolean z);

    public static native void nativeStartExecutor(long j);

    public static native void resetFlowTrackingInCurrentThread();

    public static native void setUserScopedExecutionExperimentValue(boolean z);

    public static native void startFlowTracking(int i, int i2, String str);

    public static int getExecutionContext() {
        Pair<Integer, Long> pair = sThreadLocalExecutionContext.get();
        if (!sInitialized || pair == null) {
            return 0;
        }
        return BV7.A08(pair);
    }

    public static Long getSessionedExecutionKey() {
        Pair<Integer, Long> pair = sThreadLocalExecutionContext.get();
        if (!sInitialized || pair == null) {
            return null;
        }
        return (Long) pair.second;
    }

    public static synchronized boolean initialize() {
        boolean z;
        try {
            Trace.beginSection("Execution.initialize");
            try {
                if (sInitialized) {
                    Trace.endSection();
                    z = false;
                } else {
                    nativeInitialize();
                    z = true;
                    sInitialized = true;
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } finally {
        }
        return z;
    }

    public static boolean isMCPEnabledForExecution() {
        synchronized (Esj.class) {
        }
        return false;
    }

    public static void startExecutorThread(long j, int i, String str) {
        new Thread(new Esh(i, j), FGI.A0M(str, "Context")).start();
    }

    static {
        C7320Ekq.A00();
        sThreadPriorityMap = C60O.A1C();
        sThreadLocalExecutionContext = new Esi();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r6.getSessionedExecutionKey() == r1.longValue()) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void executeInternal(X.Esf r5, com.facebook.msys.mci.AccountSession r6, int r7, int r8, long r9, boolean r11) {
        /*
            java.lang.String r2 = r5.toString()
            boolean r0 = com.facebook.msys.mci.Execution.sInitialized
            if (r0 == 0) goto L60
            int r0 = getExecutionContext()
            if (r0 != r7) goto L28
            java.lang.Long r1 = getSessionedExecutionKey()
            if (r1 == 0) goto L24
            java.lang.String r0 = "Account Session must be non-null for sessioned execution contexts"
            if (r6 == 0) goto L5b
            long r3 = r6.getSessionedExecutionKey()
            long r1 = r1.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L28
        L24:
            r5.run()
        L27:
            return
        L28:
            r8 = 0
            r0 = 2
            if (r7 == r0) goto L39
            r0 = 6
            if (r7 == r0) goto L39
            r0 = 5
            if (r7 == r0) goto L39
            r0 = 7
            if (r7 == r0) goto L39
            r0 = 8
            if (r7 != r0) goto L42
        L39:
            java.lang.String r0 = "Account Session must be non-null for sessioned execution contexts"
            if (r6 != 0) goto L42
            java.lang.NullPointerException r0 = X.BV4.A0a(r0)
            throw r0
        L42:
            r9 = 0
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r9 = r9 / r0
            java.lang.String r11 = r5.toString()
            boolean r0 = nativeScheduleTask(r5, r6, r7, r8, r9, r11)
            if (r0 != 0) goto L27
            java.lang.String r0 = "UNKNOWN execution context "
            java.lang.RuntimeException r0 = X.BV5.A0g(r0, r7)
            throw r0
        L5b:
            java.lang.NullPointerException r0 = X.BV4.A0a(r0)
            throw r0
        L60:
            java.lang.String r1 = "Execution was called by "
            java.lang.String r0 = " but was not initialized before being used"
            java.lang.RuntimeException r0 = X.BV5.A0i(r1, r2, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.Execution.executeInternal(X.Esf, com.facebook.msys.mci.AccountSession, int, int, long, boolean):void");
    }

    public static int getThreadPriority(int i) {
        int threadPriority;
        List list = (List) BV5.A0f(C7402Eug.A00(), i);
        if (list == null) {
            return Integer.MIN_VALUE;
        }
        synchronized (list) {
            threadPriority = list.isEmpty() ? Integer.MIN_VALUE : Process.getThreadPriority(BV6.A07(C8j4.A0p(list)));
        }
        return threadPriority;
    }

    public static boolean isOnMsysMainContext() {
        return BV7.A1Q(getExecutionContext());
    }
}
