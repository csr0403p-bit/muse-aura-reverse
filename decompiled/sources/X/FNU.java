package X;

/* loaded from: classes6.dex */
public final class FNU {
    public final long A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof FNU) && this.A00 == ((FNU) obj).A00);
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        return FGI.A0J("RenderSummary(createdAt=", this.A00, ")");
    }

    public FNU(long j) {
        this.A00 = j;
    }
}
