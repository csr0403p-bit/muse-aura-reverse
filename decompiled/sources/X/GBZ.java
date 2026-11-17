package X;

import kotlinx.coroutines.DispatchException;

/* loaded from: classes6.dex */
public final class GBZ<T> extends GBP {
    public final GBL<T> A00;

    /* JADX WARN: Multi-variable type inference failed */
    public GBZ(GBL<? super T> gbl) {
        this.A00 = gbl;
    }

    @Override // X.GBP
    public final void A06(Throwable th) throws DispatchException {
        Object objA00;
        Object obj = GBM.A01.get(A05());
        boolean z = obj instanceof C10474Hkl;
        GBL<T> gbl = this.A00;
        if (z) {
            Throwable th2 = ((C10474Hkl) obj).A00;
            C7384Etj.A0Y(th2, 0);
            objA00 = C3cG.A0s(th2);
        } else {
            objA00 = AbstractC9251GBe.A00(obj);
        }
        gbl.resumeWith(objA00);
    }
}
