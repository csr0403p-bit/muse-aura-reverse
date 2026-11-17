package X;

/* loaded from: classes5.dex */
public abstract class CVn {
    public static void A01(Boolean bool) {
        if (bool != null && !bool.booleanValue()) {
            throw BV4.A0P();
        }
    }

    public static void A03(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void A04(boolean z, Object obj) {
        if (!z) {
            throw C60O.A0i(String.valueOf(obj));
        }
    }

    public static void A05(boolean z, String str, Object... objArr) {
        if (!z) {
            throw C60O.A0i(A00(str, objArr));
        }
    }

    public static String A00(String str, Object... objArr) {
        String strValueOf = String.valueOf(str);
        int length = strValueOf.length();
        int length2 = objArr.length;
        StringBuilder sbA12 = BV7.A12(length2, length);
        int iA0K = 0;
        int i = 0;
        while (iA0K < length2) {
            int iIndexOf = strValueOf.indexOf("%s", i);
            if (iIndexOf == -1) {
                break;
            }
            iA0K = BV7.A0K(strValueOf.substring(i, iIndexOf), sbA12, objArr, iA0K);
            i = iIndexOf + 2;
        }
        sbA12.append(strValueOf.substring(i));
        if (iA0K < length2) {
            int iA0K2 = BV7.A0K(" [", sbA12, objArr, iA0K);
            while (iA0K2 < length2) {
                iA0K2 = BV7.A0K(", ", sbA12, objArr, iA0K2);
            }
            sbA12.append(']');
        }
        return sbA12.toString();
    }

    public static void A02(boolean z) {
        A01(Boolean.valueOf(z));
    }
}
