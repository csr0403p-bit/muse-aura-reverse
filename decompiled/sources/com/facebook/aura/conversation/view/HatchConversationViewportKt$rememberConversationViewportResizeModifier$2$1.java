package com.facebook.aura.conversation.view;

import X.AXY;
import X.AYU;
import X.AZE;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C00r;
import X.C1051ASv;
import X.C1BO;
import X.C3TG;
import X.C7384Etj;
import X.F1E;
import X.F1F;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationViewportKt$rememberConversationViewportResizeModifier$2$1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ F1E $appliedAvatarScrollPx;
    public final /* synthetic */ C1BO<Function0<Boolean>> $currentEnabled$delegate;
    public final /* synthetic */ F1F $hasLookaheadOccurred;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;
    public final /* synthetic */ F1E $previousHeight;
    public final /* synthetic */ C1051ASv $previousPanelProgress;
    public final /* synthetic */ C00r $totalAvatarScrollCompensationPx$delegate;
    public final /* synthetic */ MutableState<Boolean> $viewportSettled$delegate;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationViewportKt$rememberConversationViewportResizeModifier$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ AZE $placeable;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            AYU.A04(ayu, this.$placeable, 0, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AZE aze) {
            super(1);
            this.$placeable = aze;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationViewportKt$rememberConversationViewportResizeModifier$2$1(F1F f1f, F1E f1e, HatchStatusPillMetrics hatchStatusPillMetrics, C1051ASv c1051ASv, LazyListState lazyListState, F1E f1e2, MutableState<Boolean> mutableState, C1BO<? extends Function0<Boolean>> c1bo, C00r c00r) {
        super(3);
        this.$hasLookaheadOccurred = f1f;
        this.$previousHeight = f1e;
        this.$pillMetrics = hatchStatusPillMetrics;
        this.$previousPanelProgress = c1051ASv;
        this.$listState = lazyListState;
        this.$appliedAvatarScrollPx = f1e2;
        this.$viewportSettled$delegate = mutableState;
        this.$currentEnabled$delegate = c1bo;
        this.$totalAvatarScrollCompensationPx$delegate = c00r;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m574invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m574invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        boolean zA1a = AnonymousClass002.A1a(axy, c3tg);
        if (!axy.AOh()) {
            if (!this.$hasLookaheadOccurred.element) {
            }
            AZE azeAQW = c3tg.AQW(j);
            return AnonymousClass002.A0X(axy, new AnonymousClass1(azeAQW), azeAQW.A01, azeAQW.A00);
        }
        this.$hasLookaheadOccurred.element = zA1a;
        int iA00 = Constraints.A00(j);
        int i = this.$previousHeight.element - iA00;
        float fAFn = this.$pillMetrics.avatarPanelProgress$delegate.AFn();
        C1051ASv c1051ASv = this.$previousPanelProgress;
        float f = c1051ASv.element;
        boolean z = (Float.isNaN(f) || fAFn == f) ? false : true;
        this.$previousHeight.element = iA00;
        c1051ASv.element = fAFn;
        if (z && i != 0 && MutableState.A0A((MutableState) this.$viewportSettled$delegate) && AnonymousClass003.A1Y(C1BO.A0A(this.$currentEnabled$delegate)) && !this.$listState.AOz()) {
            LazyListState lazyListState = this.$listState;
            lazyListState.A07(lazyListState.A02(), this.$listState.A03() + i);
            F1E f1e = this.$appliedAvatarScrollPx;
            int i2 = f1e.element + i;
            f1e.element = i2;
            this.$totalAvatarScrollCompensationPx$delegate.AdX(i2);
        }
        AZE azeAQW2 = c3tg.AQW(j);
        return AnonymousClass002.A0X(axy, new AnonymousClass1(azeAQW2), azeAQW2.A01, azeAQW2.A00);
    }
}
