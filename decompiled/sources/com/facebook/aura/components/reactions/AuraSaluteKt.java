package com.facebook.aura.components.reactions;

import X.AT3;
import X.AT5;
import X.AaJ;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C1710Aot;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.InterfaceC1068ATy;
import android.graphics.Path;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraSaluteKt {
    public static final float ACK_DELAY_MS = 300.0f;
    public static final float ACK_HOLD_MS = 120.0f;
    public static final float ACK_REVEAL_MS = 130.0f;
    public static final float ACK_UNDER_ALPHA = 0.48f;
    public static final long AckControl;
    public static final long AckFrom;
    public static final float AckOverWidth = 1.25f;
    public static final long AckTo;
    public static final float AckUnderWidth = 3.0f;
    public static final float SALUTE_ENTRANCE_MS = 620.0f;
    public static final float SALUTE_REVEAL_FROM_ALPHA = 0.15f;
    public static final float SALUTE_REVEAL_MS = 140.0f;
    public static final int SALUTE_TOTAL_MS = 800;
    public static final List<Float> SaluteDegrees;
    public static final List<Float> SaluteEntranceKeyTimes;
    public static final List<Float> SaluteRiseDy;
    public static final List<Float> SaluteScales;
    public static final List<Float> SaluteTurnKeyTimes;

    /* renamed from: drawAcknowledgement-Jfou1y0, reason: not valid java name */
    public static final void m414drawAcknowledgementJfou1y0(AT3 at3, InterfaceC1068ATy interfaceC1068ATy, long j, long j2, long j3, float f, long j4, float f2, float f3) {
        long jM407lerpWko1d7g = AuraReactionMotionKt.m407lerpWko1d7g(j, j2, f);
        long jM407lerpWko1d7g2 = AuraReactionMotionKt.m407lerpWko1d7g(jM407lerpWko1d7g, AuraReactionMotionKt.m407lerpWko1d7g(j2, j3, f), f);
        Path path = ((C1710Aot) interfaceC1068ATy).A03;
        path.reset();
        path.moveTo(AnonymousClass001.A00(j), AnonymousClass001.A01(j, 4294967295L));
        path.quadTo(AnonymousClass001.A00(jM407lerpWko1d7g), AnonymousClass001.A01(jM407lerpWko1d7g, 4294967295L), AnonymousClass001.A00(jM407lerpWko1d7g2), AnonymousClass001.A01(jM407lerpWko1d7g2, 4294967295L));
        at3.A9d(null, interfaceC1068ATy, new AaJ(null, f2, 4.0f, 1, 0), f3, 3, j4);
    }

    static {
        Float fA0a = AnonymousClass005.A0a();
        Float fValueOf = Float.valueOf(0.28f);
        Float fValueOf2 = Float.valueOf(0.42f);
        Float fValueOf3 = Float.valueOf(0.72f);
        Float fA0t = C8j3.A0t();
        SaluteEntranceKeyTimes = C8j4.A14(fA0a, fValueOf, fValueOf2, fValueOf3, fA0t);
        Float fValueOf4 = Float.valueOf(16.0f);
        Float fValueOf5 = Float.valueOf(4.0f);
        Float fValueOf6 = Float.valueOf(-2.0f);
        SaluteRiseDy = Arrays.asList(fValueOf4, fValueOf5, fValueOf6, fValueOf6, fA0a);
        Float fValueOf7 = Float.valueOf(0.86f);
        Float fValueOf8 = Float.valueOf(0.98f);
        Float fValueOf9 = Float.valueOf(1.055f);
        SaluteScales = Arrays.asList(fValueOf7, fValueOf8, fValueOf9, fValueOf9, fA0t);
        SaluteTurnKeyTimes = Arrays.asList(fA0a, fValueOf, Float.valueOf(0.4f), Float.valueOf(0.46f), Float.valueOf(0.68f), Float.valueOf(0.84f), fA0t);
        Float fValueOf10 = Float.valueOf(-7.0f);
        SaluteDegrees = Arrays.asList(fA0a, fA0a, fA0a, fValueOf10, fValueOf10, Float.valueOf(1.5f), fA0a);
        AckFrom = (C8j3.A0P(7.0f) << 32) | (C8j3.A0P(-9.0f) & 4294967295L);
        AckControl = (C8j3.A0P(15.0f) << 32) | (C8j3.A0P(-12.0f) & 4294967295L);
        AckTo = (C8j3.A0P(17.0f) << 32) | (C8j3.A0P(-5.0f) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg auraSaluteGlint(X.BRg r7, boolean r8, X.AHD<X.B6A> r9, X.BFM r10, int r11) {
        /*
            X.AnonymousClass003.A0v(r7, r9)
            int r1 = X.C8j3.A09(r11)
            r0 = 800(0x320, float:1.121E-42)
            X.AT5 r6 = com.facebook.aura.components.reactions.AuraReactionMotionKt.rememberBurstProgress(r8, r0, r10, r1)
            java.lang.Object r0 = r10.AaT()
            java.lang.Object r5 = X.C78N.A00
            java.lang.Object r4 = X.C8j4.A0o(r10, r0, r5)
            X.ATy r4 = (X.InterfaceC1068ATy) r4
            boolean r3 = r10.A67(r6)
            r0 = r11 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L2b
            boolean r0 = r10.A65(r9)
            if (r0 != 0) goto L30
        L2b:
            r1 = r11 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r2) goto L31
        L30:
            r0 = 1
        L31:
            boolean r1 = X.AnonymousClass002.A1V(r10, r4, r0, r3)
            java.lang.Object r0 = r10.AaT()
            if (r1 != 0) goto L3d
            if (r0 != r5) goto L45
        L3d:
            com.facebook.aura.components.reactions.AuraSaluteKt$auraSaluteGlint$1$1 r0 = new com.facebook.aura.components.reactions.AuraSaluteKt$auraSaluteGlint$1$1
            r0.<init>(r6, r9, r4)
            X.BBI.A0T(r10, r0)
        L45:
            X.BRg r0 = X.AEk.A00(r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.components.reactions.AuraSaluteKt.auraSaluteGlint(X.BRg, boolean, X.AHD, X.BFM, int):X.BRg");
    }

    public static final BRg auraSaluteGlyph(BRg bRg, boolean z, BFM bfm, int i) {
        AT5<Float, ?> at5RememberBurstProgress = AuraReactionMotionKt.rememberBurstProgress(z, 800, bfm, C8j4.A0D(bRg, i));
        boolean zA67 = bfm.A67(at5RememberBurstProgress);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new AuraSaluteKt$auraSaluteGlyph$1$1(at5RememberBurstProgress);
            BBI.A0T(bfm, objAaT);
        }
        return AnonymousClass001.A0W(bRg, objAaT);
    }
}
