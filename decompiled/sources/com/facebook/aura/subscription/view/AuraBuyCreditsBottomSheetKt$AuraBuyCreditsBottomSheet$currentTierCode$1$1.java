package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.C7BY;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import com.facebook.aura.subscription.repo.SubscriptionDetails;
import com.facebook.aura.subscription.repo.SubscriptionDetailsState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$currentTierCode$1$1 extends AbstractC7559F3s implements Function0<String> {
    public final /* synthetic */ AuraSubscriptionRepository $subscriptionRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$currentTierCode$1$1(AuraSubscriptionRepository auraSubscriptionRepository) {
        super(0);
        this.$subscriptionRepository = auraSubscriptionRepository;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        SubscriptionDetailsState.Success success;
        SubscriptionDetails subscriptionDetails;
        String str;
        SubscriptionDetailsState value = this.$subscriptionRepository.subscriptionDetailsState.getValue();
        if (!(value instanceof SubscriptionDetailsState.Success) || (success = (SubscriptionDetailsState.Success) value) == null || (subscriptionDetails = success.details) == null || (str = subscriptionDetails.tierCode) == null || C7BY.A0j(str)) {
            return null;
        }
        return str;
    }
}
