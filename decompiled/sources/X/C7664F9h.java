package X;

/* renamed from: X.F9h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7664F9h extends AbstractC7689FAi {
    public final Runnable A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C7664F9h) && C7384Etj.areEqual(this.A00, ((C7664F9h) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C3cJ.A0M("Subscription(cancelToken=", this.A00);
    }

    public C7664F9h(Runnable runnable) {
        this.A00 = runnable;
    }
}
