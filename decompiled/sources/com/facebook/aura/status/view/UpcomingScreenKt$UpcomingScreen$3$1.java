package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import com.facebook.aura.status.viewmodel.TasksViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class UpcomingScreenKt$UpcomingScreen$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ TasksViewModel $tasksViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpcomingScreenKt$UpcomingScreen$3$1(TasksViewModel tasksViewModel) {
        super(0);
        this.$tasksViewModel = tasksViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$tasksViewModel.onResume();
    }
}
