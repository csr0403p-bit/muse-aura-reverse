package com.facebook.aura.settings;

import X.AGH;
import X.AKH;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B1U;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06H;
import X.C07C;
import X.C0881AGi;
import X.C08R;
import X.C0ob;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C1YD;
import X.C1YL;
import X.C2CK;
import X.C3U4;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
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
import com.facebook.aura.header.view.HatchBackClickAnalytics;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.permissions.defaults.PermissionDefaultMode;
import com.facebook.aura.permissions.defaults.PermissionDefaultOptionContent;
import com.facebook.aura.permissions.defaults.PermissionDefaultSurfaceContent;
import com.facebook.aura.permissions.defaults.PermissionDefaultsStore;
import com.facebook.aura.permissions.defaults.PermissionSettings;
import com.facebook.aura.settings.HatchPermissionsSettingsViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.view.HatchConnectorPermissionsListScreenKt;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.header.AuraSectionHeaderKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchPermissionsSettingsScreenKt {

    /* renamed from: com.facebook.aura.settings.HatchPermissionsSettingsScreenKt$HatchPermissionsSettingsScreen$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ int $connectorCount;
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, AuraNavigator auraNavigator) {
            super(4);
            this.$connectorCount = i;
            this.$navigator = auraNavigator;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1961invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1961invokei1RSzL4(float f, float f2, BFM bfm, int i) {
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
            int i2 = this.$connectorCount;
            AuraNavigator auraNavigator = this.$navigator;
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
            HatchPermissionsSettingsScreenKt.PermissionDefaultsSections(c90l, bfm, 6);
            G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchPermissionsSettingsScreenKt.lambda$1857477928;
            boolean zA1T = AnonymousClass001.A1T(bfm, auraNavigator, bfm.A63(i2));
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new HatchPermissionsSettingsScreenKt$HatchPermissionsSettingsScreen$1$1$1$1(i2, auraNavigator);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, g0v, 0L, (G0U) objAaT, bfm, 390, 5);
            C01N.A04(bfm, bbi, bs0, f2 + C06G.A01(bfm, akh), true);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchPermissionsSettingsScreenKt$HatchPermissionsSettingsScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPermissionsSettingsScreenKt.HatchPermissionsSettingsScreen(this.$onBack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchPermissionsSettingsScreenKt$PermissionDefaultOptionCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C135632 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $checked;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ PermissionDefaultMode $mode;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<PermissionDefaultMode, Unit> $onSelected;
        public final /* synthetic */ String $permissionKey;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C135632(String str, String str2, boolean z, String str3, PermissionDefaultMode permissionDefaultMode, boolean z2, G0U<? super PermissionDefaultMode, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$checked = z;
            this.$permissionKey = str3;
            this.$mode = permissionDefaultMode;
            this.$enabled = z2;
            this.$onSelected = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPermissionsSettingsScreenKt.PermissionDefaultOptionCard(this.$title, this.$subtitle, this.$checked, this.$permissionKey, this.$mode, this.$enabled, this.$onSelected, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchPermissionsSettingsScreenKt$PermissionDefaultsSection$1, reason: invalid class name and case insensitive filesystem */
    public final class C135641 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ PermissionDefaultSurfaceContent $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135641(PermissionDefaultSurfaceContent permissionDefaultSurfaceContent) {
            super(2);
            this.$content = permissionDefaultSurfaceContent;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AuraSectionHeaderKt.AuraSectionHeader(this.$content.heading, null, null, bfm, 48, 4);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchPermissionsSettingsScreenKt$PermissionDefaultsSection$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ PermissionDefaultSurfaceContent $content;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ G0U<PermissionDefaultMode, Unit> $onSelected;
        public final /* synthetic */ String $permissionKey;
        public final /* synthetic */ PermissionDefaultMode $selected;
        public final /* synthetic */ C07C $this_PermissionDefaultsSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(C07C c07c, PermissionDefaultSurfaceContent permissionDefaultSurfaceContent, PermissionDefaultMode permissionDefaultMode, String str, boolean z, G0U<? super PermissionDefaultMode, Unit> g0u, int i) {
            super(2);
            this.$this_PermissionDefaultsSection = c07c;
            this.$content = permissionDefaultSurfaceContent;
            this.$selected = permissionDefaultMode;
            this.$permissionKey = str;
            this.$enabled = z;
            this.$onSelected = g0u;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPermissionsSettingsScreenKt.PermissionDefaultsSection(this.$this_PermissionDefaultsSection, this.$content, this.$selected, this.$permissionKey, this.$enabled, this.$onSelected, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchPermissionsSettingsScreenKt$PermissionDefaultsSections$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ C07C $this_PermissionDefaultsSections;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(C07C c07c, int i) {
            super(2);
            this.$this_PermissionDefaultsSections = c07c;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPermissionsSettingsScreenKt.PermissionDefaultsSections(this.$this_PermissionDefaultsSections, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchPermissionsSettingsScreen(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(943473882);
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
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, bRg2, null, 0L, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f52), null, function0, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, new HatchBackClickAnalytics(HatchSurface.SETTINGS, HatchScreen.PERMISSIONS), false, B1V.A00(bfm, new AnonymousClass1(HatchConnectorPermissionsListScreenKt.rememberConnectorPermissionsCount(bfm, 0), auraNavigatorA0b), -812428065), bfm, (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6 | ((iA0T << 18) & 3670016), 0, (HatchBackClickAnalytics.$stable << 21) | 805306368, 402653100);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void PermissionDefaultOptionCard(String str, String str2, boolean z, String str3, PermissionDefaultMode permissionDefaultMode, boolean z2, G0U<? super PermissionDefaultMode, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1519469905);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str3);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0G(bfm, permissionDefaultMode.ordinal());
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0s(bfm, z2);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, g0u);
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA0d |= iA0k;
        } else if ((12582912 & i) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA0d |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1E(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraCardType.None none = AuraCardType.None.INSTANCE;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            C1YD c1ydA0A = C3cG.A0A(3);
            boolean zA1M = AnonymousClass004.A1M(iA0d) | AnonymousClass004.A1K(iA0d) | AnonymousClass005.A1L(iA0d) | AnonymousClass005.A1C(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new HatchPermissionsSettingsScreenKt$PermissionDefaultOptionCard$1$1(z, str3, permissionDefaultMode, g0u);
                bfm.Ai0(objAaT);
            }
            BRg bRgA00 = C0ob.A00(bRgA0R, c1ydA0A, (Function0) objAaT, z, z2);
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            G0W<C08R, BFM, Integer, Unit> g0w = null;
            C0881AGi c0881AGi = C0881AGi.A00;
            long j = 0;
            AuraCardContent auraCardContent = new AuraCardContent(new ApQ(str, c0881AGi), auraIconAndHeadlineStyle, (BO6) null, (B6A) (0 == true ? 1 : 0), new ApQ(str2, c0881AGi), (G0U) (0 == true ? 1 : 0), (AuraIconAndBodyStyle) (0 == true ? 1 : 0), (B6A) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), 0, (int) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), (ApQ) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), j, j, (C1YL) (0 == true ? 1 : 0), 2097132, (C06H) (0 == true ? 1 : 0));
            if (z) {
                g0w = ComposableSingletons$HatchPermissionsSettingsScreenKt.lambda$206825769;
            }
            AuraCardKt.m2484AuraCardjQVUvHA(bRgA00, auraCardStyleCardStyleForSettings, auraCardContent, none, null, g0w, null, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 3072, 0, 262096);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135632(str, str2, z, str3, permissionDefaultMode, z2, g0u, bRg2, i, i2);
        }
    }

    public static final void logPermissionDefaultSelected(String str, PermissionDefaultMode permissionDefaultMode) {
        HatchInteractionLogger.INSTANCE.logToggle(true, HatchSurface.SETTINGS, HatchSubsurface.PERMISSIONS, HatchScreen.PERMISSIONS, HatchComponent.PERMISSION_ROW, null, AGH.A0D(AnonymousClass006.A12(HatchMetadataKey.PERMISSION_KEY, str), C3cG.A0r(HatchMetadataKey.PERMISSION_MODE.getValue(), permissionDefaultMode.getWireValue())));
    }

    public static final void PermissionDefaultsSection(C07C c07c, PermissionDefaultSurfaceContent permissionDefaultSurfaceContent, PermissionDefaultMode permissionDefaultMode, String str, boolean z, G0U<? super PermissionDefaultMode, Unit> g0u, BFM bfm, int i) {
        bfm.AgG(-1485837141);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, permissionDefaultSurfaceContent);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, AnonymousClass003.A0K(permissionDefaultMode));
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            B1U b1uA00 = B1V.A00(bfm, new C135641(permissionDefaultSurfaceContent), 2141461758);
            boolean zA67 = bfm.A67(permissionDefaultSurfaceContent) | AnonymousClass003.A1D(iA0d) | AnonymousClass003.A1E(iA0d) | AnonymousClass003.A1F(57344, iA0d, 16384) | ((458752 & iA0d) == 131072);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchPermissionsSettingsScreenKt$PermissionDefaultsSection$2$1(permissionDefaultSurfaceContent, permissionDefaultMode, str, z, g0u);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, b1uA00, 0L, (G0U) objAaT, bfm, (iA0d & 14) | 384, 5);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(c07c, permissionDefaultSurfaceContent, permissionDefaultMode, str, z, g0u, i);
        }
    }

    public static final void PermissionDefaultsSections(C07C c07c, BFM bfm, int i) {
        bfm.AgG(-790374607);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            HatchPermissionsSettingsViewModel.Factory factory = new HatchPermissionsSettingsViewModel.Factory(AnonymousClass002.A0h(bfm));
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            HatchPermissionsSettingsViewModel hatchPermissionsSettingsViewModel = (HatchPermissionsSettingsViewModel) AnonymousClass004.A14(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), HatchPermissionsSettingsViewModel.class);
            C1BO c1boA02 = C2CK.A02(bfm, hatchPermissionsSettingsViewModel.uiState);
            PermissionSettings permissionSettings = ((PermissionDefaultsUiState) c1boA02.getValue()).settings;
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(hatchPermissionsSettingsViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchPermissionsSettingsScreenKt$PermissionDefaultsSections$1$1(hatchPermissionsSettingsViewModel);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, unit);
            PermissionDefaultSurfaceContent permissionDefaultSurfaceContentBundledDefaultsContent = permissionSettings.connectorContent;
            if (permissionDefaultSurfaceContentBundledDefaultsContent == null) {
                bfm.AgE(659229739);
                permissionDefaultSurfaceContentBundledDefaultsContent = bundledDefaultsContent(R.string._name_removed__res_0x7f120f4e, R.string._name_removed__res_0x7f120f4b, R.string._name_removed__res_0x7f120f48, bfm, 0);
            } else {
                bfm.AgE(659228406);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            PermissionDefaultMode permissionDefaultMode = permissionSettings.connectorDefault;
            if (!((PermissionDefaultsUiState) c1boA02.getValue()).isServerConfirmed) {
                permissionDefaultMode = null;
            }
            boolean z = !((PermissionDefaultsUiState) c1boA02.getValue()).isUpdating;
            boolean zA672 = bfm.A67(hatchPermissionsSettingsViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchPermissionsSettingsScreenKt$PermissionDefaultsSections$3$1(hatchPermissionsSettingsViewModel);
                bfm.Ai0(objAaT2);
            }
            int i2 = (iA0d & 14) | 3072;
            PermissionDefaultsSection(c07c, permissionDefaultSurfaceContentBundledDefaultsContent, permissionDefaultMode, PermissionDefaultsStore.KEY_CONNECTOR_DEFAULT, z, (G0U) ((InterfaceC7353EnQ) objAaT2), bfm, i2);
            BS0 bs0 = BRg.A00;
            float f = AuraDimensKt.SpacingMedium;
            C01N.A08(bfm, bs0, f);
            PermissionDefaultSurfaceContent permissionDefaultSurfaceContentBundledDefaultsContent2 = permissionSettings.networkContent;
            if (permissionDefaultSurfaceContentBundledDefaultsContent2 == null) {
                bfm.AgE(659252195);
                permissionDefaultSurfaceContentBundledDefaultsContent2 = bundledDefaultsContent(R.string._name_removed__res_0x7f120f53, R.string._name_removed__res_0x7f120f4d, R.string._name_removed__res_0x7f120f4a, bfm, 0);
            } else {
                bfm.AgE(659250924);
            }
            BBI.A0R(bbiA07, false);
            PermissionDefaultMode permissionDefaultMode2 = ((PermissionDefaultsUiState) c1boA02.getValue()).isServerConfirmed ? permissionSettings.networkDefault : null;
            boolean z2 = !((PermissionDefaultsUiState) c1boA02.getValue()).isUpdating;
            boolean zA673 = bfm.A67(hatchPermissionsSettingsViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA673 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchPermissionsSettingsScreenKt$PermissionDefaultsSections$5$1(hatchPermissionsSettingsViewModel);
                bfm.Ai0(objAaT3);
            }
            PermissionDefaultsSection(c07c, permissionDefaultSurfaceContentBundledDefaultsContent2, permissionDefaultMode2, "web_access_default", z2, (G0U) ((InterfaceC7353EnQ) objAaT3), bfm, i2);
            C01N.A08(bfm, bs0, f);
            ConfidentialVmSettingsSectionKt.ConfidentialVmSettingsSection(true, C3U4.A03(bs0, f), bfm, 6, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass6(c07c, i);
        }
    }

    public static final PermissionDefaultSurfaceContent bundledDefaultsContent(int i, int i2, int i3, BFM bfm, int i4) {
        return new PermissionDefaultSurfaceContent(AbstractC2271BQs.A01(bfm, i), new PermissionDefaultOptionContent(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f4c), AbstractC2271BQs.A01(bfm, i2)), new PermissionDefaultOptionContent(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f49), AbstractC2271BQs.A01(bfm, i3)));
    }
}
