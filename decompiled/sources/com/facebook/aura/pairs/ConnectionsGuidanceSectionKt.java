package com.facebook.aura.pairs;

import X.AKQ;
import X.AVy;
import X.AbstractC0885AGm;
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
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1BO;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C5wL;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.CH0;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.conversation.common.HatchPendingMessage;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConnectionsSheetKey;
import com.facebook.aura.pairs.ConnectionsGuidanceViewModel;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class ConnectionsGuidanceSectionKt {
    public static final int MENU_EDIT = 0;
    public static final int MENU_REMOVE = 1;

    /* renamed from: com.facebook.aura.pairs.ConnectionsGuidanceSectionKt$ConnectionsAddPermissionRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsGuidanceSectionKt.ConnectionsAddPermissionRow(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsGuidanceSectionKt$ConnectionsGuidanceSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C128232 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $groupConnectionId;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $museId;
        public final /* synthetic */ String $name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128232(String str, String str2, String str3, ConnectionsLogContext connectionsLogContext, BRg bRg, int i, int i2) {
            super(2);
            this.$name = str;
            this.$museId = str2;
            this.$groupConnectionId = str3;
            this.$log = connectionsLogContext;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsGuidanceSectionKt.ConnectionsGuidanceSection(this.$name, this.$museId, this.$groupConnectionId, this.$log, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsGuidanceSectionKt$ConnectionsPermissionMenu$2, reason: invalid class name and case insensitive filesystem */
    public final class C128242 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isBusy;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onEdit;
        public final /* synthetic */ Function0<Unit> $onOpen;
        public final /* synthetic */ Function0<Unit> $onRemove;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128242(boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2) {
            super(2);
            this.$isBusy = z;
            this.$onOpen = function0;
            this.$onEdit = function02;
            this.$onRemove = function03;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsGuidanceSectionKt.ConnectionsPermissionMenu(this.$isBusy, this.$onOpen, this.$onEdit, this.$onRemove, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsGuidanceSectionKt$ConnectionsPermissionRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C128252 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isBusy;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onEdit;
        public final /* synthetic */ Function0<Unit> $onMenuOpen;
        public final /* synthetic */ Function0<Unit> $onRemove;
        public final /* synthetic */ Function0<Unit> $onRowClick;
        public final /* synthetic */ ConnectionsSharingRule $rule;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128252(ConnectionsSharingRule connectionsSharingRule, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, BRg bRg, int i, int i2) {
            super(2);
            this.$rule = connectionsSharingRule;
            this.$isBusy = z;
            this.$onRowClick = function0;
            this.$onMenuOpen = function02;
            this.$onEdit = function03;
            this.$onRemove = function04;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsGuidanceSectionKt.ConnectionsPermissionRow(this.$rule, this.$isBusy, this.$onRowClick, this.$onMenuOpen, this.$onEdit, this.$onRemove, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsGuidanceSectionKt$ConnectionsPermissionsUnavailable$2, reason: invalid class name and case insensitive filesystem */
    public final class C128262 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128262(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsGuidanceSectionKt.ConnectionsPermissionsUnavailable(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsGuidanceSectionKt$openChatWithPrompt$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(AuraNavKey auraNavKey) {
            C7384Etj.A0Y(auraNavKey, 0);
            return Boolean.valueOf(auraNavKey instanceof ConnectionsSheetKey);
        }
    }

    public static final void ConnectionsAddPermissionRow(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-569600327);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
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
            BRg bRgA0C = C3U4.A0C(C0v5.A04(AnonymousClass001.A0R(bRg2), C3cG.A0A(0), null, function0, true), 0.0f, 16.0f, 2.0f, 4.0f);
            InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(AcQ.A01(C2VU.A00, 4.0f), bfm, C2VU.A04);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0b, akqA04, bRgA01, iA0J);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.circleplus_outline_24_wght600, 0);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraIconKt.m2568AuraIconFyETyZw(null, aVyA00, 20.0f, null, auraTheme.getColors(bfm, 6).link, null, bfm, AnonymousClass001.A04(), 33);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207f7), null, auraTheme.getColors(bfm, 6).link, C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, bRg2, i, i2);
        }
    }

    public static final void ConnectionsGuidanceSection(String str, String str2, String str3, ConnectionsLogContext connectionsLogContext, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        AnonymousClass002.A1B(str, 0, connectionsLogContext);
        bfm.AgG(-1391260269);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass002.A00(AnonymousClass004.A1a(connectionsLogContext, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            String strA0d = FGI.A0d("connections-guidance:", ((CH0) abstractC3358CGzA0h).A01, ":", (str3 != null ? C3cI.A0x("group:", str3) : C3cI.A0x("muse:", str2)).toString());
            ConnectionsGuidanceViewModel.Factory factory = new ConnectionsGuidanceViewModel.Factory(abstractC3358CGzA0h, str2, str3);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            ConnectionsGuidanceViewModel connectionsGuidanceViewModel = (ConnectionsGuidanceViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), ConnectionsGuidanceViewModel.class, strA0d);
            C1BO c1boA02 = C2CK.A02(bfm, connectionsGuidanceViewModel.uiState);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA0t = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f12080d);
            String str4 = ((ConnectionsGuidanceUiState) c1boA02.getValue()).connectionId;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRgA0Q.then(c1062ATq);
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
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                bfm.AgE(-2002721883);
                ConnectionsSheetScreenKt.ConnectionsSectionHeading(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120805), null, bfm, 0, 2);
                if (((ConnectionsGuidanceUiState) c1boA02.getValue()).isUnavailable) {
                    bfm.AgE(-2002681987);
                    ConnectionsPermissionsUnavailable(PairsAnalyticsKt.rememberConnectionsImpression(connectionsLogContext, HatchComponent.CONNECTIONS_UNAVAILABLE_STATE, HatchSubsurface.CONNECTION_PERMISSIONS, null, null, null, bfm, ConnectionsLogContext.$stable | 432 | ((iA0d >> 9) & 14), 56), bfm, 0, 0);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(-2002459035);
                    BBI.A0R(bbi, false);
                    AuraTheme auraTheme = AuraTheme.INSTANCE;
                    BRg bRgA09 = C3U4.A09(C60R.A0F(bfm, c1062ATq, auraTheme.getShapes(bfm, 6).large, auraTheme), 12.0f);
                    InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                    int iA0D = AnonymousClass001.A0D(bbi);
                    AKQ akqA042 = BBI.A04(bbi);
                    BRg bRgA012 = AxM.A01(bfm, bRgA09);
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
                    BPg.A02(bfm, akqA042, g0v);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                    BPg.A02(bfm, bRgA012, g0vA0u);
                    AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120804), C3U4.A0C(c1062ATq, 0.0f, 0.0f, 2.0f, 16.0f), C3cH.A07(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
                    bfm.AgE(-2108755984);
                    int i4 = 0;
                    for (Object obj : ((ConnectionsGuidanceUiState) c1boA02.getValue()).rules) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            AbstractC0885AGm.A14();
                        } else {
                            ConnectionsSharingRule connectionsSharingRule = (ConnectionsSharingRule) obj;
                            String strA0w = AnonymousClass006.A0w(bfm, str, connectionsSharingRule.title, R.string._name_removed__res_0x7f12080e);
                            boolean zA1a = AnonymousClass001.A1a((iA0d & 7168) == 2048 || ((iA0d & 4096) != 0 && bfm.A67(connectionsLogContext)), bfm, i4);
                            Object objAaT = bfm.AaT();
                            if (zA1a || objAaT == C78N.A00) {
                                objAaT = new ConnectionsGuidanceSectionKt$ConnectionsGuidanceSection$1$1$1$logClick$1$1(connectionsLogContext, i4);
                                bfm.Ai0(objAaT);
                            }
                            G0V g0v2 = (G0V) objAaT;
                            boolean zA1R = AnonymousClass001.A1R(bfm, strA0w, AnonymousClass005.A1Y(bfm, auraNavigatorA0b, connectionsSharingRule, bfm.A65(str4), bfm.A65(c1boA02)));
                            Object objAaT2 = bfm.AaT();
                            if (zA1R || objAaT2 == C78N.A00) {
                                objAaT2 = new ConnectionsGuidanceSectionKt$ConnectionsGuidanceSection$1$1$1$edit$1$1(str4, auraNavigatorA0b, connectionsSharingRule, strA0w, c1boA02);
                                bfm.Ai0(objAaT2);
                            }
                            Function0 function02 = (Function0) objAaT2;
                            AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
                            boolean zContains = ((ConnectionsGuidanceUiState) c1boA02.getValue()).busyIds.contains(connectionsSharingRule.id);
                            boolean zA1K = AnonymousClass003.A1K(bfm, g0v2, function02);
                            Object objAaT3 = bfm.AaT();
                            if (zA1K || objAaT3 == C78N.A00) {
                                objAaT3 = new ConnectionsGuidanceSectionKt$ConnectionsGuidanceSection$1$1$1$1$1(g0v2, function02);
                                bfm.Ai0(objAaT3);
                            }
                            Function0 function03 = (Function0) objAaT3;
                            boolean zA65 = bfm.A65(g0v2);
                            Object objAaT4 = bfm.AaT();
                            if (zA65 || objAaT4 == C78N.A00) {
                                objAaT4 = new ConnectionsGuidanceSectionKt$ConnectionsGuidanceSection$1$1$1$2$1(g0v2);
                                bfm.Ai0(objAaT4);
                            }
                            Function0 function04 = (Function0) objAaT4;
                            boolean zA1K2 = AnonymousClass003.A1K(bfm, g0v2, function02);
                            Object objAaT5 = bfm.AaT();
                            if (zA1K2 || objAaT5 == C78N.A00) {
                                objAaT5 = new ConnectionsGuidanceSectionKt$ConnectionsGuidanceSection$1$1$1$3$1(g0v2, function02);
                                bfm.Ai0(objAaT5);
                            }
                            Function0 function05 = (Function0) objAaT5;
                            boolean zA1O = C3cH.A1O(bfm, g0v2, connectionsGuidanceViewModel, connectionsSharingRule);
                            Object objAaT6 = bfm.AaT();
                            if (zA1O || objAaT6 == C78N.A00) {
                                objAaT6 = new ConnectionsGuidanceSectionKt$ConnectionsGuidanceSection$1$1$1$4$1(g0v2, connectionsGuidanceViewModel, connectionsSharingRule);
                                bfm.Ai0(objAaT6);
                            }
                            ConnectionsPermissionRow(connectionsSharingRule, zContains, function03, function04, function05, (Function0) objAaT6, PairsAnalyticsKt.rememberConnectionsImpression(connectionsLogContext, HatchComponent.CONNECTION_RULE_ROW, HatchSubsurface.CONNECTION_PERMISSIONS, null, Integer.valueOf(i4), connectionsSharingRule.id, bfm, ConnectionsLogContext.$stable | 432 | ((iA0d >> 9) & 14), 8), bfm, ConnectionsSharingRule.$stable, 0);
                            i4 = i5;
                        }
                    }
                    BBI.A0R(bbi, false);
                    boolean z = false;
                    AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
                    if ((iA0d & 7168) == 2048 || ((iA0d & 4096) != 0 && bfm.A67(connectionsLogContext))) {
                        z = true;
                    }
                    boolean zA1W = AnonymousClass002.A1W(bfm, strA0t, AnonymousClass005.A1X(bfm, c1boA02, auraNavigatorA0b, bfm.A65(str4), z), (iA0d & 14) == 4);
                    Object objAaT7 = bfm.AaT();
                    if (zA1W || objAaT7 == C78N.A00) {
                        objAaT7 = new ConnectionsGuidanceSectionKt$ConnectionsGuidanceSection$1$1$2$1(connectionsLogContext, str4, auraNavigatorA0b, str, strA0t, c1boA02);
                        bfm.Ai0(objAaT7);
                    }
                    ConnectionsAddPermissionRow((Function0) objAaT7, null, bfm, 0, 2);
                    BBI.A0R(bbi, true);
                }
                bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128232(str, str2, str3, connectionsLogContext, bRgA0Q, i, i2);
        }
    }

    public static final void ConnectionsPermissionMenu(boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-833742431);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0W(bfm, function03);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0n |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 9363, 9362), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120800);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.speech_bubble_wght400_outline_24, 0);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d80);
            AVy aVyA002 = BOf.A00(bfm, R.drawable.trash_wght400_outline_24, 0);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA02);
            boolean zA1C = AnonymousClass003.A1C(iA0n);
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == obj) {
                objAaT2 = new ConnectionsGuidanceSectionKt$ConnectionsPermissionMenu$1$1$1(function0, mutableState);
                bfm.Ai0(objAaT2);
            }
            ConnectionsComponentsKt.m1650ConnectionsOverflowButtonxfPyhaw((Function0) objAaT2, null, !z, 0.0f, 0L, bfm, 0, 26);
            boolean zA0A = MutableState.A0A(mutableState);
            boolean zA1K = AnonymousClass004.A1K(iA0n) | AnonymousClass006.A1X(iA0n);
            Object objAaT3 = bfm.AaT();
            if (zA1K || objAaT3 == obj) {
                objAaT3 = new ConnectionsGuidanceSectionKt$ConnectionsPermissionMenu$1$2$1(function02, function03, mutableState);
                bfm.Ai0(objAaT3);
            }
            G0U g0u = (G0U) objAaT3;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new ConnectionsGuidanceSectionKt$ConnectionsPermissionMenu$1$3$1(mutableState);
                bfm.Ai0(objAaT4);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(null, g0u, (Function0) objAaT4, zA0A, null, 0L, null, false, new ConnectionsGuidanceSectionKt$ConnectionsPermissionMenu$1$4(strA01, aVyA00, strA012, aVyA002), false, null, null, null, false, bfm, 384, 0, 16113);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128242(z, function0, function02, function03, bRg2, i, i2);
        }
    }

    public static final void ConnectionsPermissionRow(ConnectionsSharingRule connectionsSharingRule, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1622976409);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(connectionsSharingRule, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function02);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function03);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, function04);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA05 |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA05 |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0C = C3U4.A0C(C0v5.A05(AnonymousClass001.A0R(bRg2), null, function0, !z), 0.0f, 16.0f, 2.0f, 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(4.0f), bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function05 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function05);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C1AC c1ac = C2VU.A04;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, c1ac);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function05);
            BPg.A02(bfm, interfaceC1380AiAA0W, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C90m c90m = C90m.A00;
            String str = connectionsSharingRule.title;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, c90m.AiP(bs0, 1.0f, true), C3cH.A06(bfm, auraTheme), C60Q.A0D(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            ConnectionsPermissionMenu(z, function02, function03, function04, null, bfm, AnonymousClass003.A06(iA05 >> 6, (iA05 >> 3) & 14), 16);
            BBI.A0R(bbi, true);
            if (C7BY.A0j(connectionsSharingRule.summary)) {
                bfm.AgE(428667057);
            } else {
                bfm.AgE(428444880);
                AuraTextKt.m2639AuraTextUY9GdpU(connectionsSharingRule.summary, null, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128252(connectionsSharingRule, z, function0, function02, function03, function04, bRg2, i, i2);
        }
    }

    public static final void ConnectionsPermissionsUnavailable(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2136073027);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120806);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0C = C3cH.A0C(bfm, auraTheme);
            long jA07 = C3cH.A07(bfm, auraTheme);
            BRg bRgA09 = C3U4.A09(C60R.A0F(bfm, AnonymousClass001.A0R(bRg2), auraTheme.getShapes(bfm, 6).large, auraTheme), 12.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ConnectionsGuidanceSectionKt$ConnectionsPermissionsUnavailable$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bRgA09, objAaT, false), jA07, c1822ArmA0C, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128262(bRg2, i, i2);
        }
    }

    public static final void openChatWithPrompt(AuraNavigator auraNavigator, String str) {
        HatchPendingMessage.INSTANCE.setPendingComposerText(str, null);
        auraNavigator.popAll(AnonymousClass1.INSTANCE);
        AnonymousClass006.A1D(auraNavigator);
    }

    public static final /* synthetic */ ConnectionsGuidanceUiState access$ConnectionsGuidanceSection$lambda$1(C1BO c1bo) {
        return (ConnectionsGuidanceUiState) c1bo.getValue();
    }
}
