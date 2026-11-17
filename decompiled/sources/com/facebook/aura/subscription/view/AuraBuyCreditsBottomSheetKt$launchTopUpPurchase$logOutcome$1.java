package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraBuyCreditsBottomSheetKt$launchTopUpPurchase$logOutcome$1 extends AbstractC7559F3s implements G0V<String, String, Unit> {
    public final /* synthetic */ Map<String, String> $payMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBuyCreditsBottomSheetKt$launchTopUpPurchase$logOutcome$1(Map<String, String> map) {
        super(2);
        this.$payMetadata = map;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        SubscriptionSheetHelpersKt.logCheckoutOutcome(HatchSubsurface.CREDITS_SHEET, HatchScreen.BUY_MORE_CREDITS, this.$payMetadata, str, str2);
    }
}
