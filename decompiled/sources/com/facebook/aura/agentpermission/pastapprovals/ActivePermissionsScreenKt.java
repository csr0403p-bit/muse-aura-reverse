package com.facebook.aura.agentpermission.pastapprovals;

import X.AGI;
import X.AHD;
import X.AHH;
import X.AKQ;
import X.ARD;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AnonymousClass037;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0CD;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C1DP;
import X.C1YY;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchScreenEmptyStateKt;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class ActivePermissionsScreenKt {

    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$ActivePermissionSectionHeader$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $addTopSpacing;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;
        public final /* synthetic */ String $trailingLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$trailingLabel = str2;
            this.$addTopSpacing = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivePermissionsScreenKt.ActivePermissionSectionHeader(this.$title, this.$trailingLabel, this.$addTopSpacing, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$ActivePermissionsScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C108682 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<ActivePermissionsUiState> $uiState$delegate;
        public final /* synthetic */ ActivePermissionsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108682(ActivePermissionsViewModel activePermissionsViewModel, C1BO<ActivePermissionsUiState> c1bo) {
            super(4);
            this.$viewModel = activePermissionsViewModel;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m206invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m206invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA04), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            ActivePermissionsUiState value = this.$uiState$delegate.getValue();
            boolean zA67 = bfm.A67(this.$viewModel);
            ActivePermissionsViewModel activePermissionsViewModel = this.$viewModel;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ActivePermissionsScreenKt$ActivePermissionsScreen$2$1$1(activePermissionsViewModel);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            ActivePermissionsViewModel activePermissionsViewModel2 = this.$viewModel;
            boolean zA672 = bfm.A67(activePermissionsViewModel2);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new ActivePermissionsScreenKt$ActivePermissionsScreen$2$2$1(activePermissionsViewModel2);
                bfm.Ai0(objAaT2);
            }
            Function0 function02 = (Function0) objAaT2;
            ActivePermissionsViewModel activePermissionsViewModel3 = this.$viewModel;
            boolean zA673 = bfm.A67(activePermissionsViewModel3);
            Object objAaT3 = bfm.AaT();
            if (zA673 || objAaT3 == C78N.A00) {
                objAaT3 = new ActivePermissionsScreenKt$ActivePermissionsScreen$2$3$1(activePermissionsViewModel3);
                bfm.Ai0(objAaT3);
            }
            G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT3);
            ActivePermissionsViewModel activePermissionsViewModel4 = this.$viewModel;
            boolean zA674 = bfm.A67(activePermissionsViewModel4);
            Object objAaT4 = bfm.AaT();
            if (zA674 || objAaT4 == C78N.A00) {
                objAaT4 = new ActivePermissionsScreenKt$ActivePermissionsScreen$2$4$1(activePermissionsViewModel4);
                bfm.Ai0(objAaT4);
            }
            Function0 function03 = (Function0) ((InterfaceC7353EnQ) objAaT4);
            ActivePermissionsViewModel activePermissionsViewModel5 = this.$viewModel;
            boolean zA675 = bfm.A67(activePermissionsViewModel5);
            Object objAaT5 = bfm.AaT();
            if (zA675 || objAaT5 == C78N.A00) {
                objAaT5 = new ActivePermissionsScreenKt$ActivePermissionsScreen$2$5$1(activePermissionsViewModel5);
                bfm.Ai0(objAaT5);
            }
            ActivePermissionsScreenKt.m201ActivePermissionsContentKhTvWYU(value, f, f2, function0, function02, g0u, function03, (G0V) ((InterfaceC7353EnQ) objAaT5), bfm, AnonymousClass002.A07(iA04 << 3, ActivePermissionsUiState.$stable));
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$ActivePermissionsScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ ActivePermissionsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Function0<Unit> function0, BRg bRg, ActivePermissionsViewModel activePermissionsViewModel, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$modifier = bRg;
            this.$viewModel = activePermissionsViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivePermissionsScreenKt.ActivePermissionsScreen(this.$onBack, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$activePermissionSection$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $addTopSpacing;
        public final /* synthetic */ String $title;
        public final /* synthetic */ String $trailingLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, boolean z) {
            super(3);
            this.$title = str;
            this.$trailingLabel = str2;
            this.$addTopSpacing = z;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                ActivePermissionsScreenKt.ActivePermissionSectionHeader(this.$title, this.$trailingLabel, this.$addTopSpacing, null, bfm, 0, 8);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$activePermissionSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C108692 extends AbstractC7559F3s implements G0V<Integer, ActivePermission, Object> {
        public static final C108692 INSTANCE = new C108692();

        public C108692() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, ActivePermission activePermission) {
            AnonymousClass005.A0w(num);
            ActivePermission activePermission2 = activePermission;
            C7384Etj.A0Y(activePermission2, 1);
            return activePermission2.permissionId;
        }

        public final Object invoke(int i, ActivePermission activePermission) {
            C7384Etj.A0Y(activePermission, 1);
            return activePermission.permissionId;
        }
    }

    public static final void ActivePermissionSectionHeader(String str, String str2, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(-1214109908);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0Q);
            float f = z ? 32.0f : 0.0f;
            float f2 = AuraDimensKt.SpacingMedium;
            BRg bRgA0C = C3U4.A0C(bRgA0R, f2, f, f2, AuraDimensKt.SpacingXsmall);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ActivePermissionsScreenKt$ActivePermissionSectionHeader$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA012 = ARD.A01(bRgAiP, (G0U) objAaT, false);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRgA012, C3cH.A07(bfm, auraTheme), auraTheme.getTypography(bfm, 6).footnoteMedium, null, null, null, false, 0, 1, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14832);
            if (str2 == null) {
                bfm.AgE(70292782);
            } else {
                bfm.AgE(70292783);
                AuraTextKt.m2639AuraTextUY9GdpU(str2, C3U4.A0C(bs0, AuraDimensKt.SpacingSmall, 0.0f, 0.0f, 0.0f), C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, z, bRgA0Q, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ActivePermissionsScreen(kotlin.jvm.functions.Function0<kotlin.Unit> r44, X.BRg r45, com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel r46, X.BFM r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt.ActivePermissionsScreen(kotlin.jvm.functions.Function0, X.BRg, com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel, X.BFM, int, int):void");
    }

    public static final void activePermissionSection(C0CD c0cd, String str, String str2, final List<ActivePermission> list, final ActivePermissionsUiState activePermissionsUiState, final G0U<? super ActivePermission, Unit> g0u, final String str3, final G0U<? super String, Unit> g0u2, final Function0<Unit> function0, final G0V<? super ActivePermission, ? super ConnectorPermissionMode, Unit> g0v, String str4, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        c0cd.APJ(FGI.A0M("active_permission_section_", str), AnonymousClass000.A00(54), B1V.A01(new AnonymousClass1(str2, str4, z), -706525150, true));
        final C108692 c108692 = C108692.INSTANCE;
        c0cd.APL(c108692 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$activePermissionSection$$inlined$itemsIndexed$1
            public final Object invoke(int i) {
                return AnonymousClass006.A0n(Integer.valueOf(i), list, c108692, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$activePermissionSection$$inlined$itemsIndexed$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                list.get(AnonymousClass001.A0F(num));
                return "active_permission_row";
            }

            public final Object invoke(int i) {
                list.get(i);
                return "active_permission_row";
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsScreenKt$activePermissionSection$$inlined$itemsIndexed$3
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i2 : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                ActivePermission activePermission = (ActivePermission) list.get(i);
                bfm.AgE(-992997208);
                ActivePermissionRowKt.ActivePermissionRowContainer(i, AnonymousClass002.A0E(list), B1V.A00(bfm, new ActivePermissionsScreenKt$activePermissionSection$4$1(activePermissionsUiState, activePermission, str3, g0u, g0u2, function0, g0v), -1004687862), bfm, (((iA0d & 126) >> 3) & 14) | 384);
                AnonymousClass001.A1D(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996, true), list.size());
    }

    public static /* synthetic */ void activePermissionSection$default(C0CD c0cd, String str, String str2, List list, ActivePermissionsUiState activePermissionsUiState, G0U g0u, String str3, G0U g0u2, Function0 function0, G0V g0v, String str4, boolean z, int i, Object obj) {
        if ((i & 512) != 0) {
            str4 = null;
        }
        activePermissionSection(c0cd, str, str2, list, activePermissionsUiState, g0u, str3, g0u2, function0, g0v, str4, C3cG.A1K(i & 1024, z));
    }

    public static final boolean hasVisiblePermissions(ActivePermissionsUiState activePermissionsUiState) {
        if (activePermissionsUiState.isGrouped) {
            AHD<ActivePermissionGroup> ahd = activePermissionsUiState.groups;
            if (!(ahd instanceof Collection) || !ahd.isEmpty()) {
                for (ActivePermissionGroup activePermissionGroup : ahd) {
                    if (isSupportedPermissionsScope(activePermissionGroup.scope.type) && !activePermissionGroup.items.isEmpty()) {
                        return true;
                    }
                }
            }
            AHD<ActivePermission> ahd2 = activePermissionsUiState.permissions;
            if (!(ahd2 instanceof Collection) || !ahd2.isEmpty()) {
                for (ActivePermission activePermission : ahd2) {
                    if (activePermission.scope == null && ActivePermissionRowKt.isWebsitePermission(activePermission)) {
                        return true;
                    }
                }
            }
        } else {
            AHD<ActivePermission> ahd3 = activePermissionsUiState.permissions;
            if ((ahd3 instanceof Collection) && ahd3.isEmpty()) {
                return false;
            }
            Iterator it = ahd3.iterator();
            while (it.hasNext()) {
                if (isVisibleFlatPermission((ActivePermission) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean isSupportedPermissionsScope(ActivePermissionScopeType activePermissionScopeType) {
        return activePermissionScopeType == ActivePermissionScopeType.SCHEDULE || activePermissionScopeType == ActivePermissionScopeType.SPACE;
    }

    /* renamed from: ActivePermissionsContent-KhTvWYU, reason: not valid java name */
    public static final void m201ActivePermissionsContentKhTvWYU(ActivePermissionsUiState activePermissionsUiState, float f, float f2, Function0<Unit> function0, Function0<Unit> function02, G0U<? super ActivePermission, Unit> g0u, Function0<Unit> function03, G0V<? super ActivePermission, ? super ConnectorPermissionMode, Unit> g0v, BFM bfm, int i) {
        bfm.AgG(-67915261);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(activePermissionsUiState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A06(bfm, f2);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function02);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, g0u);
        }
        if ((1572864 & i) == 0) {
            iA05 |= AnonymousClass004.A0Z(bfm, function03);
        }
        if ((12582912 & i) == 0) {
            iA05 |= AnonymousClass004.A0a(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(4793491 & iA05, 4793490), bfm, iA05)) {
            BRg bRgA0A = C3U4.A0A(C10G.A01, f, f2);
            ActivePermissionsLoadingState activePermissionsLoadingState = activePermissionsUiState.loadingState;
            if (activePermissionsLoadingState == ActivePermissionsLoadingState.ERROR) {
                bfm.AgE(-842040415);
                HatchScreenErrorStateKt.HatchScreenErrorState(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12012c), function0, bRgA0A, null, null, null, null, bfm, (iA05 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 120);
            } else if (activePermissionsLoadingState != ActivePermissionsLoadingState.SUCCESS || hasVisiblePermissions(activePermissionsUiState) || activePermissionsUiState.canLoadMore) {
                bfm.AgE(-842020412);
                int iA07 = AnonymousClass002.A07(iA05, ActivePermissionsUiState.$stable | (iA05 & 14));
                int i2 = iA05 >> 3;
                m202ActivePermissionsListZUYZQmM(activePermissionsUiState, f, f2, function02, g0u, function03, g0v, bfm, AnonymousClass001.A05(i2, AnonymousClass004.A02(i2, iA07 | (i2 & 7168))));
            } else {
                bfm.AgE(-333105762);
                HatchScreenEmptyStateKt.HatchScreenEmptyState(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120128), bRgA0A, BOf.A00(bfm, R.drawable.clock_arrow_clockwise_wght400_outline_24, 0), null, bfm, AVy.$stable << 6, 8);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ActivePermissionsScreenKt$ActivePermissionsContent$1(activePermissionsUiState, f, f2, function0, function02, g0u, function03, g0v, i);
        }
    }

    /* renamed from: ActivePermissionsList-ZUYZQmM, reason: not valid java name */
    public static final void m202ActivePermissionsListZUYZQmM(ActivePermissionsUiState activePermissionsUiState, float f, float f2, Function0<Unit> function0, G0U<? super ActivePermission, Unit> g0u, Function0<Unit> function02, G0V<? super ActivePermission, ? super ConnectorPermissionMode, Unit> g0v, BFM bfm, int i) {
        bfm.AgG(150138708);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(activePermissionsUiState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A06(bfm, f2);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, g0u);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, function02);
        }
        if ((1572864 & i) == 0) {
            iA05 |= AnonymousClass004.A0Z(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1H(iA05), bfm, iA05)) {
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = new ActivePermissionsScreenKt$ActivePermissionsList$onMenuRequested$1$1(mutableState);
                bfm.Ai0(objAaT2);
            }
            G0U g0u2 = (G0U) objAaT2;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new ActivePermissionsScreenKt$ActivePermissionsList$onDismissMenu$1$1(mutableState);
                bfm.Ai0(objAaT3);
            }
            Function0 function03 = (Function0) objAaT3;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            float fA00 = C3cG.A00(bfm, auraTheme);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120129);
            BO6<ActivePermissionScopeType, String> bo6ActivePermissionScopeTypeLabels = activePermissionScopeTypeLabels(bfm, 0);
            boolean zA65 = bfm.A65(activePermissionsUiState.groups);
            Object objAaT4 = bfm.AaT();
            if (zA65 || objAaT4 == obj) {
                AHD<ActivePermissionGroup> ahd = activePermissionsUiState.groups;
                ArrayList arrayListA0h = C3cG.A0h();
                for (Object obj2 : ahd) {
                    if (isSupportedPermissionsScope(((ActivePermissionGroup) obj2).scope.type)) {
                        arrayListA0h.add(obj2);
                    }
                }
                objAaT4 = AGI.A0C(arrayListA0h);
                bfm.Ai0(objAaT4);
            }
            AHH ahh = (AHH) objAaT4;
            boolean zA652 = bfm.A65(activePermissionsUiState.permissions);
            Object objAaT5 = bfm.AaT();
            if (zA652 || objAaT5 == obj) {
                AHD<ActivePermission> ahd2 = activePermissionsUiState.permissions;
                ArrayList arrayListA0h2 = C3cG.A0h();
                for (Object obj3 : ahd2) {
                    ActivePermission activePermission = (ActivePermission) obj3;
                    if (activePermission.scope == null && ActivePermissionRowKt.isWebsitePermission(activePermission)) {
                        arrayListA0h2.add(obj3);
                    }
                }
                objAaT5 = AGI.A0C(arrayListA0h2);
                bfm.Ai0(objAaT5);
            }
            AHH ahh2 = (AHH) objAaT5;
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120134);
            long j = auraTheme.getColors(bfm, 6).destructiveText;
            BRg bRgA0B = C3U4.A0B(C10G.A01, fA00, 0.0f);
            C1DP c1dp = new C1DP(0.0f, f + AuraDimensKt.SpacingMedium, 0.0f, f2 + fA00);
            boolean zA1W = AnonymousClass002.A1W(bfm, strA012, AnonymousClass005.A1X(bfm, strA01, ahh2, AnonymousClass003.A1O(bfm, ahh, bo6ActivePermissionScopeTypeLabels, (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(activePermissionsUiState))) | AnonymousClass005.A1L(iA05), AnonymousClass005.A1B(iA05)), AnonymousClass004.A1M(iA05)) | AnonymousClass007.A1I(iA05) | bfm.A64(j);
            Object objAaT6 = bfm.AaT();
            if (zA1W || objAaT6 == obj) {
                objAaT6 = new ActivePermissionsScreenKt$ActivePermissionsList$1$1(activePermissionsUiState, ahh, strA01, ahh2, g0u, g0u2, function03, g0v, bo6ActivePermissionScopeTypeLabels, mutableState, function0, strA012, function02, j);
                bfm.Ai0(objAaT6);
            }
            C1YY.A01(null, null, null, c1dp, null, bfm, null, bRgA0B, (G0U) objAaT6, 0, 506, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ActivePermissionsScreenKt$ActivePermissionsList$2(activePermissionsUiState, f, f2, function0, g0u, function02, g0v, i);
        }
    }

    public static final /* synthetic */ ActivePermissionsUiState access$ActivePermissionsScreen$lambda$0(C1BO c1bo) {
        return (ActivePermissionsUiState) c1bo.getValue();
    }

    public static final BO6<ActivePermissionScopeType, String> activePermissionScopeTypeLabels(BFM bfm, int i) {
        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120126);
        String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120125);
        String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120124);
        String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120123);
        boolean zA1T = AnonymousClass005.A1T(bfm, strA012, strA013, strA014, bfm.A65(strA01));
        Object objAaT = bfm.AaT();
        if (zA1T || objAaT == C78N.A00) {
            objAaT = AGI.A0G(C3cG.A0r(ActivePermissionScopeType.SPACE, strA01), C3cG.A0r(ActivePermissionScopeType.SCHEDULE, strA012), C3cG.A0r(ActivePermissionScopeType.IDEA, strA013), C3cG.A0r(ActivePermissionScopeType.FEED, strA014));
            bfm.Ai0(objAaT);
        }
        return (BO6) objAaT;
    }

    public static final boolean isVisibleFlatPermission(ActivePermission activePermission) {
        if (ActivePermissionRowKt.isWebsitePermission(activePermission)) {
            ActivePermissionScope activePermissionScope = activePermission.scope;
            if ((activePermissionScope != null ? activePermissionScope.type : null) != ActivePermissionScopeType.IDEA) {
                if ((activePermissionScope != null ? activePermissionScope.type : null) != ActivePermissionScopeType.FEED) {
                    return true;
                }
            }
        }
        return false;
    }
}
