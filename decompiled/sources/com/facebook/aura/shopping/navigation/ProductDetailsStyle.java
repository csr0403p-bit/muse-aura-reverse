package com.facebook.aura.shopping.navigation;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ProductDetailsStyle {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ProductDetailsStyle[] $VALUES;
    public static final ProductDetailsStyle INSTACART;
    public static final ProductDetailsStyle SHOPPING;

    static {
        ProductDetailsStyle productDetailsStyle = new ProductDetailsStyle("SHOPPING", 0);
        SHOPPING = productDetailsStyle;
        ProductDetailsStyle productDetailsStyle2 = new ProductDetailsStyle("INSTACART", 1);
        INSTACART = productDetailsStyle2;
        ProductDetailsStyle[] productDetailsStyleArr = {productDetailsStyle, productDetailsStyle2};
        $VALUES = productDetailsStyleArr;
        $ENTRIES = C3cG.A0w(productDetailsStyleArr);
    }

    public static Ey9<ProductDetailsStyle> getEntries() {
        return $ENTRIES;
    }

    public static ProductDetailsStyle valueOf(String str) {
        return (ProductDetailsStyle) Enum.valueOf(ProductDetailsStyle.class, str);
    }

    public static ProductDetailsStyle[] values() {
        return (ProductDetailsStyle[]) $VALUES.clone();
    }

    public ProductDetailsStyle(String str, int i) {
    }
}
