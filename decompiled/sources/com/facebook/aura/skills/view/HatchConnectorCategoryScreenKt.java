package com.facebook.aura.skills.view;

import X.AHD;
import X.AHI;
import X.AZ3;
import X.AbstractC07539Wl;
import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BQN;
import X.BRg;
import X.C06G;
import X.C0861A6i;
import X.C1BO;
import X.C1DG;
import X.C2CK;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC7353EnQ;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.header.view.HatchBackClickAnalytics;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.settings.support.HatchContactSupportViewModelKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.api.ClientConnector;
import com.facebook.aura.skills.model.ConnectorCatalogCategory;
import com.facebook.aura.skills.model.ConnectorCatalogKt;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogActionLabel;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogEffect;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogPageUiState;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogPageViewModel;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState;
import com.facebook.aura.skills.viewmodel.DeviceConnectorsUiState;
import com.facebook.aura.skills.viewmodel.HatchConnectorCategoryViewModel;
import com.facebook.aura.skills.viewmodel.HatchDeviceConnectorsViewModel;
import com.facebook.aura.vds.compose.loading.AutoLoadMoreKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchConnectorCategoryScreenKt {

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCategoryScreenKt$HatchConnectorCategoryScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $categoryId;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$categoryId = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConnectorCategoryScreenKt.HatchConnectorCategoryScreen(this.$categoryId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCategoryScreenKt$LocalConnectorCatalogScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectorCatalogActions $actions;
        public final /* synthetic */ C1BO<DeviceConnectorsUiState> $state$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConnectorCatalogActions connectorCatalogActions, C1BO<DeviceConnectorsUiState> c1bo) {
            super(4);
            this.$actions = connectorCatalogActions;
            this.$state$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m2151invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m2151invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            LazyListState lazyListStateA00 = AZ3.A00(0, 0, bfm, 0, 3);
            Function0<Unit> function0 = this.$actions.refreshLocal;
            G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchConnectorCategoryScreenKt.f286lambda$1993162676;
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$actions, bfm.A65(this.$state$delegate));
            ConnectorCatalogActions connectorCatalogActions = this.$actions;
            C1BO<DeviceConnectorsUiState> c1bo = this.$state$delegate;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new HatchConnectorCategoryScreenKt$LocalConnectorCatalogScreen$2$1$1(connectorCatalogActions, c1bo);
                bfm.Ai0(objAaT);
            }
            int i2 = iA04 << 3;
            HatchConnectorCatalogComponentsKt.m2144ConnectorCatalogListeWuZFaY(lazyListStateA00, f, f2, false, function0, null, g0v, (G0U) objAaT, bfm, (i2 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 1575936 | (i2 & 896), 32);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCategoryScreenKt$LocalConnectorCatalogScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConnectorCategoryScreenKt.LocalConnectorCatalogScreen(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCategoryScreenKt$RemoteConnectorCatalogScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C138472 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectorCatalogActions $actions;
        public final /* synthetic */ String $categoryId;
        public final /* synthetic */ HatchConnectorCategoryViewModel $viewModel;

        /* renamed from: com.facebook.aura.skills.view.HatchConnectorCategoryScreenKt$RemoteConnectorCatalogScreen$2$2, reason: invalid class name and collision with other inner class name */
        public final class C03732 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ String $categoryId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03732(String str) {
                super(2);
                this.$categoryId = str;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    HatchConnectorSearchEntryKt.ConnectorCatalogSearchEntry(null, this.$categoryId, false, bfm, 0, 5);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138472(HatchConnectorCategoryViewModel hatchConnectorCategoryViewModel, ConnectorCatalogActions connectorCatalogActions, String str) {
            super(4);
            this.$viewModel = hatchConnectorCategoryViewModel;
            this.$actions = connectorCatalogActions;
            this.$categoryId = str;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m2152invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m2152invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            ConnectorCatalogPageViewModel connectorCatalogPageViewModel = this.$viewModel.page;
            ConnectorCatalogActions connectorCatalogActions = this.$actions;
            LazyListState lazyListStateA00 = AZ3.A00(0, 0, bfm, 0, 3);
            HatchConnectorCategoryViewModel hatchConnectorCategoryViewModel = this.$viewModel;
            boolean zA67 = bfm.A67(hatchConnectorCategoryViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchConnectorCategoryScreenKt$RemoteConnectorCatalogScreen$2$1$1(hatchConnectorCategoryViewModel);
                bfm.Ai0(objAaT);
            }
            HatchConnectorCategoryScreenKt.m2150ConnectorCatalogPageContentikN4xI4(connectorCatalogPageViewModel, connectorCatalogActions, lazyListStateA00, f, f2, (Function0) ((InterfaceC7353EnQ) objAaT), null, B1V.A00(bfm, new C03732(this.$categoryId), 1574938023), null, bfm, AnonymousClass003.A07(iA04 << 9, (ConnectorCatalogActions.$stable << 3) | 12582912), HatchContactSupportViewModelKt.MAX_EMAIL_LENGTH);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCategoryScreenKt$RemoteConnectorCatalogScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C138483 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $categoryId;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138483(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$categoryId = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConnectorCategoryScreenKt.RemoteConnectorCatalogScreen(this.$categoryId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: ConnectorCatalogPageContent-ikN4xI4, reason: not valid java name */
    public static final void m2150ConnectorCatalogPageContentikN4xI4(ConnectorCatalogPageViewModel connectorCatalogPageViewModel, ConnectorCatalogActions connectorCatalogActions, LazyListState lazyListState, float f, float f2, Function0<Unit> function0, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, AHD<ClientConnector> ahd, BFM bfm, int i, int i2) {
        int i3;
        G0V<? super BFM, ? super Integer, Unit> g0v2 = g0v;
        BRg bRg2 = bRg;
        AHD<ClientConnector> ahd2 = ahd;
        boolean zA1Z = AnonymousClass005.A1Z(connectorCatalogPageViewModel, connectorCatalogActions, lazyListState);
        C7384Etj.A0Y(function0, 5);
        bfm.AgG(-134415039);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, connectorCatalogPageViewModel) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(connectorCatalogActions, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, lazyListState);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A07(bfm, f);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A08(bfm, f2);
        }
        if ((196608 & i) == 0) {
            iA0T |= AnonymousClass004.A0Y(bfm, function0);
        }
        int i4 = i2 & 64;
        int iA0j = 1572864;
        if (i4 != 0) {
            iA0T |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0T |= iA0j;
        }
        int i5 = i2 & 128;
        int iA0a = 12582912;
        if (i5 != 0) {
            iA0T |= iA0a;
        } else if ((i & 12582912) == 0) {
            iA0a = AnonymousClass004.A0a(bfm, g0v2);
            iA0T |= iA0a;
        }
        int i6 = i2 & 256;
        int iA03 = 100663296;
        if (i6 != 0) {
            iA0T |= iA03;
        } else if ((i & 100663296) == 0) {
            iA03 = AnonymousClass002.A03(AnonymousClass004.A1R(bfm, ahd2, i, 134217728) ? 1 : 0);
            iA0T |= iA03;
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 38347923, 38347922), bfm, iA0T)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (i5 != 0) {
                g0v2 = null;
            }
            if (i6 != 0) {
                ahd2 = AHI.A01;
            }
            C1BO c1boA02 = C2CK.A02(bfm, connectorCatalogPageViewModel.uiState);
            int i7 = 234881024 & iA0T;
            boolean zA65 = bfm.A65(((ConnectorCatalogPageUiState) c1boA02.getValue()).rows) | (i7 == 67108864 || ((iA0T & 134217728) != 0 && bfm.A65(ahd2)));
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = withClientRows(((ConnectorCatalogPageUiState) c1boA02.getValue()).rows, ahd2);
                bfm.Ai0(objAaT);
            }
            List list = (List) objAaT;
            if (((ConnectorCatalogPageUiState) c1boA02.getValue()).canLoadMore) {
                boolean zA1Z2 = AnonymousClass001.A1Z(connectorCatalogPageViewModel, bfm, -1448354679);
                Object objAaT2 = bfm.AaT();
                if (zA1Z2 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchConnectorCategoryScreenKt$ConnectorCatalogPageContent$1$1(connectorCatalogPageViewModel);
                    bfm.Ai0(objAaT2);
                }
                i3 = 32;
                AutoLoadMoreKt.AutoLoadMore(lazyListState, 0, (Function0<Unit>) objAaT2, bfm, (iA0T >> 6) & 14, zA1Z ? 1 : 0);
                AnonymousClass001.A1D(bfm);
            } else {
                i3 = 32;
                AnonymousClass003.A0l(bfm, -1448300863);
            }
            boolean z2 = ((ConnectorCatalogPageUiState) c1boA02.getValue()).isRefreshing;
            int i8 = iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1Q = (i8 == i3 || ((iA0T & 64) != 0 && bfm.A67(connectorCatalogActions))) | AnonymousClass002.A1Q(iA0T & 458752, 131072);
            Object objAaT3 = bfm.AaT();
            if (zA1Q || objAaT3 == C78N.A00) {
                objAaT3 = new HatchConnectorCategoryScreenKt$ConnectorCatalogPageContent$2$1(connectorCatalogActions, function0);
                bfm.Ai0(objAaT3);
            }
            Function0 function02 = (Function0) objAaT3;
            boolean zA1Y = AnonymousClass005.A1Y(bfm, list, connectorCatalogPageViewModel, i8 == i3 || ((iA0T & 64) != 0 && bfm.A67(connectorCatalogActions)), bfm.A65(c1boA02));
            if (i7 == 67108864 || ((iA0T & 134217728) != 0 && bfm.A67(ahd2))) {
                z = true;
            }
            boolean z3 = zA1Y | z;
            Object objAaT4 = bfm.AaT();
            if (z3 || objAaT4 == C78N.A00) {
                objAaT4 = new HatchConnectorCategoryScreenKt$ConnectorCatalogPageContent$3$1(connectorCatalogActions, list, ahd2, c1boA02, connectorCatalogPageViewModel);
                bfm.Ai0(objAaT4);
            }
            int i9 = iA0T >> 3;
            HatchConnectorCatalogComponentsKt.m2144ConnectorCatalogListeWuZFaY(lazyListState, f, f2, z2, function02, bRg2, g0v2, (G0U) objAaT4, bfm, AnonymousClass001.A05(i9, ((iA0T >> 6) & 1022) | (i9 & 458752)), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchConnectorCategoryScreenKt$ConnectorCatalogPageContent$4(connectorCatalogPageViewModel, connectorCatalogActions, lazyListState, f, f2, function0, bRg2, g0v2, ahd2, i, i2);
        }
    }

    public static final void LocalConnectorCatalogScreen(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-790470550);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            HatchDeviceConnectorsViewModel.Factory factory = new HatchDeviceConnectorsViewModel.Factory(AnonymousClass002.A0h(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            HatchDeviceConnectorsViewModel hatchDeviceConnectorsViewModel = (HatchDeviceConnectorsViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(HatchDeviceConnectorsViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, hatchDeviceConnectorsViewModel.uiState);
            ConnectorCatalogActions connectorCatalogActionsRememberConnectorCatalogActions = HatchConnectorCatalogActionsKt.rememberConnectorCatalogActions(hatchDeviceConnectorsViewModel, bfm, 0);
            HatchBackClickAnalytics hatchBackClickAnalytics = new HatchBackClickAnalytics(HatchSurface.SETTINGS, HatchScreen.CONNECTORS);
            AuraContainer.SecondaryScreen secondaryScreen = AuraContainer.SecondaryScreen.INSTANCE;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b6d);
            BRg bRgA00 = AbstractC07539Wl.A00(bRg2, "hatch-connector-category-device");
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchConnectorCategoryScreenKt$LocalConnectorCatalogScreen$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(secondaryScreen, bRgA00, null, 0L, strA01, null, (Function0) objAaT, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, hatchBackClickAnalytics, false, B1V.A00(bfm, new AnonymousClass2(connectorCatalogActionsRememberConnectorCatalogActions, c1boA02), 880119791), bfm, 6, 0, C06G.A02(), 402653100);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRg2, i, i2);
        }
    }

    public static final void RemoteConnectorCatalogScreen(String str, BRg bRg, BFM bfm, int i, int i2) {
        String strA01;
        BRg bRg2 = bRg;
        bfm.AgG(-470922954);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchConnectorCategoryViewModel.Factory factory = new HatchConnectorCategoryViewModel.Factory(AnonymousClass002.A0h(bfm), str);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            HatchConnectorCategoryViewModel hatchConnectorCategoryViewModel = (HatchConnectorCategoryViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), HatchConnectorCategoryViewModel.class, str);
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            ConnectorCatalogActions connectorCatalogActionsRememberConnectorCatalogActions = HatchConnectorCatalogActionsKt.rememberConnectorCatalogActions(hatchConnectorCategoryViewModel, bfm, 0);
            C1BO c1boA02 = C2CK.A02(bfm, hatchConnectorCategoryViewModel.page.uiState);
            HatchBackClickAnalytics hatchBackClickAnalytics = new HatchBackClickAnalytics(HatchSurface.SETTINGS, HatchScreen.CONNECTORS);
            AuraContainer.SecondaryScreen secondaryScreen = AuraContainer.SecondaryScreen.INSTANCE;
            ConnectorCatalogCategory connectorCatalogCategory = ((ConnectorCatalogPageUiState) c1boA02.getValue()).category;
            if (connectorCatalogCategory == null || (strA01 = connectorCatalogCategory.title) == null) {
                bfm.AgE(-1585371692);
                boolean zEquals = ConnectorCatalogKt.CUSTOM_CATEGORY_ID.equals(str);
                int i4 = R.string._name_removed__res_0x7f120ee4;
                if (zEquals) {
                    i4 = R.string._name_removed__res_0x7f120ad9;
                }
                strA01 = AbstractC2271BQs.A01(bfm, i4);
            } else {
                bfm.AgE(-1585373025);
            }
            AnonymousClass001.A1D(bfm);
            BRg bRgA00 = AbstractC07539Wl.A00(bRg2, FGI.A0M("hatch-connector-category-", str));
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchConnectorCategoryScreenKt$RemoteConnectorCatalogScreen$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(secondaryScreen, bRgA00, null, 0L, strA01, null, (Function0) objAaT, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, hatchBackClickAnalytics, false, B1V.A00(bfm, new C138472(hatchConnectorCategoryViewModel, connectorCatalogActionsRememberConnectorCatalogActions, str), -1670372421), bfm, 6, 0, C06G.A02(), 402653100);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138483(str, bRg2, i, i2);
        }
    }

    public static final ConnectorCatalogRowUiState toRow(ClientConnector clientConnector) {
        String str = clientConnector.connectorId;
        return new ConnectorCatalogRowUiState(str, clientConnector.title, "", null, Integer.valueOf(clientConnector.iconRes), "hatch-connected-skill-row", new ConnectorCatalogEffect.OpenDetails(str), true, false, ConnectorCatalogActionLabel.VIEW, null, false, true, false, false, false);
    }

    public static final void HatchConnectorCategoryScreen(String str, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(533857167);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            if (str == null) {
                bfm.AgE(-124910524);
                LocalConnectorCatalogScreen(bRg, bfm, (iA0d >> 3) & 14, 0);
            } else {
                bfm.AgE(-124857545);
                RemoteConnectorCatalogScreen(str, bRg, bfm, iA0d & 126, 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, bRg, i, i2);
        }
    }

    public static final /* synthetic */ ConnectorCatalogPageUiState access$ConnectorCatalogPageContent_ikN4xI4$lambda$0(C1BO c1bo) {
        return (ConnectorCatalogPageUiState) c1bo.getValue();
    }

    public static final /* synthetic */ DeviceConnectorsUiState access$LocalConnectorCatalogScreen$lambda$0(C1BO c1bo) {
        return (DeviceConnectorsUiState) c1bo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List<ConnectorCatalogRowUiState> withClientRows(List<ConnectorCatalogRowUiState> list, List<ClientConnector> list2) {
        if (list2.isEmpty()) {
            return list;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(list2));
        for (ClientConnector clientConnector : list2) {
            linkedHashMap.put(clientConnector.connectorId, toRow(clientConnector));
        }
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        Iterator<ConnectorCatalogRowUiState> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0m.add(it.next().connectorId);
        }
        Set setA0g = AbstractC0878AGe.A0g(arrayListA0m);
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list);
        for (ConnectorCatalogRowUiState connectorCatalogRowUiState : list) {
            Object obj = linkedHashMap.get(connectorCatalogRowUiState.connectorId);
            if (obj != 0) {
                connectorCatalogRowUiState = obj;
            }
            arrayListA0m2.add(connectorCatalogRowUiState);
        }
        Collection collectionValues = linkedHashMap.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collectionValues) {
            if (!setA0g.contains(((ConnectorCatalogRowUiState) obj2).connectorId)) {
                arrayList.add(obj2);
            }
        }
        return AbstractC0878AGe.A0P(arrayList, arrayListA0m2);
    }
}
