package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class CNS {
    public final CNO A00;
    public final ScheduledExecutorService A01;

    public CNS(CNO cno) {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.A00 = cno;
        this.A01 = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }
}
