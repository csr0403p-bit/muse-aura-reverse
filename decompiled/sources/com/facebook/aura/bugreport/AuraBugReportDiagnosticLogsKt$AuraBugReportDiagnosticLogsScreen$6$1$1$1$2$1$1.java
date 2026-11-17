package com.facebook.aura.bugreport;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$6$1$1$1$2$1$1 extends C7438Evz implements Function0<Unit> {
    public AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$6$1$1$1$2$1$1(Object obj) {
        super(0, obj, AuraBugReportReviewViewModel.class, "fetchVmLogs", "fetchVmLogs()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AuraBugReportReviewViewModel) this.receiver).fetchVmLogs();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
