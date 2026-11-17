package X;

/* renamed from: X.F0t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7541F0t<Error> extends AbstractC7555F3i {
    public final Error A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C7541F0t) && C7384Etj.areEqual(this.A00, ((C7541F0t) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        return C3cJ.A0M("Failure(error=", this.A00);
    }

    public C7541F0t(Error error) {
        this.A00 = error;
    }
}
