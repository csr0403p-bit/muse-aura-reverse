package X;

import java.util.concurrent.Executor;

/* renamed from: X.Dgm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5343Dgm implements InterfaceExecutorC5232Ddq {
    public final /* synthetic */ InterfaceC5344Dgn A00;
    public final /* synthetic */ Executor A01;

    public C5343Dgm(InterfaceC5344Dgn interfaceC5344Dgn, Executor executor) {
        this.A01 = executor;
        this.A00 = interfaceC5344Dgn;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.A01.execute(runnable);
    }
}
