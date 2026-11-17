package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public final class C7B implements Runnable {
    public static final String __redex_internal_original_name = "ProcessImportanceProvider";
    public long A00;
    public final ActivityManager.RunningAppProcessInfo A01;
    public final Context A03;
    public final Object A02 = C3cG.A0T();
    public final List A04 = new CopyOnWriteArrayList();

    public static boolean A00(ActivityManager.RunningAppProcessInfo runningAppProcessInfo) {
        synchronized (runningAppProcessInfo) {
            try {
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
            } catch (RuntimeException e) {
                CFK.A08(__redex_internal_original_name, "Could not get current importance", e);
                return false;
            }
        }
        return true;
    }

    public final boolean A01() {
        int i;
        boolean zA00;
        int i2;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = this.A01;
        synchronized (runningAppProcessInfo) {
            i = runningAppProcessInfo.importance;
            zA00 = A00(runningAppProcessInfo);
            if (zA00) {
                this.A00 = SystemClock.uptimeMillis();
                i2 = runningAppProcessInfo.importance;
            } else {
                i2 = i;
            }
        }
        synchronized (this.A02) {
        }
        if (zA00 && i != i2) {
            Iterator it = this.A04.iterator();
            if (it.hasNext()) {
                it.next();
                throw BV4.A0a("onImportanceChanged");
            }
        }
        return zA00;
    }

    public C7B(Context context) {
        this.A03 = context;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        this.A01 = runningAppProcessInfo;
        runningAppProcessInfo.importance = 0;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        while (true) {
            A01();
            try {
                Thread.sleep(0L);
            } catch (InterruptedException unused) {
            }
        }
    }
}
