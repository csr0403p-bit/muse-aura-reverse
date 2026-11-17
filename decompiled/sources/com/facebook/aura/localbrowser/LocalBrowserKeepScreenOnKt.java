package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C1BO;
import X.C2CK;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.common.ui.KeepScreenOnKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class LocalBrowserKeepScreenOnKt {
    public static final void LocalBrowserKeepScreenOn(final LocalBrowserSession localBrowserSession, BFM bfm, final int i) {
        C7384Etj.A0Y(localBrowserSession, 0);
        bfm.AgG(1305832396);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(localBrowserSession, bfm, i) ? 1 : 0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            KeepScreenOnKt.KeepScreenOn(C1BO.A0F(C2CK.A02(bfm, localBrowserSession.agentActive)) && ((LocalBrowserFacts) C2CK.A02(bfm, localBrowserSession.facts).getValue()).control == LocalBrowserControl.AGENT, bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserKeepScreenOnKt$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    LocalBrowserKeepScreenOnKt.LocalBrowserKeepScreenOn(localBrowserSession, (BFM) obj, AnonymousClass011.A02(obj2, i));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit LocalBrowserKeepScreenOn$lambda$2(LocalBrowserSession localBrowserSession, int i, BFM bfm, int i2) {
        LocalBrowserKeepScreenOn(localBrowserSession, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }
}
