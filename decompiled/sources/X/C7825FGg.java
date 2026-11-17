package X;

/* renamed from: X.FGg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7825FGg {
    public final long A00;
    public final FH1 A01;
    public final Integer A02;

    public C7825FGg(FH1 fh1, Integer num, long j) {
        C7384Etj.A0Y(fh1, 2);
        this.A00 = j;
        this.A02 = num;
        this.A01 = fh1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7825FGg) {
                C7825FGg c7825FGg = (C7825FGg) obj;
                if (this.A00 != c7825FGg.A00 || this.A02 != c7825FGg.A02 || !this.A01.equals(c7825FGg.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA01 = C3cI.A01(this.A00);
        int iIntValue = this.A02.intValue();
        return ((iA01 + (iIntValue != 0 ? "ATTACH" : "MOUNT").hashCode() + iIntValue) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        long j = this.A00;
        Integer num = this.A02;
        FH1 fh1 = this.A01;
        StringBuilder sbA0z = C60O.A0z("BinderId(renderUnitId=", j);
        sbA0z.append(", type=");
        sbA0z.append(num.intValue() != 0 ? "ATTACH" : "MOUNT");
        return C3cJ.A0L(fh1, ", key=", sbA0z);
    }
}
