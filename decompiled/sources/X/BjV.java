package X;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class BjV {
    public final ScheduledFuture<?> A00;
    public final AtomicBoolean A01 = C60O.A1E();
    public final /* synthetic */ C2734Bjb A02;

    public BjV(C2734Bjb c2734Bjb) {
        this.A02 = c2734Bjb;
        this.A00 = c2734Bjb.A01.A0R.schedule(new Runnable() { // from class: X.Bje
            public static final String __redex_internal_original_name = "Camera2CameraImpl$ErrorTimeoutReopenScheduler$ScheduleNode$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                final BjV bjV = this.A00;
                if (bjV.A01.getAndSet(true)) {
                    return;
                }
                bjV.A02.A01.A0Q.execute(new Runnable() { // from class: X.BjT
                    public static final String __redex_internal_original_name = "Camera2CameraImpl$ErrorTimeoutReopenScheduler$ScheduleNode$$ExternalSyntheticLambda1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        Bj4 bj4 = bjV.A02.A01;
                        if (bj4.A0a != C79.A0Y) {
                            Bj4.A09(bj4, FGI.A0M("Camera skip reopen at state: ", Bj4.A02(bj4)), null);
                            return;
                        }
                        Bj4.A09(bj4, "Camera onError timeout, reopen it.", null);
                        bj4.A0G(null, C79.A0W);
                        bj4.A0E.A00();
                    }
                });
            }
        }, 2000L, TimeUnit.MILLISECONDS);
    }
}
