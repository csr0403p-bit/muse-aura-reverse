package X;

/* loaded from: classes5.dex */
public final class F3D<Value> extends AbstractC7555F3i {
    public final Value A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof F3D) && C7384Etj.areEqual(this.A00, ((F3D) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        return C3cJ.A0M("Success(value=", this.A00);
    }

    public F3D(Value value) {
        this.A00 = value;
    }
}
