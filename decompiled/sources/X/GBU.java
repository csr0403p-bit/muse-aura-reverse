package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;

/* loaded from: classes6.dex */
public final class GBU extends GBP {
    public final GBL<?> A00;

    @Override // X.GBP
    public final void A06(Throwable th) throws DispatchException {
        GBL<?> gbl = this.A00;
        Throwable thA0G = gbl.A0G(A05());
        if (GBL.A08(gbl)) {
            HtJ<?> htJ = gbl.A00;
            C7384Etj.A0Z(htJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GBJ.A04;
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(htJ);
                HrH hrH = GBI.A00;
                if (C7384Etj.areEqual(obj, hrH)) {
                    if (AbstractC5217DdT.A00(htJ, hrH, thA0G, atomicReferenceFieldUpdater)) {
                        return;
                    }
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    if (AbstractC5217DdT.A00(htJ, obj, null, atomicReferenceFieldUpdater)) {
                        break;
                    }
                }
            }
        }
        gbl.A5x(thA0G);
        if (GBL.A08(gbl)) {
            return;
        }
        gbl.A0H();
    }

    @Override // X.GBP
    public final boolean A07() {
        return true;
    }

    public GBU(GBL<?> gbl) {
        this.A00 = gbl;
    }
}
