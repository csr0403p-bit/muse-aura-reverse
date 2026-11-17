package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* loaded from: classes4.dex */
public final class AZ0 {
    public static final AFs<AZ0, Object> A06 = AbstractC0871AFr.A00(new C2279BSf(18), C2282BSi.A00(7));
    public long A00;
    public AaC A01;
    public final C00q A02;
    public final C00q A03;
    public final C00r A04;
    public final MutableState A05;

    public final void A00(EnumC1108AYu enumC1108AYu, AaC aaC, int i, int i2) {
        float f;
        float f2 = i2 - i;
        this.A02.AdS(f2);
        float f3 = aaC.A01;
        AaC aaC2 = this.A01;
        if (f3 != aaC2.A01 || aaC.A03 != aaC2.A03) {
            if (enumC1108AYu == EnumC1108AYu.A03) {
                f3 = aaC.A03;
                f = aaC.A00;
            } else {
                f = aaC.A02;
            }
            C00q c00q = this.A03;
            float fAFn = c00q.AFn();
            float f4 = i;
            float f5 = fAFn + f4;
            c00q.AdS(c00q.AFn() + ((f > f5 || (f3 < fAFn && f - f3 > f4)) ? f - f5 : (f3 >= fAFn || f - f3 > f4) ? 0.0f : f3 - fAFn));
            this.A01 = aaC;
        }
        C00q c00q2 = this.A03;
        c00q2.AdS(ATD.A03(c00q2.AFn(), 0.0f, f2));
        this.A04.AdX(i);
    }

    public AZ0(EnumC1108AYu enumC1108AYu, float f) {
        this.A03 = new ParcelableSnapshotMutableFloatState(f);
        this.A02 = new ParcelableSnapshotMutableFloatState(0.0f);
        this.A04 = new ParcelableSnapshotMutableIntState(0);
        this.A01 = AaC.A04;
        this.A00 = Au3.A01;
        this.A05 = AbstractC1798ArH.A06(enumC1108AYu);
    }

    public AZ0() {
        this(EnumC1108AYu.A03, 0.0f);
    }
}
