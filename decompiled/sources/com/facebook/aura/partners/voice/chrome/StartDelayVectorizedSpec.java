package com.facebook.aura.partners.voice.chrome;

import X.AOX;
import X.AOd;
import X.AnonymousClass005;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class StartDelayVectorizedSpec<V extends AOd> implements AOX<V> {
    public final long delayNanos;
    public final AOX<V> spec;

    public StartDelayVectorizedSpec(AOX<V> aox, long j) {
        C7384Etj.A0Y(aox, 0);
        this.spec = aox;
        this.delayNanos = j;
    }

    @Override // X.InterfaceC0999AOh
    public /* bridge */ V getEndVelocity(V v, V v2, V v3) {
        return getVelocityFromNanos(getDurationNanos(v, v2, v3), v, v2, v3);
    }

    @Override // X.InterfaceC0999AOh
    public V getValueFromNanos(long j, V v, V v2, V v3) {
        AnonymousClass005.A11(v, v2, v3, 1);
        long j2 = this.delayNanos;
        return j < j2 ? v : this.spec.getValueFromNanos(j - j2, v, v2, v3);
    }

    @Override // X.InterfaceC0999AOh
    public V getVelocityFromNanos(long j, V v, V v2, V v3) {
        AnonymousClass005.A11(v, v2, v3, 1);
        long j2 = this.delayNanos;
        return j < j2 ? v3 : this.spec.getVelocityFromNanos(j - j2, v, v2, v3);
    }

    @Override // X.InterfaceC0999AOh
    public /* bridge */ boolean isInfinite() {
        return false;
    }

    @Override // X.InterfaceC0999AOh
    public long getDurationNanos(V v, V v2, V v3) {
        AnonymousClass005.A0x(v, v2, v3);
        return this.delayNanos + this.spec.getDurationNanos(v, v2, v3);
    }
}
