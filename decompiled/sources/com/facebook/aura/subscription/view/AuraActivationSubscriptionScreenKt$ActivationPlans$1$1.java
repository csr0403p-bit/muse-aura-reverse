package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel;
import com.facebook.aura.activation.model.AuraDisclosureViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraActivationSubscriptionScreenKt$ActivationPlans$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ String $defaultDisclosureText;
    public final /* synthetic */ AuraDisclosureViewModel $disclosureViewModel;
    public final /* synthetic */ AuraActivationPlanFinishViewModel $finishViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraActivationSubscriptionScreenKt$ActivationPlans$1$1(AuraActivationPlanFinishViewModel auraActivationPlanFinishViewModel, AuraDisclosureViewModel auraDisclosureViewModel, String str) {
        super(1);
        this.$finishViewModel = auraActivationPlanFinishViewModel;
        this.$disclosureViewModel = auraDisclosureViewModel;
        this.$defaultDisclosureText = str;
    }

    public final void invoke(boolean z) {
        this.$finishViewModel.onPurchaseConfirmed(z, this.$disclosureViewModel.uiState.getValue().tosMetadata, this.$defaultDisclosureText);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
