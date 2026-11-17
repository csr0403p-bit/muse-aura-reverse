package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.agentpermission.LocalDeviceConnector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSkillDetailScreenKt$HatchSkillDetailScreen$5$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ LocalDeviceConnector $localConnector;
    public final /* synthetic */ G0U<LocalDeviceConnector, Unit> $manageLocalConnector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSkillDetailScreenKt$HatchSkillDetailScreen$5$1$1(LocalDeviceConnector localDeviceConnector, G0U<? super LocalDeviceConnector, Unit> g0u) {
        super(0);
        this.$localConnector = localDeviceConnector;
        this.$manageLocalConnector = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ConnectorSettingsAnalytics connectorSettingsAnalytics = ConnectorSettingsAnalytics.INSTANCE;
        LocalDeviceConnector localDeviceConnector = this.$localConnector;
        connectorSettingsAnalytics.logDeviceManageClick(localDeviceConnector.connectorId, localDeviceConnector.isConnected);
        this.$manageLocalConnector.invoke(this.$localConnector);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
