package com.facebook.aura.bugreport;

import X.AbstractC7559F3s;
import com.facebook.aura.bugreport.AuraBugReportCollector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$6$1$1$1$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraBugReportCollector.CollectedItem $file;
    public final /* synthetic */ AuraBugReportReviewViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$6$1$1$1$1$3$1(AuraBugReportReviewViewModel auraBugReportReviewViewModel, AuraBugReportCollector.CollectedItem collectedItem) {
        super(0);
        this.$viewModel = auraBugReportReviewViewModel;
        this.$file = collectedItem;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.deleteItem(this.$file);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
