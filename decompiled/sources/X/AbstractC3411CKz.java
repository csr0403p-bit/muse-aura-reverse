package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* renamed from: X.CKz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3411CKz {
    public static String A00(String str, Object... objArr) {
        int length;
        String strA03;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strA03 = HatchCcvLoggingKt.NO_POSTAL_FIELD;
            } else {
                try {
                    strA03 = obj.toString();
                } catch (Exception e) {
                    strA03 = BV9.A03(obj, e);
                }
            }
            objArr[i2] = strA03;
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
