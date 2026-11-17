package X;

import android.text.format.DateFormat;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.1Y3, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1Y3 {
    /* JADX WARN: Incorrect types in method signature: (JLjava/lang/String;Ljava/util/Locale;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljava/lang/String; */
    public static final String A00(String str, Locale locale, Map map, long j) {
        String strA0U = FGI.A0U("S:", str, locale.toLanguageTag());
        Object bestDateTimePattern = map.get(strA0U);
        if (bestDateTimePattern == null) {
            bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, str);
            map.put(strA0U, bestDateTimePattern);
        }
        return C1Y1.A01(bestDateTimePattern.toString(), locale, map, j);
    }
}
