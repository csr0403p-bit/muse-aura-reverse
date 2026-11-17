package com.facebook.aura.executors;

import X.C7384Etj;
import X.CFK;
import android.database.sqlite.SQLiteFullException;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class AuraWorkManagerTaskExecutor implements Executor {
    public static final AuraWorkManagerTaskExecutor INSTANCE = new AuraWorkManagerTaskExecutor();

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        C7384Etj.A0Y(runnable, 0);
        ((Executor) AuraExecutors.ioExecutor$delegate.getValue()).execute(new Runnable() { // from class: com.facebook.aura.executors.AuraWorkManagerTaskExecutor.execute.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    runnable.run();
                } catch (SQLiteFullException e) {
                    CFK.A0A("AuraWorkManagerTaskExecutor", "WorkManager task failed because storage is full", e);
                }
            }
        });
    }
}
