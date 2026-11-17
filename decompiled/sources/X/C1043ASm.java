package X;

import X.AOd;

/* renamed from: X.ASm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1043ASm<V extends AOd> implements InterfaceC1044ASn<V> {
    @Override // X.InterfaceC0999AOh
    public final /* synthetic */ AOd getEndVelocity(AOd aOd, AOd aOd2, AOd aOd3) {
        return getVelocityFromNanos(getDurationNanos(aOd, aOd2, aOd3), aOd, aOd2, aOd3);
    }

    @Override // X.InterfaceC1044ASn
    public final int AEl() {
        return 0;
    }

    @Override // X.InterfaceC1044ASn
    public final int AEr() {
        return 0;
    }

    @Override // X.InterfaceC0999AOh
    public final V getValueFromNanos(long j, V v, V v2, V v3) {
        return j < 0 ? v : v2;
    }

    @Override // X.InterfaceC0999AOh
    public final /* synthetic */ boolean isInfinite() {
        return false;
    }

    @Override // X.InterfaceC0999AOh
    public final /* synthetic */ long getDurationNanos(AOd aOd, AOd aOd2, AOd aOd3) {
        return 0L;
    }

    @Override // X.InterfaceC0999AOh
    public final V getVelocityFromNanos(long j, V v, V v2, V v3) {
        return v3;
    }
}
