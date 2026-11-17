package com.facebook.aura.subscription.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.subscription.repo.SubscriptionDetails;

/* loaded from: classes4.dex */
public final class PlanPickerGateState extends C06G {
    public static final int $stable = 0;
    public final ComplimentarySubscriptionRedemptionState claimState;
    public final SubscriptionDetails details;
    public final PurchaseBlock purchaseBlock;

    public PlanPickerGateState(ComplimentarySubscriptionRedemptionState complimentarySubscriptionRedemptionState, SubscriptionDetails subscriptionDetails, PurchaseBlock purchaseBlock) {
        C7384Etj.A0Y(complimentarySubscriptionRedemptionState, 0);
        this.claimState = complimentarySubscriptionRedemptionState;
        this.details = subscriptionDetails;
        this.purchaseBlock = purchaseBlock;
    }

    public final PlanPickerGateState copy(ComplimentarySubscriptionRedemptionState complimentarySubscriptionRedemptionState, SubscriptionDetails subscriptionDetails, PurchaseBlock purchaseBlock) {
        C7384Etj.A0Y(complimentarySubscriptionRedemptionState, 0);
        return new PlanPickerGateState(complimentarySubscriptionRedemptionState, subscriptionDetails, purchaseBlock);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PlanPickerGateState) {
                PlanPickerGateState planPickerGateState = (PlanPickerGateState) obj;
                if (this.claimState != planPickerGateState.claimState || !C7384Etj.areEqual(this.details, planPickerGateState.details) || this.purchaseBlock != planPickerGateState.purchaseBlock) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PlanPickerGateState copy$default(PlanPickerGateState planPickerGateState, ComplimentarySubscriptionRedemptionState complimentarySubscriptionRedemptionState, SubscriptionDetails subscriptionDetails, PurchaseBlock purchaseBlock, int i, Object obj) {
        if ((i & 1) != 0) {
            complimentarySubscriptionRedemptionState = planPickerGateState.claimState;
        }
        if ((i & 2) != 0) {
            subscriptionDetails = planPickerGateState.details;
        }
        if ((i & 4) != 0) {
            purchaseBlock = planPickerGateState.purchaseBlock;
        }
        return planPickerGateState.copy(complimentarySubscriptionRedemptionState, subscriptionDetails, purchaseBlock);
    }

    public final ComplimentarySubscriptionRedemptionState component1() {
        return this.claimState;
    }

    public final SubscriptionDetails component2() {
        return this.details;
    }

    public final PurchaseBlock component3() {
        return this.purchaseBlock;
    }

    public final ComplimentarySubscriptionRedemptionState getClaimState() {
        return this.claimState;
    }

    public final SubscriptionDetails getDetails() {
        return this.details;
    }

    public final PurchaseBlock getPurchaseBlock() {
        return this.purchaseBlock;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0E(this.claimState) + AnonymousClass006.A0D(this.details)) * 31) + C3cH.A02(this.purchaseBlock);
    }

    public String toString() {
        return super.toString();
    }
}
