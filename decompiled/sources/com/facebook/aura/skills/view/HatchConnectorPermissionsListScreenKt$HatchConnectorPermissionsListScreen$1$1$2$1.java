package com.facebook.aura.skills.view;

import X.AHD;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.agentpermission.LocalDeviceConnector;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.viewmodel.ConnectedConnectorsUiState;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConnectorPermissionsListScreenKt$HatchConnectorPermissionsListScreen$1$1$2$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ ConnectedConnectorsUiState $entries;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AHD<Skill> ahd = this.$entries.connectors;
        AuraNavigator auraNavigator = this.$navigator;
        AbstractC3358CGz abstractC3358CGz = this.$userSession;
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            AnonymousClass005.A0u(hatchSectionScope, new HatchConnectorPermissionsListScreenKt$HatchConnectorPermissionsListScreen$1$1$2$1$1$1((Skill) it.next(), auraNavigator, abstractC3358CGz), 907150193);
        }
        AHD<LocalDeviceConnector> ahd2 = this.$entries.localConnectors;
        AuraNavigator auraNavigator2 = this.$navigator;
        AbstractC3358CGz abstractC3358CGz2 = this.$userSession;
        Iterator it2 = ahd2.iterator();
        while (it2.hasNext()) {
            AnonymousClass005.A0u(hatchSectionScope, new HatchConnectorPermissionsListScreenKt$HatchConnectorPermissionsListScreen$1$1$2$1$2$1((LocalDeviceConnector) it2.next(), auraNavigator2, abstractC3358CGz2), -425662871);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorPermissionsListScreenKt$HatchConnectorPermissionsListScreen$1$1$2$1(ConnectedConnectorsUiState connectedConnectorsUiState, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz) {
        super(1);
        this.$entries = connectedConnectorsUiState;
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
