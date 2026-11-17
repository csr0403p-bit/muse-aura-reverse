package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.util.SparseBooleanArray;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ChK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3936ChK {
    public static C3936ChK A01;
    public final SparseBooleanArray A00 = new SparseBooleanArray();

    public static synchronized C3936ChK A00(Context context) {
        C3936ChK c3936ChK;
        c3936ChK = A01;
        if (c3936ChK == null) {
            c3936ChK = new C3936ChK(context.getApplicationContext());
            A01 = c3936ChK;
        }
        return c3936ChK;
    }

    public C3936ChK(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null) {
            CFK.A07("JobTracker", "jobScheduler was null");
            return;
        }
        try {
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            if (allPendingJobs != null) {
                Iterator<JobInfo> it = allPendingJobs.iterator();
                while (it.hasNext()) {
                    this.A00.put(it.next().getId(), true);
                }
            }
        } catch (NullPointerException e) {
            CFK.A0K("JobSchedulerWrapper", e, "Framework threw NPE from JobScheduler.getAllPendingJobs()");
        }
    }
}
