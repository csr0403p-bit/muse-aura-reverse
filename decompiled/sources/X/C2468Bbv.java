package X;

/* renamed from: X.Bbv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2468Bbv {
    public final F0C<C5119DZv> A00;
    public final BWN A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2468Bbv) {
                C2468Bbv c2468Bbv = (C2468Bbv) obj;
                if (this.A01 != c2468Bbv.A01 || !this.A00.equals(c2468Bbv.A00)) {
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
        return C3cJ.A0L(this.A00, ", assetReader=", C3cG.A0f(this.A01, "Initialization(ownershipStrategy="));
    }

    public C2468Bbv(BWN bwn, F0C<C5119DZv> f0c) {
        this.A01 = bwn;
        this.A00 = f0c;
    }
}
