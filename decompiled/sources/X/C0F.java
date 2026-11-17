package X;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;

/* loaded from: classes5.dex */
public abstract class C0F {
    public static int[] A03(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static String A02(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i < i2) {
            if (sb.charAt(i) == '/') {
                i++;
            }
            int i5 = i;
            int iLastIndexOf = i;
            while (i5 <= i2) {
                if (i5 == i2) {
                    i3 = i5;
                } else if (sb.charAt(i5) == '/') {
                    i3 = i5 + 1;
                } else {
                    i5++;
                }
                int i6 = iLastIndexOf + 1;
                if (i5 == i6 && sb.charAt(iLastIndexOf) == '.') {
                    sb.delete(iLastIndexOf, i3);
                    i4 = i3 - iLastIndexOf;
                } else if (i5 == iLastIndexOf + 2 && sb.charAt(iLastIndexOf) == '.' && sb.charAt(i6) == '.') {
                    iLastIndexOf = sb.lastIndexOf(CustomConnectorRegisterRepositoryKt.ROOT_PATH, iLastIndexOf - 2) + 1;
                    int i7 = i;
                    if (iLastIndexOf > i) {
                        i7 = iLastIndexOf;
                    }
                    sb.delete(i7, i3);
                    i4 = i3 - i7;
                } else {
                    iLastIndexOf = i5 + 1;
                    i5 = iLastIndexOf;
                }
                i2 -= i4;
                i5 = iLastIndexOf;
            }
        }
        return sb.toString();
    }

    public static Uri A00(C5325DgJ c5325DgJ, AbstractC5553DkW abstractC5553DkW) {
        return Uri.parse(A01(abstractC5553DkW.A05(), c5325DgJ.A03));
    }

    public static String A01(String str, String str2) {
        int i;
        int i2;
        StringBuilder sbA0w = C60O.A0w();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrA03 = A03(str2);
        if (iArrA03[0] != -1) {
            sbA0w.append(str2);
            A02(sbA0w, iArrA03[1], iArrA03[2]);
            return sbA0w.toString();
        }
        int[] iArrA032 = A03(str);
        if (iArrA03[3] == 0) {
            sbA0w.append((CharSequence) str, 0, iArrA032[3]);
            return AnonymousClass001.A0v(str2, sbA0w);
        }
        if (iArrA03[2] == 0) {
            sbA0w.append((CharSequence) str, 0, iArrA032[2]);
            return AnonymousClass001.A0v(str2, sbA0w);
        }
        int i3 = iArrA03[1];
        if (i3 != 0) {
            int i4 = iArrA032[0] + 1;
            sbA0w.append((CharSequence) str, 0, i4);
            sbA0w.append(str2);
            return A02(sbA0w, iArrA03[1] + i4, i4 + iArrA03[2]);
        }
        if (str2.charAt(i3) == '/') {
            sbA0w.append((CharSequence) str, 0, iArrA032[1]);
            sbA0w.append(str2);
            i = iArrA032[1];
            i2 = iArrA03[2] + i;
        } else {
            int i5 = iArrA032[0] + 2;
            int i6 = iArrA032[1];
            if (i5 >= i6 || i6 != iArrA032[2]) {
                int iLastIndexOf = str.lastIndexOf(47, iArrA032[2] - 1);
                int i7 = iLastIndexOf + 1;
                if (iLastIndexOf == -1) {
                    i7 = i6;
                }
                sbA0w.append((CharSequence) str, 0, i7);
                sbA0w.append(str2);
                return A02(sbA0w, iArrA032[1], i7 + iArrA03[2]);
            }
            sbA0w.append((CharSequence) str, 0, i6);
            sbA0w.append('/');
            sbA0w.append(str2);
            i = iArrA032[1];
            i2 = iArrA03[2] + i + 1;
        }
        return A02(sbA0w, i, i2);
    }
}
