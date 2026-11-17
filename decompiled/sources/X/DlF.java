package X;

/* loaded from: classes5.dex */
public final class DlF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                DlF dlF = (DlF) obj;
                if (this.A04 != dlF.A04 || this.A03 != dlF.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((int) this.A04) * 31) + ((int) this.A03);
    }

    public final String toString() {
        String str = String.format("<S t=\"%d\" d=\"%d\"/>", BV4.A1Y(Long.valueOf(this.A04), this.A03));
        return this.A05 ? FGI.A0M(str, " (p) ") : str;
    }

    public DlF(int i, int i2, int i3, long j, long j2, boolean z) {
        this.A04 = j;
        this.A03 = j2;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = z;
        this.A00 = i3;
    }
}
