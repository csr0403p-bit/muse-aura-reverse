package X;

/* renamed from: X.F9i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7665F9i extends AbstractC7689FAi {
    public final HoL A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C7665F9i) && C7384Etj.areEqual(this.A00, ((C7665F9i) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C3cJ.A0M("Response(response=", this.A00);
    }

    public C7665F9i(HoL hoL) {
        this.A00 = hoL;
    }
}
