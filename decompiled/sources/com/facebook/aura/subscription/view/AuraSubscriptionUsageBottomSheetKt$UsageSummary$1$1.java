package com.facebook.aura.subscription.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel;
import com.facebook.aura.subscription.model.SubscriptionMeterDestination;
import com.facebook.aura.subscription.model.UsageActionsSlot;
import com.facebook.aura.subscription.repo.SubscriptionManagementCta;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageBottomSheetKt$UsageSummary$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ UsageActionsSlot $actionsSlot;
    public final /* synthetic */ boolean $isLoaded;
    public final /* synthetic */ boolean $isPaidTier;
    public final /* synthetic */ boolean $isRedeemingComplimentary;
    public final /* synthetic */ boolean $isResubscribing;
    public final /* synthetic */ SubscriptionManagementCta $meterAction;
    public final /* synthetic */ SubscriptionMeterDestination $meterDestination;
    public final /* synthetic */ Function0<Unit> $onOpenPaywall;
    public final /* synthetic */ Function0<Unit> $onRedeemComplimentary;
    public final /* synthetic */ Function0<Unit> $onResubscribe;
    public final /* synthetic */ Map<String, String> $subscriptionMetadata;
    public final /* synthetic */ AuraSubscriptionUsageViewModel.UiState $uiState;

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$UsageSummary$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AuraSubscriptionUsageViewModel.UiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraSubscriptionUsageViewModel.UiState uiState) {
            super(3);
            this.$uiState = uiState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                AuraSubscriptionUsageBottomSheetKt.UsageDisplay(this.$uiState, null, bfm, 0, 2);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$UsageSummary$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isRedeemingComplimentary;
        public final /* synthetic */ boolean $isResubscribing;
        public final /* synthetic */ SubscriptionManagementCta $meterAction;
        public final /* synthetic */ SubscriptionMeterDestination $meterDestination;
        public final /* synthetic */ Function0<Unit> $onOpenPaywall;
        public final /* synthetic */ Function0<Unit> $onRedeemComplimentary;
        public final /* synthetic */ Function0<Unit> $onResubscribe;
        public final /* synthetic */ Map<String, String> $subscriptionMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SubscriptionMeterDestination subscriptionMeterDestination, SubscriptionManagementCta subscriptionManagementCta, boolean z, boolean z2, Map<String, String> map, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
            super(3);
            this.$meterDestination = subscriptionMeterDestination;
            this.$meterAction = subscriptionManagementCta;
            this.$isResubscribing = z;
            this.$isRedeemingComplimentary = z2;
            this.$subscriptionMetadata = map;
            this.$onResubscribe = function0;
            this.$onRedeemComplimentary = function02;
            this.$onOpenPaywall = function03;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.C07C r23, X.BFM r24, int r25) {
            /*
                r22 = this;
                r15 = 0
                r0 = r23
                X.C7384Etj.A0Y(r0, r15)
                r2 = r25
                r1 = r25 & 17
                r0 = 16
                r5 = 0
                boolean r0 = X.AnonymousClass002.A1P(r1, r0)
                r3 = r24
                boolean r0 = X.AnonymousClass001.A1b(r0, r3, r2)
                if (r0 == 0) goto Lba
                r4 = -1
                r8 = r22
                com.facebook.aura.subscription.model.SubscriptionMeterDestination r1 = r8.$meterDestination
                com.facebook.aura.subscription.model.SubscriptionMeterDestination r0 = com.facebook.aura.subscription.model.SubscriptionMeterDestination.RESUBSCRIBE
                boolean r1 = X.AnonymousClass002.A1Z(r1, r0)
                com.facebook.aura.subscription.repo.SubscriptionManagementCta r0 = r8.$meterAction
                java.lang.String r9 = r0.label
                if (r1 == 0) goto L2e
                boolean r0 = r8.$isResubscribing
                if (r0 != 0) goto L34
            L2e:
                boolean r0 = r8.$isRedeemingComplimentary
                r16 = 0
                if (r0 == 0) goto L36
            L34:
                r16 = 1
            L36:
                r0 = 2131890367(0x7f1210bf, float:1.9415424E38)
                java.lang.String r17 = X.AbstractC2271BQs.A01(r3, r0)
                if (r1 != 0) goto L41
                r17 = 0
            L41:
                boolean r0 = r8.$isResubscribing
                r18 = r0 ^ 1
                X.BS0 r2 = X.BRg.A00
                com.facebook.aura.subscription.model.SubscriptionMeterDestination r1 = r8.$meterDestination
                com.facebook.aura.subscription.model.SubscriptionMeterDestination r0 = com.facebook.aura.subscription.model.SubscriptionMeterDestination.REDEEM_COMPLIMENTARY
                if (r1 != r0) goto L4e
                r5 = 1
            L4e:
                java.util.Map<java.lang.String, java.lang.String> r0 = r8.$subscriptionMetadata
                X.BRg r11 = com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt.redeemComplimentaryCtaImpression(r2, r5, r0)
                com.facebook.aura.subscription.repo.SubscriptionManagementCta r0 = r8.$meterAction
                boolean r1 = r3.A67(r0)
                java.util.Map<java.lang.String, java.lang.String> r0 = r8.$subscriptionMetadata
                boolean r2 = X.AnonymousClass001.A1T(r3, r0, r1)
                com.facebook.aura.subscription.model.SubscriptionMeterDestination r0 = r8.$meterDestination
                if (r0 == 0) goto L68
                int r4 = r0.ordinal()
            L68:
                boolean r1 = r3.A63(r4)
                r1 = r1 | r2
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r8.$onResubscribe
                boolean r1 = X.AnonymousClass001.A1R(r3, r0, r1)
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r8.$onRedeemComplimentary
                boolean r1 = X.AnonymousClass001.A1R(r3, r0, r1)
                kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r8.$onOpenPaywall
                boolean r0 = X.AnonymousClass001.A1R(r3, r0, r1)
                com.facebook.aura.subscription.repo.SubscriptionManagementCta r7 = r8.$meterAction
                java.util.Map<java.lang.String, java.lang.String> r6 = r8.$subscriptionMetadata
                com.facebook.aura.subscription.model.SubscriptionMeterDestination r5 = r8.$meterDestination
                kotlin.jvm.functions.Function0<kotlin.Unit> r4 = r8.$onResubscribe
                kotlin.jvm.functions.Function0<kotlin.Unit> r2 = r8.$onRedeemComplimentary
                kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r8.$onOpenPaywall
                java.lang.Object r10 = r3.AaT()
                if (r0 != 0) goto L95
                java.lang.Object r0 = X.C78N.A00
                if (r10 != r0) goto Lab
            L95:
                com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$UsageSummary$1$1$2$2$1 r10 = new com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$UsageSummary$1$1$2$2$1
                r19 = r10
                r20 = r7
                r21 = r6
                r22 = r5
                r23 = r4
                r24 = r2
                r25 = r1
                r19.<init>(r20, r21, r22, r23, r24, r25)
                r3.Ai0(r10)
            Lab:
                kotlin.jvm.functions.Function0 r10 = (kotlin.jvm.functions.Function0) r10
                r20 = 196608(0x30000, float:2.75506E-40)
                r21 = 24
                r12 = 0
                r14 = 0
                r19 = r3
                com.facebook.aura.subscription.view.AuraSubscriptionUsageMetersKt.m2274UsageCtaRowgF0flNs(r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21)
                return
            Lba:
                r3.Afo()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$UsageSummary$1$1.AnonymousClass2.invoke(X.07C, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$UsageSummary$1$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onOpenPaywall;
        public final /* synthetic */ Map<String, String> $subscriptionMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Map<String, String> map, Function0<Unit> function0) {
            super(3);
            this.$subscriptionMetadata = map;
            this.$onOpenPaywall = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1210c8);
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onOpenPaywall, bfm.A67(this.$subscriptionMetadata));
                Map<String, String> map = this.$subscriptionMetadata;
                Function0<Unit> function0 = this.$onOpenPaywall;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new AuraSubscriptionUsageBottomSheetKt$UsageSummary$1$1$3$1$1(map, function0);
                    bfm.Ai0(objAaT);
                }
                AuraSubscriptionUsageMetersKt.m2274UsageCtaRowgF0flNs(strA01, (Function0) objAaT, null, 0L, null, false, false, null, false, bfm, 196608, 476);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        Object anonymousClass3;
        int i;
        SubscriptionManagementCta subscriptionManagementCta;
        SubscriptionMeterDestination subscriptionMeterDestination;
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$uiState), 537695257);
        UsageActionsSlot usageActionsSlot = this.$actionsSlot;
        if (usageActionsSlot == UsageActionsSlot.SETTLING || !this.$isLoaded) {
            return;
        }
        UsageActionsSlot usageActionsSlot2 = UsageActionsSlot.RETRY;
        if (usageActionsSlot != usageActionsSlot2 && (subscriptionManagementCta = this.$meterAction) != null && (subscriptionMeterDestination = this.$meterDestination) != null) {
            anonymousClass3 = new AnonymousClass2(subscriptionMeterDestination, subscriptionManagementCta, this.$isResubscribing, this.$isRedeemingComplimentary, this.$subscriptionMetadata, this.$onResubscribe, this.$onRedeemComplimentary, this.$onOpenPaywall);
            i = 24766360;
        } else {
            if (this.$isPaidTier || usageActionsSlot == usageActionsSlot2) {
                return;
            }
            anonymousClass3 = new AnonymousClass3(this.$subscriptionMetadata, this.$onOpenPaywall);
            i = 1657664089;
        }
        AnonymousClass005.A0u(hatchSectionScope, anonymousClass3, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionUsageBottomSheetKt$UsageSummary$1$1(UsageActionsSlot usageActionsSlot, boolean z, SubscriptionManagementCta subscriptionManagementCta, SubscriptionMeterDestination subscriptionMeterDestination, boolean z2, AuraSubscriptionUsageViewModel.UiState uiState, boolean z3, boolean z4, Map<String, String> map, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        super(1);
        this.$actionsSlot = usageActionsSlot;
        this.$isLoaded = z;
        this.$meterAction = subscriptionManagementCta;
        this.$meterDestination = subscriptionMeterDestination;
        this.$isPaidTier = z2;
        this.$uiState = uiState;
        this.$isResubscribing = z3;
        this.$isRedeemingComplimentary = z4;
        this.$subscriptionMetadata = map;
        this.$onResubscribe = function0;
        this.$onRedeemComplimentary = function02;
        this.$onOpenPaywall = function03;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
