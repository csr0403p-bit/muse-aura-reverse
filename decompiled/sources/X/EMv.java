package X;

import android.app.job.JobScheduler;

/* loaded from: classes5.dex */
public abstract class EMv {
    public static final JobScheduler A00(JobScheduler jobScheduler) {
        C7384Etj.A0Y(jobScheduler, 0);
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        C7384Etj.A0U(jobSchedulerForNamespace);
        return jobSchedulerForNamespace;
    }
}
