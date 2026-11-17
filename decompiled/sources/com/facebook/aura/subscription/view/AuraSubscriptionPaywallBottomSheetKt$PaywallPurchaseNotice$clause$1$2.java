package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.C0jP;
import X.C7384Etj;
import X.CFK;
import X.FGI;
import X.G0U;
import com.facebook.aura.subscription.repo.Disclaimer;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraSubscriptionPaywallBottomSheetKt$PaywallPurchaseNotice$clause$1$2 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ Disclaimer $notice;
    public final /* synthetic */ C0jP $uriHandler;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        String str2 = this.$notice.urlsByToken.get(str);
        if (str2 != null) {
            try {
                this.$uriHandler.openUri(str2);
            } catch (Exception e) {
                CFK.A0A(AuraSubscriptionPaywallBottomSheetKt.TAG, FGI.A0M("Failed to open purchase notice URL: ", str2), e);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionPaywallBottomSheetKt$PaywallPurchaseNotice$clause$1$2(Disclaimer disclaimer, C0jP c0jP) {
        super(1);
        this.$notice = disclaimer;
        this.$uriHandler = c0jP;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
