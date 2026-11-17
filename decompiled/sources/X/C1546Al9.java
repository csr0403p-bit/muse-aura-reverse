package X;

/* renamed from: X.Al9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1546Al9 {
    public float A00;
    public long A01;
    public C1DM A02;
    public C1543Al6 A03;
    public EnumC1820Arj A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1546Al9) {
                C1546Al9 c1546Al9 = (C1546Al9) obj;
                if (!C7384Etj.areEqual(this.A02, c1546Al9.A02) || this.A01 != c1546Al9.A01 || this.A04 != c1546Al9.A04 || Float.compare(this.A00, c1546Al9.A00) != 0 || !C7384Etj.areEqual(this.A03, c1546Al9.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A02(AnonymousClass005.A0F(this.A04, C60R.A00(this.A01, AnonymousClass005.A0E(this.A02))), this.A00) + AnonymousClass006.A0D(this.A03);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ShadowKey(shape=");
        sbA0x.append(this.A02);
        sbA0x.append(", size=");
        sbA0x.append((Object) AWA.A04(this.A01));
        sbA0x.append(", layoutDirection=");
        sbA0x.append(this.A04);
        sbA0x.append(", density=");
        sbA0x.append(this.A00);
        sbA0x.append(", shadow=");
        return AnonymousClass007.A0Z(this.A03, sbA0x);
    }
}
