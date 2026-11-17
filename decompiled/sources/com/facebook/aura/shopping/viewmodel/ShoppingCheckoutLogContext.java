package com.facebook.aura.shopping.viewmodel;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchShoppingSurface;

/* loaded from: classes3.dex */
public final class ShoppingCheckoutLogContext extends C06G {
    public static final int $stable = 0;
    public final String checkoutEntryPoint;
    public final String checkoutFlowId;
    public final String hostMessageId;
    public final String provider;
    public final HatchScreen screen;
    public final HatchShoppingSurface surface;
    public final String viewId;
    public final String widgetId;

    public static /* synthetic */ ShoppingCheckoutLogContext copy$default(ShoppingCheckoutLogContext shoppingCheckoutLogContext, HatchShoppingSurface hatchShoppingSurface, HatchScreen hatchScreen, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        HatchShoppingSurface hatchShoppingSurface2 = hatchShoppingSurface;
        HatchScreen hatchScreen2 = hatchScreen;
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        if ((i & 1) != 0) {
            hatchShoppingSurface2 = shoppingCheckoutLogContext.surface;
        }
        if ((i & 2) != 0) {
            hatchScreen2 = shoppingCheckoutLogContext.screen;
        }
        if ((i & 4) != 0) {
            str7 = shoppingCheckoutLogContext.viewId;
        }
        if ((i & 8) != 0) {
            str8 = shoppingCheckoutLogContext.widgetId;
        }
        if ((i & 16) != 0) {
            str9 = shoppingCheckoutLogContext.hostMessageId;
        }
        if ((i & 32) != 0) {
            str10 = shoppingCheckoutLogContext.provider;
        }
        if ((i & 64) != 0) {
            str11 = shoppingCheckoutLogContext.checkoutFlowId;
        }
        if ((i & 128) != 0) {
            str12 = shoppingCheckoutLogContext.checkoutEntryPoint;
        }
        AnonymousClass005.A0x(hatchShoppingSurface2, hatchScreen2, str7);
        return new ShoppingCheckoutLogContext(hatchShoppingSurface2, hatchScreen2, str7, str8, str9, str10, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingCheckoutLogContext) {
                ShoppingCheckoutLogContext shoppingCheckoutLogContext = (ShoppingCheckoutLogContext) obj;
                if (this.surface != shoppingCheckoutLogContext.surface || this.screen != shoppingCheckoutLogContext.screen || !C7384Etj.areEqual(this.viewId, shoppingCheckoutLogContext.viewId) || !C7384Etj.areEqual(this.widgetId, shoppingCheckoutLogContext.widgetId) || !C7384Etj.areEqual(this.hostMessageId, shoppingCheckoutLogContext.hostMessageId) || !C7384Etj.areEqual(this.provider, shoppingCheckoutLogContext.provider) || !C7384Etj.areEqual(this.checkoutFlowId, shoppingCheckoutLogContext.checkoutFlowId) || !C7384Etj.areEqual(this.checkoutEntryPoint, shoppingCheckoutLogContext.checkoutEntryPoint)) {
                }
            }
            return false;
        }
        return true;
    }

    public final HatchShoppingSurface component1() {
        return this.surface;
    }

    public final HatchScreen component2() {
        return this.screen;
    }

    public final String component3() {
        return this.viewId;
    }

    public final String component4() {
        return this.widgetId;
    }

    public final String component5() {
        return this.hostMessageId;
    }

    public final String component6() {
        return this.provider;
    }

    public final String component7() {
        return this.checkoutFlowId;
    }

    public final String component8() {
        return this.checkoutEntryPoint;
    }

    public final String getCheckoutEntryPoint() {
        return this.checkoutEntryPoint;
    }

    public final String getCheckoutFlowId() {
        return this.checkoutFlowId;
    }

    public final String getHostMessageId() {
        return this.hostMessageId;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final HatchScreen getScreen() {
        return this.screen;
    }

    public final HatchShoppingSurface getSurface() {
        return this.surface;
    }

    public final String getViewId() {
        return this.viewId;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return ((((((((AnonymousClass005.A0I(this.viewId, AnonymousClass005.A0F(this.screen, AnonymousClass005.A0E(this.surface))) + AnonymousClass006.A0G(this.widgetId)) * 31) + AnonymousClass006.A0G(this.hostMessageId)) * 31) + AnonymousClass006.A0G(this.provider)) * 31) + AnonymousClass006.A0G(this.checkoutFlowId)) * 31) + AnonymousClass005.A0H(this.checkoutEntryPoint);
    }

    public ShoppingCheckoutLogContext(HatchShoppingSurface hatchShoppingSurface, HatchScreen hatchScreen, String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass005.A0x(hatchShoppingSurface, hatchScreen, str);
        this.surface = hatchShoppingSurface;
        this.screen = hatchScreen;
        this.viewId = str;
        this.widgetId = str2;
        this.hostMessageId = str3;
        this.provider = str4;
        this.checkoutFlowId = str5;
        this.checkoutEntryPoint = str6;
    }

    public final ShoppingCheckoutLogContext copy(HatchShoppingSurface hatchShoppingSurface, HatchScreen hatchScreen, String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass005.A0x(hatchShoppingSurface, hatchScreen, str);
        return new ShoppingCheckoutLogContext(hatchShoppingSurface, hatchScreen, str, str2, str3, str4, str5, str6);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingCheckoutLogContext(HatchShoppingSurface hatchShoppingSurface, HatchScreen hatchScreen, String str, String str2, String str3, String str4, String str5, String str6, int i, C06H c06h) {
        this(hatchShoppingSurface, hatchScreen, str, str2, str3, str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6);
    }
}
