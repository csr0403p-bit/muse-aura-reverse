package X;

import bolts.ExecutorException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Add missing generic type declarations: [TResult] */
/* renamed from: X.DTk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5070DTk<TResult> implements InterfaceC5071DTl<TResult, Void> {
    public final /* synthetic */ InterfaceC5071DTl A00;
    public final /* synthetic */ C5066DTg A01;
    public final /* synthetic */ C5067DTh A02;
    public final /* synthetic */ Executor A03;

    public C5070DTk(InterfaceC5071DTl interfaceC5071DTl, C5066DTg c5066DTg, C5067DTh c5067DTh, Executor executor) {
        this.A01 = c5066DTg;
        this.A02 = c5067DTh;
        this.A00 = interfaceC5071DTl;
        this.A03 = executor;
    }

    @Override // X.InterfaceC5071DTl
    public final /* bridge */ /* synthetic */ Void Agq(C5066DTg c5066DTg) {
        C5067DTh c5067DTh = this.A02;
        InterfaceC5071DTl interfaceC5071DTl = this.A00;
        Executor executor = this.A03;
        ExecutorService executorService = C5066DTg.A0C;
        try {
            executor.execute(new RunnableC5068DTi(interfaceC5071DTl, c5066DTg, c5067DTh));
            return null;
        } catch (Exception e) {
            c5067DTh.A00(new ExecutorException("An exception was thrown by an Executor", e));
            return null;
        }
    }
}
