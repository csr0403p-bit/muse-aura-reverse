package com.facebook.aura.confidentialvm.vmswitch;

import X.AnonymousClass003;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistState;
import com.facebook.aura.subscription.repo.SubscriptionDetailsState;

/* loaded from: classes.dex */
public abstract class ConfidentialVmSwitchDataSourceKt {
    public static final ConfidentialVmSwitchDestination resolveConfidentialVmSwitchDestination(SubscriptionDetailsState subscriptionDetailsState, ConfidentialVmWaitlistState confidentialVmWaitlistState, boolean z, boolean z2) {
        AnonymousClass003.A0u(subscriptionDetailsState, confidentialVmWaitlistState);
        if (z) {
            return ConfidentialVmSwitchDestination.CVM_ENCRYPTION_SETTINGS;
        }
        if (!z2) {
            return ConfidentialVmSwitchDestination.NONE;
        }
        if ((confidentialVmWaitlistState instanceof ConfidentialVmWaitlistState.Unresolved) || (subscriptionDetailsState instanceof SubscriptionDetailsState.Unresolved)) {
            return ConfidentialVmSwitchDestination.CVM_LOADING;
        }
        if (confidentialVmWaitlistState instanceof ConfidentialVmWaitlistState.Loaded) {
            ConfidentialVmWaitlistState.Loaded loaded = (ConfidentialVmWaitlistState.Loaded) confidentialVmWaitlistState;
            if (loaded.isShown) {
                return loaded.status == ConfidentialVmWaitlistStatus.WAITLISTED ? ConfidentialVmSwitchDestination.CVM_ON_WAITLIST : ConfidentialVmSwitchDestination.CVM_JOIN_WAITLIST;
            }
            if (subscriptionDetailsState instanceof SubscriptionDetailsState.Success) {
                return ((SubscriptionDetailsState.Success) subscriptionDetailsState).details.isPaidTier ? ConfidentialVmSwitchDestination.CVM_SWITCH_INTRO : ConfidentialVmSwitchDestination.CVM_SUBSCRIBE;
            }
        }
        return ConfidentialVmSwitchDestination.CVM_UNAVAILABLE;
    }
}
