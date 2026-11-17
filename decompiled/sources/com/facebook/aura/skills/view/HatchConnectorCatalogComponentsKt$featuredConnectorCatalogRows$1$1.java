package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass037;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C11U;
import X.C1DM;
import X.C1b8;
import X.G0W;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConnectorCatalogComponentsKt$featuredConnectorCatalogRows$1$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public final /* synthetic */ ConnectorCatalogActions $actions;
    public final /* synthetic */ int $index;
    public final /* synthetic */ ConnectorCatalogRowUiState $row;
    public final /* synthetic */ List<ConnectorCatalogRowUiState> $rows;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorCatalogComponentsKt$featuredConnectorCatalogRows$1$1(int i, List<ConnectorCatalogRowUiState> list, ConnectorCatalogRowUiState connectorCatalogRowUiState, ConnectorCatalogActions connectorCatalogActions) {
        super(3);
        this.$index = i;
        this.$rows = list;
        this.$row = connectorCatalogRowUiState;
        this.$actions = connectorCatalogActions;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            C1DM c1dmHatchSectionRowShape = HatchSectionKt.hatchSectionRowShape(this.$index, this.$rows.size(), bfm, 0);
            HatchConnectorCatalogComponentsKt.FeaturedConnectorCatalogRow(this.$row, this.$actions, C11U.A03(C1b8.A03(BRg.A00, c1dmHatchSectionRowShape, C06G.A0J(bfm, AuraColorsKt.LocalAuraColors)), c1dmHatchSectionRowShape), bfm, ConnectorCatalogActions.$stable << 3, 0);
        } else {
            bfm.Afo();
        }
    }
}
