package X;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class BoS {
    public static volatile ScheduledExecutorService A00;

    public static ScheduledExecutorService A00() {
        if (A00 == null) {
            synchronized (BoS.class) {
                if (A00 == null) {
                    A00 = new ScheduledExecutorServiceC2936BpL(C60O.A02());
                }
            }
        }
        return A00;
    }
}
