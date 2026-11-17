package com.facebook.aura.tabs;

import X.A6B;
import X.AFs;
import X.AFz;
import X.AGI;
import X.AHD;
import X.AKQ;
import X.ATD;
import X.AVy;
import X.AXY;
import X.AYU;
import X.AZE;
import X.Ab3;
import X.AbstractC0875AGb;
import X.AbstractC0878AGe;
import X.AbstractC1396AiR;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BHP;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0v5;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1YD;
import X.C1b8;
import X.C2av;
import X.C31t;
import X.C3TG;
import X.C3U4;
import X.C3UC;
import X.C3UX;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.Ey9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.G2k;
import X.InterfaceC1134Abi;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.R;
import com.facebook.aura.library.repo.ArtifactPlacementRequest;
import com.facebook.aura.library.repo.ArtifactSource;
import com.facebook.aura.library.repo.ArtifactsDataSource;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.navigation.key.SpaceNavigationIdKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.spaces.menu.SpacesSidebarAnalytics;
import com.facebook.aura.spaces.repo.NavigationTabReference;
import com.facebook.aura.spaces.repo.NavigationTabSource;
import com.facebook.aura.spaces.repo.PinnedItemsRepository;
import com.facebook.aura.tabs.AuraTabItem;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraSidePanelTabsKt {
    public static final float FIGMA_SIDE_PANEL_GLYPH_SIZE = 24.0f;
    public static final float FIGMA_SIDE_PANEL_ICON_SLOT_SIZE = 32.0f;
    public static final float FIGMA_SIDE_PANEL_ROW_CORNER_RADIUS = 12.0f;
    public static final float FIGMA_SIDE_PANEL_ROW_VERTICAL_PADDING = 6.0f;
    public static final int SIDE_PANEL_COLLAPSE_DURATION_MS = 200;
    public static final float SIDE_PANEL_DIVIDER_HORIZONTAL_PADDING = 10.0f;
    public static final float SIDE_PANEL_SECTION_HEADER_HORIZONTAL_PADDING = 10.0f;
    public static final float SIDE_PANEL_SECTION_HEADER_VERTICAL_PADDING = 4.0f;

    /* renamed from: com.facebook.aura.tabs.AuraSidePanelTabsKt$AuraSidePanelCreateSpaceSection$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isCollapsed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCreateSpaceSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$onCreateSpaceSelected = function0;
            this.$isCollapsed = z;
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
            AuraSidePanelTabsKt.AuraSidePanelCreateSpaceSection(this.$onCreateSpaceSelected, this.$isCollapsed, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraSidePanelTabsKt$AuraSidePanelSectionHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C142342 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isCollapsed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onToggleCollapsed;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142342(String str, BRg bRg, boolean z, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$title = str;
            this.$modifier = bRg;
            this.$isCollapsed = z;
            this.$onToggleCollapsed = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSidePanelTabsKt.AuraSidePanelSectionHeader(this.$title, this.$modifier, this.$isCollapsed, this.$onToggleCollapsed, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraSidePanelTabsKt$AuraSidePanelTabs$12, reason: invalid class name */
    public final class AnonymousClass12 extends AbstractC7559F3s implements G2j<Integer, BRg, BFM, Integer, Unit> {
        public final /* synthetic */ AuraSidePanelCollapseState $collapseState;
        public final /* synthetic */ AuraTabLayout $layout;
        public final /* synthetic */ int $tabCount;
        public final /* synthetic */ boolean $tabsVisible;

        public final void invoke(int i, BRg bRg, BFM bfm, int i2) {
            int i3;
            C7384Etj.A0Y(bRg, 1);
            int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
            if ((i2 & 48) == 0) {
                iA0D |= AnonymousClass004.A0e(bfm, bRg);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 147, 146), bfm, iA0D)) {
                bfm.Afo();
                return;
            }
            if (this.$tabsVisible || i >= this.$tabCount) {
                if (i == 0) {
                    bfm.AgE(-2095642094);
                    AuraSidePanelTabsKt.SidePanelTabsHeader(this.$collapseState, this.$layout.sortingEnabled, bRg, bfm, (iA0D << 3) & 896, 0);
                } else if (i == this.$tabCount && this.$layout.spacesEnabled) {
                    bfm.AgE(2010617293);
                    AuraSidePanelCollapseState auraSidePanelCollapseState = this.$collapseState;
                    InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                    BBI bbi = (BBI) bfm;
                    int iA0J = AnonymousClass003.A0J(bbi);
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, bRg);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbi.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                    AuraSidePanelTabsKt.SidePanelTabsDivider(true, null, bfm, 6, 2);
                    String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120880);
                    boolean zA0A = MutableState.A0A(auraSidePanelCollapseState.spacesCollapsed$delegate);
                    boolean zA65 = bfm.A65(auraSidePanelCollapseState);
                    Object objAaT = bfm.AaT();
                    if (zA65 || objAaT == C78N.A00) {
                        objAaT = new AuraSidePanelTabsKt$AuraSidePanelTabs$12$1$1$1(auraSidePanelCollapseState);
                        bfm.Ai0(objAaT);
                    }
                    AuraSidePanelTabsKt.AuraSidePanelSectionHeader(strA01, null, zA0A, (Function0) objAaT, bfm, 0, 2);
                    BBI.A0R(bbi, true);
                } else {
                    i3 = 2010632756;
                }
                AnonymousClass001.A1D(bfm);
            }
            i3 = 2010605076;
            bfm.AgE(i3);
            AuraSidePanelTabsKt.SidePanelTabsDivider(false, bRg, bfm, (iA0D & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 0);
            AnonymousClass001.A1D(bfm);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(boolean z, int i, AuraTabLayout auraTabLayout, AuraSidePanelCollapseState auraSidePanelCollapseState) {
            super(4);
            this.$tabsVisible = z;
            this.$tabCount = i;
            this.$layout = auraTabLayout;
            this.$collapseState = auraSidePanelCollapseState;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, BRg bRg, BFM bfm, Integer num2) {
            invoke(AnonymousClass001.A0F(num), bRg, bfm, AnonymousClass001.A0F(num2));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraSidePanelTabsKt$AuraSidePanelTabs$13, reason: invalid class name */
    public final class AnonymousClass13 extends AbstractC7559F3s implements G2k<AuraTabItem, Boolean, BRg, BFM, Integer, Unit> {
        public final /* synthetic */ AuraTabRootNavKey $currentTabRoot;
        public final /* synthetic */ boolean $isMainChatSelected;
        public final /* synthetic */ AHD<String> $itemIds;
        public final /* synthetic */ AHD<AuraTabItem> $items;
        public final /* synthetic */ AuraTabLayout $layout;
        public final /* synthetic */ String $mainChatTitle;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ Function0<Unit> $onMainChatSelected;
        public final /* synthetic */ Function0<Unit> $onSelectedTabRemoved;
        public final /* synthetic */ AuraNavKey $openPanelKey;
        public final /* synthetic */ MutableState<String> $pendingDraggedItemId$delegate;
        public final /* synthetic */ PinnedItemsRepository $pinnedItemsRepository;
        public final /* synthetic */ MutableState<AHD<String>> $preDropOrder$delegate;
        public final /* synthetic */ MutableState<Integer> $preDropTabCount$delegate;
        public final /* synthetic */ MutableState<AuraTabItem.Space> $renameTarget$delegate;
        public final /* synthetic */ MutableState<String> $renameText$delegate;
        public final /* synthetic */ AHD<AuraTabItem> $reorderableItems;
        public final /* synthetic */ C1BO<Float> $spacesProgress$delegate;
        public final /* synthetic */ int $tabCount;
        public final /* synthetic */ C1BO<Float> $tabsProgress$delegate;
        public final /* synthetic */ boolean $tabsVisible;
        public final /* synthetic */ UnifiedArtifactsRepository $unifiedArtifactsRepository;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: Removed duplicated region for block: B:105:0x02c5  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x02d1  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x02e1 A[PHI: r6 r15
  0x02e1: PHI (r6v9 com.facebook.aura.tabs.AuraTabItem$Space) = (r6v1 com.facebook.aura.tabs.AuraTabItem$Space), (r6v10 com.facebook.aura.tabs.AuraTabItem$Space) binds: [B:54:0x00f4, B:50:0x00ea] A[DONT_GENERATE, DONT_INLINE]
  0x02e1: PHI (r15v4 com.facebook.aura.tabs.AuraTabItem$Space) = (r15v0 com.facebook.aura.tabs.AuraTabItem$Space), (r15v5 com.facebook.aura.tabs.AuraTabItem$Space) binds: [B:54:0x00f4, B:50:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:109:0x02e5  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x02e8  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x02f8  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00ec A[PHI: r6 r15
  0x00ec: PHI (r6v1 com.facebook.aura.tabs.AuraTabItem$Space) = (r6v10 com.facebook.aura.tabs.AuraTabItem$Space), (r6v12 com.facebook.aura.tabs.AuraTabItem$Space) binds: [B:50:0x00ea, B:48:0x00e7] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r15v0 com.facebook.aura.tabs.AuraTabItem$Space) = (r15v5 com.facebook.aura.tabs.AuraTabItem$Space), (r15v6 com.facebook.aura.tabs.AuraTabItem$Space) binds: [B:50:0x00ea, B:48:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0133 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01e3  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01e7  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0215  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x024f  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0253  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0299  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x029d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(com.facebook.aura.tabs.AuraTabItem r42, boolean r43, X.BRg r44, X.BFM r45, int r46) {
            /*
                Method dump skipped, instructions count: 822
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.tabs.AuraSidePanelTabsKt.AnonymousClass13.invoke(com.facebook.aura.tabs.AuraTabItem, boolean, X.BRg, X.BFM, int):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass13(AHD<String> ahd, int i, boolean z, String str, AuraTabRootNavKey auraTabRootNavKey, AuraNavKey auraNavKey, boolean z2, AuraTabLayout auraTabLayout, Function0<Unit> function0, Function0<Unit> function02, UnifiedArtifactsRepository unifiedArtifactsRepository, PinnedItemsRepository pinnedItemsRepository, AHD<? extends AuraTabItem> ahd2, AHD<? extends AuraTabItem> ahd3, AuraNavigator auraNavigator, Function0<Unit> function03, AbstractC3358CGz abstractC3358CGz, C1BO<Float> c1bo, C1BO<Float> c1bo2, MutableState<String> mutableState, MutableState<AuraTabItem.Space> mutableState2, MutableState<AHD<String>> mutableState3, MutableState<Integer> mutableState4, MutableState<String> mutableState5) {
            super(5);
            this.$itemIds = ahd;
            this.$tabCount = i;
            this.$tabsVisible = z;
            this.$mainChatTitle = str;
            this.$currentTabRoot = auraTabRootNavKey;
            this.$openPanelKey = auraNavKey;
            this.$isMainChatSelected = z2;
            this.$layout = auraTabLayout;
            this.$onMainChatSelected = function0;
            this.$onSelectedTabRemoved = function02;
            this.$unifiedArtifactsRepository = unifiedArtifactsRepository;
            this.$pinnedItemsRepository = pinnedItemsRepository;
            this.$reorderableItems = ahd2;
            this.$items = ahd3;
            this.$navigator = auraNavigator;
            this.$onDismissRequest = function03;
            this.$userSession = abstractC3358CGz;
            this.$tabsProgress$delegate = c1bo;
            this.$spacesProgress$delegate = c1bo2;
            this.$renameText$delegate = mutableState;
            this.$renameTarget$delegate = mutableState2;
            this.$preDropOrder$delegate = mutableState3;
            this.$preDropTabCount$delegate = mutableState4;
            this.$pendingDraggedItemId$delegate = mutableState5;
        }

        @Override // X.G2k
        public /* bridge */ /* synthetic */ Unit invoke(AuraTabItem auraTabItem, Boolean bool, BRg bRg, BFM bfm, Integer num) {
            invoke(auraTabItem, AnonymousClass001.A1X(bool), bRg, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraSidePanelTabsKt$AuraSidePanelTabs$15, reason: invalid class name */
    public final class AnonymousClass15 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraSidePanelCollapseState $collapseState;
        public final /* synthetic */ boolean $isMainChatSelected;
        public final /* synthetic */ String $mainChatTitle;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ Function0<Unit> $onMainChatSelected;
        public final /* synthetic */ Function0<Unit> $onSelectedTabRemoved;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass15(String str, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, AuraSidePanelCollapseState auraSidePanelCollapseState, BRg bRg, int i, int i2) {
            super(2);
            this.$mainChatTitle = str;
            this.$isMainChatSelected = z;
            this.$onMainChatSelected = function0;
            this.$onSelectedTabRemoved = function02;
            this.$onDismissRequest = function03;
            this.$collapseState = auraSidePanelCollapseState;
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
            AuraSidePanelTabsKt.AuraSidePanelTabs(this.$mainChatTitle, this.$isMainChatSelected, this.$onMainChatSelected, this.$onSelectedTabRemoved, this.$onDismissRequest, this.$collapseState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraSidePanelTabsKt$CreateSpaceRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C142362 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $emphasized;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142362(Function0<Unit> function0, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$onClick = function0;
            this.$emphasized = z;
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
            AuraSidePanelTabsKt.CreateSpaceRow(this.$onClick, this.$emphasized, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraSidePanelTabsKt$SidePanelNavigationItem$2, reason: invalid class name and case insensitive filesystem */
    public final class C142372 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $changeIconPrompt;
        public final /* synthetic */ MutableState<Boolean> $isSpaceMenuExpanded$delegate;
        public final /* synthetic */ AuraTabItem $item;
        public final /* synthetic */ String $label;
        public final /* synthetic */ G0U<String, Unit> $onChangeSpaceIcon;
        public final /* synthetic */ Function0<Unit> $onDeleteSpace;
        public final /* synthetic */ Function0<Unit> $onMoveSpaceToLibrary;
        public final /* synthetic */ Function0<Unit> $onRenameSpace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142372(AuraTabItem auraTabItem, String str, String str2, Function0<Unit> function0, G0U<? super String, Unit> g0u, Function0<Unit> function02, Function0<Unit> function03, MutableState<Boolean> mutableState) {
            super(2);
            this.$item = auraTabItem;
            this.$label = str;
            this.$changeIconPrompt = str2;
            this.$onRenameSpace = function0;
            this.$onChangeSpaceIcon = g0u;
            this.$onMoveSpaceToLibrary = function02;
            this.$onDeleteSpace = function03;
            this.$isSpaceMenuExpanded$delegate = mutableState;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AuraTabItem.Space space = (AuraTabItem.Space) this.$item;
                String str = this.$label;
                String str2 = this.$changeIconPrompt;
                boolean zA0A = MutableState.A0A((MutableState) this.$isSpaceMenuExpanded$delegate);
                MutableState<Boolean> mutableState = this.$isSpaceMenuExpanded$delegate;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = new AuraSidePanelTabsKt$SidePanelNavigationItem$2$1$1(mutableState);
                    bfm.Ai0(objAaT);
                }
                AuraSidePanelTabsKt.SidePanelSpaceMenuButton(space, str, str2, zA0A, (G0U) objAaT, this.$onRenameSpace, this.$onChangeSpaceIcon, this.$onMoveSpaceToLibrary, this.$onDeleteSpace, null, bfm, RuntimeInternals.IOPRIO_BACKGROUND, 512);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraSidePanelTabsKt$SidePanelNavigationItem$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $canReorder;
        public final /* synthetic */ boolean $isDragging;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ AuraTabItem $item;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onChangeSpaceIcon;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Function0<Unit> $onDeleteSpace;
        public final /* synthetic */ Function0<Unit> $onMoveSpaceToLibrary;
        public final /* synthetic */ G0U<AuraTabItem, Unit> $onMoveTo;
        public final /* synthetic */ Function0<Unit> $onRenameSpace;
        public final /* synthetic */ AHD<AuraTabItem> $reorderableItems;
        public final /* synthetic */ boolean $useFigmaStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(AuraTabItem auraTabItem, String str, boolean z, boolean z2, AHD<? extends AuraTabItem> ahd, boolean z3, G0U<? super AuraTabItem, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, G0U<? super String, Unit> g0u2, Function0<Unit> function03, Function0<Unit> function04, boolean z4, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$item = auraTabItem;
            this.$label = str;
            this.$isSelected = z;
            this.$isDragging = z2;
            this.$reorderableItems = ahd;
            this.$canReorder = z3;
            this.$onMoveTo = g0u;
            this.$onClick = function0;
            this.$onRenameSpace = function02;
            this.$onChangeSpaceIcon = g0u2;
            this.$onMoveSpaceToLibrary = function03;
            this.$onDeleteSpace = function04;
            this.$useFigmaStyle = z4;
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
            AuraSidePanelTabsKt.SidePanelNavigationItem(this.$item, this.$label, this.$isSelected, this.$isDragging, this.$reorderableItems, this.$canReorder, this.$onMoveTo, this.$onClick, this.$onRenameSpace, this.$onChangeSpaceIcon, this.$onMoveSpaceToLibrary, this.$onDeleteSpace, this.$useFigmaStyle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraSidePanelTabsKt$SidePanelNavigationRow$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $canReorder;
        public final /* synthetic */ Integer $iconRes;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ boolean $isDragging;
        public final /* synthetic */ boolean $isSavedSpace;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BHP $menuAction;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AHD<BHP> $moveActions;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ SidePanelSharingBadgeContent $sharingBadge;
        public final /* synthetic */ int $spaceFallbackIconRes;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingContent;
        public final /* synthetic */ boolean $useFigmaStyle;
        public final /* synthetic */ String $xmdsIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Integer num, String str, String str2, boolean z, SidePanelSharingBadgeContent sidePanelSharingBadgeContent, int i, String str3, boolean z2, boolean z3, boolean z4, AHD<BHP> ahd, BHP bhp, Function0<Unit> function0, G0V<? super BFM, ? super Integer, Unit> g0v, boolean z5, BRg bRg, int i2, int i3, int i4) {
            super(2);
            this.$iconRes = num;
            this.$iconUrl = str;
            this.$xmdsIcon = str2;
            this.$isSavedSpace = z;
            this.$sharingBadge = sidePanelSharingBadgeContent;
            this.$spaceFallbackIconRes = i;
            this.$label = str3;
            this.$isSelected = z2;
            this.$isDragging = z3;
            this.$canReorder = z4;
            this.$moveActions = ahd;
            this.$menuAction = bhp;
            this.$onClick = function0;
            this.$trailingContent = g0v;
            this.$useFigmaStyle = z5;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$changed1 = i3;
            this.$$default = i4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSidePanelTabsKt.SidePanelNavigationRow(this.$iconRes, this.$iconUrl, this.$xmdsIcon, this.$isSavedSpace, this.$sharingBadge, this.$spaceFallbackIconRes, this.$label, this.$isSelected, this.$isDragging, this.$canReorder, this.$moveActions, this.$menuAction, this.$onClick, this.$trailingContent, this.$useFigmaStyle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraSidePanelTabsKt$SidePanelSpaceMenuButton$2, reason: invalid class name and case insensitive filesystem */
    public final class C142382 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $changeIconPrompt;
        public final /* synthetic */ boolean $expanded;
        public final /* synthetic */ AuraTabItem.Space $item;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onChangeSpaceIcon;
        public final /* synthetic */ Function0<Unit> $onDeleteSpace;
        public final /* synthetic */ G0U<Boolean, Unit> $onExpandedChange;
        public final /* synthetic */ Function0<Unit> $onMoveSpaceToLibrary;
        public final /* synthetic */ Function0<Unit> $onRenameSpace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142382(AuraTabItem.Space space, String str, String str2, boolean z, G0U<? super Boolean, Unit> g0u, Function0<Unit> function0, G0U<? super String, Unit> g0u2, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2) {
            super(2);
            this.$item = space;
            this.$label = str;
            this.$changeIconPrompt = str2;
            this.$expanded = z;
            this.$onExpandedChange = g0u;
            this.$onRenameSpace = function0;
            this.$onChangeSpaceIcon = g0u2;
            this.$onMoveSpaceToLibrary = function02;
            this.$onDeleteSpace = function03;
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
            AuraSidePanelTabsKt.SidePanelSpaceMenuButton(this.$item, this.$label, this.$changeIconPrompt, this.$expanded, this.$onExpandedChange, this.$onRenameSpace, this.$onChangeSpaceIcon, this.$onMoveSpaceToLibrary, this.$onDeleteSpace, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraSidePanelTabsKt$SidePanelTabsDivider$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$visible = z;
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
            AuraSidePanelTabsKt.SidePanelTabsDivider(this.$visible, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraSidePanelTabsKt$SidePanelTabsDivider$2, reason: invalid class name and case insensitive filesystem */
    public final class C142392 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142392(boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$visible = z;
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
            AuraSidePanelTabsKt.SidePanelTabsDivider(this.$visible, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraSidePanelTabsKt$SidePanelTabsHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C142402 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraSidePanelCollapseState $collapseState;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $sortingEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142402(AuraSidePanelCollapseState auraSidePanelCollapseState, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$collapseState = auraSidePanelCollapseState;
            this.$sortingEnabled = z;
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
            AuraSidePanelTabsKt.SidePanelTabsHeader(this.$collapseState, this.$sortingEnabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraSidePanelTabsKt$sidePanelSectionCollapse$1, reason: invalid class name and case insensitive filesystem */
    public final class C142411 extends AbstractC7559F3s implements G0U<C2av, Unit> {
        public final /* synthetic */ float $progress;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C2av c2av) {
            C7384Etj.A0Y(c2av, 0);
            c2av.Acj(this.$progress);
            c2av.Ad2(true);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142411(float f) {
            super(1);
            this.$progress = f;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
            invoke2(c2av);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.tabs.AuraSidePanelTabsKt$sidePanelSectionCollapse$2, reason: invalid class name and case insensitive filesystem */
    public final class C142422 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
        public final /* synthetic */ float $progress;

        /* renamed from: com.facebook.aura.tabs.AuraSidePanelTabsKt$sidePanelSectionCollapse$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
            public final /* synthetic */ AZE $placeable;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AYU ayu) {
                C7384Etj.A0Y(ayu, 0);
                AYU.A04(ayu, this.$placeable, 0, 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AZE aze) {
                super(1);
                this.$placeable = aze;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
                invoke2(ayu);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142422(float f) {
            super(3);
            this.$progress = f;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
            return m2288invoke3p2s80s(axy, c3tg, constraints.A00);
        }

        /* renamed from: invoke-3p2s80s, reason: not valid java name */
        public final InterfaceC1134Abi m2288invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
            AnonymousClass003.A0u(axy, c3tg);
            AZE azeAQW = c3tg.AQW(j);
            return AnonymousClass002.A0X(axy, new AnonymousClass1(azeAQW), azeAQW.A01, Ab3.A01(azeAQW.A00 * this.$progress));
        }
    }

    public static final void AuraSidePanelTabs$renameSpace(C3UX c3ux, UnifiedArtifactsRepository unifiedArtifactsRepository, ArtifactsDataSource artifactsDataSource, View view, String str, String str2, MutableState<AuraTabItem.Space> mutableState, String str3, String str4) {
        AnonymousClass001.A1J(new AuraSidePanelTabsKt$AuraSidePanelTabs$renameSpace$1(unifiedArtifactsRepository, str3, str4, artifactsDataSource, view, str, str2, mutableState, null), c3ux);
    }

    public static final C1BO<Float> animateSidePanelSectionCollapse(boolean z, String str, BFM bfm, int i) {
        C7384Etj.A0Y(str, 1);
        return C31t.A01(AnonymousClass001.A0K(200, 0), bfm, AnonymousClass003.A02(z ? 1 : 0), ((i << 6) & 7168) | 48, 20);
    }

    public static final List<FixedTab> orderedFixedTabs(List<String> list) {
        C7384Etj.A0Y(list, 0);
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Iterator<FixedTab> it = FixedTab.getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    FixedTab next = it.next();
                    if (next.name().equals(str)) {
                        if (next != null) {
                            arrayList.add(next);
                        }
                    }
                }
            }
        }
        FixedTab fixedTab = FixedTab.CHAT;
        List listSingletonList = Collections.singletonList(fixedTab);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj != fixedTab) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(AbstractC0878AGe.A0X(AbstractC0878AGe.A0f(arrayList2)), listSingletonList);
        Ey9<FixedTab> entries = FixedTab.getEntries();
        ArrayList arrayList3 = new ArrayList();
        for (FixedTab fixedTab2 : entries) {
            if (!arrayListA0P.contains(fixedTab2)) {
                arrayList3.add(fixedTab2);
            }
        }
        return AbstractC0878AGe.A0P(arrayList3, arrayListA0P);
    }

    public static final AuraSidePanelCollapseState rememberAuraSidePanelCollapseState(BFM bfm, int i) {
        Object[] objArr = new Object[0];
        AFs<AuraSidePanelCollapseState, Object> aFs = AuraSidePanelCollapseState.Saver;
        Object objAaT = bfm.AaT();
        if (objAaT == C78N.A00) {
            objAaT = AuraSidePanelTabsKt$rememberAuraSidePanelCollapseState$1$1.INSTANCE;
            bfm.Ai0(objAaT);
        }
        return (AuraSidePanelCollapseState) AFz.A01(bfm, aFs, (Function0) objAaT, objArr);
    }

    public static final BRg sidePanelSectionCollapse(BRg bRg, float f) {
        C7384Etj.A0Y(bRg, 0);
        return f < 1.0f ? C3UC.A00(AbstractC1396AiR.A00(bRg, new C142411(f)), new C142422(f)) : bRg;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraSidePanelCreateSpaceSection(kotlin.jvm.functions.Function0<kotlin.Unit> r39, boolean r40, X.BRg r41, X.BFM r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.tabs.AuraSidePanelTabsKt.AuraSidePanelCreateSpaceSection(kotlin.jvm.functions.Function0, boolean, X.BRg, X.BFM, int, int):void");
    }

    public static final void AuraSidePanelSectionHeader(String str, BRg bRg, boolean z, Function0<Unit> function0, BFM bfm, int i, int i2) {
        boolean z2 = z;
        Function0<Unit> function02 = function0;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(1582945994);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
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
            iA0d |= AnonymousClass004.A0p(bfm, z2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = false;
            }
            if (i5 != 0) {
                function02 = null;
            }
            int i6 = R.string._name_removed__res_0x7f120879;
            if (z2) {
                i6 = R.string._name_removed__res_0x7f12087a;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i6);
            Locale locale = Locale.getDefault();
            C7384Etj.A0U(locale);
            String upperCase = str.toUpperCase(locale);
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).footnoteEmphasized;
            long jA09 = C06G.A09(bfm);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = AuraSidePanelTabsKt$AuraSidePanelSectionHeader$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0R, objAaT, false);
            BRg bRgA05 = BRg.A00;
            if (function02 != null) {
                bRgA05 = C0v5.A05(bRgA05, strA01, function02, true);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(upperCase, C3U4.A0B(bRgA0Y.then(bRgA05), SIDE_PANEL_SECTION_HEADER_HORIZONTAL_PADDING, SIDE_PANEL_SECTION_HEADER_VERTICAL_PADDING), jA09, c1822Arm, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142342(str, bRg2, z2, function02, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x02fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraSidePanelTabs(java.lang.String r94, boolean r95, kotlin.jvm.functions.Function0<kotlin.Unit> r96, kotlin.jvm.functions.Function0<kotlin.Unit> r97, kotlin.jvm.functions.Function0<kotlin.Unit> r98, com.facebook.aura.tabs.AuraSidePanelCollapseState r99, X.BRg r100, X.BFM r101, int r102, int r103) {
        /*
            Method dump skipped, instructions count: 1337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.tabs.AuraSidePanelTabsKt.AuraSidePanelTabs(java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.facebook.aura.tabs.AuraSidePanelCollapseState, X.BRg, X.BFM, int, int):void");
    }

    public static final void AuraSidePanelTabs$moveSpaceToLibrary(Function0<Unit> function0, UnifiedArtifactsRepository unifiedArtifactsRepository, PinnedItemsRepository pinnedItemsRepository, ArtifactPlacementRequest artifactPlacementRequest) {
        SpacesSidebarAnalytics.INSTANCE.logMoveFromSpaceMenu(artifactPlacementRequest);
        function0.invoke();
        unifiedArtifactsRepository.setArtifactPlacementDetached(artifactPlacementRequest, new AuraSidePanelTabsKt$AuraSidePanelTabs$moveSpaceToLibrary$1(pinnedItemsRepository, null));
    }

    public static final boolean AuraSidePanelTabs$persistReorderedItems(AHD<String> ahd, AuraTabLayout auraTabLayout, int i, PinnedItemsRepository pinnedItemsRepository, AuraTabRootNavKey auraTabRootNavKey, Function0<Unit> function0, MutableState<AHD<String>> mutableState, MutableState<Integer> mutableState2, MutableState<String> mutableState3, List<? extends AuraTabItem> list, AuraTabItem auraTabItem, AuraTabItem auraTabItem2, Integer num) {
        boolean z;
        List<String> listMergeVisibleNavigationOrder;
        int iIntValue;
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        Iterator<? extends AuraTabItem> it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A1A(arrayListA0m, it);
        }
        List<String> listA07 = AGI.A07(arrayListA0m);
        int iIndexOf = ahd.indexOf(auraTabItem.getId());
        int iIntValue2 = (auraTabLayout.sortingEnabled && auraTabLayout.spacesEnabled) ? num != null ? num.intValue() : tabCountAfterMove(i, auraTabLayout.tabCapacity, iIndexOf, auraTabItem2 != null ? ahd.indexOf(auraTabItem2.getId()) : -1) : i;
        boolean z2 = false;
        if (C7384Etj.areEqual(listA07, ahd) && iIntValue2 == i) {
            mutableState.Af8(null);
            mutableState2.Af8(null);
            mutableState3.Af8(null);
        } else {
            mutableState.Af8(ahd);
            MutableState.A07(i, mutableState2);
            mutableState3.Af8(auraTabItem.getId());
            if (auraTabLayout.sortingEnabled && auraTabLayout.spacesEnabled) {
                z = false;
                listMergeVisibleNavigationOrder = listA07;
            } else {
                z = true;
                ArrayList arrayList = new ArrayList();
                for (AuraTabItem auraTabItem3 : list) {
                    if (!isMainChat(auraTabItem3)) {
                        arrayList.add(auraTabItem3);
                    }
                }
                ArrayList arrayListA0m2 = AnonymousClass002.A0m(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    AnonymousClass007.A1A(arrayListA0m2, it2);
                }
                AHD<String> value = pinnedItemsRepository.navigationOrder.getValue();
                AHD<AuraTabItem> ahd2 = auraTabLayout.items;
                ArrayList arrayListA0m3 = AnonymousClass002.A0m(ahd2);
                Iterator it3 = ahd2.iterator();
                while (it3.hasNext()) {
                    AnonymousClass007.A1A(arrayListA0m3, it3);
                }
                listMergeVisibleNavigationOrder = mergeVisibleNavigationOrder(value, arrayListA0m2, arrayListA0m3);
            }
            ArrayList arrayListA0P = AbstractC0878AGe.A0P(list, auraTabLayout.items);
            ArrayList arrayList2 = new ArrayList();
            Iterator it4 = arrayListA0P.iterator();
            while (it4.hasNext()) {
                Object next = it4.next();
                if (next instanceof AuraTabItem.Space) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((AuraTabItem.Space) obj).artifact.source == ArtifactSource.SAVED_SPACE) {
                    arrayList3.add(obj);
                }
            }
            HashSet hashSet = new HashSet();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                hashSet.add(((AuraTabItem.Space) it5.next()).getId());
            }
            ArrayList arrayListA0P2 = AbstractC0878AGe.A0P(list, auraTabLayout.items);
            ArrayList arrayList4 = new ArrayList();
            Iterator it6 = arrayListA0P2.iterator();
            while (it6.hasNext()) {
                Object next2 = it6.next();
                if (next2 instanceof AuraTabItem.Space) {
                    arrayList4.add(next2);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : arrayList4) {
                if (((AuraTabItem.Space) obj2).artifact.source == ArtifactSource.PEER_SPACE) {
                    arrayList5.add(obj2);
                }
            }
            HashSet hashSet2 = new HashSet();
            Iterator it7 = arrayList5.iterator();
            while (it7.hasNext()) {
                hashSet2.add(((AuraTabItem.Space) it7.next()).getId());
            }
            ArrayList arrayListA0m4 = AnonymousClass002.A0m(listMergeVisibleNavigationOrder);
            Iterator<T> it8 = listMergeVisibleNavigationOrder.iterator();
            while (it8.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it8);
                arrayListA0m4.add(AnonymousClass005.A1a(strA0j, SpaceNavigationIdKt.SPACE_NAVIGATION_ID_PREFIX) ? new NavigationTabReference(hashSet.contains(strA0j) ? NavigationTabSource.SAVED_SPACE : hashSet2.contains(strA0j) ? NavigationTabSource.PEER_SPACE : NavigationTabSource.SPACE, C7BY.A0K(SpaceNavigationIdKt.SPACE_NAVIGATION_ID_PREFIX, strA0j)) : new NavigationTabReference(NavigationTabSource.SYSTEM, strA0j));
            }
            z2 = true;
            if (z) {
                Integer value2 = pinnedItemsRepository.navigationNavbarCount.getValue();
                iIntValue = value2 != null ? value2.intValue() : auraTabLayout.tabCount;
            } else {
                iIntValue = iIntValue2;
            }
            pinnedItemsRepository.setNavigationOrderFromUser(listMergeVisibleNavigationOrder, arrayListA0m4, iIntValue);
            if (auraTabItem.matches(auraTabRootNavKey) && iIndexOf >= 0 && iIndexOf < i) {
                int iIndexOf2 = listA07.indexOf(auraTabItem.getId());
                if (iIndexOf2 >= 0 && iIndexOf2 < iIntValue2) {
                    return true;
                }
                function0.invoke();
                return true;
            }
        }
        return z2;
    }

    public static /* synthetic */ boolean AuraSidePanelTabs$persistReorderedItems$default(AHD ahd, AuraTabLayout auraTabLayout, int i, PinnedItemsRepository pinnedItemsRepository, AuraTabRootNavKey auraTabRootNavKey, Function0 function0, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, List list, AuraTabItem auraTabItem, AuraTabItem auraTabItem2, Integer num, int i2, Object obj) {
        if ((i2 & 2048) != 0) {
            auraTabItem2 = null;
        }
        if ((i2 & 4096) != 0) {
            num = null;
        }
        return AuraSidePanelTabs$persistReorderedItems(ahd, auraTabLayout, i, pinnedItemsRepository, auraTabRootNavKey, function0, mutableState, mutableState2, mutableState3, list, auraTabItem, auraTabItem2, num);
    }

    public static final void CreateSpaceRow(Function0<Unit> function0, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-530250341);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            long j = z ? AnonymousClass003.A0c(bfm, 1530535521).accent : AnonymousClass003.A0c(bfm, 1530536456).secondaryText;
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            BRg bRgA0B = C3U4.A0B(C0v5.A04(AnonymousClass001.A0R(bRg2), new C1YD(0), null, function0, true), 10.0f, FIGMA_SIDE_PANEL_ROW_VERTICAL_PADDING);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            long j2 = bbi.A06;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C10G.A07(bs0, FIGMA_SIDE_PANEL_ICON_SLOT_SIZE);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA07);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraIconKt.m2567AuraIconFHprtrg(C10G.A07(bs0, FIGMA_SIDE_PANEL_GLYPH_SIZE), BOf.A00(bfm, R.drawable.meta_brand_design_system_icons_vector_plus_square_outline_24, 0), AuraIconSize.X_SMALL, null, j, null, bfm, (AVy.$stable << 3) | 390, 40);
            BBI.A0R(bbi, true);
            C01N.A09(bfm, bs0, 10.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120855), null, j, C06G.A0W(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142362(function0, z, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d2 A[PHI: r24
  0x01d2: PHI (r24v5 com.facebook.aura.tabs.SidePanelSharingBadgeContent) = 
  (r24v2 com.facebook.aura.tabs.SidePanelSharingBadgeContent)
  (r24v6 com.facebook.aura.tabs.SidePanelSharingBadgeContent)
 binds: [B:107:0x01d0, B:105:0x01cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025e A[PHI: r24
  0x025e: PHI (r24v3 com.facebook.aura.tabs.SidePanelSharingBadgeContent) = 
  (r24v2 com.facebook.aura.tabs.SidePanelSharingBadgeContent)
  (r24v5 com.facebook.aura.tabs.SidePanelSharingBadgeContent)
 binds: [B:107:0x01d0, B:108:0x01d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0276 A[PHI: r16
  0x0276: PHI (r16v1 java.lang.String) = (r16v0 java.lang.String), (r16v7 java.lang.String), (r16v7 java.lang.String) binds: [B:119:0x0272, B:67:0x0138, B:69:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x027b A[PHI: r15 r16
  0x027b: PHI (r15v1 java.lang.String) = (r15v0 java.lang.String), (r15v5 java.lang.String) binds: [B:122:0x0277, B:71:0x0140] A[DONT_GENERATE, DONT_INLINE]
  0x027b: PHI (r16v2 java.lang.String) = (r16v1 java.lang.String), (r16v6 java.lang.String) binds: [B:122:0x0277, B:71:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0164 A[PHI: r8 r15 r16 r34
  0x0164: PHI (r8v2 X.BBI) = (r8v1 X.BBI), (r8v6 X.BBI), (r8v6 X.BBI) binds: [B:125:0x0284, B:74:0x015a, B:76:0x0162] A[DONT_GENERATE, DONT_INLINE]
  0x0164: PHI (r15v2 java.lang.String) = (r15v1 java.lang.String), (r15v4 java.lang.String), (r15v4 java.lang.String) binds: [B:125:0x0284, B:74:0x015a, B:76:0x0162] A[DONT_GENERATE, DONT_INLINE]
  0x0164: PHI (r16v3 java.lang.String) = (r16v2 java.lang.String), (r16v5 java.lang.String), (r16v5 java.lang.String) binds: [B:125:0x0284, B:74:0x015a, B:76:0x0162] A[DONT_GENERATE, DONT_INLINE]
  0x0164: PHI (r34v2 java.lang.String) = (r34v1 java.lang.String), (r34v5 java.lang.String), (r34v5 java.lang.String) binds: [B:125:0x0284, B:74:0x015a, B:76:0x0162] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SidePanelNavigationItem(com.facebook.aura.tabs.AuraTabItem r49, java.lang.String r50, boolean r51, boolean r52, X.AHD<? extends com.facebook.aura.tabs.AuraTabItem> r53, boolean r54, X.G0U<? super com.facebook.aura.tabs.AuraTabItem, kotlin.Unit> r55, kotlin.jvm.functions.Function0<kotlin.Unit> r56, kotlin.jvm.functions.Function0<kotlin.Unit> r57, X.G0U<? super java.lang.String, kotlin.Unit> r58, kotlin.jvm.functions.Function0<kotlin.Unit> r59, kotlin.jvm.functions.Function0<kotlin.Unit> r60, boolean r61, X.BRg r62, X.BFM r63, int r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.tabs.AuraSidePanelTabsKt.SidePanelNavigationItem(com.facebook.aura.tabs.AuraTabItem, java.lang.String, boolean, boolean, X.AHD, boolean, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, X.BRg, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SidePanelNavigationRow(java.lang.Integer r65, java.lang.String r66, java.lang.String r67, boolean r68, com.facebook.aura.tabs.SidePanelSharingBadgeContent r69, int r70, java.lang.String r71, boolean r72, boolean r73, boolean r74, X.AHD<X.BHP> r75, X.BHP r76, kotlin.jvm.functions.Function0<kotlin.Unit> r77, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r78, boolean r79, X.BRg r80, X.BFM r81, int r82, int r83, int r84) {
        /*
            Method dump skipped, instructions count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.tabs.AuraSidePanelTabsKt.SidePanelNavigationRow(java.lang.Integer, java.lang.String, java.lang.String, boolean, com.facebook.aura.tabs.SidePanelSharingBadgeContent, int, java.lang.String, boolean, boolean, boolean, X.AHD, X.BHP, kotlin.jvm.functions.Function0, X.G0V, boolean, X.BRg, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SidePanelSpaceMenuButton(com.facebook.aura.tabs.AuraTabItem.Space r51, java.lang.String r52, java.lang.String r53, boolean r54, X.G0U<? super java.lang.Boolean, kotlin.Unit> r55, kotlin.jvm.functions.Function0<kotlin.Unit> r56, X.G0U<? super java.lang.String, kotlin.Unit> r57, kotlin.jvm.functions.Function0<kotlin.Unit> r58, kotlin.jvm.functions.Function0<kotlin.Unit> r59, X.BRg r60, X.BFM r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.tabs.AuraSidePanelTabsKt.SidePanelSpaceMenuButton(com.facebook.aura.tabs.AuraTabItem$Space, java.lang.String, java.lang.String, boolean, X.G0U, kotlin.jvm.functions.Function0, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final void SidePanelTabsHeader(AuraSidePanelCollapseState auraSidePanelCollapseState, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1728071921);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, auraSidePanelCollapseState) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120888);
            boolean zA0A = MutableState.A0A(auraSidePanelCollapseState.tabsCollapsed$delegate);
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new AuraSidePanelTabsKt$SidePanelTabsHeader$1$1$1(auraSidePanelCollapseState);
                bfm.Ai0(objAaT);
            }
            AuraSidePanelSectionHeader(strA01, null, zA0A, (Function0) objAaT, bfm, 0, 2);
            if (z && !MutableState.A0A(auraSidePanelCollapseState.tabsCollapsed$delegate) && HatchUtil.INSTANCE.showTabSortingHint()) {
                bfm.AgE(-2141896206);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120887), C3U4.A08(C3U4.A0B(C10G.A02, SIDE_PANEL_SECTION_HEADER_HORIZONTAL_PADDING, 0.0f), 0.0f), C06G.A08(bfm), C06G.A0Z(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
            } else {
                bfm.AgE(-2141512581);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142402(auraSidePanelCollapseState, z, bRg2, i, i2);
        }
    }

    public static final boolean isCollapsedAt(AuraSidePanelCollapseState auraSidePanelCollapseState, int i, int i2) {
        return i < i2 ? MutableState.A0A(auraSidePanelCollapseState.tabsCollapsed$delegate) : MutableState.A0A(auraSidePanelCollapseState.spacesCollapsed$delegate);
    }

    public static final boolean isMainChat(AuraTabItem auraTabItem) {
        return (auraTabItem instanceof AuraTabItem.Fixed) && ((AuraTabItem.Fixed) auraTabItem).tab == FixedTab.CHAT;
    }

    public static final int tabCountAfterMove(int i, int i2, int i3, int i4) {
        if (i3 < 0 || i4 < 0 || i3 == 0) {
            return i;
        }
        if (i3 < i && i4 >= i) {
            int i5 = i - 1;
            if (i5 < 0) {
                return 0;
            }
            return i5;
        }
        if (i3 < i || 1 > i4 || i4 > Math.max(1, i - 1)) {
            return i;
        }
        int i6 = i + 1;
        return i6 > i2 ? i2 : i6;
    }

    public static final void SidePanelTabsDivider(boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c142392;
        bfm.AgG(-1030098327);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            if (!z) {
                bfm.AgE(-117836580);
                C01N.A08(bfm, bRg, 0.0f);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    c142392 = new AnonymousClass1(z, bRg, i, i2);
                    bBbAAc.A06 = c142392;
                }
                return;
            }
            AnonymousClass003.A0l(bfm, -117777959);
            C01N.A07(bfm, C1b8.A01(C10G.A04(C3U4.A0B(AnonymousClass001.A0R(bRg), SIDE_PANEL_DIVIDER_HORIZONTAL_PADDING, 10.0f), AnonymousClass002.A0Y(bfm).Agy(1)), AnonymousClass002.A0c(bfm).fillDivider));
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c142392 = new C142392(z, bRg, i, i2);
            bBbAAc.A06 = c142392;
        }
    }

    public static final List<String> mergeVisibleNavigationOrder(List<String> list, List<String> list2, List<String> list3) {
        Set setA0g = AbstractC0878AGe.A0g(list2);
        Iterator<String> it = list2.iterator();
        List listSingletonList = Collections.singletonList(FixedTab.CHAT.getNavigationId());
        if (list.isEmpty()) {
            list = list3;
        }
        List listA0T = AbstractC0878AGe.A0T(AbstractC0878AGe.A0P(list, listSingletonList));
        ArrayList arrayListA0i = AnonymousClass003.A0i(listA0T);
        for (Object next : listA0T) {
            if (setA0g.contains(next) && it.hasNext()) {
                next = it.next();
            }
            arrayListA0i.add(next);
        }
        ArrayList arrayList = new ArrayList(arrayListA0i);
        arrayList.addAll(A6B.A02(AbstractC0875AGb.A09(it)));
        ArrayList arrayList2 = new ArrayList();
        for (String str : list3) {
            if (!arrayList.contains(str)) {
                arrayList2.add(str);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return AbstractC0878AGe.A0X(AbstractC0878AGe.A0f(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List<AuraTabItem> movedToFirstSpaceSlot(List<? extends AuraTabItem> list, AuraTabItem auraTabItem, int i) {
        int iIndexOf = list.indexOf(auraTabItem);
        if (iIndexOf < 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(ATD.A04(i, 0, arrayList.size()), arrayList.remove(iIndexOf));
        return arrayList;
    }
}
