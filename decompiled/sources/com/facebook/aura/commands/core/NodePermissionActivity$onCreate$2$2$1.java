package com.facebook.aura.commands.core;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class NodePermissionActivity$onCreate$2$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ NodePermissionActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodePermissionActivity$onCreate$2$2$1(NodePermissionActivity nodePermissionActivity) {
        super(0);
        this.this$0 = nodePermissionActivity;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.deliverResult(false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
