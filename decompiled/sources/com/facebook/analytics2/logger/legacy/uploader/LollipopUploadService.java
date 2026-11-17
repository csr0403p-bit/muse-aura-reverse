package com.facebook.analytics2.logger.legacy.uploader;

import X.BV4;
import X.C1H;
import X.C3952Chq;
import X.C3958Chx;
import X.C4045Cko;
import X.C4053Ckw;
import X.CFK;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.facebook.analytics2.logger.interfaces.IllegalRemoteArgumentException;
import com.facebook.common.build.BuildConstants;

/* loaded from: classes5.dex */
public class LollipopUploadService extends JobService {
    public C4053Ckw A00;

    @Override // android.app.Service
    public final void onDestroy() {
        this.A00 = null;
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        try {
            C4053Ckw c4053Ckw = this.A00;
            C1H.A00(c4053Ckw);
            return c4053Ckw.A03(intent, new C3958Chx(this, i2));
        } catch (RuntimeException e) {
            CFK.A0A("PostLolliopUploadService", "Invalid service intent: %s", e);
            return 2;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        C4053Ckw c4053Ckw = this.A00;
        if (c4053Ckw == null) {
            return true;
        }
        c4053Ckw.A04(jobParameters.getJobId());
        return true;
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.A00 = C4053Ckw.A00(this);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        boolean z = false;
        if (extras == null) {
            CFK.A04("PostLolliopUploadService", "Job with no build ID, cancelling job");
        } else {
            try {
                int i = extras.getInt("__VERSION_CODE", 0);
                if (BuildConstants.A01() != i) {
                    BV4.A1B(i, "PostLolliopUploadService", "Job with old build ID: %d, cancelling job");
                } else {
                    z = true;
                }
            } catch (Exception e) {
                CFK.A0J("PostLolliopUploadService", e, "Corrupt bundle, cancelling job");
            }
        }
        boolean z2 = false;
        if (!z) {
            CFK.A03(Integer.valueOf(jobParameters.getJobId()), "PostLolliopUploadService", "Stale job parameters, cancelling jobId: %d");
            return false;
        }
        try {
            C4053Ckw c4053CkwA00 = this.A00;
            if (c4053CkwA00 == null) {
                c4053CkwA00 = C4053Ckw.A00(this);
                this.A00 = c4053CkwA00;
            }
            C1H.A00(c4053CkwA00);
            int jobId = jobParameters.getJobId();
            c4053CkwA00.A05(new C4045Cko(new Bundle(jobParameters.getExtras())), new C3952Chq(jobParameters, this), jobParameters.getExtras().getString("action"), jobId);
            z2 = true;
            return true;
        } catch (IllegalRemoteArgumentException e2) {
            CFK.A0A("PostLolliopUploadService", "Misunderstood job service extras: %s", e2);
            return z2;
        }
    }
}
