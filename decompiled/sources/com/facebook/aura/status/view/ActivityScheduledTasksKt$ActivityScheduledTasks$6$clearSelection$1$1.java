package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.status.viewmodel.HatchTaskUiModel;
import com.facebook.aura.status.viewmodel.TasksViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ActivityScheduledTasksKt$ActivityScheduledTasks$6$clearSelection$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<HatchTaskUiModel> $selectedTask$delegate;
    public final /* synthetic */ TasksViewModel $tasksViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityScheduledTasksKt$ActivityScheduledTasks$6$clearSelection$1$1(TasksViewModel tasksViewModel, MutableState<HatchTaskUiModel> mutableState) {
        super(0);
        this.$tasksViewModel = tasksViewModel;
        this.$selectedTask$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$selectedTask$delegate.Af8(null);
        this.$tasksViewModel.clearSelectedTaskRuns();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
