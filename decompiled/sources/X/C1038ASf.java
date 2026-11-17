package X;

/* renamed from: X.ASf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1038ASf<T> implements AOe<T> {
    public final int A00;
    public final long A01;
    public final InterfaceC1042ASl<T> A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1038ASf)) {
            return false;
        }
        C1038ASf c1038ASf = (C1038ASf) obj;
        return c1038ASf.A00 == this.A00 && c1038ASf.A02.equals(this.A02) && c1038ASf.A01 == this.A01;
    }

    public final int hashCode() {
        return AnonymousClass006.A05(this.A01, (AnonymousClass005.A0F(this.A02, this.A00 * 31) - 1532807697) * 31);
    }

    @Override // X.AOc
    public final <V extends AOd> AOX<V> vectorize(C31w<T, V> c31w) {
        return new C1039ASg(this.A02.vectorize(c31w), this.A00, this.A01);
    }

    public C1038ASf(InterfaceC1042ASl interfaceC1042ASl, int i, long j) {
        this.A00 = i;
        this.A02 = interfaceC1042ASl;
        this.A01 = j;
    }
}
