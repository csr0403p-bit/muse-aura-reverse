package com.facebook.pushlite;

import X.BV4;
import X.BV5;
import X.Bs8;
import X.C3936ChK;
import X.C3944Cha;
import X.C3945Chc;
import X.C3946Chd;
import X.C3961Ci5;
import X.CFK;
import X.CHZ;
import X.RunnableC3943ChZ;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.facebook.common.build.BuildConstants;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class PushLiteLollipopJobService extends JobService {
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C3961Ci5 c3961Ci5 = C3944Cha.A02;
        return 2;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        C3944Cha c3944Cha = C3944Cha.A03;
        jobParameters.getJobId();
        C3946Chd c3946Chd = c3944Cha.A00;
        AtomicReference<RunnableC3943ChZ> atomicReference = c3946Chd.A02;
        RunnableC3943ChZ runnableC3943ChZ = atomicReference.get();
        if (runnableC3943ChZ != null) {
            runnableC3943ChZ.A02 = true;
            c3946Chd.A00.removeCallbacks(runnableC3943ChZ);
            Bs8.A00(runnableC3943ChZ, null, atomicReference);
            return true;
        }
        C3936ChK c3936ChKA00 = C3936ChK.A00(this);
        synchronized (c3936ChKA00) {
            c3936ChKA00.A00.put(jobParameters.getJobId(), false);
        }
        return false;
    }

    public PushLiteLollipopJobService(int i) {
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        boolean z = false;
        if (extras == null) {
            CFK.A04("JobServiceCompat", "Job with no build ID, cancelling job");
        } else {
            int i = extras.getInt("__VERSION_CODE", 0);
            if (BuildConstants.A01() != i) {
                BV4.A1B(i, "JobServiceCompat", "Job with old build ID: %d, cancelling job");
            } else {
                z = true;
            }
        }
        if (z) {
            int jobId = jobParameters.getJobId();
            try {
            } catch (RuntimeException unused) {
                CFK.A0F("JobServiceCompat", "Runtime error getting service info, cancelling: %d", BV5.A1Y(jobId));
            }
            if (CHZ.A00(this, 0).A01(getClass(), jobId)) {
                C3944Cha c3944Cha = C3944Cha.A03;
                jobParameters.getJobId();
                new Bundle(jobParameters.getExtras());
                return c3944Cha.A00(new C3945Chc(jobParameters, this, this));
            }
            BV4.A1B(jobId, "JobServiceCompat", "Invalid JS jobId, cancelling: %d");
            int jobId2 = jobParameters.getJobId();
            JobScheduler jobScheduler = (JobScheduler) getSystemService("jobscheduler");
            if (jobScheduler != null) {
                jobScheduler.cancel(jobId2);
                return false;
            }
        } else {
            BV4.A1B(jobParameters.getJobId(), "JobServiceCompat", "Stale job parameters, cancelling jobId: %d");
        }
        return false;
    }

    public PushLiteLollipopJobService() {
    }
}
