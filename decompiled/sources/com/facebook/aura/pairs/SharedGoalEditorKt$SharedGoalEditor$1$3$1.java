package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class SharedGoalEditorKt$SharedGoalEditor$1$3$1 extends AbstractC7559F3s implements G0U<SharedGoalStatus, Unit> {
    public final /* synthetic */ MutableState<SharedGoalStatus> $status$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SharedGoalStatus sharedGoalStatus) {
        C7384Etj.A0Y(sharedGoalStatus, 0);
        this.$status$delegate.Af8(sharedGoalStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedGoalEditorKt$SharedGoalEditor$1$3$1(MutableState<SharedGoalStatus> mutableState) {
        super(1);
        this.$status$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(SharedGoalStatus sharedGoalStatus) {
        invoke2(sharedGoalStatus);
        return Unit.INSTANCE;
    }
}
