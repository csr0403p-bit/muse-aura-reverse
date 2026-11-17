package com.facebook.aura.skills.view;

import X.AFs;
import X.AFz;
import X.AKQ;
import X.AVy;
import X.AbstractC07539Wl;
import X.AbstractC1754Apr;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AuJ;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BHJ;
import X.BOD;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C10G;
import X.C1515AkP;
import X.C1518AkS;
import X.C1822Arm;
import X.C1BO;
import X.C1C3;
import X.C1DG;
import X.C1DM;
import X.C1DP;
import X.C1YY;
import X.C2257BGr;
import X.C2CK;
import X.C5wL;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.header.view.HatchBackClickAnalytics;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.viewmodel.ConnectorSearchUiState;
import com.facebook.aura.skills.viewmodel.HatchConnectorSearchViewModel;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.loading.AutoLoadMoreKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchConnectorSearchScreenKt {

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorSearchScreenKt$ConnectorSearchField$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ C1518AkS $focusRequester;
        public final /* synthetic */ HatchConnectorSearchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchConnectorSearchViewModel hatchConnectorSearchViewModel, C1518AkS c1518AkS) {
            super(2);
            this.$viewModel = hatchConnectorSearchViewModel;
            this.$focusRequester = c1518AkS;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                AVy aVyA00 = BOf.A00(bfm, R.drawable.circle_x_wght400_outline_24, 0);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e80);
                AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.XM_LARGE;
                AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.PRIMARY;
                AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.NO_BACKGROUND;
                boolean zA67 = bfm.A67(this.$viewModel);
                HatchConnectorSearchViewModel hatchConnectorSearchViewModel = this.$viewModel;
                C1518AkS c1518AkS = this.$focusRequester;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchConnectorSearchScreenKt$ConnectorSearchField$3$1$1(hatchConnectorSearchViewModel, c1518AkS);
                    bfm.Ai0(objAaT);
                }
                AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(null, aVyA00, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, strA01, (Function0) objAaT, null, false, null, null, null, null, bfm, (AVy.$stable << 3) | 28032, 0, 16161);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorSearchScreenKt$ConnectorSearchField$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchConnectorSearchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(HatchConnectorSearchViewModel hatchConnectorSearchViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = hatchConnectorSearchViewModel;
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
            HatchConnectorSearchScreenKt.ConnectorSearchField(this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorSearchScreenKt$HatchConnectorSearchScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectorCatalogActions $actions;
        public final /* synthetic */ HatchConnectorSearchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchConnectorSearchViewModel hatchConnectorSearchViewModel, ConnectorCatalogActions connectorCatalogActions) {
            super(4);
            this.$viewModel = hatchConnectorSearchViewModel;
            this.$actions = connectorCatalogActions;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m2158invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m2158invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA0M = C06G.A0M(bfm, AbstractC1754Apr.A00(C10G.A01));
            HatchConnectorSearchViewModel hatchConnectorSearchViewModel = this.$viewModel;
            ConnectorCatalogActions connectorCatalogActions = this.$actions;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0M);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            C01N.A08(bfm, bs0, f);
            HatchConnectorSearchScreenKt.ConnectorSearchField(hatchConnectorSearchViewModel, null, bfm, 0, 2);
            HatchConnectorSearchScreenKt.m2156ConnectorSearchResults942rkJo(hatchConnectorSearchViewModel, connectorCatalogActions, f2, c90l.AiP(bs0, 1.0f, true), bfm, ((iA04 << 3) & 896) | (ConnectorCatalogActions.$stable << 3), 0);
            BBI.A0R(bbi, true);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorSearchScreenKt$HatchConnectorSearchScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C138543 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $categoryId;
        public final /* synthetic */ boolean $deviceOnly;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138543(String str, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$categoryId = str;
            this.$deviceOnly = z;
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
            HatchConnectorSearchScreenKt.HatchConnectorSearchScreen(this.$categoryId, this.$deviceOnly, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ConnectorSearchField(HatchConnectorSearchViewModel hatchConnectorSearchViewModel, BRg bRg, BFM bfm, int i, int i2) {
        B1U b1uA00;
        BRg bRg2 = bRg;
        bfm.AgG(1901478847);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchConnectorSearchViewModel) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA02 = C2CK.A02(bfm, hatchConnectorSearchViewModel.uiState);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            C1518AkS c1518AkS = (C1518AkS) AnonymousClass003.A0d(bfm, objAaT, obj);
            C1C3 c1c3 = (C1C3) bfm.A6v(Am0.A0E);
            Object[] objArr = new Object[0];
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = HatchConnectorSearchScreenKt$ConnectorSearchField$requestInitialFocus$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT2, objArr);
            boolean zA65 = bfm.A65(mutableStateA0N);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == obj) {
                objAaT3 = new HatchConnectorSearchScreenKt$ConnectorSearchField$1$1(c1518AkS, mutableStateA0N, null);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A18(bfm, objAaT3, c1518AkS);
            String str = ((ConnectorSearchUiState) c1boA02.getValue()).query;
            boolean zA67 = bfm.A67(hatchConnectorSearchViewModel);
            Object objAaT4 = bfm.AaT();
            if (zA67 || objAaT4 == obj) {
                objAaT4 = new HatchConnectorSearchScreenKt$ConnectorSearchField$2$1(hatchConnectorSearchViewModel);
                bfm.Ai0(objAaT4);
            }
            InterfaceC7353EnQ interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT4;
            BRg bRgA00 = AbstractC07539Wl.A00(BHJ.A00(bRg2, c1518AkS), "hatch-connector-search-input");
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            C1DM c1dm = AnonymousClass002.A0e(bfm).pill;
            if (((ConnectorSearchUiState) c1boA02.getValue()).query.length() > 0) {
                bfm.AgE(633780283);
                b1uA00 = B1V.A00(bfm, new AnonymousClass3(hatchConnectorSearchViewModel, c1518AkS), -2038405640);
                AnonymousClass001.A1D(bfm);
            } else {
                AnonymousClass003.A0l(bfm, 634440645);
                b1uA00 = null;
            }
            AuJ auJ = new AuJ(null, -1, 0, 3);
            boolean zA1N = AnonymousClass003.A1N(bfm, hatchConnectorSearchViewModel, c1c3);
            Object objAaT5 = bfm.AaT();
            if (zA1N || objAaT5 == obj) {
                objAaT5 = new HatchConnectorSearchScreenKt$ConnectorSearchField$4$1(hatchConnectorSearchViewModel, c1c3);
                bfm.Ai0(objAaT5);
            }
            AuraTextInputKt.AuraTextInput(str, null, bRgA00, ComposableSingletons$HatchConnectorSearchScreenKt.f292lambda$356070869, auJ, new C2257BGr(null, null, null, (G0U) objAaT5), null, c1822ArmA0T, true, 0, 0, ComposableSingletons$HatchConnectorSearchScreenKt.f290lambda$2075453962, b1uA00, null, null, false, false, false, true, c1dm, (G0U) interfaceC7353EnQ, bfm, 100690944, 100663344, 0, 255554);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(hatchConnectorSearchViewModel, bRg2, i, i2);
        }
    }

    /* renamed from: ConnectorSearchResults-942rkJo, reason: not valid java name */
    public static final void m2156ConnectorSearchResults942rkJo(HatchConnectorSearchViewModel hatchConnectorSearchViewModel, ConnectorCatalogActions connectorCatalogActions, float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1740262108);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchConnectorSearchViewModel) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(connectorCatalogActions, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A06(bfm, f);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA02 = C2CK.A02(bfm, hatchConnectorSearchViewModel.uiState);
            Object[] objArr = {((ConnectorSearchUiState) c1boA02.getValue()).query};
            AFs<LazyListState, ?> aFs = LazyListState.A0Q;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchConnectorSearchScreenKt$ConnectorSearchResults$listState$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            LazyListState lazyListState = (LazyListState) AFz.A01(bfm, aFs, (Function0) objAaT, objArr);
            if (((ConnectorSearchUiState) c1boA02.getValue()).canLoadMore) {
                bfm.AgE(-401411978);
                bfm.Ag8(1649619394, lazyListState);
                boolean zA67 = bfm.A67(hatchConnectorSearchViewModel);
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == obj) {
                    objAaT2 = new HatchConnectorSearchScreenKt$ConnectorSearchResults$1$1(hatchConnectorSearchViewModel);
                    bfm.Ai0(objAaT2);
                }
                AutoLoadMoreKt.AutoLoadMore(lazyListState, 0, (Function0<Unit>) objAaT2, bfm, 0, 1);
                AnonymousClass001.A1D(bfm);
            } else {
                bfm.AgE(-401335098);
            }
            boolean zA1W = AnonymousClass001.A1W(bfm);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            C1DP c1dp = new C1DP(0.0f, 0.0f, 0.0f, 24.0f + f);
            boolean zA65 = bfm.A65(c1boA02);
            if ((iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0T & 64) != 0 && bfm.A67(connectorCatalogActions))) {
                z = true;
            }
            boolean zA1V = AnonymousClass002.A1V(bfm, hatchConnectorSearchViewModel, zA65, z);
            Object objAaT3 = bfm.AaT();
            if (zA1V || objAaT3 == obj) {
                objAaT3 = new HatchConnectorSearchScreenKt$ConnectorSearchResults$2$1(connectorCatalogActions, c1boA02, hatchConnectorSearchViewModel);
                bfm.Ai0(objAaT3);
            }
            C1YY.A01(null, null, null, c1dp, lazyListState, bfm, null, bRgA0R, (G0U) objAaT3, zA1W ? 1 : 0, 504, zA1W, zA1W);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchConnectorSearchScreenKt$ConnectorSearchResults$3(hatchConnectorSearchViewModel, connectorCatalogActions, f, bRg2, i, i2);
        }
    }

    public static final void HatchConnectorSearchScreen(String str, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        String str2 = str;
        boolean z2 = z;
        BRg bRg2 = bRg;
        bfm.AgG(642441267);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                str2 = null;
            }
            if (i4 != 0) {
                z2 = false;
            }
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            String str3 = str2 == null ? "" : str2;
            StringBuilder sb = new StringBuilder("connector-search:");
            sb.append(z2);
            sb.append(":");
            String strA0v = AnonymousClass001.A0v(str3, sb);
            HatchConnectorSearchViewModel.Factory factory = new HatchConnectorSearchViewModel.Factory(AnonymousClass002.A0h(bfm), str2, z2);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            HatchConnectorSearchViewModel hatchConnectorSearchViewModel = (HatchConnectorSearchViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), HatchConnectorSearchViewModel.class, strA0v);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            C1C3 c1c3 = (C1C3) bfm.A6v(Am0.A0E);
            ConnectorCatalogActions connectorCatalogActionsRememberConnectorCatalogActions = HatchConnectorCatalogActionsKt.rememberConnectorCatalogActions(hatchConnectorSearchViewModel, bfm, 0);
            HatchBackClickAnalytics hatchBackClickAnalytics = new HatchBackClickAnalytics(HatchSurface.SETTINGS, HatchScreen.CONNECTORS);
            AuraContainer.SecondaryScreen secondaryScreen = AuraContainer.SecondaryScreen.INSTANCE;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ad7);
            BRg bRgA00 = AbstractC07539Wl.A00(bRg2, "hatch-connector-search");
            boolean zA1J = AnonymousClass003.A1J(bfm, c1c3, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1J || objAaT == C78N.A00) {
                objAaT = new HatchConnectorSearchScreenKt$HatchConnectorSearchScreen$1$1(c1c3, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(secondaryScreen, bRgA00, null, 0L, strA01, null, (Function0) objAaT, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, hatchBackClickAnalytics, false, B1V.A00(bfm, new AnonymousClass2(hatchConnectorSearchViewModel, connectorCatalogActionsRememberConnectorCatalogActions), -1113460680), bfm, 6, 0, C06G.A02(), 402653100);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138543(str2, z2, bRg2, i, i2);
        }
    }

    public static final void logSearchClearClick() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.CONNECTORS, HatchScreen.CONNECTORS, HatchComponent.SEARCH_CLEAR_BUTTON, null, null, null);
    }

    public static final /* synthetic */ ConnectorSearchUiState access$ConnectorSearchResults_942rkJo$lambda$0(C1BO c1bo) {
        return (ConnectorSearchUiState) c1bo.getValue();
    }
}
