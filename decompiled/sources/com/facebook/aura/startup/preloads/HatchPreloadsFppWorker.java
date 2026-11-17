package com.facebook.aura.startup.preloads;

import X.AnonymousClass003;
import X.C77S;
import X.C77i;
import X.HtJ;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.facebook.aura.preloads.HatchPreloadsFppEventReporter;
import com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker;

/* loaded from: classes5.dex */
public final class HatchPreloadsFppWorker extends AuraBackgroundCoroutineWorker {
    public final Context appContext;

    @Override // com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker
    public Object doBackgroundWork(HtJ<? super C77S> htJ) {
        HatchPreloadsFppEventReporter.INSTANCE.reportFppStatus(this.appContext);
        return new C77i();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPreloadsFppWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass003.A0u(context, workerParameters);
        this.appContext = context;
    }
}
