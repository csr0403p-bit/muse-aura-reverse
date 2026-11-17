package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C3cJ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.status.viewmodel.HatchTaskUiModel;
import com.facebook.aura.status.viewmodel.TasksViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class UpcomingScreenKt$UpcomingScreen$10$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<HatchTaskUiModel> $selectedTask$delegate;
    public final /* synthetic */ HatchTaskUiModel $task;
    public final /* synthetic */ TasksViewModel $tasksViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpcomingScreenKt$UpcomingScreen$10$1$1(HatchTaskUiModel hatchTaskUiModel, TasksViewModel tasksViewModel, MutableState<HatchTaskUiModel> mutableState) {
        super(0);
        this.$task = hatchTaskUiModel;
        this.$tasksViewModel = tasksViewModel;
        this.$selectedTask$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.STATUS, HatchSubsurface.BOT_SHEET_CONTENT, HatchScreen.BOT_SHEET, HatchComponent.TASK_CARD, null, C3cJ.A0R(this.$task.category, HatchMetadataKey.SECTION.getValue()));
        this.$selectedTask$delegate.Af8(null);
        this.$tasksViewModel.clearSelectedTaskRuns();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
