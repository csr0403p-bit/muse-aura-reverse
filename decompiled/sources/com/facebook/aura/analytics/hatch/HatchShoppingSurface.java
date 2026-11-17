package com.facebook.aura.analytics.hatch;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchShoppingSurface {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchShoppingSurface[] $VALUES;
    public static final HatchShoppingSurface CART_PANEL;
    public static final HatchShoppingSurface CART_WIDGET;
    public static final HatchShoppingSurface CHECKOUT_OFFER;
    public final String value;

    static {
        HatchShoppingSurface hatchShoppingSurface = new HatchShoppingSurface("CART_WIDGET", 0, "cart_widget");
        CART_WIDGET = hatchShoppingSurface;
        HatchShoppingSurface hatchShoppingSurface2 = new HatchShoppingSurface("CART_PANEL", 1, "cart_panel");
        CART_PANEL = hatchShoppingSurface2;
        HatchShoppingSurface hatchShoppingSurface3 = new HatchShoppingSurface("CHECKOUT_OFFER", 2, "checkout_offer");
        CHECKOUT_OFFER = hatchShoppingSurface3;
        HatchShoppingSurface[] hatchShoppingSurfaceArr = {hatchShoppingSurface, hatchShoppingSurface2, hatchShoppingSurface3};
        $VALUES = hatchShoppingSurfaceArr;
        $ENTRIES = C3cG.A0w(hatchShoppingSurfaceArr);
    }

    public static Ey9<HatchShoppingSurface> getEntries() {
        return $ENTRIES;
    }

    public static HatchShoppingSurface valueOf(String str) {
        return (HatchShoppingSurface) Enum.valueOf(HatchShoppingSurface.class, str);
    }

    public static HatchShoppingSurface[] values() {
        return (HatchShoppingSurface[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchShoppingSurface(String str, int i, String str2) {
        this.value = str2;
    }
}
