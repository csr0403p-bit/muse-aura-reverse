package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.G2j;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SharedGoalEditorKt$SharedGoalEditor$1$5$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G2j<String, String, SharedGoalStatus, String, Unit> $onSave;
    public final /* synthetic */ MutableState<String> $reason$delegate;
    public final /* synthetic */ MutableState<SharedGoalStatus> $status$delegate;
    public final /* synthetic */ MutableState<String> $summary$delegate;
    public final /* synthetic */ MutableState<String> $title$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SharedGoalEditorKt$SharedGoalEditor$1$5$1$1(G2j<? super String, ? super String, ? super SharedGoalStatus, ? super String, Unit> g2j, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<SharedGoalStatus> mutableState3, MutableState<String> mutableState4) {
        super(0);
        this.$onSave = g2j;
        this.$title$delegate = mutableState;
        this.$summary$delegate = mutableState2;
        this.$status$delegate = mutableState3;
        this.$reason$delegate = mutableState4;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onSave.invoke(this.$title$delegate.getValue(), this.$summary$delegate.getValue(), this.$status$delegate.getValue(), this.$reason$delegate.getValue());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
