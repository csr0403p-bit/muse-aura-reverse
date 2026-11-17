package X;

/* renamed from: X.ByZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3110ByZ<T> extends C3111Bya<T> {
    public final Object A00;

    @Override // X.C3111Bya, X.HsC
    public final boolean AaC(T t) {
        boolean zAaC;
        C7384Etj.A0Y(t, 0);
        synchronized (this.A00) {
            zAaC = super.AaC(t);
        }
        return zAaC;
    }

    @Override // X.C3111Bya, X.HsC
    public final T A2t() {
        T t;
        synchronized (this.A00) {
            t = (T) super.A2t();
        }
        return t;
    }

    public C3110ByZ(int i) {
        super(i);
        this.A00 = C3cG.A0T();
    }
}
