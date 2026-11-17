package com.facebook.aura.skills.viewmodel;

import X.AEu;
import X.AGI;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.AnonymousClass441;
import X.C06H;
import X.C1BN;
import X.C3Ek;
import X.C3rb;
import X.C60I;
import X.C7384Etj;
import com.facebook.aura.agentpermission.LocalDeviceConnector;
import com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class HatchDeviceConnectorsViewModel extends ConnectorScreenViewModel {
    public final LocalDeviceConnectorsRepository deviceRepository;
    public final C1BN<DeviceConnectorsUiState> uiState;

    public final class Factory extends AuraViewModelFactory<HatchDeviceConnectorsViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchDeviceConnectorsViewModel create() {
            AbstractC3358CGz abstractC3358CGz = this.userSession;
            return new HatchDeviceConnectorsViewModel(abstractC3358CGz, LocalDeviceConnectorsRepository.Companion.getInstance(abstractC3358CGz));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDeviceConnectorsViewModel(AbstractC3358CGz abstractC3358CGz, LocalDeviceConnectorsRepository localDeviceConnectorsRepository) {
        super(localDeviceConnectorsRepository, null);
        C7384Etj.A0Y(localDeviceConnectorsRepository, 1);
        this.deviceRepository = localDeviceConnectorsRepository;
        C60I c60iA03 = C3rb.A03(new HatchDeviceConnectorsViewModel$uiState$1(this), localDeviceConnectorsRepository.connectors, this.connectingIds);
        this.uiState = AnonymousClass441.A00(present(localDeviceConnectorsRepository.connectors.getValue(), this.connectingIds.getValue()), AEu.A00(this), c60iA03, C3Ek.A00);
    }

    public final C1BN<DeviceConnectorsUiState> getUiState() {
        return this.uiState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceConnectorsUiState present(List<LocalDeviceConnector> list, Set<String> set) {
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<LocalDeviceConnector> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(ConnectorCatalogRowUiStateKt.localConnectorCatalogRow(it.next(), set));
        }
        return new DeviceConnectorsUiState(AGI.A0C(arrayListA0i), list.isEmpty());
    }

    @Override // com.facebook.aura.skills.viewmodel.ConnectorScreenViewModel
    public void refreshQuery(ConnectorCatalogRefreshReason connectorCatalogRefreshReason) {
    }

    public /* synthetic */ HatchDeviceConnectorsViewModel(AbstractC3358CGz abstractC3358CGz, LocalDeviceConnectorsRepository localDeviceConnectorsRepository, int i, C06H c06h) {
        this(abstractC3358CGz, (i & 2) != 0 ? LocalDeviceConnectorsRepository.Companion.getInstance(abstractC3358CGz) : localDeviceConnectorsRepository);
    }
}
