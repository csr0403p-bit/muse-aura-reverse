package com.facebook.aura.executors;

import X.AbstractC7559F3s;
import X.BV4;
import X.CFK;
import X.F0C;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraExecutors$responseStreamingExecutor$2 extends AbstractC7559F3s implements Function0<ThreadPoolExecutor> {
    public static final AuraExecutors$responseStreamingExecutor$2 INSTANCE = new AuraExecutors$responseStreamingExecutor$2();

    public AuraExecutors$responseStreamingExecutor$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ThreadPoolExecutor invoke() {
        return new ThreadPoolExecutor(0, 8, 60000L, TimeUnit.MILLISECONDS, new SynchronousQueue(), NameAndPriorityThreadFactory.Companion.countingName("Aura-HatchResponse #", 0, null), new RejectedExecutionHandler() { // from class: com.facebook.aura.executors.AuraExecutors$responseStreamingExecutor$2.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                long jIncrementAndGet = AuraExecutors.responseStreamingOverflowCount.incrementAndGet();
                if (jIncrementAndGet == 1 || jIncrementAndGet % 100 == 0) {
                    CFK.A0H(AuraExecutors.TAG, "Response streaming pool saturated, overflow dispatches=%d", BV4.A1X(jIncrementAndGet));
                }
                F0C.A06(AuraExecutors.responseStreamingOverflowExecutor$delegate).execute(runnable);
            }
        });
    }
}
