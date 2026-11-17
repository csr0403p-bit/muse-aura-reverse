package X;

/* renamed from: X.A6d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0856A6d extends A6J {
    @Override // X.A6J
    public final <T> T A00(BNw<T> bNw) {
        C7384Etj.A0Y(bNw, 0);
        return (T) this.A00.get(bNw);
    }

    public C0856A6d(A6J a6j) {
        this.A00.putAll(a6j.A00);
    }

    public final <T> void A01(BNw<T> bNw, T t) {
        this.A00.put(bNw, t);
    }

    public C0856A6d() {
        this(A6K.A00);
    }
}
