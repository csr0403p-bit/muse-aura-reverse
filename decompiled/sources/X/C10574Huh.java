package X;

/* renamed from: X.Huh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10574Huh extends C06G {
    public final int A00;
    public final String A01;

    public C10574Huh(int i, String str) {
        C7384Etj.A0Y(str, 1);
        this.A00 = i;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10574Huh) {
                C10574Huh c10574Huh = (C10574Huh) obj;
                if (this.A00 != c10574Huh.A00 || !C7384Etj.areEqual(this.A01, c10574Huh.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A01, this.A00 * 31);
    }

    public final String toString() {
        return FGI.A09(this.A00, "PurchasePriceCurrencyAmount(amountInHundredths=", ", currency=", this.A01, ")");
    }
}
