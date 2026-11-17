package X;

/* loaded from: classes6.dex */
public final class GtO {
    public static final GtO A05 = new GtO();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C10307GuI A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                GtO gtO = (GtO) obj;
                if (this.A01 != gtO.A01 || this.A00 != gtO.A00 || this.A03 != gtO.A03 || this.A02 != gtO.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A01 * 31) + this.A00) * 31) + this.A03) * 31) + this.A02;
    }

    public GtO() {
        this.A04 = C10263GtN.A03;
        this.A01 = -1;
        this.A00 = -1;
        this.A03 = -1;
        this.A02 = -1;
    }

    public final String toString() {
        StringBuilder sbA0t = AbstractC7609F5w.A0t();
        int i = this.A01;
        sbA0t.append(i != -1 ? new C10263GtN(this.A04, i, this.A00) : C10263GtN.A05);
        sbA0t.append('=');
        sbA0t.append(i != -1 ? new C10263GtN(this.A04, this.A03, this.A02) : C10263GtN.A05);
        return Gt5.A01(sbA0t);
    }

    public GtO(C10307GuI c10307GuI, int i, int i2, int i3, int i4) {
        this.A04 = c10307GuI;
        if (i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0) {
            this.A01 = i;
            this.A00 = i2;
            this.A03 = i3;
            this.A02 = i4;
            return;
        }
        throw C60O.A0i("Attribute range positions must be non-negative");
    }
}
