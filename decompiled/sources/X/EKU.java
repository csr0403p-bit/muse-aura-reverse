package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class EKU implements ENK {
    public static final String A0B = EK9.A01("Processor");
    public Context A00;
    public EKi A02;
    public WorkDatabase A03;
    public ENP A04;
    public Map<String, WorkerWrapper> A05 = BV4.A0u();
    public Map<String, WorkerWrapper> A06 = BV4.A0u();
    public Set<String> A08 = C60O.A13();
    public final List<InterfaceC6635ELf> A0A = C3cG.A0h();
    public PowerManager.WakeLock A01 = null;
    public final Object A09 = C3cG.A0T();
    public Map<String, Set<EMx>> A07 = BV4.A0u();

    public static WorkerWrapper A00(EKU eku, String str) {
        Map<String, WorkerWrapper> map = eku.A06;
        WorkerWrapper workerWrapperRemove = map.remove(str);
        boolean z = true;
        if (workerWrapperRemove == null) {
            z = false;
            workerWrapperRemove = eku.A05.remove(str);
        }
        eku.A07.remove(str);
        if (!z) {
            return workerWrapperRemove;
        }
        synchronized (eku.A09) {
            if (map.isEmpty()) {
                Context context = eku.A00;
                Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    context.startService(intent);
                } catch (Throwable th) {
                    EK9.A00();
                    Log.e(A0B, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = eku.A01;
                if (wakeLock != null) {
                    wakeLock.release();
                    eku.A01 = null;
                }
            }
        }
        return workerWrapperRemove;
    }

    public static boolean A01(WorkerWrapper id, String wrapper, int stopReason) {
        if (id == null) {
            BV4.A1E(EK9.A00(), "WorkerWrapper could not be found for ", wrapper, A0B);
            return false;
        }
        id.A0A.A5w(new WorkerStoppedException(stopReason));
        EK9 ek9A00 = EK9.A00();
        String str = A0B;
        StringBuilder sbA0x = C3cI.A0x("WorkerWrapper interrupted for ", wrapper);
        sbA0x.append(" (");
        sbA0x.append(id.A05.A0K);
        ek9A00.A02(str, C60P.A1O("), reason: ", sbA0x, stopReason));
        return true;
    }

    public final void A02(InterfaceC6635ELf executionListener) {
        synchronized (this.A09) {
            this.A0A.add(executionListener);
        }
    }

    public EKU(Context appContext, EKi configuration, WorkDatabase workTaskExecutor, ENP workDatabase) {
        this.A00 = appContext;
        this.A02 = configuration;
        this.A04 = workDatabase;
        this.A03 = workTaskExecutor;
    }
}
