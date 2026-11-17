package X;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class CS4 {
    public static CS4 A04;
    public final Context A02;
    public final ScheduledExecutorService A03;
    public CTY A01 = new CTY(this);
    public int A00 = 1;

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r4v0 X.CS4) */
    public static final synchronized CSC A00(CS4 cs4, CTa cTa) {
        CSC csc;
        synchronized (cs4) {
            if (BV4.A1U("MessengerIpcClient")) {
                String strValueOf = String.valueOf(cTa);
                BV8.A1P(BV4.A0p(BV5.A04(strValueOf) + 9), "Queueing ", strValueOf, "MessengerIpcClient");
            }
            if (!cs4.A01.A02(cTa)) {
                CTY cty = new CTY(cs4);
                cs4.A01 = cty;
                cty.A02(cTa);
            }
            csc = cTa.A03.A00;
        }
        return csc;
    }

    public static synchronized CS4 A01(Context context) {
        CS4 cs4;
        cs4 = A04;
        if (cs4 == null) {
            cs4 = new CS4(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new C04("MessengerIpcClient"))));
            A04 = cs4;
        }
        return cs4;
    }

    public CS4(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.A03 = scheduledExecutorService;
        this.A02 = context.getApplicationContext();
    }
}
