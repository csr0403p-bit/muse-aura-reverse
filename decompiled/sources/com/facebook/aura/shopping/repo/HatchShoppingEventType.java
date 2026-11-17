package com.facebook.aura.shopping.repo;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchShoppingEventType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchShoppingEventType[] $VALUES;
    public static final HatchShoppingEventType CLICKED_ADD_TO_CART;
    public static final HatchShoppingEventType CLICKED_CHECKOUT_CART;
    public static final HatchShoppingEventType CLICKED_PURCHASE;
    public final String wire;

    static {
        HatchShoppingEventType hatchShoppingEventType = new HatchShoppingEventType("CLICKED_PURCHASE", 0, "clicked_purchase");
        CLICKED_PURCHASE = hatchShoppingEventType;
        HatchShoppingEventType hatchShoppingEventType2 = new HatchShoppingEventType("CLICKED_ADD_TO_CART", 1, "clicked_add_to_cart");
        CLICKED_ADD_TO_CART = hatchShoppingEventType2;
        HatchShoppingEventType hatchShoppingEventType3 = new HatchShoppingEventType("CLICKED_CHECKOUT_CART", 2, "clicked_checkout_cart");
        CLICKED_CHECKOUT_CART = hatchShoppingEventType3;
        HatchShoppingEventType[] hatchShoppingEventTypeArr = {hatchShoppingEventType, hatchShoppingEventType2, hatchShoppingEventType3};
        $VALUES = hatchShoppingEventTypeArr;
        $ENTRIES = C3cG.A0w(hatchShoppingEventTypeArr);
    }

    public static Ey9<HatchShoppingEventType> getEntries() {
        return $ENTRIES;
    }

    public static HatchShoppingEventType valueOf(String str) {
        return (HatchShoppingEventType) Enum.valueOf(HatchShoppingEventType.class, str);
    }

    public static HatchShoppingEventType[] values() {
        return (HatchShoppingEventType[]) $VALUES.clone();
    }

    public final String getWire() {
        return this.wire;
    }

    public HatchShoppingEventType(String str, int i, String str2) {
        this.wire = str2;
    }
}
