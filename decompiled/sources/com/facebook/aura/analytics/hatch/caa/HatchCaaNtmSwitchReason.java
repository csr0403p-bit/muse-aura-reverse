package com.facebook.aura.analytics.hatch.caa;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCaaNtmSwitchReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCaaNtmSwitchReason[] $VALUES;
    public static final HatchCaaNtmSwitchReason LINK_FAILED;
    public static final HatchCaaNtmSwitchReason NO_OFFER;
    public static final HatchCaaNtmSwitchReason UPSELL_DECLINED;
    public final String value;

    static {
        HatchCaaNtmSwitchReason hatchCaaNtmSwitchReason = new HatchCaaNtmSwitchReason("UPSELL_DECLINED", 0, "upsell_declined");
        UPSELL_DECLINED = hatchCaaNtmSwitchReason;
        HatchCaaNtmSwitchReason hatchCaaNtmSwitchReason2 = new HatchCaaNtmSwitchReason("LINK_FAILED", 1, "link_failed");
        LINK_FAILED = hatchCaaNtmSwitchReason2;
        HatchCaaNtmSwitchReason hatchCaaNtmSwitchReason3 = new HatchCaaNtmSwitchReason("NO_OFFER", 2, "no_offer");
        NO_OFFER = hatchCaaNtmSwitchReason3;
        HatchCaaNtmSwitchReason[] hatchCaaNtmSwitchReasonArr = {hatchCaaNtmSwitchReason, hatchCaaNtmSwitchReason2, hatchCaaNtmSwitchReason3};
        $VALUES = hatchCaaNtmSwitchReasonArr;
        $ENTRIES = C3cG.A0w(hatchCaaNtmSwitchReasonArr);
    }

    public static Ey9<HatchCaaNtmSwitchReason> getEntries() {
        return $ENTRIES;
    }

    public static HatchCaaNtmSwitchReason valueOf(String str) {
        return (HatchCaaNtmSwitchReason) Enum.valueOf(HatchCaaNtmSwitchReason.class, str);
    }

    public static HatchCaaNtmSwitchReason[] values() {
        return (HatchCaaNtmSwitchReason[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchCaaNtmSwitchReason(String str, int i, String str2) {
        this.value = str2;
    }
}
