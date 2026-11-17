package com.facebook.aura.subscription.view;

import X.AGH;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.devices.intf.SubscriptionAddOnManagementAction;
import com.facebook.aura.subscription.repo.SubscriptionManagementCta;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageBottomSheetKt$UsageActions$5$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SubscriptionAddOnManagementAction $addOnManagementAction;
    public final /* synthetic */ SubscriptionManagementCta $claimRow;
    public final /* synthetic */ G0U<SubscriptionAddOnManagementAction, Unit> $onClaimSubscriptionAddOn;
    public final /* synthetic */ Map<String, String> $subscriptionMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSubscriptionUsageBottomSheetKt$UsageActions$5$1$1$1$1(Map<String, String> map, SubscriptionManagementCta subscriptionManagementCta, G0U<? super SubscriptionAddOnManagementAction, Unit> g0u, SubscriptionAddOnManagementAction subscriptionAddOnManagementAction) {
        super(0);
        this.$subscriptionMetadata = map;
        this.$claimRow = subscriptionManagementCta;
        this.$onClaimSubscriptionAddOn = g0u;
        this.$addOnManagementAction = subscriptionAddOnManagementAction;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchComponent hatchComponent = HatchComponent.MANAGE_SUBSCRIPTION_LINK;
        Map mapA0E = this.$subscriptionMetadata;
        if (mapA0E == null) {
            mapA0E = AGH.A0E();
        }
        AuraSubscriptionUsageBottomSheetKt.logManagementClick(hatchComponent, AnonymousClass006.A11(HatchMetadataKey.CTA_ACTION.getValue(), this.$claimRow.action.name(), mapA0E));
        this.$onClaimSubscriptionAddOn.invoke(this.$addOnManagementAction);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
