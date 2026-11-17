package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.devices.intf.SubscriptionAddOnManagementAction;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$10$1 extends AbstractC7559F3s implements G0U<SubscriptionAddOnManagementAction, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SubscriptionAddOnManagementAction subscriptionAddOnManagementAction) {
        C7384Etj.A0Y(subscriptionAddOnManagementAction, 0);
        this.$navigator.navigate(subscriptionAddOnManagementAction.destination, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$10$1(AuraNavigator auraNavigator) {
        super(1);
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(SubscriptionAddOnManagementAction subscriptionAddOnManagementAction) {
        invoke2(subscriptionAddOnManagementAction);
        return Unit.INSTANCE;
    }
}
