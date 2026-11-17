package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallContent$onPurchaseConfirmed$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $purchaseToast;
    public final /* synthetic */ G0U<String, Unit> $showDismissToast;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSubscriptionPaywallBottomSheetKt$AuraSubscriptionPaywallContent$onPurchaseConfirmed$1$1(String str, G0U<? super String, Unit> g0u, AuraNavigator auraNavigator) {
        super(0);
        this.$purchaseToast = str;
        this.$showDismissToast = g0u;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String str = this.$purchaseToast;
        if (str != null) {
            this.$showDismissToast.invoke(str);
        }
        AuraSubscriptionPaywallBottomSheetKt.dismissSubscriptionSheets(this.$navigator);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
