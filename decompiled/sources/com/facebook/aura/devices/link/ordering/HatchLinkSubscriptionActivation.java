package com.facebook.aura.devices.link.ordering;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchLinkSubscriptionActivation {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchLinkSubscriptionActivation[] $VALUES;
    public static final HatchLinkSubscriptionActivation ACTIVE;
    public static final HatchLinkSubscriptionActivation TIMED_OUT;
    public static final HatchLinkSubscriptionActivation TIMEOUT_HANDLED;
    public static final HatchLinkSubscriptionActivation WAITING;

    static {
        HatchLinkSubscriptionActivation hatchLinkSubscriptionActivation = new HatchLinkSubscriptionActivation("WAITING", 0);
        WAITING = hatchLinkSubscriptionActivation;
        HatchLinkSubscriptionActivation hatchLinkSubscriptionActivation2 = new HatchLinkSubscriptionActivation("ACTIVE", 1);
        ACTIVE = hatchLinkSubscriptionActivation2;
        HatchLinkSubscriptionActivation hatchLinkSubscriptionActivation3 = new HatchLinkSubscriptionActivation("TIMED_OUT", 2);
        TIMED_OUT = hatchLinkSubscriptionActivation3;
        HatchLinkSubscriptionActivation hatchLinkSubscriptionActivation4 = new HatchLinkSubscriptionActivation("TIMEOUT_HANDLED", 3);
        TIMEOUT_HANDLED = hatchLinkSubscriptionActivation4;
        HatchLinkSubscriptionActivation[] hatchLinkSubscriptionActivationArr = {hatchLinkSubscriptionActivation, hatchLinkSubscriptionActivation2, hatchLinkSubscriptionActivation3, hatchLinkSubscriptionActivation4};
        $VALUES = hatchLinkSubscriptionActivationArr;
        $ENTRIES = C3cG.A0w(hatchLinkSubscriptionActivationArr);
    }

    public static Ey9<HatchLinkSubscriptionActivation> getEntries() {
        return $ENTRIES;
    }

    public static HatchLinkSubscriptionActivation valueOf(String str) {
        return (HatchLinkSubscriptionActivation) Enum.valueOf(HatchLinkSubscriptionActivation.class, str);
    }

    public static HatchLinkSubscriptionActivation[] values() {
        return (HatchLinkSubscriptionActivation[]) $VALUES.clone();
    }

    public HatchLinkSubscriptionActivation(String str, int i) {
    }
}
