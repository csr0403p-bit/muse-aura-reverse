package com.facebook.aura.executors;

import X.AbstractC7559F3s;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraExecutors$fileUploadStreamingExecutor$2 extends AbstractC7559F3s implements Function0<ThreadPoolExecutor> {
    public static final AuraExecutors$fileUploadStreamingExecutor$2 INSTANCE = new AuraExecutors$fileUploadStreamingExecutor$2();

    public AuraExecutors$fileUploadStreamingExecutor$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ThreadPoolExecutor invoke() {
        return new ThreadPoolExecutor(0, 8, 60000L, TimeUnit.MILLISECONDS, new SynchronousQueue(), NameAndPriorityThreadFactory.Companion.countingName("Aura-HatchUpload #", 10, null), new RejectedExecutionHandler() { // from class: com.facebook.aura.executors.AuraExecutors$fileUploadStreamingExecutor$2.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                Thread thread = new Thread(runnable, "Aura-HatchUpload-overflow");
                thread.setDaemon(true);
                thread.start();
            }
        });
    }
}
