package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.BWH;
import X.C7384Etj;
import X.FGI;
import X.G0U;
import com.facebook.aura.gateway.HatchVmWakeQplAttemptObserverFactory;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class HatchVmWakeQplAttemptObserverFactory$HatchVmWakeQplAttemptObserver$logRequestPoint$1 extends AbstractC7559F3s implements G0U<QuickPerformanceLogger, Unit> {
    public final /* synthetic */ BWH $alignmentPoint;
    public final /* synthetic */ String $pointName;
    public final /* synthetic */ long $timestampNs;
    public final /* synthetic */ HatchVmWakeQplAttemptObserverFactory.HatchVmWakeQplAttemptObserver this$0;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(QuickPerformanceLogger quickPerformanceLogger) {
        C7384Etj.A0Y(quickPerformanceLogger, 0);
        int i = HatchVmWakeQplAttemptObserverKt.MARKER_ID;
        int i2 = this.this$0.instanceKey;
        String str = this.$pointName;
        long j = this.$timestampNs;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        quickPerformanceLogger.markerPoint(i, i2, str, j, timeUnit);
        BWH bwh = this.$alignmentPoint;
        int i3 = this.this$0.instanceKey;
        long j2 = this.$timestampNs;
        C7384Etj.A0Y(bwh, 2);
        quickPerformanceLogger.markerPoint(i, i3, FGI.A0M(bwh.alignmentPointNamePrefix, "default_id"), j2, timeUnit);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmWakeQplAttemptObserverFactory$HatchVmWakeQplAttemptObserver$logRequestPoint$1(HatchVmWakeQplAttemptObserverFactory.HatchVmWakeQplAttemptObserver hatchVmWakeQplAttemptObserver, String str, long j, BWH bwh) {
        super(1);
        this.this$0 = hatchVmWakeQplAttemptObserver;
        this.$pointName = str;
        this.$timestampNs = j;
        this.$alignmentPoint = bwh;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(QuickPerformanceLogger quickPerformanceLogger) {
        invoke2(quickPerformanceLogger);
        return Unit.INSTANCE;
    }
}
