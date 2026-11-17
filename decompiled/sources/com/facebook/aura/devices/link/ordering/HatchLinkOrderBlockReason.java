package com.facebook.aura.devices.link.ordering;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchLinkOrderBlockReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchLinkOrderBlockReason[] $VALUES;
    public static final HatchLinkOrderBlockReason CLAIM_UNAVAILABLE;
    public static final HatchLinkOrderBlockReason NOT_AUTHENTICATED;
    public static final HatchLinkOrderBlockReason NO_SUBSCRIPTION;
    public static final HatchLinkOrderBlockReason ORDERING_DISABLED;
    public static final HatchLinkOrderBlockReason SUBSCRIPTION_NOT_ENTITLED;
    public static final HatchLinkOrderBlockReason SUBSCRIPTION_NOT_READY;

    static {
        HatchLinkOrderBlockReason hatchLinkOrderBlockReason = new HatchLinkOrderBlockReason("ORDERING_DISABLED", 0);
        ORDERING_DISABLED = hatchLinkOrderBlockReason;
        HatchLinkOrderBlockReason hatchLinkOrderBlockReason2 = new HatchLinkOrderBlockReason("NOT_AUTHENTICATED", 1);
        NOT_AUTHENTICATED = hatchLinkOrderBlockReason2;
        HatchLinkOrderBlockReason hatchLinkOrderBlockReason3 = new HatchLinkOrderBlockReason("NO_SUBSCRIPTION", 2);
        NO_SUBSCRIPTION = hatchLinkOrderBlockReason3;
        HatchLinkOrderBlockReason hatchLinkOrderBlockReason4 = new HatchLinkOrderBlockReason("SUBSCRIPTION_NOT_READY", 3);
        SUBSCRIPTION_NOT_READY = hatchLinkOrderBlockReason4;
        HatchLinkOrderBlockReason hatchLinkOrderBlockReason5 = new HatchLinkOrderBlockReason("SUBSCRIPTION_NOT_ENTITLED", 4);
        SUBSCRIPTION_NOT_ENTITLED = hatchLinkOrderBlockReason5;
        HatchLinkOrderBlockReason hatchLinkOrderBlockReason6 = new HatchLinkOrderBlockReason("CLAIM_UNAVAILABLE", 5);
        CLAIM_UNAVAILABLE = hatchLinkOrderBlockReason6;
        HatchLinkOrderBlockReason[] hatchLinkOrderBlockReasonArr = {hatchLinkOrderBlockReason, hatchLinkOrderBlockReason2, hatchLinkOrderBlockReason3, hatchLinkOrderBlockReason4, hatchLinkOrderBlockReason5, hatchLinkOrderBlockReason6};
        $VALUES = hatchLinkOrderBlockReasonArr;
        $ENTRIES = C3cG.A0w(hatchLinkOrderBlockReasonArr);
    }

    public static Ey9<HatchLinkOrderBlockReason> getEntries() {
        return $ENTRIES;
    }

    public static HatchLinkOrderBlockReason valueOf(String str) {
        return (HatchLinkOrderBlockReason) Enum.valueOf(HatchLinkOrderBlockReason.class, str);
    }

    public static HatchLinkOrderBlockReason[] values() {
        return (HatchLinkOrderBlockReason[]) $VALUES.clone();
    }

    public HatchLinkOrderBlockReason(String str, int i) {
    }
}
