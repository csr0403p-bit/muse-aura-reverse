package com.facebook.aura.agentpermission.pastapprovals;

import X.F2X;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ActivePermissionsScreenKt$ActivePermissionsScreen$2$2$1 extends F2X implements Function0<Unit> {
    public ActivePermissionsScreenKt$ActivePermissionsScreen$2$2$1(Object obj) {
        super(0, obj, ActivePermissionsViewModel.class, "loadPermissions", "loadPermissions(Z)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ActivePermissionsViewModel) this.receiver).loadPermissions(false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
