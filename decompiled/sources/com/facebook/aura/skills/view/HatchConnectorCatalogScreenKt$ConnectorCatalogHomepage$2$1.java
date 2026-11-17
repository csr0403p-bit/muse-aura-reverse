package com.facebook.aura.skills.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.BRg;
import X.C0CD;
import X.C1BO;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC7353EnQ;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogHomepageUiState;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogSectionUiState;
import com.facebook.aura.skills.viewmodel.HatchConnectorCatalogViewModel;
import com.facebook.aura.ui.HatchLazySectionScope;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorCatalogScreenKt$ConnectorCatalogHomepage$2$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ ConnectorCatalogActions $actions;
    public final /* synthetic */ String $localTitle;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C1BO<ConnectorCatalogHomepageUiState> $state$delegate;
    public final /* synthetic */ HatchConnectorCatalogViewModel $viewModel;

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCatalogScreenKt$ConnectorCatalogHomepage$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ HatchConnectorCatalogViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchConnectorCatalogViewModel hatchConnectorCatalogViewModel) {
            super(3);
            this.$viewModel = hatchConnectorCatalogViewModel;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                HatchConnectorCatalogViewModel hatchConnectorCatalogViewModel = this.$viewModel;
                boolean zA67 = bfm.A67(hatchConnectorCatalogViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchConnectorCatalogScreenKt$ConnectorCatalogHomepage$2$1$1$1$1(hatchConnectorCatalogViewModel);
                    bfm.Ai0(objAaT);
                }
                HatchConnectorCatalogComponentsKt.ConnectorCatalogError((Function0) ((InterfaceC7353EnQ) objAaT), null, bfm, 0, 2);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCatalogScreenKt$ConnectorCatalogHomepage$2$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ String $localTitle;
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, AuraNavigator auraNavigator) {
            super(3);
            this.$localTitle = str;
            this.$navigator = auraNavigator;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                String str = this.$localTitle;
                BRg bRgA04 = C3U4.A04(BRg.A00, AuraDimensKt.SpacingMedium);
                boolean zA67 = bfm.A67(this.$navigator);
                AuraNavigator auraNavigator = this.$navigator;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchConnectorCatalogScreenKt$ConnectorCatalogHomepage$2$1$3$1$1(auraNavigator);
                    bfm.Ai0(objAaT);
                }
                HatchConnectorCatalogComponentsKt.ConnectorCatalogSectionHeader(str, bRgA04, (Function0) objAaT, bfm, 0, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCatalogScreenKt$ConnectorCatalogHomepage$2$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<HatchLazySectionScope, Unit> {
        public final /* synthetic */ C1BO<ConnectorCatalogHomepageUiState> $state$delegate;

        /* renamed from: com.facebook.aura.skills.view.HatchConnectorCatalogScreenKt$ConnectorCatalogHomepage$2$1$4$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ C1BO<ConnectorCatalogHomepageUiState> $state$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C1BO<ConnectorCatalogHomepageUiState> c1bo) {
                super(2);
                this.$state$delegate = c1bo;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                    HatchConnectorCatalogScreenKt.CustomConnectorsCatalogCard(this.$state$delegate.getValue().customCount, null, bfm, 0, 2);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchLazySectionScope hatchLazySectionScope) {
            C7384Etj.A0Y(hatchLazySectionScope, 0);
            hatchLazySectionScope.item("custom-connectors", "custom-connectors", AnonymousClass001.A0M(new AnonymousClass1(this.$state$delegate), 1765250178));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(C1BO<ConnectorCatalogHomepageUiState> c1bo) {
            super(1);
            this.$state$delegate = c1bo;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchLazySectionScope hatchLazySectionScope) {
            invoke2(hatchLazySectionScope);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        if (this.$state$delegate.getValue().showLoading) {
            c0cd.APJ(AuraButtonKt.LOADING_TAG, AuraDeeplinkRouteMapper.STATUS_ROUTE, ComposableSingletons$HatchConnectorCatalogScreenKt.lambda$2128038715);
        }
        if (this.$state$delegate.getValue().error) {
            c0cd.APJ("error", AuraDeeplinkRouteMapper.STATUS_ROUTE, B1V.A01(new AnonymousClass1(this.$viewModel), -1045349838, true));
        }
        if (this.$state$delegate.getValue().showFeatured) {
            HatchConnectorCatalogComponentsKt.featuredConnectorCatalogRows(c0cd, this.$state$delegate.getValue().featuredRows, this.$actions);
        }
        AHD<ConnectorCatalogSectionUiState> ahd = this.$state$delegate.getValue().sections;
        ConnectorCatalogActions connectorCatalogActions = this.$actions;
        AuraNavigator auraNavigator = this.$navigator;
        for (ConnectorCatalogSectionUiState connectorCatalogSectionUiState : ahd) {
            c0cd.APJ(FGI.A0M("category-header:", connectorCatalogSectionUiState.category.id), "header", B1V.A01(new HatchConnectorCatalogScreenKt$ConnectorCatalogHomepage$2$1$2$1(connectorCatalogSectionUiState, auraNavigator), 554315425, true));
            HatchConnectorCatalogComponentsKt.connectorCatalogRows(c0cd, connectorCatalogSectionUiState.category.id, connectorCatalogSectionUiState.rows, connectorCatalogActions);
        }
        if (this.$state$delegate.getValue().showLocalSection) {
            c0cd.APJ("device-header", "header", B1V.A01(new AnonymousClass3(this.$localTitle, this.$navigator), 410969396, true));
            HatchConnectorCatalogComponentsKt.localConnectorCatalogRows(c0cd, this.$state$delegate.getValue().localRows, this.$actions);
        }
        if (this.$state$delegate.getValue().showCustomSection) {
            c0cd.APJ("custom-header", "header", ComposableSingletons$HatchConnectorCatalogScreenKt.f283lambda$1008354635);
            HatchSectionKt.m2324HatchSectionlMAxDYE(c0cd, false, null, null, null, null, new AnonymousClass4(this.$state$delegate));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorCatalogScreenKt$ConnectorCatalogHomepage$2$1(ConnectorCatalogActions connectorCatalogActions, C1BO<ConnectorCatalogHomepageUiState> c1bo, HatchConnectorCatalogViewModel hatchConnectorCatalogViewModel, AuraNavigator auraNavigator, String str) {
        super(1);
        this.$actions = connectorCatalogActions;
        this.$state$delegate = c1bo;
        this.$viewModel = hatchConnectorCatalogViewModel;
        this.$navigator = auraNavigator;
        this.$localTitle = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
