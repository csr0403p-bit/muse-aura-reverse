package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class DecideApprovalsRequestJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends ApprovalDecisionJson>>> {
    public static final DecideApprovalsRequestJson$Companion$$childSerializers$1 INSTANCE = new DecideApprovalsRequestJson$Companion$$childSerializers$1();

    public DecideApprovalsRequestJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends ApprovalDecisionJson>> invoke() {
        return C3cG.A19(ApprovalDecisionJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends ApprovalDecisionJson>> invoke() {
        return C3cG.A19(ApprovalDecisionJson$$serializer.INSTANCE);
    }
}
