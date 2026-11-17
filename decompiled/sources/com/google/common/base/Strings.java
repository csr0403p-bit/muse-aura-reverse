package com.google.common.base;

import X.BV7;
import X.C60Q;
import X.FGI;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class Strings {
    public static String lenientFormat(String template, Object... args) {
        int length;
        String strValueOf = String.valueOf(template);
        int i = 0;
        int i2 = 0;
        while (true) {
            length = args.length;
            if (i2 >= length) {
                break;
            }
            Object objA0h = args[i2];
            if (objA0h == null) {
                objA0h = HatchCcvLoggingKt.NO_POSTAL_FIELD;
            } else {
                try {
                    objA0h = objA0h.toString();
                } catch (Exception e) {
                    String strA0O = FGI.A0O(C60Q.A0e(objA0h), BV7.A0x(objA0h), '@');
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, FGI.A0M("Exception during lenientFormat for ", strA0O), (Throwable) e);
                    objA0h = FGI.A0h("<", strA0O, " threw ", C60Q.A0e(e), ">");
                }
            }
            args[i2] = objA0h;
            i2++;
        }
        int length2 = strValueOf.length();
        StringBuilder sbA12 = BV7.A12(length, length2);
        int i3 = 0;
        while (i < length) {
            int iIndexOf = strValueOf.indexOf("%s", i3);
            if (iIndexOf == -1) {
                break;
            }
            sbA12.append((CharSequence) strValueOf, i3, iIndexOf);
            sbA12.append(args[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sbA12.append((CharSequence) strValueOf, i3, length2);
        if (i < length) {
            int iA0K = BV7.A0K(" [", sbA12, args, i);
            while (iA0K < length) {
                iA0K = BV7.A0K(", ", sbA12, args, iA0K);
            }
            sbA12.append(']');
        }
        return sbA12.toString();
    }
}
