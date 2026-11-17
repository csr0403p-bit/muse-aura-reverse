package X;

/* loaded from: classes6.dex */
public final class Ho5 extends C2zT {
    public final Throwable A00;

    public final boolean equals(Object obj) {
        return (obj instanceof Ho5) && C7384Etj.areEqual(this.A00, ((Ho5) obj).A00);
    }

    public final int hashCode() {
        return C60R.A01(this.A00);
    }

    @Override // X.C2zT
    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("Closed("));
    }

    public Ho5(Throwable th) {
        this.A00 = th;
    }
}
