package X;

import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class CSD implements CSY<Bundle, String> {
    public final /* synthetic */ C3528CSh A00;

    public CSD(C3528CSh c3528CSh) {
        this.A00 = c3528CSh;
    }

    @Override // X.CSY
    public final /* synthetic */ String then(CSA<Bundle> csa) throws IOException {
        Object obj;
        CSC csc = (CSC) csa;
        synchronized (csc.A04) {
            CRy.A09(csc.A02, "Task is not yet complete");
            if (csc.A05) {
                throw new CancellationException("Task is already canceled.");
            }
            Exception exc = csc.A00;
            if (exc instanceof IOException) {
                throw ((IOException) exc);
            }
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            obj = csc.A01;
        }
        BaseBundle baseBundle = (BaseBundle) obj;
        if (baseBundle == null) {
            throw BV4.A0K("SERVICE_NOT_AVAILABLE");
        }
        String string = baseBundle.getString("registration_id");
        if (string != null || (string = baseBundle.getString("unregistered")) != null) {
            return string;
        }
        String string2 = baseBundle.getString("error");
        if ("RST".equals(string2)) {
            throw BV4.A0K("INSTANCE_ID_RESET");
        }
        if (string2 != null) {
            throw BV4.A0K(string2);
        }
        String strValueOf = String.valueOf(baseBundle);
        Log.w("FirebaseInstanceId", C60P.A1M("Unexpected response: ", strValueOf, BV4.A0p(BV5.A04(strValueOf) + 21)), new Throwable());
        throw BV4.A0K("SERVICE_NOT_AVAILABLE");
    }
}
