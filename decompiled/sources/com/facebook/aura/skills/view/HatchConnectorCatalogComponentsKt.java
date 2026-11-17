package com.facebook.aura.skills.view;

import X.AKH;
import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0A8;
import X.C0CD;
import X.C0ob;
import X.C0v5;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1DM;
import X.C1OM;
import X.C1YD;
import X.C1YL;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3bM;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.model.InternalLinkActionCardPresentationKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.view.common.HatchConnectorIconKt;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogActionLabel;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogTab;
import com.facebook.aura.ui.HatchLazySectionScope;
import com.facebook.aura.ui.HatchPullToRefreshKt;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchConnectorCatalogComponentsKt {

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCatalogComponentsKt$ConnectorCatalogAction$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ ConnectorCatalogRowUiState $row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConnectorCatalogRowUiState connectorCatalogRowUiState, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$row = connectorCatalogRowUiState;
            this.$onClick = function0;
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
            HatchConnectorCatalogComponentsKt.ConnectorCatalogAction(this.$row, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCatalogComponentsKt$ConnectorCatalogEmpty$2, reason: invalid class name and case insensitive filesystem */
    public final class C138372 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138372(BRg bRg, int i, int i2) {
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
            HatchConnectorCatalogComponentsKt.ConnectorCatalogEmpty(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCatalogComponentsKt$ConnectorCatalogError$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onRetry = function0;
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
            HatchConnectorCatalogComponentsKt.ConnectorCatalogError(this.$onRetry, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCatalogComponentsKt$ConnectorCatalogLoading$2, reason: invalid class name and case insensitive filesystem */
    public final class C138382 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138382(BRg bRg, int i, int i2) {
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
            HatchConnectorCatalogComponentsKt.ConnectorCatalogLoading(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCatalogComponentsKt$ConnectorCatalogRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C138392 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ ConnectorCatalogActions $actions;
        public final /* synthetic */ ConnectorCatalogRowUiState $row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138392(ConnectorCatalogRowUiState connectorCatalogRowUiState, ConnectorCatalogActions connectorCatalogActions) {
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
                ConnectorCatalogRowUiState connectorCatalogRowUiState = this.$row;
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$row, bfm.A67(this.$actions));
                ConnectorCatalogActions connectorCatalogActions = this.$actions;
                ConnectorCatalogRowUiState connectorCatalogRowUiState2 = this.$row;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new HatchConnectorCatalogComponentsKt$ConnectorCatalogRow$2$1$1(connectorCatalogActions, connectorCatalogRowUiState2);
                    bfm.Ai0(objAaT);
                }
                HatchConnectorCatalogComponentsKt.ConnectorCatalogAction(connectorCatalogRowUiState, (Function0) objAaT, null, bfm, 0, 4);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCatalogComponentsKt$ConnectorCatalogRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConnectorCatalogActions $actions;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConnectorCatalogRowUiState $row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ConnectorCatalogRowUiState connectorCatalogRowUiState, ConnectorCatalogActions connectorCatalogActions, BRg bRg, int i, int i2) {
            super(2);
            this.$row = connectorCatalogRowUiState;
            this.$actions = connectorCatalogActions;
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
            HatchConnectorCatalogComponentsKt.ConnectorCatalogRow(this.$row, this.$actions, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCatalogComponentsKt$ConnectorCatalogSectionHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C138402 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSeeAll;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138402(String str, BRg bRg, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$title = str;
            this.$modifier = bRg;
            this.$onSeeAll = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConnectorCatalogComponentsKt.ConnectorCatalogSectionHeader(this.$title, this.$modifier, this.$onSeeAll, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCatalogComponentsKt$ConnectorCatalogTabs$2, reason: invalid class name and case insensitive filesystem */
    public final class C138412 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<ConnectorCatalogTab, Unit> $selectTab;
        public final /* synthetic */ ConnectorCatalogTab $selectedTab;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C138412(ConnectorCatalogTab connectorCatalogTab, G0U<? super ConnectorCatalogTab, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$selectedTab = connectorCatalogTab;
            this.$selectTab = g0u;
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
            HatchConnectorCatalogComponentsKt.ConnectorCatalogTabs(this.$selectedTab, this.$selectTab, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCatalogComponentsKt$FeaturedConnectorCatalogRow$3, reason: invalid class name and case insensitive filesystem */
    public final class C138423 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConnectorCatalogActions $actions;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConnectorCatalogRowUiState $row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138423(ConnectorCatalogRowUiState connectorCatalogRowUiState, ConnectorCatalogActions connectorCatalogActions, BRg bRg, int i, int i2) {
            super(2);
            this.$row = connectorCatalogRowUiState;
            this.$actions = connectorCatalogActions;
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
            HatchConnectorCatalogComponentsKt.FeaturedConnectorCatalogRow(this.$row, this.$actions, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCatalogComponentsKt$connectorCatalogRows$1, reason: invalid class name and case insensitive filesystem */
    public final class C138431 extends AbstractC7559F3s implements G0U<HatchLazySectionScope, Unit> {
        public final /* synthetic */ ConnectorCatalogActions $actions;
        public final /* synthetic */ List<ConnectorCatalogRowUiState> $rows;
        public final /* synthetic */ String $sectionId;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchLazySectionScope hatchLazySectionScope) {
            C7384Etj.A0Y(hatchLazySectionScope, 0);
            List<ConnectorCatalogRowUiState> list = this.$rows;
            String str = this.$sectionId;
            ConnectorCatalogActions connectorCatalogActions = this.$actions;
            for (ConnectorCatalogRowUiState connectorCatalogRowUiState : list) {
                int length = str.length();
                String str2 = connectorCatalogRowUiState.connectorId;
                StringBuilder sb = new StringBuilder("connector:");
                sb.append(length);
                sb.append(":");
                sb.append(str);
                sb.append(":");
                hatchLazySectionScope.item(AnonymousClass001.A0v(str2, sb), InternalLinkActionCardPresentationKt.INTERNAL_LINK_TYPE_CONNECTOR, AnonymousClass001.A0M(new HatchConnectorCatalogComponentsKt$connectorCatalogRows$1$1$1(connectorCatalogRowUiState, connectorCatalogActions), -271027592));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138431(List<ConnectorCatalogRowUiState> list, String str, ConnectorCatalogActions connectorCatalogActions) {
            super(1);
            this.$rows = list;
            this.$sectionId = str;
            this.$actions = connectorCatalogActions;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchLazySectionScope hatchLazySectionScope) {
            invoke2(hatchLazySectionScope);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorCatalogComponentsKt$localConnectorCatalogRows$1, reason: invalid class name and case insensitive filesystem */
    public final class C138441 extends AbstractC7559F3s implements G0U<HatchLazySectionScope, Unit> {
        public final /* synthetic */ ConnectorCatalogActions $actions;
        public final /* synthetic */ List<ConnectorCatalogRowUiState> $rows;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchLazySectionScope hatchLazySectionScope) {
            C7384Etj.A0Y(hatchLazySectionScope, 0);
            List<ConnectorCatalogRowUiState> list = this.$rows;
            ConnectorCatalogActions connectorCatalogActions = this.$actions;
            for (ConnectorCatalogRowUiState connectorCatalogRowUiState : list) {
                hatchLazySectionScope.item(FGI.A0M("device-connector:", connectorCatalogRowUiState.connectorId), InternalLinkActionCardPresentationKt.INTERNAL_LINK_TYPE_CONNECTOR, AnonymousClass001.A0M(new HatchConnectorCatalogComponentsKt$localConnectorCatalogRows$1$1$1(connectorCatalogRowUiState, connectorCatalogActions), -1086535208));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138441(List<ConnectorCatalogRowUiState> list, ConnectorCatalogActions connectorCatalogActions) {
            super(1);
            this.$rows = list;
            this.$actions = connectorCatalogActions;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchLazySectionScope hatchLazySectionScope) {
            invoke2(hatchLazySectionScope);
            return Unit.INSTANCE;
        }
    }

    public static final void ConnectorCatalogError(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(1801125872);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            HatchScreenErrorStateKt.HatchScreenErrorState(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f8c), function0, AnonymousClass001.A0R(bRg), HatchSurface.SETTINGS, HatchSubsurface.CONNECTORS, HatchScreen.CONNECTORS, null, bfm, ((iA0T << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 224256, 64);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(function0, bRg, i, i2);
        }
    }

    public static final void connectorCatalogRows(C0CD c0cd, String str, List<ConnectorCatalogRowUiState> list, ConnectorCatalogActions connectorCatalogActions) {
        C7384Etj.A0Y(c0cd, 0);
        AnonymousClass005.A11(str, list, connectorCatalogActions, 1);
        HatchSectionKt.m2324HatchSectionlMAxDYE(c0cd, false, null, null, null, null, new C138431(list, str, connectorCatalogActions));
    }

    public static final void localConnectorCatalogRows(C0CD c0cd, List<ConnectorCatalogRowUiState> list, ConnectorCatalogActions connectorCatalogActions) {
        AnonymousClass005.A10(c0cd, list, connectorCatalogActions);
        HatchSectionKt.m2324HatchSectionlMAxDYE(c0cd, false, null, null, null, null, new C138441(list, connectorCatalogActions));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectorCatalogActionLabel.values().length];
            try {
                AnonymousClass002.A13(ConnectorCatalogActionLabel.CONNECT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConnectorCatalogActionLabel.VIEW, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ConnectorCatalogActionLabel.COMING_SOON, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ConnectorCatalogAction(ConnectorCatalogRowUiState connectorCatalogRowUiState, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1585249477);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, connectorCatalogRowUiState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (connectorCatalogRowUiState.loading) {
                bfm.AgE(-1293060058);
                String strA0t = AnonymousClass001.A0t(bfm, connectorCatalogRowUiState.title, R.string._name_removed__res_0x7f120aca);
                BRg bRgA07 = C10G.A07(C3U4.A09(bRg2, 15.0f), 18.0f);
                boolean zA65 = bfm.A65(strA0t);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchConnectorCatalogComponentsKt$ConnectorCatalogAction$1$1(strA0t);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A0v(bfm, bRgA07, (G0U) objAaT);
            } else if (connectorCatalogRowUiState.enabled) {
                bfm.AgE(-1292438787);
                AuraTextKt.m2639AuraTextUY9GdpU(connectorCatalogActionLabel(connectorCatalogRowUiState.actionLabel, bfm, 0), AbstractC07539Wl.A00(C3U4.A07(C10G.A01(C2VU.A04, AnonymousClass006.A0O(C0v5.A05(C11U.A03(bRg2, AnonymousClass002.A0e(bfm).pill), null, function0, true)), false), 8.0f), FGI.A0M("hatch-catalog-action-", connectorCatalogRowUiState.connectorId)), C06G.A0D(bfm), C06G.A0W(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            } else {
                bfm.AgE(-1292693576);
                AuraTextKt.m2639AuraTextUY9GdpU(connectorCatalogActionLabel(connectorCatalogRowUiState.actionLabel, bfm, 0), C3U4.A07(bRg2, 8.0f), C06G.A09(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(connectorCatalogRowUiState, function0, bRg2, i, i2);
        }
    }

    public static final void ConnectorCatalogEmpty(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(265879081);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ada);
            long jA08 = C06G.A08(bfm);
            BRg bRgA09 = C3U4.A09(AnonymousClass001.A0R(bRg2), 24.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchConnectorCatalogComponentsKt$ConnectorCatalogEmpty$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bRgA09, objAaT, false), jA08, null, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16312);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138372(bRg2, i, i2);
        }
    }

    /* renamed from: ConnectorCatalogList-eWuZFaY, reason: not valid java name */
    public static final void m2144ConnectorCatalogListeWuZFaY(LazyListState lazyListState, float f, float f2, boolean z, Function0<Unit> function0, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, G0U<? super C0CD, Unit> g0u, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        G0V<? super BFM, ? super Integer, Unit> g0v2 = g0v;
        AnonymousClass002.A1C(lazyListState, 0, function0);
        C7384Etj.A0Y(g0u, 7);
        bfm.AgG(122015805);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, lazyListState) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((i & 196608) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        int i4 = i2 & 64;
        int iA0Z = 1572864;
        if (i4 != 0) {
            iA0d |= iA0Z;
        } else if ((1572864 & i) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, g0v2);
            iA0d |= iA0Z;
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(4793491 & iA0d, 4793490), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g0v2 = null;
            }
            int i5 = iA0d >> 9;
            HatchPullToRefreshKt.m2322HatchPullToRefreshjIwJxvA(z, function0, AnonymousClass001.A0T(bRg2), f, null, B1V.A00(bfm, new HatchConnectorCatalogComponentsKt$ConnectorCatalogList$1(f2, lazyListState, f, g0v2, g0u), 1603215897), bfm, (i5 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i5 & 14) | 196608 | ((iA0d << 6) & 7168), 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchConnectorCatalogComponentsKt$ConnectorCatalogList$2(lazyListState, f, f2, z, function0, bRg2, g0v2, g0u, i, i2);
        }
    }

    public static final void ConnectorCatalogRow(ConnectorCatalogRowUiState connectorCatalogRowUiState, ConnectorCatalogActions connectorCatalogActions, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-2140947378);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, connectorCatalogRowUiState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(connectorCatalogActions, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String str = connectorCatalogRowUiState.connectorId;
            String str2 = connectorCatalogRowUiState.title;
            String str3 = connectorCatalogRowUiState.iconUrl;
            String str4 = connectorCatalogRowUiState.rowTestTag;
            Integer num = connectorCatalogRowUiState.iconRes;
            boolean z = connectorCatalogRowUiState.needsReauth;
            boolean z2 = connectorCatalogRowUiState.hasCvmCallout;
            String strA0e = connectorCatalogRowUiState.subtitle;
            Function0 function0 = null;
            if (strA0e == null) {
                if (connectorCatalogRowUiState.showCustomSubtitle) {
                    bfm.AgE(-161079537);
                    strA0e = AnonymousClass003.A0e(bfm, R.string._name_removed__res_0x7f120acb);
                } else {
                    AnonymousClass003.A0l(bfm, -698415921);
                    strA0e = null;
                }
            }
            if (connectorCatalogRowUiState.enabled) {
                bfm.AgE(-698348743);
                boolean zA1S = AnonymousClass001.A1S(bfm, connectorCatalogRowUiState, (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0T & 64) != 0 && bfm.A67(connectorCatalogActions)));
                Object objAaT = bfm.AaT();
                if (zA1S || objAaT == C78N.A00) {
                    objAaT = new HatchConnectorCatalogComponentsKt$ConnectorCatalogRow$1$1(connectorCatalogActions, connectorCatalogRowUiState);
                    bfm.Ai0(objAaT);
                }
                function0 = (Function0) objAaT;
            } else {
                bfm.AgE(-698315729);
            }
            AnonymousClass001.A1D(bfm);
            ConnectorRowKt.ConnectorRow(str, str2, str3, str4, bRg2, num, strA0e, z, z2, function0, B1V.A00(bfm, new C138392(connectorCatalogRowUiState, connectorCatalogActions), 970283581), bfm, 57344 & (iA0T << 6), 6, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(connectorCatalogRowUiState, connectorCatalogActions, bRg2, i, i2);
        }
    }

    public static final void ConnectorCatalogSectionHeader(String str, BRg bRg, Function0<Unit> function0, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        Function0<Unit> function02 = function0;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-2017036921);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                function02 = null;
            }
            BRg bRgA0C = C3U4.A0C(C10G.A09(AnonymousClass001.A0R(bRg2), Float.NaN, 48.0f), 12.0f, 0.0f, 0.0f, 0.0f);
            C1AC c1ac = C2VU.A04;
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, c1ac, 8.0f);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i5 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0V, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i5);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            C1822Arm c1822ArmA0W = C06G.A0W(bfm);
            BS0 bs0 = BRg.A00;
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchConnectorCatalogComponentsKt$ConnectorCatalogSectionHeader$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRgAiP, objAaT, false), 0L, c1822ArmA0W, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16372);
            if (function02 != null) {
                bfm.AgE(-1229108399);
                String strA0t = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120ade);
                BRg bRgA05 = C0v5.A05(C11U.A03(bs0, AnonymousClass002.A0e(bfm).pill), null, function02, true);
                boolean zA65 = bfm.A65(strA0t);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == obj) {
                    objAaT2 = new HatchConnectorCatalogComponentsKt$ConnectorCatalogSectionHeader$1$2$1(strA0t);
                    bfm.Ai0(objAaT2);
                }
                BRg bRgA0B = C3U4.A0B(C10G.A09(AnonymousClass001.A0Y(bRgA05, objAaT2, true), Float.NaN, 48.0f), 12.0f, 0.0f);
                InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, c1ac);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA0B);
                AnonymousClass005.A0n(bfm, bbi, function03);
                BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120add), null, C06G.A08(bfm), C06G.A0Z(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                ConnectorRowKt.ConnectedSkillChevron(null, bfm, 0, 1);
                BBI.A0R(bbi, true);
            } else {
                bfm.AgE(-1228356897);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138402(str, bRg2, function02, i, i2);
        }
    }

    public static final void ConnectorCatalogTabs(ConnectorCatalogTab connectorCatalogTab, G0U<? super ConnectorCatalogTab, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        boolean zA1a = AnonymousClass002.A1a(connectorCatalogTab, g0u);
        bfm.AgG(1775824440);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, connectorCatalogTab) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA08), bfm, iA08)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            BRg bRgA03 = C11U.A03(AnonymousClass001.A0R(bRgA0Q), AnonymousClass002.A0e(bfm).pill);
            long jA0J = C06G.A0J(bfm, AuraColorsKt.LocalAuraColors);
            C1DM c1dm = C1OM.A00;
            BRg bRgA09 = C3U4.A09(C3bM.A00(C1b8.A03(bRgA03, c1dm, jA0J)), 4.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A05, 0);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, i4);
            C90m c90m = C90m.A00;
            bfm.AgE(1183555787);
            for (ConnectorCatalogTab connectorCatalogTab2 : ConnectorCatalogTab.getEntries()) {
                ConnectorCatalogTab connectorCatalogTab3 = ConnectorCatalogTab.AVAILABLE;
                int i5 = R.string._name_removed__res_0x7f1207ac;
                if (connectorCatalogTab2 == connectorCatalogTab3) {
                    i5 = R.string._name_removed__res_0x7f120ac8;
                }
                String strA01 = AbstractC2271BQs.A01(bfm, i5);
                C1822Arm c1822ArmA0V = C06G.A0V(bfm);
                BRg bRgA032 = BRg.A00;
                BRg bRgA033 = C11U.A03(AnonymousClass001.A0O(c90m, bRgA032, zA1a), AnonymousClass002.A0e(bfm).pill);
                if (connectorCatalogTab == connectorCatalogTab2) {
                    bRgA032 = C1b8.A03(bRgA032, c1dm, AnonymousClass003.A0c(bfm, -1582549393).secondaryButtonBackground);
                } else {
                    bfm.AgE(-1582433050);
                }
                BBI.A0R(bbi, false);
                BRg bRgThen = bRgA033.then(bRgA032);
                boolean zA1Z = AnonymousClass002.A1Z(connectorCatalogTab, connectorCatalogTab2);
                C1YD c1yd = new C1YD(4);
                boolean zA1U = AnonymousClass002.A1U(bfm, connectorCatalogTab2) | AnonymousClass003.A1B(iA08) | AnonymousClass003.A1C(iA08);
                Object objAaT = bfm.AaT();
                if (zA1U || objAaT == C78N.A00) {
                    objAaT = new HatchConnectorCatalogComponentsKt$ConnectorCatalogTabs$1$1$1$1(connectorCatalogTab2, connectorCatalogTab, g0u);
                    bfm.Ai0(objAaT);
                }
                BRg bRgA00 = C0ob.A00(bRgThen, c1yd, (Function0) objAaT, zA1Z, zA1a);
                boolean zA65 = bfm.A65(strA01);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchConnectorCatalogComponentsKt$ConnectorCatalogTabs$1$1$2$1(strA01);
                    bfm.Ai0(objAaT2);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, AbstractC07539Wl.A00(C3U4.A08(C10G.A01(C2VU.A04, AnonymousClass006.A0O(AnonymousClass001.A0Y(bRgA00, objAaT2, false)), false), 12.0f), FGI.A0M("hatch-connector-catalog-tab-", AnonymousClass006.A0x(connectorCatalogTab2))), 0L, c1822ArmA0V, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16308);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138412(connectorCatalogTab, g0u, bRgA0Q, i, i2);
        }
    }

    public static final void FeaturedConnectorCatalogRow(ConnectorCatalogRowUiState connectorCatalogRowUiState, ConnectorCatalogActions connectorCatalogActions, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(275200540);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, connectorCatalogRowUiState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(connectorCatalogActions, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0Q);
            boolean z = connectorCatalogRowUiState.enabled;
            C1YD c1yd = new C1YD(0);
            int i4 = iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1T = AnonymousClass001.A1T(bfm, connectorCatalogRowUiState, i4 == 32 || ((iA0T & 64) != 0 && bfm.A67(connectorCatalogActions)));
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new HatchConnectorCatalogComponentsKt$FeaturedConnectorCatalogRow$1$1(connectorCatalogActions, connectorCatalogRowUiState);
                bfm.Ai0(objAaT);
            }
            BRg bRgA09 = C3U4.A09(C0v5.A04(bRgA0R, c1yd, null, (Function0) objAaT, z), 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 12.0f);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0V, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, iA0D);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgAiP = C90m.A00.AiP(BRg.A00, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String str = connectorCatalogRowUiState.title;
            AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, 0L, AnonymousClass001.A0g(bfm, akh).bodyMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
            if (connectorCatalogRowUiState.hasCvmCallout) {
                bfm.AgE(-557712788);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b05), null, C06G.A08(bfm), C06G.A0a(bfm, akh), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-557501120);
                BBI.A0R(bbi, false);
            }
            if (connectorCatalogRowUiState.showDescription) {
                bfm.AgE(-557452109);
                AuraTextKt.m2639AuraTextUY9GdpU(connectorCatalogRowUiState.description, null, C06G.A08(bfm), C06G.A0Y(bfm), null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-557216416);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            if (connectorCatalogRowUiState.showFeaturedAction) {
                bfm.AgE(-1764815366);
                boolean zA1S = AnonymousClass001.A1S(bfm, connectorCatalogRowUiState, i4 == 32 || ((iA0T & 64) != 0 && bfm.A67(connectorCatalogActions)));
                Object objAaT2 = bfm.AaT();
                if (zA1S || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchConnectorCatalogComponentsKt$FeaturedConnectorCatalogRow$2$2$1(connectorCatalogActions, connectorCatalogRowUiState);
                    bfm.Ai0(objAaT2);
                }
                ConnectorCatalogAction(connectorCatalogRowUiState, (Function0) objAaT2, null, bfm, iA0T & 14, 4);
            } else {
                bfm.AgE(-1764729837);
                HatchConnectorIconKt.m2169ConnectorIconVRRgpyE(connectorCatalogRowUiState.iconUrl, connectorCatalogRowUiState.iconRes, null, 48.0f, 0.0f, 0, 0.0f, null, null, bfm, 3072, 500);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138423(connectorCatalogRowUiState, connectorCatalogActions, bRgA0Q, i, i2);
        }
    }

    public static final void logConnectorsSegmentClick(ConnectorCatalogTab connectorCatalogTab) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.CONNECTORS, HatchScreen.CONNECTORS, HatchComponent.CONNECTORS_SEGMENT, null, AnonymousClass006.A10(HatchMetadataKey.ABSOLUTE_POSITION.getValue(), String.valueOf(connectorCatalogTab.ordinal())), null);
    }

    public static final void ConnectorCatalogLoading(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-216022120);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120adc);
            BRg bRgA04 = C10G.A04(AnonymousClass001.A0R(bRg), 120.0f);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchConnectorCatalogComponentsKt$ConnectorCatalogLoading$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            HatchScreenLoadingStateKt.HatchScreenLoadingState(AnonymousClass001.A0Y(bRgA04, objAaT, false), bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138382(bRg, i, i2);
        }
    }

    public static final String connectorCatalogActionLabel(ConnectorCatalogActionLabel connectorCatalogActionLabel, BFM bfm, int i) {
        int i2;
        int iOrdinal = connectorCatalogActionLabel.ordinal();
        if (iOrdinal == 0) {
            i2 = R.string._name_removed__res_0x7f120f8b;
        } else if (iOrdinal == 1) {
            i2 = R.string._name_removed__res_0x7f120adf;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R.string._name_removed__res_0x7f120f68;
        }
        return AbstractC2271BQs.A01(bfm, i2);
    }

    public static final void featuredConnectorCatalogRows(C0CD c0cd, List<ConnectorCatalogRowUiState> list, ConnectorCatalogActions connectorCatalogActions) {
        boolean zA1Z = AnonymousClass005.A1Z(c0cd, list, connectorCatalogActions);
        c0cd.APJ("featured-header", "header", ComposableSingletons$HatchConnectorCatalogComponentsKt.lambda$39456150);
        int i = 0;
        for (ConnectorCatalogRowUiState connectorCatalogRowUiState : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            ConnectorCatalogRowUiState connectorCatalogRowUiState2 = connectorCatalogRowUiState;
            c0cd.APJ(FGI.A0M("featured-connector:", connectorCatalogRowUiState2.connectorId), "featured-connector", B1V.A01(new HatchConnectorCatalogComponentsKt$featuredConnectorCatalogRows$1$1(i, list, connectorCatalogRowUiState2, connectorCatalogActions), 160018542, zA1Z));
            i = i2;
        }
    }
}
