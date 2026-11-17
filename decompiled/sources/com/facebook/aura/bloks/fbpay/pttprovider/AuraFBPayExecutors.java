package com.facebook.aura.bloks.fbpay.pttprovider;

import X.C60O;
import X.C7384Etj;
import X.C8j3;
import X.F60;
import X.InterfaceC5107DYf;
import X.InterfaceC6697EVu;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes5.dex */
public final class AuraFBPayExecutors {
    public final ExecutorService diskExecutor = Executors.newSingleThreadExecutor();
    public final Handler mainHandler = C60O.A02();

    public Executor getDiskIO() {
        ExecutorService executorService = this.diskExecutor;
        C7384Etj.A0T(executorService);
        return executorService;
    }

    public Executor getMainThread() {
        return new Executor() { // from class: com.facebook.aura.bloks.fbpay.pttprovider.AuraFBPayExecutors$mainThread$1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.this$0.mainHandler.post(runnable);
            }
        };
    }

    public /* bridge */ /* synthetic */ InterfaceC6697EVu getFiniteGraphQL() {
        m282getFiniteGraphQL();
        throw F60.createAndThrow();
    }

    public /* bridge */ /* synthetic */ InterfaceC5107DYf getGraphQL() {
        m283getGraphQL();
        throw F60.createAndThrow();
    }

    /* renamed from: getFiniteGraphQL, reason: collision with other method in class */
    public Void m282getFiniteGraphQL() {
        throw C8j3.A18("GraphQL not supported in Aura PTT");
    }

    /* renamed from: getGraphQL, reason: collision with other method in class */
    public Void m283getGraphQL() {
        throw C8j3.A18("GraphQL not supported in Aura PTT");
    }
}
