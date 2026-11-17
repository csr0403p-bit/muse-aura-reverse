package X;

import com.instagram.common.lispy.lang.BloksScriptingException;
import com.instagram.common.lispy.lang.LispyException;

/* renamed from: X.FAk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7691FAk {
    public static Object A01(F6D f6d, Hj6 hj6, HsM hsM, Integer num) {
        F9b f9bA03;
        FDK fdk = ((FDG) hsM).A01;
        F9H f9h = fdk == null ? null : fdk.A00;
        F6D f6dA00 = (f9h == null || f9h == ((F6L) f6d).A00) ? f6d : F6D.A00(f9h, f6d, null);
        AbstractC7692FAm.A05.incrementAndGet();
        FBB fbb = f6dA00.A02;
        if (fbb != null && (f9bA03 = FBA.A03(fbb)) != null && AbstractC8162FXe.A03()) {
            f9bA03.A00++;
        }
        try {
            try {
                C7384Etj.A0Y(hj6, 1);
                String str = new String[]{"systrace"}[0];
                if (!str.equals("systrace")) {
                    throw BV5.A0T("No implementation bound to key: %s", new Object[]{str});
                }
                Object objA00 = FDH.A00(hj6, hsM, f6dA00);
                String str2 = new String[]{"systrace"}[0];
                if (!str2.equals("systrace")) {
                    throw BV5.A0T("No implementation bound to key: %s", new Object[]{str2});
                }
                if (fbb != null) {
                    FBA.A08(fbb);
                }
                return objA00;
            } catch (BloksScriptingException e) {
                String str3 = new String[]{"systrace"}[0];
                if (!str3.equals("systrace")) {
                    throw BV5.A0T("No implementation bound to key: %s", new Object[]{str3});
                }
                if (num != C79.A01) {
                    throw e;
                }
                String str4 = ((LispyException) e.mException).category;
                FBB fbb2 = f6d.A02;
                C7384Etj.A0Y(str4, 0);
                FFI.A01(fbb2, "Exception while evaluating Lispy Script", e);
                if (fbb == null) {
                    return null;
                }
                FBA.A08(fbb);
                return null;
            }
        } catch (Throwable th) {
            if (fbb != null) {
                FBA.A08(fbb);
            }
            throw th;
        }
    }

    public static Object A00(F6D f6d, Hj6 hj6, HsM hsM) {
        return A01(f6d, hj6, hsM, C79.A01);
    }

    public static void A02(F6D f6d, C9115Fyg c9115Fyg, HsM hsM, Object obj, int i) {
        c9115Fyg.A06(obj, i);
        A00(f6d, c9115Fyg.A05(), hsM);
    }
}
