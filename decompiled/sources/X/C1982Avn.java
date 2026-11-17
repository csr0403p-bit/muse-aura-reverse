package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.Avn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1982Avn {
    public C3TG A00;
    public C3TG A01;
    public AZE A02;
    public AZE A03;
    public final Integer A04;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1982Avn) && this.A04 == ((C1982Avn) obj).A04);
    }

    public final int hashCode() {
        Integer num = this.A04;
        return ((num.intValue() != 0 ? "Clip" : "Visible").hashCode() + num.intValue()) * 31 * 31;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("FlowLayoutOverflowState(type=");
        sbA0x.append(this.A04.intValue() != 0 ? "Clip" : "Visible");
        sbA0x.append(", minLinesToShowCollapse=");
        sbA0x.append(0);
        sbA0x.append(", minCrossAxisSizeToShowCollapse=");
        return C8j5.A0X(sbA0x, 0);
    }

    public C1982Avn(Integer num) {
        this.A04 = num;
    }

    public final void A00(C3Tr c3Tr, C3Tr c3Tr2, long j) {
        long jA07 = AYL.A07(j);
        if (c3Tr != null) {
            c3Tr.AQo(c3Tr.AQq(Constraints.A00(jA07)));
            this.A01 = c3Tr instanceof C3TG ? (C3TG) c3Tr : null;
            this.A03 = null;
        }
        if (c3Tr2 != null) {
            c3Tr2.AQo(c3Tr2.AQq(Constraints.A00(jA07)));
            this.A00 = c3Tr2 instanceof C3TG ? (C3TG) c3Tr2 : null;
            this.A02 = null;
        }
    }
}
