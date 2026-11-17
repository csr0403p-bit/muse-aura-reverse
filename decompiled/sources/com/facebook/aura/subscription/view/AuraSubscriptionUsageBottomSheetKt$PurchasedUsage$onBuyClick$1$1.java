package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageBottomSheetKt$PurchasedUsage$onBuyClick$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onBuyExtraUsage;
    public final /* synthetic */ Map<String, String> $subscriptionMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionUsageBottomSheetKt$PurchasedUsage$onBuyClick$1$1(Map<String, String> map, Function0<Unit> function0) {
        super(0);
        this.$subscriptionMetadata = map;
        this.$onBuyExtraUsage = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraSubscriptionUsageBottomSheetKt.logManagementClick(HatchComponent.BUY_MORE_CREDITS_ROW, this.$subscriptionMetadata);
        this.$onBuyExtraUsage.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
