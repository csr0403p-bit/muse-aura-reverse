package X;

/* renamed from: X.Bbs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2465Bbs extends AbstractC2466Bbt {
    public final AbstractC2453Bbg A00;
    public final C1HY A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2466Bbt) {
                C2465Bbs c2465Bbs = (C2465Bbs) ((AbstractC2466Bbt) obj);
                if (!this.A01.equals(c2465Bbs.A01) || !this.A00.equals(c2465Bbs.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A09(this.A00, BV8.A0A(this.A01));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Key{lifecycleOwner=");
        sbA0x.append(this.A01);
        sbA0x.append(", cameraId=");
        return BV8.A0v(this.A00, sbA0x);
    }

    public C2465Bbs(AbstractC2453Bbg abstractC2453Bbg, C1HY c1hy) {
        this.A01 = c1hy;
        this.A00 = abstractC2453Bbg;
    }
}
