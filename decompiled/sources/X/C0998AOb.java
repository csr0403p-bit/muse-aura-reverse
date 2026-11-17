package X;

/* renamed from: X.AOb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0998AOb<T> implements AOc<T> {
    public final long A00;
    public final AOc<T> A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0998AOb)) {
            return false;
        }
        C0998AOb c0998AOb = (C0998AOb) obj;
        if (c0998AOb.A00 == this.A00) {
            return C8j3.A1W(c0998AOb.A01, this.A01, false);
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass006.A05(this.A00, AnonymousClass005.A0E(this.A01));
    }

    @Override // X.AOc
    public final <V extends AOd> InterfaceC0999AOh<V> vectorize(C31w<T, V> c31w) {
        return new C1000AOi(this.A01.vectorize(c31w), this.A00);
    }

    public C0998AOb(AOc<T> aOc, long j) {
        this.A01 = aOc;
        this.A00 = j;
    }
}
