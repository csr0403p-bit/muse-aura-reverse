package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SharedGoalScreenKt$SharedGoalTaskMenu$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<String> $name$delegate;
    public final /* synthetic */ G0U<String, Unit> $onRename;
    public final /* synthetic */ MutableState<Boolean> $renaming$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SharedGoalScreenKt$SharedGoalTaskMenu$3$1(G0U<? super String, Unit> g0u, MutableState<Boolean> mutableState, MutableState<String> mutableState2) {
        super(0);
        this.$onRename = g0u;
        this.$renaming$delegate = mutableState;
        this.$name$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(false, this.$renaming$delegate);
        this.$onRename.invoke(this.$name$delegate.getValue());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
