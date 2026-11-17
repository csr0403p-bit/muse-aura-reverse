package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$finishPurchase$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$finishPurchase$1$1(AuraNavigator auraNavigator) {
        super(1);
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        AuraSubscriptionPaywallBottomSheetKt.dismissSubscriptionSheets(this.$navigator);
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        AuraSubscriptionPaywallBottomSheetKt.dismissSubscriptionSheets(this.$navigator);
    }
}
