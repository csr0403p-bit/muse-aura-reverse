package X;

/* loaded from: classes5.dex */
public final class ELO {
    public final int A00;
    public final int A01;
    public final String A02;

    public ELO(String str, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ELO) {
                ELO elo = (ELO) obj;
                if (!this.A02.equals(elo.A02) || this.A00 != elo.A00 || this.A01 != elo.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass001.A0G(this.A02) + this.A00) * 31) + this.A01;
    }

    public final String toString() {
        String str = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        StringBuilder sbA0x = C3cI.A0x("SystemIdInfo(workSpecId=", str);
        sbA0x.append(", generation=");
        sbA0x.append(i);
        sbA0x.append(", systemId=");
        sbA0x.append(i2);
        return BV7.A10(sbA0x);
    }
}
