package com.facebook.aura.subscription.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFM;
import X.BRg;
import X.C07C;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageBottomSheetKt$UsageActions$3$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ Function0<Unit> $onRetry;
    public final /* synthetic */ Map<String, String> $subscriptionMetadata;

    /* renamed from: com.facebook.aura.subscription.view.AuraSubscriptionUsageBottomSheetKt$UsageActions$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ Map<String, String> $subscriptionMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Map<String, String> map, Function0<Unit> function0) {
            super(3);
            this.$subscriptionMetadata = map;
            this.$onRetry = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12109b);
                BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(BRg.A00, HatchOrigin.MONETIZATION, HatchSurface.MONETIZATION, HatchSubsurface.SUBSCRIPTION, HatchScreen.SUBSCRIPTION_MANAGEMENT, HatchComponent.ACTIONS_UNAVAILABLE_CARD, null, this.$subscriptionMetadata, null, 500L, 0.0f, null, null, null);
                Integer numValueOf = Integer.valueOf(R.drawable.arrow_clockwise_wght400_outline_24);
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onRetry, bfm.A67(this.$subscriptionMetadata));
                Map<String, String> map = this.$subscriptionMetadata;
                Function0<Unit> function0 = this.$onRetry;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new AuraSubscriptionUsageBottomSheetKt$UsageActions$3$1$1$1$1(map, function0);
                    bfm.Ai0(objAaT);
                }
                AuraSubscriptionUsageBottomSheetKt.UsageActionRow(numValueOf, strA01, (Function0) objAaT, bRgHatchImpression, null, false, null, bfm, 0, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$subscriptionMetadata, this.$onRetry), 1014892013);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionUsageBottomSheetKt$UsageActions$3$1(Map<String, String> map, Function0<Unit> function0) {
        super(1);
        this.$subscriptionMetadata = map;
        this.$onRetry = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
