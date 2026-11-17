package X;

/* loaded from: classes4.dex */
public final class AuF implements AzK {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuF) {
                AuF auF = (AuF) obj;
                if (this.A01 != auF.A01 || this.A00 != auF.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AzK
    public final void A4d(C1917Ate c1917Ate) {
        if (c1917Ate.A01 != -1) {
            c1917Ate.A01 = -1;
            c1917Ate.A00 = -1;
        }
        int i = this.A01;
        int iA00 = c1917Ate.A04.A00();
        int iA04 = ATD.A04(i, 0, iA00);
        int iA042 = ATD.A04(this.A00, 0, iA00);
        if (iA04 != iA042) {
            if (iA04 < iA042) {
                c1917Ate.A03(iA04, iA042);
            } else {
                c1917Ate.A03(iA042, iA04);
            }
        }
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return C8j4.A0y("SetComposingRegionCommand(start=", ", end=", this.A01, this.A00);
    }

    public AuF(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
