package com.facebook.aura.productactions.impl;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ProductMenuActionId {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ProductMenuActionId[] $VALUES;
    public static final ProductMenuActionId REPLY;
    public static final ProductMenuActionId SAVE;
    public static final ProductMenuActionId SHARE;

    static {
        ProductMenuActionId productMenuActionId = new ProductMenuActionId("REPLY", 0);
        REPLY = productMenuActionId;
        ProductMenuActionId productMenuActionId2 = new ProductMenuActionId("SAVE", 1);
        SAVE = productMenuActionId2;
        ProductMenuActionId productMenuActionId3 = new ProductMenuActionId("SHARE", 2);
        SHARE = productMenuActionId3;
        ProductMenuActionId[] productMenuActionIdArr = {productMenuActionId, productMenuActionId2, productMenuActionId3};
        $VALUES = productMenuActionIdArr;
        $ENTRIES = new F3w(productMenuActionIdArr);
    }

    public static Ey9<ProductMenuActionId> getEntries() {
        return $ENTRIES;
    }

    public static ProductMenuActionId valueOf(String str) {
        return (ProductMenuActionId) Enum.valueOf(ProductMenuActionId.class, str);
    }

    public static ProductMenuActionId[] values() {
        return (ProductMenuActionId[]) $VALUES.clone();
    }

    public ProductMenuActionId(String str, int i) {
    }
}
