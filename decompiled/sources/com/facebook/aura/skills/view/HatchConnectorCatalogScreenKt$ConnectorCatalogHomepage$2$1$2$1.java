package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass037;
import X.BFM;
import X.BRg;
import X.C3U4;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogSectionUiState;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorCatalogScreenKt$ConnectorCatalogHomepage$2$1$2$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ ConnectorCatalogSectionUiState $section;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorCatalogScreenKt$ConnectorCatalogHomepage$2$1$2$1(ConnectorCatalogSectionUiState connectorCatalogSectionUiState, AuraNavigator auraNavigator) {
        super(3);
        this.$section = connectorCatalogSectionUiState;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            ConnectorCatalogSectionUiState connectorCatalogSectionUiState = this.$section;
            String str = connectorCatalogSectionUiState.category.title;
            BRg bRgA04 = C3U4.A04(BRg.A00, AuraDimensKt.SpacingMedium);
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$navigator, bfm.A67(connectorCatalogSectionUiState));
            ConnectorCatalogSectionUiState connectorCatalogSectionUiState2 = this.$section;
            AuraNavigator auraNavigator = this.$navigator;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new HatchConnectorCatalogScreenKt$ConnectorCatalogHomepage$2$1$2$1$1$1(connectorCatalogSectionUiState2, auraNavigator);
                bfm.Ai0(objAaT);
            }
            HatchConnectorCatalogComponentsKt.ConnectorCatalogSectionHeader(str, bRgA04, (Function0) objAaT, bfm, 0, 0);
            return;
        }
        bfm.Afo();
    }
}
