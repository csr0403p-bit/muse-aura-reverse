package com.facebook.aura.navigation;

import X.ATD;
import X.AWx;
import X.AXN;
import X.AaL;
import X.AaM;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFM;
import X.BRg;
import X.C1051ASv;
import X.C1247Afe;
import X.C1299Agk;
import X.C1DG;
import X.C3UT;
import X.C7384Etj;
import X.C78N;
import X.EnumC1820Arj;
import X.F1F;
import X.G0U;
import X.G0V;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class SidePanelOpenGestureKt {
    public static final float SIDE_PANEL_LARGE_WINDOW_MAX_WIDTH = 360.0f;
    public static final float SIDE_PANEL_OPEN_FLING_PANEL_WIDTHS_PER_SECOND = 0.6f;
    public static final float SIDE_PANEL_OPEN_THRESHOLD_FRACTION = 0.45f;
    public static final float SIDE_PANEL_TRAILING_INSET = 80.0f;

    /* renamed from: com.facebook.aura.navigation.SidePanelOpenGestureKt$hatchSidePanelOpenGesture$1, reason: invalid class name */
    public final class AnonymousClass1 implements PointerInputEventHandler {
        public final /* synthetic */ HatchSidePanelContentKey $contentKey;
        public final /* synthetic */ HatchSidePanelController $controller;
        public final /* synthetic */ EnumC1820Arj $layoutDirection;
        public final /* synthetic */ Function0<Unit> $onOpened;
        public final /* synthetic */ float $panelWidthPx;

        /* renamed from: com.facebook.aura.navigation.SidePanelOpenGestureKt$hatchSidePanelOpenGesture$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02441 extends AbstractC7559F3s implements G0U<AWx, Unit> {
            public final /* synthetic */ C1051ASv $dragDistance;
            public final /* synthetic */ F1F $isDraggingPanel;
            public final /* synthetic */ C3UT $velocityTracker;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02441(C1051ASv c1051ASv, F1F f1f, C3UT c3ut) {
                super(1);
                this.$dragDistance = c1051ASv;
                this.$isDraggingPanel = f1f;
                this.$velocityTracker = c3ut;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(AWx aWx) {
                m1468invokek4lQ0M(aWx.A00);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m1468invokek4lQ0M(long j) {
                this.$dragDistance.element = 0.0f;
                this.$isDraggingPanel.element = false;
                this.$velocityTracker.A00.AbS();
            }
        }

        /* renamed from: com.facebook.aura.navigation.SidePanelOpenGestureKt$hatchSidePanelOpenGesture$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ HatchSidePanelController $controller;
            public final /* synthetic */ float $distanceThreshold;
            public final /* synthetic */ C1051ASv $dragDistance;
            public final /* synthetic */ float $flingThreshold;
            public final /* synthetic */ F1F $isDraggingPanel;
            public final /* synthetic */ Function0<Unit> $onOpened;
            public final /* synthetic */ float $towardsOpen;
            public final /* synthetic */ C3UT $velocityTracker;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(F1F f1f, C3UT c3ut, float f, C1051ASv c1051ASv, float f2, float f3, Function0<Unit> function0, HatchSidePanelController hatchSidePanelController) {
                super(0);
                this.$isDraggingPanel = f1f;
                this.$velocityTracker = c3ut;
                this.$towardsOpen = f;
                this.$dragDistance = c1051ASv;
                this.$distanceThreshold = f2;
                this.$flingThreshold = f3;
                this.$onOpened = function0;
                this.$controller = hatchSidePanelController;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                F1F f1f = this.$isDraggingPanel;
                if (f1f.element) {
                    f1f.element = false;
                    float fA03 = AnonymousClass003.A03(this.$velocityTracker.A00()) * this.$towardsOpen;
                    if (this.$dragDistance.element < this.$distanceThreshold && fA03 < this.$flingThreshold) {
                        this.$controller.cancelOpenDrag();
                    } else {
                        this.$onOpened.invoke();
                        this.$controller.commitOpenDrag();
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.facebook.aura.navigation.SidePanelOpenGestureKt$hatchSidePanelOpenGesture$1$3, reason: invalid class name */
        public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ HatchSidePanelController $controller;
            public final /* synthetic */ F1F $isDraggingPanel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(F1F f1f, HatchSidePanelController hatchSidePanelController) {
                super(0);
                this.$isDraggingPanel = f1f;
                this.$controller = hatchSidePanelController;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                F1F f1f = this.$isDraggingPanel;
                if (f1f.element) {
                    f1f.element = false;
                    this.$controller.cancelOpenDrag();
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.facebook.aura.navigation.SidePanelOpenGestureKt$hatchSidePanelOpenGesture$1$4, reason: invalid class name */
        public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<C1299Agk, Float, Unit> {
            public final /* synthetic */ HatchSidePanelContentKey $contentKey;
            public final /* synthetic */ HatchSidePanelController $controller;
            public final /* synthetic */ C1051ASv $dragDistance;
            public final /* synthetic */ F1F $isDraggingPanel;
            public final /* synthetic */ float $panelWidthPx;
            public final /* synthetic */ float $towardsOpen;
            public final /* synthetic */ C3UT $velocityTracker;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(C1051ASv c1051ASv, float f, float f2, C3UT c3ut, F1F f1f, HatchSidePanelController hatchSidePanelController, HatchSidePanelContentKey hatchSidePanelContentKey) {
                super(2);
                this.$dragDistance = c1051ASv;
                this.$towardsOpen = f;
                this.$panelWidthPx = f2;
                this.$velocityTracker = c3ut;
                this.$isDraggingPanel = f1f;
                this.$controller = hatchSidePanelController;
                this.$contentKey = hatchSidePanelContentKey;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(C1299Agk c1299Agk, Float f) {
                invoke(c1299Agk, AnonymousClass001.A02(f));
                return Unit.INSTANCE;
            }

            public final void invoke(C1299Agk c1299Agk, float f) {
                C7384Etj.A0Y(c1299Agk, 0);
                C1051ASv c1051ASv = this.$dragDistance;
                c1051ASv.element = ATD.A03(c1051ASv.element + (f * this.$towardsOpen), 0.0f, this.$panelWidthPx);
                C3UT c3ut = this.$velocityTracker;
                c3ut.A00.A3p(c1299Agk.A0E, c1299Agk.A0A);
                F1F f1f = this.$isDraggingPanel;
                if (!f1f.element && this.$dragDistance.element > 0.0f) {
                    f1f.element = true;
                    this.$controller.beginOpenDrag(this.$contentKey);
                }
                if (this.$isDraggingPanel.element) {
                    c1299Agk.A02();
                    this.$controller.updateDragOffset(this.$dragDistance.element);
                }
            }
        }

        public AnonymousClass1(EnumC1820Arj enumC1820Arj, float f, HatchSidePanelController hatchSidePanelController, Function0<Unit> function0, HatchSidePanelContentKey hatchSidePanelContentKey) {
            this.$layoutDirection = enumC1820Arj;
            this.$panelWidthPx = f;
            this.$controller = hatchSidePanelController;
            this.$onOpened = function0;
            this.$contentKey = hatchSidePanelContentKey;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(X.BRr r24, X.HtJ<? super kotlin.Unit> r25) {
            /*
                r23 = this;
                r3 = r25
                boolean r0 = r3 instanceof com.facebook.aura.navigation.SidePanelOpenGestureKt$hatchSidePanelOpenGesture$1$invoke$1
                r6 = r23
                if (r0 == 0) goto L26
                r5 = r3
                com.facebook.aura.navigation.SidePanelOpenGestureKt$hatchSidePanelOpenGesture$1$invoke$1 r5 = (com.facebook.aura.navigation.SidePanelOpenGestureKt$hatchSidePanelOpenGesture$1$invoke$1) r5
                int r2 = r5.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L26
                int r2 = r2 - r1
                r5.label = r2
            L16:
                java.lang.Object r1 = r5.result
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r5.label
                r7 = 1
                if (r0 == 0) goto L36
                if (r0 != r7) goto L31
                java.lang.Object r10 = r5.L$3
                X.F1F r10 = (X.F1F) r10
                goto L2c
            L26:
                com.facebook.aura.navigation.SidePanelOpenGestureKt$hatchSidePanelOpenGesture$1$invoke$1 r5 = new com.facebook.aura.navigation.SidePanelOpenGestureKt$hatchSidePanelOpenGesture$1$invoke$1
                r5.<init>(r6, r3)
                goto L16
            L2c:
                X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> Lbd
                goto Lb1
            L31:
                java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
                throw r1
            L36:
                X.Hwg.A00(r1)
                X.Arj r1 = r6.$layoutDirection
                X.Arj r0 = X.EnumC1820Arj.A03
                r12 = 1065353216(0x3f800000, float:1.0)
                if (r1 != r0) goto L43
                r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            L43:
                float r15 = r6.$panelWidthPx
                r0 = 1055286886(0x3ee66666, float:0.45)
                float r14 = r15 * r0
                r0 = 1058642330(0x3f19999a, float:0.6)
                float r15 = r15 * r0
                X.3UT r11 = new X.3UT
                r11.<init>()
                X.ASv r13 = new X.ASv
                r13.<init>()
                X.F1F r10 = new X.F1F
                r10.<init>()
                com.facebook.aura.navigation.SidePanelOpenGestureKt$hatchSidePanelOpenGesture$1$1 r3 = new com.facebook.aura.navigation.SidePanelOpenGestureKt$hatchSidePanelOpenGesture$1$1     // Catch: java.lang.Throwable -> Lbd
                r3.<init>(r13, r10, r11)     // Catch: java.lang.Throwable -> Lbd
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r6.$onOpened     // Catch: java.lang.Throwable -> Lbd
                com.facebook.aura.navigation.HatchSidePanelController r2 = r6.$controller     // Catch: java.lang.Throwable -> Lbd
                com.facebook.aura.navigation.SidePanelOpenGestureKt$hatchSidePanelOpenGesture$1$2 r9 = new com.facebook.aura.navigation.SidePanelOpenGestureKt$hatchSidePanelOpenGesture$1$2     // Catch: java.lang.Throwable -> Lbd
                r17 = r2
                r16 = r0
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> Lbd
                com.facebook.aura.navigation.SidePanelOpenGestureKt$hatchSidePanelOpenGesture$1$3 r1 = new com.facebook.aura.navigation.SidePanelOpenGestureKt$hatchSidePanelOpenGesture$1$3     // Catch: java.lang.Throwable -> Lbd
                r1.<init>(r10, r2)     // Catch: java.lang.Throwable -> Lbd
                float r8 = r6.$panelWidthPx     // Catch: java.lang.Throwable -> Lbd
                com.facebook.aura.navigation.HatchSidePanelContentKey r0 = r6.$contentKey     // Catch: java.lang.Throwable -> Lbd
                com.facebook.aura.navigation.SidePanelOpenGestureKt$hatchSidePanelOpenGesture$1$4 r16 = new com.facebook.aura.navigation.SidePanelOpenGestureKt$hatchSidePanelOpenGesture$1$4     // Catch: java.lang.Throwable -> Lbd
                r17 = r13
                r18 = r12
                r19 = r8
                r20 = r11
                r21 = r10
                r22 = r2
                r23 = r0
                r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> Lbd
                r2 = 0
                r5.L$0 = r2     // Catch: java.lang.Throwable -> Lbd
                r5.L$1 = r2     // Catch: java.lang.Throwable -> Lbd
                r5.L$2 = r2     // Catch: java.lang.Throwable -> Lbd
                r5.L$3 = r10     // Catch: java.lang.Throwable -> Lbd
                r5.F$0 = r12     // Catch: java.lang.Throwable -> Lbd
                r5.F$1 = r14     // Catch: java.lang.Throwable -> Lbd
                r5.F$2 = r15     // Catch: java.lang.Throwable -> Lbd
                r5.label = r7     // Catch: java.lang.Throwable -> Lbd
                r17 = 0
                X.3bf r0 = new X.3bf     // Catch: java.lang.Throwable -> Lbd
                r13 = r9
                r14 = r1
                r15 = r3
                r11 = r0
                r12 = r2
                r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> Lbd
                r1 = r24
                java.lang.Object r0 = X.AnonymousClass006.A0l(r1, r5, r0)     // Catch: java.lang.Throwable -> Lbd
                if (r0 != r4) goto Lb1
                return r4
            Lb1:
                boolean r0 = r10.element
                if (r0 == 0) goto Lba
                com.facebook.aura.navigation.HatchSidePanelController r0 = r6.$controller
                r0.cancelOpenDrag()
            Lba:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            Lbd:
                r1 = move-exception
                boolean r0 = r10.element
                if (r0 == 0) goto Lc7
                com.facebook.aura.navigation.HatchSidePanelController r0 = r6.$controller
                r0.cancelOpenDrag()
            Lc7:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.navigation.SidePanelOpenGestureKt.AnonymousClass1.invoke(X.BRr, X.HtJ):java.lang.Object");
        }
    }

    public static final BRg hatchSidePanelOpenGesture(BRg bRg, boolean z, HatchSidePanelController hatchSidePanelController, HatchSidePanelContentKey hatchSidePanelContentKey, float f, EnumC1820Arj enumC1820Arj, Function0<Unit> function0) {
        AnonymousClass005.A11(bRg, hatchSidePanelController, hatchSidePanelContentKey, 0);
        AnonymousClass003.A0z(enumC1820Arj, function0);
        if (!z || hatchSidePanelController.getPresentation().getDocksBesidePages()) {
            return bRg;
        }
        Object[] objArr = {hatchSidePanelController, hatchSidePanelContentKey, Float.valueOf(f), enumC1820Arj};
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(enumC1820Arj, f, hatchSidePanelController, function0, hatchSidePanelContentKey);
        C1247Afe c1247Afe = AaM.A00;
        return bRg.then(new AaL(anonymousClass1, null, null, objArr));
    }

    public static final float rememberSidePanelWidthDp(boolean z, BFM bfm, int i, int i2) {
        boolean z2 = true;
        if ((i2 & 1) != 0) {
            z = false;
        }
        float fAuraLayoutWidth = AuraLayoutSizeKt.auraLayoutWidth(bfm, 0);
        boolean zA62 = bfm.A62(fAuraLayoutWidth);
        if ((((i & 14) ^ 6) <= 4 || !bfm.A66(z)) && (i & 6) != 4) {
            z2 = false;
        }
        boolean z3 = zA62 | z2;
        Object objAaT = bfm.AaT();
        if (z3 || objAaT == C78N.A00) {
            if (!z) {
                fAuraLayoutWidth -= SIDE_PANEL_TRAILING_INSET;
            }
            objAaT = new C1DG(fAuraLayoutWidth);
            bfm.Ai0(objAaT);
        }
        return AuraLayoutSizeKt.m2364cappedOnLargeWindowsi1RSzL4(((C1DG) objAaT).A00, SIDE_PANEL_LARGE_WINDOW_MAX_WIDTH, bfm, 48);
    }

    public static final float rememberSidePanelWidthPx(boolean z, BFM bfm, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        float fRememberSidePanelWidthDp = rememberSidePanelWidthDp(z, bfm, i & 14, 0);
        AXN axnA0Y = AnonymousClass002.A0Y(bfm);
        boolean zA1R = AnonymousClass001.A1R(bfm, axnA0Y, bfm.A62(fRememberSidePanelWidthDp));
        Object objAaT = bfm.AaT();
        if (zA1R || objAaT == C78N.A00) {
            objAaT = Float.valueOf(axnA0Y.Ah4(fRememberSidePanelWidthDp));
            bfm.Ai0(objAaT);
        }
        return AnonymousClass001.A02(objAaT);
    }
}
