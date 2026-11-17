package com.facebook.aura.agentpermission.pastapprovals;

import X.AnonymousClass003;
import X.C7438Evz;
import X.G0V;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class ActivePermissionsScreenKt$ActivePermissionsScreen$2$5$1 extends C7438Evz implements G0V<ActivePermission, ConnectorPermissionMode, Unit> {
    public ActivePermissionsScreenKt$ActivePermissionsScreen$2$5$1(Object obj) {
        super(2, obj, ActivePermissionsViewModel.class, "setPermissionMode", "setPermissionMode(Lcom/facebook/aura/agentpermission/pastapprovals/ActivePermission;Lcom/facebook/aura/agentpermission/ConnectorPermissionMode;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActivePermission activePermission, ConnectorPermissionMode connectorPermissionMode) {
        AnonymousClass003.A0u(activePermission, connectorPermissionMode);
        ((ActivePermissionsViewModel) this.receiver).setPermissionMode(activePermission, connectorPermissionMode);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(ActivePermission activePermission, ConnectorPermissionMode connectorPermissionMode) {
        invoke2(activePermission, connectorPermissionMode);
        return Unit.INSTANCE;
    }
}
