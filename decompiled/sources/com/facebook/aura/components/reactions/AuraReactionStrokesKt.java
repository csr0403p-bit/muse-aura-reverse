package com.facebook.aura.components.reactions;

import X.ADq;
import X.AT3;
import X.ATD;
import X.AWx;
import X.AXN;
import X.AaJ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BNt;
import X.C1710Aot;
import X.C7384Etj;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.InterfaceC1068ATy;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraReactionStrokesKt {
    public static final float DOCK_PULSE_DURATION_MS = 200.0f;
    public static final float DOCK_PULSE_FROM_SCALE = 0.25f;
    public static final List<Float> DockPulseFadeKeyTimes;
    public static final List<Float> DockPulseFadeTrack;
    public static final float DockPulseRadius = 10.0f;
    public static final float DockPulseWidth = 1.6f;
    public static final float RIPPLE_ALPHA = 0.72f;
    public static final float RIPPLE_FROM_SCALE = 0.35f;
    public static final float RippleEdgeWidth = 1.0f;
    public static final List<Float> RippleFadeKeyTimes;
    public static final List<Float> RippleFadeTrack;
    public static final long RippleSize = C8j3.A0V(C8j3.A0P(5.0f), C8j3.A0P(16.0f) << 32);
    public static final float STROKE_FADE_MS = 240.0f;
    public static final float STROKE_SHOW_MS = 60.0f;
    public static final float WATER_RIPPLE_DURATION_MS = 280.0f;

    /* renamed from: drawReactionDockPulse-hykp8_8, reason: not valid java name */
    public static final void m409drawReactionDockPulsehykp8_8(AT3 at3, long j, long j2, float f) {
        C7384Etj.A0Y(at3, 0);
        if (f <= 0.0f || f >= 1.0f) {
            return;
        }
        float fKeyframe = AuraReactionMotionKt.keyframe(DockPulseFadeTrack, DockPulseFadeKeyTimes, f);
        if (fKeyframe > 0.0f) {
            float fA02 = C8j3.A02(1.0f, 0.25f, f);
            at3.A9N(null, AaJ.A00(null, at3.Ah4(DockPulseWidth) * fA02, 0), at3.Ah4(DockPulseRadius) * fA02, fKeyframe, 3, j2, j);
        }
    }

    /* renamed from: drawReactionRing-6-Kx3sI, reason: not valid java name */
    public static final void m410drawReactionRing6Kx3sI(AT3 at3, long j, long j2, float f, float f2, float f3, float f4) {
        C7384Etj.A0Y(at3, 0);
        if (f4 <= 0.0f || f4 >= 1.0f) {
            return;
        }
        float fEaseOut = AuraReactionMotionKt.easeOut(f4);
        at3.A9N(null, AaJ.A00(null, f3, 0), C8j3.A02(f2, f, fEaseOut), C8j3.A02(0.0f, 0.85f, fEaseOut), 3, j2, j);
    }

    /* renamed from: drawReactionWaterRipple-hykp8_8, reason: not valid java name */
    public static final void m411drawReactionWaterRipplehykp8_8(AT3 at3, long j, long j2, float f) {
        C7384Etj.A0Y(at3, 0);
        if (f <= 0.0f || f >= 1.0f) {
            return;
        }
        float fKeyframe = AuraReactionMotionKt.keyframe(RippleFadeTrack, RippleFadeKeyTimes, f) * 0.72f;
        if (fKeyframe > 0.0f) {
            float fA00 = AXN.A00(at3);
            float fA02 = C8j3.A02(1.0f, 0.35f, f);
            long j3 = RippleSize;
            long jA0M = AnonymousClass005.A0M(C8j4.A00(j3, fA00) * fA02, AnonymousClass001.A01(j3, 4294967295L) * fA00 * fA02);
            at3.A9a(null, AaJ.A00(null, at3.Ah4(RippleEdgeWidth) * fA02, 0), fKeyframe, 3, j2, C8j3.A0Q(AnonymousClass001.A00(j) - (AnonymousClass001.A00(jA0M) / 2.0f), AnonymousClass001.A01(j, 4294967295L) - (AnonymousClass001.A01(jA0M, 4294967295L) / 2.0f)), jA0M);
        }
    }

    /* renamed from: drawRevealedPolyline-FTNlnNA, reason: not valid java name */
    public static final void m412drawRevealedPolylineFTNlnNA(AT3 at3, InterfaceC1068ATy interfaceC1068ATy, List<AWx> list, float f, long j, float f2, int i, float f3) {
        boolean zA1a = AnonymousClass002.A1a(at3, interfaceC1068ATy);
        C7384Etj.A0Y(list, 2);
        if (list.size() < 2 || f <= 0.0f || f3 <= 0.0f) {
            return;
        }
        ADq aDqA0C = ATD.A0C(zA1a ? 1 : 0, list.size());
        ArrayList arrayListA0i = AnonymousClass003.A0i(aDqA0C);
        Iterator<Integer> it = aDqA0C.iterator();
        while (it.hasNext()) {
            int iA00 = ((BNt) it).A00() - 1;
            arrayListA0i.add(Float.valueOf((float) Math.hypot(AnonymousClass001.A00(AWx.A09(list, r4)) - AnonymousClass001.A00(AWx.A09(list, iA00)), AnonymousClass001.A01(AWx.A09(list, r4), 4294967295L) - AnonymousClass001.A01(AWx.A09(list, iA00), 4294967295L))));
        }
        Iterator it2 = arrayListA0i.iterator();
        float fA02 = 0.0f;
        while (it2.hasNext()) {
            fA02 += AnonymousClass001.A02(it2.next());
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        float f4 = fA02 * f;
        Path path = ((C1710Aot) interfaceC1068ATy).A03;
        path.reset();
        int i2 = 0;
        path.moveTo(AnonymousClass001.A00(AWx.A09(list, 0)), AnonymousClass001.A01(AWx.A09(list, 0), 4294967295L));
        int size = arrayListA0i.size();
        float f5 = 0.0f;
        while (true) {
            if (i2 >= size) {
                break;
            }
            float fA03 = C8j4.A03(arrayListA0i, i2);
            float f6 = f5 + fA03;
            if (f6 <= f4) {
                i2++;
                path.lineTo(AnonymousClass001.A00(AWx.A09(list, i2)), AnonymousClass001.A01(AWx.A09(list, i2), 4294967295L));
                f5 = f6;
            } else {
                long jM407lerpWko1d7g = AuraReactionMotionKt.m407lerpWko1d7g(AWx.A09(list, i2), AWx.A09(list, i2 + 1), fA03 <= 0.0f ? 0.0f : (f4 - f5) / fA03);
                path.lineTo(AnonymousClass001.A00(jM407lerpWko1d7g), AnonymousClass001.A01(jM407lerpWko1d7g, 4294967295L));
            }
        }
        at3.A9d(null, interfaceC1068ATy, new AaJ(null, f2, 4.0f, i, 0), ATD.A03(f3, 0.0f, 1.0f), 3, j);
    }

    public static final float strokeAlpha(float f, float f2, float f3) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        float f4 = f2 + f3;
        if (f < 60.0f) {
            return f / 60.0f;
        }
        if (f >= f4) {
            return 1.0f - ((f - f4) / 240.0f);
        }
        return 1.0f;
    }

    static {
        Float fA0a = AnonymousClass005.A0a();
        RippleFadeTrack = C8j5.A0Z(fA0a, 0.7f);
        Float fValueOf = Float.valueOf(0.3f);
        Float fA0t = C8j3.A0t();
        RippleFadeKeyTimes = C8j4.A12(fA0a, fValueOf, fA0t);
        DockPulseFadeTrack = C8j5.A0Z(fA0a, 0.8f);
        DockPulseFadeKeyTimes = C8j4.A12(fA0a, Float.valueOf(0.25f), fA0t);
    }
}
