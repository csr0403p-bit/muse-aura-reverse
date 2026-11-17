package X;

import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class Bp7 extends ThreadLocal<ScheduledExecutorService> {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ ScheduledExecutorService initialValue() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return BoS.A00();
        }
        if (Looper.myLooper() != null) {
            return new ScheduledExecutorServiceC2936BpL(BV4.A09(Looper.myLooper()));
        }
        return null;
    }
}
