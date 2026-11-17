package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.navigation.key.ComplimentaryRedeemEntryPoint;
import com.facebook.aura.subscription.model.AuraComplimentaryRedeemViewModel;
import com.facebook.aura.subscription.model.ComplimentaryRedeemAnalytics;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraComplimentaryRedeemScreenKt$AuraComplimentaryRedeemScreen$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Map<String, String> $analyticsMetadata;
    public final /* synthetic */ ComplimentaryRedeemAnalytics.Attribution $attribution;
    public final /* synthetic */ ComplimentaryRedeemEntryPoint $entryPoint;
    public final /* synthetic */ AuraComplimentaryRedeemViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraComplimentaryRedeemScreenKt$AuraComplimentaryRedeemScreen$3$1(ComplimentaryRedeemAnalytics.Attribution attribution, Map<String, String> map, AuraComplimentaryRedeemViewModel auraComplimentaryRedeemViewModel, ComplimentaryRedeemEntryPoint complimentaryRedeemEntryPoint) {
        super(0);
        this.$attribution = attribution;
        this.$analyticsMetadata = map;
        this.$viewModel = auraComplimentaryRedeemViewModel;
        this.$entryPoint = complimentaryRedeemEntryPoint;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        ComplimentaryRedeemAnalytics.Attribution attribution = this.$attribution;
        hatchInteractionLogger.logClick(attribution.surface, attribution.subsurface, attribution.screen, HatchComponent.REDEEM_COMPLIMENTARY_SUBSCRIPTION_BUTTON, null, this.$analyticsMetadata, null);
        this.$viewModel.redeem(this.$entryPoint);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
