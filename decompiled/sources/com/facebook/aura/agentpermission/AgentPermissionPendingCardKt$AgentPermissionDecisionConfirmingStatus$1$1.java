package com.facebook.aura.agentpermission;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class AgentPermissionPendingCardKt$AgentPermissionDecisionConfirmingStatus$1$1 extends C7438Evz implements Function0<Unit> {
    public AgentPermissionPendingCardKt$AgentPermissionDecisionConfirmingStatus$1$1(Object obj) {
        super(0, obj, AgentPermissionDecisionConfirmationViewModel.class, "checkAgain", "checkAgain()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AgentPermissionDecisionConfirmationViewModel) this.receiver).checkAgain();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
