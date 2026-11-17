package X;

import android.graphics.Canvas;
import java.util.List;

/* loaded from: classes5.dex */
public final class EtV extends C06G implements InterfaceC7487Exq {
    public final long A00;
    public final C7376EtK A01;
    public final List<InterfaceC7487Exq> A02;
    public final boolean A03;
    public final C3054BtW A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EtV) {
                EtV etV = (EtV) obj;
                if (!C7384Etj.areEqual(this.A04, etV.A04) || this.A00 != etV.A00 || !C7384Etj.areEqual(this.A01, etV.A01) || this.A03 != etV.A03 || !C7384Etj.areEqual(this.A02, etV.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, C0KA.A01((C60R.A00(this.A00, AnonymousClass005.A0E(this.A04)) + AnonymousClass006.A0D(this.A01)) * 31, this.A03));
    }

    public EtV(C7376EtK c7376EtK, C3054BtW c3054BtW, List list, long j, boolean z) {
        this.A04 = c3054BtW;
        this.A00 = j;
        this.A01 = c7376EtK;
        this.A03 = z;
        this.A02 = list;
    }

    @Override // X.InterfaceC7487Exq
    public final void A9H(Canvas canvas, C7377EtL c7377EtL) {
        c7377EtL.A01(this.A04, new EE5(canvas, c7377EtL, this, C60P.A1Y(canvas, c7377EtL) ? 1 : 0));
    }
}
