package X;

import android.os.Process;
import com.facebook.systrace.Systrace;

/* loaded from: classes5.dex */
public final class CCO implements Runnable {
    public static final String __redex_internal_original_name = "NamedThreadFactory$newThread$wrapperRunnable$1";
    public final /* synthetic */ CCP A00;
    public final /* synthetic */ Runnable A01;

    public CCO(CCP ccp, Runnable runnable) {
        this.A00 = ccp;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CCD ccd = CCD.$redex_init_class;
        if ((64 & COZ.A02) != 0) {
            Systrace.A07("thread_name", Process.myTid(), Thread.currentThread().getName());
        }
        try {
            Process.setThreadPriority(this.A00.A00);
        } catch (Throwable unused) {
        }
        Runnable runnable = this.A01;
        if (runnable == null) {
            throw BV4.A0U();
        }
        runnable.run();
    }
}
