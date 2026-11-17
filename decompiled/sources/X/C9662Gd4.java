package X;

/* renamed from: X.Gd4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9662Gd4 extends C06G {
    public final C9698Ge3 A00;
    public final C9661Gd3 A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9662Gd4) {
                C9662Gd4 c9662Gd4 = (C9662Gd4) obj;
                if (!C7384Etj.areEqual(this.A00, c9662Gd4.A00) || !C7384Etj.areEqual(this.A01, c9662Gd4.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0E(this.A00));
    }

    public final String toString() {
        return C3cJ.A0L(this.A01, ", quoteContext=", C3cG.A0f(this.A00, "QuoteResult(purchaseParams="));
    }

    public C9662Gd4(C9698Ge3 c9698Ge3, C9661Gd3 c9661Gd3) {
        this.A00 = c9698Ge3;
        this.A01 = c9661Gd3;
    }
}
