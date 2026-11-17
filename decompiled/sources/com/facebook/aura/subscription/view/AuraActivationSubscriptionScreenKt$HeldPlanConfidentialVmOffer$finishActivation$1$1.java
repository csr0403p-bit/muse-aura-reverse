package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel;
import com.facebook.aura.activation.model.AuraDisclosureViewModel;
import com.facebook.aura.analytics.hatch.HatchComponent;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraActivationSubscriptionScreenKt$HeldPlanConfidentialVmOffer$finishActivation$1$1 extends AbstractC7559F3s implements G0V<Boolean, HatchComponent, Unit> {
    public final /* synthetic */ String $defaultDisclosureText;
    public final /* synthetic */ AuraDisclosureViewModel $disclosureViewModel;
    public final /* synthetic */ AuraActivationPlanFinishViewModel $finishViewModel;
    public final /* synthetic */ Map<String, String> $offerMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraActivationSubscriptionScreenKt$HeldPlanConfidentialVmOffer$finishActivation$1$1(Map<String, String> map, AuraActivationPlanFinishViewModel auraActivationPlanFinishViewModel, AuraDisclosureViewModel auraDisclosureViewModel, String str) {
        super(2);
        this.$offerMetadata = map;
        this.$finishViewModel = auraActivationPlanFinishViewModel;
        this.$disclosureViewModel = auraDisclosureViewModel;
        this.$defaultDisclosureText = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, HatchComponent hatchComponent) {
        invoke(AnonymousClass001.A1X(bool), hatchComponent);
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, HatchComponent hatchComponent) {
        C7384Etj.A0Y(hatchComponent, 1);
        AuraActivationSubscriptionScreenKt.logHeldPlanOfferClick(hatchComponent, this.$offerMetadata);
        this.$finishViewModel.onPurchaseConfirmed(z, this.$disclosureViewModel.uiState.getValue().tosMetadata, this.$defaultDisclosureText);
    }
}
