package com.facebook.aura.commands.sms;

import X.C7384Etj;
import X.C7BY;
import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class PhoneNormalizer {
    public static final PhoneNormalizer INSTANCE = new PhoneNormalizer();

    public final String defaultRegion(Context context) {
        TelephonyManager telephonyManager;
        C7384Etj.A0Y(context, 0);
        Object systemService = context.getSystemService(HatchLinkOrderSheetKt.PHONE);
        if (!(systemService instanceof TelephonyManager) || (telephonyManager = (TelephonyManager) systemService) == null) {
            return null;
        }
        String simCountryIso = telephonyManager.getSimCountryIso();
        if (C7BY.A0j(simCountryIso)) {
            simCountryIso = telephonyManager.getNetworkCountryIso();
        }
        C7384Etj.A0X(simCountryIso);
        if (C7BY.A0j(simCountryIso)) {
            return null;
        }
        return simCountryIso.toUpperCase(Locale.ROOT);
    }

    public final String toE164(String str, String str2) {
        String numberToE164;
        C7384Etj.A0Y(str, 0);
        return (C7BY.A0j(str) || str2 == null || (numberToE164 = PhoneNumberUtils.formatNumberToE164(str, str2)) == null) ? str : numberToE164;
    }
}
