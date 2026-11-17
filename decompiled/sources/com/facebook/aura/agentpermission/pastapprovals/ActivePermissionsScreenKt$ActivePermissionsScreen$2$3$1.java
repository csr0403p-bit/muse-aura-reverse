package com.facebook.aura.agentpermission.pastapprovals;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class ActivePermissionsScreenKt$ActivePermissionsScreen$2$3$1 extends C7438Evz implements G0U<ActivePermission, Unit> {
    public ActivePermissionsScreenKt$ActivePermissionsScreen$2$3$1(Object obj) {
        super(1, obj, ActivePermissionsViewModel.class, "revokePermission", "revokePermission(Lcom/facebook/aura/agentpermission/pastapprovals/ActivePermission;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActivePermission activePermission) {
        ((ActivePermissionsViewModel) AnonymousClass006.A0o(activePermission, this)).revokePermission(activePermission);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ActivePermission activePermission) {
        invoke2(activePermission);
        return Unit.INSTANCE;
    }
}
