package X;

/* renamed from: X.73W, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C73W {
    public final C76B A00;
    public final C76B A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C73W) {
                C73W c73w = (C73W) obj;
                if (!C7384Etj.areEqual(this.A01, c73w.A01) || !C7384Etj.areEqual(this.A00, c73w.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0E(this.A01));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ExtractedSizeAndCornerModifiers(sizeAndCornerModifiers=");
        sbA0x.append(this.A01);
        sbA0x.append(", nonSizeOrCornerModifiers=");
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }

    public C73W(C76B c76b, C76B c76b2) {
        this.A01 = c76b;
        this.A00 = c76b2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C73W() {
        C76C c76c = C76B.A00;
        this(c76c, c76c);
    }
}
