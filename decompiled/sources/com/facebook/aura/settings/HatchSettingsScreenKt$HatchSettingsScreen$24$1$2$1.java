package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFM;
import X.BPc;
import X.BRg;
import X.C07C;
import X.C1BO;
import X.C7384Etj;
import X.C78N;
import X.EnumC10573Huf;
import X.G0U;
import X.G0W;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel;
import com.facebook.aura.subscription.view.AuraSubscriptionUsageCardKt;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSettingsScreenKt$HatchSettingsScreen$24$1$2$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ Function0<Unit> $onRedeemComplimentaryClick;
    public final /* synthetic */ Function0<Unit> $onSubscriptionManageClick;
    public final /* synthetic */ Function0<Unit> $onSubscriptionUpgradeClick;
    public final /* synthetic */ C1BO<AuraSubscriptionUsageViewModel.UiState> $subscriptionUiState$delegate;

    /* renamed from: com.facebook.aura.settings.HatchSettingsScreenKt$HatchSettingsScreen$24$1$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onRedeemComplimentaryClick;
        public final /* synthetic */ Function0<Unit> $onSubscriptionManageClick;
        public final /* synthetic */ Function0<Unit> $onSubscriptionUpgradeClick;
        public final /* synthetic */ C1BO<AuraSubscriptionUsageViewModel.UiState> $subscriptionUiState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, C1BO<? extends AuraSubscriptionUsageViewModel.UiState> c1bo) {
            super(3);
            this.$onSubscriptionUpgradeClick = function0;
            this.$onSubscriptionManageClick = function02;
            this.$onRedeemComplimentaryClick = function03;
            this.$subscriptionUiState$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                AuraSubscriptionUsageViewModel.UiState value = this.$subscriptionUiState$delegate.getValue();
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onRedeemComplimentaryClick, AnonymousClass001.A1R(bfm, this.$onSubscriptionManageClick, bfm.A65(this.$onSubscriptionUpgradeClick)));
                Function0<Unit> function0 = this.$onSubscriptionUpgradeClick;
                Function0<Unit> function02 = this.$onSubscriptionManageClick;
                Function0<Unit> function03 = this.$onRedeemComplimentaryClick;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchSettingsScreenKt$HatchSettingsScreen$24$1$2$1$1$1$1(function0, function02, function03);
                    bfm.Ai0(objAaT);
                }
                G0U g0u = (G0U) objAaT;
                BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(BRg.A00, HatchOrigin.SETTINGS, HatchSurface.SETTINGS, HatchSubsurface.CREDITS, HatchScreen.SETTINGS_MAIN, HatchComponent.USAGE_SECTION, null, null, null, 500L, 0.0f, null, null, null);
                boolean zA65 = bfm.A65(this.$subscriptionUiState$delegate);
                C1BO<AuraSubscriptionUsageViewModel.UiState> c1bo = this.$subscriptionUiState$delegate;
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchSettingsScreenKt$HatchSettingsScreen$24$1$2$1$1$2$1(c1bo);
                    bfm.Ai0(objAaT2);
                }
                AuraSubscriptionUsageCardKt.AuraSubscriptionUsageCard(value, g0u, BPc.A00(bRgHatchImpression, EnumC10573Huf.A06, (G0U) objAaT2, 0.0f, 0L), bfm, 0, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$onSubscriptionUpgradeClick, this.$onSubscriptionManageClick, this.$onRedeemComplimentaryClick, this.$subscriptionUiState$delegate), -758634248);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSettingsScreenKt$HatchSettingsScreen$24$1$2$1(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, C1BO<? extends AuraSubscriptionUsageViewModel.UiState> c1bo) {
        super(1);
        this.$onSubscriptionUpgradeClick = function0;
        this.$onSubscriptionManageClick = function02;
        this.$onRedeemComplimentaryClick = function03;
        this.$subscriptionUiState$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
