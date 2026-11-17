package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.subscription.repo.SubscriptionManagementCta;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageBottomSheetKt$UsageActions$6$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ String $billingSubtitle;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $isCancelling;
    public final /* synthetic */ boolean $isResubscribing;
    public final /* synthetic */ G0U<SubscriptionManagementCta, Unit> $onCancel;
    public final /* synthetic */ Function0<Unit> $onManagePayment;
    public final /* synthetic */ Function0<Unit> $onOpenPaywall;
    public final /* synthetic */ Function0<Unit> $onRedeemComplimentary;
    public final /* synthetic */ Function0<Unit> $onResubscribe;
    public final /* synthetic */ Function0<Unit> $onRetry;
    public final /* synthetic */ List<SubscriptionManagementCta> $standardRows;
    public final /* synthetic */ Map<String, String> $subscriptionMetadata;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        List<SubscriptionManagementCta> list = this.$standardRows;
        Map<String, String> map = this.$subscriptionMetadata;
        String str = this.$billingSubtitle;
        boolean z = this.$isCancelling;
        boolean z2 = this.$isResubscribing;
        Function0<Unit> function0 = this.$onManagePayment;
        G0U<SubscriptionManagementCta, Unit> g0u = this.$onCancel;
        Function0<Unit> function02 = this.$onResubscribe;
        Function0<Unit> function03 = this.$onRetry;
        Context context = this.$context;
        Function0<Unit> function04 = this.$onOpenPaywall;
        Function0<Unit> function05 = this.$onRedeemComplimentary;
        Iterator<SubscriptionManagementCta> it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass006.A1E(hatchSectionScope, new AuraSubscriptionUsageBottomSheetKt$UsageActions$6$1$1$1(it.next(), map, str, z, z2, function0, g0u, function02, function03, context, function04, function05), 109648776);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSubscriptionUsageBottomSheetKt$UsageActions$6$1(List<SubscriptionManagementCta> list, Map<String, String> map, String str, boolean z, boolean z2, Function0<Unit> function0, G0U<? super SubscriptionManagementCta, Unit> g0u, Function0<Unit> function02, Function0<Unit> function03, Context context, Function0<Unit> function04, Function0<Unit> function05) {
        super(1);
        this.$standardRows = list;
        this.$subscriptionMetadata = map;
        this.$billingSubtitle = str;
        this.$isCancelling = z;
        this.$isResubscribing = z2;
        this.$onManagePayment = function0;
        this.$onCancel = g0u;
        this.$onResubscribe = function02;
        this.$onRetry = function03;
        this.$context = context;
        this.$onOpenPaywall = function04;
        this.$onRedeemComplimentary = function05;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
