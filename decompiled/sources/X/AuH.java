package X;

/* loaded from: classes4.dex */
public final class AuH implements AzK {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuH) {
                AuH auH = (AuH) obj;
                if (this.A01 != auH.A01 || this.A00 != auH.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AzK
    public final void A4d(C1917Ate c1917Ate) {
        int i = this.A01;
        int iA00 = c1917Ate.A04.A00();
        int iA04 = ATD.A04(i, 0, iA00);
        int iA042 = ATD.A04(this.A00, 0, iA00);
        if (iA04 < iA042) {
            c1917Ate.A04(iA04, iA042);
        } else {
            c1917Ate.A04(iA042, iA04);
        }
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return C8j4.A0y("SetSelectionCommand(start=", ", end=", this.A01, this.A00);
    }

    public AuH(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
