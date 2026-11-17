package com.facebook.aura.ccv.nativeflow;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchCheckoutUnavailableReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCheckoutUnavailableReason[] $VALUES;
    public static final HatchCheckoutUnavailableReason NO_AMOUNT;
    public static final HatchCheckoutUnavailableReason SERVER_ERROR;
    public static final HatchCheckoutUnavailableReason TIMEOUT;

    static {
        HatchCheckoutUnavailableReason hatchCheckoutUnavailableReason = new HatchCheckoutUnavailableReason("TIMEOUT", 0);
        TIMEOUT = hatchCheckoutUnavailableReason;
        HatchCheckoutUnavailableReason hatchCheckoutUnavailableReason2 = new HatchCheckoutUnavailableReason("SERVER_ERROR", 1);
        SERVER_ERROR = hatchCheckoutUnavailableReason2;
        HatchCheckoutUnavailableReason hatchCheckoutUnavailableReason3 = new HatchCheckoutUnavailableReason("NO_AMOUNT", 2);
        NO_AMOUNT = hatchCheckoutUnavailableReason3;
        HatchCheckoutUnavailableReason[] hatchCheckoutUnavailableReasonArr = {hatchCheckoutUnavailableReason, hatchCheckoutUnavailableReason2, hatchCheckoutUnavailableReason3};
        $VALUES = hatchCheckoutUnavailableReasonArr;
        $ENTRIES = C3cG.A0w(hatchCheckoutUnavailableReasonArr);
    }

    public static Ey9<HatchCheckoutUnavailableReason> getEntries() {
        return $ENTRIES;
    }

    public static HatchCheckoutUnavailableReason valueOf(String str) {
        return (HatchCheckoutUnavailableReason) Enum.valueOf(HatchCheckoutUnavailableReason.class, str);
    }

    public static HatchCheckoutUnavailableReason[] values() {
        return (HatchCheckoutUnavailableReason[]) $VALUES.clone();
    }

    public HatchCheckoutUnavailableReason(String str, int i) {
    }
}
