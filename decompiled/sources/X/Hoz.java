package X;

/* loaded from: classes6.dex */
public final class Hoz extends C06G {
    public final String A00;

    public Hoz() {
        this(null);
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof Hoz) && C7384Etj.areEqual(this.A00, ((Hoz) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass006.A0G(this.A00) * 31;
    }

    public final String toString() {
        return FGI.A0c("DcpPurchaseLoggingData(payeeID=", this.A00, ", productSessionID=", null);
    }

    public Hoz(String str) {
        this.A00 = str;
    }
}
