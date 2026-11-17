package com.facebook.aura.gateway;

import X.AnonymousClass002;
import X.C3cG;
import X.C7384Etj;
import X.C9tJ;
import X.HxE;
import com.facebook.aura.common.formatting.LocalizedFormattingKt$$ExternalSyntheticBackportWithForwarding0;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class CheckoutMoneyKt {
    public static final HxE<BigDecimal, Currency> checkoutMoneyOrNull(String str, String str2) {
        String strA0l;
        BigDecimal bigDecimalA0x;
        String strA0l2;
        if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null && PlainDecimalAmountKt.PLAIN_DECIMAL_AMOUNT.A08(strA0l) && (bigDecimalA0x = C9tJ.A0x(strA0l)) != null && str2 != null && (strA0l2 = AnonymousClass002.A0l(str2)) != null) {
            Locale locale = Locale.ROOT;
            C7384Etj.A0V(locale);
            try {
                Currency currency = Currency.getInstance(strA0l2.toUpperCase(locale));
                int defaultFractionDigits = currency.getDefaultFractionDigits();
                if (defaultFractionDigits < 0 || LocalizedFormattingKt$$ExternalSyntheticBackportWithForwarding0.m(bigDecimalA0x).scale() > defaultFractionDigits) {
                    return null;
                }
                return C3cG.A0r(bigDecimalA0x, currency);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
