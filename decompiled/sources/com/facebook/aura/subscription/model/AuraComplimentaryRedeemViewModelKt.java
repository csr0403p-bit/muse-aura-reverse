package com.facebook.aura.subscription.model;

import X.AnonymousClass002;
import com.facebook.aura.subscription.model.AuraComplimentaryRedeemViewModel;
import com.facebook.aura.subscription.repo.ComplimentaryRedeemPage;

/* loaded from: classes.dex */
public abstract class AuraComplimentaryRedeemViewModelKt {
    public static final AuraComplimentaryRedeemViewModel.UiState toUiState(ComplimentaryRedeemPage complimentaryRedeemPage, ComplimentarySubscriptionRedemptionState complimentarySubscriptionRedemptionState) {
        if (complimentarySubscriptionRedemptionState == ComplimentarySubscriptionRedemptionState.COMPLETED) {
            return AuraComplimentaryRedeemViewModel.UiState.Closed.INSTANCE;
        }
        return new AuraComplimentaryRedeemViewModel.UiState.Ready(complimentaryRedeemPage, AnonymousClass002.A1Z(complimentarySubscriptionRedemptionState, ComplimentarySubscriptionRedemptionState.LOADING), complimentarySubscriptionRedemptionState == ComplimentarySubscriptionRedemptionState.FAILED);
    }
}
