package com.facebook.aura.agentpermission.pastapprovals;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ActivePermissionsScreenKt$activePermissionSection$4$1$4$1 extends AbstractC7559F3s implements G0U<ConnectorPermissionMode, Unit> {
    public final /* synthetic */ G0V<ActivePermission, ConnectorPermissionMode, Unit> $onModeSelected;
    public final /* synthetic */ ActivePermission $permission;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConnectorPermissionMode connectorPermissionMode) {
        C7384Etj.A0Y(connectorPermissionMode, 0);
        this.$onModeSelected.invoke(this.$permission, connectorPermissionMode);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivePermissionsScreenKt$activePermissionSection$4$1$4$1(G0V<? super ActivePermission, ? super ConnectorPermissionMode, Unit> g0v, ActivePermission activePermission) {
        super(1);
        this.$onModeSelected = g0v;
        this.$permission = activePermission;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ConnectorPermissionMode connectorPermissionMode) {
        invoke2(connectorPermissionMode);
        return Unit.INSTANCE;
    }
}
