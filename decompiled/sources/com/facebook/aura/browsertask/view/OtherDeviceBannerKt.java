package com.facebook.aura.browsertask.view;

import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.C7384Etj;
import X.C7BY;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.ui.HatchInlineBannerKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class OtherDeviceBannerKt {
    public static final void OtherDeviceBanner(final AgentComputerOtherDevice agentComputerOtherDevice, BRg bRg, BFM bfm, final int i, final int i2) {
        String strA01;
        BBI bbi;
        String strA012;
        final BRg bRg2 = bRg;
        C7384Etj.A0Y(agentComputerOtherDevice, 0);
        bfm.AgG(-597324839);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentComputerOtherDevice, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String str = (String) C1BO.A07(bfm, agentComputerOtherDevice.name);
            if (str == null || C7BY.A0j(str)) {
                bfm.AgE(1496458785);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201a3);
                bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                bfm.AgE(1496466187);
                strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12019d);
            } else {
                bfm.AgE(1496455969);
                strA01 = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f1201a2);
                bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                bfm.AgE(1496463051);
                strA012 = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f12019c);
            }
            BBI.A0R(bbi, false);
            HatchInlineBannerKt.m2318HatchInlineBannerKBbEK2Q(strA01, ComposableSingletons$OtherDeviceBannerKt.f11lambda$1973410734, bRg2, strA012, null, AnonymousClass002.A0e(bfm).pill, 0L, 0.0f, null, 0.0f, 0.0f, null, 0L, 0, null, 0L, 0, bfm, ((iA05 << 3) & 896) | 48, 0, 131024);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.browsertask.view.OtherDeviceBannerKt$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    AgentComputerOtherDevice agentComputerOtherDevice2 = agentComputerOtherDevice;
                    BRg bRg3 = bRg2;
                    int i4 = i;
                    OtherDeviceBannerKt.OtherDeviceBanner(agentComputerOtherDevice2, bRg3, (BFM) obj, AnonymousClass011.A00(i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit OtherDeviceBanner$lambda$2(AgentComputerOtherDevice agentComputerOtherDevice, BRg bRg, int i, int i2, BFM bfm, int i3) {
        OtherDeviceBanner(agentComputerOtherDevice, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
