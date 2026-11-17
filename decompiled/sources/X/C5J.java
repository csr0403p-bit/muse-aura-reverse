package X;

import android.util.Log;
import com.facebook.common.errorreporting.SoftErrorException;
import java.util.List;
import java.util.Random;

/* loaded from: classes5.dex */
public final class C5J {
    public static final Random A01 = new Random();
    public static List<C5K> A00 = C3cG.A0h();

    public static void A00(String str, String str2, Throwable th) {
        String strA00 = C5M.A00("SOFT ERROR %s: %s", str, str2);
        if (th == null) {
            Log.e("DexTricksErrorReporter", strA00);
        } else {
            Log.e("DexTricksErrorReporter", strA00, th);
        }
        if (A01.nextInt(1000) == 0) {
            new Thread(new C5H(new SoftErrorException(FGI.A0U(str, " | ", str2), th), str, str2), "dexTrickError").start();
        }
    }

    public static synchronized void A01(Throwable th) {
        List<C5K> list = A00;
        if (list.size() >= 50) {
            C5M.A01("DexTricksErrorReporter", "Attempting to add a pending soft error after the list is full.", new Object[0]);
        } else {
            list.add(new C5K(th));
        }
    }
}
