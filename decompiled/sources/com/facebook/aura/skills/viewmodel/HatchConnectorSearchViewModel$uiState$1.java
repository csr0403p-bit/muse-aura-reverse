package com.facebook.aura.skills.viewmodel;

import X.F2X;
import X.G2l;
import X.HtJ;
import com.facebook.aura.agentpermission.LocalDeviceConnector;
import com.facebook.aura.skills.model.Skill;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchConnectorSearchViewModel$uiState$1 extends F2X implements G2l {
    public HatchConnectorSearchViewModel$uiState$1(Object obj) {
        super(6, obj, HatchConnectorSearchViewModel.class, "present", "present(Ljava/lang/String;Lcom/facebook/aura/skills/viewmodel/ConnectorPagerState;Ljava/util/List;Ljava/util/List;Ljava/util/Set;)Lcom/facebook/aura/skills/viewmodel/ConnectorSearchUiState;", 4);
    }

    @Override // X.G2l
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return ((HatchConnectorSearchViewModel) this.receiver).present((String) obj, (ConnectorPagerState) obj2, (List) obj3, (List) obj4, (Set) obj5);
    }

    public final Object invoke(String str, ConnectorPagerState connectorPagerState, List<Skill> list, List<LocalDeviceConnector> list2, Set<String> set, HtJ<? super ConnectorSearchUiState> htJ) {
        return ((HatchConnectorSearchViewModel) this.receiver).present(str, connectorPagerState, list, list2, set);
    }
}
