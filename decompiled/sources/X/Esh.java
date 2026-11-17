package X;

import android.os.Process;
import com.facebook.msys.mci.Execution;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class Esh implements Runnable {
    public static final String __redex_internal_original_name = "Execution$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;

    public Esh(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        int i = C7402Eug.A00.get();
        if (i != Integer.MIN_VALUE) {
            Process.setThreadPriority(i);
        }
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = Execution.sThreadPriorityMap;
        Integer numValueOf = Integer.valueOf(this.A00);
        if (concurrentHashMap.get(numValueOf) != null) {
            Process.setThreadPriority(AnonymousClass001.A0F(concurrentHashMap.get(numValueOf)));
        }
        List listA0z = BV4.A0z(numValueOf, C7402Eug.A00());
        listA0z.getClass();
        listA0z.add(Integer.valueOf(Process.myTid()));
        Execution.nativeStartExecutor(this.A01);
    }
}
