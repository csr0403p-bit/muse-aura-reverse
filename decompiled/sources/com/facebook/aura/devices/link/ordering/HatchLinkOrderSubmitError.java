package com.facebook.aura.devices.link.ordering;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchLinkOrderSubmitError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchLinkOrderSubmitError[] $VALUES;
    public static final HatchLinkOrderSubmitError ADDRESS_CHECK_UNAVAILABLE;
    public static final HatchLinkOrderSubmitError GENERIC;
    public static final HatchLinkOrderSubmitError INVALID_SHIPPING_ADDRESS;

    static {
        HatchLinkOrderSubmitError hatchLinkOrderSubmitError = new HatchLinkOrderSubmitError("GENERIC", 0);
        GENERIC = hatchLinkOrderSubmitError;
        HatchLinkOrderSubmitError hatchLinkOrderSubmitError2 = new HatchLinkOrderSubmitError("INVALID_SHIPPING_ADDRESS", 1);
        INVALID_SHIPPING_ADDRESS = hatchLinkOrderSubmitError2;
        HatchLinkOrderSubmitError hatchLinkOrderSubmitError3 = new HatchLinkOrderSubmitError("ADDRESS_CHECK_UNAVAILABLE", 2);
        ADDRESS_CHECK_UNAVAILABLE = hatchLinkOrderSubmitError3;
        HatchLinkOrderSubmitError[] hatchLinkOrderSubmitErrorArr = {hatchLinkOrderSubmitError, hatchLinkOrderSubmitError2, hatchLinkOrderSubmitError3};
        $VALUES = hatchLinkOrderSubmitErrorArr;
        $ENTRIES = C3cG.A0w(hatchLinkOrderSubmitErrorArr);
    }

    public static Ey9<HatchLinkOrderSubmitError> getEntries() {
        return $ENTRIES;
    }

    public static HatchLinkOrderSubmitError valueOf(String str) {
        return (HatchLinkOrderSubmitError) Enum.valueOf(HatchLinkOrderSubmitError.class, str);
    }

    public static HatchLinkOrderSubmitError[] values() {
        return (HatchLinkOrderSubmitError[]) $VALUES.clone();
    }

    public HatchLinkOrderSubmitError(String str, int i) {
    }
}
