package com.facebook.aura.skills.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass037;
import X.BFM;
import X.C0CD;
import X.C1BO;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import X.InterfaceC7353EnQ;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.skills.api.ClientConnector;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogPageUiState;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogPageViewModel;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorCategoryScreenKt$ConnectorCatalogPageContent$3$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ ConnectorCatalogActions $actions;
    public final /* synthetic */ AHD<ClientConnector> $clientConnectors;
    public final /* synthetic */ ConnectorCatalogPageViewModel $page;
    public final /* synthetic */ List<ConnectorCatalogRowUiState> $rows;
    public final /* synthetic */ C1BO<ConnectorCatalogPageUiState> $state$delegate;

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCategoryScreenKt$ConnectorCatalogPageContent$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectorCatalogPageViewModel $page;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConnectorCatalogPageViewModel connectorCatalogPageViewModel) {
            super(3);
            this.$page = connectorCatalogPageViewModel;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                ConnectorCatalogPageViewModel connectorCatalogPageViewModel = this.$page;
                boolean zA67 = bfm.A67(connectorCatalogPageViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchConnectorCategoryScreenKt$ConnectorCatalogPageContent$3$1$1$1$1(connectorCatalogPageViewModel);
                    bfm.Ai0(objAaT);
                }
                HatchConnectorCatalogComponentsKt.ConnectorCatalogError((Function0) ((InterfaceC7353EnQ) objAaT), null, bfm, 0, 2);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        if (this.$state$delegate.getValue().showFeatured) {
            HatchConnectorCatalogComponentsKt.featuredConnectorCatalogRows(c0cd, this.$state$delegate.getValue().featuredRows, this.$actions);
            if (this.$state$delegate.getValue().showFeaturedSpacing) {
                c0cd.APJ("featured-spacing", "spacer", ComposableSingletons$HatchConnectorCategoryScreenKt.f285lambda$1411725256);
            }
        }
        HatchConnectorCatalogComponentsKt.connectorCatalogRows(c0cd, "category", this.$rows, this.$actions);
        if (this.$state$delegate.getValue().showLoading) {
            c0cd.APJ(AuraButtonKt.LOADING_TAG, AuraDeeplinkRouteMapper.STATUS_ROUTE, ComposableSingletons$HatchConnectorCategoryScreenKt.f287lambda$327433252);
        }
        if (this.$state$delegate.getValue().showError) {
            c0cd.APJ("error", AuraDeeplinkRouteMapper.STATUS_ROUTE, AnonymousClass001.A0M(new AnonymousClass1(this.$page), -1781758533));
        }
        if (this.$state$delegate.getValue().showEmpty && this.$clientConnectors.isEmpty()) {
            c0cd.APJ("empty", AuraDeeplinkRouteMapper.STATUS_ROUTE, ComposableSingletons$HatchConnectorCategoryScreenKt.lambda$1058883482);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorCategoryScreenKt$ConnectorCatalogPageContent$3$1(ConnectorCatalogActions connectorCatalogActions, List<ConnectorCatalogRowUiState> list, AHD<ClientConnector> ahd, C1BO<ConnectorCatalogPageUiState> c1bo, ConnectorCatalogPageViewModel connectorCatalogPageViewModel) {
        super(1);
        this.$actions = connectorCatalogActions;
        this.$rows = list;
        this.$clientConnectors = ahd;
        this.$state$delegate = c1bo;
        this.$page = connectorCatalogPageViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
