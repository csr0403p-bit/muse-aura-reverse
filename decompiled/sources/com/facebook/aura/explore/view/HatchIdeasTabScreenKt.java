package com.facebook.aura.explore.view;

import X.AHD;
import X.AIW;
import X.AKH;
import X.AKQ;
import X.ARD;
import X.AVy;
import X.AXY;
import X.AYU;
import X.AZE;
import X.AbstractC0878AGe;
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
import X.B18;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJW;
import X.BL4;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0924AIa;
import X.C0CD;
import X.C1003AOr;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1BO;
import X.C1DG;
import X.C1DP;
import X.C1YY;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C31t;
import X.C3TG;
import X.C3U4;
import X.C3UC;
import X.C3UX;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C7bA;
import X.C90m;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1134Abi;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.explore.model.HatchExploreViewModel;
import com.facebook.aura.explore.repo.ExploreLoadingState;
import com.facebook.aura.explore.repo.IdeaCard;
import com.facebook.aura.explore.repo.IdeaCardExecutionState;
import com.facebook.aura.explore.repo.IdeaCardSection;
import com.facebook.aura.explore.repo.IdeaFeedback;
import com.facebook.aura.explore.view.cards.IdeaCardPreviewImageKt;
import com.facebook.aura.feedback.view.FeedbackReasonMenuKt;
import com.facebook.aura.header.view.HatchTabScreenKt;
import com.facebook.aura.header.view.HeaderLeadingButton;
import com.facebook.aura.header.view.ScrimScrollConnectionKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ExploreScreenKey;
import com.facebook.aura.perf.HatchNavTTRCCoordinator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchPullToRefreshKt;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.divider.AuraDividerStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.loading.AutoLoadMoreKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchIdeasTabScreenKt {
    public static final String CARD_TYPE = "idea_list_row";
    public static final long IDEA_DISMISS_TIMEOUT_MS = 1000;
    public static final float IDEA_ROW_MIN_VISIBLE_FRACTION = 0.9f;
    public static final float IdeaRowContentGap = 10.0f;
    public static final float IdeaRowHorizontalPadding = 16.0f;
    public static final float IdeaRowIconSize = 44.0f;
    public static final C1003AOr<BL4> IdeaDismissShrinkSpec = new C1003AOr<>(null, 0.8f, 204.0f);
    public static final C1003AOr<Float> IdeaDismissFadeSpec = new C1003AOr<>(null, 0.8f, 247.0f);
    public static final float IdeaRowDividerStartBleed = (16.0f + 44.0f) + 10.0f;

    /* renamed from: com.facebook.aura.explore.view.HatchIdeasTabScreenKt$HatchIdeasTabScreen$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0W<C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<String> $dismissedIdeaCardId;
        public final /* synthetic */ G0U<String, Unit> $finishDismissal;
        public final /* synthetic */ C1BO<HatchExploreViewModel.IdeasUiState> $ideasState$delegate;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ String $loadingDescription;
        public final /* synthetic */ G0U<String, Unit> $onCardClick;
        public final /* synthetic */ Function0<Unit> $onIdeasViewFinished;
        public final /* synthetic */ MutableState<String> $swipingIdeaCardId;
        public final /* synthetic */ HatchExploreViewModel $viewModel;

        /* renamed from: com.facebook.aura.explore.view.HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
            public final /* synthetic */ MutableState<String> $dismissedIdeaCardId;
            public final /* synthetic */ G0U<String, Unit> $finishDismissal;
            public final /* synthetic */ C1BO<HatchExploreViewModel.IdeasUiState> $ideasState$delegate;
            public final /* synthetic */ LazyListState $listState;
            public final /* synthetic */ String $loadingDescription;
            public final /* synthetic */ G0U<String, Unit> $onCardClick;
            public final /* synthetic */ Function0<Unit> $onIdeasViewFinished;
            public final /* synthetic */ MutableState<String> $swipingIdeaCardId;
            public final /* synthetic */ float $topPadding;
            public final /* synthetic */ HatchExploreViewModel $viewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(String str, HatchExploreViewModel hatchExploreViewModel, Function0<Unit> function0, float f, LazyListState lazyListState, C1BO<HatchExploreViewModel.IdeasUiState> c1bo, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, MutableState<String> mutableState, MutableState<String> mutableState2) {
                super(3);
                this.$loadingDescription = str;
                this.$viewModel = hatchExploreViewModel;
                this.$onIdeasViewFinished = function0;
                this.$topPadding = f;
                this.$listState = lazyListState;
                this.$ideasState$delegate = c1bo;
                this.$onCardClick = g0u;
                this.$finishDismissal = g0u2;
                this.$swipingIdeaCardId = mutableState;
                this.$dismissedIdeaCardId = mutableState2;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
                invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                    if (this.$ideasState$delegate.getValue().sections.isEmpty()) {
                        if (this.$ideasState$delegate.getValue().loadingState != ExploreLoadingState.INITIAL && this.$ideasState$delegate.getValue().loadingState != ExploreLoadingState.LOADING) {
                            if (this.$ideasState$delegate.getValue().loadingState == ExploreLoadingState.ERROR) {
                                bfm.AgE(-1272226018);
                                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120255);
                                boolean zA67 = bfm.A67(this.$viewModel);
                                HatchExploreViewModel hatchExploreViewModel = this.$viewModel;
                                Object objAaT = bfm.AaT();
                                if (zA67 || objAaT == C78N.A00) {
                                    objAaT = new HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$3$1(hatchExploreViewModel);
                                    bfm.Ai0(objAaT);
                                }
                                HatchScreenErrorStateKt.HatchScreenErrorState(strA01, (Function0) objAaT, C10G.A01, HatchSurface.IDEAS, null, HatchScreen.IDEAS_HOME, null, bfm, 200064, 80);
                            } else {
                                bfm.AgE(-1271896984);
                                C1062ATq c1062ATq = C10G.A01;
                                boolean zA65 = bfm.A65(this.$onIdeasViewFinished);
                                Function0<Unit> function0 = this.$onIdeasViewFinished;
                                Object objAaT2 = bfm.AaT();
                                if (zA65 || objAaT2 == C78N.A00) {
                                    objAaT2 = new HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$4$1(function0);
                                    bfm.Ai0(objAaT2);
                                }
                                IdeasEmptyStateKt.IdeasEmptyState(BJW.A00(c1062ATq, (Function0) objAaT2), bfm, 0, 0);
                            }
                        } else {
                            bfm.AgE(-1272642782);
                            C1062ATq c1062ATq2 = C10G.A01;
                            boolean zA652 = bfm.A65(this.$loadingDescription);
                            String str = this.$loadingDescription;
                            Object objAaT3 = bfm.AaT();
                            if (zA652 || objAaT3 == C78N.A00) {
                                objAaT3 = new HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$1$1(str);
                                bfm.Ai0(objAaT3);
                            }
                            BRg bRgA0Y = AnonymousClass001.A0Y(c1062ATq2, objAaT3, false);
                            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                            BBI bbi = (BBI) bfm;
                            int iA0J = AnonymousClass003.A0J(bbi);
                            AKQ akqA04 = BBI.A04(bbi);
                            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
                            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                            if (bbi.A0V == null) {
                                C00x.A00();
                                throw F60.createAndThrow();
                            }
                            AnonymousClass005.A0n(bfm, bbi, function02);
                            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
                            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
                            BBI.A0R(bbi, true);
                        }
                    } else {
                        bfm.AgE(-1271552109);
                        C1DP c1dp = new C1DP(0.0f, this.$topPadding, 0.0f, 24.0f);
                        C1062ATq c1062ATq3 = C10G.A01;
                        boolean zA653 = bfm.A65(this.$onIdeasViewFinished);
                        Function0<Unit> function03 = this.$onIdeasViewFinished;
                        Object objAaT4 = bfm.AaT();
                        if (zA653 || objAaT4 == C78N.A00) {
                            objAaT4 = new HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$5$1(function03);
                            bfm.Ai0(objAaT4);
                        }
                        BRg bRgA00 = BJW.A00(c1062ATq3, (Function0) objAaT4);
                        LazyListState lazyListState = this.$listState;
                        boolean zA1R = AnonymousClass001.A1R(bfm, this.$finishDismissal, AnonymousClass001.A1R(bfm, this.$onCardClick, AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A65(this.$ideasState$delegate))));
                        C1BO<HatchExploreViewModel.IdeasUiState> c1bo = this.$ideasState$delegate;
                        MutableState<String> mutableState = this.$swipingIdeaCardId;
                        MutableState<String> mutableState2 = this.$dismissedIdeaCardId;
                        HatchExploreViewModel hatchExploreViewModel2 = this.$viewModel;
                        G0U<String, Unit> g0u = this.$onCardClick;
                        G0U<String, Unit> g0u2 = this.$finishDismissal;
                        Object objAaT5 = bfm.AaT();
                        if (zA1R || objAaT5 == C78N.A00) {
                            objAaT5 = new HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1(c1bo, mutableState, mutableState2, hatchExploreViewModel2, g0u, g0u2);
                            bfm.Ai0(objAaT5);
                        }
                        C1YY.A01(null, null, null, c1dp, lazyListState, bfm, null, bRgA00, (G0U) objAaT5, 0, 504, false, false);
                        if (this.$ideasState$delegate.getValue().hasMore) {
                            bfm.AgE(-1265811405);
                            LazyListState lazyListState2 = this.$listState;
                            boolean zA672 = bfm.A67(this.$viewModel);
                            HatchExploreViewModel hatchExploreViewModel3 = this.$viewModel;
                            Object objAaT6 = bfm.AaT();
                            if (zA672 || objAaT6 == C78N.A00) {
                                objAaT6 = new HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$7$1(hatchExploreViewModel3);
                                bfm.Ai0(objAaT6);
                            }
                            AutoLoadMoreKt.AutoLoadMore(lazyListState2, 40, (Function0<Unit>) objAaT6, bfm, 48, 0);
                        } else {
                            bfm.AgE(-1265713383);
                        }
                        AnonymousClass001.A1D(bfm);
                    }
                    AnonymousClass001.A1D(bfm);
                    return;
                }
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(HatchExploreViewModel hatchExploreViewModel, C1BO<HatchExploreViewModel.IdeasUiState> c1bo, String str, Function0<Unit> function0, LazyListState lazyListState, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, MutableState<String> mutableState, MutableState<String> mutableState2) {
            super(3);
            this.$viewModel = hatchExploreViewModel;
            this.$ideasState$delegate = c1bo;
            this.$loadingDescription = str;
            this.$onIdeasViewFinished = function0;
            this.$listState = lazyListState;
            this.$onCardClick = g0u;
            this.$finishDismissal = g0u2;
            this.$swipingIdeaCardId = mutableState;
            this.$dismissedIdeaCardId = mutableState2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, BFM bfm, Integer num) {
            m773invoke8Feqmps(c1dg.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-8Feqmps, reason: not valid java name */
        public final void m773invoke8Feqmps(float f, BFM bfm, int i) {
            int iA04 = i;
            if ((i & 6) == 0) {
                iA04 = i | AnonymousClass004.A04(bfm, f);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 19, 18), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            boolean z = this.$ideasState$delegate.getValue().loadingState == ExploreLoadingState.REFRESHING;
            boolean zA67 = bfm.A67(this.$viewModel);
            HatchExploreViewModel hatchExploreViewModel = this.$viewModel;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$1$1(hatchExploreViewModel);
                bfm.Ai0(objAaT);
            }
            HatchPullToRefreshKt.m2322HatchPullToRefreshjIwJxvA(z, (Function0) objAaT, null, f, null, B1V.A00(bfm, new AnonymousClass2(this.$loadingDescription, this.$viewModel, this.$onIdeasViewFinished, f, this.$listState, this.$ideasState$delegate, this.$onCardClick, this.$finishDismissal, this.$swipingIdeaCardId, this.$dismissedIdeaCardId), -432408439), bfm, ((iA04 << 9) & 7168) | 196608, 20);
        }
    }

    /* renamed from: com.facebook.aura.explore.view.HatchIdeasTabScreenKt$HatchIdeasTabScreen$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onCardClick;
        public final /* synthetic */ HatchExploreViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(HatchExploreViewModel hatchExploreViewModel, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = hatchExploreViewModel;
            this.$onCardClick = g0u;
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
            HatchIdeasTabScreenKt.HatchIdeasTabScreen(this.$viewModel, this.$onCardClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.explore.view.HatchIdeasTabScreenKt$IdeaRowContent$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $category;
        public final /* synthetic */ AHD<String> $connectionIds;
        public final /* synthetic */ Function0<Float> $dividerAlpha;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ boolean $isColorIconEnabled;
        public final /* synthetic */ boolean $isCompleted;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Integer, Unit> $onContentHeightChanged;
        public final /* synthetic */ boolean $showChevron;
        public final /* synthetic */ boolean $showDivider;
        public final /* synthetic */ String $summary;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, boolean z4, BRg bRg, G0U<? super Integer, Unit> g0u, Function0<Float> function0, AHD<String> ahd, int i, int i2, int i3) {
            super(2);
            this.$title = str;
            this.$summary = str2;
            this.$category = str3;
            this.$isCompleted = z;
            this.$showDivider = z2;
            this.$showChevron = z3;
            this.$iconUrl = str4;
            this.$isColorIconEnabled = z4;
            this.$modifier = bRg;
            this.$onContentHeightChanged = g0u;
            this.$dividerAlpha = function0;
            this.$connectionIds = ahd;
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
            HatchIdeasTabScreenKt.IdeaRowContent(this.$title, this.$summary, this.$category, this.$isCompleted, this.$showDivider, this.$showChevron, this.$iconUrl, this.$isColorIconEnabled, this.$modifier, this.$onContentHeightChanged, this.$dividerAlpha, this.$connectionIds, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.explore.view.HatchIdeasTabScreenKt$IdeaRowIcon$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ boolean $isColorIconEnabled;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$iconUrl = str;
            this.$isColorIconEnabled = z;
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
            HatchIdeasTabScreenKt.IdeaRowIcon(this.$iconUrl, this.$isColorIconEnabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.explore.view.HatchIdeasTabScreenKt$IdeaRowIcon$3, reason: invalid class name and case insensitive filesystem */
    public final class C118573 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ boolean $isColorIconEnabled;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118573(String str, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$iconUrl = str;
            this.$isColorIconEnabled = z;
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
            HatchIdeasTabScreenKt.IdeaRowIcon(this.$iconUrl, this.$isColorIconEnabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.explore.view.HatchIdeasTabScreenKt$IdeaRowText$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $category;
        public final /* synthetic */ boolean $isCompleted;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $showChevron;
        public final /* synthetic */ String $summary;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, String str3, boolean z, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$summary = str2;
            this.$category = str3;
            this.$isCompleted = z;
            this.$showChevron = z2;
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
            HatchIdeasTabScreenKt.IdeaRowText(this.$title, this.$summary, this.$category, this.$isCompleted, this.$showChevron, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.explore.view.HatchIdeasTabScreenKt$IdeasListTitle$2, reason: invalid class name and case insensitive filesystem */
    public final class C118582 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118582(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
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
            HatchIdeasTabScreenKt.IdeasListTitle(this.$title, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.explore.view.HatchIdeasTabScreenKt$IdeasSectionDivider$2, reason: invalid class name and case insensitive filesystem */
    public final class C118592 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $hidden;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118592(boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$hidden = z;
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
            HatchIdeasTabScreenKt.IdeasSectionDivider(this.$hidden, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.explore.view.HatchIdeasTabScreenKt$ideaRowDividerFullWidth$1, reason: invalid class name and case insensitive filesystem */
    public final class C118601 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
        public static final C118601 INSTANCE = new C118601();

        /* renamed from: com.facebook.aura.explore.view.HatchIdeasTabScreenKt$ideaRowDividerFullWidth$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01501 extends AbstractC7559F3s implements G0U<AYU, Unit> {
            public final /* synthetic */ AZE $placeable;
            public final /* synthetic */ int $startBleed;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AYU ayu) {
                C7384Etj.A0Y(ayu, 0);
                AYU.A04(ayu, this.$placeable, -this.$startBleed, 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01501(AZE aze, int i) {
                super(1);
                this.$placeable = aze;
                this.$startBleed = i;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
                invoke2(ayu);
                return Unit.INSTANCE;
            }
        }

        public C118601() {
            super(3);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
            return m775invoke3p2s80s(axy, c3tg, constraints.A00);
        }

        /* renamed from: invoke-3p2s80s, reason: not valid java name */
        public final InterfaceC1134Abi m775invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
            AnonymousClass003.A0u(axy, c3tg);
            int iAbr = axy.Abr(HatchIdeasTabScreenKt.IdeaRowDividerStartBleed);
            int iAbr2 = axy.Abr(HatchIdeasTabScreenKt.IdeaRowHorizontalPadding) + iAbr;
            int iA03 = Constraints.A03(j) + iAbr2;
            int iA01 = Constraints.A01(j);
            AZE azeAQW = c3tg.AQW(AnonymousClass004.A0x(j, iA03, iA01 != Integer.MAX_VALUE ? iA01 + iAbr2 : Integer.MAX_VALUE));
            return AnonymousClass002.A0X(axy, new C01501(azeAQW, iAbr), azeAQW.A01 - iAbr2, azeAQW.A00);
        }
    }

    public static final void HatchIdeasTabScreen(HatchExploreViewModel hatchExploreViewModel, G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(hatchExploreViewModel, g0u);
        bfm.AgG(893739741);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchExploreViewModel) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            C1BO c1boA02 = C2CK.A02(bfm, hatchExploreViewModel.ideasUiState);
            Function0<Unit> function0RememberIdeasTabTtrc = rememberIdeasTabTtrc(bfm, zA1b ? 1 : 0);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12025e);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12025a);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12025c);
            String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12025b);
            String strA015 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120256);
            String strA016 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120257);
            String strA017 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120299);
            String strA018 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120263);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT;
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(hatchExploreViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new HatchIdeasTabScreenKt$HatchIdeasTabScreen$1$1(hatchExploreViewModel);
                bfm.Ai0(objAaT2);
            }
            C7bA.A05(bfm, null, unit, (G0U) objAaT2, 6, 2);
            LazyListState lazyListStateRememberScrimBoundLazyListState = ScrimScrollConnectionKt.rememberScrimBoundLazyListState(zA1b ? 1 : 0, zA1b ? 1 : 0, bfm, zA1b ? 1 : 0, 3);
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, bfm.AaT(), obj);
            MutableState mutableState2 = (MutableState) AnonymousClass005.A0f(bfm, obj, null);
            MutableState mutableState3 = (MutableState) AnonymousClass005.A0f(bfm, obj, null);
            boolean zA672 = bfm.A67(hatchExploreViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == obj) {
                objAaT3 = new HatchIdeasTabScreenKt$HatchIdeasTabScreen$finishDismissal$1$1(hatchExploreViewModel, mutableState2, mutableState3);
                bfm.Ai0(objAaT3);
            }
            G0U g0u2 = (G0U) objAaT3;
            Object value = mutableState3.getValue();
            boolean zA65 = bfm.A65(g0u2);
            Object objAaT4 = bfm.AaT();
            if (zA65 || objAaT4 == obj) {
                objAaT4 = new HatchIdeasTabScreenKt$HatchIdeasTabScreen$2$1(mutableState3, g0u2, null);
                bfm.Ai0(objAaT4);
            }
            AnonymousClass001.A18(bfm, objAaT4, value);
            boolean zA1R = AnonymousClass001.A1R(bfm, strA015, AnonymousClass005.A1T(bfm, strA013, strA012, strA014, AnonymousClass005.A1T(bfm, strA017, strA016, strA01, AnonymousClass003.A1M(bfm, hatchExploreViewModel, auraNavigatorA0b))));
            Object objAaT5 = bfm.AaT();
            if (zA1R || objAaT5 == obj) {
                objAaT5 = new HatchIdeasTabScreenKt$HatchIdeasTabScreen$3$1(hatchExploreViewModel, auraNavigatorA0b, mutableState3, strA017, strA016, strA01, strA013, strA012, strA014, strA015, mutableState, null);
                bfm.Ai0(objAaT5);
            }
            AnonymousClass001.A18(bfm, objAaT5, unit);
            ExploreLoadingState exploreLoadingState = ((HatchExploreViewModel.IdeasUiState) c1boA02.getValue()).loadingState;
            boolean zA1K = AnonymousClass003.A1K(bfm, c1boA02, lazyListStateRememberScrimBoundLazyListState);
            Object objAaT6 = bfm.AaT();
            if (zA1K || objAaT6 == obj) {
                objAaT6 = new HatchIdeasTabScreenKt$HatchIdeasTabScreen$4$1(lazyListStateRememberScrimBoundLazyListState, c1boA02, null);
                bfm.Ai0(objAaT6);
            }
            AnonymousClass001.A18(bfm, objAaT6, exploreLoadingState);
            ExploreScreenKey exploreScreenKey = ExploreScreenKey.INSTANCE;
            HeaderLeadingButton headerLeadingButton = HeaderLeadingButton.SidePanel;
            boolean zA1N = AnonymousClass003.A1N(bfm, c3ux, lazyListStateRememberScrimBoundLazyListState);
            Object objAaT7 = bfm.AaT();
            if (zA1N || objAaT7 == obj) {
                objAaT7 = new HatchIdeasTabScreenKt$HatchIdeasTabScreen$5$1(c3ux, lazyListStateRememberScrimBoundLazyListState);
                bfm.Ai0(objAaT7);
            }
            HatchTabScreenKt.m1022HatchTabScreenTsp2nRQ(exploreScreenKey, bRg2, null, null, 0L, null, null, 0.0f, zA1b, null, null, null, null, null, null, headerLeadingButton, zA1b, zA1b, null, (Function0) objAaT7, null, null, zA1b, zA1b, zA1b, zA1b, 0.0f, null, B1V.A00(bfm, new AnonymousClass6(hatchExploreViewModel, c1boA02, strA018, function0RememberIdeasTabTtrc, lazyListStateRememberScrimBoundLazyListState, g0u, g0u2, mutableState2, mutableState3), -370350107), bfm, ((iA0T >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 196608, 100663296, 267878396);
            String strA05 = MutableState.A05(mutableState);
            if (strA05 == null) {
                bfm.AgE(911936088);
            } else {
                Object objA0p = AnonymousClass001.A0p(bfm, 911936089);
                if (objA0p == obj) {
                    objA0p = new HatchIdeasTabScreenKt$HatchIdeasTabScreen$7$1$1(mutableState);
                    bfm.Ai0(objA0p);
                }
                Function0 function0 = (Function0) objA0p;
                boolean zA1J = AnonymousClass003.A1J(bfm, strA05, hatchExploreViewModel);
                Object objAaT8 = bfm.AaT();
                if (zA1J || objAaT8 == obj) {
                    objAaT8 = new HatchIdeasTabScreenKt$HatchIdeasTabScreen$7$2$1(strA05, hatchExploreViewModel, mutableState);
                    bfm.Ai0(objAaT8);
                }
                G0V g0v = (G0V) objAaT8;
                boolean zA1J2 = AnonymousClass003.A1J(bfm, strA05, auraNavigatorA0b);
                Object objAaT9 = bfm.AaT();
                if (zA1J2 || objAaT9 == obj) {
                    objAaT9 = new HatchIdeasTabScreenKt$HatchIdeasTabScreen$7$3$1(strA05, auraNavigatorA0b, mutableState);
                    bfm.Ai0(objAaT9);
                }
                Function0 function02 = (Function0) objAaT9;
                boolean zA652 = bfm.A65(strA05);
                Object objAaT10 = bfm.AaT();
                if (zA652 || objAaT10 == obj) {
                    objAaT10 = new HatchIdeasTabScreenKt$HatchIdeasTabScreen$7$4$1(strA05, mutableState);
                    bfm.Ai0(objAaT10);
                }
                FeedbackReasonMenuKt.FeedbackReasonMenu(function0, g0v, function02, null, (Function0) objAaT10, bfm, 6, 8);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass8(hatchExploreViewModel, g0u, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void IdeaRowContent(java.lang.String r33, java.lang.String r34, java.lang.String r35, boolean r36, boolean r37, boolean r38, java.lang.String r39, boolean r40, X.BRg r41, X.G0U<? super java.lang.Integer, kotlin.Unit> r42, kotlin.jvm.functions.Function0<java.lang.Float> r43, X.AHD<java.lang.String> r44, X.BFM r45, int r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.explore.view.HatchIdeasTabScreenKt.IdeaRowContent(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String, boolean, X.BRg, X.G0U, kotlin.jvm.functions.Function0, X.AHD, X.BFM, int, int, int):void");
    }

    public static final void IdeaRowIcon(String str, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c118573;
        BRg bRg2 = bRg;
        bfm.AgG(-1371674333);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
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
            if (str != null && z) {
                bfm.AgE(-1231040080);
                IdeaCardPreviewImageKt.m795IdeaCardPreviewImageFV1VA1c(str, C10G.A07(bRg2, IdeaRowIconSize), 0, B18.A02, null, null, bfm, (iA0d & 14) | 3072, 52);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    c118573 = new AnonymousClass1(str, z, bRg2, i, i2);
                    bBbAAc.A06 = c118573;
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, -1230871905);
            BRg bRgA02 = C11U.A02(bRg2, IdeaRowIconSize);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA01 = C1b8.A01(bRgA02, AnonymousClass001.A0f(bfm, akh).bubble);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            long j = bbiA0M.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA012, i4);
            if (str != null) {
                bfm.AgE(507635228);
                IdeaCardPreviewImageKt.m795IdeaCardPreviewImageFV1VA1c(str, C10G.A07(BRg.A00, 20.0f), 0, B18.A02, null, new B6A(C06G.A0G(bfm, akh)), bfm, (iA0d & 14) | 3120, 20);
            } else {
                bfm.AgE(507869712);
                AuraIconKt.m2567AuraIconFHprtrg(C10G.A07(BRg.A00, 20.0f), BOf.A00(bfm, R.drawable.aura_lightbulb_outline, 0), AuraIconSize.SMALL, null, C06G.A0G(bfm, akh), null, bfm, (AVy.$stable << 3) | 3462, 32);
            }
            AnonymousClass003.A0q(bbiA0M);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c118573 = new C118573(str, z, bRg2, i, i2);
            bBbAAc.A06 = c118573;
        }
    }

    public static final void IdeaRowText(String str, String str2, String str3, boolean z, boolean z2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(-316906277);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z2);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRgA0Q);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Q);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C1AC c1ac = C2VU.A04;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, c1ac);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C90m c90m = C90m.A00;
            C1822Arm c1822ArmA0W = C06G.A0W(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraTextKt.m2639AuraTextUY9GdpU(str, c90m.AiP(bs0, 1.0f, true), C06G.A0L(bfm, akh), c1822ArmA0W, null, null, null, false, 0, 5, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14832);
            if (z) {
                bfm.AgE(1709698971);
                AuraIconKt.m2567AuraIconFHprtrg(C10G.A07(C3U4.A0C(bs0, 8.0f, 0.0f, 0.0f, 0.0f), 20.0f), BOf.A00(bfm, R.drawable.circle_check_wght400_filled_24, 0), AuraIconSize.SMALL, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120251), AnonymousClass001.A0f(bfm, akh).success, null, bfm, (AVy.$stable << 3) | 390, 32);
                BBI.A0R(bbi, false);
            } else if (z2) {
                bfm.AgE(1710100049);
                AuraIconKt.m2567AuraIconFHprtrg(C3U4.A0C(bs0, 8.0f, 0.0f, 0.0f, 0.0f), BOf.A00(bfm, R.drawable.chevron_right_wght400_outline_24, 0), AuraIconSize.X_SMALL, null, AnonymousClass001.A0f(bfm, akh).tertiaryText, null, bfm, (AVy.$stable << 3) | 3462, 32);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-637561799);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            if (C7BY.A0j(str2)) {
                bfm.AgE(-1079904943);
                BBI.A0R(bbi, false);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, C3U4.A04(bs0, AuraDimensKt.SpacingMicro), C06G.A08(bfm), AnonymousClass006.A0k(bfm, -1080179014).subheadlineRegular, null, null, null, false, 0, 5, 2, null, null, null, bfm, ((iA0d >> 3) & 14) | 805306368, 6, 14832);
                BBI.A0R(bbi, false);
            }
            if (str3 != null) {
                AuraTextKt.m2639AuraTextUY9GdpU(str3, C3U4.A04(bs0, AuraDimensKt.SpacingMicro), C06G.A09(bfm), AnonymousClass006.A0k(bfm, -1079863682).subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d >> 6) & 14, 0, 16368);
            } else {
                bfm.AgE(-1079654959);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, str3, z, z2, bRgA0Q, i, i2);
        }
    }

    public static final void IdeasListTitle(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-578093443);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title2Medium;
            long jA0C = C06G.A0C(bfm);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchIdeasTabScreenKt$IdeasListTitle$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, ARD.A01(bRg2, (G0U) objAaT, false), jA0C, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118582(str, bRg2, i, i2);
        }
    }

    public static final Map<String, String> ideaCardMetadata(String str, Integer num) {
        C0924AIa c0924AIa = new C0924AIa();
        AnonymousClass001.A1C(HatchMetadataKey.IDEA_CARD_ID, str, c0924AIa);
        if (num != null) {
            c0924AIa.put(HatchMetadataKey.ABSOLUTE_POSITION.getValue(), String.valueOf(num.intValue()));
        }
        return AIW.A0K(c0924AIa);
    }

    public static /* synthetic */ Map ideaCardMetadata$default(String str, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return ideaCardMetadata(str, num);
    }

    public static final void ideaListSection(C0CD c0cd, IdeaCardSection ideaCardSection, boolean z, Map<String, ? extends IdeaCardExecutionState> map, MutableState<String> mutableState, G0V<? super IdeaCard, ? super Integer, Unit> g0v, G0V<? super IdeaCard, ? super Integer, Unit> g0v2, G0V<? super IdeaCard, ? super Integer, Unit> g0v3, G0W<? super IdeaCard, ? super Integer, ? super IdeaContextMenuAction, Unit> g0w, G0V<? super IdeaCard, ? super Boolean, Unit> g0v4, G0W<? super IdeaCard, ? super Integer, ? super IdeaFeedback, Unit> g0w2, G0U<? super IdeaCard, Unit> g0u, C1BO<String> c1bo, G0U<? super IdeaCard, Unit> g0u2) {
        int i = 0;
        for (Object obj : ideaCardSection.cards) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            IdeaCard ideaCard = (IdeaCard) obj;
            IdeaCard ideaCard2 = (IdeaCard) AbstractC0878AGe.A0A(i2, ideaCardSection.cards);
            c0cd.APJ(FGI.A0U(ideaCardSection.sectionId, ":", ideaCard.ideaCardId), "idea_row", AnonymousClass001.A0M(new HatchIdeasTabScreenKt$ideaListSection$1$1(ideaCard, map, i, ideaCardSection, z, mutableState, ideaCard2 != null ? ideaCard2.ideaCardId : null, g0v4, g0w2, g0v, g0v2, g0v3, g0w, c1bo, g0u2, g0u), -1357957046));
            i = i2;
        }
    }

    public static final BRg ideaRowDividerFullWidth(BRg bRg) {
        return C3UC.A00(bRg, C118601.INSTANCE);
    }

    public static final BRg ideaRowImpression(BRg bRg, IdeaCard ideaCard, int i, Map<String, String> map, Function0<Unit> function0) {
        return HatchImpressionModifierKt.hatchImpression(bRg, HatchOrigin.IDEAS, HatchSurface.IDEAS, null, HatchScreen.IDEAS_HOME, HatchComponent.IDEA_CARD, null, map, Integer.valueOf(i), 500L, 0.9f, null, null, function0);
    }

    public static final boolean isEitherOf(String str, String str2, String str3) {
        if (str != null) {
            return str.equals(str2) || str.equals(str3);
        }
        return false;
    }

    public static final void logIdeaCardClick(String str, int i) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.IDEAS, null, HatchScreen.IDEAS_HOME, HatchComponent.IDEA_CARD, null, ideaCardMetadata(str, Integer.valueOf(i)), null);
    }

    public static final void logIdeaCardExecute(String str, int i) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.IDEAS, null, HatchScreen.IDEAS_HOME, HatchComponent.IDEA_CARD_EXECUTE, null, ideaCardMetadata(str, Integer.valueOf(i)), null);
    }

    public static final void logIdeaCardLongPress(String str, int i) {
        HatchInteractionLogger.INSTANCE.logLongPress(HatchSurface.IDEAS, null, HatchScreen.IDEAS_HOME, HatchComponent.IDEA_CARD, null, ideaCardMetadata(str, Integer.valueOf(i)));
    }

    public static final void logIdeaCardSwipe(String str, int i) {
        HatchInteractionLogger.INSTANCE.logSwipe(HatchSurface.IDEAS, HatchSubsurface.SWIPE_ACTIONS, HatchScreen.IDEAS_HOME, HatchComponent.IDEA_CARD, ideaCardMetadata(str, Integer.valueOf(i)));
    }

    public static final void logIdeaContextMenuDismiss(String str, int i) {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.IDEAS, HatchSubsurface.DOT_MENU, HatchScreen.IDEAS_HOME, HatchComponent.THREE_DOTS_MENU, null, ideaCardMetadata(str, Integer.valueOf(i)));
    }

    public static final void logIdeaDismissedGiveFeedbackClick(String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.IDEAS, null, HatchScreen.IDEAS_HOME, HatchComponent.THUMBS_DOWN, null, AnonymousClass007.A0c(HatchMetadataKey.IDEA_CARD_ID, str), null);
    }

    public static final void logIdeaFeedback(String str, int i, IdeaFeedback ideaFeedback, HatchSubsurface hatchSubsurface) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.IDEAS, hatchSubsurface, HatchScreen.IDEAS_HOME, ideaFeedback == IdeaFeedback.UP ? HatchComponent.THUMBS_UP : HatchComponent.THUMBS_DOWN, null, ideaCardMetadata(str, Integer.valueOf(i)), null);
    }

    public static /* synthetic */ void logIdeaFeedback$default(String str, int i, IdeaFeedback ideaFeedback, HatchSubsurface hatchSubsurface, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            hatchSubsurface = HatchSubsurface.DOT_MENU;
        }
        logIdeaFeedback(str, i, ideaFeedback, hatchSubsurface);
    }

    public static final void logIdeaFeedbackReasonMenuDismiss(String str) {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.IDEAS, null, HatchScreen.FEEDBACK_FORM, HatchComponent.CANCEL_BUTTON, null, ideaCardMetadata(str, null));
    }

    public static final void logIdeaRowShareClick(Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.IDEAS, null, HatchScreen.IDEAS_HOME, HatchComponent.SHARE_BUTTON, null, map, null);
    }

    public static final void IdeasSectionDivider(boolean z, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-492367736);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            C1BO c1boA01 = C31t.A01(null, bfm, AnonymousClass003.A02(z ? 1 : 0), 3072, 22);
            AuraDividerStyle.Secondary secondary2 = AuraDividerStyle.Secondary.INSTANCE;
            BRg bRgA0B = C3U4.A0B(bRg, 0.0f, 16.0f);
            boolean zA65 = bfm.A65(c1boA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchIdeasTabScreenKt$IdeasSectionDivider$1$1(c1boA01);
                bfm.Ai0(objAaT);
            }
            AuraDividerKt.AuraDivider(AnonymousClass001.A0W(bRgA0B, objAaT), secondary2, false, bfm, 48, 4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118592(z, bRg, i, i2);
        }
    }

    public static final /* synthetic */ HatchExploreViewModel.IdeasUiState access$HatchIdeasTabScreen$lambda$0(C1BO c1bo) {
        return (HatchExploreViewModel.IdeasUiState) c1bo.getValue();
    }

    public static final Function0<Unit> rememberIdeasTabTtrc(BFM bfm, int i) {
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        boolean zA65 = bfm.A65(abstractC3358CGzA0h);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = HatchNavTTRCCoordinator.Companion.getInstance(abstractC3358CGzA0h);
            bfm.Ai0(objAaT);
        }
        HatchNavTTRCCoordinator hatchNavTTRCCoordinator = (HatchNavTTRCCoordinator) objAaT;
        boolean zA67 = bfm.A67(hatchNavTTRCCoordinator);
        Object objAaT2 = bfm.AaT();
        if (zA67 || objAaT2 == C78N.A00) {
            objAaT2 = new HatchIdeasTabScreenKt$rememberIdeasTabTtrc$1$1(hatchNavTTRCCoordinator);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A17(bfm, objAaT2, abstractC3358CGzA0h);
        boolean zA652 = bfm.A65(hatchNavTTRCCoordinator);
        Object objAaT3 = bfm.AaT();
        if (zA652 || objAaT3 == C78N.A00) {
            objAaT3 = new HatchIdeasTabScreenKt$rememberIdeasTabTtrc$2$1(hatchNavTTRCCoordinator);
            bfm.Ai0(objAaT3);
        }
        return (Function0) objAaT3;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0155  */
    /* renamed from: IdeaListRow-KqXp_Ps, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m771IdeaListRowKqXp_Ps(java.lang.String r50, java.lang.String r51, java.lang.String r52, boolean r53, boolean r54, float r55, java.lang.String r56, boolean r57, boolean r58, X.G0U<? super java.lang.Boolean, kotlin.Unit> r59, X.G0U<? super com.facebook.aura.explore.repo.IdeaFeedback, kotlin.Unit> r60, kotlin.jvm.functions.Function0<kotlin.Unit> r61, kotlin.jvm.functions.Function0<kotlin.Unit> r62, kotlin.jvm.functions.Function0<kotlin.Unit> r63, X.G0U<? super com.facebook.aura.explore.view.IdeaContextMenuAction, kotlin.Unit> r64, kotlin.jvm.functions.Function0<kotlin.Unit> r65, boolean r66, com.facebook.aura.share.api.ShareableItem r67, X.AHD<java.lang.String> r68, boolean r69, kotlin.jvm.functions.Function0<kotlin.Unit> r70, X.BRg r71, X.BFM r72, int r73, int r74, int r75, int r76) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.explore.view.HatchIdeasTabScreenKt.m771IdeaListRowKqXp_Ps(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, float, java.lang.String, boolean, boolean, X.G0U, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, kotlin.jvm.functions.Function0, boolean, com.facebook.aura.share.api.ShareableItem, X.AHD, boolean, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int, int, int):void");
    }
}
