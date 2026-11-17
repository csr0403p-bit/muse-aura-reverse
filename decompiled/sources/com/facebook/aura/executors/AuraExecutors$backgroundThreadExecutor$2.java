package com.facebook.aura.executors;

import X.AbstractC7559F3s;
import com.facebook.aura.executors.AuraExecutors;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraExecutors$backgroundThreadExecutor$2 extends AbstractC7559F3s implements Function0<ThreadPoolExecutor> {
    public static final AuraExecutors$backgroundThreadExecutor$2 INSTANCE = new AuraExecutors$backgroundThreadExecutor$2();

    public AuraExecutors$backgroundThreadExecutor$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ThreadPoolExecutor invoke() {
        AuraExecutors.ThreadPoolBuilder threadPoolBuilder = new AuraExecutors.ThreadPoolBuilder();
        int i = AuraExecutors.CORE_POOL_SIZE;
        threadPoolBuilder.corePoolSize = i;
        threadPoolBuilder.maxPoolSize(i);
        threadPoolBuilder.queueSize = Integer.MAX_VALUE;
        threadPoolBuilder.keepAliveMsec = 30000L;
        threadPoolBuilder.nameOrNamePrefix = "Aura-Foreground #";
        return threadPoolBuilder.build();
    }
}
