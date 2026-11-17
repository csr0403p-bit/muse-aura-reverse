package X;

/* renamed from: X.ArN, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1804ArN {
    public static final C1804ArN A03 = new C1804ArN(17, -1.0f, 0);
    public final float A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1804ArN) {
                C1804ArN c1804ArN = (C1804ArN) obj;
                if (Float.compare(this.A00, c1804ArN.A00) != 0 || this.A02 != c1804ArN.A02 || this.A01 != c1804ArN.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((C8j4.A04(this.A00) + this.A02) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("LineHeightStyle(alignment=");
        sbA0x.append((Object) C1806ArP.A00(this.A00));
        sbA0x.append(", trim=");
        int i = this.A02;
        sbA0x.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sbA0x.append(",mode=");
        int i2 = this.A01;
        return AnonymousClass007.A0Z(i2 == 0 ? "LineHeightStyle.Mode.Fixed" : i2 == 1 ? "LineHeightStyle.Mode.Minimum" : i2 == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid", sbA0x);
    }

    public C1804ArN(int i, float f, int i2) {
        this.A00 = f;
        this.A02 = i;
        this.A01 = i2;
    }
}
