package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SharedGoalScreenKt$SharedGoalTaskMenu$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ Function0<Unit> $onOpen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedGoalScreenKt$SharedGoalTaskMenu$1$1$1(Function0<Unit> function0, MutableState<Boolean> mutableState) {
        super(0);
        this.$onOpen = function0;
        this.$expanded$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onOpen.invoke();
        MutableState.A09(true, this.$expanded$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
