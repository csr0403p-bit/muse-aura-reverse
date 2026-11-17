package com.facebook.aura.shopping.viewmodel;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ShoppingProductDetailsPriceIssue {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ShoppingProductDetailsPriceIssue[] $VALUES;
    public static final ShoppingProductDetailsPriceIssue LOAD_FAILED;
    public static final ShoppingProductDetailsPriceIssue UNAVAILABLE;

    static {
        ShoppingProductDetailsPriceIssue shoppingProductDetailsPriceIssue = new ShoppingProductDetailsPriceIssue("LOAD_FAILED", 0);
        LOAD_FAILED = shoppingProductDetailsPriceIssue;
        ShoppingProductDetailsPriceIssue shoppingProductDetailsPriceIssue2 = new ShoppingProductDetailsPriceIssue("UNAVAILABLE", 1);
        UNAVAILABLE = shoppingProductDetailsPriceIssue2;
        ShoppingProductDetailsPriceIssue[] shoppingProductDetailsPriceIssueArr = {shoppingProductDetailsPriceIssue, shoppingProductDetailsPriceIssue2};
        $VALUES = shoppingProductDetailsPriceIssueArr;
        $ENTRIES = C3cG.A0w(shoppingProductDetailsPriceIssueArr);
    }

    public static Ey9<ShoppingProductDetailsPriceIssue> getEntries() {
        return $ENTRIES;
    }

    public static ShoppingProductDetailsPriceIssue valueOf(String str) {
        return (ShoppingProductDetailsPriceIssue) Enum.valueOf(ShoppingProductDetailsPriceIssue.class, str);
    }

    public static ShoppingProductDetailsPriceIssue[] values() {
        return (ShoppingProductDetailsPriceIssue[]) $VALUES.clone();
    }

    public ShoppingProductDetailsPriceIssue(String str, int i) {
    }
}
