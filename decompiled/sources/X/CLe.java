package X;

import java.util.Locale;
import java.util.Random;

/* loaded from: classes5.dex */
public final class CLe {
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public static String A00(String str) {
        String str2;
        String string;
        Object obj;
        Locale locale = Locale.ROOT;
        if (str != null) {
            str2 = "%s";
            string = null;
            obj = str;
        } else {
            str2 = "%X:%s";
            Object objA0k = C60O.A0k();
            StringBuilder sbA0w = C60O.A0w();
            Random random = new Random();
            while (sbA0w.length() < 3) {
                float fNextFloat = random.nextFloat();
                sbA0w.append(DEG.A0A.charAt((int) (fNextFloat * r1.length())));
            }
            string = sbA0w.toString();
            obj = objA0k;
        }
        return String.format(locale, str2, obj, string);
    }
}
