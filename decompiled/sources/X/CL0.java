package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public abstract class CL0 {
    public static String A00(String str, Object... objArr) {
        int length;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object objA0h = objArr[i2];
            if (objA0h == null) {
                objA0h = HatchCcvLoggingKt.NO_POSTAL_FIELD;
            } else {
                try {
                    objA0h = objA0h.toString();
                } catch (Exception e) {
                    String strA0O = FGI.A0O(C60Q.A0e(objA0h), BV7.A0x(objA0h), '@');
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strA0O), (Throwable) e);
                    objA0h = FGI.A0h("<", strA0O, " threw ", C60Q.A0e(e), ">");
                }
            }
            objArr[i2] = objA0h;
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
