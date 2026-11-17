package com.facebook.aura.status.view;

import X.AXY;
import X.AYU;
import X.AZE;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C1DG;
import X.C2av;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import X.InterfaceC1497Ak4;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.header.api.AvatarFullScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAvatarPanelViewportKt$avatarFullScreenTransform$1$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ float $baseSizePx;
    public final /* synthetic */ Function0<C1DG> $baseTop;
    public final /* synthetic */ AvatarFullScreen $fullScreen;
    public final /* synthetic */ float $normalScale;

    /* renamed from: com.facebook.aura.status.view.HatchAvatarPanelViewportKt$avatarFullScreenTransform$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ float $baseSizePx;
        public final /* synthetic */ Function0<C1DG> $baseTop;
        public final /* synthetic */ AvatarFullScreen $fullScreen;
        public final /* synthetic */ float $normalScale;
        public final /* synthetic */ AZE $placeable;

        /* renamed from: com.facebook.aura.status.view.HatchAvatarPanelViewportKt$avatarFullScreenTransform$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03961 extends AbstractC7559F3s implements G0U<C2av, Unit> {
            public final /* synthetic */ float $baseSizePx;
            public final /* synthetic */ Function0<C1DG> $baseTop;
            public final /* synthetic */ Float $centerXInWindow;
            public final /* synthetic */ AvatarFullScreen $fullScreen;
            public final /* synthetic */ float $normalScale;

            /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[PHI: r3 r5 r7
  0x0037: PHI (r3v3 X.AaC) = (r3v2 X.AaC), (r3v4 X.AaC) binds: [B:21:0x0072, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r5v3 float) = (r5v0 float), (r5v5 float) binds: [B:21:0x0072, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r7v3 float) = (r7v1 float), (r7v6 float) binds: [B:21:0x0072, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke2(X.C2av r9) {
                /*
                    r8 = this;
                    r0 = 0
                    X.C7384Etj.A0Y(r9, r0)
                    com.facebook.aura.header.api.AvatarFullScreen r0 = r8.$fullScreen
                    if (r0 == 0) goto L76
                    float r6 = r0.getProgress()
                Lc:
                    com.facebook.aura.header.api.AvatarFullScreen r0 = r8.$fullScreen
                    if (r0 == 0) goto L6e
                    X.AaC r3 = r0.getDestination()
                    if (r3 == 0) goto L6f
                    float r7 = r3.A02
                    float r0 = r3.A01
                    float r7 = r7 - r0
                    float r1 = r8.$baseSizePx
                    r0 = 1065353216(0x3f800000, float:1.0)
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 >= 0) goto L25
                    r1 = 1065353216(0x3f800000, float:1.0)
                L25:
                    float r7 = r7 / r1
                    java.lang.Float r2 = r8.$centerXInWindow
                    if (r2 == 0) goto L71
                    long r0 = r3.A00()
                    float r5 = X.AnonymousClass003.A03(r0)
                    float r0 = r2.floatValue()
                    float r5 = r5 - r0
                L37:
                    float r4 = r3.A03
                    kotlin.jvm.functions.Function0<X.1DG> r0 = r8.$baseTop
                    java.lang.Object r0 = r0.invoke()
                    X.1DG r0 = (X.C1DG) r0
                    float r0 = r0.A00
                    float r0 = r9.Ah4(r0)
                    float r4 = r4 - r0
                L48:
                    r1 = 1056964608(0x3f000000, float:0.5)
                    r0 = 0
                    long r2 = X.AnonymousClass005.A0J(r1, r0)
                    long r0 = X.C15k.A01
                    r9.Af4(r2)
                    float r0 = r8.$normalScale
                    float r0 = X.AnonymousClass003.A01(r6, r0, r7)
                    r9.AeX(r0)
                    r0 = r9
                    X.AiL r0 = (X.C1390AiL) r0
                    float r0 = r0.A04
                    r9.AeY(r0)
                    float r4 = r4 * r6
                    r9.Af6(r4)
                    float r5 = r5 * r6
                    r9.Af5(r5)
                    return
                L6e:
                    r3 = 0
                L6f:
                    float r7 = r8.$normalScale
                L71:
                    r5 = 0
                    if (r3 != 0) goto L37
                    r4 = 0
                    goto L48
                L76:
                    r6 = 0
                    goto Lc
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.HatchAvatarPanelViewportKt$avatarFullScreenTransform$1$1.AnonymousClass1.C03961.invoke2(X.2av):void");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03961(AvatarFullScreen avatarFullScreen, float f, float f2, Float f3, Function0<C1DG> function0) {
                super(1);
                this.$fullScreen = avatarFullScreen;
                this.$baseSizePx = f;
                this.$normalScale = f2;
                this.$centerXInWindow = f3;
                this.$baseTop = function0;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
                invoke2(c2av);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            InterfaceC1497Ak4 interfaceC1497Ak4A08;
            C7384Etj.A0Y(ayu, 0);
            AvatarFullScreen avatarFullScreen = this.$fullScreen;
            Float fValueOf = null;
            if (avatarFullScreen != null && avatarFullScreen.getActive() && (interfaceC1497Ak4A08 = ayu.A08()) != null) {
                fValueOf = Float.valueOf(AnonymousClass003.A03(interfaceC1497Ak4A08.APr(0L)) + (this.$placeable.A01 / 2.0f));
            }
            ayu.A0C(this.$placeable, new C03961(this.$fullScreen, this.$baseSizePx, this.$normalScale, fValueOf, this.$baseTop), 0, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AvatarFullScreen avatarFullScreen, AZE aze, float f, float f2, Function0<C1DG> function0) {
            super(1);
            this.$fullScreen = avatarFullScreen;
            this.$placeable = aze;
            this.$baseSizePx = f;
            this.$normalScale = f2;
            this.$baseTop = function0;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarPanelViewportKt$avatarFullScreenTransform$1$1(AvatarFullScreen avatarFullScreen, float f, float f2, Function0<C1DG> function0) {
        super(3);
        this.$fullScreen = avatarFullScreen;
        this.$baseSizePx = f;
        this.$normalScale = f2;
        this.$baseTop = function0;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m2224invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m2224invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        AnonymousClass003.A0u(axy, c3tg);
        AZE azeAQW = c3tg.AQW(j);
        return AnonymousClass002.A0X(axy, new AnonymousClass1(this.$fullScreen, azeAQW, this.$baseSizePx, this.$normalScale, this.$baseTop), azeAQW.A01, azeAQW.A00);
    }
}
