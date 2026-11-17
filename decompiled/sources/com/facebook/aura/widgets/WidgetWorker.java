package com.facebook.aura.widgets;

import X.AnonymousClass003;
import X.C7384Etj;
import X.C77S;
import X.C77i;
import X.HtJ;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker;

/* loaded from: classes3.dex */
public abstract class WidgetWorker extends AuraBackgroundCoroutineWorker {
    public static final int $stable = 8;

    public abstract Object doWidgetWork(HtJ<? super C77S> htJ);

    @Override // com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker
    public final Object doBackgroundWork(HtJ<? super C77S> htJ) {
        WidgetsGate widgetsGate = WidgetsGate.INSTANCE;
        Context context = this.mAppContext;
        C7384Etj.A0U(context);
        if (widgetsGate.areWidgetsEnabled(context)) {
            return doWidgetWork(htJ);
        }
        onWidgetsDisabled();
        return new C77i();
    }

    public void onWidgetsDisabled() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass003.A0u(context, workerParameters);
    }
}
