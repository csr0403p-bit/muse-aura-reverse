package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public abstract class CL5 {
    public static String A00(Object obj) {
        if (obj == null) {
            return HatchCcvLoggingKt.NO_POSTAL_FIELD;
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String strA0U = FGI.A0U(C60Q.A0e(obj), "@", BV7.A0x(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, FGI.A0M("Exception during lenientFormat for ", strA0U), (Throwable) e);
            return FGI.A0h("<", strA0U, " threw ", C60Q.A0e(e), ">");
        }
    }

    public static String A01(String str, Object... objArr) {
        int length = str.length();
        int length2 = objArr.length;
        StringBuilder sbA0p = BV4.A0p((length2 * 16) + length);
        int i = 0;
        int i2 = 0;
        while (i < length2) {
            int iIndexOf = str.indexOf("%s", i2);
            if (iIndexOf == -1) {
                break;
            }
            sbA0p.append((CharSequence) str, i2, iIndexOf);
            sbA0p.append(A00(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sbA0p.append((CharSequence) str, i2, length);
        if (i < length2) {
            String str2 = " [";
            while (i < length2) {
                sbA0p.append(str2);
                sbA0p.append(A00(objArr[i]));
                i++;
                str2 = ", ";
            }
            sbA0p.append(']');
        }
        return sbA0p.toString();
    }
}
