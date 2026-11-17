package com.facebook.aura.vds.compose.swipeable;

import X.A6J;
import X.AKO;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJt;
import X.BMW;
import X.BRg;
import X.C1BO;
import X.C2CK;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.CFK;
import X.F0C;
import X.G0U;
import X.G0V;
import X.InterfaceC08439ui;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AuraSwipeableCardKt {
    public static final int SWIPE_HAPTIC = AuraHaptics.GESTURE_THRESHOLD;
    public static final float SwipeableAnchorWidth = 112.0f;
    public static final float SwipeableOrientationThreshold = 5.0f;
    public static final float SwipeableStaticThresholdOffset = 64.0f;
    public static final float SwipeableVelocityThreshold = 225.0f;

    /* renamed from: com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$AuraSwipeableCard$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $applyRoundedCorners;
        public final /* synthetic */ AuraSwipeableCardBackgroundProvider $backgroundProvider;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ Function0<Unit> $endToStartSwipeAction;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onSwipeStateChanged;
        public final /* synthetic */ AuraSwipeablePeek $peek;
        public final /* synthetic */ Function0<Unit> $startToEndSwipeAction;
        public final /* synthetic */ boolean $supportSingleOrientation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, boolean z, boolean z2, AuraSwipeableCardBackgroundProvider auraSwipeableCardBackgroundProvider, AuraSwipeablePeek auraSwipeablePeek, boolean z3, G0U<? super Boolean, Unit> g0u, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$endToStartSwipeAction = function0;
            this.$startToEndSwipeAction = function02;
            this.$modifier = bRg;
            this.$enabled = z;
            this.$applyRoundedCorners = z2;
            this.$backgroundProvider = auraSwipeableCardBackgroundProvider;
            this.$peek = auraSwipeablePeek;
            this.$supportSingleOrientation = z3;
            this.$onSwipeStateChanged = g0u;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSwipeableCardKt.AuraSwipeableCard(this.$endToStartSwipeAction, this.$startToEndSwipeAction, this.$modifier, this.$enabled, this.$applyRoundedCorners, this.$backgroundProvider, this.$peek, this.$supportSingleOrientation, this.$onSwipeStateChanged, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$PeekHint$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> $anchoredDraggableState;
        public final /* synthetic */ AuraSwipeablePeek $peek;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraSwipeablePeek auraSwipeablePeek, AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> anchoredDraggableState, int i) {
            super(2);
            this.$peek = auraSwipeablePeek;
            this.$anchoredDraggableState = anchoredDraggableState;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSwipeableCardKt.PeekHint(this.$peek, this.$anchoredDraggableState, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$PeekHint$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> $anchoredDraggableState;
        public final /* synthetic */ AuraSwipeablePeek $peek;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AuraSwipeablePeek auraSwipeablePeek, AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> anchoredDraggableState, int i) {
            super(2);
            this.$peek = auraSwipeablePeek;
            this.$anchoredDraggableState = anchoredDraggableState;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSwipeableCardKt.PeekHint(this.$peek, this.$anchoredDraggableState, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void PeekHint(AuraSwipeablePeek auraSwipeablePeek, AnchoredDraggableState<AuraSwipeableMenuStateDragAnchors> anchoredDraggableState, BFM bfm, int i) {
        BBb bBbAAc;
        Object anonymousClass3;
        final ComponentActivity componentActivity;
        C7384Etj.A0Y(anchoredDraggableState, 1);
        bfm.AgG(1708418660);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(auraSwipeablePeek, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, anchoredDraggableState);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            BBI bbi = (BBI) bfm;
            Object objA07 = AKO.A07(AndroidCompositionLocals_androidKt.A01, bbi);
            final Function0 function0 = null;
            if (!(objA07 instanceof FragmentActivity) || (componentActivity = (ComponentActivity) objA07) == null) {
                CFK.A04("AuraSwipeableCard", "Activity is null, cannot show peek hint");
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(auraSwipeablePeek, anchoredDraggableState, i);
                    C3cG.A1D(bBbAAc, anonymousClass3);
                }
                return;
            }
            BMW bmw = new BMW(new Function0<BJt>() { // from class: com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$PeekHint$$inlined$viewModels$default$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final BJt invoke() {
                    return componentActivity.getViewModelStore();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ BJt invoke() {
                    return componentActivity.getViewModelStore();
                }
            }, new Function0<InterfaceC08439ui>() { // from class: com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$PeekHint$$inlined$viewModels$default$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final InterfaceC08439ui invoke() {
                    return componentActivity.getDefaultViewModelProviderFactory();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ InterfaceC08439ui invoke() {
                    return componentActivity.getDefaultViewModelProviderFactory();
                }
            }, new Function0<A6J>() { // from class: com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$PeekHint$$inlined$viewModels$default$3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final A6J invoke() {
                    A6J a6j;
                    Function0 function02 = function0;
                    return (function02 == null || (a6j = (A6J) function02.invoke()) == null) ? componentActivity.getDefaultViewModelCreationExtras() : a6j;
                }
            }, C3cG.A0x(AuraSwipeablePeekViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, ((AuraSwipeablePeekViewModel) bmw.getValue()).hasPeekAnimationPlayed);
            if (auraSwipeablePeek == null || C1BO.A0F(c1boA02) || !AnonymousClass003.A1Y(auraSwipeablePeek.peekEnabled)) {
                bfm.AgE(138767998);
            } else {
                bfm.AgE(138457595);
                boolean zA1V = AnonymousClass002.A1V(bfm, bmw, (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(auraSwipeablePeek)), AnonymousClass001.A1N(iA05));
                Object objAaT = bfm.AaT();
                if (zA1V || objAaT == C78N.A00) {
                    objAaT = new AuraSwipeableCardKt$PeekHint$2$1(auraSwipeablePeek, anchoredDraggableState, bmw, null);
                    BBI.A0O(bbi, objAaT);
                }
                AnonymousClass001.A18(bfm, objAaT, auraSwipeablePeek);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(auraSwipeablePeek, anchoredDraggableState, i);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[PHI: r0
  0x003b: PHI (r0v6 boolean) = (r0v0 boolean), (r0v0 boolean), (r0v7 boolean) binds: [B:7:0x0009, B:8:0x000b, B:5:0x0006] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0008  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg customAnchoredDraggable(X.BRg r9, final boolean r10, final kotlin.jvm.functions.Function0<kotlin.Unit> r11, final kotlin.jvm.functions.Function0<kotlin.Unit> r12, boolean r13, final androidx.compose.foundation.gestures.AnchoredDraggableState<com.facebook.aura.vds.compose.swipeable.AuraSwipeableMenuStateDragAnchors> r14, boolean r15, final androidx.compose.runtime.MutableState<java.lang.Boolean> r16, final X.C3UX r17) {
        /*
            r1 = 1
            r5 = r11
            r6 = r12
            if (r11 != 0) goto L8
            r0 = 1
            if (r12 == 0) goto L3b
        L8:
            r0 = 0
            if (r11 == 0) goto L3b
            if (r12 == 0) goto L3b
        Ld:
            r2 = r14
            r8 = r13
            if (r13 == 0) goto L3d
            if (r15 == 0) goto L3d
            if (r0 != 0) goto L3d
            if (r1 != 0) goto L3d
            if (r11 == 0) goto L38
            com.facebook.aura.vds.compose.swipeable.AnchoredDragOrientation r4 = com.facebook.aura.vds.compose.swipeable.AnchoredDragOrientation.EndToStart
        L1b:
            com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$customAnchoredDraggable$1 r0 = new com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$customAnchoredDraggable$1
            r1 = r10
            r3 = r16
            r7 = r17
            r0.<init>()
            X.BRg r0 = X.AaM.A01(r9, r0, r11, r12)
            X.AYu r3 = X.EnumC1108AYu.A02
            r4 = 0
            r6 = 0
            X.AbV r1 = new X.AbV
            r5 = r4
            r1.<init>(r2, r3, r4, r5, r6)
            X.BRg r0 = r0.then(r1)
            return r0
        L38:
            com.facebook.aura.vds.compose.swipeable.AnchoredDragOrientation r4 = com.facebook.aura.vds.compose.swipeable.AnchoredDragOrientation.StartToEnd
            goto L1b
        L3b:
            r1 = 0
            goto Ld
        L3d:
            X.AYu r5 = X.EnumC1108AYu.A02
            r6 = 0
            X.AbV r3 = new X.AbV
            r4 = r14
            r7 = r6
            r3.<init>(r4, r5, r6, r7, r8)
            X.BRg r0 = r9.then(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt.customAnchoredDraggable(X.BRg, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, androidx.compose.foundation.gestures.AnchoredDraggableState, boolean, androidx.compose.runtime.MutableState, X.3UX):X.BRg");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraSwipeableCard(kotlin.jvm.functions.Function0<kotlin.Unit> r37, kotlin.jvm.functions.Function0<kotlin.Unit> r38, X.BRg r39, boolean r40, boolean r41, com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardBackgroundProvider r42, com.facebook.aura.vds.compose.swipeable.AuraSwipeablePeek r43, boolean r44, X.G0U<? super java.lang.Boolean, kotlin.Unit> r45, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r46, X.BFM r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 889
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt.AuraSwipeableCard(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, boolean, boolean, com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardBackgroundProvider, com.facebook.aura.vds.compose.swipeable.AuraSwipeablePeek, boolean, X.G0U, X.G0V, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.vds.compose.swipeable.AuraSwipeableMenuState rememberSwipeableMenuState(boolean r15, boolean r16, boolean r17, boolean r18, X.BFM r19, int r20, int r21) {
        /*
            r0 = r21 & 8
            r8 = 1
            r1 = r18
            boolean r7 = X.C60Q.A1Q(r0, r1)
            X.AKH<X.AXN> r0 = X.Am0.A04
            r5 = r19
            r1 = r5
            X.BBI r1 = (X.BBI) r1
            X.AXN r3 = X.AKO.A04(r0, r1)
            X.1YC r11 = X.AZn.A00(r5)
            boolean r6 = r5.A65(r3)
            r0 = r20 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r4 = 32
            r13 = r16
            if (r0 <= r4) goto L2c
            boolean r0 = r5.A66(r13)
            if (r0 != 0) goto L31
        L2c:
            r2 = r20 & 48
            r0 = 0
            if (r2 != r4) goto L32
        L31:
            r0 = 1
        L32:
            r6 = r6 | r0
            r0 = r20 & 14
            r0 = r0 ^ 6
            r2 = 4
            r12 = r15
            if (r0 <= r2) goto L41
            boolean r0 = r5.A66(r15)
            if (r0 != 0) goto L46
        L41:
            r0 = r20 & 6
            if (r0 == r2) goto L46
            r8 = 0
        L46:
            r6 = r6 | r8
            java.lang.Object r8 = r5.AaT()
            if (r6 != 0) goto L51
            java.lang.Object r0 = X.C78N.A00
            if (r8 != r0) goto L75
        L51:
            float r0 = com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt.SwipeableAnchorWidth
            float r9 = r3.Ah4(r0)
            float r0 = com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt.SwipeableVelocityThreshold
            float r10 = r3.Ah4(r0)
            if (r7 == 0) goto L78
            float r0 = com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt.SwipeableStaticThresholdOffset
            float r0 = r3.Ah4(r0)
            java.lang.Float r16 = java.lang.Float.valueOf(r0)
        L69:
            com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$rememberSwipeableMenuState$state$1$4 r14 = com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt$rememberSwipeableMenuState$state$1$4.INSTANCE
            com.facebook.aura.vds.compose.swipeable.AuraSwipeableMenuState r8 = new com.facebook.aura.vds.compose.swipeable.AuraSwipeableMenuState
            r15 = r17
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            X.BBI.A0O(r1, r8)
        L75:
            com.facebook.aura.vds.compose.swipeable.AuraSwipeableMenuState r8 = (com.facebook.aura.vds.compose.swipeable.AuraSwipeableMenuState) r8
            return r8
        L78:
            r16 = 0
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardKt.rememberSwipeableMenuState(boolean, boolean, boolean, boolean, X.BFM, int, int):com.facebook.aura.vds.compose.swipeable.AuraSwipeableMenuState");
    }

    public static final /* synthetic */ AuraSwipeablePeekViewModel access$PeekHint$lambda$0(F0C f0c) {
        return (AuraSwipeablePeekViewModel) f0c.getValue();
    }
}
