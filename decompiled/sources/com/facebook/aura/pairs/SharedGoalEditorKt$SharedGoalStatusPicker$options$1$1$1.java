package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C1BO;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SharedGoalEditorKt$SharedGoalStatusPicker$options$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<G0U<SharedGoalStatus, Unit>> $currentOnSelect$delegate;
    public final /* synthetic */ SharedGoalStatus $status;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SharedGoalEditorKt$SharedGoalStatusPicker$options$1$1$1(SharedGoalStatus sharedGoalStatus, C1BO<? extends G0U<? super SharedGoalStatus, Unit>> c1bo) {
        super(0);
        this.$status = sharedGoalStatus;
        this.$currentOnSelect$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C1BO.A0B(this.$currentOnSelect$delegate).invoke(this.$status);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
