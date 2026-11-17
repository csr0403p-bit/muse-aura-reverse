package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C06787bB;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06807bD;
import com.facebook.aura.status.viewmodel.TasksViewModel;

/* loaded from: classes2.dex */
public final class ActivityScheduledTasksKt$ActivityScheduledTasks$2$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ TasksViewModel $tasksViewModel;

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 0);
        this.$tasksViewModel.onResume();
        return new InterfaceC06807bD() { // from class: com.facebook.aura.status.view.ActivityScheduledTasksKt$ActivityScheduledTasks$2$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityScheduledTasksKt$ActivityScheduledTasks$2$1(TasksViewModel tasksViewModel) {
        super(1);
        this.$tasksViewModel = tasksViewModel;
    }
}
