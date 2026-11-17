package com.facebook.aura.startup.mobileconfig;

import X.AnonymousClass003;
import X.C066677k;
import X.C77S;
import X.C77i;
import X.CFK;
import X.HtJ;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.facebook.aura.mobileconfig.AuraMobileConfig;
import com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker;

/* loaded from: classes3.dex */
public final class AuraMobileConfigPeriodicFetchWorker extends AuraBackgroundCoroutineWorker {
    @Override // com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker
    public Object doBackgroundWork(HtJ<? super C77S> htJ) {
        try {
            AuraMobileConfig auraMobileConfig = AuraMobileConfig.INSTANCE;
            auraMobileConfig.ensureInitialized();
            auraMobileConfig.getSessionlessMC().fetchConfigs();
            auraMobileConfig.safeFetchSessionedConfigs();
            return new C77i();
        } catch (Exception e) {
            CFK.A08(AuraMobileConfigPeriodicFetchWorkerKt.TAG, "Periodic MC fetch failed", e);
            return new C066677k();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraMobileConfigPeriodicFetchWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass003.A0u(context, workerParameters);
    }
}
