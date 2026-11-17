package X;

/* renamed from: X.Aud, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1940Aud {
    public final C1962AvE A00;
    public final C1962AvE A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1940Aud) {
                C1940Aud c1940Aud = (C1940Aud) obj;
                if (!C7384Etj.areEqual(this.A01, c1940Aud.A01) || !C7384Etj.areEqual(this.A00, c1940Aud.A00) || this.A02 != c1940Aud.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.A00, AnonymousClass005.A0E(this.A01)), this.A02);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Selection(start=");
        sbA0x.append(this.A01);
        sbA0x.append(", end=");
        sbA0x.append(this.A00);
        sbA0x.append(", handlesCrossed=");
        sbA0x.append(this.A02);
        return AnonymousClass006.A0z(sbA0x);
    }

    public C1940Aud(C1962AvE c1962AvE, C1962AvE c1962AvE2, boolean z) {
        this.A01 = c1962AvE;
        this.A00 = c1962AvE2;
        this.A02 = z;
    }
}
