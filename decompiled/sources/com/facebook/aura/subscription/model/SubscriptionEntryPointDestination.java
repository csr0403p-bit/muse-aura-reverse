package com.facebook.aura.subscription.model;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SubscriptionEntryPointDestination {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SubscriptionEntryPointDestination[] $VALUES;
    public static final SubscriptionEntryPointDestination MANAGE_SUBSCRIPTION;
    public static final SubscriptionEntryPointDestination REDEEM_COMPLIMENTARY;
    public static final SubscriptionEntryPointDestination UPGRADE;

    static {
        SubscriptionEntryPointDestination subscriptionEntryPointDestination = new SubscriptionEntryPointDestination("UPGRADE", 0);
        UPGRADE = subscriptionEntryPointDestination;
        SubscriptionEntryPointDestination subscriptionEntryPointDestination2 = new SubscriptionEntryPointDestination("MANAGE_SUBSCRIPTION", 1);
        MANAGE_SUBSCRIPTION = subscriptionEntryPointDestination2;
        SubscriptionEntryPointDestination subscriptionEntryPointDestination3 = new SubscriptionEntryPointDestination("REDEEM_COMPLIMENTARY", 2);
        REDEEM_COMPLIMENTARY = subscriptionEntryPointDestination3;
        SubscriptionEntryPointDestination[] subscriptionEntryPointDestinationArr = {subscriptionEntryPointDestination, subscriptionEntryPointDestination2, subscriptionEntryPointDestination3};
        $VALUES = subscriptionEntryPointDestinationArr;
        $ENTRIES = new F3w(subscriptionEntryPointDestinationArr);
    }

    public static Ey9<SubscriptionEntryPointDestination> getEntries() {
        return $ENTRIES;
    }

    public static SubscriptionEntryPointDestination valueOf(String str) {
        return (SubscriptionEntryPointDestination) Enum.valueOf(SubscriptionEntryPointDestination.class, str);
    }

    public static SubscriptionEntryPointDestination[] values() {
        return (SubscriptionEntryPointDestination[]) $VALUES.clone();
    }

    public SubscriptionEntryPointDestination(String str, int i) {
    }
}
