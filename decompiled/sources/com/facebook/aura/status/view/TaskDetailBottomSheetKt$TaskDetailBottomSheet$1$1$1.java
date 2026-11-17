package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.TaskPermissionsScreenKey;
import com.facebook.aura.status.viewmodel.HatchTaskUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class TaskDetailBottomSheetKt$TaskDetailBottomSheet$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ HatchTaskUiModel $task;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskDetailBottomSheetKt$TaskDetailBottomSheet$1$1$1(HatchTaskUiModel hatchTaskUiModel, Function0<Unit> function0, AuraNavigator auraNavigator) {
        super(0);
        this.$task = hatchTaskUiModel;
        this.$onDismiss = function0;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TaskDetailBottomSheetKt.logTaskPermissionsClick(AnonymousClass006.A0x(this.$task.category));
        this.$onDismiss.invoke();
        AuraNavigator auraNavigator = this.$navigator;
        HatchTaskUiModel hatchTaskUiModel = this.$task;
        auraNavigator.navigate((AuraNavKey) new TaskPermissionsScreenKey(hatchTaskUiModel.id, hatchTaskUiModel.title), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
