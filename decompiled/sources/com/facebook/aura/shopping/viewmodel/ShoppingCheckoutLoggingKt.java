package com.facebook.aura.shopping.viewmodel;

import X.AGI;
import X.AIW;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BO6;
import X.C0924AIa;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchCheckoutEntryPoint;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchShoppingControl;
import com.facebook.aura.analytics.hatch.HatchShoppingDataState;
import com.facebook.aura.analytics.hatch.HatchSurface;

/* loaded from: classes3.dex */
public abstract class ShoppingCheckoutLoggingKt {
    public static final void logActionClick(ShoppingCheckoutLogContext shoppingCheckoutLogContext, HatchShoppingControl hatchShoppingControl, String str, HatchCheckoutEntryPoint hatchCheckoutEntryPoint) {
        String value;
        AnonymousClass005.A0x(shoppingCheckoutLogContext, hatchShoppingControl, str);
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.SHOPPING;
        HatchScreen hatchScreen = shoppingCheckoutLogContext.screen;
        HatchComponent hatchComponent = HatchComponent.SHOPPING_ACTION;
        if (hatchCheckoutEntryPoint != null) {
            value = hatchCheckoutEntryPoint.getValue();
            if (value == null) {
            }
            hatchInteractionLogger.logClick(hatchSurface, null, hatchScreen, hatchComponent, null, metadata(shoppingCheckoutLogContext, hatchShoppingControl, null, str, str, value), null);
        }
        str = shoppingCheckoutLogContext.checkoutFlowId;
        value = shoppingCheckoutLogContext.checkoutEntryPoint;
        hatchInteractionLogger.logClick(hatchSurface, null, hatchScreen, hatchComponent, null, metadata(shoppingCheckoutLogContext, hatchShoppingControl, null, str, str, value), null);
    }

    public static final BO6<String, String> metadata(ShoppingCheckoutLogContext shoppingCheckoutLogContext, HatchShoppingControl hatchShoppingControl, HatchShoppingDataState hatchShoppingDataState, String str, String str2, String str3) {
        C7384Etj.A0Y(shoppingCheckoutLogContext, 0);
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put(HatchMetadataKey.SHOPPING_SURFACE.getValue(), shoppingCheckoutLogContext.surface.getValue());
        c0924AIaA0u.put(HatchMetadataKey.VIEW_ID.getValue(), shoppingCheckoutLogContext.viewId);
        String str4 = shoppingCheckoutLogContext.widgetId;
        if (str4 != null) {
            AnonymousClass001.A1C(HatchMetadataKey.WIDGET_ID, str4, c0924AIaA0u);
        }
        String str5 = shoppingCheckoutLogContext.hostMessageId;
        if (str5 != null) {
            AnonymousClass001.A1C(HatchMetadataKey.HOST_MESSAGE_ID, str5, c0924AIaA0u);
        }
        String str6 = shoppingCheckoutLogContext.provider;
        if (str6 != null) {
            AnonymousClass001.A1C(HatchMetadataKey.SHOPPING_PROVIDER, str6, c0924AIaA0u);
        }
        if (hatchShoppingControl != null) {
            c0924AIaA0u.put(HatchMetadataKey.ACTION.getValue(), hatchShoppingControl.getAction());
            c0924AIaA0u.put(HatchMetadataKey.CONTROL_ROLE.getValue(), hatchShoppingControl.getControlRole());
        }
        if (hatchShoppingDataState != null) {
            c0924AIaA0u.put(HatchMetadataKey.DATA_STATE.getValue(), hatchShoppingDataState.getValue());
        }
        if (str != null) {
            AnonymousClass001.A1C(HatchMetadataKey.CLIENT_INTERACTION_ID, str, c0924AIaA0u);
        }
        if (str2 != null) {
            AnonymousClass001.A1C(HatchMetadataKey.CHECKOUT_FLOW_ID, str2, c0924AIaA0u);
        }
        if (str3 != null) {
            AnonymousClass001.A1C(HatchMetadataKey.CHECKOUT_ENTRY_POINT, str3, c0924AIaA0u);
        }
        return AGI.A08(AIW.A0K(c0924AIaA0u));
    }

    public static /* synthetic */ void logActionClick$default(ShoppingCheckoutLogContext shoppingCheckoutLogContext, HatchShoppingControl hatchShoppingControl, String str, HatchCheckoutEntryPoint hatchCheckoutEntryPoint, int i, Object obj) {
        if ((i & 2) != 0) {
            str = AnonymousClass002.A0k();
        }
        if ((i & 4) != 0) {
            hatchCheckoutEntryPoint = null;
        }
        logActionClick(shoppingCheckoutLogContext, hatchShoppingControl, str, hatchCheckoutEntryPoint);
    }

    public static /* synthetic */ BO6 metadata$default(ShoppingCheckoutLogContext shoppingCheckoutLogContext, HatchShoppingControl hatchShoppingControl, HatchShoppingDataState hatchShoppingDataState, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchShoppingControl = null;
        }
        if ((i & 2) != 0) {
            hatchShoppingDataState = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = shoppingCheckoutLogContext.checkoutFlowId;
        }
        if ((i & 16) != 0) {
            str3 = shoppingCheckoutLogContext.checkoutEntryPoint;
        }
        return metadata(shoppingCheckoutLogContext, hatchShoppingControl, hatchShoppingDataState, str, str2, str3);
    }

    public static final String newShoppingLogId() {
        return AnonymousClass002.A0k();
    }
}
