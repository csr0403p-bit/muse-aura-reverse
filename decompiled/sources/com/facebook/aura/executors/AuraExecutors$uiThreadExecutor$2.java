package com.facebook.aura.executors;

import X.AbstractC7559F3s;
import X.F0C;
import X.ScheduledExecutorServiceC2994BrM;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraExecutors$uiThreadExecutor$2 extends AbstractC7559F3s implements Function0<ScheduledExecutorServiceC2994BrM> {
    public static final AuraExecutors$uiThreadExecutor$2 INSTANCE = new AuraExecutors$uiThreadExecutor$2();

    public AuraExecutors$uiThreadExecutor$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ScheduledExecutorServiceC2994BrM invoke() {
        return new ScheduledExecutorServiceC2994BrM(F0C.A00());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ScheduledExecutorServiceC2994BrM invoke() {
        return new ScheduledExecutorServiceC2994BrM(F0C.A00());
    }
}
