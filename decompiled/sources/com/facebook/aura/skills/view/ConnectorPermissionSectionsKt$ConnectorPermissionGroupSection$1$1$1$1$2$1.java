package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.G2j;
import com.facebook.aura.agentpermission.ConnectorPermission;
import com.facebook.aura.agentpermission.ConnectorPermissionGroup;
import com.facebook.aura.agentpermission.ConnectorPermissionMethod;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ConnectorPermissionSectionsKt$ConnectorPermissionGroupSection$1$1$1$1$2$1 extends AbstractC7559F3s implements G0U<ConnectorPermissionMode, Unit> {
    public final /* synthetic */ ConnectorPermission $connector;
    public final /* synthetic */ ConnectorPermissionGroup $group;
    public final /* synthetic */ ConnectorPermissionMethod $method;
    public final /* synthetic */ G2j<ConnectorPermission, ConnectorPermissionGroup, ConnectorPermissionMethod, ConnectorPermissionMode, Unit> $onMethodModeSelected;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConnectorPermissionMode connectorPermissionMode) {
        C7384Etj.A0Y(connectorPermissionMode, 0);
        this.$onMethodModeSelected.invoke(this.$connector, this.$group, this.$method, connectorPermissionMode);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectorPermissionSectionsKt$ConnectorPermissionGroupSection$1$1$1$1$2$1(G2j<? super ConnectorPermission, ? super ConnectorPermissionGroup, ? super ConnectorPermissionMethod, ? super ConnectorPermissionMode, Unit> g2j, ConnectorPermission connectorPermission, ConnectorPermissionGroup connectorPermissionGroup, ConnectorPermissionMethod connectorPermissionMethod) {
        super(1);
        this.$onMethodModeSelected = g2j;
        this.$connector = connectorPermission;
        this.$group = connectorPermissionGroup;
        this.$method = connectorPermissionMethod;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ConnectorPermissionMode connectorPermissionMode) {
        invoke2(connectorPermissionMode);
        return Unit.INSTANCE;
    }
}
