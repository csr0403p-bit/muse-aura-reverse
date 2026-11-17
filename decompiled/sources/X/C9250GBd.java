package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.GBd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9250GBd extends GBM implements C27a {
    public final boolean A00;

    @Override // X.GBM
    public final boolean A0N() {
        return this.A00;
    }

    @Override // X.GBM
    public final boolean A0O() {
        return true;
    }

    public C9250GBd(HoC hoC) {
        this._state$volatile = AbstractC9251GBe.A00;
        A0M(hoC);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GBM.A00;
        Object obj = (InterfaceC10488Hlm) atomicReferenceFieldUpdater.get(this);
        GBP gbp = obj instanceof C9254GBh ? (GBP) obj : null;
        boolean z = false;
        while (true) {
            if (gbp == null) {
                break;
            }
            GBM gbmA05 = gbp.A05();
            if (!gbmA05.A0N()) {
                Object obj2 = (InterfaceC10488Hlm) atomicReferenceFieldUpdater.get(gbmA05);
                if (!(obj2 instanceof C9254GBh)) {
                    break;
                } else {
                    gbp = (GBP) obj2;
                }
            } else {
                z = true;
                break;
            }
        }
        this.A00 = z;
    }
}
