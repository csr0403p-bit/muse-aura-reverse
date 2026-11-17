package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.gateway.HatchVmWakeQplAttemptObserverFactory;
import com.facebook.aura.network.transport.HatchHttpTransportTimings;
import com.facebook.quicklog.QuickPerformanceLogger;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class HatchVmWakeQplAttemptObserverFactory$HatchVmWakeQplAttemptObserver$onTransportTimings$1 extends AbstractC7559F3s implements G0U<QuickPerformanceLogger, Unit> {
    public final /* synthetic */ HatchHttpTransportTimings $timings;
    public final /* synthetic */ HatchVmWakeQplAttemptObserverFactory.HatchVmWakeQplAttemptObserver this$0;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(QuickPerformanceLogger quickPerformanceLogger) {
        C7384Etj.A0Y(quickPerformanceLogger, 0);
        int i = HatchVmWakeQplAttemptObserverKt.MARKER_ID;
        quickPerformanceLogger.markerAnnotate(i, this.this$0.instanceKey, "transport_timing_source", this.$timings.source);
        quickPerformanceLogger.markerAnnotate(i, this.this$0.instanceKey, "transport_enqueue_to_start_ms", this.$timings.enqueueToStartMs);
        quickPerformanceLogger.markerAnnotate(i, this.this$0.instanceKey, "transport_start_to_headers_ms", this.$timings.startToHeadersMs);
        quickPerformanceLogger.markerAnnotate(i, this.this$0.instanceKey, "transport_headers_to_body_end_ms", this.$timings.headersToBodyEndMs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmWakeQplAttemptObserverFactory$HatchVmWakeQplAttemptObserver$onTransportTimings$1(HatchVmWakeQplAttemptObserverFactory.HatchVmWakeQplAttemptObserver hatchVmWakeQplAttemptObserver, HatchHttpTransportTimings hatchHttpTransportTimings) {
        super(1);
        this.this$0 = hatchVmWakeQplAttemptObserver;
        this.$timings = hatchHttpTransportTimings;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(QuickPerformanceLogger quickPerformanceLogger) {
        invoke2(quickPerformanceLogger);
        return Unit.INSTANCE;
    }
}
