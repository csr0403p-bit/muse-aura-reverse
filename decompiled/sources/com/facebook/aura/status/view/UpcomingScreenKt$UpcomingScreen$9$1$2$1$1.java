package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.res.Resources;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.status.viewmodel.HatchTaskUiModel;
import com.facebook.aura.status.viewmodel.TasksViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class UpcomingScreenKt$UpcomingScreen$9$1$2$1$1 extends AbstractC7559F3s implements G0U<HatchTaskUiModel, Unit> {
    public final /* synthetic */ MutableState<HatchTaskUiModel> $selectedTask$delegate;
    public final /* synthetic */ TasksViewModel $tasksViewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchTaskUiModel hatchTaskUiModel) throws Resources.NotFoundException {
        C7384Etj.A0Y(hatchTaskUiModel, 0);
        this.$selectedTask$delegate.Af8(hatchTaskUiModel);
        this.$tasksViewModel.loadRuns(hatchTaskUiModel.id);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpcomingScreenKt$UpcomingScreen$9$1$2$1$1(TasksViewModel tasksViewModel, MutableState<HatchTaskUiModel> mutableState) {
        super(1);
        this.$tasksViewModel = tasksViewModel;
        this.$selectedTask$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchTaskUiModel hatchTaskUiModel) throws Resources.NotFoundException {
        invoke2(hatchTaskUiModel);
        return Unit.INSTANCE;
    }
}
