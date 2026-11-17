package X;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class Hhe {
    public static String A00(FDW fdw) {
        Object objValueOf;
        boolean z;
        int i = fdw.A05;
        if (i == 13319) {
            long jA08 = fdw.A08(36, 0L);
            String strA0q = AbstractC7608F5v.A0q(fdw);
            return Hto.A00(strA0q != null ? strA0q : "date", AbstractC7608F5v.A0o(fdw), AbstractC7608F5v.A0r(fdw), AbstractC7608F5v.A0s(fdw), jA08);
        }
        if (i != 13950) {
            FFI.A02("Unrecognized Text provider with style id ", i);
            return "";
        }
        Locale locale = C8j3.A0Z(AbstractC7608F5v.A0D()).locale;
        String strA0p = AbstractC7608F5v.A0p(fdw);
        if (C7LC.A00(strA0p)) {
            objValueOf = 0;
        } else {
            C7384Etj.A0X(strA0p);
            objValueOf = Double.valueOf(Double.parseDouble(strA0p));
        }
        String strA0o = AbstractC7608F5v.A0o(fdw);
        if (strA0o == null) {
            return objValueOf.toString();
        }
        C7384Etj.A0X(locale);
        Currency currency = Currency.getInstance(strA0o);
        C7384Etj.A0U(currency);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(currency);
        DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        if (decimalFormatSymbols.getGroupingSeparator() == '\u202f') {
            decimalFormatSymbols.setGroupingSeparator(' ');
            z = true;
        } else {
            z = false;
        }
        if (decimalFormatSymbols.getDecimalSeparator() != '\u202f') {
            if (z) {
            }
            decimalFormat.setMaximumFractionDigits(0);
            String str = currencyInstance.format(objValueOf);
            C7384Etj.A0U(str);
            return str;
        }
        decimalFormatSymbols.setDecimalSeparator(' ');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        decimalFormat.setMaximumFractionDigits(0);
        String str2 = currencyInstance.format(objValueOf);
        C7384Etj.A0U(str2);
        return str2;
    }
}
