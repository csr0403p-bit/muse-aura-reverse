package X;

import android.graphics.Canvas;
import java.util.List;

/* loaded from: classes5.dex */
public final class EtQ extends C06G implements InterfaceC7487Exq {
    public final float A00;
    public final int A01;
    public final long A02;
    public final C7376EtK A03;
    public final List<InterfaceC7487Exq> A04;
    public final C3054BtW A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EtQ) {
                EtQ etQ = (EtQ) obj;
                if (!C7384Etj.areEqual(this.A05, etQ.A05) || this.A02 != etQ.A02 || !C7384Etj.areEqual(this.A03, etQ.A03) || Float.compare(this.A00, etQ.A00) != 0 || this.A01 != etQ.A01 || !C7384Etj.areEqual(this.A04, etQ.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A04, (AnonymousClass005.A02((C60R.A00(this.A02, AnonymousClass005.A0E(this.A05)) + AnonymousClass006.A0D(this.A03)) * 31, this.A00) + this.A01) * 31);
    }

    public EtQ(C7376EtK c7376EtK, C3054BtW c3054BtW, List list, float f, int i, long j) {
        this.A05 = c3054BtW;
        this.A02 = j;
        this.A03 = c7376EtK;
        this.A00 = f;
        this.A01 = i;
        this.A04 = list;
    }

    @Override // X.InterfaceC7487Exq
    public final void A9H(Canvas canvas, C7377EtL c7377EtL) {
        AnonymousClass003.A0u(canvas, c7377EtL);
        c7377EtL.A01(this.A05, new EE5(canvas, c7377EtL, this, 2));
    }
}
