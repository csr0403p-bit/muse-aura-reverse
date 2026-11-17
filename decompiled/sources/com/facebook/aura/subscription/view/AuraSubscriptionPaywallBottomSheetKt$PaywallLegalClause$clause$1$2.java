package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass007;
import X.C0jP;
import X.C7384Etj;
import X.CFK;
import X.FGI;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.subscription.repo.Disclaimer;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraSubscriptionPaywallBottomSheetKt$PaywallLegalClause$clause$1$2 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ Disclaimer $disclaimer;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ C0jP $uriHandler;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        String str2 = this.$disclaimer.urlsByToken.get(str);
        if (str2 != null) {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.MONETIZATION, HatchSubsurface.SUBSCRIPTION, this.$screen, HatchComponent.LEGAL_LINK, null, AnonymousClass007.A0c(HatchMetadataKey.LINK_TYPE, str), null);
            try {
                this.$uriHandler.openUri(str2);
            } catch (Exception e) {
                CFK.A0A(AuraSubscriptionPaywallBottomSheetKt.TAG, FGI.A0M("Failed to open paywall legal URL: ", str2), e);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionPaywallBottomSheetKt$PaywallLegalClause$clause$1$2(Disclaimer disclaimer, HatchScreen hatchScreen, C0jP c0jP) {
        super(1);
        this.$disclaimer = disclaimer;
        this.$screen = hatchScreen;
        this.$uriHandler = c0jP;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
