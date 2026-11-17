package X;

/* renamed from: X.Gea, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9722Gea extends C06G implements InterfaceC9761GfF, InterfaceC9763GfH, InterfaceC9762GfG {
    public final SuccessT A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C9722Gea) && C7384Etj.areEqual(this.A00, ((C9722Gea) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        return C3cJ.A0M(BV3.A00(44), this.A00);
    }

    public C9722Gea(SuccessT successt) {
        this.A00 = successt;
    }
}
