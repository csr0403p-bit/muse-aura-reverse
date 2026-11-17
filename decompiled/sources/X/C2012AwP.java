package X;

/* renamed from: X.AwP, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2012AwP {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2012AwP) {
                C2012AwP c2012AwP = (C2012AwP) obj;
                if (this.A03 != c2012AwP.A03 || this.A02 != c2012AwP.A02 || this.A01 != c2012AwP.A01 || this.A00 != c2012AwP.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A03 * 31) + this.A02) * 31) + this.A01) * 31) + this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Change(preStart=");
        sbA0x.append(this.A03);
        sbA0x.append(", preEnd=");
        sbA0x.append(this.A02);
        sbA0x.append(", originalStart=");
        sbA0x.append(this.A01);
        sbA0x.append(", originalEnd=");
        return C8j5.A0X(sbA0x, this.A00);
    }
}
