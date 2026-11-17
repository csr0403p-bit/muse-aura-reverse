package com.meta.maps.core;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ProductSurface {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ProductSurface[] $VALUES;
    public static final ProductSurface C50;
    public static final ProductSurface CODE_HN;
    public static final ProductSurface CODE_MB;
    public static final ProductSurface CODE_SN;
    public static final ProductSurface CONFIDENTIAL;
    public static final ProductSurface DEMO;
    public static final ProductSurface FB;
    public static final ProductSurface HATCH;
    public static final ProductSurface HN_SYSTEM_UI;
    public static final ProductSurface LOJA;
    public static final ProductSurface META_AI;
    public static final ProductSurface NAVSDK_EVAL;
    public static final ProductSurface REPLAY;
    public static final ProductSurface TESTING;
    public static final ProductSurface UNKNOWN;
    public static final ProductSurface XR_MAPS_APP;
    public static final ProductSurface XR_MAPS_APP_QA;
    public final int value;

    static {
        ProductSurface productSurface = new ProductSurface("C50", 0, 0);
        C50 = productSurface;
        ProductSurface productSurface2 = new ProductSurface("CODE_HN", 1, 1);
        CODE_HN = productSurface2;
        ProductSurface productSurface3 = new ProductSurface("CODE_MB", 2, 2);
        CODE_MB = productSurface3;
        ProductSurface productSurface4 = new ProductSurface("CODE_SN", 3, 3);
        CODE_SN = productSurface4;
        ProductSurface productSurface5 = new ProductSurface("CONFIDENTIAL", 4, 4);
        CONFIDENTIAL = productSurface5;
        ProductSurface productSurface6 = new ProductSurface("DEMO", 5, 5);
        DEMO = productSurface6;
        ProductSurface productSurface7 = new ProductSurface("META_AI", 6, 6);
        META_AI = productSurface7;
        ProductSurface productSurface8 = new ProductSurface("REPLAY", 7, 7);
        REPLAY = productSurface8;
        ProductSurface productSurface9 = new ProductSurface("TESTING", 8, 8);
        TESTING = productSurface9;
        ProductSurface productSurface10 = new ProductSurface("UNKNOWN", 9, 9);
        UNKNOWN = productSurface10;
        ProductSurface productSurface11 = new ProductSurface("XR_MAPS_APP", 10, 10);
        XR_MAPS_APP = productSurface11;
        ProductSurface productSurface12 = new ProductSurface("XR_MAPS_APP_QA", 11, 11);
        XR_MAPS_APP_QA = productSurface12;
        ProductSurface productSurface13 = new ProductSurface("HN_SYSTEM_UI", 12, 12);
        HN_SYSTEM_UI = productSurface13;
        ProductSurface productSurface14 = new ProductSurface("NAVSDK_EVAL", 13, 13);
        NAVSDK_EVAL = productSurface14;
        ProductSurface productSurface15 = new ProductSurface("FB", 14, 14);
        FB = productSurface15;
        ProductSurface productSurface16 = new ProductSurface("LOJA", 15, 15);
        LOJA = productSurface16;
        ProductSurface productSurface17 = new ProductSurface("HATCH", 16, 16);
        HATCH = productSurface17;
        ProductSurface[] productSurfaceArr = {productSurface, productSurface2, productSurface3, productSurface4, productSurface5, productSurface6, productSurface7, productSurface8, productSurface9, productSurface10, productSurface11, productSurface12, productSurface13, productSurface14, productSurface15, productSurface16, productSurface17};
        $VALUES = productSurfaceArr;
        $ENTRIES = C3cG.A0w(productSurfaceArr);
    }

    public static Ey9<ProductSurface> getEntries() {
        return $ENTRIES;
    }

    public static ProductSurface valueOf(String str) {
        return (ProductSurface) Enum.valueOf(ProductSurface.class, str);
    }

    public static ProductSurface[] values() {
        return (ProductSurface[]) $VALUES.clone();
    }

    public ProductSurface(String str, int i, int i2) {
        this.value = i2;
    }
}
