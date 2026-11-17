package com.facebook.aura.localbrowser;

import X.AbstractC1564Ale;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BO4;
import X.BOI;
import X.BRg;
import X.C1DM;
import X.C1OM;
import X.C1b8;
import X.C2Cx;
import X.C3Ue;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.InterfaceC0857A6e;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class LocalBrowserLoadingShimmerKt {
    public static final void LocalBrowserLoadingShimmer(final String str, BRg bRg, BFM bfm, final int i, final int i2) {
        final BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-2019928791);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BO4 bo4A01 = BOI.A01(bfm, null, auraTheme.getDimensions(bfm, 6).shimmerOffset, 220, auraTheme.getColors(bfm, 6).shimmeringBase, auraTheme.getColors(bfm, 6).shimmeringHighlight);
            long j = auraTheme.getColors(bfm, 6).shimmeringBase;
            C1DM c1dm = C1OM.A00;
            BRg bRgA00 = BOI.A00(C1b8.A03(bRg2, c1dm, j), c1dm, bo4A01);
            boolean zA1F = AnonymousClass004.A1F(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1F || objAaT == C78N.A00) {
                objAaT = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserLoadingShimmerKt$$ExternalSyntheticLambda0
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return LocalBrowserLoadingShimmerKt.LocalBrowserLoadingShimmer$lambda$0$0(str, (InterfaceC0857A6e) obj);
                    }
                };
                bfm.Ai0(objAaT);
            }
            C3Ue.A04(AnonymousClass001.A0Y(bRgA00, objAaT, false), bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserLoadingShimmerKt$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    BRg bRg3 = bRg2;
                    int i4 = i;
                    LocalBrowserLoadingShimmerKt.LocalBrowserLoadingShimmer(str2, bRg3, (BFM) obj, AnonymousClass011.A00(i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit LocalBrowserLoadingShimmer$lambda$0$0(String str, InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 1);
        AbstractC1564Ale.A08(interfaceC0857A6e, str);
        AbstractC1564Ale.A04(interfaceC0857A6e);
        AbstractC1564Ale.A01(C2Cx.A03, interfaceC0857A6e);
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserLoadingShimmer$lambda$1(String str, BRg bRg, int i, int i2, BFM bfm, int i3) {
        LocalBrowserLoadingShimmer(str, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
