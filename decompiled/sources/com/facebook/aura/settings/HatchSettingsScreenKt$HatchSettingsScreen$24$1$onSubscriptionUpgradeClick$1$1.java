package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C1BO;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSettingsScreenKt$HatchSettingsScreen$24$1$onSubscriptionUpgradeClick$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<AuraSubscriptionPage, Unit> $navigateToSubscriptionSurfaceWithWaterfall;
    public final /* synthetic */ C1BO<AuraSubscriptionUsageViewModel.UiState> $subscriptionUiState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSettingsScreenKt$HatchSettingsScreen$24$1$onSubscriptionUpgradeClick$1$1(G0U<? super AuraSubscriptionPage, Unit> g0u, C1BO<? extends AuraSubscriptionUsageViewModel.UiState> c1bo) {
        super(0);
        this.$navigateToSubscriptionSurfaceWithWaterfall = g0u;
        this.$subscriptionUiState$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.CREDITS, HatchScreen.SETTINGS_MAIN, HatchComponent.UPGRADE_LINK, null, AuraSubscriptionUsageViewModelKt.subscriptionAnalyticsMetadata(this.$subscriptionUiState$delegate.getValue()), null);
        this.$navigateToSubscriptionSurfaceWithWaterfall.invoke(AuraSubscriptionPage.Paywall.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
