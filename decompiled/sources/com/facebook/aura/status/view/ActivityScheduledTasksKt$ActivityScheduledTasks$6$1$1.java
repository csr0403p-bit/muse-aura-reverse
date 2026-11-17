package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import com.facebook.aura.status.viewmodel.HatchTaskUiModel;
import com.facebook.aura.status.viewmodel.TasksViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ActivityScheduledTasksKt$ActivityScheduledTasks$6$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $clearSelection;
    public final /* synthetic */ HatchTaskUiModel $task;
    public final /* synthetic */ TasksViewModel $tasksViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityScheduledTasksKt$ActivityScheduledTasks$6$1$1(Function0<Unit> function0, TasksViewModel tasksViewModel, HatchTaskUiModel hatchTaskUiModel) {
        super(0);
        this.$clearSelection = function0;
        this.$tasksViewModel = tasksViewModel;
        this.$task = hatchTaskUiModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$clearSelection.invoke();
        this.$tasksViewModel.removeTask(this.$task.id);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
