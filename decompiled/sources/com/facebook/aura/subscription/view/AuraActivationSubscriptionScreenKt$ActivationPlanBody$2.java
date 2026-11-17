package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel;
import com.facebook.aura.subscription.repo.SubscriptionProduct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraActivationSubscriptionScreenKt$ActivationPlanBody$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $cvmLearnMoreUrl;
    public final /* synthetic */ G0W<SubscriptionProduct, BFM, Integer, BRg> $impressionModifier;
    public final /* synthetic */ boolean $isConfidentialVmToggleEnabled;
    public final /* synthetic */ boolean $isSelectionLocked;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onRetry;
    public final /* synthetic */ G0U<SubscriptionProduct, Unit> $onSelect;
    public final /* synthetic */ G0U<Boolean, Unit> $onUsesConfidentialVmChange;
    public final /* synthetic */ String $selectedId;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ AuraSubscriptionPaywallViewModel.UiState $uiState;
    public final /* synthetic */ boolean $usesConfidentialVm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraActivationSubscriptionScreenKt$ActivationPlanBody$2(AuraSubscriptionPaywallViewModel.UiState uiState, String str, boolean z, boolean z2, boolean z3, String str2, float f, Function0<Unit> function0, G0U<? super Boolean, Unit> g0u, G0U<? super SubscriptionProduct, Unit> g0u2, G0W<? super SubscriptionProduct, ? super BFM, ? super Integer, ? extends BRg> g0w, BRg bRg, int i, int i2, int i3) {
        super(2);
        this.$uiState = uiState;
        this.$selectedId = str;
        this.$isSelectionLocked = z;
        this.$isConfidentialVmToggleEnabled = z2;
        this.$usesConfidentialVm = z3;
        this.$cvmLearnMoreUrl = str2;
        this.$topPadding = f;
        this.$onRetry = function0;
        this.$onUsesConfidentialVmChange = g0u;
        this.$onSelect = g0u2;
        this.$impressionModifier = g0w;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public final void invoke(BFM bfm, int i) {
        AuraActivationSubscriptionScreenKt.m2263ActivationPlanBody8u0NR3k(this.$uiState, this.$selectedId, this.$isSelectionLocked, this.$isConfidentialVmToggleEnabled, this.$usesConfidentialVm, this.$cvmLearnMoreUrl, this.$topPadding, this.$onRetry, this.$onUsesConfidentialVmChange, this.$onSelect, this.$impressionModifier, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
