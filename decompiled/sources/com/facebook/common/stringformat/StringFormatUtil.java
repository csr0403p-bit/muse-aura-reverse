package com.facebook.common.stringformat;

import X.BV4;
import X.BV5;
import java.util.Formatter;
import java.util.MissingFormatArgumentException;
import java.util.UnknownFormatConversionException;

/* loaded from: classes5.dex */
public class StringFormatUtil {
    public static final Object[] A00 = {null};

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0031, code lost:
    
        return -3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.String r13, java.lang.StringBuilder r14, int r15) {
        /*
            r7 = 0
            if (r14 != 0) goto L4
            r7 = 1
        L4:
            r8 = -1
            r6 = 0
            if (r15 != 0) goto L9
            r6 = -1
        L9:
            r5 = r6
            r4 = 0
            r3 = 0
        Lc:
            r2 = -200(0xffffffffffffff38, float:NaN)
            if (r5 >= r15) goto L5d
            if (r5 == r8) goto L50
            r1 = 1
            if (r5 == 0) goto L4b
            if (r5 == r1) goto L46
            r0 = 2
            if (r5 == r0) goto L41
            r0 = 3
            if (r5 != r0) goto L57
            int r0 = A01(r12, r13, r14, r4, r1)
        L21:
            if (r0 == r8) goto L32
            if (r7 == 0) goto L26
            int r3 = r3 + r0
        L26:
            int r4 = A02(r13, r4)
            if (r5 != r6) goto L33
            if (r4 != r2) goto L33
            r8 = -2
            if (r7 != 0) goto L32
        L31:
            r8 = -3
        L32:
            return r8
        L33:
            if (r4 >= 0) goto L3e
            if (r4 == r2) goto L3b
            r0 = -201(0xffffffffffffff37, float:NaN)
            if (r4 != r0) goto L5d
        L3b:
            if (r7 == 0) goto L31
            return r3
        L3e:
            int r5 = r5 + 1
            goto Lc
        L41:
            int r0 = A01(r11, r13, r14, r4, r1)
            goto L21
        L46:
            int r0 = A01(r10, r13, r14, r4, r1)
            goto L21
        L4b:
            int r0 = A01(r9, r13, r14, r4, r1)
            goto L21
        L50:
            r1 = 0
            r0 = 0
            int r0 = A01(r1, r13, r14, r4, r0)
            goto L21
        L57:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L5d:
            int r8 = A03(r13, r14, r4, r3, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.stringformat.StringFormatUtil.A00(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, java.lang.StringBuilder, int):int");
    }

    public static int A04(String str, StringBuilder sb, Object... objArr) {
        boolean z;
        boolean z2 = true;
        int i = 0;
        boolean z3 = sb == null;
        if (objArr == null || objArr.length == 0) {
            objArr = A00;
            z = true;
        } else {
            z = false;
        }
        int length = objArr.length;
        int iA02 = 0;
        int i2 = 0;
        boolean z4 = false;
        while (i < length) {
            int iA01 = A01(objArr[i], str, sb, iA02, !z);
            if (iA01 == -1) {
                return -1;
            }
            if (z3) {
                i2 += iA01;
            }
            iA02 = A02(str, iA02);
            if (iA02 == -200) {
                break;
            }
            if (iA02 == -201) {
                break;
            }
            i++;
            z4 = true;
        }
        z2 = z4;
        if (z3 && !z2) {
            return -2;
        }
        if (iA02 != -200 && iA02 != -201) {
            return A03(str, sb, iA02, i2, z3);
        }
        if (z3) {
            return i2;
        }
        return -3;
    }

    public static String A05(Object obj, Object obj2, Object obj3, Object obj4, String str, Object[] objArr, int i) {
        Object[] objArr2 = objArr;
        int iA04 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? A04(str, null, objArr) : A00(obj, obj2, obj3, obj4, str, null, 4) : A00(obj, obj2, obj3, null, str, null, 3) : A00(obj, obj2, null, null, str, null, 2) : A00(obj, null, null, null, str, null, 1) : A00(null, null, null, null, str, null, 0);
        if (iA04 != -1) {
            if (iA04 == -2) {
                return str;
            }
            StringBuilder sbA0p = BV4.A0p(iA04);
            if (i == -1) {
                A04(str, sbA0p, objArr2);
            } else {
                A00(obj, obj2, obj3, obj4, str, sbA0p, i);
            }
            return sbA0p.toString();
        }
        if (i == 0) {
            objArr2 = new Object[0];
        } else if (i == 1) {
            objArr2 = new Object[]{obj};
        } else if (i == 2) {
            objArr2 = new Object[]{obj, obj2};
        } else if (i == 3) {
            objArr2 = new Object[]{obj, obj2, obj3};
        } else if (i == 4) {
            objArr2 = new Object[]{obj, obj2, obj3, obj4};
        }
        try {
            return String.format(null, str, objArr2);
        } catch (MissingFormatArgumentException | UnknownFormatConversionException e) {
            throw BV5.A0i(e.getMessage(), ": ", str);
        }
    }

    public static void appendFormatStrLocaleSafe(StringBuilder sb, String str, Object... objArr) {
        int iA04 = A04(str, null, objArr);
        if (iA04 == -1) {
            new Formatter(sb).format(null, str, objArr);
        } else if (iA04 == -2) {
            sb.append(str);
        } else {
            sb.ensureCapacity(iA04);
            A04(str, sb, objArr);
        }
    }

    public static String formatStrLocaleSafe(String str) {
        return A05(null, null, null, null, str, null, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(java.lang.Object r7, java.lang.String r8, java.lang.StringBuilder r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.stringformat.StringFormatUtil.A01(java.lang.Object, java.lang.String, java.lang.StringBuilder, int, boolean):int");
    }

    public static int A02(String str, int i) {
        int i2;
        char cCharAt;
        int length = str.length();
        boolean z = false;
        while (i < length) {
            if (str.charAt(i) == '%' && length > (i2 = i + 1) && ((cCharAt = str.charAt(i2)) == 's' || cCharAt == 'd' || cCharAt == '%')) {
                int i3 = i + 1;
                if (str.charAt(i3) != '%') {
                    return i + 2;
                }
                i = i3;
                z = true;
            }
            i++;
        }
        return z ? -201 : -200;
    }

    public static int A03(String str, StringBuilder sb, int i, int i2, boolean z) {
        int length = str.length();
        int i3 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '%' && (length <= (i = i + 1) || str.charAt(i) != '%')) {
                if (z) {
                    return -1;
                }
                throw new AssertionError();
            }
            if (sb == null) {
                i3++;
            } else {
                sb.append(cCharAt);
            }
            i++;
        }
        if (z) {
            return i2 + i3;
        }
        return -3;
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2) {
        return A05(obj, obj2, null, null, str, null, 2);
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2, Object obj3) {
        return A05(obj, obj2, obj3, null, str, null, 3);
    }

    public static String formatStrLocaleSafe(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        return A05(obj, obj2, obj3, obj4, str, null, 4);
    }

    public static String formatStrLocaleSafe(String str, Object... objArr) {
        return A05(null, null, null, null, str, objArr, -1);
    }

    public static String formatStrLocaleSafe(String str, Object obj) {
        return A05(obj, null, null, null, str, null, 1);
    }
}
