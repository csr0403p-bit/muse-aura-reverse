package com.facebook.aura.iap;

import X.AnonymousClass002;
import X.C10571Hud;
import X.C3cG;
import X.C7384Etj;
import java.util.Currency;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class HatchSubscriptionPurchaseKt {
    public static final String FETCH_PRICES_OPERATION = "fetch_play_prices";
    public static final String PURCHASE_ENTRYPOINT_PAYLOAD_KEY = "purchase_entrypoint";
    public static final long STOREFRONT_READ_TIMEOUT_MS = 2000;

    public static final Integer playMicrosToHundredths(long j, String str) {
        String strA0l;
        Object objA0s;
        if (j <= 0 || str == null || (strA0l = AnonymousClass002.A0l(str)) == null) {
            return null;
        }
        Locale locale = Locale.ROOT;
        C7384Etj.A0V(locale);
        String upperCase = strA0l.toUpperCase(locale);
        if (upperCase.length() <= 0) {
            upperCase = null;
        }
        if (upperCase == null) {
            return null;
        }
        try {
            objA0s = Integer.valueOf(Currency.getInstance(upperCase).getDefaultFractionDigits());
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        Number number = (Number) objA0s;
        if (number == null || number.intValue() < 0) {
            return null;
        }
        long j2 = j / 10000;
        if (1 > j2 || j2 >= 2147483648L) {
            return null;
        }
        return Integer.valueOf((int) j2);
    }
}
