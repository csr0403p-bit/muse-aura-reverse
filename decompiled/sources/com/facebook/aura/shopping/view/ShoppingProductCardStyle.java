package com.facebook.aura.shopping.view;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ShoppingProductCardStyle {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ShoppingProductCardStyle[] $VALUES;
    public static final ShoppingProductCardStyle DEFAULT;
    public static final ShoppingProductCardStyle PARTNER;

    static {
        ShoppingProductCardStyle shoppingProductCardStyle = new ShoppingProductCardStyle("DEFAULT", 0);
        DEFAULT = shoppingProductCardStyle;
        ShoppingProductCardStyle shoppingProductCardStyle2 = new ShoppingProductCardStyle("PARTNER", 1);
        PARTNER = shoppingProductCardStyle2;
        ShoppingProductCardStyle[] shoppingProductCardStyleArr = {shoppingProductCardStyle, shoppingProductCardStyle2};
        $VALUES = shoppingProductCardStyleArr;
        $ENTRIES = C3cG.A0w(shoppingProductCardStyleArr);
    }

    public static Ey9<ShoppingProductCardStyle> getEntries() {
        return $ENTRIES;
    }

    public static ShoppingProductCardStyle valueOf(String str) {
        return (ShoppingProductCardStyle) Enum.valueOf(ShoppingProductCardStyle.class, str);
    }

    public static ShoppingProductCardStyle[] values() {
        return (ShoppingProductCardStyle[]) $VALUES.clone();
    }

    public ShoppingProductCardStyle(String str, int i) {
    }
}
