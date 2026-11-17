package com.facebook.aura.partners.voice.chrome;

import X.AOX;
import X.AOd;
import X.AOe;
import X.C31w;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class StartDelaySpec<T> implements AOe<T> {
    public final long delayNanos;
    public final AOe<T> spec;

    public StartDelaySpec(AOe<T> aOe, long j) {
        C7384Etj.A0Y(aOe, 0);
        this.spec = aOe;
        this.delayNanos = j;
    }

    @Override // X.AOc
    public <V extends AOd> AOX<V> vectorize(C31w<T, V> c31w) {
        C7384Etj.A0Y(c31w, 0);
        return new StartDelayVectorizedSpec(this.spec.vectorize((C31w) c31w), this.delayNanos);
    }
}
