package com.facebook.aura.payments.cardvalidation;

import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BQG;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import X.FGI;
import X.HxE;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class HatchCardFieldFormat {
    public static final HatchCardFieldFormat INSTANCE = new HatchCardFieldFormat();

    public final HxE<String, String> expirationToWireParts(String str) {
        C7384Etj.A0Y(str, 0);
        String strDigitsOnly = HatchCardNetworkKt.digitsOnly(str);
        if (strDigitsOnly.length() != 4) {
            return null;
        }
        return C3cG.A0r(strDigitsOnly.substring(0, 2), FGI.A0M(HatchCardFieldFormatKt.LONG_YEAR_CENTURY, strDigitsOnly.substring(2)));
    }

    public final String number(String str) {
        C7384Etj.A0Y(str, 0);
        String strDigitsOnly = HatchCardNetworkKt.digitsOnly(str);
        HatchCardNetwork hatchCardNetworkForDigits = HatchCardNetwork.Companion.forDigits(strDigitsOnly);
        String strA17 = BQG.A17(strDigitsOnly, hatchCardNetworkForDigits.getMaxPanLength());
        int length = strA17.length();
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(hatchCardNetworkForDigits.getGroupSizes().size() + length);
        Iterator<Integer> it = hatchCardNetworkForDigits.getGroupSizes().iterator();
        int i = 0;
        while (it.hasNext()) {
            int iA03 = C60Q.A03(it);
            if (i >= length) {
                break;
            }
            if (i > 0) {
                sb.append(' ');
            }
            int i2 = iA03 + i;
            sb.append((CharSequence) strA17, i, Math.min(i2, length));
            i = i2;
        }
        if (i < length) {
            sb.append(' ');
            sb.append((CharSequence) strA17, i, length);
        }
        return sb.toString();
    }

    public final String usPostalCode(String str) {
        C7384Etj.A0Y(str, 0);
        String strA17 = BQG.A17(HatchCardNetworkKt.digitsOnly(str), 9);
        return strA17.length() > 5 ? FGI.A0U(strA17.substring(0, 5), "-", strA17.substring(5)) : strA17;
    }

    public final String expiration(String str, String str2) {
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        String strDigitsOnly = HatchCardNetworkKt.digitsOnly(str);
        int length = strDigitsOnly.length();
        if (length > HatchCardNetworkKt.digitsOnly(str2).length() && length > 0 && strDigitsOnly.charAt(zA1b ? 1 : 0) > '1') {
            strDigitsOnly = FGI.A0M(HatchPriceImpressionEventDataKt.NO_DISCOUNT, strDigitsOnly);
        }
        if (strDigitsOnly.length() == 6 && strDigitsOnly.startsWith(HatchCardFieldFormatKt.LONG_YEAR_CENTURY, 2)) {
            strDigitsOnly = FGI.A0M(BQG.A17(strDigitsOnly, 2), strDigitsOnly.substring(4));
        }
        String strA17 = BQG.A17(strDigitsOnly, 4);
        return strA17.length() > 2 ? FGI.A0U(strA17.substring(zA1b ? 1 : 0, 2), CustomConnectorRegisterRepositoryKt.ROOT_PATH, strA17.substring(2)) : strA17;
    }

    public final String securityCode(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return BQG.A17(HatchCardNetworkKt.digitsOnly(str), HatchCardNetwork.Companion.forDigits(HatchCardNetworkKt.digitsOnly(str2)).getSecurityCodeLength());
    }
}
