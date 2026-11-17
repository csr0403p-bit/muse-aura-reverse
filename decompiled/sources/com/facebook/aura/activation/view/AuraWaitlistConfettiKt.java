package com.facebook.aura.activation.view;

import X.AT2;
import X.AT3;
import X.ATD;
import X.AW9;
import X.AXN;
import X.AaC;
import X.AaI;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.B6A;
import X.BLU;
import X.C16a;
import X.C3cG;
import X.C8j3;
import X.C8j4;
import X.InterfaceC1279AgP;
import androidx.compose.runtime.MutableState;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class AuraWaitlistConfettiKt {
    public static final float CtaPunchScale = 1.045f;
    public static final long CtaSettleDelayMs = 180;
    public static final int DenseParticleCount = 220;
    public static final float EarlyShare = 0.78f;
    public static final float FadeStart = 0.78f;
    public static final float ForegroundScale = 1.16f;
    public static final float ForegroundShare = 0.22f;
    public static final float ForegroundVelocityBoost = 1.1f;
    public static final float LeadInMs = 80.0f;
    public static final float MillisPerSecond = 1000.0f;
    public static final float OffscreenPaddingDp = 48.0f;
    public static final float RadiansToDegrees = 57.29578f;
    public static final long Seed = 1297437509;
    public static final float SquashFloor = 0.12f;
    public static final int StandardParticleCount = 92;
    public static final float SuccessFadeHorizontalInsetDp = 8.0f;
    public static final float SuccessFadeOpacity = 0.34f;
    public static final float SuccessFadeVerticalInsetDp = 120.0f;
    public static final float TargetRampSeconds = 0.82f;
    public static final float TargetReach = 0.46f;
    public static final List<B6A> Palette = Arrays.asList(C8j4.A0Y(4292883611L), C8j4.A0Y(4281324512L), C8j4.A0Y(4294955583L), C8j4.A0Y(4294937131L), C8j4.A0Y(4288372197L), C8j4.A0Y(4292883503L), C8j4.A0Y(4281977180L), C8j4.A0Y(4280577021L));
    public static final List<Float> LaunchColumns = Arrays.asList(Float.valueOf(0.07f), Float.valueOf(0.18f), Float.valueOf(0.36f), Float.valueOf(0.53f), Float.valueOf(0.72f), Float.valueOf(0.88f));
    public static final ConfettiBurst StandardBurst = new ConfettiBurst(createConfettiField(92));
    public static final ConfettiBurst DenseBurst = new ConfettiBurst(createConfettiField(220));

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AuraConfettiDensity.values().length];
            try {
                AnonymousClass005.A0v(AuraConfettiDensity.STANDARD, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(AuraConfettiDensity.DENSE, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConfettiKind.values().length];
            try {
                AnonymousClass005.A0v(ConfettiKind.RECTANGLE, iArr2, 1);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(ConfettiKind.SQUARE, iArr2, 2);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A15(ConfettiKind.CIRCLE, iArr2);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A16(ConfettiKind.RIBBON, iArr2);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final ConfettiKind confettiKind(int i) {
        int i2 = i % 20;
        if (i2 >= 0) {
            if (i2 < 12) {
                return ConfettiKind.RECTANGLE;
            }
            if (i2 < 16) {
                return ConfettiKind.SQUARE;
            }
            if (i2 < 18) {
                return ConfettiKind.CIRCLE;
            }
        }
        return ConfettiKind.RIBBON;
    }

    public static final void drawConfettiLayer(AT3 at3, ConfettiBurst confettiBurst, ConfettiDepth confettiDepth, float f, AaC aaC) {
        float f2 = (f - 80.0f) / 1000.0f;
        if (f2 >= 0.0f) {
            float fAEm = at3.AEm();
            float f3 = confettiDepth == ConfettiDepth.FOREGROUND ? 1.16f : 1.0f;
            float f4 = aaC.A01;
            float f5 = 8.0f * fAEm;
            float f6 = 120.0f * fAEm;
            float f7 = aaC.A03 - f6;
            float f8 = aaC.A02;
            AaC aaCA0f = C8j3.A0f(f4 - f5, f7, f8 + f5, aaC.A00 + f6);
            for (ConfettiParticle confettiParticle : confettiBurst.particles) {
                if (confettiParticle.depth == confettiDepth) {
                    float f9 = f2 - confettiParticle.delay;
                    if (f9 >= 0.0f && f9 <= confettiParticle.lifetime) {
                        float fExp = (1.0f - ((float) Math.exp((-r10) * f9))) / confettiParticle.drag;
                        float fA03 = confettiParticle.normalizedX * AnonymousClass003.A03(at3.AKb());
                        float fSin = (confettiParticle.velocityX * fAEm * fExp) + fA03 + (((float) Math.sin((confettiParticle.swayFrequency * f9) + confettiParticle.swayPhase)) * confettiParticle.swayAmplitude * fAEm);
                        if (confettiParticle.targetsSuccess && !aaC.A05()) {
                            fSin += ((AnonymousClass001.A00(aaC.A00()) + (confettiParticle.targetSide * (((f8 - f4) * 0.46f) + (confettiParticle.targetOffset * fAEm)))) - fA03) * ATD.A02(f9, 0.82f) * confettiParticle.targetStrength;
                        }
                        float f10 = (confettiParticle.startY * fAEm) + (confettiParticle.velocityY * fAEm * f9) + (confettiParticle.gravity * 0.5f * fAEm * f9 * f9);
                        if (f10 < AnonymousClass001.A01(at3.AKb(), 4294967295L) + (48.0f * fAEm)) {
                            float fA02 = ATD.A02((f9 / confettiParticle.lifetime) - 0.78f, 0.22000003f);
                            long jA0L = AnonymousClass005.A0L(fSin, f10);
                            float f11 = 1.0f - fA02;
                            if (confettiDepth == ConfettiDepth.FOREGROUND && !aaC.A05() && aaCA0f.A06(jA0L)) {
                                f11 *= 0.34f;
                            }
                            m133drawParticleJHbHoSQ(at3, confettiParticle, jA0L, (confettiParticle.rotation + (f9 * confettiParticle.spin)) * 57.29578f, f3, confettiParticle.kind == ConfettiKind.CIRCLE ? 1.0f : Math.max(0.12f, Math.abs((float) Math.cos(confettiParticle.tumblePhase + (confettiParticle.tumbleRate * f9)))), f11);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: drawParticle-JHbHoSQ, reason: not valid java name */
    public static final void m133drawParticleJHbHoSQ(AT3 at3, ConfettiParticle confettiParticle, long j, float f, float f2, float f3, float f4) {
        float fA01 = AXN.A01(at3, confettiParticle.width);
        float fA012 = AXN.A01(at3, confettiParticle.height);
        float fA00 = AnonymousClass001.A00(j);
        float fA002 = AnonymousClass004.A00(j);
        InterfaceC1279AgP interfaceC1279AgPAEq = at3.AEq();
        AaI aaI = (AaI) interfaceC1279AgPAEq;
        AT2 at2 = aaI.A01;
        at2.AhL(fA00, fA002);
        try {
            AW9 aw9 = aaI.A02.A02;
            long j2 = aw9.A00;
            aw9.A01.Ac2();
            try {
                at2.Abq(f, 0L);
                float f5 = f3 * f2;
                long jA00 = AW9.A00(aw9);
                try {
                    at2.Ac6(f5, f2, 0L);
                    int iOrdinal = confettiParticle.kind.ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        at3.A9j(null, C16a.A00, f4, 3, confettiParticle.color, AnonymousClass005.A0L((-fA01) / 2.0f, (-fA012) / 2.0f), AnonymousClass005.A0L(fA01, fA012), C8j4.A0J(at3.AEm() * 1.5f));
                    } else if (iOrdinal == 2) {
                        long j3 = confettiParticle.color;
                        at3.A9N(null, C16a.A00, fA01 / 2.0f, f4, 3, j3, 0L);
                    } else {
                        if (iOrdinal != 3) {
                            throw C3cG.A0q();
                        }
                        at3.A9X(null, null, fA01, f4, 1, 3, confettiParticle.color, AnonymousClass005.A0L((-fA01) / 2.0f, (-fA012) / 2.0f), AnonymousClass005.A0L(fA01 / 2.0f, fA012 / 2.0f));
                    }
                } finally {
                    AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
                }
            } finally {
                AW9.A02(aw9, interfaceC1279AgPAEq, j2);
            }
        } finally {
            AT2.A01(at2, fA00, fA002);
        }
    }

    public static final AaC localSuccessFrame(BLU blu, BLU blu2) {
        if (blu == null || blu2 == null) {
            return AaC.A04;
        }
        float f = blu2.A01 - blu.A01;
        int i = blu2.A03;
        int i2 = blu.A03;
        return C8j3.A0f(f, i - i2, blu2.A02 - r1, blu2.A00 - i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.activation.view.AuraWaitlistCelebrationState rememberAuraWaitlistCelebrationState(int r17, boolean r18, com.facebook.aura.activation.view.AuraConfettiDensity r19, X.BFM r20, int r21, int r22) {
        /*
            r3 = r19
            r12 = 4
            r0 = r22 & 4
            if (r0 == 0) goto L9
            com.facebook.aura.activation.view.AuraConfettiDensity r3 = com.facebook.aura.activation.view.AuraConfettiDensity.STANDARD
        L9:
            r14 = r21
            r0 = r14 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            r16 = 0
            r8 = r20
            if (r0 <= r2) goto L1d
            boolean r0 = X.AnonymousClass002.A1U(r8, r3)
            if (r0 != 0) goto L22
        L1d:
            r1 = r14 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r2) goto L23
        L22:
            r0 = 1
        L23:
            java.lang.Object r7 = r8.AaT()
            if (r0 != 0) goto L2d
            java.lang.Object r0 = X.C78N.A00
            if (r7 != r0) goto L35
        L2d:
            com.facebook.aura.activation.view.AuraWaitlistCelebrationState r7 = new com.facebook.aura.activation.view.AuraWaitlistCelebrationState
            r7.<init>(r3)
            X.BBI.A0T(r8, r7)
        L35:
            com.facebook.aura.activation.view.AuraWaitlistCelebrationState r7 = (com.facebook.aura.activation.view.AuraWaitlistCelebrationState) r7
            X.AKH<X.0dx> r1 = X.Am0.A08
            r6 = r8
            X.BBI r6 = (X.BBI) r6
            X.AKQ r0 = X.BBI.A04(r6)
            java.lang.Object r5 = X.AKO.A08(r1, r0)
            X.0dx r5 = (X.C0dx) r5
            X.AKH<android.content.Context> r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A01
            android.content.Context r2 = X.AKO.A00(r0, r6)
            boolean r0 = r8.A65(r2)
            java.lang.Object r1 = r8.AaT()
            if (r0 != 0) goto L5a
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L74
        L5a:
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r1 = "animator_duration_scale"
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = android.provider.Settings.Global.getFloat(r2, r1, r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass002.A1M(r0)
            java.lang.Boolean r1 = X.C3cG.A0P(r0)
            r8.Ai0(r1)
        L74:
            boolean r4 = X.AnonymousClass001.A1X(r1)
            java.lang.Object r3 = r8.AaT()
            java.lang.Object r11 = X.C78N.A00
            r10 = r17
            if (r3 != r11) goto L8a
            androidx.compose.runtime.ParcelableSnapshotMutableIntState r3 = new androidx.compose.runtime.ParcelableSnapshotMutableIntState
            r3.<init>(r10)
            X.BBI.A0O(r6, r3)
        L8a:
            X.00r r3 = (X.C00r) r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r9 = r18
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            r0 = r21 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r15 = 32
            if (r0 <= r15) goto La4
            boolean r0 = r8.A66(r9)
            if (r0 != 0) goto La9
        La4:
            r0 = r21 & 48
            r13 = 0
            if (r0 != r15) goto Laa
        La9:
            r13 = 1
        Laa:
            r0 = r21 & 14
            r0 = r0 ^ 6
            if (r0 <= r12) goto Lb6
            boolean r0 = r8.A63(r10)
            if (r0 != 0) goto Lba
        Lb6:
            r0 = r21 & 6
            if (r0 != r12) goto Lbc
        Lba:
            r16 = 1
        Lbc:
            r13 = r13 | r16
            boolean r0 = X.AnonymousClass003.A1O(r8, r5, r7, r13)
            boolean r0 = X.AnonymousClass001.A1U(r8, r4, r0)
            java.lang.Object r12 = r8.AaT()
            if (r0 != 0) goto Lce
            if (r12 != r11) goto Le1
        Lce:
            r19 = 0
            com.facebook.aura.activation.view.AuraWaitlistConfettiKt$rememberAuraWaitlistCelebrationState$1$1 r12 = new com.facebook.aura.activation.view.AuraWaitlistConfettiKt$rememberAuraWaitlistCelebrationState$1$1
            r18 = r3
            r17 = r4
            r16 = r7
            r15 = r5
            r14 = r10
            r13 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            X.BBI.A0O(r6, r12)
        Le1:
            X.AnonymousClass001.A1A(r8, r12, r2, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.view.AuraWaitlistConfettiKt.rememberAuraWaitlistCelebrationState(int, boolean, com.facebook.aura.activation.view.AuraConfettiDensity, X.BFM, int, int):com.facebook.aura.activation.view.AuraWaitlistCelebrationState");
    }

    public static final /* synthetic */ BLU access$auraWaitlistConfetti$lambda$1(MutableState mutableState) {
        return (BLU) mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg auraWaitlistConfetti(X.BRg r6, com.facebook.aura.activation.view.AuraWaitlistCelebrationState r7, kotlin.jvm.functions.Function0<X.BLU> r8, X.BFM r9, int r10) {
        /*
            X.AnonymousClass005.A0x(r6, r7, r8)
            java.lang.Object r4 = r9.AaT()
            java.lang.Object r3 = X.C78N.A00
            if (r4 != r3) goto L10
            r0 = 0
            androidx.compose.runtime.ParcelableSnapshotMutableState r4 = X.AbstractC1798ArH.A07(r0, r9)
        L10:
            androidx.compose.runtime.MutableState r4 = (androidx.compose.runtime.MutableState) r4
            java.lang.Object r0 = r9.AaT()
            if (r0 != r3) goto L20
            com.facebook.aura.activation.view.AuraWaitlistConfettiKt$auraWaitlistConfetti$1$1 r0 = new com.facebook.aura.activation.view.AuraWaitlistConfettiKt$auraWaitlistConfetti$1$1
            r0.<init>(r4)
            X.BBI.A0T(r9, r0)
        L20:
            X.BRg r5 = X.AnonymousClass005.A0W(r6, r0)
            r0 = r10 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r6 = 0
            r1 = 32
            if (r0 <= r1) goto L33
            boolean r0 = r9.A65(r7)
            if (r0 != 0) goto L38
        L33:
            r0 = r10 & 48
            r2 = 0
            if (r0 != r1) goto L39
        L38:
            r2 = 1
        L39:
            r0 = r10 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r1 = 256(0x100, float:3.59E-43)
            if (r0 <= r1) goto L47
            boolean r0 = r9.A65(r8)
            if (r0 != 0) goto L4b
        L47:
            r0 = r10 & 384(0x180, float:5.38E-43)
            if (r0 != r1) goto L4c
        L4b:
            r6 = 1
        L4c:
            r2 = r2 | r6
            java.lang.Object r0 = r9.AaT()
            if (r2 != 0) goto L55
            if (r0 != r3) goto L5d
        L55:
            com.facebook.aura.activation.view.AuraWaitlistConfettiKt$auraWaitlistConfetti$2$1 r0 = new com.facebook.aura.activation.view.AuraWaitlistConfettiKt$auraWaitlistConfetti$2$1
            r0.<init>(r7, r8, r4)
            X.BBI.A0T(r9, r0)
        L5d:
            X.BRg r0 = X.AEk.A00(r5, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.view.AuraWaitlistConfettiKt.auraWaitlistConfetti(X.BRg, com.facebook.aura.activation.view.AuraWaitlistCelebrationState, kotlin.jvm.functions.Function0, X.BFM, int):X.BRg");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.facebook.aura.activation.view.ConfettiParticle> createConfettiField(int r36) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.view.AuraWaitlistConfettiKt.createConfettiField(int):java.util.List");
    }

    public static final ConfettiBurst getBurst(AuraConfettiDensity auraConfettiDensity) {
        int iOrdinal = auraConfettiDensity.ordinal();
        if (iOrdinal == 0) {
            return StandardBurst;
        }
        if (iOrdinal == 1) {
            return DenseBurst;
        }
        throw C3cG.A0q();
    }
}
