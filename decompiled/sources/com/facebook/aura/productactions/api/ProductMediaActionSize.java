package com.facebook.aura.productactions.api;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ProductMediaActionSize {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ProductMediaActionSize[] $VALUES;
    public static final ProductMediaActionSize Compact;
    public static final ProductMediaActionSize FullWidth;

    static {
        ProductMediaActionSize productMediaActionSize = new ProductMediaActionSize("Compact", 0);
        Compact = productMediaActionSize;
        ProductMediaActionSize productMediaActionSize2 = new ProductMediaActionSize("FullWidth", 1);
        FullWidth = productMediaActionSize2;
        ProductMediaActionSize[] productMediaActionSizeArr = {productMediaActionSize, productMediaActionSize2};
        $VALUES = productMediaActionSizeArr;
        $ENTRIES = C3cG.A0w(productMediaActionSizeArr);
    }

    public static Ey9<ProductMediaActionSize> getEntries() {
        return $ENTRIES;
    }

    public static ProductMediaActionSize valueOf(String str) {
        return (ProductMediaActionSize) Enum.valueOf(ProductMediaActionSize.class, str);
    }

    public static ProductMediaActionSize[] values() {
        return (ProductMediaActionSize[]) $VALUES.clone();
    }

    public ProductMediaActionSize(String str, int i) {
    }
}
