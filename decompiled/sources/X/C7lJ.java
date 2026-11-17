package X;

import android.util.LruCache;
import android.widget.TextView;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7lJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7lJ {
    public final LruCache<Locale, Locale> A00;
    public final LruCache<String, Locale> A01;
    public final C7Of A02;
    public final AtomicReference<Locale> A03;
    public final F18<Locale> A04;
    public static final Locale A06 = Locale.US;
    public static final Locale A05 = Locale.ENGLISH;
    public static final Locale A07 = new Locale("fb", "HA");

    public final String A00() {
        Locale localeA01 = this.A03.get();
        if (localeA01 == null) {
            localeA01 = A01();
            Set<String> set = C7Of.A00;
            if (!set.isEmpty()) {
                LruCache<Locale, Locale> lruCache = this.A00;
                Locale locale = lruCache.get(localeA01);
                if (locale == null) {
                    locale = new Locale(localeA01.getLanguage(), localeA01.getCountry());
                    lruCache.put(localeA01, locale);
                }
                if (set.contains(locale.toString())) {
                    localeA01 = locale;
                } else {
                    String language = localeA01.getLanguage();
                    if (set.contains(language)) {
                        LruCache<String, Locale> lruCache2 = this.A01;
                        locale = lruCache2.get(language);
                        if (locale == null) {
                            locale = new Locale(language);
                            lruCache2.put(language, locale);
                        }
                        localeA01 = locale;
                    } else {
                        localeA01 = A05;
                    }
                }
            }
        }
        return AbstractC10433Hhd.A01(localeA01);
    }

    public final Locale A01() {
        Integer num;
        Locale localeAMN = this.A04.AMN();
        if (C9X.A04()) {
            String strA01 = C9X.A01("fb.e2e.e2e_locale", false, false);
            if (strA01 == null) {
                strA01 = AbstractC3459COf.A02("fb.e2e.e2e_locale");
            }
            Locale locale = A07;
            if (locale.toString().equals(strA01)) {
                localeAMN = locale;
            } else {
                String[] strArrSplit = strA01.split("_");
                int length = strArrSplit.length;
                if (length == 1) {
                    locale = new Locale(strArrSplit[0]);
                } else if (length == 2) {
                    locale = new Locale(strArrSplit[0], strArrSplit[1]);
                }
                localeAMN = locale;
            }
        }
        Set<String> set = C7Of.A00;
        if (!set.isEmpty() && !set.contains(localeAMN.getLanguage())) {
            LruCache<Locale, Locale> lruCache = this.A00;
            Locale locale2 = lruCache.get(localeAMN);
            if (locale2 == null) {
                locale2 = new Locale(localeAMN.getLanguage(), localeAMN.getCountry());
                lruCache.put(localeAMN, locale2);
            }
            if (!set.contains(locale2.toString()) && !localeAMN.toString().equals(A07.toString())) {
                localeAMN = A06;
            }
        }
        if (!"my_MM".equals(localeAMN.toString())) {
            return localeAMN;
        }
        HzT hzT = (HzT) C5246DeB.A00(32776);
        try {
            C7lK c7lK = hzT.A02;
            if (c7lK == null) {
                TextView textViewInvoke = hzT.A00.invoke(C4JM.A00());
                c7lK = new C7lK();
                G0V<? super TextView, ? super String, Integer> g0v = hzT.A01;
                c7lK.A02 = AnonymousClass001.A0F(g0v.invoke(textViewInvoke, "\u1000"));
                c7lK.A01 = AnonymousClass001.A0F(g0v.invoke(textViewInvoke, "\u1000\u1039\u1000"));
                c7lK.A00 = AnonymousClass001.A0F(g0v.invoke(textViewInvoke, "\u104e"));
                hzT.A02 = c7lK;
            }
            int i = c7lK.A02;
            if (i == 0) {
                num = C79.A00;
            } else {
                double d = i;
                double d2 = c7lK.A01 / d;
                double d3 = c7lK.A00 / d;
                num = (Math.abs(d2 - 2.0d) >= 0.2d || d3 < 1.05d) ? (Math.abs(d2 - 1.0d) >= 0.2d || d3 > 0.95d) ? C79.A0K : C79.A01 : C79.A0C;
            }
        } catch (Exception e) {
            CFK.A08("ZawgyiFontDetector", "Exception in detectDeviceBurmeseFontSupport", e);
            num = C79.A00;
        }
        return AnonymousClass002.A1Z(num, C79.A0C) ? new Locale("en", "US") : localeAMN;
    }

    public C7lJ() {
        C7Of c7Of = (C7Of) C5246DeB.A00(32769);
        C7601F5o c7601F5o = new C7601F5o(1);
        this.A02 = c7Of;
        this.A04 = c7601F5o;
        this.A00 = new LruCache<>(5);
        this.A01 = new LruCache<>(5);
        this.A03 = new AtomicReference<>();
    }
}
