package com.facebook.aura.skills.view;

import X.AHD;
import X.AKQ;
import X.ARD;
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
import X.BBb;
import X.BFM;
import X.BOD;
import X.BOf;
import X.BPg;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C07C;
import X.C0v5;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1AC;
import X.C1BO;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2j;
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
import com.facebook.aura.agentpermission.PermissionModeContextMenuKt;
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
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.ext.ColorExtKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class ConnectorPermissionSectionsKt {

    /* renamed from: com.facebook.aura.skills.view.ConnectorPermissionSectionsKt$ConnectorPermissionGroupHeader$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, int i) {
            super(2);
            this.$title = str;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectorPermissionSectionsKt.ConnectorPermissionGroupHeader(this.$title, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.skills.view.ConnectorPermissionSectionsKt$ConnectorPermissionGroupSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C138322 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ ConnectorPermission $connector;
        public final /* synthetic */ ConnectorPermissionGroup $group;
        public final /* synthetic */ String $menuGroupKey;
        public final /* synthetic */ String $menuMethodKey;
        public final /* synthetic */ Function0<Unit> $onDismissMenu;
        public final /* synthetic */ G0V<String, String, Unit> $onMenuRequested;
        public final /* synthetic */ G2j<ConnectorPermission, ConnectorPermissionGroup, ConnectorPermissionMethod, ConnectorPermissionMode, Unit> $onMethodModeSelected;
        public final /* synthetic */ C07C $this_ConnectorPermissionGroupSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C138322(C07C c07c, ConnectorPermission connectorPermission, ConnectorPermissionGroup connectorPermissionGroup, String str, String str2, G0V<? super String, ? super String, Unit> g0v, Function0<Unit> function0, G2j<? super ConnectorPermission, ? super ConnectorPermissionGroup, ? super ConnectorPermissionMethod, ? super ConnectorPermissionMode, Unit> g2j, int i) {
            super(2);
            this.$this_ConnectorPermissionGroupSection = c07c;
            this.$connector = connectorPermission;
            this.$group = connectorPermissionGroup;
            this.$menuGroupKey = str;
            this.$menuMethodKey = str2;
            this.$onMenuRequested = g0v;
            this.$onDismissMenu = function0;
            this.$onMethodModeSelected = g2j;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectorPermissionSectionsKt.ConnectorPermissionGroupSection(this.$this_ConnectorPermissionGroupSection, this.$connector, this.$group, this.$menuGroupKey, this.$menuMethodKey, this.$onMenuRequested, this.$onDismissMenu, this.$onMethodModeSelected, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.ConnectorPermissionSectionsKt$ConnectorPermissionTargetRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C138332 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ String $label;
        public final /* synthetic */ ConnectorPermissionMode $mode;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ boolean $showSpinner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138332(String str, ConnectorPermissionMode connectorPermissionMode, boolean z, boolean z2, Function0<Unit> function0, int i) {
            super(2);
            this.$label = str;
            this.$mode = connectorPermissionMode;
            this.$enabled = z;
            this.$showSpinner = z2;
            this.$onClick = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectorPermissionSectionsKt.ConnectorPermissionTargetRow(this.$label, this.$mode, this.$enabled, this.$showSpinner, this.$onClick, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.ConnectorPermissionSectionsKt$ConnectorPermissionTargetWithContextMenu$2, reason: invalid class name and case insensitive filesystem */
    public final class C138342 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $isUpdating;
        public final /* synthetic */ String $label;
        public final /* synthetic */ boolean $menuExpanded;
        public final /* synthetic */ ConnectorPermissionMode $mode;
        public final /* synthetic */ AHD<ConnectorPermissionMode> $modes;
        public final /* synthetic */ Function0<Unit> $onDismissMenu;
        public final /* synthetic */ G0U<ConnectorPermissionMode, Unit> $onModeSelected;
        public final /* synthetic */ Function0<Unit> $onTargetClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C138342(String str, ConnectorPermissionMode connectorPermissionMode, AHD<? extends ConnectorPermissionMode> ahd, boolean z, boolean z2, boolean z3, Function0<Unit> function0, Function0<Unit> function02, G0U<? super ConnectorPermissionMode, Unit> g0u, int i, int i2) {
            super(2);
            this.$label = str;
            this.$mode = connectorPermissionMode;
            this.$modes = ahd;
            this.$menuExpanded = z;
            this.$enabled = z2;
            this.$isUpdating = z3;
            this.$onTargetClick = function0;
            this.$onDismissMenu = function02;
            this.$onModeSelected = g0u;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectorPermissionSectionsKt.ConnectorPermissionTargetWithContextMenu(this.$label, this.$mode, this.$modes, this.$menuExpanded, this.$enabled, this.$isUpdating, this.$onTargetClick, this.$onDismissMenu, this.$onModeSelected, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.ConnectorPermissionSectionsKt$EmptySkillDetailState$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, int i) {
            super(2);
            this.$text = str;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectorPermissionSectionsKt.EmptySkillDetailState(this.$text, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.skills.view.ConnectorPermissionSectionsKt$RestrictedPermissionTargetRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C138352 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $label;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $subtitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138352(String str, String str2, Function0<Unit> function0, int i) {
            super(2);
            this.$label = str;
            this.$subtitle = str2;
            this.$onClick = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectorPermissionSectionsKt.RestrictedPermissionTargetRow(this.$label, this.$subtitle, this.$onClick, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.ConnectorPermissionSectionsKt$SkillPermissionGroupSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C138362 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ SkillPermissionGroupUiModel $group;
        public final /* synthetic */ String $menuMethodKey;
        public final /* synthetic */ G0U<SkillPermissionMethodUiModel, Unit> $onAdditionalAccessRequested;
        public final /* synthetic */ Function0<Unit> $onDismissMenu;
        public final /* synthetic */ G0U<String, Unit> $onMenuRequested;
        public final /* synthetic */ G0V<SkillPermissionMethodUiModel, ConnectorPermissionMode, Unit> $onMethodModeSelected;
        public final /* synthetic */ C07C $this_SkillPermissionGroupSection;
        public final /* synthetic */ String $title;
        public final /* synthetic */ SkillPermissionsUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C138362(C07C c07c, String str, SkillPermissionGroupUiModel skillPermissionGroupUiModel, SkillPermissionsUiState skillPermissionsUiState, String str2, G0U<? super String, Unit> g0u, Function0<Unit> function0, G0U<? super SkillPermissionMethodUiModel, Unit> g0u2, G0V<? super SkillPermissionMethodUiModel, ? super ConnectorPermissionMode, Unit> g0v, int i) {
            super(2);
            this.$this_SkillPermissionGroupSection = c07c;
            this.$title = str;
            this.$group = skillPermissionGroupUiModel;
            this.$uiState = skillPermissionsUiState;
            this.$menuMethodKey = str2;
            this.$onMenuRequested = g0u;
            this.$onDismissMenu = function0;
            this.$onAdditionalAccessRequested = g0u2;
            this.$onMethodModeSelected = g0v;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectorPermissionSectionsKt.SkillPermissionGroupSection(this.$this_SkillPermissionGroupSection, this.$title, this.$group, this.$uiState, this.$menuMethodKey, this.$onMenuRequested, this.$onDismissMenu, this.$onAdditionalAccessRequested, this.$onMethodModeSelected, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.ConnectorPermissionSectionsKt$SkillPermissionsSections$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ C07C $this_SkillPermissionsSections;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(C07C c07c, String str, int i) {
            super(2);
            this.$this_SkillPermissionsSections = c07c;
            this.$connectorId = str;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectorPermissionSectionsKt.SkillPermissionsSections(this.$this_SkillPermissionsSections, this.$connectorId, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void ConnectorPermissionGroupSection(C07C c07c, ConnectorPermission connectorPermission, ConnectorPermissionGroup connectorPermissionGroup, String str, String str2, G0V<? super String, ? super String, Unit> g0v, Function0<Unit> function0, G2j<? super ConnectorPermission, ? super ConnectorPermissionGroup, ? super ConnectorPermissionMethod, ? super ConnectorPermissionMode, Unit> g2j, BFM bfm, int i) {
        AnonymousClass005.A10(c07c, connectorPermission, connectorPermissionGroup);
        AnonymousClass003.A0z(g0v, function0);
        C7384Etj.A0Y(g2j, 7);
        bfm.AgG(1446428108);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(connectorPermission, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass003.A05(AnonymousClass004.A1Z(connectorPermissionGroup, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str2);
        }
        if ((i & 196608) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0v);
        }
        if ((i & 1572864) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, function0);
        }
        if ((i & 12582912) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, g2j);
        }
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 4793491, 4793490), bfm, iA0d)) {
            ConnectorPermissionGroupHeader(connectorPermissionGroup.label, bfm, 0);
            boolean zA1M = ((iA0d & 896) == 256 || ((iA0d & 512) != 0 && bfm.A67(connectorPermissionGroup))) | AnonymousClass004.A1M(iA0d) | AnonymousClass005.A1L(iA0d) | AnonymousClass007.A1H(iA0d) | AnonymousClass005.A1B(iA0d) | AnonymousClass005.A1J(iA0d);
            if ((iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) != 32 && ((iA0d & 64) == 0 || !bfm.A67(connectorPermission))) {
                z = false;
            }
            boolean z2 = zA1M | z;
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new ConnectorPermissionSectionsKt$ConnectorPermissionGroupSection$1$1(connectorPermissionGroup, str, str2, g0v, function0, g2j, connectorPermission);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, null, 0L, (G0U) objAaT, bfm, iA0d & 14, 7);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138322(c07c, connectorPermission, connectorPermissionGroup, str, str2, g0v, function0, g2j, i);
        }
    }

    public static final void EmptySkillDetailState(String str, BFM bfm, int i) {
        C7384Etj.A0Y(str, 0);
        bfm.AgG(248537218);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A04(C10G.A02, 24.0f), C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, (iA0d & 14) | 48, 0, 16304);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, i);
        }
    }

    public static final void SkillPermissionGroupSection(C07C c07c, String str, SkillPermissionGroupUiModel skillPermissionGroupUiModel, SkillPermissionsUiState skillPermissionsUiState, String str2, G0U<? super String, Unit> g0u, Function0<Unit> function0, G0U<? super SkillPermissionMethodUiModel, Unit> g0u2, G0V<? super SkillPermissionMethodUiModel, ? super ConnectorPermissionMode, Unit> g0v, BFM bfm, int i) {
        C7384Etj.A0Y(c07c, 0);
        AnonymousClass005.A11(str, skillPermissionGroupUiModel, skillPermissionsUiState, 1);
        AnonymousClass003.A0z(g0u, function0);
        C60O.A1N(g0u2, 7, g0v);
        bfm.AgG(-2112352779);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, skillPermissionGroupUiModel);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, skillPermissionsUiState);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str2);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0u);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, function0);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, g0u2);
        }
        if ((100663296 & i) == 0) {
            iA0d |= AnonymousClass004.A0b(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(38347923 & iA0d, 38347922), bfm, iA0d)) {
            ConnectorPermissionGroupHeader(str, bfm, (iA0d >> 3) & 14);
            boolean zA1M = AnonymousClass003.A1M(bfm, skillPermissionGroupUiModel, skillPermissionsUiState) | AnonymousClass003.A1F(29360128, iA0d, 8388608) | AnonymousClass005.A1L(iA0d) | AnonymousClass007.A1H(iA0d) | AnonymousClass005.A1B(iA0d) | ((234881024 & iA0d) == 67108864);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new ConnectorPermissionSectionsKt$SkillPermissionGroupSection$1$1(skillPermissionGroupUiModel, skillPermissionsUiState, g0u2, str2, g0u, function0, g0v);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, null, 0L, (G0U) objAaT, bfm, iA0d & 14, 7);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138362(c07c, str, skillPermissionGroupUiModel, skillPermissionsUiState, str2, g0u, function0, g0u2, g0v, i);
        }
    }

    public static final void ConnectorPermissionTargetWithContextMenu(String str, ConnectorPermissionMode connectorPermissionMode, AHD<? extends ConnectorPermissionMode> ahd, boolean z, boolean z2, boolean z3, Function0<Unit> function0, Function0<Unit> function02, G0U<? super ConnectorPermissionMode, Unit> g0u, BFM bfm, int i, int i2) {
        AHD<? extends ConnectorPermissionMode> ahd2 = ahd;
        bfm.AgG(-872515779);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, AnonymousClass003.A0K(connectorPermissionMode));
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, ahd2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z2);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0s(bfm, z3);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, function0);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, function02);
        }
        if ((100663296 & i) == 0) {
            iA0d |= AnonymousClass004.A0b(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(38347923 & iA0d, 38347922), bfm, iA0d)) {
            AHD<? extends ConnectorPermissionMode> ahd3 = i3 == 0 ? ahd2 : null;
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            int i4 = iA0d >> 6;
            ConnectorPermissionTargetRow(str, connectorPermissionMode, z2, z3, function0, bfm, AnonymousClass002.A08(i4, iA0d & 126) | (57344 & i4));
            PermissionModeContextMenuKt.PermissionModeContextMenu(c0z7.A4C(C2VU.A0A, bs0), z, ahd3, null, null, function02, g0u, bfm, (i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (iA0d & 896) | (458752 & i4) | (3670016 & i4), 24);
            BBI.A0R(bbi, true);
            ahd2 = ahd3;
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138342(str, connectorPermissionMode, ahd2, z, z2, z3, function0, function02, g0u, i, i2);
        }
    }

    public static final void SkillPermissionsSections(C07C c07c, String str, BFM bfm, int i) {
        boolean zA1b = AnonymousClass004.A1b(c07c, str);
        bfm.AgG(1763625203);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            G0U<String, Unit> g0uRememberConnectorScopeAccessRequester = ConnectorScopeAccessRequesterKt.rememberConnectorScopeAccessRequester(str, null, bfm, (iA0d >> 3) & 14, 2);
            String strA0M = FGI.A0M("SkillPermissionsViewModel:", str);
            SkillPermissionsViewModel.Factory factory = new SkillPermissionsViewModel.Factory(abstractC3358CGzA0h, str);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            SkillPermissionsViewModel skillPermissionsViewModel = (SkillPermissionsViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), strA0M, C3cG.A0x(SkillPermissionsViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, skillPermissionsViewModel.uiState);
            if (C60Q.A0R(c1boA02).loadingState == SkillPermissionsLoadingState.IDLE || C60Q.A0R(c1boA02).loadingState == SkillPermissionsLoadingState.LOADING) {
                bfm.AgE(-175882697);
                HatchScreenLoadingStateKt.HatchScreenLoadingState(C10G.A04(C10G.A02, 240.0f), bfm, 6, zA1b ? 1 : 0);
            } else if (C60Q.A0R(c1boA02).loadingState == SkillPermissionsLoadingState.ERROR) {
                bfm.AgE(-175723915);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12012a);
                boolean zA67 = bfm.A67(skillPermissionsViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new ConnectorPermissionSectionsKt$SkillPermissionsSections$1$1(skillPermissionsViewModel);
                    bfm.Ai0(objAaT);
                }
                HatchScreenErrorStateKt.HatchScreenErrorState(strA01, (Function0) ((InterfaceC7353EnQ) objAaT), C10G.A04(C10G.A02, 240.0f), null, null, null, null, bfm, 384, 120);
            } else {
                AHD<SkillPermissionSectionUiModel> ahd = C60Q.A0R(c1boA02).sections;
                if ((ahd instanceof Collection) && ahd.isEmpty()) {
                    C60R.A11(bfm, -175393362);
                } else {
                    Iterator it = ahd.iterator();
                    while (it.hasNext()) {
                        AHD<SkillPermissionGroupUiModel> ahd2 = ((SkillPermissionSectionUiModel) it.next()).groups;
                        if (!(ahd2 instanceof Collection) || !ahd2.isEmpty()) {
                            Iterator it2 = ahd2.iterator();
                            while (it2.hasNext()) {
                                if (!((SkillPermissionGroupUiModel) it2.next()).methods.isEmpty()) {
                                    bfm.AgE(-175247786);
                                    boolean zA1C = AnonymousClass003.A1C(iA0d);
                                    Object objAaT2 = bfm.AaT();
                                    if (zA1C || objAaT2 == C78N.A00) {
                                        objAaT2 = AnonymousClass004.A11(bfm, null);
                                    }
                                    MutableState mutableState = (MutableState) objAaT2;
                                    boolean z = false;
                                    for (SkillPermissionSectionUiModel skillPermissionSectionUiModel : C60Q.A0R(c1boA02).sections) {
                                        bfm.AgE(-1668215357);
                                        for (SkillPermissionGroupUiModel skillPermissionGroupUiModel : skillPermissionSectionUiModel.groups) {
                                            if (skillPermissionGroupUiModel.methods.isEmpty()) {
                                                AnonymousClass003.A0l(bfm, 482477256);
                                            } else {
                                                bfm.AgE(481515295);
                                                if (z) {
                                                    C01N.A06(bfm, C3cG.A09(bfm, 481522084));
                                                } else {
                                                    bfm.AgE(481587432);
                                                }
                                                BBI bbiA07 = C3cG.A07(bfm);
                                                bfm.AgE(-400102464);
                                                String strA012 = skillPermissionGroupUiModel.label;
                                                if (C7BY.A0j(strA012)) {
                                                    strA012 = skillPermissionSectionUiModel.label;
                                                    if (strA012 == null) {
                                                        bfm.AgE(-1433568155);
                                                        strA012 = AbstractC2271BQs.A01(bfm, R.string.device_details_manage_permissions_header);
                                                    } else {
                                                        bfm.AgE(-1433569488);
                                                    }
                                                    BBI.A0R(bbiA07, zA1b);
                                                }
                                                BBI.A0R(bbiA07, zA1b);
                                                SkillPermissionsUiState skillPermissionsUiStateA0R = C60Q.A0R(c1boA02);
                                                String strA05 = MutableState.A05(mutableState);
                                                boolean zA65 = bfm.A65(mutableState);
                                                Object objAaT3 = bfm.AaT();
                                                if (zA65 || objAaT3 == C78N.A00) {
                                                    objAaT3 = new ConnectorPermissionSectionsKt$SkillPermissionsSections$3$1$2$1(mutableState);
                                                    bfm.Ai0(objAaT3);
                                                }
                                                G0U g0u = (G0U) objAaT3;
                                                boolean zA652 = bfm.A65(mutableState);
                                                Object objAaT4 = bfm.AaT();
                                                if (zA652 || objAaT4 == C78N.A00) {
                                                    objAaT4 = new ConnectorPermissionSectionsKt$SkillPermissionsSections$3$1$3$1(mutableState);
                                                    bfm.Ai0(objAaT4);
                                                }
                                                Function0 function0 = (Function0) objAaT4;
                                                boolean zA653 = bfm.A65(g0uRememberConnectorScopeAccessRequester);
                                                Object objAaT5 = bfm.AaT();
                                                if (zA653 || objAaT5 == C78N.A00) {
                                                    objAaT5 = new ConnectorPermissionSectionsKt$SkillPermissionsSections$3$1$4$1(g0uRememberConnectorScopeAccessRequester);
                                                    bfm.Ai0(objAaT5);
                                                }
                                                G0U g0u2 = (G0U) objAaT5;
                                                boolean zA672 = bfm.A67(skillPermissionsViewModel);
                                                Object objAaT6 = bfm.AaT();
                                                if (zA672 || objAaT6 == C78N.A00) {
                                                    objAaT6 = new ConnectorPermissionSectionsKt$SkillPermissionsSections$3$1$5$1(skillPermissionsViewModel);
                                                    bfm.Ai0(objAaT6);
                                                }
                                                SkillPermissionGroupSection(c07c, strA012, skillPermissionGroupUiModel, skillPermissionsUiStateA0R, strA05, g0u, function0, g0u2, (G0V) objAaT6, bfm, iA0d & 14);
                                                BBI.A0R(bbiA07, zA1b);
                                                z = true;
                                            }
                                        }
                                        AnonymousClass001.A1D(bfm);
                                    }
                                }
                            }
                        }
                    }
                    C60R.A11(bfm, -175393362);
                }
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(c07c, str, i);
        }
    }

    public static final void ConnectorPermissionGroupHeader(String str, BFM bfm, int i) {
        bfm.AgG(1015044050);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA0B = C3U4.A0B(C10G.A02, AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingXsmall);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            BRg bRgAiP = C90m.A00.AiP(bs0, 1.0f, true);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ConnectorPermissionSectionsKt$ConnectorPermissionGroupHeader$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA012 = ARD.A01(bRgAiP, (G0U) objAaT, false);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRgA012, C3cH.A07(bfm, auraTheme), auraTheme.getTypography(bfm, 6).footnoteMedium, null, null, null, false, 0, 1, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14832);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, i);
        }
    }

    public static final void ConnectorPermissionTargetRow(String str, ConnectorPermissionMode connectorPermissionMode, boolean z, boolean z2, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(-195049128);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, AnonymousClass003.A0K(connectorPermissionMode));
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA0B = C3U4.A0B(C0v5.A01(null, null, AnonymousClass001.A0V(C10G.A02, 61.0f), C3cG.A0A(0), null, function0, z), 20.0f, 14.0f);
            C1AC c1ac = C2VU.A04;
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, c1ac);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0W);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, c90m.AiP(bs0, 1.0f, true), C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 5, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14832);
            if (z2) {
                bfm.AgE(-1115041760);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A07(bs0, 20.0f), null, 0L, bfm, 6, 6);
            } else {
                bfm.AgE(-206466569);
                BRg bRgA0C = C3U4.A0C(bs0, AuraDimensKt.SpacingMedium, 0.0f, 0.0f, 0.0f);
                InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, c1ac, 4.0f);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA0C);
                AnonymousClass005.A0n(bfm, bbi, function02);
                BPg.A02(bfm, interfaceC1380AiAA0V, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                AuraTextKt.m2639AuraTextUY9GdpU(PermissionModeContextMenuKt.permissionModeShortLabel(connectorPermissionMode, bfm, (iA0d >> 3) & 14), null, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.chevron_up_down_wght400_outline_24, 0), AuraIconSize.X_TINY, null, ColorExtKt.m2544applyContentAlphaek8zF_U(C3cH.A05(bfm, auraTheme), bfm, 0), null, bfm, AnonymousClass001.A04(), 33);
                BBI.A0R(bbi, true);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138332(str, connectorPermissionMode, z, z2, function0, i);
        }
    }

    public static final void RestrictedPermissionTargetRow(String str, String str2, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(-1899575412);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA0C = C3U4.A0C(AnonymousClass001.A0V(C10G.A02, 80.0f), 20.0f, 10.0f, 0.0f, 10.0f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0W);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgAiP = C90m.A00.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A07(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 5, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14834);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 5, 2, null, null, null, bfm, ((iA0d >> 3) & 14) | 805306368, 6, 14834);
            BBI.A0R(bbi, true);
            BRg bRgA0C2 = C3U4.A0C(C0v5.A05(C10G.A09(bs0, 48.0f, 48.0f), null, function0, true), AuraDimensKt.SpacingMedium, 0.0f, 20.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0C2);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120135), null, auraTheme.getColors(bfm, 6).link, auraTheme.getTypography(bfm, 6).subheadlineMedium, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138352(str, str2, function0, i);
        }
    }
}
