package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SharedGoalScreenKt$SharedGoalTaskMenu$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onRenameCancel;
    public final /* synthetic */ MutableState<Boolean> $renaming$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedGoalScreenKt$SharedGoalTaskMenu$5$1(Function0<Unit> function0, MutableState<Boolean> mutableState) {
        super(0);
        this.$onRenameCancel = function0;
        this.$renaming$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(false, this.$renaming$delegate);
        this.$onRenameCancel.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
