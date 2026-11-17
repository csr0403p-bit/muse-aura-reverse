package com.facebook.aura.graphql;

import X.AbstractC7559F3s;
import com.facebook.aura.executors.AuraExecutors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraGraphQLExecutorFactory$timerExecutor$2 extends AbstractC7559F3s implements Function0<ScheduledExecutorService> {
    public static final AuraGraphQLExecutorFactory$timerExecutor$2 INSTANCE = new AuraGraphQLExecutorFactory$timerExecutor$2();

    public AuraGraphQLExecutorFactory$timerExecutor$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ScheduledExecutorService invoke() {
        return AuraExecutors.INSTANCE.newSingleThreadScheduledExecutor("AuraGraphQLExecutorFactory-timer", null);
    }
}
