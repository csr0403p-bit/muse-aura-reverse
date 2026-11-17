package X;

/* renamed from: X.BbV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2442BbV extends AbstractC2443BbW {
    public final int A00;
    public final C2421Bax A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2443BbW) {
                C2442BbV c2442BbV = (C2442BbV) ((AbstractC2443BbW) obj);
                if (!this.A01.equals(c2442BbV.A01) || this.A00 != c2442BbV.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV8.A0A(this.A01) ^ this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("RuleStrategy{fallbackQuality=");
        sbA0x.append(this.A01);
        sbA0x.append(", fallbackRule=");
        return BV8.A0z(sbA0x, this.A00);
    }

    public C2442BbV(C2421Bax c2421Bax, int i) {
        this.A01 = c2421Bax;
        this.A00 = i;
    }
}
