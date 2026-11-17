package com.facebook.aura.tabs;

import X.AIW;
import X.AKH;
import X.AKQ;
import X.ARD;
import X.AbstractC07539Wl;
import X.AbstractC0885AGm;
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
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0861A6i;
import X.C0924AIa;
import X.C0dx;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1DI;
import X.C1b8;
import X.C2CK;
import X.C3Ue;
import X.C3bM;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C9hr;
import X.F0C;
import X.F60;
import X.G0V;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.activity.ComponentActivity;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchClickPoint;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchEventSubtype;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.library.repo.ArtifactItem;
import com.facebook.aura.library.repo.ArtifactSource;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.AuraInternalSettingsScreenKey;
import com.facebook.aura.navigation.key.HatchConnectorCatalogScreenKey;
import com.facebook.aura.navigation.key.HatchSettingsPushScreenKey;
import com.facebook.aura.navigation.key.InternalSettingsPage;
import com.facebook.aura.navigation.key.PeerSpaceScreenKey;
import com.facebook.aura.navigation.key.SpaceTabScreenKey;
import com.facebook.aura.tabs.AuraTabItem;
import com.facebook.aura.tabs.TabBadgeViewModel;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsIconTint;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraFixedNavBarKt {
    public static final float COLLAPSED_GLYPH_SIZE = 24.0f;
    public static final float COMPACT_TAB_SLOT_WIDTH = 64.0f;
    public static final int CONNECTED_APPS_LONG_PRESS_INDEX = 2;
    public static final int HATCH_SETTINGS_LONG_PRESS_INDEX = 0;
    public static final int INTERNAL_SETTINGS_LONG_PRESS_INDEX = 4;
    public static final float SPACE_ICON_SLOT_SIZE = 32.0f;
    public static final float TABS_HORIZONTAL_INSET = 40.0f;
    public static final float TAB_BADGE_SIZE = 10.0f;
    public static final float TAB_RAIL_SLOT_HEIGHT = 52.0f;
    public static final float TAB_RAIL_WIDTH = 56.0f;
    public static final float UNSELECTED_TAB_ICON_ALPHA = 0.7f;

    /* renamed from: com.facebook.aura.tabs.AuraFixedNavBarKt$AuraTabRail$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
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
            AuraFixedNavBarKt.AuraTabRail(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraFixedNavBarKt$FixedTabSlot$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ TabBadgeType $badgeType;
        public final /* synthetic */ C0dx $haptic;
        public final /* synthetic */ float $iconAlpha;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ Function0<Unit> $onLongClick;
        public final /* synthetic */ Function0<Unit> $onOtherTabSelected;
        public final /* synthetic */ Function0<Unit> $onTabReselected;
        public final /* synthetic */ FixedTab $tab;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(FixedTab fixedTab, boolean z, TabBadgeType tabBadgeType, AuraNavigator auraNavigator, C0dx c0dx, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, float f, int i, int i2) {
            super(2);
            this.$tab = fixedTab;
            this.$isSelected = z;
            this.$badgeType = tabBadgeType;
            this.$navigator = auraNavigator;
            this.$haptic = c0dx;
            this.$onLongClick = function0;
            this.$onTabReselected = function02;
            this.$onOtherTabSelected = function03;
            this.$modifier = bRg;
            this.$iconAlpha = f;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraFixedNavBarKt.FixedTabSlot(this.$tab, this.$isSelected, this.$badgeType, this.$navigator, this.$haptic, this.$onLongClick, this.$onTabReselected, this.$onOtherTabSelected, this.$modifier, this.$iconAlpha, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraFixedNavBarKt$SpaceTabSlot$5, reason: invalid class name and case insensitive filesystem */
    public final class C142305 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C0dx $haptic;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ boolean $isSaved;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ Function0<Unit> $onLongClick;
        public final /* synthetic */ Function0<Unit> $onOtherTabSelected;
        public final /* synthetic */ Function0<Unit> $onTabReselected;
        public final /* synthetic */ PeerSpaceScreenKey $peerSpaceKey;
        public final /* synthetic */ String $slug;
        public final /* synthetic */ String $spaceId;
        public final /* synthetic */ String $xmdsIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142305(String str, String str2, String str3, String str4, boolean z, PeerSpaceScreenKey peerSpaceScreenKey, boolean z2, String str5, boolean z3, AuraNavigator auraNavigator, C0dx c0dx, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$slug = str;
            this.$label = str2;
            this.$iconUrl = str3;
            this.$xmdsIcon = str4;
            this.$isSaved = z;
            this.$peerSpaceKey = peerSpaceScreenKey;
            this.$isLoading = z2;
            this.$spaceId = str5;
            this.$isSelected = z3;
            this.$navigator = auraNavigator;
            this.$haptic = c0dx;
            this.$onLongClick = function0;
            this.$onTabReselected = function02;
            this.$onOtherTabSelected = function03;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraFixedNavBarKt.SpaceTabSlot(this.$slug, this.$label, this.$iconUrl, this.$xmdsIcon, this.$isSaved, this.$peerSpaceKey, this.$isLoading, this.$spaceId, this.$isSelected, this.$navigator, this.$haptic, this.$onLongClick, this.$onTabReselected, this.$onOtherTabSelected, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraFixedNavBarKt$TabIcon$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ float $alpha;
        public final /* synthetic */ boolean $isLitUp;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ boolean $isWaving;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FixedTab $tab;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FixedTab fixedTab, boolean z, boolean z2, float f, boolean z3, BRg bRg, int i, int i2) {
            super(2);
            this.$tab = fixedTab;
            this.$isSelected = z;
            this.$isLitUp = z2;
            this.$alpha = f;
            this.$isWaving = z3;
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
            AuraFixedNavBarKt.TabIcon(this.$tab, this.$isSelected, this.$isLitUp, this.$alpha, this.$isWaving, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraFixedNavBarKt$TabNotificationBadge$1, reason: invalid class name and case insensitive filesystem */
    public final class C142311 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142311(BRg bRg, int i, int i2) {
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
            AuraFixedNavBarKt.TabNotificationBadge(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraFixedNavBarKt$employeeLongClickForTabIndex$1, reason: invalid class name and case insensitive filesystem */
    public final class C142321 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142321(AuraNavigator auraNavigator) {
            super(0);
            this.$navigator = auraNavigator;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$navigator.navigate((AuraNavKey) new HatchSettingsPushScreenKey(null), false);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraFixedNavBarKt$employeeLongClickForTabIndex$2, reason: invalid class name and case insensitive filesystem */
    public final class C142332 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142332(AuraNavigator auraNavigator) {
            super(0);
            this.$navigator = auraNavigator;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$navigator.navigate((AuraNavKey) HatchConnectorCatalogScreenKey.INSTANCE, false);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraFixedNavBarKt$employeeLongClickForTabIndex$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AuraNavigator auraNavigator) {
            super(0);
            this.$navigator = auraNavigator;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AuraNavigator auraNavigator = this.$navigator;
            F0C<C9hr<Object>>[] f0cArr = AuraInternalSettingsScreenKey.$childSerializers;
            auraNavigator.navigate((AuraNavKey) new AuraInternalSettingsScreenKey(InternalSettingsPage.MAIN), false);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public static final Function0<Unit> employeeLongClickForTabIndex(int i, AuraNavigator auraNavigator, boolean z, boolean z2) {
        Function0<Unit> c142321;
        if (!z) {
            return null;
        }
        if (i == 0) {
            c142321 = new C142321(auraNavigator);
        } else if (i == 2) {
            c142321 = new C142332(auraNavigator);
        } else {
            if (i != 4 || !z2) {
                return null;
            }
            c142321 = new AnonymousClass3(auraNavigator);
        }
        return c142321;
    }

    public static final void onFixedTabClick(FixedTab fixedTab, boolean z, AuraNavigator auraNavigator, Function0<Unit> function0, Function0<Unit> function02, boolean z2) {
        AnonymousClass005.A11(fixedTab, auraNavigator, function0, 0);
        C7384Etj.A0Y(function02, 4);
        AuraNavKey modalNavKey = fixedTab.getModalNavKey();
        if (modalNavKey == null || !z2) {
            modalNavKey = fixedTab.getNavKey();
        }
        AuraNavKey auraNavKey = modalNavKey;
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.NAV_BAR, HatchSubsurface.NAV_BAR, HatchScreen.NAV_BAR, fixedTab.getLogComponent(), null, AnonymousClass006.A10(HatchMetadataKey.IS_RESELECT.getValue(), String.valueOf(z)), null);
        HatchClientCvmEventLogger.INSTANCE.logTabClick(fixedTab.getCvmTab());
        if (!z) {
            function02.invoke();
            auraNavigator.navigateWithContext(auraNavKey, HatchClickPoint.TAB_TAP, HatchEventSubtype.TAB_SWITCH, LaunchFlag.BRING_TO_FRONT);
        } else {
            if (auraNavKey instanceof AuraTabRootNavKey) {
                auraNavigator.popToTabRoot((AuraTabRootNavKey) auraNavKey);
            }
            function0.invoke();
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FixedTab.values().length];
            try {
                AnonymousClass002.A13(FixedTab.FEED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(FixedTab.CONNECTIONS, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(FixedTab.CHAT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(FixedTab.IDEAS, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(FixedTab.GOALS, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(FixedTab.LIBRARY, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0190  */
    /* renamed from: AuraFixedNavBar-XiNizjQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2287AuraFixedNavBarXiNizjQ(com.facebook.aura.navigation.AuraTabRootNavKey r47, float r48, float r49, float r50, X.BRg r51, kotlin.jvm.functions.Function0<kotlin.Unit> r52, kotlin.jvm.functions.Function0<kotlin.Unit> r53, X.BFM r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 1466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.tabs.AuraFixedNavBarKt.m2287AuraFixedNavBarXiNizjQ(com.facebook.aura.navigation.AuraTabRootNavKey, float, float, float, X.BRg, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    public static final void AuraTabRail(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(-1098076558);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRgA0Q) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraTabBarHostState auraTabBarHostState = (AuraTabBarHostState) bfm.A6v(AuraTabBarHostKt.LocalAuraTabBarHostState);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new TabBadgeViewModel.Factory(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            C1BO c1boA02 = C2CK.A02(bfm, ((TabBadgeViewModel) BQN.A00((AuraViewModelFactory) objAaT, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, new C0861A6i(TabBadgeViewModel.class))).uiState);
            boolean zA652 = bfm.A65(auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = AnonymousClass002.A0K(bfm, null, new AuraFixedNavBarKt$AuraTabRail$currentTabRoot$2$1(auraNavigatorA0b));
            }
            C1BO c1bo = (C1BO) objAaT2;
            HatchUtil hatchUtil = HatchUtil.INSTANCE;
            boolean zIsViewerEmployee = hatchUtil.isViewerEmployee();
            boolean zIsInternalSettingsEnabled = hatchUtil.isInternalSettingsEnabled();
            AuraTabLayout auraTabLayoutRememberAuraTabLayout = AuraTabLayoutKt.rememberAuraTabLayout(false, bfm, 0, 1);
            boolean zA1K = AnonymousClass003.A1K(bfm, c1bo, auraTabBarHostState);
            Object objAaT3 = bfm.AaT();
            if (zA1K || objAaT3 == C78N.A00) {
                objAaT3 = new AuraFixedNavBarKt$AuraTabRail$onTabReselected$1$1(auraTabBarHostState, c1bo);
                bfm.Ai0(objAaT3);
            }
            Function0 function0 = (Function0) objAaT3;
            BS0 bs0 = BRg.A00;
            float f = TAB_RAIL_WIDTH;
            BRg bRgA0C = C10G.A0C(bs0, f, TAB_RAIL_SLOT_HEIGHT);
            BRg bRgA00 = AbstractC07539Wl.A00(C3bM.A00(C10G.A08(bRgA0Q, f)), "hatch-tab-rail");
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, iA0J);
                bfm.AgE(1763013614);
                int i4 = 0;
                for (Object obj : auraTabLayoutRememberAuraTabLayout.tabs) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        AuraTabItem auraTabItem = (AuraTabItem) obj;
                        bfm.Ag8(-1037325632, auraTabItem.getId());
                        boolean zA1U = AnonymousClass003.A1U(bfm, zIsViewerEmployee, AnonymousClass001.A1R(bfm, auraNavigatorA0b, bfm.A63(i4)), zIsInternalSettingsEnabled);
                        Object objAaT4 = bfm.AaT();
                        if (zA1U || objAaT4 == C78N.A00) {
                            objAaT4 = employeeLongClickForTabIndex(i4, auraNavigatorA0b, zIsViewerEmployee, zIsInternalSettingsEnabled);
                            bfm.Ai0(objAaT4);
                        }
                        Function0 function03 = (Function0) objAaT4;
                        if (auraTabItem instanceof AuraTabItem.Fixed) {
                            bfm.AgE(-2091913388);
                            boolean zMatches = auraTabItem.matches((AuraTabRootNavKey) c1bo.getValue());
                            AuraTabItem.Fixed fixed = (AuraTabItem.Fixed) auraTabItem;
                            FixedTab fixedTab = fixed.tab;
                            float f2 = zMatches ? 1.0f : 0.7f;
                            TabBadgeType tabBadgeType = (TabBadgeType) ((Map) c1boA02.getValue()).get(fixed.tab);
                            Object objAaT5 = bfm.AaT();
                            if (objAaT5 == C78N.A00) {
                                objAaT5 = AuraFixedNavBarKt$AuraTabRail$1$1$1$1.INSTANCE;
                                bfm.Ai0(objAaT5);
                            }
                            FixedTabSlot(fixedTab, zMatches, tabBadgeType, auraNavigatorA0b, c0dxA0T, function03, function0, (Function0) objAaT5, bRgA0C, f2, bfm, 113246208, 0);
                        } else {
                            if (!(auraTabItem instanceof AuraTabItem.Space)) {
                                throw AnonymousClass003.A0k(bfm, bbi, -1037312899);
                            }
                            bfm.AgE(-2091293884);
                            AuraTabItem.Space space = (AuraTabItem.Space) auraTabItem;
                            ArtifactItem artifactItem = space.artifact;
                            String str = artifactItem.itemKey;
                            String strA01 = artifactItem.displayName;
                            if (C7BY.A0j(strA01) || strA01 == null) {
                                bfm.AgE(-1037285777);
                                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12060a);
                            } else {
                                bfm.AgE(-1037288319);
                            }
                            BBI.A0R(bbi, false);
                            ArtifactItem artifactItem2 = space.artifact;
                            String str2 = artifactItem2.icon;
                            String str3 = artifactItem2.xmdsIcon;
                            boolean zA1Z = AnonymousClass002.A1Z(artifactItem2.source, ArtifactSource.SAVED_SPACE);
                            PeerSpaceScreenKey peerSpaceScreenKey = AuraTabLayoutKt.toPeerSpaceScreenKey(artifactItem2);
                            boolean z = space.isLoading;
                            String str4 = space.artifact.spaceId;
                            boolean zMatches2 = auraTabItem.matches((AuraTabRootNavKey) c1bo.getValue());
                            Object objAaT6 = bfm.AaT();
                            if (objAaT6 == C78N.A00) {
                                objAaT6 = AuraFixedNavBarKt$AuraTabRail$1$1$3$1.INSTANCE;
                                bfm.Ai0(objAaT6);
                            }
                            SpaceTabSlot(str, strA01, str2, str3, zA1Z, peerSpaceScreenKey, z, str4, zMatches2, auraNavigatorA0b, c0dxA0T, function03, function0, (Function0) objAaT6, bRgA0C, bfm, 0, 27648, 0);
                        }
                        BBI.A0R(bbi, false);
                        BBI.A0R(bbi, false);
                        i4 = i5;
                    }
                }
                bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRgA0Q, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0157  */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r29v1, types: [X.BRg] */
    /* JADX WARN: Type inference failed for: r49v0, types: [X.BFM] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FixedTabSlot(com.facebook.aura.tabs.FixedTab r39, boolean r40, com.facebook.aura.tabs.TabBadgeType r41, com.facebook.aura.navigation.AuraNavigator r42, X.C0dx r43, kotlin.jvm.functions.Function0<kotlin.Unit> r44, kotlin.jvm.functions.Function0<kotlin.Unit> r45, kotlin.jvm.functions.Function0<kotlin.Unit> r46, X.BRg r47, float r48, X.BFM r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.tabs.AuraFixedNavBarKt.FixedTabSlot(com.facebook.aura.tabs.FixedTab, boolean, com.facebook.aura.tabs.TabBadgeType, com.facebook.aura.navigation.AuraNavigator, X.0dx, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, float, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SpaceTabSlot(java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, boolean r49, com.facebook.aura.navigation.key.PeerSpaceScreenKey r50, boolean r51, java.lang.String r52, boolean r53, com.facebook.aura.navigation.AuraNavigator r54, X.C0dx r55, kotlin.jvm.functions.Function0<kotlin.Unit> r56, kotlin.jvm.functions.Function0<kotlin.Unit> r57, kotlin.jvm.functions.Function0<kotlin.Unit> r58, X.BRg r59, X.BFM r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.tabs.AuraFixedNavBarKt.SpaceTabSlot(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.facebook.aura.navigation.key.PeerSpaceScreenKey, boolean, java.lang.String, boolean, com.facebook.aura.navigation.AuraNavigator, X.0dx, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int, int):void");
    }

    public static final void TabIcon(FixedTab fixedTab, boolean z, boolean z2, float f, boolean z3, BRg bRg, BFM bfm, int i, int i2) {
        int selectedIconRes;
        long j;
        BRg bRg2 = bRg;
        bfm.AgG(-946903457);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, fixedTab) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A07(bfm, f);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0r(bfm, z3);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA08 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA08 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA08, 74898), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Integer attentionIconRes = fixedTab.getAttentionIconRes();
            if (attentionIconRes != null && z3) {
                selectedIconRes = attentionIconRes.intValue();
            } else if (z || z2) {
                selectedIconRes = fixedTab.getSelectedIconRes();
            } else {
                selectedIconRes = fixedTab.getUnselectedIconRes();
                j = auraColorsIconTint.enabled;
                AnonymousClass001.A1D(bfm);
                AuraIconKt.m2567AuraIconFHprtrg(C10G.A07(bRg2, COLLAPSED_GLYPH_SIZE), BOf.A00(bfm, selectedIconRes, 0), AuraIconSize.SMALL, null, HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), B6A.A00(j) * f), null, bfm, AnonymousClass001.A03(), 40);
            }
            if (z2) {
                AnonymousClass003.A0l(bfm, 558864624);
                j = 4294948864L << 32;
                long j2 = B6A.A01;
                AuraIconKt.m2567AuraIconFHprtrg(C10G.A07(bRg2, COLLAPSED_GLYPH_SIZE), BOf.A00(bfm, selectedIconRes, 0), AuraIconSize.SMALL, null, HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), B6A.A00(j) * f), null, bfm, AnonymousClass001.A03(), 40);
            } else {
                AuraColorsIconTint auraColorsIconTint = z ? AnonymousClass003.A0c(bfm, 558866822).primaryIcon : AnonymousClass003.A0c(bfm, 558868582).secondaryIcon;
                j = auraColorsIconTint.enabled;
                AnonymousClass001.A1D(bfm);
                AuraIconKt.m2567AuraIconFHprtrg(C10G.A07(bRg2, COLLAPSED_GLYPH_SIZE), BOf.A00(bfm, selectedIconRes, 0), AuraIconSize.SMALL, null, HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), B6A.A00(j) * f), null, bfm, AnonymousClass001.A03(), 40);
            }
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(fixedTab, z, z2, f, z3, bRg2, i, i2);
        }
    }

    public static final BRg compactTabRow(BRg bRg, int i) {
        return ARD.A01(C10G.A04(C10G.A08(bRg, COMPACT_TAB_SLOT_WIDTH * i), 48.0f), new C3bM(7), false);
    }

    public static final float getTAB_RAIL_WIDTH() {
        return TAB_RAIL_WIDTH;
    }

    public static final void onSpaceTabClick(String str, String str2, boolean z, AuraNavigator auraNavigator, Function0<Unit> function0, Function0<Unit> function02) {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.NAV_BAR;
        HatchSubsurface hatchSubsurface = HatchSubsurface.NAV_BAR;
        HatchScreen hatchScreen = HatchScreen.NAV_BAR;
        HatchComponent hatchComponent = HatchComponent.SPACE_CARD;
        C0924AIa c0924AIa = new C0924AIa();
        AnonymousClass003.A0s(HatchMetadataKey.IS_RESELECT, c0924AIa, z);
        if (str2 != null) {
            AnonymousClass001.A1C(HatchMetadataKey.SPACE_ID, str2, c0924AIa);
        }
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, AIW.A0K(c0924AIa), null);
        if (z) {
            auraNavigator.popToTabRoot(new SpaceTabScreenKey(str));
            function0.invoke();
        } else {
            function02.invoke();
            auraNavigator.navigateWithContext(new SpaceTabScreenKey(str), HatchClickPoint.TAB_TAP, HatchEventSubtype.TAB_SWITCH, LaunchFlag.BRING_TO_FRONT);
        }
    }

    public static final Map<FixedTab, TabBadgeType> AuraFixedNavBar_XiNizjQ$lambda$3(C1BO<? extends Map<FixedTab, ? extends TabBadgeType>> c1bo) {
        return (Map) c1bo.getValue();
    }

    public static final Map<FixedTab, TabBadgeType> AuraTabRail$lambda$1(C1BO<? extends Map<FixedTab, ? extends TabBadgeType>> c1bo) {
        return (Map) c1bo.getValue();
    }

    public static final void TabNotificationBadge(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(2044468791);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            BRg bRgA07 = C10G.A07(bRg, TAB_BADGE_SIZE);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long j = AnonymousClass001.A0f(bfm, akh).highlight;
            C1D3 c1d3 = C1D8.A00;
            C3Ue.A04(C1b8.A03(C1DI.A02(bRgA07, c1d3, 1.0f, j), c1d3, AnonymousClass001.A0f(bfm, akh).notificationBadge), bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142311(bRg, i, i2);
        }
    }

    public static final /* synthetic */ AuraTabRootNavKey access$AuraTabRail$lambda$3(C1BO c1bo) {
        return (AuraTabRootNavKey) c1bo.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x000d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.facebook.aura.tabs.FixedTab> enabledFixedTabs(boolean r5, boolean r6) {
        /*
            X.Ey9 r0 = com.facebook.aura.tabs.FixedTab.getEntries()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        Ld:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.facebook.aura.tabs.FixedTab r1 = (com.facebook.aura.tabs.FixedTab) r1
            int[] r0 = com.facebook.aura.tabs.AuraFixedNavBarKt.WhenMappings.$EnumSwitchMapping$0
            int r0 = r1.ordinal()
            switch(r0) {
                case 0: goto L2e;
                case 1: goto L29;
                case 2: goto L2e;
                case 3: goto L2e;
                case 4: goto L2b;
                case 5: goto L2e;
                default: goto L23;
            }
        L23:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L29:
            r0 = r5
            goto L2c
        L2b:
            r0 = r6
        L2c:
            if (r0 == 0) goto Ld
        L2e:
            r4.add(r2)
            goto Ld
        L32:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.tabs.AuraFixedNavBarKt.enabledFixedTabs(boolean, boolean):java.util.List");
    }
}
