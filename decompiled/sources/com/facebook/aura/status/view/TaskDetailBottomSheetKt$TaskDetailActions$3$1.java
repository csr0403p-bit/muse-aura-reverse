package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.status.viewmodel.TaskCategory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class TaskDetailBottomSheetKt$TaskDetailActions$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ TaskCategory $category;
    public final /* synthetic */ MutableState<Boolean> $showDeleteConfirmation$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskDetailBottomSheetKt$TaskDetailActions$3$1(TaskCategory taskCategory, MutableState<Boolean> mutableState) {
        super(0);
        this.$category = taskCategory;
        this.$showDeleteConfirmation$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TaskDetailBottomSheetKt.logTaskDeleteCancelDismiss(this.$category);
        MutableState.A09(false, this.$showDeleteConfirmation$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
