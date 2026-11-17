package com.facebook.aura.shopping.model;

import X.AnonymousClass004;
import X.BFM;
import X.C3cJ;
import X.C7384Etj;
import com.facebook.aura.R;

/* loaded from: classes4.dex */
public abstract class ShoppingEyebrowTextKt {
    public static final PdpEyebrowState eyebrowState(PdpHeader pdpHeader) {
        C7384Etj.A0Y(pdpHeader, 0);
        return new PdpEyebrowState(pdpEyebrowParts(pdpHeader.brand, pdpHeader.merchantName), ProductDetailsPresentationKt.showsMerchantLogo(pdpHeader), pdpHeader.merchantLogoUrl);
    }

    public static final ShoppingProductSubtitle pdpEyebrowParts(String str, String str2) {
        if (str2 == null || str2.equalsIgnoreCase(str)) {
            str2 = null;
        }
        return new ShoppingProductSubtitle(str2, str, null);
    }

    public static final String shoppingSubtitleText(ShoppingProductSubtitle shoppingProductSubtitle, BFM bfm, int i) {
        String str;
        String str2 = null;
        if (shoppingProductSubtitle != null) {
            str = shoppingProductSubtitle.merchant;
            str2 = shoppingProductSubtitle.brand;
            if (str != null && str2 != null) {
                bfm.AgE(-355590636);
                return C3cJ.A0H(bfm, str, str2, R.string._name_removed__res_0x7f120601);
            }
        } else {
            str = null;
        }
        AnonymousClass004.A1A(bfm, 1861680555);
        return str == null ? str2 : str;
    }

    public static final String shoppingEyebrowText(String str, String str2, BFM bfm, int i) {
        return shoppingSubtitleText(pdpEyebrowParts(str, str2), bfm, 0);
    }
}
