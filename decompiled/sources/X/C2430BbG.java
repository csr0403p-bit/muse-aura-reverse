package X;

/* renamed from: X.BbG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2430BbG extends AbstractC2431BbH {
    public final int A00;
    public final C2421Bax A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2431BbH) {
                C2430BbG c2430BbG = (C2430BbG) ((AbstractC2431BbH) obj);
                if (!this.A01.equals(c2430BbG.A01) || this.A00 != c2430BbG.A00) {
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
        StringBuilder sbA0x = C60O.A0x("QualityRatio{quality=");
        sbA0x.append(this.A01);
        sbA0x.append(", aspectRatio=");
        return BV8.A0z(sbA0x, this.A00);
    }

    public C2430BbG(C2421Bax c2421Bax, int i) {
        if (c2421Bax == null) {
            throw BV4.A0a("Null quality");
        }
        this.A01 = c2421Bax;
        this.A00 = i;
    }
}
