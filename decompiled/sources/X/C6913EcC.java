package X;

import java.util.Map;

/* renamed from: X.EcC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6913EcC {
    public final synchronized C6895Ebr A01(String str) {
        C6895Ebr c6895Ebr;
        C7384Etj.A0Y(str, 0);
        Map<String, C6895Ebr> map = C6895Ebr.A02;
        c6895Ebr = map.get(str);
        if (c6895Ebr == null) {
            String strA0y = str;
            if (str.startsWith("TLS_")) {
                strA0y = AnonymousClass006.A0y(str.substring(4), "SSL_", C60O.A0w());
            } else if (str.startsWith("SSL_")) {
                strA0y = AnonymousClass006.A0y(str.substring(4), "TLS_", C60O.A0w());
            }
            c6895Ebr = map.get(strA0y);
            if (c6895Ebr == null) {
                c6895Ebr = new C6895Ebr(str);
            }
            map.put(str, c6895Ebr);
        }
        return c6895Ebr;
    }

    public static final C6895Ebr A00(String str) {
        C6895Ebr c6895Ebr = new C6895Ebr(str);
        C6895Ebr.A02.put(str, c6895Ebr);
        return c6895Ebr;
    }
}
