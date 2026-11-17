package com.facebook.aura.activation.view;

import X.AT1;
import X.AT3;
import X.ATD;
import X.AWA;
import X.AWx;
import X.AXN;
import X.AbstractC10623Hzj;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C16a;
import X.C1DG;
import X.C2Cy;
import X.C3cG;
import X.C7384Etj;
import X.C79;
import X.C8j4;
import X.CUB;
import X.HtJ;
import X.HzR;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class InviteCodeScratchDebrisState {
    public static final int $stable = 8;
    public final HzR<Unit> animationWakeups;
    public final AXN density;
    public long frameTimeNanos;
    public final List<ScratchParticle> particles;

    public InviteCodeScratchDebrisState(AXN axn) {
        C7384Etj.A0Y(axn, 0);
        this.density = axn;
        this.particles = C3cG.A0h();
        this.animationWakeups = AbstractC10623Hzj.A00(C79.A00, -1);
    }

    /* renamed from: draw-4WTKRHQ, reason: not valid java name */
    public final void m146draw4WTKRHQ(AT3 at3, long j) {
        C7384Etj.A0Y(at3, 0);
        for (ScratchParticle scratchParticle : this.particles) {
            float fAgeSeconds = scratchParticle.ageSeconds(this.frameTimeNanos);
            if (fAgeSeconds < 0.0f) {
                fAgeSeconds = 0.0f;
            }
            float fA03 = ATD.A03(fAgeSeconds / 1.05f, 0.0f, 1.0f);
            long j2 = scratchParticle.origin;
            float fA00 = AnonymousClass001.A00(j2);
            long j3 = scratchParticle.velocity;
            float fA002 = fA00 + C8j4.A00(j3, fAgeSeconds);
            float fA01 = AnonymousClass001.A01(j2, 4294967295L) + (AnonymousClass001.A01(j3, 4294967295L) * fAgeSeconds);
            at3.AEm();
            long jA0M = AnonymousClass005.A0M(fA002, fA01 + (((at3.Ah4(InviteCodeScratchDebrisKt.ParticleGravity) * fAgeSeconds) * fAgeSeconds) / 2.0f));
            float f = (scratchParticle.diameterPx * ((fAgeSeconds * 0.3f) + 1.0f)) / 2.0f;
            float f2 = 0.78f;
            if (scratchParticle.isBright) {
                f2 = 0.95f;
            }
            at3.A9N(null, C16a.A00, f, f2 * (1.0f - fA03), 3, j, jA0M);
        }
    }

    /* renamed from: emitReveal-XnVDows, reason: not valid java name */
    public final void m147emitRevealXnVDows(long j, List<AWx> list, long j2, boolean z) {
        C7384Etj.A0Y(list, 1);
        if (z || AWA.A06(j)) {
            return;
        }
        long jNanoTime = System.nanoTime();
        Iterator<AWx> it = list.iterator();
        while (it.hasNext()) {
            long j3 = it.next().A00;
            int i = 0;
            do {
                float fA00 = AnonymousClass001.A00(j3);
                float fA002 = AnonymousClass001.A00(j2);
                float fRandomFloat = fA00 + InviteCodeScratchDebrisKt.randomFloat(new C2Cy((-fA002) * 0.45f, fA002 * 0.45f));
                float fA01 = AnonymousClass001.A01(j3, 4294967295L);
                float fA012 = AnonymousClass001.A01(j2, 4294967295L);
                append(new ScratchParticle(AnonymousClass005.A0M(fRandomFloat, fA01 + InviteCodeScratchDebrisKt.randomFloat(new C2Cy((-fA012) * 0.45f, fA012 * 0.45f))), AnonymousClass005.A0L(randomPx(InviteCodeScratchDebrisKt.CrumbleVelocityXRange), randomPx(InviteCodeScratchDebrisKt.CrumbleVelocityYRange)), jNanoTime, randomPx(InviteCodeScratchDebrisKt.ParticleSizeRange), CUB.A01.A09()), 420);
                i++;
            } while (i < 2);
        }
        float fAh4 = this.density.Ah4(InviteCodeScratchDebrisKt.RevealBurstInset);
        float fA003 = AnonymousClass001.A00(j);
        float f = fAh4;
        if (fAh4 > fA003) {
            f = fA003;
        }
        float fMax = Math.max(1.0f + f, fA003 - fAh4);
        int i2 = 0;
        do {
            float fRandomFloat2 = InviteCodeScratchDebrisKt.randomFloat(new C2Cy(f, fMax));
            float fRandomPx = randomPx(InviteCodeScratchDebrisKt.RevealBurstYRange);
            float fA013 = AnonymousClass001.A01(j, 4294967295L);
            if (fRandomPx > fA013) {
                fRandomPx = fA013;
            }
            append(new ScratchParticle(AnonymousClass005.A0M(fRandomFloat2, fRandomPx), AnonymousClass005.A0M(randomPx(InviteCodeScratchDebrisKt.RevealVelocityXRange), randomPx(InviteCodeScratchDebrisKt.RevealVelocityYRange)), jNanoTime, randomPx(InviteCodeScratchDebrisKt.RevealParticleSizeRange), CUB.A01.A09()), 420);
            i2++;
        } while (i2 < 42);
        this.animationWakeups.AhZ(Unit.INSTANCE);
    }

    /* renamed from: emitScratch-3MmeM6k, reason: not valid java name */
    public final void m148emitScratch3MmeM6k(long j, boolean z) {
        int i = z ? 1 : 7;
        long jNanoTime = System.nanoTime();
        int i2 = 0;
        do {
            append(new ScratchParticle(j, AnonymousClass005.A0J(randomPx(InviteCodeScratchDebrisKt.ScratchVelocityXRange), randomPx(InviteCodeScratchDebrisKt.ScratchVelocityYRange)), jNanoTime, randomPx(InviteCodeScratchDebrisKt.ParticleSizeRange), CUB.A01.A09()), 240);
            i2++;
        } while (i2 < i);
        this.animationWakeups.AhZ(Unit.INSTANCE);
    }

    private final void append(ScratchParticle scratchParticle, int i) {
        while (true) {
            int size = this.particles.size();
            List<ScratchParticle> list = this.particles;
            if (size < i) {
                list.add(scratchParticle);
                return;
            }
            list.remove(0);
        }
    }

    private final float randomPx(AT1<C1DG> at1) {
        return this.density.Ah4(InviteCodeScratchDebrisKt.randomFloat(new C2Cy(((C1DG) at1.AKt()).A00, ((C1DG) at1.AF8()).A00)));
    }

    public final boolean advance(long j) {
        this.frameTimeNanos = j;
        Iterator<ScratchParticle> it = this.particles.iterator();
        while (it.hasNext()) {
            if (it.next().ageSeconds(j) >= 1.05f) {
                it.remove();
            }
        }
        return !this.particles.isEmpty();
    }

    public final Object awaitEmission(HtJ<? super Unit> htJ) {
        return C3cG.A0U(this.animationWakeups.AZg(htJ));
    }
}
