package X;

import android.os.Process;
import android.util.Log;
import com.facebook.common.errorreporting.SoftErrorException;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class C5H implements Runnable {
    public static final String __redex_internal_original_name = "DexTricksErrorReporter$1";
    public final /* synthetic */ SoftErrorException A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C5H(SoftErrorException softErrorException, String str, String str2) {
        this.A00 = softErrorException;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Process.setThreadPriority(10);
            HashMap mapA0u = BV4.A0u();
            mapA0u.put("stack_trace", C6Q.A01(this.A00));
            String strA0X = FGI.A0X(this.A01, " [freq=", "]", 1000);
            String str = this.A02;
            HashMap mapA0u2 = BV4.A0u();
            mapA0u2.putAll(mapA0u);
            C6E.A02(null, null, null, mapA0u2);
            C6E.A03(strA0X, str, mapA0u2);
            C6E.A00().A04(mapA0u2);
        } catch (Throwable th) {
            Log.w("DexTricksErrorReporter", C5M.A00("Unable to report soft error", BV4.A1W()), th);
        }
    }
}
