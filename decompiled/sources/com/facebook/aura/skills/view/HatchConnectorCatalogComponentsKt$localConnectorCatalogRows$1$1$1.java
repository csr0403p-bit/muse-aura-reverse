package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConnectorCatalogComponentsKt$localConnectorCatalogRows$1$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ ConnectorCatalogActions $actions;
    public final /* synthetic */ ConnectorCatalogRowUiState $row;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorCatalogComponentsKt$localConnectorCatalogRows$1$1$1(ConnectorCatalogRowUiState connectorCatalogRowUiState, ConnectorCatalogActions connectorCatalogActions) {
        super(2);
        this.$row = connectorCatalogRowUiState;
        this.$actions = connectorCatalogActions;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            HatchConnectorCatalogComponentsKt.ConnectorCatalogRow(this.$row, this.$actions, null, bfm, ConnectorCatalogActions.$stable << 3, 4);
        } else {
            bfm.Afo();
        }
    }
}
