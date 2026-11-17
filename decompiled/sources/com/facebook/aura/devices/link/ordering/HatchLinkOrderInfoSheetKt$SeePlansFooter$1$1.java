package com.facebook.aura.devices.link.ordering;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import com.facebook.aura.navigation.key.AuraSubscriptionSheetKey;
import com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchLinkOrderInfoSheetKt$SeePlansFooter$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLinkOrderInfoSheetKt$SeePlansFooter$1$1(AuraNavigator auraNavigator) {
        super(0);
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchLinkOrderLogger.INSTANCE.logSeePlans();
        this.$navigator.navigate((AuraNavKey) new AuraSubscriptionSheetKey(AuraSubscriptionPage.Paywall.INSTANCE, SubscriptionPaywallEntryPoint.HOME_LINK_CLAIM, null), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
