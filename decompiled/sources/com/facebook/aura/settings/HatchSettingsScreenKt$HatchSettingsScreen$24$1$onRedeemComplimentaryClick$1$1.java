package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C9hr;
import X.F0C;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ComplimentaryRedeemEntryPoint;
import com.facebook.aura.navigation.key.RedeemComplimentarySubscriptionScreenKey;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSettingsScreenKt$HatchSettingsScreen$24$1$onRedeemComplimentaryClick$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $logSubscriptionEntrypointClick;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C1BO<AuraSubscriptionUsageViewModel.UiState> $subscriptionUiState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSettingsScreenKt$HatchSettingsScreen$24$1$onRedeemComplimentaryClick$1$1(Function0<Unit> function0, AuraNavigator auraNavigator, C1BO<? extends AuraSubscriptionUsageViewModel.UiState> c1bo) {
        super(0);
        this.$logSubscriptionEntrypointClick = function0;
        this.$navigator = auraNavigator;
        this.$subscriptionUiState$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.SUBSCRIPTION, HatchScreen.SETTINGS_MAIN, HatchComponent.REDEEM_COMPLIMENTARY_SUBSCRIPTION_LINK, null, AuraSubscriptionUsageViewModelKt.subscriptionAnalyticsMetadata(this.$subscriptionUiState$delegate.getValue()), null);
        this.$logSubscriptionEntrypointClick.invoke();
        AuraNavigator auraNavigator = this.$navigator;
        F0C<C9hr<Object>>[] f0cArr = RedeemComplimentarySubscriptionScreenKey.$childSerializers;
        auraNavigator.navigate((AuraNavKey) new RedeemComplimentarySubscriptionScreenKey(ComplimentaryRedeemEntryPoint.SETTINGS), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
