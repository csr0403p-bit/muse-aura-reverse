package com.facebook.aura.analytics.hatch;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.model.TextWithButtonPresentationJsonKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchShoppingControl {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchShoppingControl[] $VALUES;
    public static final HatchShoppingControl CART_OPEN;
    public static final HatchShoppingControl CART_PROVIDER_LINK;
    public static final HatchShoppingControl CART_REQUEST_CHECKOUT;
    public static final HatchShoppingControl CHECKOUT_OFFER_LINK;
    public final String action;
    public final String controlRole;

    static {
        HatchShoppingControl hatchShoppingControl = new HatchShoppingControl("CART_OPEN", 0, "open_cart", TextWithButtonPresentationJsonKt.TEXT_WITH_BUTTON_STYLE_PRIMARY);
        CART_OPEN = hatchShoppingControl;
        HatchShoppingControl hatchShoppingControl2 = new HatchShoppingControl("CART_REQUEST_CHECKOUT", 1, "request_checkout_assistance", TextWithButtonPresentationJsonKt.TEXT_WITH_BUTTON_STYLE_PRIMARY);
        CART_REQUEST_CHECKOUT = hatchShoppingControl2;
        HatchShoppingControl hatchShoppingControl3 = new HatchShoppingControl("CART_PROVIDER_LINK", 2, "open_provider_cart", "secondary");
        CART_PROVIDER_LINK = hatchShoppingControl3;
        HatchShoppingControl hatchShoppingControl4 = new HatchShoppingControl("CHECKOUT_OFFER_LINK", 3, "open_provider_cart", "inline_link");
        CHECKOUT_OFFER_LINK = hatchShoppingControl4;
        HatchShoppingControl[] hatchShoppingControlArr = {hatchShoppingControl, hatchShoppingControl2, hatchShoppingControl3, hatchShoppingControl4};
        $VALUES = hatchShoppingControlArr;
        $ENTRIES = C3cG.A0w(hatchShoppingControlArr);
    }

    public static Ey9<HatchShoppingControl> getEntries() {
        return $ENTRIES;
    }

    public static HatchShoppingControl valueOf(String str) {
        return (HatchShoppingControl) Enum.valueOf(HatchShoppingControl.class, str);
    }

    public static HatchShoppingControl[] values() {
        return (HatchShoppingControl[]) $VALUES.clone();
    }

    public final String getAction() {
        return this.action;
    }

    public final String getControlRole() {
        return this.controlRole;
    }

    public HatchShoppingControl(String str, int i, String str2, String str3) {
        this.action = str2;
        this.controlRole = str3;
    }
}
