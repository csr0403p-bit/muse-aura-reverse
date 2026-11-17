package X;

/* renamed from: X.AvE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1962AvE {
    public final int A00;
    public final long A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1962AvE) {
                C1962AvE c1962AvE = (C1962AvE) obj;
                if (this.A02 != c1962AvE.A02 || this.A00 != c1962AvE.A00 || this.A01 != c1962AvE.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iIntValue = this.A02.intValue();
        return AnonymousClass006.A05(this.A01, ((((1 != iIntValue ? "Ltr" : "Rtl").hashCode() + iIntValue) * 31) + this.A00) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AnchorInfo(direction=");
        sbA0x.append(AbstractC2052AxP.A00(this.A02));
        sbA0x.append(", offset=");
        sbA0x.append(this.A00);
        sbA0x.append(", selectableId=");
        sbA0x.append(this.A01);
        return AnonymousClass006.A0z(sbA0x);
    }

    public C1962AvE(Integer num, int i, long j) {
        this.A02 = num;
        this.A00 = i;
        this.A01 = j;
    }
}
