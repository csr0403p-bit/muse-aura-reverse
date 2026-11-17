package com.facebook.aura.devices.intf;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SubscriptionAddOnEntry {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SubscriptionAddOnEntry[] $VALUES;
    public static final SubscriptionAddOnEntry DEVICE_SETTINGS;
    public static final SubscriptionAddOnEntry MANAGE_SUBSCRIPTION;

    static {
        SubscriptionAddOnEntry subscriptionAddOnEntry = new SubscriptionAddOnEntry("MANAGE_SUBSCRIPTION", 0);
        MANAGE_SUBSCRIPTION = subscriptionAddOnEntry;
        SubscriptionAddOnEntry subscriptionAddOnEntry2 = new SubscriptionAddOnEntry("DEVICE_SETTINGS", 1);
        DEVICE_SETTINGS = subscriptionAddOnEntry2;
        SubscriptionAddOnEntry[] subscriptionAddOnEntryArr = {subscriptionAddOnEntry, subscriptionAddOnEntry2};
        $VALUES = subscriptionAddOnEntryArr;
        $ENTRIES = new F3w(subscriptionAddOnEntryArr);
    }

    public static Ey9<SubscriptionAddOnEntry> getEntries() {
        return $ENTRIES;
    }

    public static SubscriptionAddOnEntry valueOf(String str) {
        return (SubscriptionAddOnEntry) Enum.valueOf(SubscriptionAddOnEntry.class, str);
    }

    public static SubscriptionAddOnEntry[] values() {
        return (SubscriptionAddOnEntry[]) $VALUES.clone();
    }

    public SubscriptionAddOnEntry(String str, int i) {
    }
}
