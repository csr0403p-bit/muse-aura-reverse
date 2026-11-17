package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.instagram.common.lispy.lang.LispyException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes6.dex */
public abstract class FDM {
    public static final Random A00 = new Random();

    public static long A01(FDJ fdj, Integer num, Object obj) {
        return A03(fdj, num, obj, true).longValue();
    }

    public static double A00(double d) {
        return d > 0.0d ? Math.floor(d) : Math.ceil(d);
    }

    public static Long A03(FDJ fdj, Integer num, Object obj, boolean z) {
        long jA05;
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Boolean) {
            jA05 = AnonymousClass001.A1X(obj) ? 1L : 0L;
        } else {
            if (!(obj instanceof Number)) {
                if (z) {
                    throw A02(fdj, obj == null ? BV4.A0a("null cannot be cast to i64") : new ClassCastException(FGI.A0U("Cannot cast ", String.valueOf(obj.getClass()), " to i64")), num, "Invalid Arg Type");
                }
                return null;
            }
            jA05 = C3cG.A05(obj);
        }
        return Long.valueOf(jA05);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Number A04(X.FDJ r15, java.lang.Integer r16, java.lang.Object r17, boolean r18) {
        /*
            r1 = r17
            if (r17 != 0) goto L6
            r0 = 0
            return r0
        L6:
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 == 0) goto Ld
            java.lang.Number r1 = (java.lang.Number) r1
            return r1
        Ld:
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L1b
            double r2 = X.BV6.A00(r1)
            long r0 = (long) r2
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
        L1a:
            return r17
        L1b:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L80
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = X.FDO.A00(r1)
            r17 = 0
            if (r0 != 0) goto L1a
            java.lang.String r9 = r1.trim()
            int r8 = r9.length()     // Catch: java.lang.NumberFormatException -> L1a
            if (r8 == 0) goto L1a
            r7 = 0
            char r1 = r9.charAt(r7)     // Catch: java.lang.NumberFormatException -> L1a
            r0 = 45
            r16 = 1
            if (r1 != r0) goto L42
            r14 = -9223372036854775808
            r7 = 1
            goto L4e
        L42:
            r0 = 43
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != r0) goto L4c
            r7 = 1
        L4c:
            r16 = 0
        L4e:
            if (r7 == r8) goto L1a
            r12 = 10
            long r10 = r14 / r12
            r5 = 0
        L56:
            if (r7 >= r8) goto L78
            char r0 = r9.charAt(r7)     // Catch: java.lang.NumberFormatException -> L1a
            int r1 = r0 + (-48)
            if (r1 < 0) goto L1a
            r0 = 9
            if (r1 > r0) goto L1a
            int r0 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r0 < 0) goto L74
            long r5 = r5 * r12
            long r3 = (long) r1     // Catch: java.lang.NumberFormatException -> L1a
            long r1 = r14 + r3
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L74
            long r5 = r5 - r3
        L71:
            int r7 = r7 + 1
            goto L56
        L74:
            if (r18 == 0) goto L1a
            r5 = r14
            goto L71
        L78:
            if (r16 != 0) goto L7b
            long r5 = -r5
        L7b:
            java.lang.Long r17 = java.lang.Long.valueOf(r5)     // Catch: java.lang.NumberFormatException -> L1a
            return r17
        L80:
            r0 = 0
            r2 = r16
            java.lang.Long r17 = A03(r15, r2, r1, r0)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FDM.A04(X.FDJ, java.lang.Integer, java.lang.Object, boolean):java.lang.Number");
    }

    public static String A05(int i, String str) {
        return i == 0 ? HatchCcvLoggingKt.NO_POSTAL_FIELD : i == 1 ? "bool" : i == 3 ? "int64" : i == 4 ? BrowserOperationCatalogKt.DOUBLE : i == 2 ? "string" : i == 6 ? "array" : i == 7 ? "map" : i == 8 ? "lambda" : i == 100 ? "num" : str;
    }

    public static String A06(FDJ fdj, Integer num, Object obj, String str) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Long)) {
            return obj.toString();
        }
        if (!(obj instanceof Number)) {
            A08(fdj, num, obj, str, "string");
            throw F60.createAndThrow();
        }
        double dA00 = BV6.A00(obj);
        int i = (int) dA00;
        if (i == dA00) {
            return Integer.toString(i);
        }
        String string = Double.toString(dA00);
        int iIndexOf = string.indexOf(69);
        if (iIndexOf < 0) {
            return string;
        }
        int length = string.length();
        int i2 = length + 1;
        char[] cArr = new char[i2];
        string.getChars(0, iIndexOf, cArr, 0);
        cArr[iIndexOf] = 'e';
        int i3 = iIndexOf + 1;
        if (string.charAt(i3) == '-') {
            string.getChars(i3, length, cArr, i3);
        } else {
            cArr[i3] = '+';
            string.getChars(i3, length, cArr, iIndexOf + 2);
            length = i2;
        }
        return new String(cArr, 0, length);
    }

    public static void A07(FDJ fdj, Integer num, Object obj) {
        boolean z = obj instanceof List;
        throw A02(fdj, new Exception(String.format(Locale.US, "Tried to insert a value into an immutable %s", z ? "array" : "map")), num, z ? "Invalid Array Operation" : "Invalid Map Operation");
    }

    public static void A08(FDJ fdj, Integer num, Object obj, String str, String str2) {
        throw A02(fdj, new Exception(String.format(Locale.US, "Arg %s expected to be %s, got %s", str, str2, A05(AbstractC10477Hkr.A01(obj), obj != null ? C60Q.A0e(obj) : "unknown"))), num, obj == null ? "Unexpected Null" : "Invalid Arg Type");
    }

    public static void A09(FDJ fdj, Integer num, Object obj, List list) {
        throw A02(fdj, new Exception(String.format(Locale.US, "%s is an invalid index into an array of size %d", BV5.A1a(obj, list.size()))), num, "Out of Bounds Array index");
    }

    public static void A0A(FDJ fdj, Integer num, String str, int i) {
        throw A02(fdj, new Exception(String.format(Locale.US, "%d is an invalid index into a string of size %d", BV5.A1a(Integer.valueOf(i), str.length()))), num, "Out of Bounds String index");
    }

    public static boolean A0B(Object obj) {
        if (!(obj instanceof Double)) {
            return false;
        }
        double dA00 = BV6.A00(obj);
        return Double.isNaN(dA00) || Double.isInfinite(dA00) || dA00 >= 9.223372036854776E18d || dA00 < -9.223372036854776E18d || Math.floor(dA00) != dA00;
    }

    public static LispyException A02(FDJ fdj, Exception exc, Integer num, String str) {
        int iIntValue = num.intValue();
        ArrayList arrayListA0h = C3cG.A0h();
        List<FDN> list = fdj.A01;
        int size = list.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return new LispyException(str, exc, arrayListA0h);
            }
            FDN fdn = list.get(size);
            F9H f9f = fdn.A01;
            if (f9f == null) {
                arrayListA0h.add("(unsymbolicated)");
            } else {
                if (iIntValue >= 0) {
                    f9f = new F9F(f9f, (List<Integer>) Collections.singletonList(Integer.valueOf(iIntValue)));
                }
                F9G f9gACu = f9f.ACu();
                arrayListA0h.add(f9gACu != null ? f9gACu.A01 : "(unsymbolicated)");
                iIntValue = fdn.A00;
            }
        }
    }

    public static boolean A0C(Object obj, Object obj2, double d) {
        if (A0B(obj) || A0B(obj2)) {
            return false;
        }
        double dA00 = AbstractC10477Hkr.A00(obj);
        if (dA00 < 2.147483648E9d && dA00 >= -2.147483648E9d) {
            double dA002 = AbstractC10477Hkr.A00(obj2);
            if (dA002 < 2.147483648E9d && dA002 >= -2.147483648E9d && Math.abs(d) < 2.147483648E9d) {
                return false;
            }
        }
        return true;
    }
}
