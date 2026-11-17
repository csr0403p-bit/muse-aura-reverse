package X;

import kotlin.Unit;
import kotlinx.coroutines.DispatchException;

/* loaded from: classes6.dex */
public final class GBV implements Hm1<Unit>, GCR {
    public final Object A00;
    public final GBL<Unit> A01;
    public final /* synthetic */ C9258GBl A02;

    /* JADX WARN: Multi-variable type inference failed */
    public GBV(Object obj, GBL<? super Unit> gbl, Object obj2) {
        this.A02 = obj2;
        this.A01 = gbl;
        this.A00 = obj;
    }

    @Override // X.Hm1
    public final boolean A5x(Throwable th) {
        return this.A01.A5x(th);
    }

    @Override // X.Hm1
    public final void A6g() throws DispatchException {
        GBL<Unit> gbl = this.A01;
        GBL.A06(gbl, ((GBN) gbl).A00);
    }

    @Override // X.Hm1
    public final void AO2(G0U<? super Throwable, Unit> g0u) {
        this.A01.AO2(g0u);
    }

    @Override // X.GCR
    public final void AO3(GCK<?> gck, int i) {
        this.A01.AO3(gck, i);
    }

    @Override // X.Hm1
    public final /* bridge */ /* synthetic */ void Abe(Object obj, G0W g0w) throws DispatchException {
        C9258GBl c9258GBl = this.A02;
        C9258GBl.A01.set(c9258GBl, this.A00);
        this.A01.Abf(new C8941Ftx(2, this, c9258GBl), obj);
    }

    @Override // X.Hm1
    public final /* bridge */ /* synthetic */ void Abf(G0U g0u, Object obj) throws DispatchException {
        this.A01.Abf(g0u, obj);
    }

    @Override // X.Hm1
    public final /* bridge */ /* synthetic */ Object AhY(Object obj, Object obj2, G0W g0w) {
        C9258GBl c9258GBl = this.A02;
        HrH hrHA02 = GBL.A02(obj, obj2, new C8942Fty(2, this, c9258GBl), this.A01);
        if (hrHA02 != null) {
            C9258GBl.A01.set(c9258GBl, this.A00);
        }
        return hrHA02;
    }

    @Override // X.HtJ
    public final C78T getContext() {
        return this.A01.A01;
    }

    @Override // X.Hm1
    public final boolean isActive() {
        return this.A01.isActive();
    }

    @Override // X.HtJ
    public final void resumeWith(Object obj) throws DispatchException {
        this.A01.resumeWith(obj);
    }

    @Override // X.Hm1
    public final /* bridge */ /* synthetic */ void Abi(Object obj, GBK gbk) {
        throw F60.createAndThrow();
    }
}
