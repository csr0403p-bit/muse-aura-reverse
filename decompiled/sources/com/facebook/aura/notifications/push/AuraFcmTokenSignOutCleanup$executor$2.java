package com.facebook.aura.notifications.push;

import X.AbstractC7559F3s;
import com.facebook.aura.executors.AuraExecutors;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraFcmTokenSignOutCleanup$executor$2 extends AbstractC7559F3s implements Function0<ExecutorService> {
    public static final AuraFcmTokenSignOutCleanup$executor$2 INSTANCE = new AuraFcmTokenSignOutCleanup$executor$2();

    public AuraFcmTokenSignOutCleanup$executor$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ExecutorService invoke() {
        return AuraExecutors.INSTANCE.newSingleThreadExecutor(AuraFcmTokenSignOutCleanup.THREAD_NAME);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ExecutorService invoke() {
        return AuraExecutors.INSTANCE.newSingleThreadExecutor(AuraFcmTokenSignOutCleanup.THREAD_NAME);
    }
}
