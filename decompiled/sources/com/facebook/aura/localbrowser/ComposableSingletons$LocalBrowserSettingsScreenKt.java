package com.facebook.aura.localbrowser;

import X.AKQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C1515AkP;
import X.C1DG;
import X.C3U4;
import X.F60;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$LocalBrowserSettingsScreenKt {
    public static final ComposableSingletons$LocalBrowserSettingsScreenKt INSTANCE = new ComposableSingletons$LocalBrowserSettingsScreenKt();

    /* renamed from: lambda$-266688199, reason: not valid java name */
    public static G2j<C1DG, C1DG, BFM, Integer, Unit> f75lambda$266688199 = B1V.A01(new G2j() { // from class: com.facebook.aura.localbrowser.ComposableSingletons$LocalBrowserSettingsScreenKt$$ExternalSyntheticLambda0
        @Override // X.G2j
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return ComposableSingletons$LocalBrowserSettingsScreenKt.lambda__266688199$lambda$0((C1DG) obj, (C1DG) obj2, (BFM) obj3, AnonymousClass001.A0F(obj4));
        }
    }, -266688199, false);

    public static final Unit lambda__266688199$lambda$0(C1DG c1dg, C1DG c1dg2, BFM bfm, int i) {
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, c1dg.A00) | i : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A05(bfm, c1dg2.A00);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C3U4.A07(AnonymousClass006.A0M(bfm), AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C01N.A08(bfm, bs0, c1dg.A00);
            LocalBrowserSettingsScreenKt.BrowserEnabledSetting(null, bfm, 0, 1);
            C01N.A04(bfm, bbi, bs0, c1dg2.A00, true);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: getLambda$-266688199$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser, reason: not valid java name */
    public final G2j<C1DG, C1DG, BFM, Integer, Unit> m1204xf49976c5() {
        return f75lambda$266688199;
    }
}
