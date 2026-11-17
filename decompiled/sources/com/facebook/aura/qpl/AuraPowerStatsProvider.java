package com.facebook.aura.qpl;

import X.C06H;
import X.C3176C1f;
import X.C3177C1g;
import X.C7384Etj;
import X.CAH;
import X.CFK;
import X.COt;
import X.CPa;
import X.CPg;
import X.CPr;
import X.CQU;
import X.F0C;
import X.InterfaceC3173C1c;
import X.RunnableFutureC3435CNg;
import android.content.Context;
import com.facebook.aura.qpl.module.AuraQplModule$provideQuickPerformanceLoggerGKs$1$getMetadataGKs$1;
import com.facebook.quicklog.QuickEventImpl;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes5.dex */
public final class AuraPowerStatsProvider extends CAH<AuraPowerStatsSnapshot> {
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String TAG = "AuraPowerStatsProvider";
    public final Context context;
    public final C3176C1f delegate;

    public AuraPowerStatsProvider(Context context) {
        C7384Etj.A0Y(context, 0);
        this.context = context;
        this.delegate = new C3176C1f(context);
    }

    @Override // X.DHp
    public ListenableFuture<?> decorateEvent(final COt cOt, AuraPowerStatsSnapshot auraPowerStatsSnapshot, AuraPowerStatsSnapshot auraPowerStatsSnapshot2) {
        C7384Etj.A0Y(cOt, 0);
        AuraPowerStateMonitor.INSTANCE.ensureStartedAsync(this.context);
        if (auraPowerStatsSnapshot != null) {
            String str = auraPowerStatsSnapshot.dozeMode;
            if (str != null) {
                ((QuickEventImpl) cOt).A0R.A0C("doze_mode_at_start", str);
            }
            Long l = auraPowerStatsSnapshot.dozeExitMsAgo;
            if (l != null) {
                ((QuickEventImpl) cOt).A0R.A0B("doze_exit_ms_before_start", l.longValue());
            }
        }
        if (AuraPowerStateMonitor.startFailed) {
            ((QuickEventImpl) cOt).A0R.A0D("doze_monitor_failed", true);
        }
        ListenableFuture<?> listenableFutureA00 = C3176C1f.A00(cOt, auraPowerStatsSnapshot != null ? auraPowerStatsSnapshot.power : null, auraPowerStatsSnapshot2 != null ? auraPowerStatsSnapshot2.power : null);
        Runnable runnable = new Runnable() { // from class: com.facebook.aura.qpl.AuraPowerStatsProvider$decorateEvent$backgroundRestrictedDecorated$1
            @Override // java.lang.Runnable
            public final void run() {
                this.this$0.annotateBackgroundRestricted(cOt);
            }
        };
        Executor executorA05 = F0C.A05();
        boolean z = CQU.GENERATE_CANCELLATION_CAUSES;
        RunnableFutureC3435CNg runnableFutureC3435CNg = new RunnableFutureC3435CNg(Executors.callable(runnable, null));
        executorA05.execute(runnableFutureC3435CNg);
        ListenableFuture[] listenableFutureArr = {listenableFutureA00, runnableFutureC3435CNg};
        CPa cPa = CPg.A03;
        return new CPr(ImmutableList.copyOf(listenableFutureArr), false);
    }

    @Override // X.DHp
    public boolean isEnabled(InterfaceC3173C1c interfaceC3173C1c) {
        C7384Etj.A0Y(interfaceC3173C1c, 0);
        return ((AuraQplModule$provideQuickPerformanceLoggerGKs$1$getMetadataGKs$1) interfaceC3173C1c).isPowerStatsEnabled;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void annotateBackgroundRestricted(COt cOt) {
        String str;
        boolean zBooleanValue;
        try {
            Boolean backgroundRestricted = AuraPowerStateMonitor.INSTANCE.readBackgroundRestricted(this.context);
            if (backgroundRestricted != null) {
                str = "bg_restricted_at_end";
                zBooleanValue = backgroundRestricted.booleanValue();
            } else {
                str = "bg_restricted_read_failed";
                zBooleanValue = true;
            }
            ((QuickEventImpl) cOt).A0R.A0D(str, zBooleanValue);
        } catch (RuntimeException e) {
            CFK.A0A(TAG, "bg_restricted annotation failed", e);
        }
    }

    @Override // X.DHp
    public String getProviderName() {
        return "power_stats";
    }

    @Override // X.DHp
    public int getProviderTypeId() {
        return 19;
    }

    @Override // X.DHp
    public Class<AuraPowerStatsSnapshot> getSnapshotType() {
        return AuraPowerStatsSnapshot.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.CAH
    public AuraPowerStatsSnapshot snapshot() {
        C3177C1g c3177C1gSnapshot = this.delegate.snapshot();
        AuraPowerStateMonitor auraPowerStateMonitor = AuraPowerStateMonitor.INSTANCE;
        return new AuraPowerStatsSnapshot(c3177C1gSnapshot, auraPowerStateMonitor.getDozeMode(), auraPowerStateMonitor.getDozeExitMsAgo());
    }
}
