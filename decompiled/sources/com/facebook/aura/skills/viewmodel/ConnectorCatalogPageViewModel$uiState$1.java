package com.facebook.aura.skills.viewmodel;

import X.F2X;
import X.G2k;
import X.HtJ;
import com.facebook.aura.agentpermission.LocalDeviceConnector;
import com.facebook.aura.skills.model.ConnectorCatalogHomepage;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class ConnectorCatalogPageViewModel$uiState$1 extends F2X implements G2k {
    public ConnectorCatalogPageViewModel$uiState$1(Object obj) {
        super(5, obj, ConnectorCatalogPageViewModel.class, "present", "present(Lcom/facebook/aura/skills/viewmodel/ConnectorPagerState;Lcom/facebook/aura/skills/model/ConnectorCatalogHomepage;Ljava/util/List;Ljava/util/Set;)Lcom/facebook/aura/skills/viewmodel/ConnectorCatalogPageUiState;", 4);
    }

    @Override // X.G2k
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return ((ConnectorCatalogPageViewModel) this.receiver).present((ConnectorPagerState) obj, (ConnectorCatalogHomepage) obj2, (List) obj3, (Set) obj4);
    }

    public final Object invoke(ConnectorPagerState connectorPagerState, ConnectorCatalogHomepage connectorCatalogHomepage, List<LocalDeviceConnector> list, Set<String> set, HtJ<? super ConnectorCatalogPageUiState> htJ) {
        return ((ConnectorCatalogPageViewModel) this.receiver).present(connectorPagerState, connectorCatalogHomepage, list, set);
    }
}
