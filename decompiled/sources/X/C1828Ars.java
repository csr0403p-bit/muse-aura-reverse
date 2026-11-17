package X;

/* renamed from: X.Ars, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1828Ars implements InterfaceC1829Art {
    public final float A00;
    public final AbstractC1336AhN A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1828Ars) {
                C1828Ars c1828Ars = (C1828Ars) obj;
                if (!C7384Etj.areEqual(this.A01, c1828Ars.A01) || Float.compare(this.A00, c1828Ars.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1829Art
    public final C1EQ AD4() {
        return this.A01;
    }

    @Override // X.InterfaceC1829Art
    public final long ADn() {
        return B6A.A07;
    }

    @Override // X.InterfaceC1829Art
    public final float getAlpha() {
        return this.A00;
    }

    public final int hashCode() {
        return C8j4.A06(AnonymousClass005.A0E(this.A01), this.A00);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("BrushStyle(value=");
        sbA0x.append(this.A01);
        sbA0x.append(", alpha=");
        sbA0x.append(this.A00);
        return AnonymousClass006.A0z(sbA0x);
    }

    public C1828Ars(AbstractC1336AhN abstractC1336AhN, float f) {
        this.A01 = abstractC1336AhN;
        this.A00 = f;
    }
}
