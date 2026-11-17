package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C3cG;
import X.C78N;
import X.G0V;
import X.G2k;
import com.facebook.aura.subscription.repo.Disclaimer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$11$1$5$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ G2k<BRg, Boolean, Function0<Unit>, BFM, Integer, Unit> $appDisclosureLegalText;
    public final /* synthetic */ Disclaimer $purchaseDisclaimer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$11$1$5$2(G2k<? super BRg, ? super Boolean, ? super Function0<Unit>, ? super BFM, ? super Integer, Unit> g2k, Disclaimer disclaimer) {
        super(2);
        this.$appDisclosureLegalText = g2k;
        this.$purchaseDisclaimer = disclaimer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            bfm.Afo();
            return;
        }
        G2k<BRg, Boolean, Function0<Unit>, BFM, Integer, Unit> g2k = this.$appDisclosureLegalText;
        if (g2k == 0) {
            bfm.AgE(-1433306410);
        } else {
            BS0 bs0A09 = C3cG.A09(bfm, 1754879627);
            Boolean boolValueOf = Boolean.valueOf(this.$purchaseDisclaimer != null);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = AuraActivationSubscriptionScreenKt$ActivationSubscriptionContent$11$1$5$2$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            g2k.invoke(bs0A09, boolValueOf, objAaT, bfm, 390);
        }
        AnonymousClass002.A19(bfm);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
