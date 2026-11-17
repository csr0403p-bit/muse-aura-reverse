package X;

import java.security.AccessController;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class EZK {
    public static final ThreadLocal A00 = new ThreadLocal();

    public static int A00() {
        String strA01 = A01("org.bouncycastle.argon2.max_memory_exp");
        if (strA01 != null) {
            return Integer.parseInt(strA01);
        }
        return 24;
    }

    public static String A01(String str) {
        Map map;
        String strA0p = (String) AccessController.doPrivileged(new EZR(str));
        return (strA0p == null && ((map = (Map) A00.get()) == null || (strA0p = C60O.A0p(str, map)) == null)) ? (String) AccessController.doPrivileged(new EZQ(str)) : strA0p;
    }
}
