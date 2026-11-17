package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import com.facebook.aura.skills.repo.TaskPermissionMethod;
import com.facebook.aura.skills.viewmodel.TaskPermissionsViewModel;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchTaskConnectorPermissionsScreenKt$HatchTaskConnectorPermissionsScreen$1$1$1$1$1$1$1 extends AbstractC7559F3s implements G0U<ConnectorPermissionMode, Unit> {
    public final /* synthetic */ String $connectorId;
    public final /* synthetic */ TaskPermissionMethod $method;
    public final /* synthetic */ String $taskName;
    public final /* synthetic */ TaskPermissionsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTaskConnectorPermissionsScreenKt$HatchTaskConnectorPermissionsScreen$1$1$1$1$1$1$1(String str, TaskPermissionMethod taskPermissionMethod, TaskPermissionsViewModel taskPermissionsViewModel, String str2) {
        super(1);
        this.$connectorId = str;
        this.$method = taskPermissionMethod;
        this.$viewModel = taskPermissionsViewModel;
        this.$taskName = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConnectorPermissionMode connectorPermissionMode) {
        HatchTaskConnectorPermissionsScreenKt.logTaskMethodModeClick(this.$connectorId, this.$method.key, connectorPermissionMode);
        this.$viewModel.setMethodMode(this.$connectorId, this.$method.key, connectorPermissionMode, this.$taskName);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ConnectorPermissionMode connectorPermissionMode) {
        invoke2(connectorPermissionMode);
        return Unit.INSTANCE;
    }
}
