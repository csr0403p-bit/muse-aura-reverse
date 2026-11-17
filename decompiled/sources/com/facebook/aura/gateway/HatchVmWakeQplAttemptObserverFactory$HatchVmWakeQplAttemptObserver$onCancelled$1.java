package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C3cF;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.gateway.HatchVmWakeQplAttemptObserverFactory;
import com.facebook.quicklog.QuickPerformanceLogger;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class HatchVmWakeQplAttemptObserverFactory$HatchVmWakeQplAttemptObserver$onCancelled$1 extends AbstractC7559F3s implements G0U<QuickPerformanceLogger, Unit> {
    public final /* synthetic */ HatchVmWakeQplAttemptObserverFactory.HatchVmWakeQplAttemptObserver this$0;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(QuickPerformanceLogger quickPerformanceLogger) {
        C7384Etj.A0Y(quickPerformanceLogger, 0);
        quickPerformanceLogger.markerAnnotate(HatchVmWakeQplAttemptObserverKt.MARKER_ID, this.this$0.instanceKey, "cancel_reason", C3cF.A00(34));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmWakeQplAttemptObserverFactory$HatchVmWakeQplAttemptObserver$onCancelled$1(HatchVmWakeQplAttemptObserverFactory.HatchVmWakeQplAttemptObserver hatchVmWakeQplAttemptObserver) {
        super(1);
        this.this$0 = hatchVmWakeQplAttemptObserver;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(QuickPerformanceLogger quickPerformanceLogger) {
        invoke2(quickPerformanceLogger);
        return Unit.INSTANCE;
    }
}
