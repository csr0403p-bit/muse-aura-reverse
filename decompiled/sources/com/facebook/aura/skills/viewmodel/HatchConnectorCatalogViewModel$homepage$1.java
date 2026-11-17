package com.facebook.aura.skills.viewmodel;

import X.F2X;
import X.G2k;
import X.HtJ;
import com.facebook.aura.agentpermission.LocalDeviceConnector;
import com.facebook.aura.skills.model.ConnectorCatalogHomepage;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchConnectorCatalogViewModel$homepage$1 extends F2X implements G2k {
    public HatchConnectorCatalogViewModel$homepage$1(Object obj) {
        super(5, obj, HatchConnectorCatalogViewModel.class, "present", "present(Lcom/facebook/aura/skills/model/ConnectorCatalogHomepage;Lcom/facebook/aura/skills/viewmodel/ConnectorLoadStatus;Ljava/util/List;Ljava/util/Set;)Lcom/facebook/aura/skills/viewmodel/ConnectorCatalogHomepageUiState;", 4);
    }

    @Override // X.G2k
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return ((HatchConnectorCatalogViewModel) this.receiver).present((ConnectorCatalogHomepage) obj, (ConnectorLoadStatus) obj2, (List) obj3, (Set) obj4);
    }

    public final Object invoke(ConnectorCatalogHomepage connectorCatalogHomepage, ConnectorLoadStatus connectorLoadStatus, List<LocalDeviceConnector> list, Set<String> set, HtJ<? super ConnectorCatalogHomepageUiState> htJ) {
        return ((HatchConnectorCatalogViewModel) this.receiver).present(connectorCatalogHomepage, connectorLoadStatus, list, set);
    }
}
