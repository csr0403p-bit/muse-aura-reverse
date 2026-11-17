package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import com.facebook.aura.status.viewmodel.HatchTaskUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ActivityScheduledTasksKt$ActivityScheduledTasks$6$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $clearSelection;
    public final /* synthetic */ HatchTaskUiModel $task;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityScheduledTasksKt$ActivityScheduledTasks$6$2$1(HatchTaskUiModel hatchTaskUiModel, Function0<Unit> function0) {
        super(0);
        this.$task = hatchTaskUiModel;
        this.$clearSelection = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ActivityScheduledTasksKt.logScheduledTaskSheetDismiss(this.$task);
        this.$clearSelection.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
