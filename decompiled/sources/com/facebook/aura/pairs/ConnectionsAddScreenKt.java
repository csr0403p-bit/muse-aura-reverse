package com.facebook.aura.pairs;

import X.AHD;
import X.AKQ;
import X.AVy;
import X.AXN;
import X.AbstractC07539Wl;
import X.AbstractC1754Apr;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BIj;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C07C;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C1DM;
import X.C1DP;
import X.C1EQ;
import X.C1OM;
import X.C1YY;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HxE;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.header.view.ScrimGradientKt;
import com.facebook.aura.pairs.ConnectionsUiState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyleConfig;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyles;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class ConnectionsAddScreenKt {

    /* renamed from: com.facebook.aura.pairs.ConnectionsAddScreenKt$ConnectionsAddLoaded$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConnectionsUiState.Loaded $state;
        public final /* synthetic */ ConnectionsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConnectionsUiState.Loaded loaded, ConnectionsViewModel connectionsViewModel, ConnectionsLogContext connectionsLogContext, BRg bRg, int i, int i2) {
            super(2);
            this.$state = loaded;
            this.$viewModel = connectionsViewModel;
            this.$log = connectionsLogContext;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsAddScreenKt.ConnectionsAddLoaded(this.$state, this.$viewModel, this.$log, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsAddScreenKt$ConnectionsAddScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C128162 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ C1BO<ConnectionsUiState> $uiState$delegate;
        public final /* synthetic */ ConnectionsViewModel $viewModel;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            String strA0v;
            BRg bRgThen;
            int i2;
            Function0 function0;
            BFM bfm2;
            int i3;
            C7384Etj.A0Y(c07c, 0);
            int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
                bfm.Afo();
                return;
            }
            BRg bRgAiP = c07c.AiP(BRg.A00, 1.0f, true);
            ConnectionsUiState value = this.$uiState$delegate.getValue();
            if (value instanceof ConnectionsUiState.Loaded) {
                bfm.AgE(378316272);
                ConnectionsViewModel connectionsViewModel = this.$viewModel;
                ConnectionsLogContext connectionsLogContext = this.$log;
                HatchComponent hatchComponent = HatchComponent.CONNECTIONS_SCREEN_VIEW;
                int i4 = ConnectionsLogContext.$stable;
                ConnectionsAddScreenKt.ConnectionsAddLoaded((ConnectionsUiState.Loaded) value, connectionsViewModel, connectionsLogContext, bRgAiP.then(PairsAnalyticsKt.rememberConnectionsImpression(connectionsLogContext, hatchComponent, null, null, null, null, bfm, i4 | 48, 60)), bfm, ConnectionsUiState.Loaded.$stable | (ConnectionsViewModel.$stable << 3) | (i4 << 6), 0);
            } else {
                if (C7384Etj.areEqual(value, ConnectionsUiState.Failed.INSTANCE)) {
                    bfm.AgE(378324113);
                    strA0v = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d75);
                    bRgThen = bRgAiP.then(PairsAnalyticsKt.rememberConnectionsImpression(this.$log, HatchComponent.CONNECTIONS_ERROR_STATE, null, null, null, null, bfm, ConnectionsLogContext.$stable | 48, 60));
                    boolean zA1T = AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A67(this.$log));
                    ConnectionsLogContext connectionsLogContext2 = this.$log;
                    ConnectionsViewModel connectionsViewModel2 = this.$viewModel;
                    Object objAaT = bfm.AaT();
                    if (zA1T || objAaT == C78N.A00) {
                        objAaT = new ConnectionsAddScreenKt$ConnectionsAddScreen$2$1$1(connectionsLogContext2, connectionsViewModel2);
                        bfm.Ai0(objAaT);
                    }
                    function0 = (Function0) objAaT;
                    bfm2 = bfm;
                    i3 = 0;
                    i2 = 0;
                } else if (C7384Etj.areEqual(value, ConnectionsUiState.Unavailable.INSTANCE)) {
                    bfm.AgE(378336034);
                    strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120d9e);
                    bRgThen = bRgAiP.then(PairsAnalyticsKt.rememberConnectionsImpression(this.$log, HatchComponent.CONNECTIONS_UNAVAILABLE_STATE, null, null, null, null, bfm, ConnectionsLogContext.$stable | 48, 60));
                    i2 = 4;
                    function0 = null;
                    bfm2 = bfm;
                    i3 = 0;
                } else {
                    if (!C7384Etj.areEqual(value, ConnectionsUiState.Loading.INSTANCE)) {
                        throw AnonymousClass005.A0k(bfm, 378314623);
                    }
                    bfm.AgE(378344842);
                    PairsComponentsKt.PairsLoading(bRgAiP, bfm, 0, 0);
                }
                PairsComponentsKt.PairsMessage(strA0v, bRgThen, function0, bfm2, i3, i2);
            }
            AnonymousClass001.A1D(bfm);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C128162(ConnectionsViewModel connectionsViewModel, ConnectionsLogContext connectionsLogContext, C1BO<? extends ConnectionsUiState> c1bo) {
            super(3);
            this.$viewModel = connectionsViewModel;
            this.$log = connectionsLogContext;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsAddScreenKt$ConnectionsAddScreen$3, reason: invalid class name */
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

        public final void invoke(BFM bfm, int i) {
            ConnectionsAddScreenKt.ConnectionsAddScreen(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsAddScreenKt$ConnectionsInviteLinkFooter$2, reason: invalid class name and case insensitive filesystem */
    public final class C128172 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConnectionsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128172(ConnectionsViewModel connectionsViewModel, ConnectionsLogContext connectionsLogContext, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = connectionsViewModel;
            this.$log = connectionsLogContext;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsAddScreenKt.ConnectionsInviteLinkFooter(this.$viewModel, this.$log, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: ConnectionsAddList-hGBTI10, reason: not valid java name */
    public static final void m1646ConnectionsAddListhGBTI10(ConnectionsUiState.Loaded loaded, ConnectionsViewModel connectionsViewModel, ConnectionsLogContext connectionsLogContext, float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(564418940);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(loaded, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(connectionsViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(connectionsLogContext, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A07(bfm, f);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA02 = C2CK.A02(bfm, connectionsViewModel.addSuggestionsQuery);
            C1BO c1boA022 = C2CK.A02(bfm, connectionsViewModel.addSuggestions);
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = ConnectionsAddScreenKt$ConnectionsAddList$hasTyped$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
            BRg bRgA00 = AbstractC1754Apr.A00(AnonymousClass001.A0T(bRg2));
            C1DP c1dp = new C1DP(0.0f, 0.0f, 0.0f, 16.0f + f);
            boolean zA1W = AnonymousClass002.A1W(bfm, c1boA022, ((iA05 & 896) == 256 || ((iA05 & 512) != 0 && bfm.A67(connectionsLogContext))) | AnonymousClass003.A1K(bfm, c1boA02, mutableStateA0N), (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(connectionsViewModel))) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(loaded)));
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == obj) {
                objAaT2 = new ConnectionsAddScreenKt$ConnectionsAddList$1$1(mutableStateA0N, connectionsLogContext, connectionsViewModel, c1boA02, c1boA022, loaded);
                bfm.Ai0(objAaT2);
            }
            C1YY.A01(null, null, null, c1dp, null, bfm, null, bRgA00, (G0U) objAaT2, 0, 506, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ConnectionsAddScreenKt$ConnectionsAddList$2(loaded, connectionsViewModel, connectionsLogContext, f, bRg2, i, i2);
        }
    }

    public static final void ConnectionsAddLoaded(ConnectionsUiState.Loaded loaded, ConnectionsViewModel connectionsViewModel, ConnectionsLogContext connectionsLogContext, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1823994265);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(loaded, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(connectionsViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(connectionsLogContext, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AXN axn = (AXN) bfm.A6v(Am0.A04);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, new C1DG(0.0f));
            }
            MutableState mutableState = (MutableState) objAaT;
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0T);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            float fConnectionsAddLoaded$lambda$1 = ConnectionsAddLoaded$lambda$1(mutableState);
            int i4 = ConnectionsUiState.Loaded.$stable | (iA05 & 14);
            int i5 = ConnectionsViewModel.$stable;
            int i6 = i4 | (i5 << 3) | (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            int i7 = ConnectionsLogContext.$stable;
            m1646ConnectionsAddListhGBTI10(loaded, connectionsViewModel, connectionsLogContext, fConnectionsAddLoaded$lambda$1, null, bfm, i6 | (i7 << 6) | (iA05 & 896), 16);
            BRg bRgA4C = c0z7.A4C(C2VU.A06, BRg.A00);
            boolean zA65 = bfm.A65(axn);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new ConnectionsAddScreenKt$ConnectionsAddLoaded$1$1$1(axn, mutableState);
                bfm.Ai0(objAaT2);
            }
            int i8 = iA05 >> 3;
            ConnectionsInviteLinkFooter(connectionsViewModel, connectionsLogContext, BIj.A00(bRgA4C, (G0U) objAaT2), bfm, i5 | (i8 & 14) | (i7 << 3) | (i8 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(loaded, connectionsViewModel, connectionsLogContext, bRg2, i, i2);
        }
    }

    public static final void ConnectionsAddLoaded$lambda$2(MutableState<C1DG> mutableState, float f) {
        mutableState.Af8(new C1DG(f));
    }

    public static final void ConnectionsAddScreen(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1699324848);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            ConnectionsViewModel connectionsViewModel = ConnectionsTabScreenKt.connectionsViewModel(bfm, 0);
            C1BO c1boA02 = C2CK.A02(bfm, connectionsViewModel.uiState);
            ConnectionsLogContext connectionsLogContextRememberConnectionsLogContext = PairsAnalyticsKt.rememberConnectionsLogContext(HatchScreen.CONNECTIONS_ADD, bfm, 6);
            boolean zA67 = bfm.A67(connectionsViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ConnectionsAddScreenKt$ConnectionsAddScreen$1$1(connectionsViewModel);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, connectionsViewModel);
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, AbstractC07539Wl.A00(bRg2, "connections-add"), null, new AuraBottomSheetHeaderConfig(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207dc), AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f1207db), null, null, null, AuraBottomSheetHeaderConfig.Style.LARGE_START_ALIGNED, null), null, null, null, false, false, true, null, B1V.A00(bfm, new C128162(connectionsViewModel, connectionsLogContextRememberConnectionsLogContext, c1boA02), 1792570445), bfm, 805306752, 48, 1521);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRg2, i, i2);
        }
    }

    public static final void ConnectionsInviteLinkFooter(ConnectionsViewModel connectionsViewModel, ConnectionsLogContext connectionsLogContext, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1641415692);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(connectionsViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(connectionsLogContext, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA02 = C2CK.A02(bfm, connectionsViewModel.inviteLinkDestination);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).modal;
            boolean zA64 = bfm.A64(j);
            Object objAaT = bfm.AaT();
            if (zA64 || objAaT == C78N.A00) {
                objAaT = C1EQ.A02((HxE[]) Arrays.copyOf(ScrimGradientKt.m1052scrimFadeInStopsDxMtmZc(j, 1.0f), 16), Float.POSITIVE_INFINITY);
                bfm.Ai0(objAaT);
            }
            C1EQ c1eq = (C1EQ) objAaT;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            BPg.A03(bfm, g0u);
            G0V<InterfaceC1516AkQ, BRg, Unit> g0v2 = C1515AkP.A05;
            BPg.A02(bfm, bRgA01, g0v2);
            BS0 bs0 = BRg.A00;
            BRg bRgA04 = C10G.A04(c1062ATq, 24.0f);
            C1DM c1dm = C1OM.A00;
            C01N.A07(bfm, C1b8.A02(bRgA04, c1eq, c1dm));
            AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
            BRg bRgA0C = C3U4.A0C(C1b8.A03(c1062ATq, c1dm, j), 20.0f, 4.0f, 16.0f, 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 12.0f);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0V, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0v2);
            BRg bRgAiP = C90m.A00.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, c3th, 2.0f, 6);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0v2);
            boolean z = true;
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207f0), null, C3cH.A06(bfm, auraTheme), C60Q.A0D(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207ef), null, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.arrow_share_wght400_outline_24, 0);
            AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.LARGE;
            AuraIconButtonStyleConfig auraIconButtonStyleConfigFlat = AuraIconButtonStyles.INSTANCE.flat(bfm, 6);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12055a);
            boolean zA1Y = AnonymousClass002.A1Y(c1boA02.getValue());
            boolean z2 = (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(connectionsLogContext));
            if ((iA05 & 14) != 4 && ((iA05 & 8) == 0 || !bfm.A67(connectionsViewModel))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objAaT2 = bfm.AaT();
            if (z3 || objAaT2 == C78N.A00) {
                objAaT2 = new ConnectionsAddScreenKt$ConnectionsInviteLinkFooter$1$1$2$1(connectionsLogContext, connectionsViewModel);
                bfm.Ai0(objAaT2);
            }
            AuraIconButtonKt.m2551AuraIconButtonV2X32rcYo(null, aVyA00, auraIconButtonSizeV2, auraIconButtonStyleConfigFlat, strA01, (Function0) objAaT2, null, zA1Y, null, null, null, null, "connections-invite-link-share", bfm, AnonymousClass001.A03(), 384, 3905);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128172(connectionsViewModel, connectionsLogContext, bRg2, i, i2);
        }
    }

    public static final float ConnectionsAddLoaded$lambda$1(MutableState<C1DG> mutableState) {
        return mutableState.getValue().A00;
    }

    public static final /* synthetic */ AHD access$ConnectionsAddList_hGBTI10$lambda$1(C1BO c1bo) {
        return (AHD) c1bo.getValue();
    }

    public static final /* synthetic */ ConnectionsUiState access$ConnectionsAddScreen$lambda$0(C1BO c1bo) {
        return (ConnectionsUiState) c1bo.getValue();
    }
}
