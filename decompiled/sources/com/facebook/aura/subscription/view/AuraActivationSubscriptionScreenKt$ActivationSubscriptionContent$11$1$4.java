package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.C98f;
import X.G0W;
import com.facebook.aura.subscription.repo.SubscriptionProduct;

/* loaded from: classes4.dex */
public final class AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$11$1$4 extends AbstractC7559F3s implements G0W<SubscriptionProduct, BFM, Integer, BRg> {
    public final /* synthetic */ String $currentTierCode;
    public final /* synthetic */ PaywallFunnel $funnel;
    public final /* synthetic */ C98f $nmeEntryPoint;
    public final /* synthetic */ String $paywallImpressionKey;

    public final BRg invoke(SubscriptionProduct subscriptionProduct, BFM bfm, int i) {
        C7384Etj.A0Y(subscriptionProduct, 0);
        bfm.AgE(1332645037);
        String str = this.$paywallImpressionKey;
        PaywallFunnel paywallFunnel = this.$funnel;
        BRg bRgRememberTierCardImpressionModifier = AuraSubscriptionPaywallBottomSheetKt.rememberTierCardImpressionModifier(subscriptionProduct, str, paywallFunnel.waterfallStage, this.$currentTierCode, this.$nmeEntryPoint, paywallFunnel.hasUpgradeOption, paywallFunnel.hasDowngradeOption, null, bfm, SubscriptionProduct.$stable | (i & 14), 128);
        AnonymousClass001.A1D(bfm);
        return bRgRememberTierCardImpressionModifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$11$1$4(String str, PaywallFunnel paywallFunnel, String str2, C98f c98f) {
        super(3);
        this.$paywallImpressionKey = str;
        this.$funnel = paywallFunnel;
        this.$currentTierCode = str2;
        this.$nmeEntryPoint = c98f;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ BRg invoke(SubscriptionProduct subscriptionProduct, BFM bfm, Integer num) {
        return invoke(subscriptionProduct, bfm, AnonymousClass001.A0F(num));
    }
}
