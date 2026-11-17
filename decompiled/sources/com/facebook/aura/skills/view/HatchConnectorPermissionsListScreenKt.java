package com.facebook.aura.skills.view;

import X.AKH;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C2CK;
import X.C3U4;
import X.C78N;
import X.C7bA;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import androidx.activity.ComponentActivity;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConnectorPermissionsScreenKey;
import com.facebook.aura.skills.api.ConnectorDestinations;
import com.facebook.aura.skills.viewmodel.ConnectedConnectorsUiState;
import com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchConnectorPermissionsListScreenKt {

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorPermissionsListScreenKt$HatchConnectorPermissionsListScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ HatchConnectedConnectorsViewModel $connectorsViewModel;
        public final /* synthetic */ ConnectedConnectorsUiState $entries;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConnectedConnectorsUiState connectedConnectorsUiState, HatchConnectedConnectorsViewModel hatchConnectedConnectorsViewModel, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz) {
            super(4);
            this.$entries = connectedConnectorsUiState;
            this.$connectorsViewModel = hatchConnectedConnectorsViewModel;
            this.$navigator = auraNavigator;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m2153invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m2153invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA0M = AnonymousClass006.A0M(bfm);
            AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
            BRg bRgA07 = C3U4.A07(bRgA0M, C06G.A01(bfm, akh));
            ConnectedConnectorsUiState connectedConnectorsUiState = this.$entries;
            HatchConnectedConnectorsViewModel hatchConnectedConnectorsViewModel = this.$connectorsViewModel;
            AuraNavigator auraNavigator = this.$navigator;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            C01N.A08(bfm, bs0, f);
            if (connectedConnectorsUiState.isLoading) {
                bfm.AgE(369619196);
                HatchScreenLoadingStateKt.HatchScreenLoadingState(C10G.A04(C10G.A02, 240.0f), bfm, 6, 0);
            } else if (connectedConnectorsUiState.showError) {
                bfm.AgE(369623185);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f8c);
                boolean zA67 = bfm.A67(hatchConnectedConnectorsViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchConnectorPermissionsListScreenKt$HatchConnectorPermissionsListScreen$1$1$1$1(hatchConnectedConnectorsViewModel);
                    bfm.Ai0(objAaT);
                }
                HatchScreenErrorStateKt.HatchScreenErrorState(strA01, (Function0) ((InterfaceC7353EnQ) objAaT), C10G.A04(C10G.A02, 240.0f), HatchSurface.SETTINGS, HatchSubsurface.PERMISSIONS, HatchScreen.CONNECTORS, null, bfm, 224640, 64);
            } else if (connectedConnectorsUiState.showEmpty) {
                bfm.AgE(369635493);
                ConnectorPermissionSectionsKt.EmptySkillDetailState(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12012b), bfm, 0);
            } else {
                bfm.AgE(369640087);
                boolean zA1S = AnonymousClass005.A1S(bfm, connectedConnectorsUiState, auraNavigator, abstractC3358CGz);
                Object objAaT2 = bfm.AaT();
                if (zA1S || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchConnectorPermissionsListScreenKt$HatchConnectorPermissionsListScreen$1$1$2$1(connectedConnectorsUiState, auraNavigator, abstractC3358CGz);
                    bfm.Ai0(objAaT2);
                }
                HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT2, bfm, 6, 7);
            }
            BBI.A0R(bbi, false);
            C01N.A04(bfm, bbi, bs0, f2 + C06G.A01(bfm, akh), true);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorPermissionsListScreenKt$HatchConnectorPermissionsListScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchConnectedConnectorsViewModel $connectorsViewModel;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, BRg bRg, HatchConnectedConnectorsViewModel hatchConnectedConnectorsViewModel, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$modifier = bRg;
            this.$connectorsViewModel = hatchConnectedConnectorsViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConnectorPermissionsListScreenKt.HatchConnectorPermissionsListScreen(this.$onBack, this.$modifier, this.$connectorsViewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final int rememberConnectorPermissionsCount(BFM bfm, int i) {
        return rememberConnectorPermissionEntries(null, bfm, 0, 1).connectorCount;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchConnectorPermissionsListScreen(kotlin.jvm.functions.Function0<kotlin.Unit> r45, X.BRg r46, com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel r47, X.BFM r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.view.HatchConnectorPermissionsListScreenKt.HatchConnectorPermissionsListScreen(kotlin.jvm.functions.Function0, X.BRg, com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel, X.BFM, int, int):void");
    }

    public static final void logConnectorPermissionsRowClick(String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.PERMISSIONS, HatchScreen.CONNECTORS, HatchComponent.SKILL_ROW, null, AnonymousClass007.A0c(HatchMetadataKey.PROVIDER, str), null);
    }

    public static final ConnectedConnectorsUiState rememberConnectorPermissionEntries(HatchConnectedConnectorsViewModel hatchConnectedConnectorsViewModel, BFM bfm, int i, int i2) {
        if ((i2 & 1) != 0) {
            HatchConnectedConnectorsViewModel.Factory factory = new HatchConnectedConnectorsViewModel.Factory(AnonymousClass002.A0h(bfm));
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            hatchConnectedConnectorsViewModel = (HatchConnectedConnectorsViewModel) AnonymousClass004.A14(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), HatchConnectedConnectorsViewModel.class);
        }
        C1BO c1boA02 = C2CK.A02(bfm, hatchConnectedConnectorsViewModel.uiState);
        boolean zA67 = bfm.A67(hatchConnectedConnectorsViewModel);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new HatchConnectorPermissionsListScreenKt$rememberConnectorPermissionEntries$1$1(hatchConnectedConnectorsViewModel);
            bfm.Ai0(objAaT);
        }
        C7bA.A05(bfm, null, hatchConnectedConnectorsViewModel, (G0U) objAaT, i & 14, 2);
        return (ConnectedConnectorsUiState) c1boA02.getValue();
    }

    public static final void openConnectorPermissions(AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, String str) {
        logConnectorPermissionsRowClick(str);
        AuraNavKey auraNavKeyFind = ConnectorDestinations.INSTANCE.find(abstractC3358CGz, str);
        if (auraNavKeyFind == null) {
            auraNavKeyFind = new ConnectorPermissionsScreenKey(str);
        }
        auraNavigator.navigate(auraNavKeyFind, false);
    }
}
