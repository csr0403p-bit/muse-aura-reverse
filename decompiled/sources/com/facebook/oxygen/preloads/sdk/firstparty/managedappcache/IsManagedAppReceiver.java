package com.facebook.oxygen.preloads.sdk.firstparty.managedappcache;

import X.CFK;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes5.dex */
public class IsManagedAppReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            action.getClass();
            if (action.equals("com.facebook.oxygen.preloads.sdk.firstparty.managedappcache.IS_MANAGED_APP_CHANGED")) {
                new Intent(context, (Class<?>) IsManagedAppCacheJobService.class).setAction(action);
                Object systemService = context.getApplicationContext().getSystemService("jobscheduler");
                JobInfo jobInfoBuild = new JobInfo.Builder(1517668458, new ComponentName(context, (Class<?>) IsManagedAppCacheJobService.class)).setOverrideDeadline(0L).build();
                try {
                    systemService.getClass();
                    ((JobScheduler) systemService).enqueue(jobInfoBuild, new JobWorkItem(intent));
                } catch (IllegalArgumentException | IllegalStateException e) {
                    CFK.A08("IsManagedAppCacheJobSvc", "Failed to enqueue managed app cache job", e);
                }
            }
        }
    }
}
