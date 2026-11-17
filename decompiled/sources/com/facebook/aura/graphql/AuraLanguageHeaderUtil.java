package com.facebook.aura.graphql;

import X.C60O;
import X.C7384Etj;
import X.C8j3;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class AuraLanguageHeaderUtil {
    public static final String ACCEPT_LANG_FOR_US_LOCALE = "en-US";
    public static final AuraLanguageHeaderUtil INSTANCE = new AuraLanguageHeaderUtil();

    private final String convertObsoleteLanguageCodeToNew(String str) {
        if (str == null) {
            return str;
        }
        int iHashCode = str.hashCode();
        return iHashCode != 3365 ? iHashCode != 3374 ? (iHashCode == 3391 && str.equals("ji")) ? "yi" : str : str.equals("iw") ? "he" : str : str.equals("in") ? "id" : str;
    }

    private final void addLocaleToHttpAcceptLanguage(StringBuilder sb, Locale locale) {
        String strConvertObsoleteLanguageCodeToNew = convertObsoleteLanguageCodeToNew(locale.getLanguage());
        if (strConvertObsoleteLanguageCodeToNew != null) {
            sb.append(strConvertObsoleteLanguageCodeToNew);
            String country = locale.getCountry();
            if (country != null) {
                sb.append("-");
                sb.append(country);
            }
        }
    }

    public final String getAcceptedLanguageHeader() {
        Locale locale = Locale.getDefault();
        StringBuilder sbA0w = C60O.A0w();
        C7384Etj.A0X(locale);
        addLocaleToHttpAcceptLanguage(sbA0w, locale);
        if (!C7384Etj.areEqual(Locale.US, locale)) {
            if (sbA0w.length() > 0) {
                C8j3.A1K(sbA0w);
            }
            sbA0w.append("en-US");
        }
        return sbA0w.toString();
    }
}
