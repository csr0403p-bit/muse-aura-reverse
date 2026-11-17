package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass003;
import X.BQG;
import X.FGI;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.payments.cardvalidation.HatchCardNetworkKt;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class HatchCardFormattingKt {
    public static final int CA_POSTAL_GROUP_LENGTH = 3;
    public static final int CA_POSTAL_LENGTH = 6;
    public static final int ZIP_BASE_LENGTH = 5;
    public static final int ZIP_PLUS_FOUR_LENGTH = 9;

    public static final String formatCaPostalCode(String str) {
        String strA17 = BQG.A17(HatchCardNetworkKt.alphanumericsOnly(str).toUpperCase(Locale.ROOT), 6);
        return strA17.length() > 3 ? FGI.A0U(strA17.substring(0, 3), InviteCodeScratcherKt.CODE_SEPARATOR, strA17.substring(3)) : strA17;
    }

    public static final String formatUsZip(String str) {
        String strA17 = BQG.A17(HatchCardNetworkKt.digitsOnly(str), 9);
        return strA17.length() > 5 ? FGI.A0U(strA17.substring(0, 5), "-", strA17.substring(5)) : strA17;
    }

    public static final String formatZip(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return str2.equals("US") ? formatUsZip(str) : str2.equals(HatchCcvCountryOptionsKt.COUNTRY_CA) ? formatCaPostalCode(str) : str;
    }
}
