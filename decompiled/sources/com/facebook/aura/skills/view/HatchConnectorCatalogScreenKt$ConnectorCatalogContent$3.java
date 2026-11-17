package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C1BO;
import X.C78N;
import X.G0U;
import X.G0V;
import X.InterfaceC7353EnQ;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogTab;
import com.facebook.aura.skills.viewmodel.HatchConnectorCatalogViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConnectorCatalogScreenKt$ConnectorCatalogContent$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ C1BO<ConnectorCatalogTab> $selectedTab$delegate;
    public final /* synthetic */ HatchConnectorCatalogViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConnectorCatalogScreenKt$ConnectorCatalogContent$3(HatchConnectorCatalogViewModel hatchConnectorCatalogViewModel, C1BO<? extends ConnectorCatalogTab> c1bo) {
        super(2);
        this.$viewModel = hatchConnectorCatalogViewModel;
        this.$selectedTab$delegate = c1bo;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            ConnectorCatalogTab value = this.$selectedTab$delegate.getValue();
            HatchConnectorCatalogViewModel hatchConnectorCatalogViewModel = this.$viewModel;
            boolean zA67 = bfm.A67(hatchConnectorCatalogViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchConnectorCatalogScreenKt$ConnectorCatalogContent$3$1$1(hatchConnectorCatalogViewModel);
                bfm.Ai0(objAaT);
            }
            HatchConnectorCatalogScreenKt.ConnectorCatalogHeader(value, (G0U) ((InterfaceC7353EnQ) objAaT), null, bfm, 0, 4);
            return;
        }
        bfm.Afo();
    }
}
