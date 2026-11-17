package com.facebook.aura.subscription.model;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SubscriptionMeterDestination {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SubscriptionMeterDestination[] $VALUES;
    public static final SubscriptionMeterDestination PAYWALL;
    public static final SubscriptionMeterDestination REDEEM_COMPLIMENTARY;
    public static final SubscriptionMeterDestination RESUBSCRIBE;

    static {
        SubscriptionMeterDestination subscriptionMeterDestination = new SubscriptionMeterDestination("PAYWALL", 0);
        PAYWALL = subscriptionMeterDestination;
        SubscriptionMeterDestination subscriptionMeterDestination2 = new SubscriptionMeterDestination("RESUBSCRIBE", 1);
        RESUBSCRIBE = subscriptionMeterDestination2;
        SubscriptionMeterDestination subscriptionMeterDestination3 = new SubscriptionMeterDestination("REDEEM_COMPLIMENTARY", 2);
        REDEEM_COMPLIMENTARY = subscriptionMeterDestination3;
        SubscriptionMeterDestination[] subscriptionMeterDestinationArr = {subscriptionMeterDestination, subscriptionMeterDestination2, subscriptionMeterDestination3};
        $VALUES = subscriptionMeterDestinationArr;
        $ENTRIES = new F3w(subscriptionMeterDestinationArr);
    }

    public static Ey9<SubscriptionMeterDestination> getEntries() {
        return $ENTRIES;
    }

    public static SubscriptionMeterDestination valueOf(String str) {
        return (SubscriptionMeterDestination) Enum.valueOf(SubscriptionMeterDestination.class, str);
    }

    public static SubscriptionMeterDestination[] values() {
        return (SubscriptionMeterDestination[]) $VALUES.clone();
    }

    public SubscriptionMeterDestination(String str, int i) {
    }
}
