package com.facebook.aura.conversation.view;

import X.AHD;
import X.AaC;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.BRg;
import X.C0AU;
import X.C0CD;
import X.C10G;
import X.C1DP;
import X.C1Z5;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.HxE;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.repo.LoadingState;
import com.facebook.aura.conversation.repo.ThreadsView;
import com.facebook.aura.gateway.HatchSessionItem;
import com.facebook.aura.tabs.AuraSidePanelTabsKt;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ MutableState<AaC> $actionOverlayBounds$delegate;
    public final /* synthetic */ MutableState<HatchSessionItem> $actionOverlaySession$delegate;
    public final /* synthetic */ AHD<HatchSessionItem> $activeChannelThreads;
    public final /* synthetic */ float $collapseProgress;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $footerContent;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $headerContent;
    public final /* synthetic */ boolean $isLoadingMore;
    public final /* synthetic */ LoadingState $loadingState;
    public final /* synthetic */ G0U<HatchSessionItem, Unit> $onThreadClick;
    public final /* synthetic */ String $selectedSessionId;
    public final /* synthetic */ List<HxE<Integer, List<HatchSessionItem>>> $sessionGroups;
    public final /* synthetic */ List<HatchSessionItem> $sessions;
    public final /* synthetic */ AuraCardStyle $settingsCardStyle;
    public final /* synthetic */ boolean $showMoreButton;
    public final /* synthetic */ boolean $useFigmaStyle;
    public final /* synthetic */ boolean $useSettingsStyle;
    public final /* synthetic */ ThreadsView $view;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $headerContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(3);
            this.$headerContent = g0v;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AnonymousClass001.A1H(bfm, this.$headerContent, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ LoadingState $loadingState;
        public final /* synthetic */ boolean $useFigmaStyle;
        public final /* synthetic */ ThreadsView $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ThreadsView threadsView, LoadingState loadingState, boolean z) {
            super(3);
            this.$view = threadsView;
            this.$loadingState = loadingState;
            this.$useFigmaStyle = z;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            BRg c1z5;
            C7384Etj.A0Y(anonymousClass037, 0);
            if ((i & 6) == 0) {
                i |= AnonymousClass004.A0d(bfm, anonymousClass037);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
                ThreadsView threadsView = this.$view;
                LoadingState loadingState = this.$loadingState;
                boolean z = this.$useFigmaStyle;
                if (z) {
                    c1z5 = C10G.A02;
                } else {
                    C0AU c0au = (C0AU) anonymousClass037;
                    c1z5 = new C1Z5(c0au.A01, c0au.A00, "fillParentMaxSize", 1.0f);
                }
                HatchConversationHistorySidePanelKt.ConversationHistoryEmptyState(threadsView, loadingState, z, c1z5, bfm, 0, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $footerContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(3);
            this.$footerContent = g0v;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AnonymousClass001.A1H(bfm, this.$footerContent, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        G0V<BFM, Integer, Unit> g0v = this.$headerContent;
        if (g0v != null) {
            c0cd.APJ("side-panel-navigation", "side-panel-navigation", B1V.A01(new AnonymousClass1(g0v), -550322774, true));
        }
        c0cd.APJ(HatchConversationHistorySidePanelKt.SIDE_PANEL_THREAD_LIST_TOP_ANCHOR_KEY, null, ComposableSingletons$HatchConversationHistorySidePanelKt.f28lambda$35783643);
        if (this.$collapseProgress != 0.0f) {
            if (this.$sessions.isEmpty()) {
                c0cd.APJ("empty-state", null, B1V.A01(new AnonymousClass3(this.$view, this.$loadingState, this.$useFigmaStyle), 2136708297, true));
            } else {
                List<HxE<Integer, List<HatchSessionItem>>> list = this.$sessionGroups;
                boolean z = this.$useSettingsStyle;
                final float f = this.$collapseProgress;
                final AHD<HatchSessionItem> ahd = this.$activeChannelThreads;
                AuraCardStyle auraCardStyle = this.$settingsCardStyle;
                final String str = this.$selectedSessionId;
                boolean z2 = this.$showMoreButton;
                final ThreadsView threadsView = this.$view;
                final G0U<HatchSessionItem, Unit> g0u = this.$onThreadClick;
                final MutableState<HatchSessionItem> mutableState = this.$actionOverlaySession$delegate;
                final MutableState<AaC> mutableState2 = this.$actionOverlayBounds$delegate;
                final boolean z3 = this.$useFigmaStyle;
                int i = 0;
                for (HxE<Integer, List<HatchSessionItem>> hxE : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC0885AGm.A14();
                        throw F60.createAndThrow();
                    }
                    HxE<Integer, List<HatchSessionItem>> hxE2 = hxE;
                    Integer num = hxE2.first;
                    final List<HatchSessionItem> list2 = hxE2.second;
                    if (num != null) {
                        c0cd.APJ(AnonymousClass007.A0a("section-", num), null, B1V.A01(new HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$1(num, i, f), 1789271770, true));
                    }
                    if (z) {
                        HatchSectionKt.m2324HatchSectionlMAxDYE(c0cd, false, null, null, null, null, new HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$2(list2, ahd, auraCardStyle, str, z2, threadsView, g0u, mutableState, mutableState2));
                    } else {
                        final HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$3 hatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$3 = HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$3.INSTANCE;
                        c0cd.APL(hatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$3 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$invoke$lambda$0$$inlined$itemsIndexed$default$1
                            public final Object invoke(int i3) {
                                return AnonymousClass006.A0n(Integer.valueOf(i3), list2, hatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$3, i3);
                            }

                            @Override // X.G0U
                            public /* bridge */ /* synthetic */ Object invoke(Integer num2) {
                                return invoke(AnonymousClass001.A0F(num2));
                            }
                        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$invoke$lambda$0$$inlined$itemsIndexed$default$2
                            @Override // X.G0U
                            public /* bridge */ /* synthetic */ Object invoke(Integer num2) {
                                list2.get(AnonymousClass001.A0F(num2));
                                return null;
                            }

                            public final Object invoke(int i3) {
                                list2.get(i3);
                                return null;
                            }
                        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$invoke$lambda$0$$inlined$itemsIndexed$default$3
                            public final void invoke(AnonymousClass037 anonymousClass037, int i3, BFM bfm, int i4) {
                                int iA0d = (i4 & 6) == 0 ? i4 | AnonymousClass004.A0d(bfm, anonymousClass037) : i4;
                                if ((i4 & 48) == 0) {
                                    iA0d |= AnonymousClass004.A0E(bfm, i3);
                                }
                                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                                    bfm.Afo();
                                    return;
                                }
                                HatchSessionItem hatchSessionItem = (HatchSessionItem) list2.get(i3);
                                bfm.AgE(1150168187);
                                BRg bRgSidePanelSectionCollapse = AuraSidePanelTabsKt.sidePanelSectionCollapse(C10G.A02, f);
                                String strDisplayAccountUsername = HatchChannelDisplayNameKt.displayAccountUsername(hatchSessionItem, ahd);
                                float f2 = z3 ? HatchConversationHistorySidePanelKt.SidePanelFigmaRowHorizontalPadding : HatchConversationHistorySidePanelKt.SidePanelRowHorizontalPadding;
                                float f3 = HatchConversationHistorySidePanelKt.SidePanelThreadRowVerticalPadding;
                                C1DP c1dp = new C1DP(f2, f3, f2, f3);
                                boolean zAreEqual = C7384Etj.areEqual(hatchSessionItem.sessionId, str);
                                ThreadsView threadsView2 = threadsView;
                                boolean zA1J = AnonymousClass003.A1J(bfm, g0u, hatchSessionItem);
                                Object objAaT = bfm.AaT();
                                if (zA1J || objAaT == C78N.A00) {
                                    objAaT = new HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$4$1$1(g0u, hatchSessionItem);
                                    bfm.Ai0(objAaT);
                                }
                                Function0 function0 = (Function0) objAaT;
                                boolean zA67 = bfm.A67(hatchSessionItem);
                                Object objAaT2 = bfm.AaT();
                                if (zA67 || objAaT2 == C78N.A00) {
                                    objAaT2 = new HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1$2$4$2$1(hatchSessionItem, mutableState, mutableState2);
                                    bfm.Ai0(objAaT2);
                                }
                                HatchConversationHistorySidePanelKt.m550ConversationHistoryRowyKJFJhA(threadsView2, hatchSessionItem, strDisplayAccountUsername, c1dp, function0, (G0U) objAaT2, null, zAreEqual, bRgSidePanelSectionCollapse, z3, 0.0f, bfm, (HatchSessionItem.$stable << 3) | 1572864, 0, 1024);
                                AnonymousClass001.A1D(bfm);
                            }

                            @Override // X.G2j
                            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num2, BFM bfm, Integer num3) {
                                invoke(anonymousClass037, AnonymousClass001.A0F(num2), bfm, AnonymousClass001.A0F(num3));
                                return Unit.INSTANCE;
                            }
                        }, 2039820996, true), list2.size());
                    }
                    i = i2;
                }
                if (this.$isLoadingMore) {
                    c0cd.APJ("loading-more", null, ComposableSingletons$HatchConversationHistorySidePanelKt.lambda$623356471);
                }
            }
            G0V<BFM, Integer, Unit> g0v2 = this.$footerContent;
            if (g0v2 != null) {
                c0cd.APJ("conversation-history-footer", "conversation-history-footer", B1V.A01(new AnonymousClass4(g0v2), -1924861231, true));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationHistorySidePanelKt$ConversationHistoryLazyColumn$2$1$1(G0V<? super BFM, ? super Integer, Unit> g0v, float f, List<HatchSessionItem> list, List<? extends HxE<Integer, ? extends List<HatchSessionItem>>> list2, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v2, boolean z2, AHD<HatchSessionItem> ahd, AuraCardStyle auraCardStyle, String str, boolean z3, ThreadsView threadsView, G0U<? super HatchSessionItem, Unit> g0u, MutableState<HatchSessionItem> mutableState, MutableState<AaC> mutableState2, boolean z4, LoadingState loadingState) {
        super(1);
        this.$headerContent = g0v;
        this.$collapseProgress = f;
        this.$sessions = list;
        this.$sessionGroups = list2;
        this.$isLoadingMore = z;
        this.$footerContent = g0v2;
        this.$useSettingsStyle = z2;
        this.$activeChannelThreads = ahd;
        this.$settingsCardStyle = auraCardStyle;
        this.$selectedSessionId = str;
        this.$showMoreButton = z3;
        this.$view = threadsView;
        this.$onThreadClick = g0u;
        this.$actionOverlaySession$delegate = mutableState;
        this.$actionOverlayBounds$delegate = mutableState2;
        this.$useFigmaStyle = z4;
        this.$loadingState = loadingState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
