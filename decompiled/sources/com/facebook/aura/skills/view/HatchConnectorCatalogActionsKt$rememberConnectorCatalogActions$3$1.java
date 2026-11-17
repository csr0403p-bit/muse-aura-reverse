package com.facebook.aura.skills.view;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState;
import com.facebook.aura.skills.viewmodel.ConnectorScreenViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchConnectorCatalogActionsKt$rememberConnectorCatalogActions$3$1 extends C7438Evz implements G0U<ConnectorCatalogRowUiState, Unit> {
    public HatchConnectorCatalogActionsKt$rememberConnectorCatalogActions$3$1(Object obj) {
        super(1, obj, ConnectorScreenViewModel.class, "onRowClick", "onRowClick(Lcom/facebook/aura/skills/viewmodel/ConnectorCatalogRowUiState;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConnectorCatalogRowUiState connectorCatalogRowUiState) {
        ((ConnectorScreenViewModel) AnonymousClass006.A0o(connectorCatalogRowUiState, this)).onRowClick(connectorCatalogRowUiState);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ConnectorCatalogRowUiState connectorCatalogRowUiState) {
        invoke2(connectorCatalogRowUiState);
        return Unit.INSTANCE;
    }
}
