package com.facebook.aura.shopping.repo;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ProductDetailsActionButton {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ProductDetailsActionButton[] $VALUES;
    public static final ProductDetailsActionButton BUY;
    public static final ProductDetailsActionButton WEBSITE;
    public final String wireValue;

    static {
        ProductDetailsActionButton productDetailsActionButton = new ProductDetailsActionButton("BUY", 0, "buy");
        BUY = productDetailsActionButton;
        ProductDetailsActionButton productDetailsActionButton2 = new ProductDetailsActionButton("WEBSITE", 1, "website");
        WEBSITE = productDetailsActionButton2;
        ProductDetailsActionButton[] productDetailsActionButtonArr = {productDetailsActionButton, productDetailsActionButton2};
        $VALUES = productDetailsActionButtonArr;
        $ENTRIES = C3cG.A0w(productDetailsActionButtonArr);
    }

    public static Ey9<ProductDetailsActionButton> getEntries() {
        return $ENTRIES;
    }

    public static ProductDetailsActionButton valueOf(String str) {
        return (ProductDetailsActionButton) Enum.valueOf(ProductDetailsActionButton.class, str);
    }

    public static ProductDetailsActionButton[] values() {
        return (ProductDetailsActionButton[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public ProductDetailsActionButton(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
