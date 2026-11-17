package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.List;

/* loaded from: classes5.dex */
public final class CFK {
    public static boolean A00;
    public static volatile CFL A02 = CFM.A01;
    public static final List A01 = C3cG.A0h();

    static {
        A02.Adl(5);
        AbstractC3422CMk.A00 = A02;
    }

    public static void A00(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2) {
        if (A02.AOg(4)) {
            A05(str, StringFormatUtil.formatStrLocaleSafe(str2, obj, obj2, obj3, obj4));
        }
    }

    public static void A03(Object obj, String str, String str2) {
        if (A02.AOg(4)) {
            A05(str, StringFormatUtil.formatStrLocaleSafe(str2, obj));
        }
    }

    public static void A05(String str, String str2) {
        if (A02.AOg(4)) {
            A02.i(str, str2);
        }
    }

    public static void A06(String str, String str2) {
        if (A02.AOg(5)) {
            A02.w(str, str2);
        }
    }

    public static void A0A(String str, String str2, Throwable th) {
        if (A02.AOg(5)) {
            if (str2 == null) {
                str2 = "";
            }
            CFL cfl = A02;
            if (th == null) {
                cfl.w(str, str2);
            } else {
                cfl.w(str, str2, th);
            }
        }
    }

    public static void A0D(String str, String str2, Throwable th, Object... objArr) {
        if (A02.AOg(5)) {
            A0A(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr), th);
        }
    }

    public static void A0H(String str, String str2, Object... objArr) {
        if (A02.AOg(5)) {
            A06(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr));
        }
    }

    public static void A0K(String str, Throwable th, String str2) {
        if (A02.AOg(5)) {
            A02.w(str, str2, th);
        }
    }

    public static void A01(Object obj, Object obj2, Object obj3, String str, String str2) {
        if (CFL.A00()) {
            A05(str, StringFormatUtil.formatStrLocaleSafe(str2, obj, obj2, obj3));
        }
    }

    public static void A02(Object obj, Object obj2, String str, String str2) {
        if (CFL.A00()) {
            A05(str, StringFormatUtil.formatStrLocaleSafe(str2, obj, obj2));
        }
    }

    public static void A04(String str, String str2) {
        if (CFL.A01()) {
            A02.e(str, str2);
        }
    }

    public static void A07(String str, String str2) {
        if (CFL.A01()) {
            A02.Aj7(str, str2);
        }
    }

    public static void A08(String str, String str2, Throwable th) {
        if (CFL.A01()) {
            if (str2 == null) {
                str2 = "";
            }
            CFL cfl = A02;
            if (th == null) {
                cfl.e(str, str2);
            } else {
                cfl.e(str, str2, th);
            }
        }
    }

    public static void A09(String str, String str2, Throwable th) {
        if (CFL.A00()) {
            CFL cfl = A02;
            if (th == null) {
                cfl.i(str, str2);
            } else {
                cfl.i(str, str2, th);
            }
        }
    }

    public static void A0B(String str, String str2, Throwable th) {
        if (CFL.A01()) {
            A02.Aj8(str, str2, th);
        }
    }

    public static void A0C(String str, String str2, Throwable th, Object... objArr) {
        if (CFL.A01()) {
            A08(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr), th);
        }
    }

    public static void A0E(String str, String str2, Throwable th, Object... objArr) {
        if (CFL.A01()) {
            A0B(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr), th);
        }
    }

    public static void A0F(String str, String str2, Object... objArr) {
        if (CFL.A01()) {
            A04(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr));
        }
    }

    public static void A0G(String str, String str2, Object... objArr) {
        if (CFL.A00()) {
            A05(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr));
        }
    }

    public static void A0I(String str, String str2, Object... objArr) {
        if (CFL.A01()) {
            A07(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr));
        }
    }

    public static void A0J(String str, Throwable th, String str2) {
        if (CFL.A01()) {
            A02.e(str, str2, th);
        }
    }

    public static void A0L(String str, Throwable th, String str2) {
        if (CFL.A01()) {
            A02.Aj8(str, str2, th);
        }
    }
}
