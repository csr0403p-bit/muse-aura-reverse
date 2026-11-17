package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Arrays;

/* loaded from: classes5.dex */
public abstract class BzX {
    public static final void A00(String str, String str2, Object... objArr) {
        try {
            CFK.A0H(str, FGI.A0M("[AI] ", str2), Arrays.copyOf(objArr, objArr.length));
        } catch (Exception unused) {
        }
    }

    public static final void A01(String str, Throwable th, String str2) {
        try {
            CFK.A0K(str, th, FGI.A0M("[AI] ", str2));
        } catch (Exception unused) {
        }
    }

    public static final void A02(Throwable th, String str, Object... objArr) {
        try {
            String strA0M = FGI.A0M("[AI] ", str);
            Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
            if (CFK.A02.AOg(5)) {
                CFK.A0A(C4449CwQ.class.getSimpleName(), StringFormatUtil.formatStrLocaleSafe(strA0M, objArrCopyOf), th);
            }
        } catch (Exception unused) {
        }
    }
}
