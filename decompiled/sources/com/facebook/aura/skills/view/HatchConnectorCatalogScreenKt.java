package com.facebook.aura.skills.view;

import X.AHD;
import X.AKQ;
import X.AZ3;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BOD;
import X.BQN;
import X.BRg;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06H;
import X.C0861A6i;
import X.C0881AGi;
import X.C08R;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C1YL;
import X.C2CK;
import X.C2VU;
import X.C5wL;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import androidx.compose.foundation.lazy.LazyListState;
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
import com.facebook.aura.skills.api.ClientConnector;
import com.facebook.aura.skills.api.ConnectedConnectorContributor;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogHomepageUiState;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogPageViewModel;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogTab;
import com.facebook.aura.skills.viewmodel.HatchConnectorCatalogViewModel;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchConnectorCatalogScreenKt {

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCatalogScreenKt$ConnectorCatalogHeader$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<ConnectorCatalogTab, Unit> $onTabSelected;
        public final /* synthetic */ ConnectorCatalogTab $selectedTab;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(ConnectorCatalogTab connectorCatalogTab, G0U<? super ConnectorCatalogTab, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$selectedTab = connectorCatalogTab;
            this.$onTabSelected = g0u;
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
            HatchConnectorCatalogScreenKt.ConnectorCatalogHeader(this.$selectedTab, this.$onTabSelected, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCatalogScreenKt$CustomConnectorsCatalogCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C138452 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $count;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138452(int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$count = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConnectorCatalogScreenKt.CustomConnectorsCatalogCard(this.$count, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCatalogScreenKt$HatchConnectorCatalogScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C138462 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectorCatalogActions $actions;
        public final /* synthetic */ HatchConnectorCatalogViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138462(HatchConnectorCatalogViewModel hatchConnectorCatalogViewModel, ConnectorCatalogActions connectorCatalogActions) {
            super(4);
            this.$viewModel = hatchConnectorCatalogViewModel;
            this.$actions = connectorCatalogActions;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m2149invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m2149invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA04), bfm, iA04)) {
                HatchConnectorCatalogScreenKt.m2145ConnectorCatalogContentvz2T9sI(this.$viewModel, this.$actions, f, f2, null, bfm, AnonymousClass002.A08(iA04 << 6, ConnectorCatalogActions.$stable << 3), 16);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCatalogScreenKt$HatchConnectorCatalogScreen$3, reason: invalid class name */
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
            HatchConnectorCatalogScreenKt.HatchConnectorCatalogScreen(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectorCatalogTab.values().length];
            try {
                AnonymousClass002.A13(ConnectorCatalogTab.AVAILABLE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConnectorCatalogTab.CONNECTED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: ConnectorCatalogContent-vz2T9sI, reason: not valid java name */
    public static final void m2145ConnectorCatalogContentvz2T9sI(HatchConnectorCatalogViewModel hatchConnectorCatalogViewModel, ConnectorCatalogActions connectorCatalogActions, float f, float f2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1130083870);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchConnectorCatalogViewModel) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(connectorCatalogActions, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A06(bfm, f);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A07(bfm, f2);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 9363, 9362), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA02 = C2CK.A02(bfm, hatchConnectorCatalogViewModel.selectedTab);
            LazyListState lazyListStateA00 = AZ3.A00(0, 0, bfm, 0, 3);
            LazyListState lazyListStateA002 = AZ3.A00(0, 0, bfm, 0, 3);
            int iOrdinal = ((ConnectorCatalogTab) c1boA02.getValue()).ordinal();
            if (iOrdinal == 0) {
                bfm.AgE(616141145);
                int i4 = iA0T << 3;
                m2146ConnectorCatalogHomepageYlGCr2M(hatchConnectorCatalogViewModel, connectorCatalogActions, lazyListStateA00, f, f2, bRg2, B1V.A00(bfm, new HatchConnectorCatalogScreenKt$ConnectorCatalogContent$1(hatchConnectorCatalogViewModel, c1boA02), 756843485), bfm, AnonymousClass001.A08(i4, (iA0T & 14) | 1572864 | (ConnectorCatalogActions.$stable << 3) | (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i4 & 7168) | (i4 & 57344)), 0);
            } else {
                if (iOrdinal != 1) {
                    throw AnonymousClass005.A0k(bfm, 616139619);
                }
                bfm.AgE(616151736);
                ConnectorCatalogPageViewModel connectorCatalogPageViewModel = hatchConnectorCatalogViewModel.connected;
                boolean zA67 = bfm.A67(hatchConnectorCatalogViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchConnectorCatalogScreenKt$ConnectorCatalogContent$2$1(hatchConnectorCatalogViewModel);
                    bfm.Ai0(objAaT);
                }
                int i5 = iA0T << 3;
                HatchConnectorCategoryScreenKt.m2150ConnectorCatalogPageContentikN4xI4(connectorCatalogPageViewModel, connectorCatalogActions, lazyListStateA002, f, f2, (Function0) ((InterfaceC7353EnQ) objAaT), bRg2, B1V.A00(bfm, new HatchConnectorCatalogScreenKt$ConnectorCatalogContent$3(hatchConnectorCatalogViewModel, c1boA02), 540031733), rememberClientConnectedConnectors(bfm, 0), bfm, (ConnectorCatalogActions.$stable << 3) | 12582912 | (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i5 & 7168) | (i5 & 57344) | (3670016 & (iA0T << 6)) | (ClientConnector.$stable << 24), 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchConnectorCatalogScreenKt$ConnectorCatalogContent$4(hatchConnectorCatalogViewModel, connectorCatalogActions, f, f2, bRg2, i, i2);
        }
    }

    public static final void ConnectorCatalogHeader(ConnectorCatalogTab connectorCatalogTab, G0U<? super ConnectorCatalogTab, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1477557391);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, connectorCatalogTab) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 147, 146), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            HatchConnectorSearchEntryKt.ConnectorCatalogSearchEntry(null, null, false, bfm, 0, 7);
            C01N.A06(bfm, BRg.A00);
            HatchConnectorCatalogComponentsKt.ConnectorCatalogTabs(connectorCatalogTab, g0u, null, bfm, iA08 & 126, 4);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(connectorCatalogTab, g0u, bRg2, i, i2);
        }
    }

    /* renamed from: ConnectorCatalogHomepage-YlGCr2M, reason: not valid java name */
    public static final void m2146ConnectorCatalogHomepageYlGCr2M(HatchConnectorCatalogViewModel hatchConnectorCatalogViewModel, ConnectorCatalogActions connectorCatalogActions, LazyListState lazyListState, float f, float f2, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        G0V<? super BFM, ? super Integer, Unit> g0v2 = g0v;
        BRg bRg2 = bRg;
        bfm.AgG(-1825389587);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchConnectorCatalogViewModel) | i : i;
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
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0T |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0T |= iA0i;
        }
        int i4 = i2 & 64;
        int iA0Z = 1572864;
        if (i4 != 0) {
            iA0T |= iA0Z;
        } else if ((1572864 & i) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, g0v2);
            iA0T |= iA0Z;
        }
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA0T, 599186), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g0v2 = null;
            }
            C1BO c1boA02 = C2CK.A02(bfm, hatchConnectorCatalogViewModel.homepage);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b6d);
            boolean z2 = ((ConnectorCatalogHomepageUiState) c1boA02.getValue()).isRefreshing;
            int i5 = iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1T = AnonymousClass001.A1T(bfm, hatchConnectorCatalogViewModel, i5 == 32 || ((iA0T & 64) != 0 && bfm.A67(connectorCatalogActions)));
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new HatchConnectorCatalogScreenKt$ConnectorCatalogHomepage$1$1(connectorCatalogActions, hatchConnectorCatalogViewModel);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            boolean zA1J = AnonymousClass003.A1J(bfm, c1boA02, hatchConnectorCatalogViewModel);
            if (i5 != 32 && ((iA0T & 64) == 0 || !bfm.A67(connectorCatalogActions))) {
                z = false;
            }
            boolean zA1O = AnonymousClass003.A1O(bfm, auraNavigatorA0b, strA01, zA1J | z);
            Object objAaT2 = bfm.AaT();
            if (zA1O || objAaT2 == C78N.A00) {
                objAaT2 = new HatchConnectorCatalogScreenKt$ConnectorCatalogHomepage$2$1(connectorCatalogActions, c1boA02, hatchConnectorCatalogViewModel, auraNavigatorA0b, strA01);
                bfm.Ai0(objAaT2);
            }
            HatchConnectorCatalogComponentsKt.m2144ConnectorCatalogListeWuZFaY(lazyListState, f, f2, z2, function0, bRg2, g0v2, (G0U) objAaT2, bfm, AnonymousClass001.A07(iA0T, (iA0T >> 6) & 1022) | (3670016 & iA0T), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchConnectorCatalogScreenKt$ConnectorCatalogHomepage$3(hatchConnectorCatalogViewModel, connectorCatalogActions, lazyListState, f, f2, bRg2, g0v2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void CustomConnectorsCatalogCard(int i, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(1616245319);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        int i4 = i3 & 2;
        if (i4 != 0) {
            iA0D |= 48;
        } else if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i5 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 19, 18), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ad9);
            AuraCardType.Clickable clickable = AuraCardType.Clickable.INSTANCE;
            BRg bRgA00 = AbstractC07539Wl.A00(AnonymousClass001.A0R(bRg2), "hatch-connector-catalog-custom");
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(C2VU.A04, bfm, 6, 0);
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            C0881AGi c0881AGi = C0881AGi.A00;
            long j = 0;
            AuraCardContent auraCardContent = new AuraCardContent(new ApQ(strA01, c0881AGi), auraIconAndHeadlineStyle, (BO6) null, (B6A) (0 == true ? 1 : 0), new ApQ(AnonymousClass007.A0Y(i, bfm, R.plurals._name_removed__res_0x7f100030), c0881AGi), (G0U) (0 == true ? 1 : 0), (AuraIconAndBodyStyle) (0 == true ? 1 : 0), (B6A) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), i5, (int) (objArr4 == true ? 1 : 0), (int) (objArr3 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (boolean) (objArr2 == true ? 1 : 0), (boolean) (objArr == true ? 1 : 0), (ApQ) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), j, j, (C1YL) (0 == true ? 1 : 0), 2097132, (C06H) (0 == true ? 1 : 0));
            G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchConnectorCatalogScreenKt.lambda$1400217067;
            G0W<C08R, BFM, Integer, Unit> g0w = ComposableSingletons$HatchConnectorCatalogScreenKt.lambda$579020500;
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchConnectorCatalogScreenKt$CustomConnectorsCatalogCard$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(bRgA00, auraCardStyleCardStyleForSettings, auraCardContent, clickable, g0v, g0w, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 224256, 0, 262016);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138452(i, bRg2, i2, i3);
        }
    }

    public static final void HatchConnectorCatalogScreen(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(329616234);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchConnectorCatalogViewModel.Factory factory = new HatchConnectorCatalogViewModel.Factory(AnonymousClass002.A0h(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            HatchConnectorCatalogViewModel hatchConnectorCatalogViewModel = (HatchConnectorCatalogViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(HatchConnectorCatalogViewModel.class));
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            ConnectorCatalogActions connectorCatalogActionsRememberConnectorCatalogActions = HatchConnectorCatalogActionsKt.rememberConnectorCatalogActions(hatchConnectorCatalogViewModel, bfm, 0);
            HatchBackClickAnalytics hatchBackClickAnalytics = new HatchBackClickAnalytics(HatchSurface.SETTINGS, HatchScreen.CONNECTORS);
            AuraContainer.SecondaryScreen secondaryScreen = AuraContainer.SecondaryScreen.INSTANCE;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ee4);
            BRg bRgA00 = AbstractC07539Wl.A00(bRg2, "hatch-connector-catalog");
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchConnectorCatalogScreenKt$HatchConnectorCatalogScreen$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(secondaryScreen, bRgA00, null, 0L, strA01, null, (Function0) objAaT, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, hatchBackClickAnalytics, false, B1V.A00(bfm, new C138462(hatchConnectorCatalogViewModel, connectorCatalogActionsRememberConnectorCatalogActions), 383506245), bfm, 6, 0, C06G.A02(), 402653100);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRg2, i, i2);
        }
    }

    public static final void logSeeAllConnectors(String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.CONNECTORS, HatchScreen.CONNECTORS, HatchComponent.SEE_ALL_CONNECTORS_BUTTON, str, null, null);
    }

    public static final /* synthetic */ ConnectorCatalogTab access$ConnectorCatalogContent_vz2T9sI$lambda$0(C1BO c1bo) {
        return (ConnectorCatalogTab) c1bo.getValue();
    }

    public static final /* synthetic */ ConnectorCatalogHomepageUiState access$ConnectorCatalogHomepage_YlGCr2M$lambda$0(C1BO c1bo) {
        return (ConnectorCatalogHomepageUiState) c1bo.getValue();
    }

    public static final AHD<ClientConnector> rememberClientConnectedConnectors(BFM bfm, int i) {
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = new ArrayList(0);
            bfm.Ai0(objAaT);
        }
        bfm.AgE(-1190322259);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) objAaT).iterator();
        while (it.hasNext()) {
            ClientConnector clientConnectorRememberConnector = ((ConnectedConnectorContributor) it.next()).rememberConnector(bfm, 0);
            if (clientConnectorRememberConnector != null) {
                arrayList.add(clientConnectorRememberConnector);
            }
        }
        AnonymousClass002.A19(bfm);
        boolean zA65 = bfm.A65(arrayList);
        Object objAaT2 = bfm.AaT();
        if (zA65 || objAaT2 == obj) {
            objAaT2 = AnonymousClass001.A0z(bfm, arrayList);
        }
        return (AHD) objAaT2;
    }
}
