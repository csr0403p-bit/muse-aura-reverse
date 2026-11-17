package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import com.facebook.aura.navigation.key.AuraSubscriptionSheetKey;
import com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSettingsScreenKt$HatchSettingsScreen$navigateToSubscriptionSurface$1$1 extends AbstractC7559F3s implements G0U<AuraSubscriptionPage, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraSubscriptionPage auraSubscriptionPage) {
        C7384Etj.A0Y(auraSubscriptionPage, 0);
        this.$navigator.navigate((AuraNavKey) new AuraSubscriptionSheetKey(auraSubscriptionPage, SubscriptionPaywallEntryPoint.SETTINGS, null), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSettingsScreenKt$HatchSettingsScreen$navigateToSubscriptionSurface$1$1(AuraNavigator auraNavigator) {
        super(1);
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraSubscriptionPage auraSubscriptionPage) {
        invoke2(auraSubscriptionPage);
        return Unit.INSTANCE;
    }
}
