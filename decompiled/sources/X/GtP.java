package X;

import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class GtP extends AbstractC10245Gsg {
    public final String A00;
    public final String A01;

    public GtP(String str, String str2) {
        C10293Gtx.A01(str);
        C10293Gtx.A00(str2);
        Locale locale = Locale.ROOT;
        this.A00 = str.toLowerCase(locale).trim();
        if ((str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""))) {
            int length = str2.length();
            C10293Gtx.A03(C8j4.A1V(length, 1), "Quoted value must have content");
            str2 = str2.substring(1, length - 1);
        }
        this.A01 = str2.toLowerCase(locale);
    }
}
