package X;

import java.util.Arrays;

/* renamed from: X.CMk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3422CMk {
    public static CFL A00 = CGd.A01;

    public static final void A00(Class<?> cls, String str) {
        CFL cfl = A00;
        if (CFL.A02(cfl)) {
            cfl.e(cls.getSimpleName(), str);
        }
    }

    public static final void A01(Class<?> cls, String str, Throwable th) {
        CFL cfl = A00;
        if (cfl.AOg(5)) {
            cfl.w(cls.getSimpleName(), str, th);
        }
    }

    public static final void A02(Class<?> cls, String str, Object... objArr) {
        CFL cfl = A00;
        if (cfl.AOg(5)) {
            cfl.w(cls.getSimpleName(), C7384Etj.A0K(str, objArr, 3));
        }
    }

    public static final void A03(String str, String str2) {
        CFL cfl = A00;
        if (CFL.A02(cfl)) {
            cfl.e(str, str2);
        }
    }

    public static final void A04(String str, String str2) {
        CFL cfl = A00;
        if (cfl.AOg(5)) {
            cfl.w(str, str2);
        }
    }

    public static final void A05(String str, String str2, Throwable th) {
        CFL cfl = A00;
        if (CFL.A02(cfl)) {
            cfl.e(str, str2, th);
        }
    }

    public static final void A06(String str, String str2, Object... objArr) {
        CFL cfl = A00;
        if (cfl.AOg(5)) {
            cfl.w(str, C7384Etj.A0K(str2, objArr, objArr.length));
        }
    }

    public static final void A07(String str, String str2, Object... objArr) {
        CFL cfl = A00;
        if (CFL.A02(cfl)) {
            cfl.Aj7(str, C7384Etj.A0K(str2, objArr, objArr.length));
        }
    }

    public static final void A08(Throwable th, String str, Object... objArr) {
        if (A00.AOg(5)) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
            Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
            A01(C7081Efh.class, String.format(null, str, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length)), th);
        }
    }
}
