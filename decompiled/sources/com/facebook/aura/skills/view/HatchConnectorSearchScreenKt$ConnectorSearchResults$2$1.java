package com.facebook.aura.skills.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C06G;
import X.C0CD;
import X.C10G;
import X.C1822Arm;
import X.C1BO;
import X.C1YL;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.skills.viewmodel.ConnectorSearchUiState;
import com.facebook.aura.skills.viewmodel.HatchConnectorSearchViewModel;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorSearchScreenKt$ConnectorSearchResults$2$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ ConnectorCatalogActions $actions;
    public final /* synthetic */ C1BO<ConnectorSearchUiState> $state$delegate;
    public final /* synthetic */ HatchConnectorSearchViewModel $viewModel;

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorSearchScreenKt$ConnectorSearchResults$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<ConnectorSearchUiState> $state$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C1BO<ConnectorSearchUiState> c1bo) {
            super(3);
            this.$state$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            float f;
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b6d);
                BS0 bs0 = BRg.A00;
                if (this.$state$delegate.getValue().showDeviceSpacing) {
                    f = AuraDimensKt.SpacingMedium;
                } else {
                    f = 0.0f;
                }
                HatchConnectorCatalogComponentsKt.ConnectorCatalogSectionHeader(strA01, C3U4.A04(bs0, f), null, bfm, 0, 4);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorSearchScreenKt$ConnectorSearchResults$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ HatchConnectorSearchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchConnectorSearchViewModel hatchConnectorSearchViewModel) {
            super(3);
            this.$viewModel = hatchConnectorSearchViewModel;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                HatchConnectorSearchViewModel hatchConnectorSearchViewModel = this.$viewModel;
                boolean zA67 = bfm.A67(hatchConnectorSearchViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchConnectorSearchScreenKt$ConnectorSearchResults$2$1$2$1$1(hatchConnectorSearchViewModel);
                    bfm.Ai0(objAaT);
                }
                HatchConnectorCatalogComponentsKt.ConnectorCatalogError((Function0) ((InterfaceC7353EnQ) objAaT), null, bfm, 0, 2);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorSearchScreenKt$ConnectorSearchResults$2$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<ConnectorSearchUiState> $state$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C1BO<ConnectorSearchUiState> c1bo) {
            super(3);
            this.$state$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, anonymousClass037), bfm, i)) {
                String strA0t = AnonymousClass001.A0t(bfm, this.$state$delegate.getValue().query, R.string._name_removed__res_0x7f120ad3);
                C1822Arm c1822ArmA0T = C06G.A0T(bfm);
                long jA08 = C06G.A08(bfm);
                BRg bRgA09 = C3U4.A09(C10G.A02, 24.0f);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchConnectorSearchScreenKt$ConnectorSearchResults$2$1$3$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA0t, AnonymousClass001.A0Y(bRgA09, objAaT, false), jA08, c1822ArmA0T, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        c0cd.APJ("search-top-spacing", "spacer", ComposableSingletons$HatchConnectorSearchScreenKt.f289lambda$2063444569);
        HatchConnectorCatalogComponentsKt.connectorCatalogRows(c0cd, AuraDeeplinkRouteMapper.SEARCH_ROUTE, this.$state$delegate.getValue().rows, this.$actions);
        if (this.$state$delegate.getValue().showDeviceSection) {
            c0cd.APJ("search-device-header", "header", B1V.A01(new AnonymousClass1(this.$state$delegate), -574099540, true));
            HatchConnectorCatalogComponentsKt.localConnectorCatalogRows(c0cd, this.$state$delegate.getValue().deviceRows, this.$actions);
        }
        if (this.$state$delegate.getValue().showLoading) {
            c0cd.APJ("search-loading", AuraDeeplinkRouteMapper.STATUS_ROUTE, ComposableSingletons$HatchConnectorSearchScreenKt.f291lambda$2138697195);
        }
        if (this.$state$delegate.getValue().showError) {
            c0cd.APJ("search-error", AuraDeeplinkRouteMapper.STATUS_ROUTE, B1V.A01(new AnonymousClass2(this.$viewModel), -1693159884, true));
        }
        if (this.$state$delegate.getValue().showEmpty) {
            c0cd.APJ("search-empty", AuraDeeplinkRouteMapper.STATUS_ROUTE, B1V.A01(new AnonymousClass3(this.$state$delegate), -1247622573, true));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorSearchScreenKt$ConnectorSearchResults$2$1(ConnectorCatalogActions connectorCatalogActions, C1BO<ConnectorSearchUiState> c1bo, HatchConnectorSearchViewModel hatchConnectorSearchViewModel) {
        super(1);
        this.$actions = connectorCatalogActions;
        this.$state$delegate = c1bo;
        this.$viewModel = hatchConnectorSearchViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
