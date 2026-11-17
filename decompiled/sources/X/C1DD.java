package X;

/* renamed from: X.1DD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DD implements C0to {
    public final int A00;

    public final boolean equals(Object obj) {
        return (obj instanceof C1DD) && this.A00 == ((C1DD) obj).A00;
    }

    public final int hashCode() {
        return -this.A00;
    }

    public C1DD(int i) {
        this.A00 = i;
        if (i > 0) {
            return;
        }
        AbstractC1061ATk.A00("Provided count should be larger than zero");
        throw F60.createAndThrow();
    }
}
