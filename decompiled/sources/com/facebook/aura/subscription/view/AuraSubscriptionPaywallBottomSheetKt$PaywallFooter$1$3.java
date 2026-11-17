package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BBI;
import X.BFM;
import X.C1822Arm;
import X.G0V;
import com.facebook.aura.vds.compose.button.AuraButtonSize;

/* loaded from: classes4.dex */
public final class AuraSubscriptionPaywallBottomSheetKt$PaywallFooter$1$3 extends AbstractC7559F3s implements G0V<BFM, Integer, C1822Arm> {
    public final /* synthetic */ AuraButtonSize $ctaSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionPaywallBottomSheetKt$PaywallFooter$1$3(AuraButtonSize auraButtonSize) {
        super(2);
        this.$ctaSize = auraButtonSize;
    }

    public final C1822Arm invoke(BFM bfm, int i) {
        BBI bbi;
        boolean z;
        C1822Arm c1822ArmSubscriptionCtaTextStyle;
        bfm.AgE(-706869972);
        if (this.$ctaSize == AuraButtonSize.SMALL) {
            bfm.AgE(-697208730);
            c1822ArmSubscriptionCtaTextStyle = SubscriptionSheetHelpersKt.subscriptionCtaTextStyle(bfm, 0);
            bbi = (BBI) bfm;
            z = false;
            BBI.A0R(bbi, false);
        } else {
            bfm.AgE(-138603087);
            bbi = (BBI) bfm;
            z = false;
            BBI.A0R(bbi, false);
            c1822ArmSubscriptionCtaTextStyle = null;
        }
        BBI.A0R(bbi, z);
        return c1822ArmSubscriptionCtaTextStyle;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ C1822Arm invoke(BFM bfm, Integer num) {
        return invoke(bfm, AnonymousClass001.A0F(num));
    }
}
