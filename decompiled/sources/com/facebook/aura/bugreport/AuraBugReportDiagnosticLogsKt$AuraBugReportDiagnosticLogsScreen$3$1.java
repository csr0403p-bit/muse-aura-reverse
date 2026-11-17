package com.facebook.aura.bugreport;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.bugreport.AuraBugReportCollector;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$3$1 extends C7438Evz implements G0U<AuraBugReportCollector.CollectedItem, Unit> {
    public AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$3$1(Object obj) {
        super(1, obj, AuraBugReportReviewViewModel.class, "saveItemToDownloads", "saveItemToDownloads(Lcom/facebook/aura/bugreport/AuraBugReportCollector$CollectedItem;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraBugReportCollector.CollectedItem collectedItem) {
        ((AuraBugReportReviewViewModel) AnonymousClass006.A0o(collectedItem, this)).saveItemToDownloads(collectedItem);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraBugReportCollector.CollectedItem collectedItem) {
        invoke2(collectedItem);
        return Unit.INSTANCE;
    }
}
