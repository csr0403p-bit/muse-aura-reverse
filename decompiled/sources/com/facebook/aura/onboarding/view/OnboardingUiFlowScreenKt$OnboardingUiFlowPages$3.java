package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import X.InterfaceC1497Ak4;
import com.facebook.aura.onboarding.OnboardingUiFlowUiState;
import com.facebook.aura.onboarding.OnboardingUiFlowViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class OnboardingUiFlowScreenKt$OnboardingUiFlowPages$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function0<Float> $exitProgress;
    public final /* synthetic */ boolean $isKeyboardVisible;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $nameAvatarSize;
    public final /* synthetic */ float $nameBottomInset;
    public final /* synthetic */ OnboardingNameReveal $nameReveal;
    public final /* synthetic */ G0U<InterfaceC1497Ak4, Unit> $onNameAvatarSlotPlaced;
    public final /* synthetic */ OnboardingUiFlowUiState $uiState;
    public final /* synthetic */ OnboardingUiFlowViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingUiFlowScreenKt$OnboardingUiFlowPages$3(OnboardingUiFlowUiState onboardingUiFlowUiState, OnboardingUiFlowViewModel onboardingUiFlowViewModel, OnboardingNameReveal onboardingNameReveal, float f, boolean z, float f2, G0U<? super InterfaceC1497Ak4, Unit> g0u, Function0<Float> function0, BRg bRg, int i, int i2) {
        super(2);
        this.$uiState = onboardingUiFlowUiState;
        this.$viewModel = onboardingUiFlowViewModel;
        this.$nameReveal = onboardingNameReveal;
        this.$nameAvatarSize = f;
        this.$isKeyboardVisible = z;
        this.$nameBottomInset = f2;
        this.$onNameAvatarSlotPlaced = g0u;
        this.$exitProgress = function0;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        OnboardingUiFlowScreenKt.m1624OnboardingUiFlowPagesE4Q9ldg(this.$uiState, this.$viewModel, this.$nameReveal, this.$nameAvatarSize, this.$isKeyboardVisible, this.$nameBottomInset, this.$onNameAvatarSlotPlaced, this.$exitProgress, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
