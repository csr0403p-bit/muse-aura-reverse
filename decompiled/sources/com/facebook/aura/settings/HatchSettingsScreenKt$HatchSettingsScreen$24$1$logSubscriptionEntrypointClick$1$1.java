package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C98f;
import com.facebook.aura.analytics.waterfall.HatchNMEEntrypointLogger;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSettingsScreenKt$HatchSettingsScreen$24$1$logSubscriptionEntrypointClick$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<AuraSubscriptionUsageViewModel.UiState> $subscriptionUiState$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        new HatchNMEEntrypointLogger(null, 1, null).logClick(C98f.A04, HatchSettingsScreenKt.entrypointViewerData(this.$subscriptionUiState$delegate.getValue()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSettingsScreenKt$HatchSettingsScreen$24$1$logSubscriptionEntrypointClick$1$1(C1BO<? extends AuraSubscriptionUsageViewModel.UiState> c1bo) {
        super(0);
        this.$subscriptionUiState$delegate = c1bo;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
