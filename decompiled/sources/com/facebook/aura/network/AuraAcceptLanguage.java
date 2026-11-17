package com.facebook.aura.network;

import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.C7384Etj;
import X.C7BY;
import X.F60;
import X.FGI;
import X.Hr7;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class AuraAcceptLanguage {
    public static final String FALLBACK = "en-US";
    public static final String HEADER = "Accept-Language";
    public static final AuraAcceptLanguage INSTANCE = new AuraAcceptLanguage();
    public static final int MAX_LANGUAGES = 6;
    public static final String UNDETERMINED_TAG = "und";

    public final String headerValue() {
        List<Locale> listLocales = locales();
        ArrayList arrayList = new ArrayList(Hr7.A1D(listLocales, 10));
        Iterator<Locale> it = listLocales.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toLanguageTag());
        }
        if (arrayList.isEmpty()) {
            return "en-US";
        }
        int i = 0;
        Object obj = arrayList.get(0);
        C7384Etj.A0U(obj);
        if (C7BY.A0j((CharSequence) obj) || C7384Etj.areEqual(arrayList.get(0), UNDETERMINED_TAG)) {
            return "en-US";
        }
        ArrayList arrayList2 = new ArrayList(Hr7.A1D(arrayList, 10));
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            String strA0S = (String) obj2;
            if (i != 0) {
                strA0S = FGI.A0S(strA0S, ";q=0.", 9 - i);
            }
            arrayList2.add(strA0S);
            i = i2;
        }
        return AbstractC0878AGe.A0L(", ", "", "", arrayList2, null);
    }

    public final List<Locale> locales() {
        LocaleList localeList = LocaleList.getDefault();
        C7384Etj.A0U(localeList);
        int iMin = Math.min(localeList.size(), 6);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(localeList.get(i));
        }
        return arrayList;
    }
}
