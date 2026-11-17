package com.facebook.aura.confidentialvm.view;

import X.ARD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C01N;
import X.C06G;
import X.C1062ATq;
import X.C10G;
import X.C1822Arm;
import X.C1YL;
import X.C3U4;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConfidentialVmRegisterPinScreenKt$RegisterPinContent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $errorMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmRegisterPinScreenKt$RegisterPinContent$2(String str) {
        super(2);
        this.$errorMessage = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            if (this.$errorMessage != null) {
                bfm.AgE(-1060849710);
                String str = this.$errorMessage;
                C1822Arm c1822ArmA0Z = C06G.A0Z(bfm);
                long j = AnonymousClass002.A0c(bfm).errorText;
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                float f = AuraDimensKt.SpacingSmall;
                BRg bRgA04 = C3U4.A04(c1062ATq, f);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = ConfidentialVmRegisterPinScreenKt$RegisterPinContent$2$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(str, ARD.A01(bRgA04, (G0U) objAaT, false), j, c1822ArmA0Z, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
                C01N.A08(bfm, bs0, f);
            } else {
                bfm.AgE(-1060437441);
            }
            AnonymousClass002.A19(bfm);
            return;
        }
        bfm.Afo();
    }
}
