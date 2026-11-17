package X;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class CD6 {
    public static final boolean A00(String str) {
        if (str == null) {
            return false;
        }
        if (CCn.A00(str) >= 0) {
            return true;
        }
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(new Object[]{str}, 1);
        CFK.A07("AppModuleIndexUtil", String.format(locale, "Checking for valid module for %s", Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
        return false;
    }
}
