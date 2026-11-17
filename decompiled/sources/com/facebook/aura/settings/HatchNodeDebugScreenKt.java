package com.facebook.aura.settings;

import X.AGI;
import X.AHD;
import X.AKH;
import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BPg;
import X.BQG;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C0953AJg;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C14P;
import X.C1515AkP;
import X.C1736ApY;
import X.C1822Arm;
import X.C1AC;
import X.C1BO;
import X.C1DG;
import X.C1YL;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C78N;
import X.C90l;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC04981Yd;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.json.NodeListEntry;
import com.facebook.aura.nodes.registry.NodeRegistrationInfo;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.header.AuraSectionHeaderKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchNodeDebugScreenKt {
    public static final long NodeConnectedColor;
    public static final long NodeDisconnectedColor;

    /* renamed from: com.facebook.aura.settings.HatchNodeDebugScreenKt$CommandsSection$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ BO6<NodeCommandId, NodeCommandSpec> $commands;
        public final /* synthetic */ C07C $this_CommandsSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C07C c07c, BO6<NodeCommandId, NodeCommandSpec> bo6, int i) {
            super(2);
            this.$this_CommandsSection = c07c;
            this.$commands = bo6;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchNodeDebugScreenKt.CommandsSection(this.$this_CommandsSection, this.$commands, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchNodeDebugScreenKt$HatchNodeDebugScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C135532 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isConnected;
        public final /* synthetic */ C1BO<HatchNodeDebugUiState> $uiState$delegate;
        public final /* synthetic */ HatchNodeDebugViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135532(boolean z, HatchNodeDebugViewModel hatchNodeDebugViewModel, C1BO<HatchNodeDebugUiState> c1bo) {
            super(4);
            this.$isConnected = z;
            this.$viewModel = hatchNodeDebugViewModel;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1955invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1955invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            boolean z = this.$isConnected;
            HatchNodeDebugViewModel hatchNodeDebugViewModel = this.$viewModel;
            C1BO<HatchNodeDebugUiState> c1bo = this.$uiState$delegate;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0c, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgA0T = AnonymousClass005.A0T(bfm, c1062ATq);
            AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
            BRg bRgA0C = C3U4.A0C(bRgA0T, C06G.A01(bfm, akh), 0.0f, C06G.A01(bfm, akh), C06G.A01(bfm, akh));
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, C2VU.A02, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C90l c90l = C90l.A00;
            C01N.A08(bfm, bs0, f);
            long j2 = HatchNodeDebugScreenKt.NodeConnectedColor;
            HatchNodeDebugScreenKt.NodeStatusSection(c90l, c1bo.getValue(), bfm, (HatchNodeDebugUiState.$stable << 3) | 6);
            float f3 = AuraDimensKt.SpacingMedium;
            C01N.A08(bfm, bs0, f3);
            NodeRegistrationInfo nodeRegistrationInfo = c1bo.getValue().registrationInfo;
            if (nodeRegistrationInfo != null) {
                bfm.AgE(-93781884);
                HatchNodeDebugScreenKt.RegistrationDataSection(c90l, nodeRegistrationInfo, bfm, 6);
                C01N.A08(bfm, bs0, f3);
                HatchNodeDebugScreenKt.CommandsSection(c90l, AGI.A08(c1bo.getValue().allCommandSpecs), bfm, 6);
                C01N.A08(bfm, bs0, f3);
            } else {
                bfm.AgE(-93557010);
            }
            BBI.A0R(bbi, false);
            AHD ahdA07 = AGI.A07(c1bo.getValue().remoteNodes);
            String str = nodeRegistrationInfo != null ? nodeRegistrationInfo.nodeId : null;
            boolean z2 = c1bo.getValue().isLoadingRemoteNodes;
            boolean zA67 = bfm.A67(hatchNodeDebugViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchNodeDebugScreenKt$HatchNodeDebugScreen$2$1$1$1$1(hatchNodeDebugViewModel);
                bfm.Ai0(objAaT);
            }
            HatchNodeDebugScreenKt.RemoteNodesSection(c90l, ahdA07, str, z2, (Function0) objAaT, bfm, 6);
            if (c1bo.getValue().isRegistered) {
                bfm.AgE(-93260557);
                C01N.A08(bfm, bs0, f3);
                boolean zA672 = bfm.A67(hatchNodeDebugViewModel);
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchNodeDebugScreenKt$HatchNodeDebugScreen$2$1$1$2$1(hatchNodeDebugViewModel);
                    bfm.Ai0(objAaT2);
                }
                HatchNodeDebugScreenKt.UnpairSection(c90l, (Function0) objAaT2, bfm, 6);
            } else {
                bfm.AgE(-93142354);
            }
            BBI.A0R(bbi, false);
            C01N.A04(bfm, bbi, bs0, f2, true);
            if (z) {
                bfm.AgE(-436699964);
            } else {
                bfm.AgE(-437439934);
                AKH<AuraColors> akh2 = AuraColorsKt.LocalAuraColors;
                BRg bRgA00 = C1b8.A00(c1062ATq, 0.85f, C06G.A0K(bfm, akh2));
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA00);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
                BPg.A02(bfm, akqA043, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA013, g0vA0u);
                C3TH c3th = C2VU.A00;
                BRg bRgA0B = C3U4.A0B(bs0, 32.0f, 0.0f);
                InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
                int iA0D3 = AnonymousClass001.A0D(bbi);
                AKQ akqA044 = BBI.A04(bbi);
                BRg bRgA014 = AxM.A01(bfm, bRgA0B);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA002, g0v);
                BPg.A02(bfm, akqA044, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
                BPg.A02(bfm, bRgA014, g0vA0u);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d0e), null, 0L, null, null, C1736ApY.A01, null, false, 0, 0, 0, null, null, null, bfm, 196608, 0, 16350);
                C01N.A08(bfm, bs0, 8.0f);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d0f), null, C06G.A0I(bfm, akh2), null, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16378);
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, true);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchNodeDebugScreenKt$HatchNodeDebugScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ HatchNodeDebugViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Function0<Unit> function0, BRg bRg, HatchNodeDebugViewModel hatchNodeDebugViewModel, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$modifier = bRg;
            this.$viewModel = hatchNodeDebugViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchNodeDebugScreenKt.HatchNodeDebugScreen(this.$onBack, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchNodeDebugScreenKt$InfoRow$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $label;
        public final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, int i) {
            super(2);
            this.$label = str;
            this.$value = str2;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchNodeDebugScreenKt.InfoRow(this.$label, this.$value, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchNodeDebugScreenKt$NodeStatusSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C135542 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ C07C $this_NodeStatusSection;
        public final /* synthetic */ HatchNodeDebugUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135542(C07C c07c, HatchNodeDebugUiState hatchNodeDebugUiState, int i) {
            super(2);
            this.$this_NodeStatusSection = c07c;
            this.$uiState = hatchNodeDebugUiState;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchNodeDebugScreenKt.NodeStatusSection(this.$this_NodeStatusSection, this.$uiState, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchNodeDebugScreenKt$RegistrationDataSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C135552 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ NodeRegistrationInfo $regInfo;
        public final /* synthetic */ C07C $this_RegistrationDataSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135552(C07C c07c, NodeRegistrationInfo nodeRegistrationInfo, int i) {
            super(2);
            this.$this_RegistrationDataSection = c07c;
            this.$regInfo = nodeRegistrationInfo;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchNodeDebugScreenKt.RegistrationDataSection(this.$this_RegistrationDataSection, this.$regInfo, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchNodeDebugScreenKt$RemoteNodesSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C135562 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ String $localNodeId;
        public final /* synthetic */ Function0<Unit> $onRefresh;
        public final /* synthetic */ AHD<NodeListEntry> $remoteNodes;
        public final /* synthetic */ C07C $this_RemoteNodesSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135562(C07C c07c, AHD<NodeListEntry> ahd, String str, boolean z, Function0<Unit> function0, int i) {
            super(2);
            this.$this_RemoteNodesSection = c07c;
            this.$remoteNodes = ahd;
            this.$localNodeId = str;
            this.$isLoading = z;
            this.$onRefresh = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchNodeDebugScreenKt.RemoteNodesSection(this.$this_RemoteNodesSection, this.$remoteNodes, this.$localNodeId, this.$isLoading, this.$onRefresh, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchNodeDebugScreenKt$UnpairSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C135572 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onUnpair;
        public final /* synthetic */ C07C $this_UnpairSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135572(C07C c07c, Function0<Unit> function0, int i) {
            super(2);
            this.$this_UnpairSection = c07c;
            this.$onUnpair = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchNodeDebugScreenKt.UnpairSection(this.$this_UnpairSection, this.$onUnpair, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchNodeDebugScreen(kotlin.jvm.functions.Function0<kotlin.Unit> r45, X.BRg r46, com.facebook.aura.settings.HatchNodeDebugViewModel r47, X.BFM r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchNodeDebugScreenKt.HatchNodeDebugScreen(kotlin.jvm.functions.Function0, X.BRg, com.facebook.aura.settings.HatchNodeDebugViewModel, X.BFM, int, int):void");
    }

    public static final void CommandsSection(C07C c07c, BO6<NodeCommandId, NodeCommandSpec> bo6, BFM bfm, int i) {
        bfm.AgG(2051619295);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, bo6);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            G0V g0vA0j = AnonymousClass007.A0j(bfm, R.string._name_removed__res_0x7f120d06);
            boolean zA67 = bfm.A67(bo6);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchNodeDebugScreenKt$CommandsSection$1$1(bo6);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, g0vA0j, 0L, (G0U) objAaT, bfm, iA0d & 14, 7);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(c07c, bo6, i);
        }
    }

    public static final void InfoRow(String str, String str2, BFM bfm, int i) {
        bfm.AgG(-476765120);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            AuraCardType.None none = AuraCardType.None.INSTANCE;
            C1062ATq c1062ATq = C10G.A02;
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            ApQ apQA0X = AnonymousClass005.A0X(str2);
            C0953AJg c0953AJgA00 = C0953AJg.A00();
            long j = B6A.A07;
            AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, new AuraCardContent(str, (AuraIconAndHeadlineStyle) null, (BO6<String, C14P>) c0953AJgA00, (B6A) null, apQA0X, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, true, true, (String) null, (C1822Arm) null, j, j, (C1YL) null), none, null, null, null, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 3078, 0, 262128);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, str2, i);
        }
    }

    public static final void NodeStatusSection(C07C c07c, HatchNodeDebugUiState hatchNodeDebugUiState, BFM bfm, int i) {
        int i2;
        bfm.AgG(-1923749301);
        int iA06 = (i & 48) == 0 ? AnonymousClass002.A06(AnonymousClass004.A1Y(hatchNodeDebugUiState, bfm, i) ? 1 : 0) | i : i;
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA06 & 17, 16), bfm, iA06)) {
            boolean z2 = hatchNodeDebugUiState.connectionState instanceof HatchGatewayConnectionState.Connected;
            boolean z3 = hatchNodeDebugUiState.isRegistered;
            long j = z3 ? NodeConnectedColor : NodeDisconnectedColor;
            if (z2 && z3) {
                bfm.AgE(-1887129564);
                i2 = R.string._name_removed__res_0x7f120d18;
            } else {
                z = false;
                if (z2) {
                    bfm.AgE(-1887126958);
                    i2 = R.string._name_removed__res_0x7f120d16;
                } else {
                    bfm.AgE(-1887124154);
                    i2 = R.string._name_removed__res_0x7f120d17;
                }
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i2);
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            String str = z ? "node-status-registered" : z2 ? "node-status-connected-not-registered" : "node-status-disconnected";
            AuraSectionHeaderKt.AuraSectionHeader(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d0d), null, null, bfm, 48, 4);
            C1AC c1ac = C2VU.A04;
            InterfaceC04981Yd interfaceC04981Yd = AcQ.A01;
            BS0 bs0 = BRg.A00;
            BRg bRgA00 = AbstractC07539Wl.A00(C3U4.A03(bs0, 8.0f), str);
            InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(interfaceC04981Yd, bfm, c1ac);
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0b, akqA04, bRgA01, iA0J);
            C1b8.A04(bfm, C11U.A02(bs0, 8.0f), j);
            C01N.A09(bfm, bs0, AuraDimensKt.SpacingXsmall);
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, C06G.A08(bfm), null, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16378);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135542(c07c, hatchNodeDebugUiState, i);
        }
    }

    public static final void RegistrationDataSection(C07C c07c, NodeRegistrationInfo nodeRegistrationInfo, BFM bfm, int i) {
        bfm.AgG(-1971433355);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, nodeRegistrationInfo);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            G0V g0vA0j = AnonymousClass007.A0j(bfm, R.string._name_removed__res_0x7f120d12);
            boolean zA67 = bfm.A67(nodeRegistrationInfo);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchNodeDebugScreenKt$RegistrationDataSection$1$1(nodeRegistrationInfo);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, g0vA0j, 0L, (G0U) objAaT, bfm, iA0d & 14, 7);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135552(c07c, nodeRegistrationInfo, i);
        }
    }

    public static final void RemoteNodesSection(C07C c07c, AHD<NodeListEntry> ahd, String str, boolean z, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(295779533);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, ahd);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            G0V g0vA0j = AnonymousClass007.A0j(bfm, R.string._name_removed__res_0x7f120d13);
            boolean zA67 = bfm.A67(ahd) | AnonymousClass003.A1E(iA0d) | AnonymousClass003.A1D(iA0d) | ((57344 & iA0d) == 16384);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchNodeDebugScreenKt$RemoteNodesSection$1$1(ahd, z, str, function0);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, g0vA0j, 0L, (G0U) objAaT, bfm, iA0d & 14, 7);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135562(c07c, ahd, str, z, function0, i);
        }
    }

    public static final void UnpairSection(C07C c07c, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(-1827859042);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            G0V g0vA0j = AnonymousClass007.A0j(bfm, R.string._name_removed__res_0x7f120d04);
            boolean zA1N = AnonymousClass001.A1N(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1N || objAaT == C78N.A00) {
                objAaT = new HatchNodeDebugScreenKt$UnpairSection$1$1(function0);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, g0vA0j, 0L, (G0U) objAaT, bfm, iA0d & 14, 7);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135572(c07c, function0, i);
        }
    }

    public static final /* synthetic */ HatchNodeDebugUiState access$HatchNodeDebugScreen$lambda$0(C1BO c1bo) {
        return (HatchNodeDebugUiState) c1bo.getValue();
    }

    public static final String truncateNodeId(String str) {
        return str.length() > 12 ? FGI.A0M(BQG.A17(str, 8), "...") : str;
    }

    static {
        long j = B6A.A01;
        NodeConnectedColor = 4280078671L << 32;
        NodeDisconnectedColor = 4287532691L << 32;
    }
}
