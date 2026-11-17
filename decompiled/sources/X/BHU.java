package X;

/* loaded from: classes4.dex */
public final class BHU {
    public final C1809ArT A00;
    public final C76X A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BHU) {
                BHU bhu = (BHU) obj;
                if (!this.A01.equals(bhu.A01) || !C7384Etj.areEqual(this.A00, bhu.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass005.A0E(this.A01) + C60R.A01(this.A00)) * 31 * 31 * 31 * 31 * 31;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TextStyle(color=");
        sbA0x.append(this.A01);
        sbA0x.append(", fontSize=");
        sbA0x.append(this.A00);
        sbA0x.append(", fontWeight=");
        sbA0x.append((Object) null);
        sbA0x.append(", fontStyle=");
        sbA0x.append((Object) null);
        sbA0x.append(", textDecoration=");
        sbA0x.append((Object) null);
        sbA0x.append(", textAlign=");
        sbA0x.append((Object) null);
        sbA0x.append(", fontFamily=");
        return AnonymousClass007.A0Z(null, sbA0x);
    }

    public BHU(C1809ArT c1809ArT, C76X c76x) {
        this.A01 = c76x;
        this.A00 = c1809ArT;
    }
}
