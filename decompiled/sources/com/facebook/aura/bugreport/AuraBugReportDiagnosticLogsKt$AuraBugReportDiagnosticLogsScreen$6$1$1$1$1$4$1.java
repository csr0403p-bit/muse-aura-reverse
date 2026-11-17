package com.facebook.aura.bugreport;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.bugreport.AuraBugReportCollector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$6$1$1$1$1$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraBugReportCollector.CollectedItem $file;
    public final /* synthetic */ G0U<AuraBugReportCollector.CollectedItem, Unit> $openReplacePicker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$6$1$1$1$1$4$1(G0U<? super AuraBugReportCollector.CollectedItem, Unit> g0u, AuraBugReportCollector.CollectedItem collectedItem) {
        super(0);
        this.$openReplacePicker = g0u;
        this.$file = collectedItem;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$openReplacePicker.invoke(this.$file);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
