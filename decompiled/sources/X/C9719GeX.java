package X;

/* renamed from: X.GeX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9719GeX extends C06G implements InterfaceC9761GfF, InterfaceC9763GfH, InterfaceC9762GfG {
    public final Hzd A00;

    public C9719GeX(Hzd hzd) {
        C7384Etj.A0Y(hzd, 0);
        this.A00 = hzd;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C9719GeX) && C7384Etj.areEqual(this.A00, ((C9719GeX) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C3cJ.A0M("Fail(nativeError=", this.A00);
    }
}
