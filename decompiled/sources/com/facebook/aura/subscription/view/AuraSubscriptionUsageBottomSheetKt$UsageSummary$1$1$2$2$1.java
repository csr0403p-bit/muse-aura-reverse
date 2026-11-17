package com.facebook.aura.subscription.view;

import X.AGH;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass006;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.subscription.model.SubscriptionMeterDestination;
import com.facebook.aura.subscription.repo.SubscriptionManagementCta;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageBottomSheetKt$UsageSummary$1$1$2$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SubscriptionManagementCta $meterAction;
    public final /* synthetic */ SubscriptionMeterDestination $meterDestination;
    public final /* synthetic */ Function0<Unit> $onOpenPaywall;
    public final /* synthetic */ Function0<Unit> $onRedeemComplimentary;
    public final /* synthetic */ Function0<Unit> $onResubscribe;
    public final /* synthetic */ Map<String, String> $subscriptionMetadata;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscriptionMeterDestination.values().length];
            try {
                AnonymousClass002.A13(SubscriptionMeterDestination.RESUBSCRIBE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(SubscriptionMeterDestination.REDEEM_COMPLIMENTARY, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(SubscriptionMeterDestination.PAYWALL, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionUsageBottomSheetKt$UsageSummary$1$1$2$2$1(SubscriptionManagementCta subscriptionManagementCta, Map<String, String> map, SubscriptionMeterDestination subscriptionMeterDestination, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        super(0);
        this.$meterAction = subscriptionManagementCta;
        this.$subscriptionMetadata = map;
        this.$meterDestination = subscriptionMeterDestination;
        this.$onResubscribe = function0;
        this.$onRedeemComplimentary = function02;
        this.$onOpenPaywall = function03;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function0<Unit> function0;
        HatchComponent hatchComponentAnalyticsComponent = AuraSubscriptionUsageBottomSheetKt.analyticsComponent(this.$meterAction.action);
        Map mapA0E = this.$subscriptionMetadata;
        if (mapA0E == null) {
            mapA0E = AGH.A0E();
        }
        AuraSubscriptionUsageBottomSheetKt.logManagementClick(hatchComponentAnalyticsComponent, AnonymousClass006.A11(HatchMetadataKey.CTA_ACTION.getValue(), this.$meterAction.action.name(), mapA0E));
        int iOrdinal = this.$meterDestination.ordinal();
        if (iOrdinal == 1) {
            function0 = this.$onResubscribe;
        } else if (iOrdinal == 2) {
            function0 = this.$onRedeemComplimentary;
        } else {
            if (iOrdinal != 0) {
                throw new NoWhenBranchMatchedException();
            }
            function0 = this.$onOpenPaywall;
        }
        function0.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
