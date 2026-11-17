package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.devices.intf.SubscriptionAddOnManagementAction;
import com.facebook.aura.subscription.repo.SubscriptionManagementCta;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageBottomSheetKt$UsageActions$5$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ SubscriptionAddOnManagementAction $addOnManagementAction;
    public final /* synthetic */ SubscriptionManagementCta $claimRow;
    public final /* synthetic */ G0U<SubscriptionAddOnManagementAction, Unit> $onClaimSubscriptionAddOn;
    public final /* synthetic */ Map<String, String> $subscriptionMetadata;

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$UsageActions$5$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ SubscriptionAddOnManagementAction $addOnManagementAction;
        public final /* synthetic */ SubscriptionManagementCta $claimRow;
        public final /* synthetic */ G0U<SubscriptionAddOnManagementAction, Unit> $onClaimSubscriptionAddOn;
        public final /* synthetic */ Map<String, String> $subscriptionMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(SubscriptionManagementCta subscriptionManagementCta, Map<String, String> map, G0U<? super SubscriptionAddOnManagementAction, Unit> g0u, SubscriptionAddOnManagementAction subscriptionAddOnManagementAction) {
            super(3);
            this.$claimRow = subscriptionManagementCta;
            this.$subscriptionMetadata = map;
            this.$onClaimSubscriptionAddOn = g0u;
            this.$addOnManagementAction = subscriptionAddOnManagementAction;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                SubscriptionManagementCta subscriptionManagementCta = this.$claimRow;
                String str = subscriptionManagementCta.label;
                String str2 = subscriptionManagementCta.subtitle;
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$addOnManagementAction, AnonymousClass001.A1R(bfm, this.$onClaimSubscriptionAddOn, AnonymousClass001.A1T(bfm, this.$claimRow, bfm.A67(this.$subscriptionMetadata))));
                Map<String, String> map = this.$subscriptionMetadata;
                SubscriptionManagementCta subscriptionManagementCta2 = this.$claimRow;
                G0U<SubscriptionAddOnManagementAction, Unit> g0u = this.$onClaimSubscriptionAddOn;
                SubscriptionAddOnManagementAction subscriptionAddOnManagementAction = this.$addOnManagementAction;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new AuraSubscriptionUsageBottomSheetKt$UsageActions$5$1$1$1$1(map, subscriptionManagementCta2, g0u, subscriptionAddOnManagementAction);
                    bfm.Ai0(objAaT);
                }
                HomeLinkClaimCardKt.HomeLinkClaimCard(str, str2, (Function0) objAaT, null, null, bfm, 0, 24);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$claimRow, this.$subscriptionMetadata, this.$onClaimSubscriptionAddOn, this.$addOnManagementAction), 2112209902);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraSubscriptionUsageBottomSheetKt$UsageActions$5$1(SubscriptionManagementCta subscriptionManagementCta, Map<String, String> map, G0U<? super SubscriptionAddOnManagementAction, Unit> g0u, SubscriptionAddOnManagementAction subscriptionAddOnManagementAction) {
        super(1);
        this.$claimRow = subscriptionManagementCta;
        this.$subscriptionMetadata = map;
        this.$onClaimSubscriptionAddOn = g0u;
        this.$addOnManagementAction = subscriptionAddOnManagementAction;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
