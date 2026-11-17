package X;

import X.AOd;

/* renamed from: X.AOi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1000AOi<V extends AOd> implements InterfaceC0999AOh<V> {
    public final long A00;
    public final InterfaceC0999AOh<V> A01;

    @Override // X.InterfaceC0999AOh
    public final /* synthetic */ AOd getEndVelocity(AOd aOd, AOd aOd2, AOd aOd3) {
        return getVelocityFromNanos(getDurationNanos(aOd, aOd2, aOd3), aOd, aOd2, aOd3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1000AOi)) {
            return false;
        }
        C1000AOi c1000AOi = (C1000AOi) obj;
        if (c1000AOi.A00 == this.A00) {
            return C8j3.A1W(c1000AOi.A01, this.A01, false);
        }
        return false;
    }

    @Override // X.InterfaceC0999AOh
    public final long getDurationNanos(V v, V v2, V v3) {
        return this.A01.getDurationNanos(v, v2, v3) + this.A00;
    }

    @Override // X.InterfaceC0999AOh
    public final V getValueFromNanos(long j, V v, V v2, V v3) {
        long j2 = this.A00;
        return j < j2 ? v : (V) this.A01.getValueFromNanos(j - j2, v, v2, v3);
    }

    @Override // X.InterfaceC0999AOh
    public final V getVelocityFromNanos(long j, V v, V v2, V v3) {
        long j2 = this.A00;
        return j < j2 ? v3 : (V) this.A01.getVelocityFromNanos(j - j2, v, v2, v3);
    }

    public final int hashCode() {
        return AnonymousClass006.A05(this.A00, AnonymousClass005.A0E(this.A01));
    }

    @Override // X.InterfaceC0999AOh
    public final boolean isInfinite() {
        return this.A01.isInfinite();
    }

    public C1000AOi(InterfaceC0999AOh<V> interfaceC0999AOh, long j) {
        this.A01 = interfaceC0999AOh;
        this.A00 = j;
    }
}
