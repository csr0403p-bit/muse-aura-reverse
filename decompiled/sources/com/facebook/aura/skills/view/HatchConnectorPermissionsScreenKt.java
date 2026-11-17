package com.facebook.aura.skills.view;

import X.AHD;
import X.AKH;
import X.AKQ;
import X.AbstractC0885AGm;
import X.AbstractC1103AYp;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
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
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BPg;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C60Q;
import X.C60R;
import X.C78N;
import X.C7BY;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.ConnectorPermission;
import com.facebook.aura.agentpermission.ConnectorPermissionGroup;
import com.facebook.aura.agentpermission.ConnectorPermissionMethod;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import com.facebook.aura.agentpermission.LocalDeviceConnector;
import com.facebook.aura.agentpermission.LocalDeviceConnectorKt;
import com.facebook.aura.agentpermission.PhoneNotificationsAccessControlsKt;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.connect.ConnectorScopeAccessRequesterKt;
import com.facebook.aura.skills.viewmodel.SkillPermissionGroupUiModel;
import com.facebook.aura.skills.viewmodel.SkillPermissionMethodUiModel;
import com.facebook.aura.skills.viewmodel.SkillPermissionSectionUiModel;
import com.facebook.aura.skills.viewmodel.SkillPermissionsLoadingState;
import com.facebook.aura.skills.viewmodel.SkillPermissionsUiState;
import com.facebook.aura.skills.viewmodel.SkillPermissionsViewModel;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchConnectorPermissionsScreenKt {

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorPermissionsScreenKt$HatchConnectorPermissionsScreen$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ LocalDeviceConnector $localConnector;
        public final /* synthetic */ MutableState<Integer> $localConnectorRefreshNonce$delegate;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(LocalDeviceConnector localDeviceConnector, String str, AbstractC3358CGz abstractC3358CGz, MutableState<Integer> mutableState) {
            super(4);
            this.$localConnector = localDeviceConnector;
            this.$connectorId = str;
            this.$userSession = abstractC3358CGz;
            this.$localConnectorRefreshNonce$delegate = mutableState;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m2154invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m2154invokei1RSzL4(float f, float f2, BFM bfm, int i) {
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
            AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
            BRg bRgA07 = C3U4.A07(c1062ATq, C06G.A01(bfm, akh));
            LocalDeviceConnector localDeviceConnector = this.$localConnector;
            String str = this.$connectorId;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            MutableState<Integer> mutableState = this.$localConnectorRefreshNonce$delegate;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90l c90l = C90l.A00;
            BRg bRgA02 = AbstractC1103AYp.A02(AbstractC1103AYp.A00(0, bfm, 0, 1), c90l.AiP(bs0, 1.0f, true), true);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA02);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            C01N.A0B(bfm, bs0, bRgA012, g0vA0u, f);
            if (localDeviceConnector != null) {
                bfm.AgE(936415567);
                boolean zA1J = AnonymousClass003.A1J(bfm, str, abstractC3358CGz);
                Object objAaT = bfm.AaT();
                if (zA1J || objAaT == C78N.A00) {
                    objAaT = new HatchConnectorPermissionsScreenKt$HatchConnectorPermissionsScreen$4$1$1$1$1(str, abstractC3358CGz, mutableState);
                    bfm.Ai0(objAaT);
                }
                HatchConnectorPermissionsScreenKt.LocalConnectorPermissionsContent(c90l, localDeviceConnector, (G2j) objAaT, bfm, 6);
            } else {
                bfm.AgE(936793736);
                HatchConnectorPermissionsScreenKt.SkillPermissionsContent(c90l, str, bfm, 6);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
            if (localDeviceConnector != null) {
                bfm.AgE(673980253);
                if (LocalDeviceConnectorKt.shouldShowHitlControls(localDeviceConnector)) {
                    bfm.AgE(674032860);
                    boolean zA1J2 = AnonymousClass003.A1J(bfm, str, abstractC3358CGz);
                    Object objAaT2 = bfm.AaT();
                    if (zA1J2 || objAaT2 == C78N.A00) {
                        objAaT2 = new HatchConnectorPermissionsScreenKt$HatchConnectorPermissionsScreen$4$1$2$1(str, abstractC3358CGz, mutableState);
                        bfm.Ai0(objAaT2);
                    }
                    HatchConnectorPermissionsScreenKt.ResetToDefaultsButton((Function0) objAaT2, null, false, false, bfm, 0, 14);
                } else {
                    bfm.AgE(674288486);
                }
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(674304606);
                HatchConnectorPermissionsScreenKt.SkillPermissionsResetFooter(str, bfm, 0);
            }
            BBI.A0R(bbi, false);
            C01N.A04(bfm, bbi, bs0, f2 + C06G.A01(bfm, akh), true);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorPermissionsScreenKt$HatchConnectorPermissionsScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$connectorId = str;
            this.$onBack = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConnectorPermissionsScreenKt.HatchConnectorPermissionsScreen(this.$connectorId, this.$onBack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorPermissionsScreenKt$LocalConnectorPermissionsContent$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ LocalDeviceConnector $localConnector;
        public final /* synthetic */ G2j<ConnectorPermission, ConnectorPermissionGroup, ConnectorPermissionMethod, ConnectorPermissionMode, Unit> $onMethodModeSelected;
        public final /* synthetic */ C07C $this_LocalConnectorPermissionsContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C07C c07c, LocalDeviceConnector localDeviceConnector, G2j<? super ConnectorPermission, ? super ConnectorPermissionGroup, ? super ConnectorPermissionMethod, ? super ConnectorPermissionMode, Unit> g2j, int i) {
            super(2);
            this.$this_LocalConnectorPermissionsContent = c07c;
            this.$localConnector = localDeviceConnector;
            this.$onMethodModeSelected = g2j;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConnectorPermissionsScreenKt.LocalConnectorPermissionsContent(this.$this_LocalConnectorPermissionsContent, this.$localConnector, this.$onMethodModeSelected, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorPermissionsScreenKt$LocalConnectorPermissionsContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ LocalDeviceConnector $localConnector;
        public final /* synthetic */ G2j<ConnectorPermission, ConnectorPermissionGroup, ConnectorPermissionMethod, ConnectorPermissionMode, Unit> $onMethodModeSelected;
        public final /* synthetic */ C07C $this_LocalConnectorPermissionsContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(C07C c07c, LocalDeviceConnector localDeviceConnector, G2j<? super ConnectorPermission, ? super ConnectorPermissionGroup, ? super ConnectorPermissionMethod, ? super ConnectorPermissionMode, Unit> g2j, int i) {
            super(2);
            this.$this_LocalConnectorPermissionsContent = c07c;
            this.$localConnector = localDeviceConnector;
            this.$onMethodModeSelected = g2j;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConnectorPermissionsScreenKt.LocalConnectorPermissionsContent(this.$this_LocalConnectorPermissionsContent, this.$localConnector, this.$onMethodModeSelected, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorPermissionsScreenKt$LocalConnectorPermissionsContent$4, reason: invalid class name and case insensitive filesystem */
    public final class C138494 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ LocalDeviceConnector $localConnector;
        public final /* synthetic */ G2j<ConnectorPermission, ConnectorPermissionGroup, ConnectorPermissionMethod, ConnectorPermissionMode, Unit> $onMethodModeSelected;
        public final /* synthetic */ C07C $this_LocalConnectorPermissionsContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C138494(C07C c07c, LocalDeviceConnector localDeviceConnector, G2j<? super ConnectorPermission, ? super ConnectorPermissionGroup, ? super ConnectorPermissionMethod, ? super ConnectorPermissionMode, Unit> g2j, int i) {
            super(2);
            this.$this_LocalConnectorPermissionsContent = c07c;
            this.$localConnector = localDeviceConnector;
            this.$onMethodModeSelected = g2j;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConnectorPermissionsScreenKt.LocalConnectorPermissionsContent(this.$this_LocalConnectorPermissionsContent, this.$localConnector, this.$onMethodModeSelected, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorPermissionsScreenKt$ResetToDefaultsButton$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C138502 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138502(Function0<Unit> function0, BRg bRg, boolean z, boolean z2, int i, int i2) {
            super(2);
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$enabled = z;
            this.$loading = z2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConnectorPermissionsScreenKt.ResetToDefaultsButton(this.$onClick, this.$modifier, this.$enabled, this.$loading, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorPermissionsScreenKt$SkillPermissionGroups$2, reason: invalid class name and case insensitive filesystem */
    public final class C138512 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ G0U<SkillPermissionMethodUiModel, Unit> $onAdditionalAccessRequested;
        public final /* synthetic */ G0V<SkillPermissionMethodUiModel, ConnectorPermissionMode, Unit> $onMethodModeSelected;
        public final /* synthetic */ C07C $this_SkillPermissionGroups;
        public final /* synthetic */ SkillPermissionsUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C138512(C07C c07c, String str, SkillPermissionsUiState skillPermissionsUiState, G0U<? super SkillPermissionMethodUiModel, Unit> g0u, G0V<? super SkillPermissionMethodUiModel, ? super ConnectorPermissionMode, Unit> g0v, int i) {
            super(2);
            this.$this_SkillPermissionGroups = c07c;
            this.$connectorId = str;
            this.$uiState = skillPermissionsUiState;
            this.$onAdditionalAccessRequested = g0u;
            this.$onMethodModeSelected = g0v;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConnectorPermissionsScreenKt.SkillPermissionGroups(this.$this_SkillPermissionGroups, this.$connectorId, this.$uiState, this.$onAdditionalAccessRequested, this.$onMethodModeSelected, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorPermissionsScreenKt$SkillPermissionsContent$4, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C138524 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ C07C $this_SkillPermissionsContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138524(C07C c07c, String str, int i) {
            super(2);
            this.$this_SkillPermissionsContent = c07c;
            this.$connectorId = str;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConnectorPermissionsScreenKt.SkillPermissionsContent(this.$this_SkillPermissionsContent, this.$connectorId, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorPermissionsScreenKt$SkillPermissionsResetFooter$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C138531 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $connectorId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138531(String str, int i) {
            super(2);
            this.$connectorId = str;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConnectorPermissionsScreenKt.SkillPermissionsResetFooter(this.$connectorId, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchConnectorPermissionsScreenKt$SkillPermissionsResetFooter$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $connectorId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, int i) {
            super(2);
            this.$connectorId = str;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConnectorPermissionsScreenKt.SkillPermissionsResetFooter(this.$connectorId, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchConnectorPermissionsScreen(java.lang.String r49, kotlin.jvm.functions.Function0<kotlin.Unit> r50, X.BRg r51, X.BFM r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.view.HatchConnectorPermissionsScreenKt.HatchConnectorPermissionsScreen(java.lang.String, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final void ResetToDefaultsButton(Function0<Unit> function0, BRg bRg, boolean z, boolean z2, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1Q = z;
        boolean zA1K = z2;
        bfm.AgG(1801064617);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, zA1Q);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0q(bfm, zA1K);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            zA1Q = C60Q.A1Q(i4, zA1Q);
            zA1K = C3cG.A1K(i5, zA1K);
            long j = C3cH.A0W(bfm).destructiveText;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120134);
            BRg bRgA04 = C10G.A04(C3U4.A04(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingMedium), 52.0f);
            AuraLabelButtonStyle auraLabelButtonStyleA0g = AnonymousClass006.A0g(bfm);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            boolean zA64 = bfm.A64(j);
            Object objAaT = bfm.AaT();
            if (zA64 || objAaT == C78N.A00) {
                objAaT = new HatchConnectorPermissionsScreenKt$ResetToDefaultsButton$1$1(j);
                bfm.Ai0(objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA04, auraLabelButtonStyleA0g, auraButtonSize, null, false, false, zA1Q, zA1K, false, null, null, function0, null, null, (Function0) objAaT, null, null, null, null, null, false, 1, false, 0, bfm, ((iA0T << 21) & 1879048192) | 196608, AnonymousClass001.A0B(iA0T << 12, (iA0T >> 9) & 14), RuntimeInternals.IOPRIO_BACKGROUND, 117291461);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138502(function0, bRg2, zA1Q, zA1K, i, i2);
        }
    }

    public static final boolean hasNoMethods(SkillPermissionsUiState skillPermissionsUiState) {
        AHD<SkillPermissionSectionUiModel> ahd = skillPermissionsUiState.sections;
        if (!(ahd instanceof Collection) || !ahd.isEmpty()) {
            Iterator it = ahd.iterator();
            while (it.hasNext()) {
                AHD<SkillPermissionGroupUiModel> ahd2 = ((SkillPermissionSectionUiModel) it.next()).groups;
                if (!(ahd2 instanceof Collection) || !ahd2.isEmpty()) {
                    Iterator it2 = ahd2.iterator();
                    while (it2.hasNext()) {
                        if (!((SkillPermissionGroupUiModel) it2.next()).methods.isEmpty()) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static final void logPermissionModeSelected(String str, String str2, ConnectorPermissionMode connectorPermissionMode) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.PERMISSIONS, HatchScreen.MANAGE_APPROVALS, HatchComponent.PERMISSION_ROW, str2, AnonymousClass007.A0d(HatchMetadataKey.PROVIDER.getValue(), str, C3cG.A0r(HatchMetadataKey.PERMISSION_MODE.getValue(), connectorPermissionMode.getWireValue())), null);
    }

    public static final void logPermissionsReset(String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.PERMISSIONS, HatchScreen.MANAGE_APPROVALS, HatchComponent.RESET_DEFAULTS_BUTTON, null, AnonymousClass007.A0c(HatchMetadataKey.PROVIDER, str), null);
    }

    public static final void LocalConnectorPermissionsContent(C07C c07c, LocalDeviceConnector localDeviceConnector, G2j<? super ConnectorPermission, ? super ConnectorPermissionGroup, ? super ConnectorPermissionMethod, ? super ConnectorPermissionMode, Unit> g2j, BFM bfm, int i) {
        BBb bBbAAc;
        Object c138494;
        bfm.AgG(-1426124987);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, localDeviceConnector);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g2j);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (LocalDeviceConnectorKt.shouldShowNotificationAccessControls(localDeviceConnector)) {
                bfm.AgE(127362150);
                PhoneNotificationsAccessControlsKt.PhoneNotificationsAccessControls(c07c, bfm, iA0d & 14);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc == null) {
                    return;
                } else {
                    c138494 = new AnonymousClass1(c07c, localDeviceConnector, g2j, i);
                }
            } else {
                BBI bbiA0M = AnonymousClass002.A0M(bfm, 127415005);
                if (LocalDeviceConnectorKt.shouldShowHitlControls(localDeviceConnector)) {
                    bfm.AgE(127566781);
                    BBI.A0R(bbiA0M, false);
                    boolean zA65 = bfm.A65(localDeviceConnector.connectorId);
                    Object objAaT = bfm.AaT();
                    if (zA65 || objAaT == C78N.A00) {
                        objAaT = AnonymousClass004.A11(bfm, null);
                    }
                    MutableState mutableState = (MutableState) objAaT;
                    boolean zA652 = bfm.A65(localDeviceConnector.connectorId);
                    Object objAaT2 = bfm.AaT();
                    if (zA652 || objAaT2 == C78N.A00) {
                        objAaT2 = AnonymousClass004.A11(bfm, null);
                    }
                    MutableState mutableState2 = (MutableState) objAaT2;
                    boolean zA1K = AnonymousClass003.A1K(bfm, mutableState, mutableState2);
                    Object objAaT3 = bfm.AaT();
                    if (zA1K || objAaT3 == C78N.A00) {
                        objAaT3 = new HatchConnectorPermissionsScreenKt$LocalConnectorPermissionsContent$dismissMenu$1$1(mutableState, mutableState2);
                        bfm.Ai0(objAaT3);
                    }
                    Function0 function0 = (Function0) objAaT3;
                    int i2 = 0;
                    for (ConnectorPermissionGroup connectorPermissionGroup : localDeviceConnector.connectorPermission.groups) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC0885AGm.A14();
                            throw F60.createAndThrow();
                        }
                        ConnectorPermissionGroup connectorPermissionGroup2 = connectorPermissionGroup;
                        if (i2 > 0) {
                            C01N.A06(bfm, C3cG.A09(bfm, -1852611043));
                        } else {
                            bfm.AgE(-1852561071);
                        }
                        BBI.A0R(bbiA0M, false);
                        ConnectorPermission connectorPermission = localDeviceConnector.connectorPermission;
                        String strA05 = MutableState.A05(mutableState);
                        String strA052 = MutableState.A05(mutableState2);
                        boolean zA1R = AnonymousClass005.A1R(bfm, mutableState, mutableState2, function0);
                        Object objAaT4 = bfm.AaT();
                        if (zA1R || objAaT4 == C78N.A00) {
                            objAaT4 = new HatchConnectorPermissionsScreenKt$LocalConnectorPermissionsContent$3$1$1(function0, mutableState, mutableState2);
                            bfm.Ai0(objAaT4);
                        }
                        ConnectorPermissionSectionsKt.ConnectorPermissionGroupSection(c07c, connectorPermission, connectorPermissionGroup2, strA05, strA052, (G0V) objAaT4, function0, g2j, bfm, AnonymousClass001.A0C(iA0d << 15, (iA0d & 14) | (ConnectorPermission.$stable << 3) | (ConnectorPermissionGroup.$stable << 6)));
                        i2 = i3;
                    }
                } else {
                    C60R.A11(bfm, 127466837);
                    bBbAAc = AnonymousClass001.A0L(bfm, bbiA0M);
                    if (bBbAAc == null) {
                        return;
                    } else {
                        c138494 = new AnonymousClass2(c07c, localDeviceConnector, g2j, i);
                    }
                }
            }
            C3cG.A1D(bBbAAc, c138494);
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c138494 = new C138494(c07c, localDeviceConnector, g2j, i);
            C3cG.A1D(bBbAAc, c138494);
        }
    }

    public static final void SkillPermissionGroups(C07C c07c, String str, SkillPermissionsUiState skillPermissionsUiState, G0U<? super SkillPermissionMethodUiModel, Unit> g0u, G0V<? super SkillPermissionMethodUiModel, ? super ConnectorPermissionMode, Unit> g0v, BFM bfm, int i) {
        bfm.AgG(-251877544);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, skillPermissionsUiState);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            boolean zA1C = AnonymousClass003.A1C(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT;
            boolean z = false;
            for (SkillPermissionSectionUiModel skillPermissionSectionUiModel : skillPermissionsUiState.sections) {
                bfm.AgE(-1536136289);
                for (SkillPermissionGroupUiModel skillPermissionGroupUiModel : skillPermissionSectionUiModel.groups) {
                    if (skillPermissionGroupUiModel.methods.isEmpty()) {
                        AnonymousClass003.A0l(bfm, 1434490290);
                    } else {
                        bfm.AgE(1433713802);
                        if (z) {
                            C01N.A06(bfm, C3cG.A09(bfm, 1433722358));
                        } else {
                            bfm.AgE(1433780018);
                        }
                        BBI bbiA07 = C3cG.A07(bfm);
                        bfm.AgE(-230839766);
                        String strA01 = skillPermissionGroupUiModel.label;
                        if (C7BY.A0j(strA01)) {
                            strA01 = skillPermissionSectionUiModel.label;
                            if (strA01 == null) {
                                bfm.AgE(-659876337);
                                strA01 = AbstractC2271BQs.A01(bfm, R.string.device_details_manage_permissions_header);
                            } else {
                                bfm.AgE(-659877546);
                            }
                            BBI.A0R(bbiA07, false);
                        }
                        BBI.A0R(bbiA07, false);
                        String strA05 = MutableState.A05(mutableState);
                        boolean zA65 = bfm.A65(mutableState);
                        Object objAaT2 = bfm.AaT();
                        if (zA65 || objAaT2 == C78N.A00) {
                            objAaT2 = new HatchConnectorPermissionsScreenKt$SkillPermissionGroups$1$1$2$1(mutableState);
                            bfm.Ai0(objAaT2);
                        }
                        G0U g0u2 = (G0U) objAaT2;
                        boolean zA652 = bfm.A65(mutableState);
                        Object objAaT3 = bfm.AaT();
                        if (zA652 || objAaT3 == C78N.A00) {
                            objAaT3 = new HatchConnectorPermissionsScreenKt$SkillPermissionGroups$1$1$3$1(mutableState);
                            bfm.Ai0(objAaT3);
                        }
                        int i2 = iA0d << 12;
                        ConnectorPermissionSectionsKt.SkillPermissionGroupSection(c07c, strA01, skillPermissionGroupUiModel, skillPermissionsUiState, strA05, g0u2, (Function0) objAaT3, g0u, g0v, bfm, AnonymousClass001.A0C(i2, (iA0d & 14) | ((iA0d << 3) & 7168)) | (i2 & 234881024));
                        BBI.A0R(bbiA07, false);
                        z = true;
                    }
                }
                AnonymousClass001.A1D(bfm);
            }
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138512(c07c, str, skillPermissionsUiState, g0u, g0v, i);
        }
    }

    public static final void SkillPermissionsContent(C07C c07c, String str, BFM bfm, int i) {
        bfm.AgG(-853399037);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            G0U<String, Unit> g0uRememberConnectorScopeAccessRequester = ConnectorScopeAccessRequesterKt.rememberConnectorScopeAccessRequester(str, null, bfm, (iA0d >> 3) & 14, 2);
            String strKey = SkillPermissionsViewModel.Companion.key(str);
            SkillPermissionsViewModel.Factory factory = new SkillPermissionsViewModel.Factory(abstractC3358CGzA0h, str);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            SkillPermissionsViewModel skillPermissionsViewModel = (SkillPermissionsViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), strKey, C3cG.A0x(SkillPermissionsViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, skillPermissionsViewModel.uiState);
            if (C60Q.A0R(c1boA02).loadingState == SkillPermissionsLoadingState.IDLE || C60Q.A0R(c1boA02).loadingState == SkillPermissionsLoadingState.LOADING) {
                bfm.AgE(-1698659948);
                HatchScreenLoadingStateKt.HatchScreenLoadingState(C10G.A04(C10G.A02, 240.0f), bfm, 6, 0);
            } else if (C60Q.A0R(c1boA02).loadingState == SkillPermissionsLoadingState.ERROR) {
                bfm.AgE(-1698479714);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12012a);
                boolean zA67 = bfm.A67(skillPermissionsViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchConnectorPermissionsScreenKt$SkillPermissionsContent$1$1(skillPermissionsViewModel);
                    bfm.Ai0(objAaT);
                }
                HatchScreenErrorStateKt.HatchScreenErrorState(strA01, (Function0) ((InterfaceC7353EnQ) objAaT), C10G.A04(C10G.A02, 240.0f), HatchSurface.SETTINGS, HatchSubsurface.PERMISSIONS, HatchScreen.MANAGE_APPROVALS, null, bfm, 224640, 64);
            } else if (hasNoMethods(C60Q.A0R(c1boA02))) {
                C60R.A11(bfm, -1698106722);
            } else {
                bfm.AgE(-1697988209);
                SkillPermissionsUiState skillPermissionsUiStateA0R = C60Q.A0R(c1boA02);
                boolean zA65 = bfm.A65(g0uRememberConnectorScopeAccessRequester);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchConnectorPermissionsScreenKt$SkillPermissionsContent$2$1(g0uRememberConnectorScopeAccessRequester);
                    bfm.Ai0(objAaT2);
                }
                G0U g0u = (G0U) objAaT2;
                boolean zA1T = AnonymousClass001.A1T(bfm, skillPermissionsViewModel, (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32);
                Object objAaT3 = bfm.AaT();
                if (zA1T || objAaT3 == C78N.A00) {
                    objAaT3 = new HatchConnectorPermissionsScreenKt$SkillPermissionsContent$3$1(str, skillPermissionsViewModel);
                    bfm.Ai0(objAaT3);
                }
                SkillPermissionGroups(c07c, str, skillPermissionsUiStateA0R, g0u, (G0V) objAaT3, bfm, iA0d & 126);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138524(c07c, str, i);
        }
    }

    public static final void SkillPermissionsResetFooter(String str, BFM bfm, int i) {
        BBb bBbAAc;
        Object anonymousClass3;
        bfm.AgG(-1451894908);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            String strKey = SkillPermissionsViewModel.Companion.key(str);
            SkillPermissionsViewModel.Factory factory = new SkillPermissionsViewModel.Factory(AnonymousClass002.A0h(bfm), str);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            SkillPermissionsViewModel skillPermissionsViewModel = (SkillPermissionsViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), strKey, C3cG.A0x(SkillPermissionsViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, skillPermissionsViewModel.uiState);
            if (C60Q.A0R(c1boA02).loadingState != SkillPermissionsLoadingState.SUCCESS || hasNoMethods(C60Q.A0R(c1boA02))) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new C138531(str, i);
                    C3cG.A1D(bBbAAc, anonymousClass3);
                }
                return;
            }
            boolean z = !C60Q.A0R(c1boA02).isResetting;
            boolean z2 = C60Q.A0R(c1boA02).isResetting;
            boolean zA1S = AnonymousClass001.A1S(bfm, skillPermissionsViewModel, (iA0d & 14) == 4);
            Object objAaT = bfm.AaT();
            if (zA1S || objAaT == C78N.A00) {
                objAaT = new HatchConnectorPermissionsScreenKt$SkillPermissionsResetFooter$2$1(str, skillPermissionsViewModel);
                bfm.Ai0(objAaT);
            }
            ResetToDefaultsButton((Function0) objAaT, null, z, z2, bfm, 0, 2);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(str, i);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }
}
