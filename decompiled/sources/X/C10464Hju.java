package X;

/* renamed from: X.Hju, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10464Hju {
    public final Boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C10464Hju) && C7384Etj.areEqual(this.A00, ((C10464Hju) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        return C3cJ.A0M("EdgeToEdgeUpdate(edgeToEdgeEnabled=", this.A00);
    }

    public C10464Hju(Boolean bool) {
        this.A00 = bool;
    }
}
