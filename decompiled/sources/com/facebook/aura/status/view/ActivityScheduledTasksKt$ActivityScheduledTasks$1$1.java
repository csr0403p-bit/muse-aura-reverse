package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C7384Etj;
import X.C78g;
import X.G0U;
import android.content.res.Resources;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.status.viewmodel.HatchPendingScheduledTask;
import com.facebook.aura.status.viewmodel.HatchTaskUiModel;
import com.facebook.aura.status.viewmodel.TasksViewModel;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ActivityScheduledTasksKt$ActivityScheduledTasks$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<HatchPendingScheduledTask.Event> $pendingTaskEvent$delegate;
    public final /* synthetic */ MutableState<HatchTaskUiModel> $selectedTask$delegate;
    public final /* synthetic */ C1BO<TasksViewModel.UiState> $tasksState$delegate;
    public final /* synthetic */ TasksViewModel $tasksViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityScheduledTasksKt$ActivityScheduledTasks$1$1(C1BO<HatchPendingScheduledTask.Event> c1bo, TasksViewModel tasksViewModel, C1BO<TasksViewModel.UiState> c1bo2, MutableState<HatchTaskUiModel> mutableState) {
        super(1);
        this.$pendingTaskEvent$delegate = c1bo;
        this.$tasksViewModel = tasksViewModel;
        this.$tasksState$delegate = c1bo2;
        this.$selectedTask$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) throws Resources.NotFoundException {
        Object next;
        HatchPendingScheduledTask.Event value = this.$pendingTaskEvent$delegate.getValue();
        if (value != null) {
            TasksViewModel tasksViewModel = this.$tasksViewModel;
            C1BO<TasksViewModel.UiState> c1bo = this.$tasksState$delegate;
            MutableState<HatchTaskUiModel> mutableState = this.$selectedTask$delegate;
            Iterator it = c1bo.getValue().tasks.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(((HatchTaskUiModel) next).id, value.taskId)) {
                    break;
                }
            }
            HatchTaskUiModel hatchTaskUiModel = (HatchTaskUiModel) next;
            if (hatchTaskUiModel != null) {
                mutableState.Af8(hatchTaskUiModel);
                tasksViewModel.loadRuns(hatchTaskUiModel.id);
                HatchPendingScheduledTask.INSTANCE.acknowledge(value);
            }
        }
        return new C78g() { // from class: com.facebook.aura.status.view.ActivityScheduledTasksKt$ActivityScheduledTasks$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
