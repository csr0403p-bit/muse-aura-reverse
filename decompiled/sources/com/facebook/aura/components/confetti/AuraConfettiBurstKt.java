package com.facebook.aura.components.confetti;

import X.AHD;
import X.AT1;
import X.AT2;
import X.AT3;
import X.ATD;
import X.AW9;
import X.AXN;
import X.AaI;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.B6A;
import X.C16a;
import X.C1DG;
import X.C60O;
import X.C7384Etj;
import X.C8j3;
import X.C8j5;
import X.CUB;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraConfettiBurstKt {
    public static final int BURST_DURATION_MS = 700;
    public static final float FADE_IN_FRACTION = 0.12f;
    public static final float GRAVITY_DRIFT = 5.0f;
    public static final float MAX_SPIN_RAD = 6.0f;
    public static final float MIN_TRAVEL_FRACTION = 0.65f;
    public static final float PARTICLE_CORNER_RADIUS = 1.0f;
    public static final float RAD_TO_DEG = 57.29578f;
    public static final float TWO_PI = 6.2831855f;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* renamed from: auraConfettiBurst-iHT-50w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg m372auraConfettiBurstiHT50w(X.BRg r18, boolean r19, X.AHD<X.B6A> r20, int r21, float r22, X.AT1<X.C1DG> r23, X.AT1<X.C1DG> r24, X.BFM r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.components.confetti.AuraConfettiBurstKt.m372auraConfettiBurstiHT50w(X.BRg, boolean, X.AHD, int, float, X.AT1, X.AT1, X.BFM, int, int):X.BRg");
    }

    public static final List<ConfettiParticle> createConfetti(AXN axn, int i, float f, AHD<B6A> ahd, AT1<C1DG> at1, AT1<C1DG> at12) {
        ArrayList arrayListA11 = C60O.A11(i);
        for (int i2 = 0; i2 < i; i2++) {
            float f2 = ((C1DG) at1.AKt()).A00;
            float f3 = ((C1DG) at1.AF8()).A00 - f2;
            CUB cub = CUB.A01;
            float fA02 = f2 + (f3 * cub.A02());
            C7384Etj.A0Y(axn, 1);
            float fA01 = AXN.A01(axn, fA02);
            float f4 = ((C1DG) at12.AKt()).A00;
            arrayListA11.add(new ConfettiParticle(cub.A02() * 6.2831855f, ((cub.A02() * 0.35000002f) + 0.65f) * f, C8j5.A0G(ahd, i2), AnonymousClass005.A0J(fA01, AXN.A01(axn, f4 + ((((C1DG) at12.AF8()).A00 - f4) * cub.A02()))), cub.A02() * 6.2831855f, 6.0f * ((cub.A02() * 2.0f) - 1.0f)));
        }
        return arrayListA11;
    }

    public static final void drawConfetti(AT3 at3, List<ConfettiParticle> list, float f) {
        float fPow = 1.0f - ((float) Math.pow(1.0f - f, 3.0d));
        float fA03 = f < 0.12f ? f / 0.12f : ATD.A03(1.0f - ((f - 0.12f) / 0.88f), 0.0f, 1.0f);
        float fAh4 = at3.Ah4(GRAVITY_DRIFT) * f * f;
        long jA0P = C8j3.A0P(at3.Ah4(PARTICLE_CORNER_RADIUS));
        long j = (jA0P << 32) | (jA0P & 4294967295L);
        long jADU = at3.ADU();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ConfettiParticle confettiParticle = list.get(i);
            float f2 = confettiParticle.maxDistance * fPow;
            float fA00 = AnonymousClass001.A00(jADU);
            double d = confettiParticle.angle;
            float fCos = fA00 + (((float) Math.cos(d)) * f2);
            float fA01 = AnonymousClass001.A01(jADU, 4294967295L) + (((float) Math.sin(d)) * f2) + fAh4;
            AaI aaI = (AaI) at3.AEq();
            AT2 at2 = aaI.A01;
            at2.AhL(fCos, fA01);
            try {
                float f3 = (confettiParticle.rotation + (confettiParticle.spin * f)) * 57.29578f;
                long jA00 = AW9.A00(aaI.A02.A02);
                try {
                    at2.Abq(f3, 0L);
                    at3.A9j(null, C16a.A00, fA03, 3, confettiParticle.color, AnonymousClass005.A0M((-AnonymousClass001.A00(confettiParticle.size)) / 2.0f, (-AnonymousClass001.A01(confettiParticle.size, 4294967295L)) / 2.0f), confettiParticle.size, j);
                    AT2.A01(at2, fCos, fA01);
                } finally {
                }
            } catch (Throwable th) {
                AT2.A01(at2, fCos, fA01);
                throw th;
            }
        }
    }
}
