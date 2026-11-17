package com.facebook.aura.agentpermission.pastapprovals;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ActivePermissionsScreenKt$ActivePermissionsScreen$2$4$1 extends C7438Evz implements Function0<Unit> {
    public ActivePermissionsScreenKt$ActivePermissionsScreen$2$4$1(Object obj) {
        super(0, obj, ActivePermissionsViewModel.class, "resetPermissions", "resetPermissions()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ActivePermissionsViewModel) this.receiver).resetPermissions();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
