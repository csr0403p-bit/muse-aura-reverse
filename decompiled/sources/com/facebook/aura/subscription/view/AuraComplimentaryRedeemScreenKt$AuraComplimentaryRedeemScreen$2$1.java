package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.subscription.model.ComplimentaryRedeemAnalytics;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraComplimentaryRedeemScreenKt$AuraComplimentaryRedeemScreen$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Map<String, String> $analyticsMetadata;
    public final /* synthetic */ ComplimentaryRedeemAnalytics.Attribution $attribution;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraComplimentaryRedeemScreenKt$AuraComplimentaryRedeemScreen$2$1(ComplimentaryRedeemAnalytics.Attribution attribution, Map<String, String> map, AuraNavigator auraNavigator) {
        super(0);
        this.$attribution = attribution;
        this.$analyticsMetadata = map;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        ComplimentaryRedeemAnalytics.Attribution attribution = this.$attribution;
        hatchInteractionLogger.logClick(attribution.surface, attribution.subsurface, attribution.screen, HatchComponent.BACK_BUTTON, null, this.$analyticsMetadata, null);
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
