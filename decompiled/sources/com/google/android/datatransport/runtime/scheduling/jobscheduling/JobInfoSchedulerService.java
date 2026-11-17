package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import X.AbstractC3873Cg4;
import X.BV4;
import X.BV5;
import X.C3847Cfc;
import X.C3856Cfl;
import X.Ce5;
import X.Ce7;
import X.RunnableC3840CfT;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;

/* loaded from: classes5.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C3847Cfc.A01(getApplicationContext());
        if (string == null) {
            throw BV4.A0a("Null backendName");
        }
        Ce5 ce5 = Ce7.A00.get(i);
        if (ce5 == null) {
            throw BV5.A0Q("Unknown Priority for value ", i);
        }
        byte[] bArrDecode = string2 != null ? Base64.decode(string2, 0) : null;
        C3856Cfl c3856Cfl = C3847Cfc.A00().A01;
        c3856Cfl.A08.execute(new RunnableC3840CfT(AbstractC3873Cg4.A00(ce5, string, bArrDecode), c3856Cfl, new Runnable() { // from class: X.CgO
            public static final String __redex_internal_original_name = "JobInfoSchedulerService$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                this.jobFinished(jobParameters, false);
            }
        }, i2));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
