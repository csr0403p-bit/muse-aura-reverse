package com.facebook.aura.activation.view;

import X.Ab3;
import X.C7384Etj;
import X.C8j3;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class ConfettiBurst {
    public final int durationMs;
    public final List<ConfettiParticle> particles;

    public ConfettiBurst(List<ConfettiParticle> list) {
        C7384Etj.A0Y(list, 0);
        this.particles = list;
        Iterator<ConfettiParticle> it = list.iterator();
        if (!it.hasNext()) {
            throw C8j3.A1D();
        }
        float fMax = it.next().end;
        while (it.hasNext()) {
            fMax = Math.max(fMax, it.next().end);
        }
        this.durationMs = Ab3.A01(80.0f + (fMax * 1000.0f));
    }

    public final int getDurationMs() {
        return this.durationMs;
    }

    public final List<ConfettiParticle> getParticles() {
        return this.particles;
    }
}
