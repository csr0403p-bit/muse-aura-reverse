package X;

/* renamed from: X.B9i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2188B9i extends AMZ {
    public final AbstractC2185B9e A00;
    public final C1HY A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2188B9i) {
                C2188B9i c2188B9i = (C2188B9i) obj;
                if (!C7384Etj.areEqual(this.A00, c2188B9i.A00) || !C7384Etj.areEqual(this.A01, c2188B9i.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A00) + AnonymousClass006.A0D(this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("OnBackPressedCallbackInfo(callback=");
        sbA0x.append(this.A00);
        sbA0x.append(", owner=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public C2188B9i(AbstractC2185B9e abstractC2185B9e, C1HY c1hy) {
        this.A00 = abstractC2185B9e;
        this.A01 = c1hy;
    }
}
