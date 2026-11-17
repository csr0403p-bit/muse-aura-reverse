package com.facebook.aura.network.crudonet;

import X.AbstractC7559F3s;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraCrudoNet$networkExecutor$2 extends AbstractC7559F3s implements Function0<ExecutorService> {
    public static final AuraCrudoNet$networkExecutor$2 INSTANCE = new AuraCrudoNet$networkExecutor$2();

    /* renamed from: com.facebook.aura.network.crudonet.AuraCrudoNet$networkExecutor$2$1, reason: invalid class name */
    public final class AnonymousClass1 implements ThreadFactory {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AuraCrudoNet");
            thread.setDaemon(true);
            return thread;
        }
    }

    public AuraCrudoNet$networkExecutor$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ExecutorService invoke() {
        return Executors.newFixedThreadPool(4, AnonymousClass1.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ExecutorService invoke() {
        return Executors.newFixedThreadPool(4, AnonymousClass1.INSTANCE);
    }
}
