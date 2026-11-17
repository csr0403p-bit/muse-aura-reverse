package X;

/* renamed from: X.ASi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1041ASi<T> implements AOc<T> {
    public final long A00;
    public final InterfaceC1042ASl<T> A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1041ASi)) {
            return false;
        }
        C1041ASi c1041ASi = (C1041ASi) obj;
        return c1041ASi.A01.equals(this.A01) && c1041ASi.A02 == this.A02 && c1041ASi.A00 == this.A00;
    }

    public final int hashCode() {
        int iA0E = AnonymousClass005.A0E(this.A01);
        int iIntValue = this.A02.intValue();
        return AnonymousClass006.A05(this.A00, (iA0E + (iIntValue != 0 ? "Reverse" : "Restart").hashCode() + iIntValue) * 31);
    }

    @Override // X.AOc
    public final <V extends AOd> InterfaceC0999AOh<V> vectorize(C31w<T, V> c31w) {
        return new C1040ASh(this.A01.vectorize(c31w), this.A02, this.A00);
    }

    public C1041ASi(InterfaceC1042ASl interfaceC1042ASl, Integer num, long j) {
        this.A01 = interfaceC1042ASl;
        this.A02 = num;
        this.A00 = j;
        if (interfaceC1042ASl instanceof ASj) {
            ASj aSj = (ASj) interfaceC1042ASl;
            if (aSj.A01 != 0 || aSj.A00 != 0) {
                return;
            }
        } else if (!(interfaceC1042ASl instanceof ASk)) {
            return;
        }
        throw C60O.A0i("Animation to be infinitely repeated cannot have a 0-duration");
    }
}
