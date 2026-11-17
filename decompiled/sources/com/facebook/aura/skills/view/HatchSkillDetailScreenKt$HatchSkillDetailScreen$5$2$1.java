package com.facebook.aura.skills.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.G2j;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.agentpermission.ConnectorPermission;
import com.facebook.aura.agentpermission.ConnectorPermissionGroup;
import com.facebook.aura.agentpermission.ConnectorPermissionMethod;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import com.facebook.aura.agentpermission.LocalDeviceConnector;
import com.facebook.aura.agentpermission.LocalDeviceConnectorKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchSkillDetailScreenKt$HatchSkillDetailScreen$5$2$1 extends AbstractC7559F3s implements G2j<ConnectorPermission, ConnectorPermissionGroup, ConnectorPermissionMethod, ConnectorPermissionMode, Unit> {
    public final /* synthetic */ LocalDeviceConnector $localConnector;
    public final /* synthetic */ MutableState<Integer> $localConnectorRefreshNonce$delegate;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConnectorPermission connectorPermission, ConnectorPermissionGroup connectorPermissionGroup, ConnectorPermissionMethod connectorPermissionMethod, ConnectorPermissionMode connectorPermissionMode) {
        AnonymousClass002.A1B(connectorPermissionMethod, 2, connectorPermissionMode);
        ConnectorSettingsAnalytics.INSTANCE.logDeviceModeClick(this.$localConnector.connectorId, connectorPermissionMethod.key, connectorPermissionMode);
        LocalDeviceConnectorKt.setLocalDeviceConnectorMode(this.$userSession, connectorPermissionMethod.key, connectorPermissionMode);
        MutableState.A07(MutableState.A02((MutableState) this.$localConnectorRefreshNonce$delegate) + 1, this.$localConnectorRefreshNonce$delegate);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSkillDetailScreenKt$HatchSkillDetailScreen$5$2$1(LocalDeviceConnector localDeviceConnector, AbstractC3358CGz abstractC3358CGz, MutableState<Integer> mutableState) {
        super(4);
        this.$localConnector = localDeviceConnector;
        this.$userSession = abstractC3358CGz;
        this.$localConnectorRefreshNonce$delegate = mutableState;
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(ConnectorPermission connectorPermission, ConnectorPermissionGroup connectorPermissionGroup, ConnectorPermissionMethod connectorPermissionMethod, ConnectorPermissionMode connectorPermissionMode) {
        invoke2(connectorPermission, connectorPermissionGroup, connectorPermissionMethod, connectorPermissionMode);
        return Unit.INSTANCE;
    }
}
