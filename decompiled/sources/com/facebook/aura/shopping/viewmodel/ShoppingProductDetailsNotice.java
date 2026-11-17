package com.facebook.aura.shopping.viewmodel;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ShoppingProductDetailsNotice {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ShoppingProductDetailsNotice[] $VALUES;
    public static final ShoppingProductDetailsNotice LOAD_FAILED;
    public static final ShoppingProductDetailsNotice UNAVAILABLE;

    static {
        ShoppingProductDetailsNotice shoppingProductDetailsNotice = new ShoppingProductDetailsNotice("LOAD_FAILED", 0);
        LOAD_FAILED = shoppingProductDetailsNotice;
        ShoppingProductDetailsNotice shoppingProductDetailsNotice2 = new ShoppingProductDetailsNotice("UNAVAILABLE", 1);
        UNAVAILABLE = shoppingProductDetailsNotice2;
        ShoppingProductDetailsNotice[] shoppingProductDetailsNoticeArr = {shoppingProductDetailsNotice, shoppingProductDetailsNotice2};
        $VALUES = shoppingProductDetailsNoticeArr;
        $ENTRIES = C3cG.A0w(shoppingProductDetailsNoticeArr);
    }

    public static Ey9<ShoppingProductDetailsNotice> getEntries() {
        return $ENTRIES;
    }

    public static ShoppingProductDetailsNotice valueOf(String str) {
        return (ShoppingProductDetailsNotice) Enum.valueOf(ShoppingProductDetailsNotice.class, str);
    }

    public static ShoppingProductDetailsNotice[] values() {
        return (ShoppingProductDetailsNotice[]) $VALUES.clone();
    }

    public ShoppingProductDetailsNotice(String str, int i) {
    }
}
