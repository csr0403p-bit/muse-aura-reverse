package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C3cI;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.gateway.HatchVmWakeQplAttemptObserverFactory;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.settings.HatchDataExportRepositoryKt;
import com.facebook.quicklog.QuickPerformanceLogger;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class HatchVmWakeQplAttemptObserverFactory$HatchVmWakeQplAttemptObserver$onCompleted$1 extends AbstractC7559F3s implements G0U<QuickPerformanceLogger, Unit> {
    public final /* synthetic */ HatchHttpResponse $response;
    public final /* synthetic */ HatchVmWakeQplAttemptObserverFactory.HatchVmWakeQplAttemptObserver this$0;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(QuickPerformanceLogger quickPerformanceLogger) {
        C7384Etj.A0Y(quickPerformanceLogger, 0);
        int i = HatchVmWakeQplAttemptObserverKt.MARKER_ID;
        quickPerformanceLogger.markerAnnotate(i, this.this$0.instanceKey, "http_status_code", this.$response.statusCode);
        HatchHttpResponse hatchHttpResponse = this.$response;
        if (hatchHttpResponse.isSuccessful) {
            return;
        }
        quickPerformanceLogger.markerAnnotate(i, this.this$0.instanceKey, "failure_type", hatchHttpResponse.statusCode == -1 ? HatchDataExportRepositoryKt.FAILURE_TRANSPORT : AuraDeeplinkHandlerActivity.HTTP);
        Throwable th = this.$response.cause;
        if (th != null) {
            quickPerformanceLogger.markerAnnotate(i, this.this$0.instanceKey, "error_type", C3cI.A0Y(th));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmWakeQplAttemptObserverFactory$HatchVmWakeQplAttemptObserver$onCompleted$1(HatchVmWakeQplAttemptObserverFactory.HatchVmWakeQplAttemptObserver hatchVmWakeQplAttemptObserver, HatchHttpResponse hatchHttpResponse) {
        super(1);
        this.this$0 = hatchVmWakeQplAttemptObserver;
        this.$response = hatchHttpResponse;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(QuickPerformanceLogger quickPerformanceLogger) {
        invoke2(quickPerformanceLogger);
        return Unit.INSTANCE;
    }
}
