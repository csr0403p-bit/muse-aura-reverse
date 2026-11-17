package X;

/* loaded from: classes6.dex */
public final class GPH extends C06G implements GPK {
    public final GPL A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GPH) {
                GPH gph = (GPH) obj;
                if (!C7384Etj.areEqual(this.A00, gph.A00) || this.A01 != gph.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.GPK
    public final Integer AL4() {
        return this.A01;
    }

    public final int hashCode() {
        int iA0E = AnonymousClass005.A0E(this.A00);
        Integer num = this.A01;
        return iA0E + BV5.A03(num, GPJ.A01(num));
    }

    public GPH(GPL gpl, Integer num) {
        this.A00 = gpl;
        this.A01 = num;
    }
}
