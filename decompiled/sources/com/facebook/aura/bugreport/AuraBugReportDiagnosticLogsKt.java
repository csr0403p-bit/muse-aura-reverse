package com.facebook.aura.bugreport;

import X.AGI;
import X.AHD;
import X.AHH;
import X.AKQ;
import X.AVy;
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
import X.ApQ;
import X.AxM;
import X.B1V;
import X.B6A;
import X.B81;
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
import X.C06G;
import X.C0953AJg;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C14P;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C1YL;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C7384Etj;
import X.C78N;
import X.C7OQ;
import X.C7OU;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.HpR;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.content.Context;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import com.facebook.aura.bugreport.AuraBugReportCollector;
import com.facebook.aura.bugreport.AuraBugReportReviewViewModel;
import com.facebook.aura.bugreport.AuraVmLogFetchState;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraBugReportDiagnosticLogsKt {
    public static final String ANY_MIME_TYPE = "*/*";
    public static final int MENU_DELETE = 2;
    public static final int MENU_DIVIDER = -1;
    public static final int MENU_DOWNLOAD = 1;
    public static final int MENU_REPLACE = 3;

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $endpoint;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ String $submissionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, String str2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$submissionId = str;
            this.$endpoint = str2;
            this.$onBack = function0;
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
            AuraBugReportDiagnosticLogsKt.AuraBugReportDiagnosticLogsScreen(this.$submissionId, this.$endpoint, this.$onBack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ G0U<AuraBugReportCollector.CollectedItem, Unit> $openReplacePicker;
        public final /* synthetic */ C1BO<AuraBugReportReviewUiState> $state$delegate;
        public final /* synthetic */ AuraBugReportReviewViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(C1BO<AuraBugReportReviewUiState> c1bo, AuraBugReportReviewViewModel auraBugReportReviewViewModel, G0U<? super AuraBugReportCollector.CollectedItem, Unit> g0u) {
            super(4);
            this.$state$delegate = c1bo;
            this.$viewModel = auraBugReportReviewViewModel;
            this.$openReplacePicker = g0u;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m323invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m323invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int i2;
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            boolean z = true;
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C3U4.A07(AnonymousClass006.A0M(bfm), AuraDimensKt.SpacingLarge);
            C1BO<AuraBugReportReviewUiState> c1bo = this.$state$delegate;
            AuraBugReportReviewViewModel auraBugReportReviewViewModel = this.$viewModel;
            G0U<AuraBugReportCollector.CollectedItem, Unit> g0u = this.$openReplacePicker;
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
            if (!(c1bo.getValue().vmLogFetch instanceof AuraVmLogFetchState.Fetching) && !(c1bo.getValue().vmLogFetch instanceof AuraVmLogFetchState.Unavailable)) {
                z = false;
            }
            if (c1bo.getValue().isCollecting) {
                bfm.AgE(-635693240);
                i2 = R.string._name_removed__res_0x7f1201ee;
            } else {
                if (!c1bo.getValue().items.isEmpty() || z) {
                    bfm.AgE(-635152755);
                    AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201f4), null, C06G.A08(bfm), C06G.A0S(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                    C01N.A06(bfm, bs0);
                    boolean zA1O = AnonymousClass003.A1O(bfm, auraBugReportReviewViewModel, g0u, bfm.A65(c1bo));
                    Object objAaT = bfm.AaT();
                    if (zA1O || objAaT == C78N.A00) {
                        objAaT = new AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$6$1$1$1(c1bo, auraBugReportReviewViewModel, g0u);
                        bfm.Ai0(objAaT);
                    }
                    HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT, bfm, 6, 7);
                    BBI.A0R(bbi, false);
                    C01N.A03(bfm, bbi, bs0, f2);
                }
                bfm.AgE(-635408908);
                i2 = R.string._name_removed__res_0x7f1201f5;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i2), null, C06G.A08(bfm), C06G.A0Z(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, false);
            C01N.A03(bfm, bbi, bs0, f2);
        }
    }

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $endpoint;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ String $submissionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(String str, String str2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$submissionId = str;
            this.$endpoint = str2;
            this.$onBack = function0;
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
            AuraBugReportDiagnosticLogsKt.AuraBugReportDiagnosticLogsScreen(this.$submissionId, this.$endpoint, this.$onBack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsSection$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $includeLogs;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onIncludeLogsChange;
        public final /* synthetic */ Function0<Unit> $onViewLogs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(boolean z, G0U<? super Boolean, Unit> g0u, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$includeLogs = z;
            this.$onIncludeLogsChange = g0u;
            this.$onViewLogs = function0;
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
            AuraBugReportDiagnosticLogsKt.AuraBugReportDiagnosticLogsSection(this.$includeLogs, this.$onIncludeLogsChange, this.$onViewLogs, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportDiagnosticLogsKt$DiagnosticFileContextMenu$2, reason: invalid class name and case insensitive filesystem */
    public final class C110012 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
        public final /* synthetic */ AHH<AuraContextMenuItem> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110012(AHH<AuraContextMenuItem> ahh) {
            super(2);
            this.$items = ahh;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
            return invoke(bfm, AnonymousClass001.A0F(num));
        }

        public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
            bfm.AgE(-1431700498);
            AHH<AuraContextMenuItem> ahh = this.$items;
            AnonymousClass002.A19(bfm);
            return ahh;
        }
    }

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportDiagnosticLogsKt$DiagnosticFileContextMenu$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $expanded;
        public final /* synthetic */ Function0<Unit> $onDelete;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onDownload;
        public final /* synthetic */ Function0<Unit> $onReplace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, int i) {
            super(2);
            this.$expanded = z;
            this.$onDismiss = function0;
            this.$onDownload = function02;
            this.$onDelete = function03;
            this.$onReplace = function04;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraBugReportDiagnosticLogsKt.DiagnosticFileContextMenu(this.$expanded, this.$onDismiss, this.$onDownload, this.$onDelete, this.$onReplace, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportDiagnosticLogsKt$DiagnosticFileRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C110022 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ AuraBugReportCollector.CollectedItem $item;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Function0<Unit> $onDelete;
        public final /* synthetic */ Function0<Unit> $onDownload;
        public final /* synthetic */ Function0<Unit> $onReplace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110022(AuraBugReportCollector.CollectedItem collectedItem, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, BRg bRg, int i, int i2) {
            super(2);
            this.$item = collectedItem;
            this.$enabled = z;
            this.$onClick = function0;
            this.$onDownload = function02;
            this.$onDelete = function03;
            this.$onReplace = function04;
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
            AuraBugReportDiagnosticLogsKt.DiagnosticFileRow(this.$item, this.$enabled, this.$onClick, this.$onDownload, this.$onDelete, this.$onReplace, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportDiagnosticLogsKt$IncludeLogsToggleRow$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $includeLogs;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onIncludeLogsChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$includeLogs = z;
            this.$onIncludeLogsChange = g0u;
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
            AuraBugReportDiagnosticLogsKt.IncludeLogsToggleRow(this.$includeLogs, this.$onIncludeLogsChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportDiagnosticLogsKt$ServerLogRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C110032 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ Integer $statusRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110032(Integer num, BRg bRg, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$statusRes = num;
            this.$modifier = bRg;
            this.$onRetry = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraBugReportDiagnosticLogsKt.ServerLogRow(this.$statusRes, this.$modifier, this.$onRetry, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportDiagnosticLogsKt$ViewLogsRow$1, reason: invalid class name and case insensitive filesystem */
    public final class C110041 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110041(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
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
            AuraBugReportDiagnosticLogsKt.ViewLogsRow(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AuraBugReportDiagnosticLogsScreen(String str, String str2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass7;
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(str, 0, function0);
        bfm.AgG(992562137);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            View view = (View) bfm.A6v(AndroidCompositionLocals_androidKt.A05);
            AuraBugReportReviewViewModel.Factory factory = new AuraBugReportReviewViewModel.Factory(AnonymousClass001.A0I(contextA0H), abstractC3358CGzA0h, str, str2);
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            AuraBugReportReviewViewModel auraBugReportReviewViewModel = (AuraBugReportReviewViewModel) AnonymousClass003.A0Y(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), AuraBugReportReviewViewModel.class, str);
            C1BO c1boA02 = C2CK.A02(bfm, auraBugReportReviewViewModel.uiState);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201f3);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201f2);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206f1);
            String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201f9);
            String strA015 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201fb);
            String strA016 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201fa);
            boolean zA1T = AnonymousClass001.A1T(bfm, view, AnonymousClass005.A1T(bfm, strA014, strA015, strA016, AnonymousClass005.A1T(bfm, strA01, strA012, strA013, bfm.A67(auraBugReportReviewViewModel))));
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$1$1(auraBugReportReviewViewModel, strA01, strA012, strA013, strA014, strA015, strA016, view, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A1A(bfm, objAaT, auraBugReportReviewViewModel, view);
            Object[] objArr = new Object[0];
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$pendingReplaceName$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT2, objArr);
            HpR hpR = new HpR();
            boolean zA1J = AnonymousClass003.A1J(bfm, mutableStateA0N, auraBugReportReviewViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA1J || objAaT3 == obj) {
                objAaT3 = new AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$replaceLauncher$1$1(auraBugReportReviewViewModel, mutableStateA0N);
                bfm.Ai0(objAaT3);
            }
            C7OU c7ouA00 = C7OQ.A00(hpR, bfm, (G0U) objAaT3);
            boolean zA1O = AnonymousClass003.A1O(bfm, view, strA016, AnonymousClass003.A1J(bfm, mutableStateA0N, c7ouA00));
            Object objAaT4 = bfm.AaT();
            if (zA1O || objAaT4 == obj) {
                objAaT4 = new AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$openReplacePicker$1$1(c7ouA00, view, strA016, mutableStateA0N);
                bfm.Ai0(objAaT4);
            }
            G0U g0u = (G0U) objAaT4;
            String str3 = ((AuraBugReportReviewUiState) c1boA02.getValue()).previewTitle;
            if (str3 != null) {
                boolean zA1Z = AnonymousClass001.A1Z(auraBugReportReviewViewModel, bfm, -1427807620);
                Object objAaT5 = bfm.AaT();
                if (zA1Z || objAaT5 == obj) {
                    objAaT5 = new AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$2$1(auraBugReportReviewViewModel);
                    bfm.Ai0(objAaT5);
                }
                B81.A00(false, (Function0) ((InterfaceC7353EnQ) objAaT5), bfm, 0, 1);
                SnapshotStateList<LogLine> snapshotStateList = auraBugReportReviewViewModel.previewLines;
                boolean z = ((AuraBugReportReviewUiState) c1boA02.getValue()).isPreviewLoading;
                AuraBugReportCollector.CollectedItem collectedItem = ((AuraBugReportReviewUiState) c1boA02.getValue()).previewTooLargeItem;
                boolean zA67 = bfm.A67(auraBugReportReviewViewModel);
                Object objAaT6 = bfm.AaT();
                if (zA67 || objAaT6 == obj) {
                    objAaT6 = new AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$3$1(auraBugReportReviewViewModel);
                    bfm.Ai0(objAaT6);
                }
                G0U g0u2 = (G0U) ((InterfaceC7353EnQ) objAaT6);
                boolean zA672 = bfm.A67(auraBugReportReviewViewModel);
                Object objAaT7 = bfm.AaT();
                if (zA672 || objAaT7 == obj) {
                    objAaT7 = new AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsScreen$4$1(auraBugReportReviewViewModel);
                    bfm.Ai0(objAaT7);
                }
                AuraBugReportDiagnosticsPreviewKt.AuraBugReportDiagnosticsPreview(str3, snapshotStateList, z, collectedItem, g0u2, (Function0) ((InterfaceC7353EnQ) objAaT7), bRg2, bfm, (AuraBugReportCollector.CollectedItem.$stable << 9) | ((iA0d << 9) & 3670016), 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass7 = new AnonymousClass5(str, str2, function0, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass7;
                }
                return;
            }
            AnonymousClass003.A0l(bfm, -1427426103);
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, bRg2, null, 0L, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201fd), null, function0, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass6(c1boA02, auraBugReportReviewViewModel, g0u), -1331064524), bfm, ((iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6 | ((iA0d << 12) & 3670016), 0, 805306368, 536870828);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass7 = new AnonymousClass7(str, str2, function0, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass7;
        }
    }

    public static final void AuraBugReportDiagnosticLogsSection(boolean z, G0U<? super Boolean, Unit> g0u, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(g0u, 1);
        bfm.AgG(2071181409);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0n |= 3072;
        } else if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 1171, 1170), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0D);
            C90l c90l = C90l.A00;
            boolean zA1B = AnonymousClass003.A1B(iA0n) | AnonymousClass003.A1C(iA0n) | AnonymousClass004.A1K(iA0n);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new AuraBugReportDiagnosticLogsKt$AuraBugReportDiagnosticLogsSection$1$1$1(function0, z, g0u);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT, bfm, 6, 7);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(z, g0u, function0, bRg2, i, i2);
        }
    }

    public static final void DiagnosticFileRow(AuraBugReportCollector.CollectedItem collectedItem, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(424528057);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(collectedItem, bfm, i) ? 1 : 0) | i : i;
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
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA05, 599186), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AuraBugReportDiagnosticLogsKt$DiagnosticFileRow$showMenu$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            Alignment alignment = C2VU.A0E;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function05 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function05);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA01, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C0z7 c0z7 = C0z7.A00;
            AuraCardType.Clickable clickable = AuraCardType.Clickable.INSTANCE;
            BS0 bs0 = BRg.A00;
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            String displayName = collectedItem.getDisplayName();
            C0953AJg c0953AJgA00 = C0953AJg.A00();
            long j2 = B6A.A07;
            int i5 = iA05 >> 3;
            AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, new AuraCardContent(displayName, (AuraIconAndHeadlineStyle) null, (BO6<String, C14P>) c0953AJgA00, (B6A) null, (ApQ) null, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, true, true, (String) null, (C1822Arm) null, j2, j2, (C1YL) null), clickable, null, B1V.A00(bfm, new AuraBugReportDiagnosticLogsKt$DiagnosticFileRow$1$1(mutableStateA0N, z), -1977556020), function0, null, null, null, z, false, null, null, 0L, false, null, null, bfm, ((iA05 << 12) & 3670016) | 199686, i5 & 14, 261008);
            BRg bRgA4C = c0z7.A4C(C2VU.A0D, bs0);
            InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment, false);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA4C);
            AnonymousClass005.A0n(bfm, bbi, function05);
            BPg.A02(bfm, interfaceC1380AiAA012, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            boolean zA0A = MutableState.A0A(mutableStateA0N);
            boolean zA65 = bfm.A65(mutableStateA0N);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new AuraBugReportDiagnosticLogsKt$DiagnosticFileRow$1$2$1$1(mutableStateA0N);
                bfm.Ai0(objAaT2);
            }
            DiagnosticFileContextMenu(zA0A, (Function0) objAaT2, function02, function03, function04, bfm, i5 & 65408);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110022(collectedItem, z, function0, function02, function03, function04, bRg2, i, i2);
        }
    }

    public static final void IncludeLogsToggleRow(boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1910679002);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, g0u);
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
            AuraCardType.Toggle toggle = AuraCardType.Toggle.INSTANCE;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201ef);
            C0953AJg c0953AJgA00 = C0953AJg.A00();
            long j = B6A.A07;
            int i4 = iA0n << 21;
            AuraCardKt.m2484AuraCardjQVUvHA(bRgA0R, auraCardStyleCardStyleForSettings, new AuraCardContent(strA01, (AuraIconAndHeadlineStyle) null, (BO6<String, C14P>) c0953AJgA00, (B6A) null, (ApQ) null, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, true, true, (String) null, (C1822Arm) null, j, j, (C1YL) null), toggle, null, null, null, Boolean.valueOf(z), g0u, null, false, false, null, null, 0L, false, null, null, bfm, AnonymousClass001.A09(i4, (29360128 & i4) | 3072), 0, 261744);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(z, g0u, bRg2, i, i2);
        }
    }

    public static final void ServerLogRow(Integer num, BRg bRg, Function0<Unit> function0, BFM bfm, int i, int i2) {
        Function0<Unit> function02 = function0;
        BRg bRg2 = bRg;
        bfm.AgG(54594290);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, num) | i : i;
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
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                function02 = null;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201fc);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201f1);
            String strA013 = AbstractC2271BQs.A01(bfm, num != null ? num.intValue() : R.string._name_removed__res_0x7f1201f7);
            boolean zA65 = bfm.A65(strA013);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AnonymousClass005.A0X(strA013);
                bfm.Ai0(objAaT);
            }
            ApQ apQ = (ApQ) objAaT;
            AuraCardType button = function02 == null ? AuraCardType.None.INSTANCE : new AuraCardType.Button(strA01, null, false, true);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = AuraBugReportDiagnosticLogsKt$ServerLogRow$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0R, objAaT2, false);
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            C0953AJg c0953AJgA00 = C0953AJg.A00();
            long j = B6A.A07;
            AuraCardKt.m2484AuraCardjQVUvHA(bRgA0Y, auraCardStyleCardStyleForSettings, new AuraCardContent(strA012, (AuraIconAndHeadlineStyle) null, (BO6<String, C14P>) c0953AJgA00, (B6A) null, apQ, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, true, true, (String) null, (C1822Arm) null, j, j, (C1YL) null), button, null, null, function02, null, null, null, false, false, null, null, 0L, false, null, null, bfm, AnonymousClass001.A05(iA0d << 12, AuraCardType.$stable << 9), 0, 262064);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110032(num, bRg2, function02, i, i2);
        }
    }

    public static final void ViewLogsRow(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1121948984);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
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
            AuraCardType.ChevronNavigation chevronNavigation = new AuraCardType.ChevronNavigation(null);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120204);
            C0953AJg c0953AJgA00 = C0953AJg.A00();
            long j = B6A.A07;
            AuraCardKt.m2484AuraCardjQVUvHA(bRgA0R, auraCardStyleCardStyleForSettings, new AuraCardContent(strA01, (AuraIconAndHeadlineStyle) null, (BO6<String, C14P>) c0953AJgA00, (B6A) null, (ApQ) null, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, true, true, (String) null, (C1822Arm) null, j, j, (C1YL) null), chevronNavigation, null, null, function0, null, null, null, false, false, null, null, 0L, false, null, null, bfm, ((iA0T << 18) & 3670016) | 3072, 0, 262064);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110041(function0, bRg2, i, i2);
        }
    }

    public static final void DiagnosticFileContextMenu(boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, BFM bfm, int i) {
        bfm.AgG(-1535260762);
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
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0X(bfm, function04);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 9363, 9362), bfm, iA0n)) {
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120230);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.arrowdownload_outline_24_wght400, 0);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201f0);
            AVy aVyA002 = BOf.A00(bfm, R.drawable.documentbadgeplus_outline_24_wght400, 0);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12054f);
            AVy aVyA003 = BOf.A00(bfm, R.drawable.trash_wght400_outline_24, 0);
            long j = AnonymousClass002.A0c(bfm).destructiveIcon.enabled;
            boolean zA1R = AnonymousClass001.A1R(bfm, aVyA003, AnonymousClass001.A1R(bfm, strA013, AnonymousClass005.A1T(bfm, aVyA00, strA012, aVyA002, bfm.A65(strA01)))) | bfm.A64(j);
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                BS0 bs0 = BRg.A00;
                objAaT = AGI.A0E(new AuraContextMenuItem(1, strA01, null, aVyA00, null, null, false, false, false, true, false, bs0, 1, 1), new AuraContextMenuItem(3, strA012, null, aVyA002, null, null, false, false, false, true, false, bs0, 1, 1), new AuraContextMenuItem(-1, "", null, null, null, null, false, true, false, true, false, bs0, 1, 1), new AuraContextMenuItem(2, strA013, null, aVyA003, new B6A(j), null, false, false, false, true, true, bs0, 1, 1));
                bfm.Ai0(objAaT);
            }
            AHH ahh = (AHH) objAaT;
            long jA0B = AnonymousClass007.A0B(C06G.A00(bfm), AuraDimensKt.SpacingSmall);
            boolean zA1C = AnonymousClass003.A1C(iA0n) | AnonymousClass004.A1K(iA0n) | AnonymousClass005.A1L(iA0n) | AnonymousClass006.A1X(iA0n);
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == C78N.A00) {
                objAaT2 = new AuraBugReportDiagnosticLogsKt$DiagnosticFileContextMenu$1$1(function0, function02, function04, function03);
                bfm.Ai0(objAaT2);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(null, (G0U) objAaT2, function0, z, null, jA0B, null, false, new C110012(ahh), false, null, null, null, false, bfm, ((iA0n << 3) & 896) | ((iA0n << 9) & 7168), 0, 16081);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(z, function0, function02, function03, function04, i);
        }
    }

    public static final /* synthetic */ AuraBugReportReviewUiState access$AuraBugReportDiagnosticLogsScreen$lambda$0(C1BO c1bo) {
        return (AuraBugReportReviewUiState) c1bo.getValue();
    }
}
