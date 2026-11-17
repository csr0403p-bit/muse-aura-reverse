package com.facebook.aura.startup.boot.syncworker;

import X.AnonymousClass003;
import X.C7384Etj;
import X.C77S;
import X.C77i;
import X.HtJ;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.facebook.aura.gateway.AuraProactiveSyncManager;
import com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class AuraProactiveSyncBootstrapWorker extends AuraBackgroundCoroutineWorker {
    @Override // com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker
    public Object doBackgroundWork(HtJ<? super C77S> htJ) throws IOException {
        AuraProactiveSyncManager auraProactiveSyncManager = AuraProactiveSyncManager.INSTANCE;
        Context context = this.mAppContext;
        C7384Etj.A0U(context);
        auraProactiveSyncManager.enqueueAll(context);
        return new C77i();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraProactiveSyncBootstrapWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass003.A0u(context, workerParameters);
    }
}
