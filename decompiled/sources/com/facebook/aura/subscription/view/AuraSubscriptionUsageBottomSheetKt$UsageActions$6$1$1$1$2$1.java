package com.facebook.aura.subscription.view;

import X.AGH;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C07C;
import X.G0U;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.subscription.repo.SubscriptionManagementAction;
import com.facebook.aura.subscription.repo.SubscriptionManagementCta;
import com.facebook.aura.utils.navigation.SecureUriKt;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageBottomSheetKt$UsageActions$6$1$1$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ G0U<SubscriptionManagementCta, Unit> $onCancel;
    public final /* synthetic */ Function0<Unit> $onManagePayment;
    public final /* synthetic */ Function0<Unit> $onOpenPaywall;
    public final /* synthetic */ Function0<Unit> $onRedeemComplimentary;
    public final /* synthetic */ Function0<Unit> $onResubscribe;
    public final /* synthetic */ Function0<Unit> $onRetry;
    public final /* synthetic */ SubscriptionManagementCta $row;
    public final /* synthetic */ Map<String, String> $subscriptionMetadata;
    public final /* synthetic */ C07C $this_item;

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscriptionManagementAction.values().length];
            try {
                AnonymousClass002.A13(SubscriptionManagementAction.MANAGE_BILLING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(SubscriptionManagementAction.CANCEL, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(SubscriptionManagementAction.REACTIVATE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(SubscriptionManagementAction.REFRESH, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(SubscriptionManagementAction.OPEN_URL, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(SubscriptionManagementAction.OPEN_PAYWALL, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(SubscriptionManagementAction.CHANGE_PLAN, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(SubscriptionManagementAction.PURCHASE, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(SubscriptionManagementAction.BUY_TOPUP, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(SubscriptionManagementAction.REDEEM_COMPLIMENTARY, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(SubscriptionManagementAction.CLAIM_META_HOME_LINK, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(SubscriptionManagementAction.DISMISS, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSubscriptionUsageBottomSheetKt$UsageActions$6$1$1$1$2$1(SubscriptionManagementCta subscriptionManagementCta, Map<String, String> map, Function0<Unit> function0, G0U<? super SubscriptionManagementCta, Unit> g0u, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, C07C c07c, Context context) {
        super(0);
        this.$row = subscriptionManagementCta;
        this.$subscriptionMetadata = map;
        this.$onManagePayment = function0;
        this.$onCancel = g0u;
        this.$onResubscribe = function02;
        this.$onRetry = function03;
        this.$onOpenPaywall = function04;
        this.$onRedeemComplimentary = function05;
        this.$this_item = c07c;
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function0<Unit> function0;
        HatchComponent hatchComponentAnalyticsComponent = AuraSubscriptionUsageBottomSheetKt.analyticsComponent(this.$row.action);
        Map mapA0E = this.$subscriptionMetadata;
        if (mapA0E == null) {
            mapA0E = AGH.A0E();
        }
        AuraSubscriptionUsageBottomSheetKt.logManagementClick(hatchComponentAnalyticsComponent, AnonymousClass006.A11(HatchMetadataKey.CTA_ACTION.getValue(), this.$row.action.name(), mapA0E));
        SubscriptionManagementCta subscriptionManagementCta = this.$row;
        switch (subscriptionManagementCta.action.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
                function0 = this.$onOpenPaywall;
                break;
            case 4:
                function0 = this.$onManagePayment;
                break;
            case 5:
                this.$onCancel.invoke(subscriptionManagementCta);
                return;
            case 6:
                function0 = this.$onResubscribe;
                break;
            case 7:
                String str = subscriptionManagementCta.url;
                if (str != null) {
                    try {
                        SecureUriKt.openInApp(SecureUriKt.asSecureUri(str), this.$context);
                        return;
                    } catch (Throwable th) {
                        Hwg.A01(th);
                        return;
                    }
                }
                return;
            case 8:
                function0 = this.$onRetry;
                break;
            case 9:
            case 11:
                return;
            case 10:
                function0 = this.$onRedeemComplimentary;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        function0.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
