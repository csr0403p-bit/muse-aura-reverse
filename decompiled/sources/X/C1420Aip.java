package X;

/* renamed from: X.Aip, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1420Aip extends AbstractC1336AhN {
    public final int A00 = 5;
    public final AbstractC1336AhN A01;
    public final AbstractC1336AhN A02;

    public C1420Aip(AbstractC1336AhN abstractC1336AhN, AbstractC1336AhN abstractC1336AhN2) {
        this.A01 = abstractC1336AhN;
        this.A02 = abstractC1336AhN2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1420Aip) {
                C1420Aip c1420Aip = (C1420Aip) obj;
                if (!C7384Etj.areEqual(this.A01, c1420Aip.A01) || !C7384Etj.areEqual(this.A02, c1420Aip.A02) || this.A00 != c1420Aip.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A02, AnonymousClass005.A0E(this.A01)) + this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("CompositeShaderBrush(dstBrush=");
        sbA0x.append(this.A01);
        sbA0x.append(", srcBrush=");
        sbA0x.append(this.A02);
        sbA0x.append(", blendMode=");
        return AnonymousClass007.A0Z(C1422Air.A00(this.A00), sbA0x);
    }
}
