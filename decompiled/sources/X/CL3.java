package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public abstract class CL3 {
    public static String A00(String str, Object... objArr) {
        int length;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object objA0v = objArr[i2];
            if (objA0v == null) {
                objA0v = HatchCcvLoggingKt.NO_POSTAL_FIELD;
            } else {
                try {
                    objA0v = objA0v.toString();
                } catch (Exception e) {
                    String strA0e = C60Q.A0e(objA0v);
                    String strA0x = BV7.A0x(objA0v);
                    StringBuilder sbA0r = BV5.A0r(strA0x, BV5.A04(strA0e) + 1);
                    sbA0r.append(strA0e);
                    String strA1M = C60P.A1M("@", strA0x, sbA0r);
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strA1M), (Throwable) e);
                    String strA0e2 = C60Q.A0e(e);
                    StringBuilder sbA0p = BV4.A0p(strA1M.length() + 8 + String.valueOf(strA0e2).length() + 1);
                    sbA0p.append("<");
                    sbA0p.append(strA1M);
                    sbA0p.append(" threw ");
                    sbA0p.append(strA0e2);
                    objA0v = AnonymousClass001.A0v(">", sbA0p);
                }
            }
            objArr[i2] = objA0v;
            i2++;
        }
        int length2 = str.length();
        StringBuilder sbA12 = BV7.A12(length, length2);
        int i3 = 0;
        while (i < length) {
            int iIndexOf = str.indexOf("%s", i3);
            if (iIndexOf == -1) {
                break;
            }
            sbA12.append((CharSequence) str, i3, iIndexOf);
            sbA12.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sbA12.append((CharSequence) str, i3, length2);
        if (i < length) {
            int iA0K = BV7.A0K(" [", sbA12, objArr, i);
            while (iA0K < length) {
                iA0K = BV7.A0K(", ", sbA12, objArr, iA0K);
            }
            sbA12.append(']');
        }
        return sbA12.toString();
    }
}
