package X;

import android.os.Process;
import android.util.Log;
import java.util.Set;

/* renamed from: X.BpV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2941BpV extends Thread {
    public static final String __redex_internal_original_name = "VideoScrollAwareThread";
    public final int A00;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Set<Integer> set;
        int iMyTid = Process.myTid();
        BYq bYq = BYq.A03;
        Integer numValueOf = Integer.valueOf(iMyTid);
        synchronized (bYq) {
            set = bYq.A01;
            set.add(numValueOf);
        }
        int i = this.A00;
        if (i <= 19 && i >= -19 && !C3cH.A1K()) {
            Process.setThreadPriority(iMyTid, i);
        }
        try {
            super.run();
            try {
                synchronized (bYq) {
                    set.remove(numValueOf);
                    bYq.A00.remove(numValueOf);
                }
            } catch (Exception e) {
                Log.w(__redex_internal_original_name, "Unable to unregister thread id on cleanup", e);
            }
        } catch (Throwable th) {
            try {
                synchronized (bYq) {
                    set.remove(numValueOf);
                    bYq.A00.remove(numValueOf);
                    throw th;
                }
            } catch (Exception e2) {
                Log.w(__redex_internal_original_name, "Unable to unregister thread id on cleanup", e2);
                throw th;
            }
        }
    }

    public C2941BpV() {
        this.A00 = Integer.MIN_VALUE;
    }

    public C2941BpV(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.A00 = i;
    }
}
