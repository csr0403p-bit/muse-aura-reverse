package com.facebook.aura.conversation.view;

import X.AHD;
import X.AKH;
import X.AKQ;
import X.ARD;
import X.AVy;
import X.AXN;
import X.AYD;
import X.AaC;
import X.AbstractC07539Wl;
import X.AbstractC1754Apr;
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
import X.B1V;
import X.B6A;
import X.BA2;
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
import X.C06G;
import X.C06I;
import X.C0861A6i;
import X.C0n6;
import X.C0v5;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C13s;
import X.C1515AkP;
import X.C1822Arm;
import X.C19U;
import X.C1BO;
import X.C1D8;
import X.C1DP;
import X.C1EQ;
import X.C1OM;
import X.C1SA;
import X.C1YD;
import X.C1YL;
import X.C1YY;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3TQ;
import X.C3U4;
import X.C3Ue;
import X.C5Mp;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C79;
import X.C90l;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2k;
import X.HxE;
import X.InterfaceC05151eP;
import X.InterfaceC1072AWd;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.content.Context;
import android.view.ViewParent;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.data.HatchSearchHit;
import com.facebook.aura.conversation.repo.HatchSearchUiState;
import com.facebook.aura.conversation.repo.LoadingState;
import com.facebook.aura.conversation.repo.ThreadsView;
import com.facebook.aura.conversation.search.ConversationSearchScreenKt;
import com.facebook.aura.conversation.search.SearchResultsListStateKt;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.conversation.viewmodel.HatchSearchViewModel;
import com.facebook.aura.gateway.HatchSessionItem;
import com.facebook.aura.globaleffects.api.AppFloatingLayerKt;
import com.facebook.aura.header.api.SidePanelHeaderActionContributor;
import com.facebook.aura.header.view.HatchOverlayPageHeaderKt;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.model.HatchMessageChannel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.SidePanelLocalsKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.tabs.AuraSidePanelCollapseState;
import com.facebook.aura.tabs.AuraSidePanelTabsKt;
import com.facebook.aura.utils.HatchUtils;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.common.AuraClickableCardKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.loading.AutoLoadMoreKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchConversationHistorySidePanelKt {
    public static final String SIDE_PANEL_THREAD_LIST_TOP_ANCHOR_KEY = "thread-list-top-anchor";
    public static final float SidePanelBottomActionSize = 44.0f;
    public static final float SidePanelBottomActionVerticalPadding = 8.0f;
    public static final float SidePanelChannelIconSize = 24.0f;
    public static final float SidePanelCompactUnreadDotSize = 8.0f;
    public static final float SidePanelContentTopPadding = 16.0f;
    public static final float SidePanelFigmaCornerRadius = 24.0f;
    public static final float SidePanelFigmaDividerHorizontalPadding = 10.0f;
    public static final float SidePanelFigmaGutterPadding = 10.0f;
    public static final float SidePanelFigmaPinnedSpacing = 10.0f;
    public static final float SidePanelFigmaRowHorizontalPadding = 10.0f;
    public static final float SidePanelFigmaRowVerticalPadding = 10.0f;
    public static final float SidePanelFigmaSectionCaptionBottomPadding = 12.0f;
    public static final float SidePanelFigmaSectionTitleVerticalPadding = 4.0f;
    public static final float SidePanelFigmaThreadsListTopPadding = 0.0f;
    public static final float SidePanelFigmaUnreadSpacing = 8.0f;
    public static final float SidePanelGutterPadding = 16.0f;
    public static final float SidePanelHeaderBottomPadding = 8.0f;
    public static final float SidePanelMainChatCornerRadius = 44.0f;
    public static final float SidePanelMainChatDividerVerticalPadding = 16.0f;
    public static final float SidePanelMainChatRowVerticalPadding = 14.0f;
    public static final float SidePanelPinnedIconSize = 20.0f;
    public static final float SidePanelRowHorizontalPadding = 12.0f;
    public static final float SidePanelScrollFadeHeight = 32.0f;
    public static final float SidePanelSearchResultsVerticalPadding = 16.0f;
    public static final float SidePanelSectionTitleBottomPadding = 8.0f;
    public static final float SidePanelTapIndicatorCornerRadius = 20.0f;
    public static final float SidePanelThreadRowVerticalPadding = 10.0f;
    public static final float SidePanelThreadsListBottomPadding = 20.0f;
    public static final float SidePanelThreadsListTopPadding = 4.0f;
    public static final float SidePanelUnreadDotInsetFromEdge = 10.0f;
    public static final String TAG = "HatchHistorySidePanel";
    public static final long SidePanelTitleFontSize = C19U.A03(24);
    public static final float SidePanelBottomBarHorizontalPadding = AuraDimensKt.SpacingLarge;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ActiveConversationHistoryContent$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AHD<HatchSessionItem> $channelThreads;
        public final /* synthetic */ AuraSidePanelCollapseState $collapseState;
        public final /* synthetic */ Function0<Unit> $onArchivedClick;
        public final /* synthetic */ G0U<HatchSessionItem, Unit> $onChannelClick;
        public final /* synthetic */ Function0<Unit> $onMainChatClick;
        public final /* synthetic */ Function0<Unit> $onSelectedTabRemoved;
        public final /* synthetic */ String $selectedSessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AHD<HatchSessionItem> ahd, String str, G0U<? super HatchSessionItem, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, AuraSidePanelCollapseState auraSidePanelCollapseState) {
            super(2);
            this.$channelThreads = ahd;
            this.$selectedSessionId = str;
            this.$onChannelClick = g0u;
            this.$onArchivedClick = function0;
            this.$onMainChatClick = function02;
            this.$onSelectedTabRemoved = function03;
            this.$collapseState = auraSidePanelCollapseState;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AHD<HatchSessionItem> ahd = this.$channelThreads;
                String str = this.$selectedSessionId;
                HatchConversationHistorySidePanelKt.SidePanelConversationHistoryHeader(ahd, str, this.$onChannelClick, this.$onArchivedClick, this.$onMainChatClick, this.$onSelectedTabRemoved, "primary_session_id".equals(str), true, this.$collapseState, null, true, bfm, HatchSessionItem.$stable | 12582912, 6, 512);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ActiveConversationHistoryContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AHD<HatchSessionItem> $channelThreads;
        public final /* synthetic */ AuraSidePanelCollapseState $collapseState;
        public final /* synthetic */ Function0<Unit> $onArchivedClick;
        public final /* synthetic */ G0U<HatchSessionItem, Unit> $onChannelClick;
        public final /* synthetic */ Function0<Unit> $onMainChatClick;
        public final /* synthetic */ Function0<Unit> $onSelectedTabRemoved;
        public final /* synthetic */ String $selectedSessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AHD<HatchSessionItem> ahd, String str, G0U<? super HatchSessionItem, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, AuraSidePanelCollapseState auraSidePanelCollapseState) {
            super(2);
            this.$channelThreads = ahd;
            this.$selectedSessionId = str;
            this.$onChannelClick = g0u;
            this.$onArchivedClick = function0;
            this.$onMainChatClick = function02;
            this.$onSelectedTabRemoved = function03;
            this.$collapseState = auraSidePanelCollapseState;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AHD<HatchSessionItem> ahd = this.$channelThreads;
                String str = this.$selectedSessionId;
                HatchConversationHistorySidePanelKt.SidePanelConversationHistoryHeader(ahd, str, this.$onChannelClick, this.$onArchivedClick, this.$onMainChatClick, this.$onSelectedTabRemoved, "primary_session_id".equals(str), false, this.$collapseState, null, true, bfm, HatchSessionItem.$stable | 12582912, 6, 512);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ActiveConversationHistoryContent$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<HatchSessionItem> $channelThreads;
        public final /* synthetic */ AuraSidePanelCollapseState $collapseState;
        public final /* synthetic */ boolean $hasMore;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ LoadingState $loadingState;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onArchivedClick;
        public final /* synthetic */ G0U<HatchSessionItem, Unit> $onChannelClick;
        public final /* synthetic */ Function0<Unit> $onLoadMore;
        public final /* synthetic */ Function0<Unit> $onMainChatClick;
        public final /* synthetic */ Function0<Unit> $onSelectedTabRemoved;
        public final /* synthetic */ G0U<HatchSessionItem, Unit> $onThreadClick;
        public final /* synthetic */ String $selectedSessionId;
        public final /* synthetic */ List<HatchSessionItem> $sessions;
        public final /* synthetic */ boolean $useUpdatedSidePanelUi;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(List<HatchSessionItem> list, LazyListState lazyListState, boolean z, LoadingState loadingState, String str, AHD<HatchSessionItem> ahd, boolean z2, AuraSidePanelCollapseState auraSidePanelCollapseState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, G0U<? super HatchSessionItem, Unit> g0u, G0U<? super HatchSessionItem, Unit> g0u2, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$sessions = list;
            this.$listState = lazyListState;
            this.$hasMore = z;
            this.$loadingState = loadingState;
            this.$selectedSessionId = str;
            this.$channelThreads = ahd;
            this.$useUpdatedSidePanelUi = z2;
            this.$collapseState = auraSidePanelCollapseState;
            this.$onMainChatClick = function0;
            this.$onSelectedTabRemoved = function02;
            this.$onArchivedClick = function03;
            this.$onLoadMore = function04;
            this.$onThreadClick = g0u;
            this.$onChannelClick = g0u2;
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
            HatchConversationHistorySidePanelKt.ActiveConversationHistoryContent(this.$sessions, this.$listState, this.$hasMore, this.$loadingState, this.$selectedSessionId, this.$channelThreads, this.$useUpdatedSidePanelUi, this.$collapseState, this.$onMainChatClick, this.$onSelectedTabRemoved, this.$onArchivedClick, this.$onLoadMore, this.$onThreadClick, this.$onChannelClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ArchivedConversationHistoryContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C114122 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<HatchSessionItem> $activeChannelThreads;
        public final /* synthetic */ boolean $hasMore;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ LoadingState $loadingState;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onLoadMore;
        public final /* synthetic */ G0U<HatchSessionItem, Unit> $onThreadClick;
        public final /* synthetic */ String $selectedSessionId;
        public final /* synthetic */ List<HatchSessionItem> $sessions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114122(List<HatchSessionItem> list, AHD<HatchSessionItem> ahd, LazyListState lazyListState, boolean z, LoadingState loadingState, String str, Function0<Unit> function0, G0U<? super HatchSessionItem, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$sessions = list;
            this.$activeChannelThreads = ahd;
            this.$listState = lazyListState;
            this.$hasMore = z;
            this.$loadingState = loadingState;
            this.$selectedSessionId = str;
            this.$onLoadMore = function0;
            this.$onThreadClick = g0u;
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
            HatchConversationHistorySidePanelKt.ArchivedConversationHistoryContent(this.$sessions, this.$activeChannelThreads, this.$listState, this.$hasMore, this.$loadingState, this.$selectedSessionId, this.$onLoadMore, this.$onThreadClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$CompactUnreadDot$1, reason: invalid class name and case insensitive filesystem */
    public final class C114131 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114131(BRg bRg, int i, int i2) {
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
            HatchConversationHistorySidePanelKt.CompactUnreadDot(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryActionOverlay$1, reason: invalid class name and case insensitive filesystem */
    public final class C114141 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AaC $bounds;
        public final /* synthetic */ AXN $density;
        public final /* synthetic */ boolean $effectiveIsPinned;
        public final /* synthetic */ boolean $isArchived;
        public final /* synthetic */ AHD<AuraContextMenuItem> $menuItems;
        public final /* synthetic */ Function0<Unit> $onArchiveClick;
        public final /* synthetic */ Function0<Unit> $onDeleteClick;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onPinClick;
        public final /* synthetic */ Function0<Unit> $onRenameClick;
        public final /* synthetic */ HatchSessionItem $session;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114141(Function0<Unit> function0, AaC aaC, AXN axn, HatchSessionItem hatchSessionItem, boolean z, Function0<Unit> function02, boolean z2, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, AHD<AuraContextMenuItem> ahd) {
            super(2);
            this.$onDismiss = function0;
            this.$bounds = aaC;
            this.$density = axn;
            this.$session = hatchSessionItem;
            this.$isArchived = z;
            this.$onRenameClick = function02;
            this.$effectiveIsPinned = z2;
            this.$onPinClick = function03;
            this.$onArchiveClick = function04;
            this.$onDeleteClick = function05;
            this.$menuItems = ahd;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            Window windowAMm;
            C13s c13s;
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                ViewParent parent = AnonymousClass001.A0J(bfm).getParent();
                if ((parent instanceof C13s) && (c13s = (C13s) parent) != null) {
                    windowAMm = c13s.AMm();
                } else {
                    windowAMm = null;
                }
                boolean zA67 = bfm.A67(windowAMm);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchConversationHistorySidePanelKt$ConversationHistoryActionOverlay$1$1$1(windowAMm);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass001.A17(bfm, objAaT, windowAMm);
                AppFloatingLayerKt.AppFloatingLayers(null, false, bfm, 0, 3);
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A01;
                Function0<Unit> function0 = this.$onDismiss;
                AaC aaC = this.$bounds;
                AXN axn = this.$density;
                HatchSessionItem hatchSessionItem = this.$session;
                boolean z = this.$isArchived;
                Function0<Unit> function02 = this.$onRenameClick;
                boolean z2 = this.$effectiveIsPinned;
                Function0<Unit> function03 = this.$onPinClick;
                Function0<Unit> function04 = this.$onArchiveClick;
                Function0<Unit> function05 = this.$onDeleteClick;
                AHD<AuraContextMenuItem> ahd = this.$menuItems;
                Alignment alignment = C2VU.A0E;
                InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i2 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, c1062ATq);
                Function0<InterfaceC1516AkQ> function06 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function06);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA01, g0v);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                BRg bRgA012 = C1b8.A01(c1062ATq, AnonymousClass002.A0c(bfm).scrim);
                Object objAaT2 = bfm.AaT();
                Object obj = C78N.A00;
                C3Ue.A04(C0v5.A01(null, (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT2, obj), bRgA012, new C1YD(0), null, function0, true), bfm, 0);
                boolean zA65 = bfm.A65(aaC);
                Object objAaT3 = bfm.AaT();
                if (zA65 || objAaT3 == obj) {
                    objAaT3 = new HatchConversationHistorySidePanelKt$ConversationHistoryActionOverlay$1$2$2$1(aaC);
                    bfm.Ai0(objAaT3);
                }
                BRg bRgA0C = C10G.A0C(AYD.A03(bs0, (G0U) objAaT3), axn.Agx(aaC.A02 - aaC.A01), axn.Agx(aaC.A00 - aaC.A03));
                InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment, false);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA0C);
                AnonymousClass005.A0n(bfm, bbi, function06);
                BPg.A02(bfm, interfaceC1380AiAA012, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA013, g0vA0u);
                BRg bRgAQJ = C0z7.A00.AQJ(bs0);
                boolean zA1T = AnonymousClass005.A1T(bfm, function03, function04, function05, AnonymousClass001.A1U(bfm, z2, AnonymousClass004.A1W(bfm, function02, z, bfm.A67(hatchSessionItem))));
                Object objAaT4 = bfm.AaT();
                if (zA1T || objAaT4 == obj) {
                    objAaT4 = new HatchConversationHistorySidePanelKt$ConversationHistoryActionOverlay$1$2$5$1$1(hatchSessionItem, z, function02, z2, function03, function04, function05);
                    bfm.Ai0(objAaT4);
                }
                AuraContextMenuKt.m2519AuraContextMenukiaLOpA(bRgAQJ, (G0U) objAaT4, function0, true, null, 0L, null, false, new HatchConversationHistorySidePanelKt$ConversationHistoryActionOverlay$1$2$5$2(ahd), false, null, null, null, false, bfm, 3072, 0, 16112);
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryActionOverlay$2, reason: invalid class name and case insensitive filesystem */
    public final class C114152 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AaC $bounds;
        public final /* synthetic */ Function0<Unit> $onArchiveClick;
        public final /* synthetic */ Function0<Unit> $onDeleteClick;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onPinClick;
        public final /* synthetic */ Function0<Unit> $onRenameClick;
        public final /* synthetic */ HatchSessionItem $session;
        public final /* synthetic */ ThreadsView $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114152(ThreadsView threadsView, HatchSessionItem hatchSessionItem, AaC aaC, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, int i) {
            super(2);
            this.$view = threadsView;
            this.$session = hatchSessionItem;
            this.$bounds = aaC;
            this.$onRenameClick = function0;
            this.$onPinClick = function02;
            this.$onArchiveClick = function03;
            this.$onDeleteClick = function04;
            this.$onDismiss = function05;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConversationHistorySidePanelKt.ConversationHistoryActionOverlay(this.$view, this.$session, this.$bounds, this.$onRenameClick, this.$onPinClick, this.$onArchiveClick, this.$onDeleteClick, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryEmptyState$1, reason: invalid class name and case insensitive filesystem */
    public final class C114161 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ LoadingState $loadingState;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $useFigmaStyle;
        public final /* synthetic */ ThreadsView $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114161(ThreadsView threadsView, LoadingState loadingState, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$view = threadsView;
            this.$loadingState = loadingState;
            this.$useFigmaStyle = z;
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
            HatchConversationHistorySidePanelKt.ConversationHistoryEmptyState(this.$view, this.$loadingState, this.$useFigmaStyle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryEmptyState$3, reason: invalid class name and case insensitive filesystem */
    public final class C114173 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ LoadingState $loadingState;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $useFigmaStyle;
        public final /* synthetic */ ThreadsView $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114173(ThreadsView threadsView, LoadingState loadingState, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$view = threadsView;
            this.$loadingState = loadingState;
            this.$useFigmaStyle = z;
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
            HatchConversationHistorySidePanelKt.ConversationHistoryEmptyState(this.$view, this.$loadingState, this.$useFigmaStyle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryEmptyStateContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C114182 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ThreadsView $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114182(ThreadsView threadsView, BRg bRg, int i, int i2) {
            super(2);
            this.$view = threadsView;
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
            HatchConversationHistorySidePanelKt.ConversationHistoryEmptyStateContent(this.$view, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$3, reason: invalid class name and case insensitive filesystem */
    public final class C114193 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<HatchSessionItem> $activeChannelThreads;
        public final /* synthetic */ float $collapseProgress;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $footerContent;
        public final /* synthetic */ boolean $hasMore;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $headerContent;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ LoadingState $loadingState;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onLoadMore;
        public final /* synthetic */ G0U<HatchSessionItem, Unit> $onThreadClick;
        public final /* synthetic */ String $selectedSessionId;
        public final /* synthetic */ List<HatchSessionItem> $sessions;
        public final /* synthetic */ boolean $showArchivedSectionHeaders;
        public final /* synthetic */ boolean $showMoreButton;
        public final /* synthetic */ boolean $useFigmaStyle;
        public final /* synthetic */ boolean $useSettingsStyle;
        public final /* synthetic */ ThreadsView $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114193(ThreadsView threadsView, List<HatchSessionItem> list, LazyListState lazyListState, boolean z, LoadingState loadingState, String str, Function0<Unit> function0, G0U<? super HatchSessionItem, Unit> g0u, BRg bRg, AHD<HatchSessionItem> ahd, boolean z2, float f, boolean z3, boolean z4, boolean z5, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, int i, int i2, int i3) {
            super(2);
            this.$view = threadsView;
            this.$sessions = list;
            this.$listState = lazyListState;
            this.$hasMore = z;
            this.$loadingState = loadingState;
            this.$selectedSessionId = str;
            this.$onLoadMore = function0;
            this.$onThreadClick = g0u;
            this.$modifier = bRg;
            this.$activeChannelThreads = ahd;
            this.$useFigmaStyle = z2;
            this.$collapseProgress = f;
            this.$showArchivedSectionHeaders = z3;
            this.$useSettingsStyle = z4;
            this.$showMoreButton = z5;
            this.$headerContent = g0v;
            this.$footerContent = g0v2;
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
            HatchConversationHistorySidePanelKt.ConversationHistoryLazyColumn(this.$view, this.$sessions, this.$listState, this.$hasMore, this.$loadingState, this.$selectedSessionId, this.$onLoadMore, this.$onThreadClick, this.$modifier, this.$activeChannelThreads, this.$useFigmaStyle, this.$collapseProgress, this.$showArchivedSectionHeaders, this.$useSettingsStyle, this.$showMoreButton, this.$headerContent, this.$footerContent, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryPanelContent$1, reason: invalid class name and case insensitive filesystem */
    public final class C114201 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$changed2;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $activeHasMore;
        public final /* synthetic */ LazyListState $activeListState;
        public final /* synthetic */ LoadingState $activeLoadingState;
        public final /* synthetic */ List<HatchSessionItem> $activeSessions;
        public final /* synthetic */ boolean $archivedHasMore;
        public final /* synthetic */ LazyListState $archivedListState;
        public final /* synthetic */ LoadingState $archivedLoadingState;
        public final /* synthetic */ List<HatchSessionItem> $archivedSessions;
        public final /* synthetic */ AHD<HatchSessionItem> $channelThreads;
        public final /* synthetic */ AuraSidePanelCollapseState $collapseState;
        public final /* synthetic */ SidePanelMode $mode;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onActiveLoadMore;
        public final /* synthetic */ G0U<HatchSessionItem, Unit> $onActiveThreadClick;
        public final /* synthetic */ Function0<Unit> $onArchivedClick;
        public final /* synthetic */ Function0<Unit> $onArchivedLoadMore;
        public final /* synthetic */ G0U<HatchSessionItem, Unit> $onArchivedThreadClick;
        public final /* synthetic */ G0U<HatchSessionItem, Unit> $onChannelClick;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ Function0<Unit> $onMainChatClick;
        public final /* synthetic */ Function0<Unit> $onSearchBack;
        public final /* synthetic */ Function0<Unit> $onSearchLoadMore;
        public final /* synthetic */ Function0<Unit> $onSelectedTabRemoved;
        public final /* synthetic */ G2k<String, String, Boolean, String, Long, Unit> $onThreadSelected;
        public final /* synthetic */ String $searchQuery;
        public final /* synthetic */ HatchSearchUiState $searchUiState;
        public final /* synthetic */ String $selectedSessionId;
        public final /* synthetic */ boolean $useUpdatedSidePanelUi;

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114201(SidePanelMode sidePanelMode, List<HatchSessionItem> list, LazyListState lazyListState, boolean z, LoadingState loadingState, List<HatchSessionItem> list2, LazyListState lazyListState2, boolean z2, LoadingState loadingState2, String str, AHD<HatchSessionItem> ahd, boolean z3, AuraSidePanelCollapseState auraSidePanelCollapseState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, G0U<? super HatchSessionItem, Unit> g0u, String str2, HatchSearchUiState hatchSearchUiState, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, Function0<Unit> function08, G0U<? super HatchSessionItem, Unit> g0u2, G0U<? super HatchSessionItem, Unit> g0u3, G2k<? super String, ? super String, ? super Boolean, ? super String, ? super Long, Unit> g2k, BRg bRg, int i, int i2, int i3, int i4) {
            super(2);
            this.$mode = sidePanelMode;
            this.$activeSessions = list;
            this.$activeListState = lazyListState;
            this.$activeHasMore = z;
            this.$activeLoadingState = loadingState;
            this.$archivedSessions = list2;
            this.$archivedListState = lazyListState2;
            this.$archivedHasMore = z2;
            this.$archivedLoadingState = loadingState2;
            this.$selectedSessionId = str;
            this.$channelThreads = ahd;
            this.$useUpdatedSidePanelUi = z3;
            this.$collapseState = auraSidePanelCollapseState;
            this.$onMainChatClick = function0;
            this.$onSelectedTabRemoved = function02;
            this.$onDismissRequest = function03;
            this.$onArchivedClick = function04;
            this.$onChannelClick = g0u;
            this.$searchQuery = str2;
            this.$searchUiState = hatchSearchUiState;
            this.$onSearchBack = function05;
            this.$onActiveLoadMore = function06;
            this.$onArchivedLoadMore = function07;
            this.$onSearchLoadMore = function08;
            this.$onActiveThreadClick = g0u2;
            this.$onArchivedThreadClick = g0u3;
            this.$onThreadSelected = g2k;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$changed2 = i3;
            this.$$default = i4;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConversationHistorySidePanelKt.ConversationHistoryPanelContent(this.$mode, this.$activeSessions, this.$activeListState, this.$activeHasMore, this.$activeLoadingState, this.$archivedSessions, this.$archivedListState, this.$archivedHasMore, this.$archivedLoadingState, this.$selectedSessionId, this.$channelThreads, this.$useUpdatedSidePanelUi, this.$collapseState, this.$onMainChatClick, this.$onSelectedTabRemoved, this.$onDismissRequest, this.$onArchivedClick, this.$onChannelClick, this.$searchQuery, this.$searchUiState, this.$onSearchBack, this.$onActiveLoadMore, this.$onArchivedLoadMore, this.$onSearchLoadMore, this.$onActiveThreadClick, this.$onArchivedThreadClick, this.$onThreadSelected, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryRowContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C114212 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchMessageChannel $channel;
        public final /* synthetic */ C3TQ $contentPadding;
        public final /* synthetic */ boolean $isPinned;
        public final /* synthetic */ boolean $isUnread;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onMoreClick;
        public final /* synthetic */ String $title;
        public final /* synthetic */ boolean $useFigmaStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114212(String str, boolean z, boolean z2, HatchMessageChannel hatchMessageChannel, C3TQ c3tq, boolean z3, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$isPinned = z;
            this.$isUnread = z2;
            this.$channel = hatchMessageChannel;
            this.$contentPadding = c3tq;
            this.$useFigmaStyle = z3;
            this.$onMoreClick = function0;
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
            HatchConversationHistorySidePanelKt.ConversationHistoryRowContent(this.$title, this.$isPinned, this.$isUnread, this.$channel, this.$contentPadding, this.$useFigmaStyle, this.$onMoreClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryScrollFades$2, reason: invalid class name and case insensitive filesystem */
    public final class C114222 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114222(LazyListState lazyListState, BRg bRg, int i, int i2) {
            super(2);
            this.$listState = lazyListState;
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
            HatchConversationHistorySidePanelKt.ConversationHistoryScrollFades(this.$listState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$10, reason: invalid class name */
    public final class AnonymousClass10 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ LazyListState $activeListState;
        public final /* synthetic */ LazyListState $archivedListState;
        public final /* synthetic */ boolean $isVisible;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Function0<Boolean>, Unit> $onBackPressedHandlerChanged;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ Function0<Unit> $onMainChatSelected;
        public final /* synthetic */ G0U<Boolean, Unit> $onSearchModeChanged;
        public final /* synthetic */ Function0<Unit> $onSelectedTabRemoved;
        public final /* synthetic */ G2k<String, String, Boolean, String, Long, Unit> $onThreadSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G2k<? super String, ? super String, ? super Boolean, ? super String, ? super Long, Unit> g2k, LazyListState lazyListState, LazyListState lazyListState2, BRg bRg, boolean z, G0U<? super Function0<Boolean>, Unit> g0u, G0U<? super Boolean, Unit> g0u2, int i, int i2) {
            super(2);
            this.$onDismissRequest = function0;
            this.$onMainChatSelected = function02;
            this.$onSelectedTabRemoved = function03;
            this.$onThreadSelected = g2k;
            this.$activeListState = lazyListState;
            this.$archivedListState = lazyListState2;
            this.$modifier = bRg;
            this.$isVisible = z;
            this.$onBackPressedHandlerChanged = g0u;
            this.$onSearchModeChanged = g0u2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConversationHistorySidePanelKt.HatchConversationHistorySidePanelContent(this.$onDismissRequest, this.$onMainChatSelected, this.$onSelectedTabRemoved, this.$onThreadSelected, this.$activeListState, this.$archivedListState, this.$modifier, this.$isVisible, this.$onBackPressedHandlerChanged, this.$onSearchModeChanged, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$NewSideChatBottomBarButton$1, reason: invalid class name and case insensitive filesystem */
    public final class C114231 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114231(Function0<Unit> function0, BRg bRg, int i, int i2) {
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
            HatchConversationHistorySidePanelKt.NewSideChatBottomBarButton(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$SearchBottomBarIconButton$1, reason: invalid class name and case insensitive filesystem */
    public final class C114241 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ int $iconRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114241(int i, boolean z, String str) {
            super(3);
            this.$iconRes = i;
            this.$enabled = z;
            this.$contentDescription = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
            invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
            int iA0d;
            long j;
            C7384Etj.A0Y(interfaceC05151eP, 0);
            if ((i & 6) == 0) {
                iA0d = AnonymousClass004.A0d(bfm, interfaceC05151eP) | i;
            } else {
                iA0d = i;
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                AVy aVyA00 = BOf.A00(bfm, this.$iconRes, 0);
                if (this.$enabled) {
                    j = AnonymousClass003.A0c(bfm, 1184000962).primaryIcon.enabled;
                } else {
                    j = AnonymousClass003.A0c(bfm, 1184002691).primaryIcon.disabled;
                }
                AnonymousClass001.A1D(bfm);
                AuraIconKt.m2567AuraIconFHprtrg(interfaceC05151eP.A4C(C2VU.A09, BRg.A00), aVyA00, AuraIconSize.X_SMALL, this.$contentDescription, j, null, bfm, AnonymousClass001.A03(), 32);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$SearchBottomBarIconButton$2, reason: invalid class name and case insensitive filesystem */
    public final class C114252 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ int $iconRes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114252(int i, String str, Function0<Unit> function0, BRg bRg, boolean z, int i2, int i3) {
            super(2);
            this.$iconRes = i;
            this.$contentDescription = str;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$enabled = z;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConversationHistorySidePanelKt.SearchBottomBarIconButton(this.$iconRes, this.$contentDescription, this.$onClick, this.$modifier, this.$enabled, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$SearchConversationHistoryContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C114262 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ Function0<Unit> $onLoadMore;
        public final /* synthetic */ G2k<String, String, Boolean, String, Long, Unit> $onThreadSelected;
        public final /* synthetic */ String $query;
        public final /* synthetic */ HatchSearchUiState $searchUiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114262(String str, HatchSearchUiState hatchSearchUiState, Function0<Unit> function0, Function0<Unit> function02, G2k<? super String, ? super String, ? super Boolean, ? super String, ? super Long, Unit> g2k, BRg bRg, int i, int i2) {
            super(2);
            this.$query = str;
            this.$searchUiState = hatchSearchUiState;
            this.$onLoadMore = function0;
            this.$onDismissRequest = function02;
            this.$onThreadSelected = g2k;
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
            HatchConversationHistorySidePanelKt.SearchConversationHistoryContent(this.$query, this.$searchUiState, this.$onLoadMore, this.$onDismissRequest, this.$onThreadSelected, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$SearchConversationHistoryResults$3, reason: invalid class name and case insensitive filesystem */
    public final class C114273 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onLoadMore;
        public final /* synthetic */ G0W<HatchSearchHit, String, String, Unit> $onResultClick;
        public final /* synthetic */ String $query;
        public final /* synthetic */ HatchSearchUiState $searchUiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114273(String str, HatchSearchUiState hatchSearchUiState, LazyListState lazyListState, Function0<Unit> function0, G0W<? super HatchSearchHit, ? super String, ? super String, Unit> g0w, BRg bRg, int i, int i2) {
            super(2);
            this.$query = str;
            this.$searchUiState = hatchSearchUiState;
            this.$listState = lazyListState;
            this.$onLoadMore = function0;
            this.$onResultClick = g0w;
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
            HatchConversationHistorySidePanelKt.SearchConversationHistoryResults(this.$query, this.$searchUiState, this.$listState, this.$onLoadMore, this.$onResultClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$SearchSidePanelBottomBar$3, reason: invalid class name and case insensitive filesystem */
    public final class C114283 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SidePanelMode $mode;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCloseClick;
        public final /* synthetic */ Function0<Unit> $onNewThreadClick;
        public final /* synthetic */ G0U<String, Unit> $onQueryChange;
        public final /* synthetic */ Function0<Unit> $onSearchClick;
        public final /* synthetic */ Function0<Unit> $onSettingsClick;
        public final /* synthetic */ String $query;
        public final /* synthetic */ boolean $shouldFocusSearchField;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114283(SidePanelMode sidePanelMode, String str, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$mode = sidePanelMode;
            this.$query = str;
            this.$shouldFocusSearchField = z;
            this.$onSettingsClick = function0;
            this.$onSearchClick = function02;
            this.$onNewThreadClick = function03;
            this.$onCloseClick = function04;
            this.$onQueryChange = g0u;
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
            HatchConversationHistorySidePanelKt.SearchSidePanelBottomBar(this.$mode, this.$query, this.$shouldFocusSearchField, this.$onSettingsClick, this.$onSearchClick, this.$onNewThreadClick, this.$onCloseClick, this.$onQueryChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$SidePanelChannelRow$3, reason: invalid class name and case insensitive filesystem */
    public final class C114293 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $accountUsername;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ HatchSessionItem $session;
        public final /* synthetic */ boolean $useFigmaStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114293(HatchSessionItem hatchSessionItem, String str, boolean z, Function0<Unit> function0, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$session = hatchSessionItem;
            this.$accountUsername = str;
            this.$isSelected = z;
            this.$onClick = function0;
            this.$useFigmaStyle = z2;
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
            HatchConversationHistorySidePanelKt.SidePanelChannelRow(this.$session, this.$accountUsername, this.$isSelected, this.$onClick, this.$useFigmaStyle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$SidePanelChannelsSection$1, reason: invalid class name and case insensitive filesystem */
    public final class C114301 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<HatchSessionItem> $channelThreads;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<HatchSessionItem, Unit> $onChannelClick;
        public final /* synthetic */ String $selectedSessionId;
        public final /* synthetic */ boolean $useFigmaStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114301(AHD<HatchSessionItem> ahd, String str, G0U<? super HatchSessionItem, Unit> g0u, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$channelThreads = ahd;
            this.$selectedSessionId = str;
            this.$onChannelClick = g0u;
            this.$useFigmaStyle = z;
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
            HatchConversationHistorySidePanelKt.SidePanelChannelsSection(this.$channelThreads, this.$selectedSessionId, this.$onChannelClick, this.$useFigmaStyle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$SidePanelChannelsSection$3, reason: invalid class name and case insensitive filesystem */
    public final class C114313 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<HatchSessionItem> $channelThreads;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<HatchSessionItem, Unit> $onChannelClick;
        public final /* synthetic */ String $selectedSessionId;
        public final /* synthetic */ boolean $useFigmaStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114313(AHD<HatchSessionItem> ahd, String str, G0U<? super HatchSessionItem, Unit> g0u, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$channelThreads = ahd;
            this.$selectedSessionId = str;
            this.$onChannelClick = g0u;
            this.$useFigmaStyle = z;
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
            HatchConversationHistorySidePanelKt.SidePanelChannelsSection(this.$channelThreads, this.$selectedSessionId, this.$onChannelClick, this.$useFigmaStyle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$SidePanelConversationHistoryDivider$1, reason: invalid class name and case insensitive filesystem */
    public final class C114321 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $useFigmaStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114321(boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$useFigmaStyle = z;
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
            HatchConversationHistorySidePanelKt.SidePanelConversationHistoryDivider(this.$useFigmaStyle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$SidePanelConversationHistoryHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C114332 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<HatchSessionItem> $channelThreads;
        public final /* synthetic */ AuraSidePanelCollapseState $collapseState;
        public final /* synthetic */ boolean $contentHasOuterGutter;
        public final /* synthetic */ boolean $isMainChatSelected;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onArchivedClick;
        public final /* synthetic */ G0U<HatchSessionItem, Unit> $onChannelClick;
        public final /* synthetic */ Function0<Unit> $onMainChatClick;
        public final /* synthetic */ Function0<Unit> $onSelectedTabRemoved;
        public final /* synthetic */ String $selectedSessionId;
        public final /* synthetic */ boolean $useFigmaStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114332(AHD<HatchSessionItem> ahd, String str, G0U<? super HatchSessionItem, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, boolean z, boolean z2, AuraSidePanelCollapseState auraSidePanelCollapseState, BRg bRg, boolean z3, int i, int i2, int i3) {
            super(2);
            this.$channelThreads = ahd;
            this.$selectedSessionId = str;
            this.$onChannelClick = g0u;
            this.$onArchivedClick = function0;
            this.$onMainChatClick = function02;
            this.$onSelectedTabRemoved = function03;
            this.$isMainChatSelected = z;
            this.$useFigmaStyle = z2;
            this.$collapseState = auraSidePanelCollapseState;
            this.$modifier = bRg;
            this.$contentHasOuterGutter = z3;
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
            HatchConversationHistorySidePanelKt.SidePanelConversationHistoryHeader(this.$channelThreads, this.$selectedSessionId, this.$onChannelClick, this.$onArchivedClick, this.$onMainChatClick, this.$onSelectedTabRemoved, this.$isMainChatSelected, this.$useFigmaStyle, this.$collapseState, this.$modifier, this.$contentHasOuterGutter, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$SidePanelMainChatCard$3, reason: invalid class name and case insensitive filesystem */
    public final class C114343 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114343(String str, Function0<Unit> function0, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$onClick = function0;
            this.$isSelected = z;
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
            HatchConversationHistorySidePanelKt.SidePanelMainChatCard(this.$title, this.$onClick, this.$isSelected, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$SidePanelNavigationSections$2, reason: invalid class name and case insensitive filesystem */
    public final class C114352 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraSidePanelCollapseState $collapseState;
        public final /* synthetic */ boolean $isMainChatSelected;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onMainChatClick;
        public final /* synthetic */ Function0<Unit> $onSelectedTabRemoved;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114352(boolean z, Function0<Unit> function0, Function0<Unit> function02, AuraSidePanelCollapseState auraSidePanelCollapseState, BRg bRg, int i, int i2) {
            super(2);
            this.$isMainChatSelected = z;
            this.$onMainChatClick = function0;
            this.$onSelectedTabRemoved = function02;
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
            HatchConversationHistorySidePanelKt.SidePanelNavigationSections(this.$isMainChatSelected, this.$onMainChatClick, this.$onSelectedTabRemoved, this.$collapseState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$SidePanelPageHeader$1, reason: invalid class name and case insensitive filesystem */
    public final class C114361 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onBackClick;
        public final /* synthetic */ boolean $showBackButton;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114361(boolean z, Function0<Unit> function0, String str) {
            super(2);
            this.$showBackButton = z;
            this.$onBackClick = function0;
            this.$title = str;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                if (this.$showBackButton) {
                    bfm.AgE(-572598615);
                    AVy aVyA00 = BOf.A00(bfm, R.drawable.caret_left, 0);
                    String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206bb);
                    boolean zA65 = bfm.A65(this.$onBackClick);
                    Function0<Unit> function0 = this.$onBackClick;
                    Object objAaT = bfm.AaT();
                    if (zA65 || objAaT == C78N.A00) {
                        objAaT = new HatchConversationHistorySidePanelKt$SidePanelPageHeader$1$1$1(function0);
                        bfm.Ai0(objAaT);
                    }
                    AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(aVyA00, strA01, (Function0) objAaT, null, false, 0.0f, null, new B6A(C06G.A0C(bfm)), null, false, false, bfm, AVy.$stable, 0, 1912);
                } else if (this.$title != null) {
                    bfm.AgE(-570110473);
                    String str = this.$title;
                    C1822Arm c1822ArmA00 = C1822Arm.A00(null, AnonymousClass002.A0f(bfm).title1Emphasized, null, null, null, null, null, null, null, null, 0, 0, 0, 16777213, 0L, HatchConversationHistorySidePanelKt.SidePanelTitleFontSize, 0L, 0L);
                    long jA0C = C06G.A0C(bfm);
                    BS0 bs0 = BRg.A00;
                    Object objAaT2 = bfm.AaT();
                    if (objAaT2 == C78N.A00) {
                        objAaT2 = HatchConversationHistorySidePanelKt$SidePanelPageHeader$1$2$1.INSTANCE;
                        bfm.Ai0(objAaT2);
                    }
                    AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bs0, objAaT2, false), jA0C, c1822ArmA00, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
                } else {
                    bfm.AgE(-572567380);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$SidePanelPageHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C114372 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ boolean $showActions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114372(boolean z) {
            super(2);
            this.$showActions = z;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                if (this.$showActions) {
                    bfm.AgE(1572751890);
                    Iterator it = new ArrayList(0).iterator();
                    while (it.hasNext()) {
                        ((SidePanelHeaderActionContributor) it.next()).Action(BRg.A00, bfm, 6);
                    }
                } else {
                    bfm.AgE(1572883547);
                }
                AnonymousClass002.A19(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$SidePanelPageHeader$3, reason: invalid class name and case insensitive filesystem */
    public final class C114383 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBackClick;
        public final /* synthetic */ boolean $showActions;
        public final /* synthetic */ boolean $showBackButton;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114383(boolean z, String str, Function0<Unit> function0, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$showBackButton = z;
            this.$title = str;
            this.$onBackClick = function0;
            this.$showActions = z2;
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
            HatchConversationHistorySidePanelKt.SidePanelPageHeader(this.$showBackButton, this.$title, this.$onBackClick, this.$showActions, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$SidePanelPinnedIcon$1, reason: invalid class name and case insensitive filesystem */
    public final class C114391 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114391(BRg bRg, int i, int i2) {
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
            HatchConversationHistorySidePanelKt.SidePanelPinnedIcon(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$SidePanelSectionTitle$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isCollapsed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onArchivedClick;
        public final /* synthetic */ Function0<Unit> $onToggleCollapsed;
        public final /* synthetic */ String $title;
        public final /* synthetic */ boolean $useFigmaStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, BRg bRg, Function0<Unit> function0, boolean z, boolean z2, Function0<Unit> function02, int i, int i2) {
            super(2);
            this.$title = str;
            this.$modifier = bRg;
            this.$onArchivedClick = function0;
            this.$useFigmaStyle = z;
            this.$isCollapsed = z2;
            this.$onToggleCollapsed = function02;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConversationHistorySidePanelKt.SidePanelSectionTitle(this.$title, this.$modifier, this.$onArchivedClick, this.$useFigmaStyle, this.$isCollapsed, this.$onToggleCollapsed, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ConversationHistoryScrollFades(LazyListState lazyListState, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-693100811);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, lazyListState) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA0d & 14;
            boolean zA1Q = AnonymousClass002.A1Q(i4, 4);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = AnonymousClass003.A0R(bfm, new HatchConversationHistorySidePanelKt$ConversationHistoryScrollFades$showTopFade$2$1(lazyListState));
            }
            C1BO c1bo = (C1BO) objAaT;
            boolean zA1Q2 = AnonymousClass002.A1Q(i4, 4);
            Object objAaT2 = bfm.AaT();
            if (zA1Q2 || objAaT2 == C78N.A00) {
                objAaT2 = AnonymousClass003.A0R(bfm, new HatchConversationHistorySidePanelKt$ConversationHistoryScrollFades$showBottomFade$2$1(lazyListState));
            }
            C1BO c1bo2 = (C1BO) objAaT2;
            long jA0B = C06G.A0B(bfm);
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0T);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            if (C1BO.A0F(c1bo)) {
                bfm.AgE(595461623);
                C1EQ.A05(bfm, C10G.A04(AnonymousClass001.A0R(c0z7.A4C(C2VU.A0C, BRg.A00)), SidePanelScrollFadeHeight), new B6A(jA0B), new B6A(B6A.A06));
            } else {
                bfm.AgE(595734547);
            }
            BBI.A0R(bbi, false);
            if (C1BO.A0F(c1bo2)) {
                bfm.AgE(595768244);
                C1EQ.A05(bfm, C10G.A04(AnonymousClass007.A0G(c0z7, BRg.A00), SidePanelScrollFadeHeight), new B6A(B6A.A06), new B6A(jA0B));
            } else {
                bfm.AgE(596044051);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114222(lazyListState, bRg2, i, i2);
        }
    }

    public static final void SearchBottomBarIconButton(int i, String str, Function0<Unit> function0, BRg bRg, boolean z, BFM bfm, int i2, int i3) {
        boolean z2 = z;
        BRg bRg2 = bRg;
        bfm.AgG(313632832);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0V(bfm, function0);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i5 = i3 & 16;
        if (i5 != 0) {
            iA0D |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0D |= AnonymousClass004.A0r(bfm, z);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0D), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (i5 != 0) {
                z2 = true;
            }
            int i6 = iA0D >> 3;
            ConversationSearchScreenKt.m502SearchPillSurfaceFHprtrg(C10G.A07(bRg2, SidePanelBottomActionSize), function0, str, z2, 0L, B1V.A00(bfm, new C114241(i, z2, str), 59332539), bfm, ((iA0D << 3) & 896) | (i6 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 196608 | (i6 & 7168), 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114252(i, str, function0, bRg2, z2, i2, i3);
        }
    }

    public static final void SidePanelConversationHistoryDivider(boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2097810942);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            m552SidePanelDivider6a0pyJM(bRg2, z, SidePanelFigmaDividerHorizontalPadding - SidePanelFigmaGutterPadding, bfm, ((iA0n >> 3) & 14) | 384 | ((iA0n << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114321(z, bRg2, i, i2);
        }
    }

    /* renamed from: SidePanelDivider-6a0pyJM, reason: not valid java name */
    public static final void m552SidePanelDivider6a0pyJM(BRg bRg, boolean z, float f, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean z2 = z;
        float f2 = f;
        bfm.AgG(1518568835);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = false;
            }
            if (i5 != 0) {
                f2 = SidePanelFigmaDividerHorizontalPadding;
            }
            float fAgy = AnonymousClass002.A0Y(bfm).Agy(1);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            BS0 bs0 = BRg.A00;
            C01N.A07(bfm, C1b8.A01(C10G.A04(bRgA0R.then(z2 ? C3U4.A0B(bs0, f2, 10.0f) : C3U4.A06(bs0, AuraDimensKt.SpacingSmall)), fAgy), AnonymousClass002.A0c(bfm).fillDivider));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchConversationHistorySidePanelKt$SidePanelDivider$1(bRg2, z2, f2, i, i2);
        }
    }

    public static final void SidePanelPageHeader(boolean z, String str, Function0<Unit> function0, boolean z2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-610345567);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0q(bfm, z2);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0n |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchOverlayPageHeaderKt.HatchOverlayPageHeader(B1V.A00(bfm, new C114361(z, function0, str), 1577056040), B1V.A00(bfm, new C114372(z2), 902989255), C3U4.A03(bRg2, SidePanelHeaderBottomPadding), bfm, 54, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114383(z, str, function0, z2, bRg2, i, i2);
        }
    }

    public static final void SidePanelPinnedIcon(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1285147083);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1SA.A00(bfm, null, C10G.A07(bRg2, SidePanelPinnedIconSize), AnonymousClass002.A0S(C06G.A08(bfm)), BOf.A00(bfm, R.drawable.thumbpin_outline_24_wght400, 0), null, null, 0.0f, AVy.$stable | 48, 56);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114391(bRg2, i, i2);
        }
    }

    public static final String rememberAgentName(BFM bfm, int i) {
        return C1BO.A08(rememberAgentNameState(bfm, 0));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[SidePanelMode.values().length];
            try {
                AnonymousClass005.A0v(SidePanelMode.DEFAULT, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(SidePanelMode.ARCHIVED, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(SidePanelMode.SEARCH, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LoadingState.values().length];
            try {
                AnonymousClass005.A0v(LoadingState.LOADING, iArr2, 1);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(LoadingState.FAILED, iArr2, 2);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[HatchMessageChannel.values().length];
            try {
                AnonymousClass005.A0v(HatchMessageChannel.WHATSAPP, iArr3, 1);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass005.A0v(HatchMessageChannel.MESSENGER, iArr3, 2);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(HatchMessageChannel.THREADS, iArr3, 3);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass002.A16(HatchMessageChannel.TELEGRAM, iArr3);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass002.A17(HatchMessageChannel.INSTAGRAM, iArr3);
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /* JADX WARN: Type inference failed for: r31v2, types: [X.G0V] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ActiveConversationHistoryContent(java.util.List<com.facebook.aura.gateway.HatchSessionItem> r34, androidx.compose.foundation.lazy.LazyListState r35, boolean r36, com.facebook.aura.conversation.repo.LoadingState r37, java.lang.String r38, X.AHD<com.facebook.aura.gateway.HatchSessionItem> r39, boolean r40, com.facebook.aura.tabs.AuraSidePanelCollapseState r41, kotlin.jvm.functions.Function0<kotlin.Unit> r42, kotlin.jvm.functions.Function0<kotlin.Unit> r43, kotlin.jvm.functions.Function0<kotlin.Unit> r44, kotlin.jvm.functions.Function0<kotlin.Unit> r45, X.G0U<? super com.facebook.aura.gateway.HatchSessionItem, kotlin.Unit> r46, X.G0U<? super com.facebook.aura.gateway.HatchSessionItem, kotlin.Unit> r47, X.BRg r48, X.BFM r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt.ActiveConversationHistoryContent(java.util.List, androidx.compose.foundation.lazy.LazyListState, boolean, com.facebook.aura.conversation.repo.LoadingState, java.lang.String, X.AHD, boolean, com.facebook.aura.tabs.AuraSidePanelCollapseState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, X.G0U, X.BRg, X.BFM, int, int, int):void");
    }

    public static final void ArchivedConversationHistoryContent(List<HatchSessionItem> list, AHD<HatchSessionItem> ahd, LazyListState lazyListState, boolean z, LoadingState loadingState, String str, Function0<Unit> function0, G0U<? super HatchSessionItem, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1297537827);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(ahd, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, lazyListState);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0G(bfm, loadingState.ordinal());
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0i(bfm, str);
        }
        if ((1572864 & i) == 0) {
            iA05 |= AnonymousClass004.A0Z(bfm, function0);
        }
        if ((12582912 & i) == 0) {
            iA05 |= AnonymousClass004.A0a(bfm, g0u);
        }
        int i3 = i2 & 256;
        int iA0l = 100663296;
        if (i3 != 0) {
            iA05 |= iA0l;
        } else if ((100663296 & i) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, bRg2);
            iA05 |= iA0l;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(38347923 & iA05, 38347922), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(bRg2.then(c1062ATq), HatchOrigin.CHAT, HatchSurface.CHAT, null, HatchScreen.CONVERSATION_HISTORY, HatchComponent.ARCHIVED_THREADS_LIST, null, null, null, 500L, 0.0f, null, null, null);
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgHatchImpression);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            C90l c90l = C90l.A00;
            BRg bRgA0B = C3U4.A0B(AbstractC1754Apr.A01(c90l.AiP(c1062ATq, 1.0f, true)), SidePanelGutterPadding, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            ConversationHistoryLazyColumn(ThreadsView.ARCHIVED, list, lazyListState, z, loadingState, str, function0, g0u, c90l.AiP(c1062ATq, 1.0f, true), ahd, false, 0.0f, false, false, false, null, null, bfm, AnonymousClass001.A06(iA05 << 24, AnonymousClass005.A06(iA05, ((iA05 << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6) | (HatchSessionItem.$stable << 27)), 0, 130048);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114122(list, ahd, lazyListState, z, loadingState, str, function0, g0u, bRg2, i, i2);
        }
    }

    public static final void ConversationHistoryEmptyState(ThreadsView threadsView, LoadingState loadingState, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c114173;
        BRg bRgA0Q = bRg;
        bfm.AgG(395357959);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, threadsView) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass005.A09(bfm, loadingState);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0p(bfm, z);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA08 |= 3072;
        } else if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0g(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 1171, 1170), bfm, iA08)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            if (z && loadingState != LoadingState.LOADING && loadingState != LoadingState.FAILED) {
                bfm.AgE(1308982975);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12087c), C3U4.A0C(C3U4.A0B(AnonymousClass001.A0R(bRgA0Q), SidePanelFigmaRowHorizontalPadding, 0.0f), 0.0f, 0.0f, 0.0f, SidePanelFigmaSectionCaptionBottomPadding), C06G.A09(bfm), C06G.A0Z(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    c114173 = new C114161(threadsView, loadingState, z, bRgA0Q, i, i2);
                    bBbAAc.A06 = c114173;
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, 1309409659);
            BRg bRgA0M = C06G.A0M(bfm, AnonymousClass001.A0R(bRgA0Q));
            InterfaceC1380AiA interfaceC1380AiAA0R = AnonymousClass006.A0R(bfm);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgA0M);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0R, akqA04, bRgA01, iA0J);
            int iOrdinal = loadingState.ordinal();
            if (iOrdinal == 1) {
                bfm.AgE(1326109022);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
            } else if (iOrdinal != 3) {
                bfm.AgE(1326119746);
                ConversationHistoryEmptyStateContent(threadsView, null, bfm, iA08 & 14, 2);
            } else {
                bfm.AgE(-1840232857);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12088c), null, C06G.A08(bfm), C06G.A0Z(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbiA0M, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c114173 = new C114173(threadsView, loadingState, z, bRgA0Q, i, i2);
            bBbAAc.A06 = c114173;
        }
    }

    public static final void ConversationHistoryEmptyStateContent(ThreadsView threadsView, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(342548175);
        int iA08 = (i & 6) == 0 ? i | AnonymousClass005.A08(bfm, threadsView) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA08 |= 48;
        } else if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 19, 18), bfm, iA08)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            ThreadsView threadsView2 = ThreadsView.ARCHIVED;
            int i4 = R.drawable.speech_bubble_stacked;
            int i5 = R.string._name_removed__res_0x7f12088b;
            int i6 = R.string._name_removed__res_0x7f12088a;
            if (threadsView == threadsView2) {
                i4 = R.drawable.archive_outline_24_wght400;
                i5 = R.string._name_removed__res_0x7f12084b;
                i6 = R.string._name_removed__res_0x7f12084a;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0P);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, i4, 0), AuraIconSize.SMALL, null, C06G.A0C(bfm), null, bfm, AnonymousClass001.A03(), 41);
            BS0 bs0 = BRg.A00;
            C01N.A05(bfm, bs0);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i5), null, C06G.A0C(bfm), AnonymousClass002.A0f(bfm).title3Emphasized, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i6), C3U4.A04(bs0, 2.0f), C06G.A08(bfm), C06G.A0Z(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114182(threadsView, bRgA0P, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e6 A[PHI: r2 r3 r12
  0x00e6: PHI (r2v4 boolean) = (r2v2 boolean), (r2v8 boolean) binds: [B:80:0x016b, B:60:0x00e4] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r3v5 X.BBI) = (r3v3 X.BBI), (r3v6 X.BBI) binds: [B:80:0x016b, B:60:0x00e4] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r12v2 java.lang.String) = (r12v0 java.lang.String), (r12v3 java.lang.String) binds: [B:80:0x016b, B:60:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* renamed from: ConversationHistoryRow-yKJFJhA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m550ConversationHistoryRowyKJFJhA(com.facebook.aura.conversation.repo.ThreadsView r36, com.facebook.aura.gateway.HatchSessionItem r37, java.lang.String r38, X.C3TQ r39, kotlin.jvm.functions.Function0<kotlin.Unit> r40, X.G0U<? super X.AaC, kotlin.Unit> r41, X.G0U<? super X.AaC, kotlin.Unit> r42, boolean r43, X.BRg r44, boolean r45, float r46, X.BFM r47, int r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt.m550ConversationHistoryRowyKJFJhA(com.facebook.aura.conversation.repo.ThreadsView, com.facebook.aura.gateway.HatchSessionItem, java.lang.String, X.3TQ, kotlin.jvm.functions.Function0, X.G0U, X.G0U, boolean, X.BRg, boolean, float, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static final void ConversationHistoryRowContent(String str, boolean z, boolean z2, HatchMessageChannel hatchMessageChannel, C3TQ c3tq, boolean z3, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        boolean z4;
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(-750553723);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass007.A06(bfm, AnonymousClass003.A0K(hatchMessageChannel));
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, c3tq);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0s(bfm, z3);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, function0);
        }
        int i4 = i2 & 128;
        int iA0k = 12582912;
        if (i4 != 0) {
            iA0d |= iA0k;
        } else if ((12582912 & i) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA0d |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1D(iA0d), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0D = C3U4.A0D(AnonymousClass001.A0R(bRg2), c3tq);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0D);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            if (hatchMessageChannel != null) {
                bfm.AgE(-1067348325);
                z4 = 0;
                i3 = 1;
                m551SidePanelChannelIconjt2gSs(hatchMessageChannel, sidePanelIconRes(hatchMessageChannel), null, 0.0f, bfm, (iA0d >> 9) & 14, 12);
                C01N.A09(bfm, BRg.A00, AuraDimensKt.SpacingSmall);
            } else {
                z4 = 0;
                i3 = 1;
                bfm.AgE(-1067219551);
            }
            BBI.A0R(bbi, z4);
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            long jA0C = C06G.A0C(bfm);
            BS0 bs0 = BRg.A00;
            boolean z5 = z4;
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0O(c90m, bs0, i3), jA0C, c1822ArmA0T, null, null, null, z4, z5 ? 1 : 0, i3, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d), 6, 14832);
            if (z) {
                bfm.AgE(-1066956578);
                C01N.A09(bfm, bs0, z3 ? SidePanelFigmaPinnedSpacing : AuraDimensKt.SpacingXsmall);
                SidePanelPinnedIcon(null, bfm, z4, i3);
                BBI.A0R(bbi, z4);
            } else {
                bfm.AgE(-1066830687);
                BBI.A0R(bbi, z4);
            }
            if (z2 && z3) {
                bfm.AgE(-1066792185);
                C01N.A09(bfm, bs0, SidePanelFigmaUnreadSpacing);
                CompactUnreadDot(null, bfm, z4, i3);
            } else {
                bfm.AgE(-1066705695);
            }
            BBI.A0R(bbi, z4);
            if (function0 != null) {
                bfm.AgE(-1066656188);
                AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(null, BOf.A00(bfm, R.drawable.ellipsis_wght400_outline_24, z4), AuraIconButtonSizeV2.SMALL, AuraIconButtonStyle.SECONDARY, AuraIconButtonBackground.NO_BACKGROUND, null, AnonymousClass005.A0i(bfm), function0, null, z5, null, null, null, null, bfm, (AVy.$stable << 3) | 28032 | ((iA0d << 3) & 29360128), z4, 16161);
            } else {
                bfm.AgE(-1066284095);
            }
            BBI.A0R(bbi, z4);
            BBI.A0R(bbi, i3);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114212(str, z, z2, hatchMessageChannel, c3tq, z3, function0, bRg2, i, i2);
        }
    }

    public static final void SearchConversationHistoryContent(String str, HatchSearchUiState hatchSearchUiState, Function0<Unit> function0, Function0<Unit> function02, G2k<? super String, ? super String, ? super Boolean, ? super String, ? super Long, Unit> g2k, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1090468666);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, hatchSearchUiState);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function02);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g2k);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0g = AnonymousClass002.A0g(bfm);
            Context applicationContext = AnonymousClass002.A0H(bfm).getApplicationContext();
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            C7384Etj.A0X(applicationContext);
            HatchConversationViewModel.Factory factory = new HatchConversationViewModel.Factory(applicationContext, abstractC3358CGzA0g, "primary_session_id", false, false);
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            HatchConversationViewModel hatchConversationViewModel = (HatchConversationViewModel) AnonymousClass003.A0Y(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), HatchConversationViewModel.class, "primary_session_id");
            HatchSearchViewModel.Factory factory2 = new HatchSearchViewModel.Factory(abstractC3358CGzA0g);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            HatchSearchViewModel hatchSearchViewModel = (HatchSearchViewModel) BQN.A00(factory2, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(HatchSearchViewModel.class));
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            LazyListState lazyListStateRememberSearchResultsListState = SearchResultsListStateKt.rememberSearchResultsListState(hatchSearchViewModel, SearchResultsListStateKt.SEARCH_SURFACE_SIDE_PANEL, str, bfm, HatchSearchViewModel.$stable | 48 | ((iA0d << 6) & 896));
            boolean zA1Y = AnonymousClass005.A1Y(bfm, auraNavigatorA0b, hatchConversationViewModel, AnonymousClass004.A1M(iA0d), AnonymousClass005.A1L(iA0d));
            Object objAaT = bfm.AaT();
            if (zA1Y || objAaT == C78N.A00) {
                objAaT = new HatchConversationHistorySidePanelKt$SearchConversationHistoryContent$1$1$1(function02, g2k, auraNavigatorA0b, hatchConversationViewModel);
                bfm.Ai0(objAaT);
            }
            SearchConversationHistoryResults(str, hatchSearchUiState, lazyListStateRememberSearchResultsListState, function0, (G0W) objAaT, C3U4.A07(c90l.AiP(c1062ATq, 1.0f, true), SidePanelGutterPadding), bfm, (iA0d & 126) | ((iA0d << 3) & 7168), 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114262(str, hatchSearchUiState, function0, function02, g2k, bRg2, i, i2);
        }
    }

    public static final void SearchConversationHistoryResults(String str, HatchSearchUiState hatchSearchUiState, LazyListState lazyListState, Function0<Unit> function0, G0W<? super HatchSearchHit, ? super String, ? super String, Unit> g0w, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(382564968);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, hatchSearchUiState);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, lazyListState);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0w);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRgA0P);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            AHD<HatchSearchHit> ahd = hatchSearchUiState.results;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120895);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12086b);
            if (hatchSearchUiState.hasMore) {
                bfm.AgE(-1849692791);
                boolean zA1E = AnonymousClass003.A1E(iA0d);
                Object objAaT = bfm.AaT();
                if (zA1E || objAaT == C78N.A00) {
                    objAaT = new HatchConversationHistorySidePanelKt$SearchConversationHistoryResults$1$1(function0);
                    bfm.Ai0(objAaT);
                }
                AutoLoadMoreKt.AutoLoadMore(lazyListState, 0, (Function0<Unit>) objAaT, bfm, (iA0d >> 6) & 14, 1);
            } else {
                bfm.AgE(-1849645702);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0P);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            long j = AnonymousClass002.A0c(bfm).fillDivider;
            C1062ATq c1062ATq = C10G.A01;
            float f = SidePanelSearchResultsVerticalPadding;
            C1DP c1dp = new C1DP(0.0f, f, 0.0f, f);
            boolean zA1W = AnonymousClass005.A1W(bfm, ahd, strA01, strA012, AnonymousClass001.A1T(bfm, hatchSearchUiState, AnonymousClass004.A1F(iA0d))) | bfm.A64(j) | AnonymousClass005.A1M(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == C78N.A00) {
                objAaT2 = new HatchConversationHistorySidePanelKt$SearchConversationHistoryResults$2$1$1(str, hatchSearchUiState, ahd, strA01, strA012, j, g0w);
                bfm.Ai0(objAaT2);
            }
            C1YY.A01(null, null, null, c1dp, lazyListState, bfm, null, c1062ATq, (G0U) objAaT2, ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 390, 504, false, false);
            ConversationHistoryScrollFades(lazyListState, null, bfm, (iA0d >> 6) & 14, 2);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114273(str, hatchSearchUiState, lazyListState, function0, g0w, bRgA0P, i, i2);
        }
    }

    public static final void SearchSidePanelBottomBar(SidePanelMode sidePanelMode, String str, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(-1842196300);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, sidePanelMode) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0X(bfm, function02);
        }
        if ((196608 & i) == 0) {
            iA08 |= AnonymousClass004.A0Y(bfm, function03);
        }
        if ((i & 1572864) == 0) {
            iA08 |= AnonymousClass004.A0Z(bfm, function04);
        }
        if ((12582912 & i) == 0) {
            iA08 |= AnonymousClass004.A0a(bfm, g0u);
        }
        int i4 = i2 & 256;
        if (i4 != 0) {
            iA08 |= 100663296;
            i3 = 1572864;
        } else {
            i3 = 1572864;
            if ((i & 100663296) == 0) {
                iA08 |= AnonymousClass004.A0l(bfm, bRg2);
            }
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 38347923, 38347922), bfm, iA08)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA1Z = AnonymousClass002.A1Z(sidePanelMode, SidePanelMode.SEARCH);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            boolean z2 = AnonymousClass001.A0f(bfm, akh).isLight;
            long jA0K = C06G.A0K(bfm, akh);
            boolean zA64 = bfm.A64(jA0K);
            Object objAaT = bfm.AaT();
            if (zA64 || objAaT == C78N.A00) {
                objAaT = C1EQ.A02(new HxE[]{AnonymousClass007.A0h(Float.valueOf(0.0f), 0.0f, jA0K), AnonymousClass007.A0g(0.597f, jA0K), AnonymousClass007.A0g(1.0f, jA0K)}, Float.POSITIVE_INFINITY);
                bfm.Ai0(objAaT);
            }
            C1EQ c1eq = (C1EQ) objAaT;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            if (z2) {
                bRgA0R = bRgA0R.then(C1b8.A02(BRg.A00, c1eq, C1OM.A00));
            }
            BRg bRgA00 = AbstractC1754Apr.A00(AbstractC1754Apr.A01(bRgA0R));
            float f = SidePanelBottomBarHorizontalPadding;
            BRg bRgA0C = C3U4.A0C(bRgA00, f, AuraDimensKt.SpacingSmall, f, SidePanelBottomActionVerticalPadding);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function05 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function05);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ef8);
            BS0 bs0 = BRg.A00;
            SearchBottomBarIconButton(R.drawable.settings_gear_android_wght400_outline_24, strA01, function0, AbstractC07539Wl.A00(bs0, "hatch-side-panel-settings-button"), false, bfm, ((iA08 >> 3) & 896) | 3072, 16);
            float f2 = AuraDimensKt.SpacingXsmallPlusNano;
            C01N.A09(bfm, bs0, f2);
            ConversationSearchScreenKt.m504SearchTextFieldOqVHbNc(zA1Z ? str : "", g0u, AnonymousClass001.A0U(c90m.AiP(bs0, 1.0f, true), SidePanelBottomActionSize), !zA1Z, z, zA1Z ? null : function02, true, C06G.A0T(bfm), null, null, null, null, Integer.valueOf(R.drawable.search_outline_24_wght600), 0L, bfm, AnonymousClass001.A0B(iA08 << 6, ((iA08 >> 18) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | i3), 0, 12032);
            C01N.A09(bfm, bs0, f2);
            if (zA1Z) {
                bfm.AgE(-2023419512);
                SearchBottomBarIconButton(R.drawable.aura_nav_close_20, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e81), function04, null, false, bfm, (iA08 >> 12) & 896, 24);
            } else {
                bfm.AgE(-2023194266);
                NewSideChatBottomBarButton(function03, null, bfm, (iA08 >> 15) & 14, 2);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114283(sidePanelMode, str, z, function0, function02, function03, function04, g0u, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* renamed from: SidePanelChannelIcon--jt2gSs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m551SidePanelChannelIconjt2gSs(com.facebook.aura.model.HatchMessageChannel r18, int r19, X.BRg r20, float r21, X.BFM r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt.m551SidePanelChannelIconjt2gSs(com.facebook.aura.model.HatchMessageChannel, int, X.BRg, float, X.BFM, int, int):void");
    }

    public static final void SidePanelChannelRow(HatchSessionItem hatchSessionItem, String str, boolean z, Function0<Unit> function0, boolean z2, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c114293;
        float f;
        float f2;
        BRg bRg2 = bRg;
        bfm.AgG(703371261);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchSessionItem, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0r(bfm, z2);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA05, 74898), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchMessageChannel hatchMessageChannel = hatchSessionItem.channel;
            if (hatchMessageChannel == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c114293 = new HatchConversationHistorySidePanelKt$SidePanelChannelRow$channel$1(hatchSessionItem, str, z, function0, z2, bRg2, i, i2);
                    bBbAAc.A06 = c114293;
                }
                return;
            }
            int iSidePanelIconRes = sidePanelIconRes(hatchMessageChannel);
            String strChannelDisplayName = HatchChannelDisplayNameKt.channelDisplayName(hatchMessageChannel, str, bfm, iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
            long j = AnonymousClass002.A0c(bfm).bubble;
            BRg bRgA01 = C11U.A01(AnonymousClass001.A0R(bRg2), z2 ? SidePanelFigmaCornerRadius : SidePanelMainChatCornerRadius);
            if (z) {
                bRgA01 = bRgA01.then(C1b8.A01(BRg.A00, j));
            }
            BRg bRgM2509auraClickableCardYQRRFTQ = AuraClickableCardKt.m2509auraClickableCardYQRRFTQ(bRgA01, function0, null, 0, null);
            if (z2) {
                f = SidePanelFigmaRowHorizontalPadding;
                f2 = SidePanelFigmaRowVerticalPadding;
            } else {
                f = SidePanelRowHorizontalPadding;
                f2 = SidePanelMainChatRowVerticalPadding;
            }
            BRg bRgA0B = C3U4.A0B(bRgM2509auraClickableCardYQRRFTQ, f, f2);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA012, iA0J);
            C90m c90m = C90m.A00;
            m551SidePanelChannelIconjt2gSs(hatchMessageChannel, iSidePanelIconRes, null, z2 ? 20.0f : SidePanelChannelIconSize, bfm, 0, 4);
            BS0 bs0 = BRg.A00;
            C01N.A09(bfm, bs0, z2 ? 10.0f : AuraDimensKt.SpacingSmall);
            C1822Arm c1822Arm = z2 ? AnonymousClass006.A0k(bfm, -114307029).bodyMedium : z ? AnonymousClass006.A0k(bfm, -114305105).bodyEmphasized : AnonymousClass006.A0k(bfm, -114303252).bodyRegular;
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(strChannelDisplayName, c90m.AiP(bs0, 1.0f, true), C06G.A0C(bfm), c1822Arm, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            if (hatchSessionItem.unreadCount <= 0 || z) {
                bfm.AgE(751865729);
            } else {
                bfm.AgE(751797498);
                CompactUnreadDot(C3U4.A0C(bs0, AuraDimensKt.SpacingXsmall, 0.0f, 0.0f, 0.0f), bfm, 0, 0);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c114293 = new C114293(hatchSessionItem, str, z, function0, z2, bRg2, i, i2);
            bBbAAc.A06 = c114293;
        }
    }

    public static final void SidePanelChannelsSection(AHD<HatchSessionItem> ahd, String str, G0U<? super HatchSessionItem, Unit> g0u, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c114313;
        BRg bRg2 = bRg;
        bfm.AgG(-763946801);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(ahd, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (ahd.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c114313 = new C114301(ahd, str, g0u, z, bRg2, i, i2);
                    bBbAAc.A06 = c114313;
                }
                return;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, i4);
            SidePanelSectionTitle(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120852), null, null, z, false, null, bfm, iA05 & 7168, 54);
            Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, 1432522713);
            while (itA0w.hasNext()) {
                HatchSessionItem hatchSessionItem = (HatchSessionItem) itA0w.next();
                bfm.Ag8(1128905760, hatchSessionItem.sessionId);
                String strDisplayAccountUsername = HatchChannelDisplayNameKt.displayAccountUsername(hatchSessionItem, ahd);
                boolean zAreEqual = C7384Etj.areEqual(hatchSessionItem.sessionId, str);
                boolean zA1T = AnonymousClass001.A1T(bfm, hatchSessionItem, AnonymousClass003.A1D(iA05));
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new HatchConversationHistorySidePanelKt$SidePanelChannelsSection$2$1$1$1(g0u, hatchSessionItem);
                    bfm.Ai0(objAaT);
                }
                SidePanelChannelRow(hatchSessionItem, strDisplayAccountUsername, zAreEqual, (Function0) objAaT, z, null, bfm, AnonymousClass001.A0B(iA05 << 3, HatchSessionItem.$stable), 32);
                BBI.A0R(bbi, false);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c114313 = new C114313(ahd, str, g0u, z, bRg2, i, i2);
            bBbAAc.A06 = c114313;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Type inference failed for: r22v3, types: [kotlin.jvm.functions.Function0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SidePanelConversationHistoryHeader(X.AHD<com.facebook.aura.gateway.HatchSessionItem> r33, java.lang.String r34, X.G0U<? super com.facebook.aura.gateway.HatchSessionItem, kotlin.Unit> r35, kotlin.jvm.functions.Function0<kotlin.Unit> r36, kotlin.jvm.functions.Function0<kotlin.Unit> r37, kotlin.jvm.functions.Function0<kotlin.Unit> r38, boolean r39, boolean r40, com.facebook.aura.tabs.AuraSidePanelCollapseState r41, X.BRg r42, boolean r43, X.BFM r44, int r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt.SidePanelConversationHistoryHeader(X.AHD, java.lang.String, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, boolean, com.facebook.aura.tabs.AuraSidePanelCollapseState, X.BRg, boolean, X.BFM, int, int, int):void");
    }

    public static final void SidePanelMainChatCard(String str, Function0<Unit> function0, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        C1822Arm c1822Arm;
        BRg bRg2 = bRg;
        bfm.AgG(1306613624);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long j = AnonymousClass001.A0f(bfm, akh).bubble;
            BRg bRgA01 = C11U.A01(AnonymousClass001.A0R(bRg2), SidePanelMainChatCornerRadius);
            if (z) {
                bRgA01 = bRgA01.then(C1b8.A01(BRg.A00, j));
            }
            BRg bRgA0B = C3U4.A0B(AuraClickableCardKt.m2509auraClickableCardYQRRFTQ(bRgA01, function0, null, 0, null), SidePanelRowHorizontalPadding, SidePanelMainChatRowVerticalPadding);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA012, iA0J);
            C90m c90m = C90m.A00;
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.house_wght400_outline_24, 0), AuraIconSize.X_SMALL, null, C06G.A0L(bfm, akh), null, bfm, AnonymousClass001.A03(), 41);
            BS0 bs0 = BRg.A00;
            C01N.A09(bfm, bs0, AuraDimensKt.SpacingSmall);
            if (z) {
                c1822Arm = AnonymousClass006.A0k(bfm, 1931864802).bodyEmphasized;
                BBI.A0R(bbi, false);
            } else {
                c1822Arm = AnonymousClass006.A0k(bfm, 1931866495).bodyRegular;
                BBI.A0R(bbi, false);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, c90m.AiP(bs0, 1.0f, true), C06G.A0C(bfm), c1822Arm, null, null, null, false, 0, 1, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d), 6, 14832);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114343(str, function0, z, bRg2, i, i2);
        }
    }

    public static final void SidePanelNavigationSections(boolean z, Function0<Unit> function0, Function0<Unit> function02, AuraSidePanelCollapseState auraSidePanelCollapseState, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(676855076);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, auraSidePanelCollapseState);
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
            Object objA6v = bfm.A6v(SidePanelLocalsKt.LocalSidePanelController);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, i4);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12086b);
            boolean zA67 = bfm.A67(objA6v);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchConversationHistorySidePanelKt$SidePanelNavigationSections$1$1$1(objA6v);
                bfm.Ai0(objAaT);
            }
            int i5 = iA0n << 3;
            AuraSidePanelTabsKt.AuraSidePanelTabs(strA01, z, function0, function02, (Function0) ((InterfaceC7353EnQ) objAaT), auraSidePanelCollapseState, C5Mp.A00(BRg.A00, 1.0f), bfm, (i5 & 7168) | (i5 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 1572864 | (i5 & 896) | (458752 & (iA0n << 6)), 0);
            if (HatchUtils.INSTANCE.isSidePanelSpacesEnabled()) {
                boolean zA1Z = AnonymousClass001.A1Z(contextA0H, bfm, 1268096277) | AnonymousClass003.A1C(iA0n);
                Object objAaT2 = bfm.AaT();
                if (zA1Z || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchConversationHistorySidePanelKt$SidePanelNavigationSections$1$2$1(contextA0H, function0);
                    bfm.Ai0(objAaT2);
                }
                AuraSidePanelTabsKt.AuraSidePanelCreateSpaceSection((Function0) objAaT2, MutableState.A0A(auraSidePanelCollapseState.spacesCollapsed$delegate), null, bfm, 0, 4);
            } else {
                bfm.AgE(1268402836);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114352(z, function0, function02, auraSidePanelCollapseState, bRg2, i, i2);
        }
    }

    public static final void SidePanelSectionTitle(String str, BRg bRg, Function0<Unit> function0, boolean z, boolean z2, Function0<Unit> function02, BFM bfm, int i, int i2) {
        String upperCase;
        C1822Arm c1822Arm;
        BRg bRg2 = bRg;
        Function0<Unit> function03 = function0;
        boolean z3 = z;
        boolean z4 = z2;
        Function0<Unit> function04 = function02;
        bfm.AgG(-1480095570);
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
            iA0d |= AnonymousClass004.A0V(bfm, function03);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z3);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z4);
        }
        int i7 = i2 & 32;
        int iA0Y = 196608;
        if (i7 != 0) {
            iA0d |= iA0Y;
        } else if ((196608 & i) == 0) {
            iA0Y = AnonymousClass004.A0Y(bfm, function04);
            iA0d |= iA0Y;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 74899, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                function03 = null;
            }
            if (i5 != 0) {
                z3 = false;
            }
            if (i6 != 0) {
                z4 = false;
            }
            if (i7 != 0) {
                function04 = null;
            }
            long jA09 = C06G.A09(bfm);
            int i8 = R.string._name_removed__res_0x7f120879;
            if (z4) {
                i8 = R.string._name_removed__res_0x7f12087a;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i8);
            bfm.AgE(-737649138);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchConversationHistorySidePanelKt$SidePanelSectionTitle$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA01 = ARD.A01(bRgA0R, (G0U) objAaT, false);
            if (function04 != null) {
                BS0 bs0 = BRg.A00;
                C1YD c1yd = new C1YD(0);
                boolean z5 = (iA0d & 458752) == 131072;
                Object objAaT2 = bfm.AaT();
                if (z5 || objAaT2 == obj) {
                    objAaT2 = new HatchConversationHistorySidePanelKt$SidePanelSectionTitle$2$1$1(function04);
                    bfm.Ai0(objAaT2);
                }
                bRgA01 = bRgA01.then(C0v5.A02(bs0, c1yd, objAaT2, strA01));
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            BS0 bs02 = BRg.A00;
            BRg bRgThen = bRgA01.then(z3 ? C3U4.A0B(bs02, SidePanelFigmaRowHorizontalPadding, SidePanelFigmaSectionTitleVerticalPadding) : C3U4.A0C(C3U4.A0B(bs02, SidePanelRowHorizontalPadding, 0.0f), 0.0f, 0.0f, 0.0f, SidePanelSectionTitleBottomPadding));
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingSmall);
            long j = bbi.A06;
            int i9 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function05 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function05);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0K, akqA04, bRgA012, i9);
            C90m c90m = C90m.A00;
            if (z3) {
                Locale locale = Locale.getDefault();
                C7384Etj.A0U(locale);
                upperCase = str.toUpperCase(locale);
                c1822Arm = AnonymousClass006.A0k(bfm, 905905212).footnoteEmphasized;
            } else {
                upperCase = str;
                c1822Arm = AnonymousClass006.A0k(bfm, 905907028).bodyMedium;
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(upperCase, c90m.AiP(bs02, 1.0f, true), jA09, c1822Arm, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            if (function03 != null) {
                bfm.AgE(-1981451330);
                AuraIconKt.m2567AuraIconFHprtrg(C0v5.A05(bs02, null, function03, true), BOf.A00(bfm, R.drawable.archive_outline_24_wght400, 0), AuraIconSize.X_SMALL, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120889), C06G.A06(bfm), null, bfm, AnonymousClass001.A03(), 32);
            } else {
                bfm.AgE(-1981082120);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(str, bRg2, function03, z3, z4, function04, i, i2);
        }
    }

    public static final boolean isRefreshComplete(LoadingState loadingState) {
        return loadingState == LoadingState.SUCCESS || loadingState == LoadingState.FAILED;
    }

    public static final void logSearchResultClick() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SEARCH, null, HatchScreen.SEARCH_RESULTS, HatchComponent.SEARCH_RESULT_ITEM, null, null, null);
    }

    public static final void CompactUnreadDot(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-765632032);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            C3Ue.A04(C1b8.A03(C10G.A07(bRg, SidePanelCompactUnreadDotSize), C1D8.A02(50), C06G.A0D(bfm)), bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114131(bRg, i, i2);
        }
    }

    public static final void ConversationHistoryActionOverlay(ThreadsView threadsView, HatchSessionItem hatchSessionItem, AaC aaC, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, BFM bfm, int i) {
        bfm.AgG(1399104230);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, threadsView) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchSessionItem, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, aaC);
        }
        if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0X(bfm, function02);
        }
        if ((196608 & i) == 0) {
            iA08 |= AnonymousClass004.A0Y(bfm, function03);
        }
        if ((1572864 & i) == 0) {
            iA08 |= AnonymousClass004.A0Z(bfm, function04);
        }
        if ((12582912 & i) == 0) {
            iA08 |= AnonymousClass004.A0a(bfm, function05);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(4793491 & iA08, 4793490), bfm, iA08)) {
            AXN axnA0Y = AnonymousClass002.A0Y(bfm);
            boolean z2 = true;
            if (threadsView != ThreadsView.ARCHIVED) {
                z2 = false;
                z = hatchSessionItem.isPinned;
            }
            C0n6.A00(bfm, new BA2(C79.A00, true, true, false, false), function05, B1V.A00(bfm, new C114141(function05, aaC, axnA0Y, hatchSessionItem, z2, function0, z, function02, function03, function04, ThreadContextMenuItemsKt.rememberThreadContextMenuItems(z2, z, Long.valueOf(hatchSessionItem.updatedAt), null, null, bfm, 0, 24)), 1371285949), ((iA08 >> 21) & 14) | 432, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114152(threadsView, hatchSessionItem, aaC, function0, function02, function03, function04, function05, i);
        }
    }

    public static final void NewSideChatBottomBarButton(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-651834976);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            SearchBottomBarIconButton(R.drawable.compose_wght400_outline_24, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12086e), function0, AbstractC07539Wl.A00(bRg, "hatch-new-side-chat-button"), false, bfm, (iA0T << 6) & 896, 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114231(function0, bRg, i, i2);
        }
    }

    public static final /* synthetic */ AaC access$ConversationHistoryRow_yKJFJhA$lambda$3(MutableState mutableState) {
        return (AaC) mutableState.getValue();
    }

    public static final /* synthetic */ SidePanelMode access$HatchConversationHistorySidePanelContent$lambda$16(MutableState mutableState) {
        return (SidePanelMode) mutableState.getValue();
    }

    public static final /* synthetic */ LoadingState access$HatchConversationHistorySidePanelContent$lambda$4(C1BO c1bo) {
        return (LoadingState) c1bo.getValue();
    }

    public static final /* synthetic */ LoadingState access$HatchConversationHistorySidePanelContent$lambda$7(C1BO c1bo) {
        return (LoadingState) c1bo.getValue();
    }

    public static final void logThreadClick(HatchSessionItem hatchSessionItem, boolean z) {
        AnonymousClass006.A0b(hatchSessionItem).logClick(HatchSurface.CHAT, null, HatchScreen.CONVERSATION_HISTORY, HatchComponent.THREAD_ITEM, null, AnonymousClass007.A0e(HatchMetadataKey.IS_ARCHIVED.getValue(), new HxE(HatchMetadataKey.THREAD_ID.getValue(), hatchSessionItem.sessionId), new HxE(HatchMetadataKey.IS_PRIMARY_THREAD.getValue(), "false"), z), null);
    }

    public static final C1BO<String> rememberAgentNameState(BFM bfm, int i) {
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        boolean zA65 = bfm.A65(abstractC3358CGzA0h);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = HatchIdentityProvider.Companion.getInstance(abstractC3358CGzA0h);
            bfm.Ai0(objAaT);
        }
        return C2CK.A02(bfm, ((HatchIdentityProvider) objAaT).aiIdentityName);
    }

    public static final int sidePanelIconRes(HatchMessageChannel hatchMessageChannel) {
        int iOrdinal = hatchMessageChannel.ordinal();
        if (iOrdinal == 0) {
            return R.drawable.whatsapp_outline_24_wght400;
        }
        if (iOrdinal == 1) {
            return R.drawable.messenger_outline_24_wght400;
        }
        if (iOrdinal == 3) {
            return R.drawable.instagramthreads_outline_24_wght400;
        }
        if (iOrdinal == 4) {
            return R.drawable.ic_channel_telegram;
        }
        if (iOrdinal == 2) {
            return R.drawable.instagram_logo_round;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0147  */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConversationHistoryLazyColumn(com.facebook.aura.conversation.repo.ThreadsView r71, java.util.List<com.facebook.aura.gateway.HatchSessionItem> r72, androidx.compose.foundation.lazy.LazyListState r73, boolean r74, com.facebook.aura.conversation.repo.LoadingState r75, java.lang.String r76, kotlin.jvm.functions.Function0<kotlin.Unit> r77, X.G0U<? super com.facebook.aura.gateway.HatchSessionItem, kotlin.Unit> r78, X.BRg r79, X.AHD<com.facebook.aura.gateway.HatchSessionItem> r80, boolean r81, float r82, boolean r83, boolean r84, boolean r85, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r86, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r87, X.BFM r88, int r89, int r90, int r91) {
        /*
            Method dump skipped, instructions count: 1892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt.ConversationHistoryLazyColumn(com.facebook.aura.conversation.repo.ThreadsView, java.util.List, androidx.compose.foundation.lazy.LazyListState, boolean, com.facebook.aura.conversation.repo.LoadingState, java.lang.String, kotlin.jvm.functions.Function0, X.G0U, X.BRg, X.AHD, boolean, float, boolean, boolean, boolean, X.G0V, X.G0V, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConversationHistoryPanelContent(com.facebook.aura.conversation.view.SidePanelMode r59, java.util.List<com.facebook.aura.gateway.HatchSessionItem> r60, androidx.compose.foundation.lazy.LazyListState r61, boolean r62, com.facebook.aura.conversation.repo.LoadingState r63, java.util.List<com.facebook.aura.gateway.HatchSessionItem> r64, androidx.compose.foundation.lazy.LazyListState r65, boolean r66, com.facebook.aura.conversation.repo.LoadingState r67, java.lang.String r68, X.AHD<com.facebook.aura.gateway.HatchSessionItem> r69, boolean r70, com.facebook.aura.tabs.AuraSidePanelCollapseState r71, kotlin.jvm.functions.Function0<kotlin.Unit> r72, kotlin.jvm.functions.Function0<kotlin.Unit> r73, kotlin.jvm.functions.Function0<kotlin.Unit> r74, kotlin.jvm.functions.Function0<kotlin.Unit> r75, X.G0U<? super com.facebook.aura.gateway.HatchSessionItem, kotlin.Unit> r76, java.lang.String r77, com.facebook.aura.conversation.repo.HatchSearchUiState r78, kotlin.jvm.functions.Function0<kotlin.Unit> r79, kotlin.jvm.functions.Function0<kotlin.Unit> r80, kotlin.jvm.functions.Function0<kotlin.Unit> r81, kotlin.jvm.functions.Function0<kotlin.Unit> r82, X.G0U<? super com.facebook.aura.gateway.HatchSessionItem, kotlin.Unit> r83, X.G0U<? super com.facebook.aura.gateway.HatchSessionItem, kotlin.Unit> r84, X.G2k<? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.Long, kotlin.Unit> r85, X.BRg r86, X.BFM r87, int r88, int r89, int r90, int r91) {
        /*
            Method dump skipped, instructions count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt.ConversationHistoryPanelContent(com.facebook.aura.conversation.view.SidePanelMode, java.util.List, androidx.compose.foundation.lazy.LazyListState, boolean, com.facebook.aura.conversation.repo.LoadingState, java.util.List, androidx.compose.foundation.lazy.LazyListState, boolean, com.facebook.aura.conversation.repo.LoadingState, java.lang.String, X.AHD, boolean, com.facebook.aura.tabs.AuraSidePanelCollapseState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, java.lang.String, com.facebook.aura.conversation.repo.HatchSearchUiState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, X.G0U, X.G2k, X.BRg, X.BFM, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0724  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchConversationHistorySidePanelContent(kotlin.jvm.functions.Function0<kotlin.Unit> r85, kotlin.jvm.functions.Function0<kotlin.Unit> r86, kotlin.jvm.functions.Function0<kotlin.Unit> r87, X.G2k<? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.Long, kotlin.Unit> r88, androidx.compose.foundation.lazy.LazyListState r89, androidx.compose.foundation.lazy.LazyListState r90, X.BRg r91, boolean r92, X.G0U<? super kotlin.jvm.functions.Function0<java.lang.Boolean>, kotlin.Unit> r93, X.G0U<? super java.lang.Boolean, kotlin.Unit> r94, X.BFM r95, int r96, int r97) {
        /*
            Method dump skipped, instructions count: 1955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt.HatchConversationHistorySidePanelContent(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G2k, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.lazy.LazyListState, X.BRg, boolean, X.G0U, X.G0U, X.BFM, int, int):void");
    }
}
