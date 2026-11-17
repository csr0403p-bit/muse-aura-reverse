package com.facebook.aura.localbrowser;

import X.AIW;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C0924AIa;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.analytics.hatch.HatchAppEventLoggingContext;
import com.facebook.aura.localbrowser.LocalBrowserResourceUsage;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserResourceUsage$sessionsChanged$1$1$1", f = "LocalBrowserResourceUsage.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserResourceUsage$sessionsChanged$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchAppEventLoggingContext $context;
    public final /* synthetic */ int $count;
    public final /* synthetic */ LocalBrowserCloseReason $reason;
    public final /* synthetic */ LocalBrowserResourceUsage.Totals $totals;
    public int label;
    public final /* synthetic */ LocalBrowserResourceUsage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserResourceUsage$sessionsChanged$1$1$1(int i, LocalBrowserResourceUsage localBrowserResourceUsage, HatchAppEventLoggingContext hatchAppEventLoggingContext, LocalBrowserCloseReason localBrowserCloseReason, LocalBrowserResourceUsage.Totals totals, HtJ<? super LocalBrowserResourceUsage$sessionsChanged$1$1$1> htJ) {
        super(2, htJ);
        this.$count = i;
        this.this$0 = localBrowserResourceUsage;
        this.$context = hatchAppEventLoggingContext;
        this.$reason = localBrowserCloseReason;
        this.$totals = totals;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserResourceUsage$sessionsChanged$1$1$1(this.$count, this.this$0, this.$context, this.$reason, this.$totals, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int iMax;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        int i = this.$count;
        LocalBrowserResourceUsage localBrowserResourceUsage = this.this$0;
        LocalBrowserResourceUsage.Snapshot snapshot = localBrowserResourceUsage.start;
        if (i <= 0) {
            if (snapshot != null) {
                localBrowserResourceUsage.start = null;
                LocalBrowserResourceUsage.Snapshot snapshot2 = LocalBrowserResourceUsage.Snapshot.Companion.read();
                LocalBrowserTelemetry localBrowserTelemetry = LocalBrowserTelemetry.INSTANCE;
                LocalBrowserResourceUsage localBrowserResourceUsage2 = this.this$0;
                LocalBrowserCloseReason localBrowserCloseReason = this.$reason;
                LocalBrowserResourceUsage.Totals totals = this.$totals;
                C0924AIa c0924AIaA0u = C3cG.A0u();
                c0924AIaA0u.put("duration_ms", String.valueOf(snapshot2.elapsedMs - snapshot.elapsedMs));
                c0924AIaA0u.put("peak_sessions", String.valueOf(localBrowserResourceUsage2.peakSessions));
                if (localBrowserCloseReason != null) {
                    c0924AIaA0u.put("reason", AnonymousClass006.A0x(localBrowserCloseReason));
                }
                Long lDelta = localBrowserResourceUsage2.delta(snapshot.rxBytes, snapshot2.rxBytes);
                if (lDelta != null) {
                    long jLongValue = lDelta.longValue();
                    if (jLongValue >= 0) {
                        C3cH.A1A("app_uid_rx_bytes", c0924AIaA0u, jLongValue);
                    }
                }
                Long lDelta2 = localBrowserResourceUsage2.delta(snapshot.txBytes, snapshot2.txBytes);
                if (lDelta2 != null) {
                    long jLongValue2 = lDelta2.longValue();
                    if (jLongValue2 >= 0) {
                        C3cH.A1A("app_uid_tx_bytes", c0924AIaA0u, jLongValue2);
                    }
                }
                Long lDelta3 = localBrowserResourceUsage2.delta(snapshot2.chargeUah, snapshot.chargeUah);
                if (lDelta3 != null) {
                    C3cH.A1A("device_battery_net_drain_uah", c0924AIaA0u, lDelta3.longValue());
                }
                Long lDelta4 = localBrowserResourceUsage2.delta(snapshot2.batteryPercent, snapshot.batteryPercent);
                if (lDelta4 != null) {
                    C3cH.A1A("device_battery_net_drain_pct_points", c0924AIaA0u, lDelta4.longValue());
                }
                Long l = snapshot.batteryPercent;
                if (l != null) {
                    C3cH.A1A("device_battery_start_pct", c0924AIaA0u, l.longValue());
                }
                Long l2 = snapshot2.batteryPercent;
                if (l2 != null) {
                    C3cH.A1A("device_battery_end_pct", c0924AIaA0u, l2.longValue());
                }
                Boolean bool = snapshot.charging;
                if (bool != null) {
                    C3cI.A1K("device_charging_start", c0924AIaA0u, bool.booleanValue());
                }
                Boolean bool2 = snapshot2.charging;
                if (bool2 != null) {
                    C3cI.A1K("device_charging_end", c0924AIaA0u, bool2.booleanValue());
                }
                Boolean bool3 = snapshot.interactive;
                if (bool3 != null) {
                    C3cI.A1K("device_interactive_start", c0924AIaA0u, bool3.booleanValue());
                }
                Boolean bool4 = snapshot2.interactive;
                if (bool4 != null) {
                    C3cI.A1K("device_interactive_end", c0924AIaA0u, bool4.booleanValue());
                }
                if (totals != null) {
                    c0924AIaA0u.put("parked_ms", String.valueOf(totals.parkedMs));
                    c0924AIaA0u.put("cpu_hold_ms", String.valueOf(totals.cpuHoldMs));
                    c0924AIaA0u.put("background_work_ms", String.valueOf(totals.backgroundWorkMs));
                    c0924AIaA0u.put("host_lease_ms", String.valueOf(totals.hostLeaseMs));
                    c0924AIaA0u.put("unpark_count", String.valueOf(totals.unparkCount));
                    Long l3 = totals.unparkReadyMsMax;
                    if (l3 != null) {
                        C3cH.A1A("unpark_ready_ms_max", c0924AIaA0u, l3.longValue());
                    }
                }
                localBrowserTelemetry.event("local_browser_resource_usage", "outcome", AIW.A0K(c0924AIaA0u), this.this$0.loggingContext);
                localBrowserResourceUsage = this.this$0;
                localBrowserResourceUsage.loggingContext = null;
                iMax = 0;
            }
            return Unit.INSTANCE;
        }
        if (snapshot == null) {
            localBrowserResourceUsage.start = LocalBrowserResourceUsage.Snapshot.Companion.read();
            localBrowserResourceUsage = this.this$0;
            localBrowserResourceUsage.loggingContext = this.$context;
        }
        iMax = Math.max(localBrowserResourceUsage.peakSessions, this.$count);
        localBrowserResourceUsage.peakSessions = iMax;
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((LocalBrowserResourceUsage$sessionsChanged$1$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
