package X;

/* loaded from: classes6.dex */
public final class F8V {
    public final FBB A00;
    public final FDW A01;
    public final HsM A02;

    public final boolean equals(Object obj) {
        return (obj instanceof F8V) && ((F8V) obj).A02 == this.A02;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public F8V(FBB fbb, FDW fdw, HsM hsM) {
        this.A01 = fdw;
        this.A00 = fbb;
        this.A02 = hsM;
    }
}
