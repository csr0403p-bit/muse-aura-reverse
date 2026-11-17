package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.C9hr;
import X.F0C;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ComplimentaryRedeemEntryPoint;
import com.facebook.aura.navigation.key.RedeemComplimentarySubscriptionScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$6$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageBottomSheet$6$1(AuraNavigator auraNavigator) {
        super(0);
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraNavigator auraNavigator = this.$navigator;
        F0C<C9hr<Object>>[] f0cArr = RedeemComplimentarySubscriptionScreenKey.$childSerializers;
        auraNavigator.navigate((AuraNavKey) new RedeemComplimentarySubscriptionScreenKey(ComplimentaryRedeemEntryPoint.SUBSCRIPTION_MANAGEMENT), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
