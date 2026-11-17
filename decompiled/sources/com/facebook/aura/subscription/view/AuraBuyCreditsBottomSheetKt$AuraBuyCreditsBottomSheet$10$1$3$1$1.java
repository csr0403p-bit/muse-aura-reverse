package com.facebook.aura.subscription.view;

import X.AIW;
import X.AbstractC7559F3s;
import X.C0924AIa;
import X.C3cG;
import X.C7384Etj;
import X.C98b;
import X.C98d;
import X.C98e;
import X.C98f;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.analytics.waterfall.HatchNMEGaiWaterfallEventLogger;
import com.facebook.aura.status.viewmodel.CreditProduct;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$10$1$3$1$1 extends AbstractC7559F3s implements G0U<CreditProduct, Unit> {
    public final /* synthetic */ C98f $entrypoint;
    public final /* synthetic */ String $prevSurface;
    public final /* synthetic */ MutableState<String> $selectedProductId$delegate;
    public final /* synthetic */ HatchNMEGaiWaterfallEventLogger $waterfallLogger;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CreditProduct creditProduct) {
        C7384Etj.A0Y(creditProduct, 0);
        this.$selectedProductId$delegate.Af8(creditProduct.id);
        HatchNMEGaiWaterfallEventLogger hatchNMEGaiWaterfallEventLogger = this.$waterfallLogger;
        C98e c98e = C98e.CONSUMABLE_PAYMENT_SCREEN;
        C98d c98d = C98d.MANAGEMENT;
        C98b c98b = C98b.CLICK;
        C98f c98f = this.$entrypoint;
        String str = this.$prevSurface;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put("product_id", creditProduct.id);
        c0924AIaA0u.put("credit_amount", creditProduct.creditAmountText);
        c0924AIaA0u.put("prev_surface", str);
        hatchNMEGaiWaterfallEventLogger.logEvent(c98e, c98d, c98b, c98f, AIW.A0K(c0924AIaA0u), null, null);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.MONETIZATION, HatchSubsurface.CREDITS_SHEET, HatchScreen.BUY_MORE_CREDITS, HatchComponent.CREDIT_PRODUCT_OPTION, null, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBuyCreditsBottomSheetKt$AuraBuyCreditsBottomSheet$10$1$3$1$1(HatchNMEGaiWaterfallEventLogger hatchNMEGaiWaterfallEventLogger, C98f c98f, MutableState<String> mutableState, String str) {
        super(1);
        this.$waterfallLogger = hatchNMEGaiWaterfallEventLogger;
        this.$entrypoint = c98f;
        this.$selectedProductId$delegate = mutableState;
        this.$prevSurface = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(CreditProduct creditProduct) {
        invoke2(creditProduct);
        return Unit.INSTANCE;
    }
}
