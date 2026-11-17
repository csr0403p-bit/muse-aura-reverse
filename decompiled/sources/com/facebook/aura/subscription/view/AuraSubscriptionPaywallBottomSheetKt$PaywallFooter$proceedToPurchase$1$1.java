package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C98b;
import X.C98c;
import X.C98d;
import X.C98e;
import X.C98f;
import X.G0U;
import com.facebook.aura.analytics.waterfall.HatchNMEGaiWaterfallEventLogger;
import com.facebook.aura.subscription.model.PurchaseTap;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraSubscriptionPaywallBottomSheetKt$PaywallFooter$proceedToPurchase$1$1 extends AbstractC7559F3s implements G0U<PurchaseTap, Unit> {
    public final /* synthetic */ G0U<PurchaseTap, Unit> $dispatchPurchase;
    public final /* synthetic */ C98f $nmeEntryPoint;
    public final /* synthetic */ C98d $waterfallStage;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PurchaseTap purchaseTap) {
        C7384Etj.A0Y(purchaseTap, 0);
        new HatchNMEGaiWaterfallEventLogger(null, 1, null).logEvent(C98e.COMBINED_TIER_PAYMENT_SCREEN, this.$waterfallStage, C98b.CLICK, this.$nmeEntryPoint, AuraSubscriptionPaywallBottomSheetKt.waterfallEventData(purchaseTap.payMetadata, purchaseTap.payDirection, purchaseTap.priceEventData), C98c.PAY_BUTTON, purchaseTap.selectedTier);
        this.$dispatchPurchase.invoke(purchaseTap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSubscriptionPaywallBottomSheetKt$PaywallFooter$proceedToPurchase$1$1(C98d c98d, C98f c98f, G0U<? super PurchaseTap, Unit> g0u) {
        super(1);
        this.$waterfallStage = c98d;
        this.$nmeEntryPoint = c98f;
        this.$dispatchPurchase = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(PurchaseTap purchaseTap) {
        invoke2(purchaseTap);
        return Unit.INSTANCE;
    }
}
