package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel;
import com.facebook.aura.subscription.repo.SubscriptionProduct;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraActivationSubscriptionScreenKt$ActivationPlanBody$1$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ G0W<SubscriptionProduct, BFM, Integer, BRg> $impressionModifier;
    public final /* synthetic */ boolean $isSelectionLocked;
    public final /* synthetic */ G0U<SubscriptionProduct, Unit> $onSelect;
    public final /* synthetic */ String $selectedId;
    public final /* synthetic */ AuraSubscriptionPaywallViewModel.UiState $uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraActivationSubscriptionScreenKt$ActivationPlanBody$1$2(AuraSubscriptionPaywallViewModel.UiState uiState, String str, boolean z, G0U<? super SubscriptionProduct, Unit> g0u, G0W<? super SubscriptionProduct, ? super BFM, ? super Integer, ? extends BRg> g0w) {
        super(2);
        this.$uiState = uiState;
        this.$selectedId = str;
        this.$isSelectionLocked = z;
        this.$onSelect = g0u;
        this.$impressionModifier = g0w;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AuraActivationSubscriptionScreenKt.ActivationPlanCard((AuraSubscriptionPaywallViewModel.UiState.Loaded) this.$uiState, this.$selectedId, this.$isSelectionLocked, this.$onSelect, this.$impressionModifier, null, bfm, 0, 32);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
