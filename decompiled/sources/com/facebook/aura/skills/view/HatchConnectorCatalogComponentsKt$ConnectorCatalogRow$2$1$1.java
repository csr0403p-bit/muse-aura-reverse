package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorCatalogComponentsKt$ConnectorCatalogRow$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ConnectorCatalogActions $actions;
    public final /* synthetic */ ConnectorCatalogRowUiState $row;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorCatalogComponentsKt$ConnectorCatalogRow$2$1$1(ConnectorCatalogActions connectorCatalogActions, ConnectorCatalogRowUiState connectorCatalogRowUiState) {
        super(0);
        this.$actions = connectorCatalogActions;
        this.$row = connectorCatalogRowUiState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$actions.onRowClick.invoke(this.$row);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
