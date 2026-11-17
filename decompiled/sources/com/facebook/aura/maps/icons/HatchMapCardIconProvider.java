package com.facebook.aura.maps.icons;

import X.AVy;
import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.AnonymousClass965;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C1SA;
import X.C3cH;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchMapCardIconProvider implements AnonymousClass965 {
    public static final int $stable = 0;
    public static final HatchMapCardIconProvider INSTANCE = new HatchMapCardIconProvider();

    public void ExpandIcon(final BRg bRg, BFM bfm, final int i) {
        C7384Etj.A0Y(bRg, 0);
        bfm.AgG(923315527);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            C1SA.A00(bfm, null, bRg, AnonymousClass002.A0S(C3cH.A06(bfm, AuraTheme.INSTANCE)), BOf.A00(bfm, R.drawable.arrows_expand_wght400_outline, 0), null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120441), 0.0f, AVy.$stable | ((iA0d << 6) & 896), 56);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.maps.icons.HatchMapCardIconProvider$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    HatchMapCardIconProvider hatchMapCardIconProvider = this.f$0;
                    BRg bRg2 = bRg;
                    int i2 = i;
                    AnonymousClass001.A0F(obj2);
                    hatchMapCardIconProvider.ExpandIcon(bRg2, (BFM) obj, AnonymousClass011.A00(i2));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit ExpandIcon$lambda$0(HatchMapCardIconProvider hatchMapCardIconProvider, BRg bRg, int i, BFM bfm, int i2) {
        hatchMapCardIconProvider.ExpandIcon(bRg, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    @Override // X.AnonymousClass965
    public /* bridge */ boolean PlaceImage(String str, BRg bRg, BFM bfm, int i) {
        return AnonymousClass004.A1P(bfm, -2020222138);
    }

    public /* bridge */ boolean PlaceholderIcon(BRg bRg, BFM bfm, int i) {
        return AnonymousClass004.A1P(bfm, -802141285);
    }

    public /* bridge */ boolean PlaceImage(String str, BRg bRg, G0U g0u, BFM bfm, int i) {
        AnonymousClass003.A0x(str, bRg);
        bfm.AgE(60214547);
        bfm.AgE(-2020222138);
        BBI bbi = (BBI) bfm;
        BBI.A0R(bbi, false);
        BBI.A0R(bbi, false);
        return false;
    }
}
