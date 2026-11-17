package com.facebook.aura.conversation.view;

import X.AT3;
import X.AT5;
import X.AT8;
import X.ATD;
import X.AWA;
import X.AbstractC04560zN;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C0zJ;
import X.C16a;
import X.C1710Aot;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.G0U;
import X.G0V;
import X.HxS;
import X.InterfaceC1068ATy;
import android.graphics.Path;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class HatchCredentialsVaultMorphIconKt {
    public static final float AssembleDelay = 0.7f;
    public static final float AssembleDuration = 0.2f;
    public static final float AssemblyEnd = 0.78f;
    public static final float AssemblyStart = 0.12f;
    public static final float CheckStrokeWidth = 2.0f;
    public static final float FullTurn = 6.2831855f;
    public static final float GlyphCanvasSide = 24.0f;
    public static final float GlyphCenterX = 12.0f;
    public static final float GlyphCenterY = 12.0f;
    public static final float HalfTurn = 3.1415927f;
    public static final float KeyCollapseEnd = 0.26f;
    public static final float KeyFadeEnd = 0.29f;
    public static final float KeyFadeStart = 0.18f;
    public static final float KeyMinScale = 0.03f;
    public static final int MorphDurationMs = 3200;
    public static final float OrbitDelay = 0.28f;
    public static final float OrbitDotDiameter = 1.85f;
    public static final float OrbitDuration = 0.39f;
    public static final float OrbitRadius = 2.25f;
    public static final float OrbitYSquash = 0.65f;
    public static final float OutlineMorphEnd = 0.72f;
    public static final float PieceFadeEnd = 0.3f;
    public static final float PieceFadeStart = 0.2f;
    public static final float PulseAmount = 0.018f;
    public static final float SplitDuration = 0.1f;
    public static final float SplitStart = 0.2f;
    public static final float SuccessColorEnd = 0.57f;
    public static final float SuccessColorStart = 0.45f;
    public static final float SplitTerminalAngle = (3.1415927f * 0.7380952f) * 1.35f;
    public static final long CheckStart = (C8j3.A0P(6.97f) << 32) | (C8j3.A0P(12.68f) & 4294967295L);
    public static final long CheckElbow = (C8j3.A0P(10.43f) << 32) | (C8j3.A0P(16.24f) & 4294967295L);
    public static final long CheckEnd = (C8j3.A0P(16.52f) << 32) | (C8j3.A0P(8.07f) & 4294967295L);

    /* renamed from: com.facebook.aura.conversation.view.HatchCredentialsVaultMorphIconKt$HatchCredentialsVaultMorphIcon$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $animateSettle;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $settled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$settled = z;
            this.$animateSettle = z2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCredentialsVaultMorphIconKt.HatchCredentialsVaultMorphIcon(this.$settled, this.$animateSettle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: addGlyph-Rg1IO4c, reason: not valid java name */
    public static final void m583addGlyphRg1IO4c(InterfaceC1068ATy interfaceC1068ATy, float[] fArr, long j, float f) {
        for (int i = 0; i < fArr.length; i += 2) {
            float fA03 = AnonymousClass003.A03(j) + ((fArr[i] - 12.0f) * f);
            float fA032 = C8j5.A03(j) + ((fArr[i + 1] - 12.0f) * f);
            Path path = ((C1710Aot) interfaceC1068ATy).A03;
            if (i == 0) {
                path.moveTo(fA03, fA032);
            } else {
                path.lineTo(fA03, fA032);
            }
        }
        ((C1710Aot) interfaceC1068ATy).A03.close();
    }

    /* renamed from: addMorphedGlyph-A5_d8yw, reason: not valid java name */
    public static final void m584addMorphedGlyphA5_d8yw(InterfaceC1068ATy interfaceC1068ATy, float[] fArr, float[] fArr2, float f, long j, float f2) {
        for (int i = 0; i < fArr.length; i += 2) {
            float fA02 = C8j3.A02(fArr2[i], fArr[i], f);
            int i2 = i + 1;
            float fA022 = C8j3.A02(fArr2[i2], fArr[i2], f);
            float fA03 = AnonymousClass003.A03(j) + ((fA02 - 12.0f) * f2);
            float fA032 = C8j5.A03(j) + ((fA022 - 12.0f) * f2);
            Path path = ((C1710Aot) interfaceC1068ATy).A03;
            if (i == 0) {
                path.moveTo(fA03, fA032);
            } else {
                path.lineTo(fA03, fA032);
            }
        }
        ((C1710Aot) interfaceC1068ATy).A03.close();
    }

    /* renamed from: drawGlyphRings-hLSKwKg, reason: not valid java name */
    public static final void m586drawGlyphRingshLSKwKg(AT3 at3, InterfaceC1068ATy interfaceC1068ATy, long j, float f, float f2, long j2) {
        Path path = ((C1710Aot) interfaceC1068ATy).A03;
        path.rewind();
        path.setFillType(Path.FillType.EVEN_ODD);
        m584addMorphedGlyphA5_d8yw(interfaceC1068ATy, HatchCredentialsVaultMorphGeometry.RingOuter, HatchCredentialsVaultMorphGeometry.CircleOuter, f2, j, f);
        m584addMorphedGlyphA5_d8yw(interfaceC1068ATy, HatchCredentialsVaultMorphGeometry.RingInner, HatchCredentialsVaultMorphGeometry.CircleInner, f2, j, f);
        C8j3.A1H(interfaceC1068ATy, at3, j2);
    }

    /* renamed from: drawKeyGlyph-CLS8Pxk, reason: not valid java name */
    public static final void m587drawKeyGlyphCLS8Pxk(AT3 at3, InterfaceC1068ATy interfaceC1068ATy, long j, float f, long j2, float f2) {
        if (f2 > 0.0f) {
            Path path = ((C1710Aot) interfaceC1068ATy).A03;
            path.rewind();
            path.setFillType(Path.FillType.EVEN_ODD);
            m583addGlyphRg1IO4c(interfaceC1068ATy, HatchCredentialsVaultMorphGeometry.KeyOuter, j, f);
            m583addGlyphRg1IO4c(interfaceC1068ATy, HatchCredentialsVaultMorphGeometry.KeyHole, j, f);
            C8j4.A1K(at3, interfaceC1068ATy, f2, j2);
        }
    }

    /* renamed from: drawVaultMorph-9z6LAg8, reason: not valid java name */
    public static final void m590drawVaultMorph9z6LAg8(AT3 at3, float f, long j, long j2, InterfaceC1068ATy interfaceC1068ATy, InterfaceC1068ATy interfaceC1068ATy2) {
        float fA03 = ATD.A03(f, 0.0f, 1.0f);
        float fA02 = ATD.A02(fA03 - 0.12f, 0.65999997f);
        long jAKb = at3.AKb();
        float fA01 = (AWA.A01(jAKb) / 24.0f) * ((((float) Math.sin(HalfTurn * fA02)) * 0.018f) + 1.0f);
        long jA0L = AnonymousClass005.A0L(AnonymousClass001.A00(jAKb) / 2.0f, AnonymousClass001.A01(jAKb, 4294967295L) / 2.0f);
        long jA03 = HxS.A03(j, j2, smoothStep(0.45f, 0.57f, fA03));
        m586drawGlyphRingshLSKwKg(at3, interfaceC1068ATy, jA0L, fA01, easeInOutCubic(ATD.A02(fA02, 0.72f)), jA03);
        m589drawSplitAssemblyhLSKwKg(at3, interfaceC1068ATy2, jA0L, fA01, fA02, jA03);
    }

    public static final long glyphOrbitPoint(float f, float f2) {
        double d = f;
        return AnonymousClass007.A0A((((float) Math.cos(d)) * f2) + 12.0f, (((float) Math.sin(d)) * f2 * 0.65f) + 12.0f);
    }

    public static final float smoothStep(float f, float f2, float f3) {
        float fA00 = AnonymousClass003.A00((f3 - f) / (f2 - f));
        return fA00 * fA00 * (3.0f - (fA00 * 2.0f));
    }

    public static final void HatchCredentialsVaultMorphIcon(boolean z, boolean z2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1505254715);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AT8.A00(z ? 1.0f : 0.0f);
                bfm.Ai0(objAaT);
            }
            AT5 at5 = (AT5) objAaT;
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            boolean zA1T = AnonymousClass001.A1T(bfm, at5, AnonymousClass003.A1B(iA0n)) | AnonymousClass001.A1O(iA0n);
            Object objAaT2 = bfm.AaT();
            if (zA1T || objAaT2 == obj) {
                objAaT2 = new HatchCredentialsVaultMorphIconKt$HatchCredentialsVaultMorphIcon$1$1(z, at5, z2, null);
                BBI.A0T(bfm, objAaT2);
            }
            AnonymousClass001.A1A(bfm, objAaT2, boolValueOf, boolValueOf2);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).secondaryIcon.enabled;
            long j2 = auraTheme.getColors(bfm, 6).iconSuccess;
            InterfaceC1068ATy interfaceC1068ATy = (InterfaceC1068ATy) C8j4.A0o(bfm, bfm.AaT(), obj);
            InterfaceC1068ATy interfaceC1068ATy2 = (InterfaceC1068ATy) C8j4.A0o(bfm, bfm.AaT(), obj);
            boolean zA1Y = AnonymousClass005.A1Y(bfm, interfaceC1068ATy, interfaceC1068ATy2, bfm.A67(at5) | bfm.A64(j), bfm.A64(j2));
            Object objAaT3 = bfm.AaT();
            if (zA1Y || objAaT3 == obj) {
                objAaT3 = new HatchCredentialsVaultMorphIconKt$HatchCredentialsVaultMorphIcon$2$1(at5, j, j2, interfaceC1068ATy, interfaceC1068ATy2);
                BBI.A0T(bfm, objAaT3);
            }
            C0zJ.A00(bRg2, (G0U) objAaT3, bfm, (iA0n >> 6) & 14);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(z, z2, bRg2, i, i2);
        }
    }

    /* renamed from: drawCheckSegment-gp3nIU4, reason: not valid java name */
    public static final void m585drawCheckSegmentgp3nIU4(AT3 at3, long j, long j2, long j3, float f, long j4, float f2) {
        at3.A9X(null, null, f * 2.0f, f2, 1, 3, j4, m591toCanvasWko1d7g(j, j3, f), m591toCanvasWko1d7g(j2, j3, f));
    }

    /* renamed from: drawSplitAssembly-hLSKwKg, reason: not valid java name */
    public static final void m589drawSplitAssemblyhLSKwKg(AT3 at3, InterfaceC1068ATy interfaceC1068ATy, long j, float f, float f2, long j2) {
        m587drawKeyGlyphCLS8Pxk(at3, interfaceC1068ATy, j, f * Math.max(0.03f, 1.0f - easeInOutCubic(ATD.A03(f2 / 0.26f, 0.0f, 1.0f))), j2, 1.0f - smoothStep(0.18f, 0.29f, f2));
        float fSmoothStep = smoothStep(0.2f, 0.3f, f2);
        float fA02 = ATD.A02(f2 - 0.7f, 0.2f);
        if (fA02 <= 0.0f) {
            float fEaseInOutCubic = easeInOutCubic(ATD.A02(f2 - 0.28f, 0.39f)) * (FullTurn + SplitTerminalAngle);
            float fSmootherStep = smootherStep((f2 - 0.2f) / 0.1f) * 2.25f;
            m588drawOrbitDotsYw5sE(at3, glyphOrbitPoint(fEaseInOutCubic, fSmootherStep), j, f, j2, fSmoothStep);
            m588drawOrbitDotsYw5sE(at3, glyphOrbitPoint(fEaseInOutCubic + HalfTurn, fSmootherStep), j, f, j2, fSmoothStep);
            return;
        }
        float fEaseInOutCubic2 = easeInOutCubic(fA02);
        float f3 = SplitTerminalAngle;
        long jGlyphOrbitPoint = glyphOrbitPoint(f3, 2.25f);
        long jGlyphOrbitPoint2 = glyphOrbitPoint(f3 + HalfTurn, 2.25f);
        long jA00 = AbstractC04560zN.A00(jGlyphOrbitPoint, CheckStart, fEaseInOutCubic2);
        long j3 = CheckElbow;
        m585drawCheckSegmentgp3nIU4(at3, jA00, AbstractC04560zN.A00(jGlyphOrbitPoint, j3, fEaseInOutCubic2), j, f, j2, fSmoothStep);
        m585drawCheckSegmentgp3nIU4(at3, AbstractC04560zN.A00(jGlyphOrbitPoint2, j3, fEaseInOutCubic2), AbstractC04560zN.A00(jGlyphOrbitPoint2, CheckEnd, fEaseInOutCubic2), j, f, j2, fSmoothStep);
    }

    public static final float easeInOutCubic(float f) {
        return C8j5.A02((f > 0.5f ? 1 : (f == 0.5f ? 0 : -1)), f);
    }

    /* renamed from: drawOrbitDot-sYw5s-E, reason: not valid java name */
    public static final void m588drawOrbitDotsYw5sE(AT3 at3, long j, long j2, float f, long j3, float f2) {
        long jM591toCanvasWko1d7g = m591toCanvasWko1d7g(j, j2, f);
        at3.A9N(null, C16a.A00, f * 0.925f, f2, 3, j3, jM591toCanvasWko1d7g);
    }

    public static final float smootherStep(float f) {
        float fA00 = AnonymousClass003.A00(f);
        return fA00 * fA00 * fA00 * ((fA00 * ((6.0f * fA00) - 15.0f)) + 10.0f);
    }

    /* renamed from: toCanvas-Wko1d7g, reason: not valid java name */
    public static final long m591toCanvasWko1d7g(long j, long j2, float f) {
        return AnonymousClass005.A0L(AnonymousClass001.A00(j2) + ((AnonymousClass001.A00(j) - 12.0f) * f), AnonymousClass001.A01(j2, 4294967295L) + ((AnonymousClass001.A01(j, 4294967295L) - 12.0f) * f));
    }
}
