package X;

import java.util.regex.Pattern;

/* renamed from: X.7nH, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7nH {
    public static final Pattern A00 = Pattern.compile("[-_./;:]");

    public static C7nG A01(String str, String str2) {
        int iA00;
        String str3;
        String strTrim = "2.18.10".trim();
        if (strTrim.length() <= 0) {
            return C7nG.A00;
        }
        String[] strArrSplit = A00.split(strTrim);
        int iA002 = 0;
        int iA003 = A00(strArrSplit[0]);
        int length = strArrSplit.length;
        if (length > 1) {
            iA00 = A00(strArrSplit[1]);
            if (length > 2) {
                iA002 = A00(strArrSplit[2]);
                str3 = length > 3 ? strArrSplit[3] : null;
            }
            return new C7nG(str3, str, str2, iA003, iA00, iA002);
        }
        iA00 = 0;
        return new C7nG(str3, str, str2, iA003, iA00, iA002);
    }

    public static int A00(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt > '9' || cCharAt < '0') {
                break;
            }
            i = (i * 10) + (cCharAt - '0');
        }
        return i;
    }
}
