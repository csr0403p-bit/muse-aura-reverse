package com.facebook.oxygen.preloads.sdk.firstparty.managedappcache;

import X.BV4;
import X.C7571F4k;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes5.dex */
public class IsManagedAppCacheJobService extends JobService {
    public static HandlerThread A02;
    public Handler A00;
    public volatile boolean A01;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        this.A01 = false;
        BV4.A1D(this.A00, jobParameters, 1);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        this.A01 = true;
        return true;
    }

    @Override // android.app.Service
    public final void onCreate() {
        HandlerThread handlerThread;
        synchronized (IsManagedAppCacheJobService.class) {
            if (A02 == null) {
                HandlerThread handlerThread2 = new HandlerThread("th-IsManagedAppCacheJobSvc");
                A02 = handlerThread2;
                handlerThread2.start();
            }
            handlerThread = A02;
        }
        this.A00 = new Handler(handlerThread.getLooper(), new C7571F4k(this, 2));
    }
}
