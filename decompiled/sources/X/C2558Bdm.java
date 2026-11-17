package X;

/* renamed from: X.Bdm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2558Bdm extends BdC {
    public final int A00;
    public final Be3 A01;
    public final AbstractC2440BbT A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof BdC) {
                C2558Bdm c2558Bdm = (C2558Bdm) ((BdC) obj);
                if (!this.A02.equals(c2558Bdm.A02) || !this.A01.equals(c2558Bdm.A01) || this.A00 != c2558Bdm.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A08(this.A01, (this.A02.hashCode() ^ 1000003) * 1000003) ^ this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("MediaSpec{videoSpec=");
        sbA0x.append(this.A02);
        sbA0x.append(", audioSpec=");
        sbA0x.append(this.A01);
        sbA0x.append(", outputFormat=");
        return BV8.A0z(sbA0x, this.A00);
    }

    public C2558Bdm(Be3 be3, AbstractC2440BbT abstractC2440BbT, int i) {
        this.A02 = abstractC2440BbT;
        this.A01 = be3;
        this.A00 = i;
    }
}
