package com.facebook.aura.analytics.hatch;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchCheckoutEntryPoint {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCheckoutEntryPoint[] $VALUES;
    public static final HatchCheckoutEntryPoint CART_ASSISTANT_BUTTON;
    public static final HatchCheckoutEntryPoint CART_PROVIDER_LINK;
    public final String value;

    static {
        HatchCheckoutEntryPoint hatchCheckoutEntryPoint = new HatchCheckoutEntryPoint("CART_ASSISTANT_BUTTON", 0, "cart_assistant_button");
        CART_ASSISTANT_BUTTON = hatchCheckoutEntryPoint;
        HatchCheckoutEntryPoint hatchCheckoutEntryPoint2 = new HatchCheckoutEntryPoint("CART_PROVIDER_LINK", 1, "cart_provider_link");
        CART_PROVIDER_LINK = hatchCheckoutEntryPoint2;
        HatchCheckoutEntryPoint[] hatchCheckoutEntryPointArr = {hatchCheckoutEntryPoint, hatchCheckoutEntryPoint2};
        $VALUES = hatchCheckoutEntryPointArr;
        $ENTRIES = C3cG.A0w(hatchCheckoutEntryPointArr);
    }

    public static Ey9<HatchCheckoutEntryPoint> getEntries() {
        return $ENTRIES;
    }

    public static HatchCheckoutEntryPoint valueOf(String str) {
        return (HatchCheckoutEntryPoint) Enum.valueOf(HatchCheckoutEntryPoint.class, str);
    }

    public static HatchCheckoutEntryPoint[] values() {
        return (HatchCheckoutEntryPoint[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchCheckoutEntryPoint(String str, int i, String str2) {
        this.value = str2;
    }
}
