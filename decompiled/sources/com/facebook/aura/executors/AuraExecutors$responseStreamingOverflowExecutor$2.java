package com.facebook.aura.executors;

import X.AbstractC7559F3s;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraExecutors$responseStreamingOverflowExecutor$2 extends AbstractC7559F3s implements Function0<ThreadPoolExecutor> {
    public static final AuraExecutors$responseStreamingOverflowExecutor$2 INSTANCE = new AuraExecutors$responseStreamingOverflowExecutor$2();

    public AuraExecutors$responseStreamingOverflowExecutor$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ThreadPoolExecutor invoke() {
        return new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60000L, TimeUnit.MILLISECONDS, new SynchronousQueue(), NameAndPriorityThreadFactory.Companion.countingName("Aura-HatchResponse-overflow #", 0, null));
    }
}
