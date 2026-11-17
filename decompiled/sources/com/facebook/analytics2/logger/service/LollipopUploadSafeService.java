package com.facebook.analytics2.logger.service;

import X.BV4;
import X.C1H;
import X.C3950Cho;
import X.C3958Chx;
import X.C4045Cko;
import X.C4053Ckw;
import X.C7384Etj;
import X.CFK;
import X.Ci4;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.facebook.analytics2.logger.interfaces.IllegalRemoteArgumentException;
import com.facebook.analytics2.logger.legacy.uploader.LollipopUpload;
import com.facebook.common.build.BuildConstants;

/* loaded from: classes5.dex */
public final class LollipopUploadSafeService extends JobService implements Ci4 {
    public LollipopUpload A00;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        C7384Etj.A0Y(jobParameters, 0);
        LollipopUpload lollipopUpload = this.A00;
        if (lollipopUpload == null) {
            return false;
        }
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
            C4053Ckw c4053Ckw = lollipopUpload.A00;
            C1H.A00(c4053Ckw);
            int jobId = jobParameters.getJobId();
            c4053Ckw.A05(new C4045Cko(new Bundle(jobParameters.getExtras())), new C3950Cho(jobParameters, lollipopUpload, this), jobParameters.getExtras().getString("action"), jobId);
            z2 = true;
            return true;
        } catch (IllegalRemoteArgumentException e2) {
            CFK.A0A("PostLolliopUploadService", "Misunderstood job service extras: %s", e2);
            return z2;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        C4053Ckw c4053Ckw;
        C7384Etj.A0Y(jobParameters, 0);
        LollipopUpload lollipopUpload = this.A00;
        if (lollipopUpload == null || (c4053Ckw = lollipopUpload.A00) == null) {
            return true;
        }
        c4053Ckw.A04(jobParameters.getJobId());
        return true;
    }

    @Override // android.app.Service
    public final void onCreate() throws IllegalAccessException, InstantiationException {
        try {
            Object objNewInstance = Class.forName("com.facebook.analytics2.logger.legacy.uploader.LollipopUpload").newInstance();
            C7384Etj.A0Z(objNewInstance, "null cannot be cast to non-null type com.facebook.analytics2.logger.service.ILollipopUpload");
            LollipopUpload lollipopUpload = (LollipopUpload) objNewInstance;
            this.A00 = lollipopUpload;
            C7384Etj.A0X(lollipopUpload);
            lollipopUpload.A00 = C4053Ckw.A00(this);
        } catch (Exception e) {
            CFK.A0E("LollipopUploadSafeService", "LollipopUpload failed to be created, className %s", e, "com.facebook.analytics2.logger.legacy.uploader.LollipopUpload");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        LollipopUpload lollipopUpload = this.A00;
        if (lollipopUpload == null) {
            return 1;
        }
        C4053Ckw c4053Ckw = lollipopUpload.A00;
        C1H.A00(c4053Ckw);
        return c4053Ckw.A03(intent, new C3958Chx(this, i2));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        LollipopUpload lollipopUpload = this.A00;
        if (lollipopUpload != null) {
            lollipopUpload.A00 = null;
        }
        this.A00 = null;
    }
}
