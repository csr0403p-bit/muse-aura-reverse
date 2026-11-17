package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C98b;
import X.C98d;
import X.C98e;
import X.C98f;
import X.G0U;
import com.facebook.aura.analytics.waterfall.HatchNMEGaiWaterfallEventLogger;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraBuyCreditsBottomSheetKt$launchTopUpPurchase$logWaterfall$1 extends AbstractC7559F3s implements G0U<C98b, Unit> {
    public final /* synthetic */ C98f $entrypoint;
    public final /* synthetic */ Map<String, String> $payMetadata;
    public final /* synthetic */ HatchNMEGaiWaterfallEventLogger $waterfallLogger;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C98b c98b) {
        C7384Etj.A0Y(c98b, 0);
        this.$waterfallLogger.logEvent(C98e.CONSUMABLE_PAYMENT_SCREEN, C98d.MANAGEMENT, c98b, this.$entrypoint, this.$payMetadata, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBuyCreditsBottomSheetKt$launchTopUpPurchase$logWaterfall$1(HatchNMEGaiWaterfallEventLogger hatchNMEGaiWaterfallEventLogger, C98f c98f, Map<String, String> map) {
        super(1);
        this.$waterfallLogger = hatchNMEGaiWaterfallEventLogger;
        this.$entrypoint = c98f;
        this.$payMetadata = map;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C98b c98b) {
        invoke2(c98b);
        return Unit.INSTANCE;
    }
}
