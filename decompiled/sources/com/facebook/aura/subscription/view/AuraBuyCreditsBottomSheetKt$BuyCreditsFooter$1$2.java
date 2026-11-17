package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C1822Arm;
import X.G0V;

/* loaded from: classes4.dex */
public final class AuraBuyCreditsBottomSheetKt$BuyCreditsFooter$1$2 extends AbstractC7559F3s implements G0V<BFM, Integer, C1822Arm> {
    public static final AuraBuyCreditsBottomSheetKt$BuyCreditsFooter$1$2 INSTANCE = new AuraBuyCreditsBottomSheetKt$BuyCreditsFooter$1$2();

    public AuraBuyCreditsBottomSheetKt$BuyCreditsFooter$1$2() {
        super(2);
    }

    public final C1822Arm invoke(BFM bfm, int i) {
        bfm.AgE(-1825330095);
        C1822Arm c1822ArmSubscriptionCtaTextStyle = SubscriptionSheetHelpersKt.subscriptionCtaTextStyle(bfm, 0);
        AnonymousClass001.A1D(bfm);
        return c1822ArmSubscriptionCtaTextStyle;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ C1822Arm invoke(BFM bfm, Integer num) {
        return invoke(bfm, AnonymousClass001.A0F(num));
    }
}
