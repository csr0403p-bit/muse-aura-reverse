package X;

import X.AOd;

/* renamed from: X.ASg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1039ASg<V extends AOd> implements AOX<V> {
    public final int A00;
    public final long A01;
    public final long A02;
    public final InterfaceC1044ASn<V> A03;

    private final V A00(long j, V v, V v2, V v3) {
        long j2 = this.A02;
        long j3 = j + j2;
        long j4 = this.A01;
        return j3 > j4 ? (V) getVelocityFromNanos(j4 - j2, v, v2, v3) : v2;
    }

    @Override // X.InterfaceC0999AOh
    public final /* synthetic */ AOd getEndVelocity(AOd aOd, AOd aOd2, AOd aOd3) {
        return getVelocityFromNanos(getDurationNanos(aOd, aOd2, aOd3), aOd, aOd2, aOd3);
    }

    @Override // X.InterfaceC0999AOh
    public final V getValueFromNanos(long j, V v, V v2, V v3) {
        InterfaceC1044ASn<V> interfaceC1044ASn = this.A03;
        long j2 = j + this.A02;
        long jMin = 0;
        if (j2 > 0) {
            long j3 = this.A01;
            jMin = j2 - (Math.min(j2 / j3, this.A00 - 1) * j3);
        }
        return interfaceC1044ASn.getValueFromNanos(jMin, v, v2, A00(j, v, v3, v2));
    }

    @Override // X.InterfaceC0999AOh
    public final V getVelocityFromNanos(long j, V v, V v2, V v3) {
        InterfaceC1044ASn<V> interfaceC1044ASn = this.A03;
        long j2 = j + this.A02;
        long jMin = 0;
        if (j2 > 0) {
            long j3 = this.A01;
            jMin = j2 - (Math.min(j2 / j3, this.A00 - 1) * j3);
        }
        return interfaceC1044ASn.getVelocityFromNanos(jMin, v, v2, A00(j, v, v3, v2));
    }

    @Override // X.InterfaceC0999AOh
    public final long getDurationNanos(V v, V v2, V v3) {
        return (this.A00 * this.A01) - this.A02;
    }

    @Override // X.InterfaceC0999AOh
    public final /* synthetic */ boolean isInfinite() {
        return false;
    }

    public C1039ASg(InterfaceC1044ASn interfaceC1044ASn, int i, long j) {
        this.A00 = i;
        this.A03 = interfaceC1044ASn;
        if (i < 1) {
            throw C60O.A0i("Iterations count can't be less than 1");
        }
        this.A01 = (interfaceC1044ASn.AEl() + interfaceC1044ASn.AEr()) * 1000000;
        this.A02 = j * 1000000;
    }
}
