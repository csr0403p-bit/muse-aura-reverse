package com.facebook.aura.confidentialvm.view;

import X.AHD;
import X.AKQ;
import X.AbstractC1754Apr;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C0953AJg;
import X.C1062ATq;
import X.C10G;
import X.C14P;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1D8;
import X.C1DG;
import X.C1DM;
import X.C1YL;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3Ue;
import X.C3cG;
import X.C3cH;
import X.C78N;
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
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.confidentialvm.model.ConfidentialVmDisconnectedItem;
import com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneUiState;
import com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel;
import com.facebook.aura.skills.view.common.HatchConnectorIconKt;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardStyles;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class ConfidentialVmMigrationDoneScreenKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmMigrationDoneScreenKt$ConfidentialVmMigrationDoneScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ ConfidentialVmMigrationDoneViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ConfidentialVmMigrationDoneViewModel confidentialVmMigrationDoneViewModel) {
            super(2);
            this.$viewModel = confidentialVmMigrationDoneViewModel;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                ConfidentialVmMigrationDoneViewModel confidentialVmMigrationDoneViewModel = this.$viewModel;
                boolean zA67 = bfm.A67(confidentialVmMigrationDoneViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new ConfidentialVmMigrationDoneScreenKt$ConfidentialVmMigrationDoneScreen$3$1$1(confidentialVmMigrationDoneViewModel);
                    bfm.Ai0(objAaT);
                }
                Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT);
                ConfidentialVmMigrationDoneViewModel confidentialVmMigrationDoneViewModel2 = this.$viewModel;
                boolean zA672 = bfm.A67(confidentialVmMigrationDoneViewModel2);
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new ConfidentialVmMigrationDoneScreenKt$ConfidentialVmMigrationDoneScreen$3$2$1(confidentialVmMigrationDoneViewModel2);
                    bfm.Ai0(objAaT2);
                }
                Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT2);
                ConfidentialVmMigrationDoneViewModel confidentialVmMigrationDoneViewModel3 = this.$viewModel;
                boolean zA673 = bfm.A67(confidentialVmMigrationDoneViewModel3);
                Object objAaT3 = bfm.AaT();
                if (zA673 || objAaT3 == C78N.A00) {
                    objAaT3 = new ConfidentialVmMigrationDoneScreenKt$ConfidentialVmMigrationDoneScreen$3$3$1(confidentialVmMigrationDoneViewModel3);
                    bfm.Ai0(objAaT3);
                }
                ConfidentialVmOverflowMenuKt.ConfidentialVmOverflowMenu(function0, function02, (Function0) ((InterfaceC7353EnQ) objAaT3), null, bfm, 0, 8);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmMigrationDoneScreenKt$ConfidentialVmMigrationDoneScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<ConfidentialVmMigrationDoneUiState> $uiState$delegate;
        public final /* synthetic */ ConfidentialVmMigrationDoneViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ConfidentialVmMigrationDoneViewModel confidentialVmMigrationDoneViewModel, C1BO<ConfidentialVmMigrationDoneUiState> c1bo) {
            super(4);
            this.$viewModel = confidentialVmMigrationDoneViewModel;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m466invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m466invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = i;
            if ((i & 6) == 0) {
                iA04 |= AnonymousClass004.A04(bfm, f);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 131, 130), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA01 = AbstractC1754Apr.A01(C10G.A01);
            ConfidentialVmMigrationDoneViewModel confidentialVmMigrationDoneViewModel = this.$viewModel;
            C1BO<ConfidentialVmMigrationDoneUiState> c1bo = this.$uiState$delegate;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, C2VU.A02, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
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
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
            C90l c90l = C90l.A00;
            C3TH c3th = C2VU.A00;
            BRg bRgA0T = AnonymousClass005.A0T(bfm, AnonymousClass001.A0R(c90l.AiP(bs0, 1.0f, true)));
            float f3 = AuraDimensKt.SpacingLarge;
            BRg bRgA0B = C3U4.A0B(bRgA0T, f3, AuraDimensKt.SpacingXlarge);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            C01N.A08(bfm, bs0, f);
            C01N.A07(bfm, c90l.AiP(bs0, 1.0f, true));
            ConfidentialVmMigrationDoneScreenKt.ShieldTile(null, bfm, 0, 1);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingMedium);
            ConfidentialVmMigrationDoneScreenKt.MigrationDoneCopy(c1bo.getValue().isConfidentialVm, !c1bo.getValue().disconnected.isEmpty(), null, bfm, 0, 4);
            if (c1bo.getValue().disconnected.isEmpty()) {
                bfm.AgE(-443202781);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-443354619);
                ConfidentialVmMigrationDoneScreenKt.DisconnectedList(c1bo.getValue().disconnected, C3U4.A04(bs0, f3), bfm, 0, 0);
                BBI.A0R(bbi, false);
            }
            C01N.A07(bfm, c90l.AiP(bs0, 1.0f, true));
            BBI.A0R(bbi, true);
            boolean zA67 = bfm.A67(confidentialVmMigrationDoneViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ConfidentialVmMigrationDoneScreenKt$ConfidentialVmMigrationDoneScreen$4$1$2$1(confidentialVmMigrationDoneViewModel);
                bfm.Ai0(objAaT);
            }
            AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(null, null, null, null, null, null, null, false, (G0U) objAaT, bfm, 0, 255);
            BBI.A0R(bbi, true);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmMigrationDoneScreenKt$ConfidentialVmMigrationDoneScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmMigrationDoneViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(BRg bRg, ConfidentialVmMigrationDoneViewModel confidentialVmMigrationDoneViewModel, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$viewModel = confidentialVmMigrationDoneViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmMigrationDoneScreenKt.ConfidentialVmMigrationDoneScreen(this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmMigrationDoneScreenKt$DisconnectedList$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<ConfidentialVmDisconnectedItem> $items;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AHD<ConfidentialVmDisconnectedItem> ahd, BRg bRg, int i, int i2) {
            super(2);
            this.$items = ahd;
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
            ConfidentialVmMigrationDoneScreenKt.DisconnectedList(this.$items, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmMigrationDoneScreenKt$DisconnectedRow$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ ConfidentialVmDisconnectedItem $item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConfidentialVmDisconnectedItem confidentialVmDisconnectedItem) {
            super(2);
            this.$item = confidentialVmDisconnectedItem;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                HatchConnectorIconKt.m2169ConnectorIconVRRgpyE(this.$item.iconUrl, null, null, 0.0f, 0.0f, 0, 0.0f, null, null, bfm, 48, 508);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmMigrationDoneScreenKt$DisconnectedRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C112652 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConfidentialVmDisconnectedItem $item;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112652(ConfidentialVmDisconnectedItem confidentialVmDisconnectedItem, BRg bRg, int i, int i2) {
            super(2);
            this.$item = confidentialVmDisconnectedItem;
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
            ConfidentialVmMigrationDoneScreenKt.DisconnectedRow(this.$item, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmMigrationDoneScreenKt$MigrationDoneCopy$2, reason: invalid class name and case insensitive filesystem */
    public final class C112662 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $hasDisconnected;
        public final /* synthetic */ boolean $isConfidentialVm;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112662(boolean z, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$isConfidentialVm = z;
            this.$hasDisconnected = z2;
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
            ConfidentialVmMigrationDoneScreenKt.MigrationDoneCopy(this.$isConfidentialVm, this.$hasDisconnected, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmMigrationDoneScreenKt$ShieldTile$2, reason: invalid class name and case insensitive filesystem */
    public final class C112672 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112672(BRg bRg, int i, int i2) {
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
            ConfidentialVmMigrationDoneScreenKt.ShieldTile(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ShieldTile(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(731150563);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Alignment alignment = C2VU.A09;
            BRg bRgA07 = C10G.A07(bRg2, 60.0f);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA03 = C1b8.A03(bRgA07, C1D8.A00(20.0f), auraTheme.getColors(bfm, 6).elevated);
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA03);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            AuraIconKt.m2568AuraIconFyETyZw(null, BOf.A00(bfm, R.drawable.shieldlock_outline_24_wght500, 0), 47.0f, null, auraTheme.getColors(bfm, 6).primaryIcon.enabled, null, bfm, AnonymousClass001.A03(), 41);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C112672(bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConfidentialVmMigrationDoneScreen(X.BRg r44, com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel r45, X.BFM r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmMigrationDoneScreenKt.ConfidentialVmMigrationDoneScreen(X.BRg, com.facebook.aura.confidentialvm.model.ConfidentialVmMigrationDoneViewModel, X.BFM, int, int):void");
    }

    public static final void DisconnectedList(AHD<ConfidentialVmDisconnectedItem> ahd, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(699744729);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
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
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new ConfidentialVmMigrationDoneScreenKt$DisconnectedList$1$1$1(ahd);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT, bfm, 6, 7);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12074c);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0B(c1062ATq, AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingSmall), C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(ahd, bRg2, i, i2);
        }
    }

    public static final void DisconnectedRow(ConfidentialVmDisconnectedItem confidentialVmDisconnectedItem, BRg bRg, BFM bfm, int i, int i2) {
        String strA0t;
        BRg bRg2 = bRg;
        bfm.AgG(1713583646);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, confidentialVmDisconnectedItem) | i : i;
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
            AuraCardStyle auraCardStyleM2500listoAWOtXo = AuraCardStyles.INSTANCE.m2500listoAWOtXo(null, 0L, null, bfm, 3072, 7);
            C1DM c1dm = AuraTheme.INSTANCE.getShapes(bfm, 6).none;
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            if (confidentialVmDisconnectedItem.isChannel) {
                bfm.AgE(-610430164);
                strA0t = AnonymousClass001.A0t(bfm, confidentialVmDisconnectedItem.name, R.string._name_removed__res_0x7f120748);
                AnonymousClass001.A1D(bfm);
            } else {
                AnonymousClass003.A0l(bfm, -610307311);
                strA0t = confidentialVmDisconnectedItem.name;
            }
            C0953AJg c0953AJgA00 = C0953AJg.A00();
            long j = B6A.A07;
            AuraCardKt.m2484AuraCardjQVUvHA(bRg2, auraCardStyleM2500listoAWOtXo, new AuraCardContent(strA0t, auraIconAndHeadlineStyle, (BO6<String, C14P>) c0953AJgA00, (B6A) null, (ApQ) null, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, true, false, (String) null, (C1822Arm) null, j, j, (C1YL) null), null, B1V.A00(bfm, new AnonymousClass1(confidentialVmDisconnectedItem), -526033670), null, null, null, null, null, false, false, null, c1dm, 0L, false, null, null, bfm, ((iA0d >> 3) & 14) | RuntimeInternals.IOPRIO_BACKGROUND, 0, 253928);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C112652(confidentialVmDisconnectedItem, bRg2, i, i2);
        }
    }

    public static final void MigrationDoneCopy(boolean z, boolean z2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(158756173);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C3TH c3th = C2VU.A00;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            int i4 = R.string._name_removed__res_0x7f12074b;
            if (z) {
                i4 = R.string._name_removed__res_0x7f120749;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i4);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).title1Medium;
            long jA06 = C3cH.A06(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ConfidentialVmMigrationDoneScreenKt$MigrationDoneCopy$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(c1062ATq, objAaT, false), jA06, c1822Arm, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            C01N.A05(bfm, bs0);
            int i5 = R.string._name_removed__res_0x7f120747;
            if (z2) {
                i5 = R.string._name_removed__res_0x7f12074a;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i5), c1062ATq, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C112662(z, z2, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ ConfidentialVmMigrationDoneUiState access$ConfidentialVmMigrationDoneScreen$lambda$0(C1BO c1bo) {
        return (ConfidentialVmMigrationDoneUiState) c1bo.getValue();
    }
}
