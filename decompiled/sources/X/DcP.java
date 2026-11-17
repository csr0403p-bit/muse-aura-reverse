package X;

import kotlin.Unit;

/* loaded from: classes5.dex */
public final class DcP implements CPS {
    public final /* synthetic */ DcR A00;
    public final /* synthetic */ G0U<Throwable, Unit> A01;

    @Override // X.CPS
    public final void invoke(Throwable th) {
        C7384Etj.A0Y(th, 0);
        this.A00.A01.set(true);
        this.A01.invoke(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DcP(DcR dcR, G0U<? super Throwable, Unit> g0u) {
        this.A00 = dcR;
        this.A01 = g0u;
    }
}
