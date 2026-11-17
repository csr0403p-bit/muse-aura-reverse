package com.facebook.aura.subscription.view;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.devices.intf.SubscriptionAddOnIntegration;
import com.facebook.aura.navigation.AuraNavKey;

/* loaded from: classes.dex */
public final /* synthetic */ class SubscriptionSheetHelpersKt$withAddOnContinuation$1$1$2 extends C7438Evz implements G0U<AuraNavKey, Boolean> {
    public SubscriptionSheetHelpersKt$withAddOnContinuation$1$1$2(Object obj) {
        super(1, obj, SubscriptionAddOnIntegration.class, "isPrePurchaseClaim", "isPrePurchaseClaim(Lcom/facebook/aura/navigation/AuraNavKey;)Z", 0);
    }

    @Override // X.G0U
    public final Boolean invoke(AuraNavKey auraNavKey) {
        return Boolean.valueOf(((SubscriptionAddOnIntegration) AnonymousClass006.A0o(auraNavKey, this)).isPrePurchaseClaim(auraNavKey));
    }
}
