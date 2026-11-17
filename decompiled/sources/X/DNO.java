package X;

import android.util.Pair;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class DNO {
    public static final DNO A08 = new DNO();
    public String A00;
    public String A01;
    public F18<ExecutorService> A02;
    public F18<C8ee<?>> A03;
    public final Object A04 = C3cG.A0T();
    public final List<Pair<String, String>> A05 = C3cG.A0h();
    public final AtomicBoolean A06 = new AtomicBoolean();
    public final AtomicBoolean A07 = C60O.A1E();

    public static void A00(DNO dno, String str, String str2) {
        F18<C8ee<?>> f18 = dno.A03;
        if (f18 != null) {
            Eu1 eu1AcquireEvent = f18.get().acquireEvent("mobile_config_general_cases");
            if (eu1AcquireEvent.isSampled()) {
                eu1AcquireEvent.A3y("mc_event_name", "mobile_config_api2_consistency");
                eu1AcquireEvent.A3g("str_data", new DNR(dno, str, str2));
                eu1AcquireEvent.APu();
            }
        }
    }
}
