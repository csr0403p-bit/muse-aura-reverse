package X;

/* loaded from: classes4.dex */
public final class ARj {
    public long A00;
    public final AT5<BL4, ARY> A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ARj) {
                ARj aRj = (ARj) obj;
                if (!this.A01.equals(aRj.A01) || this.A00 != aRj.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass006.A05(this.A00, AnonymousClass005.A0E(this.A01));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AnimData(anim=");
        sbA0x.append(this.A01);
        sbA0x.append(", startSize=");
        return AnonymousClass007.A0Z(BL4.A01(this.A00), sbA0x);
    }

    public ARj(AT5<BL4, ARY> at5, long j) {
        this.A01 = at5;
        this.A00 = j;
    }
}
