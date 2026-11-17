package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalDetailScreenKt$GoalCronOverflowMenu$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onDelete;
    public final /* synthetic */ MutableState<Boolean> $showDeleteConfirmation$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalDetailScreenKt$GoalCronOverflowMenu$2$1(Function0<Unit> function0, MutableState<Boolean> mutableState) {
        super(0);
        this.$onDelete = function0;
        this.$showDeleteConfirmation$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(false, this.$showDeleteConfirmation$delegate);
        this.$onDelete.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
