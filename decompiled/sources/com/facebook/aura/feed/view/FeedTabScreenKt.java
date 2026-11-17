package com.facebook.aura.feed.view;

import X.AGH;
import X.AIW;
import X.AKH;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPc;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C0924AIa;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1805ArO;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1YD;
import X.C1b8;
import X.C1er;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C7bA;
import X.EnumC10573Huf;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.content.Context;
import android.icu.text.DateFormat;
import android.view.View;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.conversation.common.HatchPendingMessage;
import com.facebook.aura.conversation.viewmodel.HatchPendingDiscussionItem;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.feed.model.HatchPendingFeedUnit;
import com.facebook.aura.feed.repo.FeedCarouselUnit;
import com.facebook.aura.feed.repo.FeedHeroImageUnit;
import com.facebook.aura.feed.repo.FeedIdeaAction;
import com.facebook.aura.feed.repo.FeedTextUnit;
import com.facebook.aura.feed.repo.FeedUnit;
import com.facebook.aura.feed.repo.FeedUnitViewportContext;
import com.facebook.aura.feed.repo.FeedWidgetUnit;
import com.facebook.aura.feedback.FeedbackEntityType;
import com.facebook.aura.feedback.FeedbackTarget;
import com.facebook.aura.model.DiscussionItemType;
import com.facebook.aura.model.HatchMessageKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchHighlightGlowKt;
import com.facebook.aura.utils.HatchStringUtils;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Date;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class FeedTabScreenKt {
    public static final String FEEDBACK_SURFACE_FEED = "feed";
    public static final String FEED_INSTRUCTIONS_CARD_ID = "feed_instructions_card";
    public static final int FEED_PREPEND_TRIGGER_INDEX = 2;
    public static final float FEED_SEEN_VISIBLE_FRACTION = 0.75f;
    public static final String FeedCarouselContentType = "feed_carousel";
    public static final float FeedDividerHeight = 1.0f;
    public static final float FeedEditTopSpacing = 50.0f;
    public static final String FeedHeroImageContentType = "feed_hero_image";
    public static final float FeedRevealCornerRadius = 30.0f;
    public static final float FeedRevealSpacing = 20.0f;
    public static final String FeedTextContentType = "feed_text";
    public static final String FeedWidgetContentType = "feed_widget";
    public static final long OPENING_UNIT_OVERLAY_DELAY_MS = 200;
    public static final C1D3 FeedCardShape = C1D8.A00(20.0f);
    public static final float FeedGlowTopLift = AuraDimensKt.SpacingSmall;

    /* renamed from: com.facebook.aura.feed.view.FeedTabScreenKt$FeedFeedbackPromptEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0U<String, Unit> $onPrompt;
        public final /* synthetic */ FeedViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(FeedViewModel feedViewModel, G0U<? super String, Unit> g0u, int i) {
            super(2);
            this.$viewModel = feedViewModel;
            this.$onPrompt = g0u;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedTabScreenKt.FeedFeedbackPromptEffect(this.$viewModel, this.$onPrompt, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedTabScreenKt$FeedNavigationEffects$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $anchoredUnitId;
        public final /* synthetic */ SnapshotStateList<FeedUnit> $feedItems;
        public final /* synthetic */ int $headerItemCount;
        public final /* synthetic */ SnapshotStateList<FeedUnit> $infiniteItems;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ String $scrollToUnitId;
        public final /* synthetic */ int $scrollToUnitToken;
        public final /* synthetic */ FeedViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(FeedViewModel feedViewModel, String str, String str2, int i, SnapshotStateList<FeedUnit> snapshotStateList, SnapshotStateList<FeedUnit> snapshotStateList2, LazyListState lazyListState, int i2, int i3) {
            super(2);
            this.$viewModel = feedViewModel;
            this.$anchoredUnitId = str;
            this.$scrollToUnitId = str2;
            this.$scrollToUnitToken = i;
            this.$feedItems = snapshotStateList;
            this.$infiniteItems = snapshotStateList2;
            this.$listState = lazyListState;
            this.$headerItemCount = i2;
            this.$$changed = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedTabScreenKt.FeedNavigationEffects(this.$viewModel, this.$anchoredUnitId, this.$scrollToUnitId, this.$scrollToUnitToken, this.$feedItems, this.$infiniteItems, this.$listState, this.$headerItemCount, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedTabScreenKt$FeedOpeningUnitOverlay$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(BRg bRg, int i, int i2) {
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
            FeedTabScreenKt.FeedOpeningUnitOverlay(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedTabScreenKt$FeedPost$2, reason: invalid class name and case insensitive filesystem */
    public final class C118892 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ Function0<Float> $glowAlpha;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<FeedUnit, Integer, Unit> $onComment;
        public final /* synthetic */ G0V<FeedUnit, Integer, Unit> $onDelete;
        public final /* synthetic */ G0V<FeedUnit, Integer, Unit> $onDislike;
        public final /* synthetic */ G0V<FeedUnit, Integer, Unit> $onLike;
        public final /* synthetic */ FeedUnit $unit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C118892(FeedUnit feedUnit, int i, Function0<Float> function0, G0V<? super FeedUnit, ? super Integer, Unit> g0v, G0V<? super FeedUnit, ? super Integer, Unit> g0v2, G0V<? super FeedUnit, ? super Integer, Unit> g0v3, G0V<? super FeedUnit, ? super Integer, Unit> g0v4, BRg bRg, int i2, int i3) {
            super(2);
            this.$unit = feedUnit;
            this.$absolutePosition = i;
            this.$glowAlpha = function0;
            this.$onLike = g0v;
            this.$onDislike = g0v2;
            this.$onComment = g0v3;
            this.$onDelete = g0v4;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedTabScreenKt.FeedPost(this.$unit, this.$absolutePosition, this.$glowAlpha, this.$onLike, this.$onDislike, this.$onComment, this.$onDelete, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedTabScreenKt$FeedTabScreen$10, reason: invalid class name */
    public final class AnonymousClass10 extends AbstractC7559F3s implements G0W<C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ String $discussErrorMessage;
        public final /* synthetic */ String $discussPostEyebrow;
        public final /* synthetic */ Function0<Unit> $dismissEditor;
        public final /* synthetic */ MutableState<Boolean> $editorRevealed$delegate;
        public final /* synthetic */ SnapshotStateList<FeedUnit> $feedItems;
        public final /* synthetic */ SnapshotStateList<FeedUnit> $infiniteItems;
        public final /* synthetic */ boolean $isEditorRevealed;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ Function0<Unit> $onInstructionsEditClick;
        public final /* synthetic */ Function0<Unit> $onInstructionsGotItClick;
        public final /* synthetic */ String $promptDisplayText;
        public final /* synthetic */ boolean $promptSaveEnabled;
        public final /* synthetic */ MutableState<C1805ArO> $promptText$delegate;
        public final /* synthetic */ boolean $showInstructionsCard;
        public final /* synthetic */ C1BO<FeedViewModel.FeedUiState> $uiState$delegate;
        public final /* synthetic */ FeedViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(SnapshotStateList<FeedUnit> snapshotStateList, SnapshotStateList<FeedUnit> snapshotStateList2, boolean z, boolean z2, String str, Function0<Unit> function0, Function0<Unit> function02, MutableState<C1805ArO> mutableState, boolean z3, FeedViewModel feedViewModel, MutableState<Boolean> mutableState2, Function0<Unit> function03, String str2, AuraNavigator auraNavigator, String str3, LazyListState lazyListState, C1BO<FeedViewModel.FeedUiState> c1bo) {
            super(3);
            this.$feedItems = snapshotStateList;
            this.$infiniteItems = snapshotStateList2;
            this.$isEditorRevealed = z;
            this.$showInstructionsCard = z2;
            this.$promptDisplayText = str;
            this.$onInstructionsEditClick = function0;
            this.$onInstructionsGotItClick = function02;
            this.$promptText$delegate = mutableState;
            this.$promptSaveEnabled = z3;
            this.$viewModel = feedViewModel;
            this.$editorRevealed$delegate = mutableState2;
            this.$dismissEditor = function03;
            this.$discussPostEyebrow = str2;
            this.$navigator = auraNavigator;
            this.$discussErrorMessage = str3;
            this.$listState = lazyListState;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, BFM bfm, Integer num) {
            m835invoke8Feqmps(c1dg.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-8Feqmps, reason: not valid java name */
        public final void m835invoke8Feqmps(float f, BFM bfm, int i) {
            int iA04 = i;
            if ((i & 6) == 0) {
                iA04 |= AnonymousClass004.A04(bfm, f);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1H(iA04), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            FeedViewModel.FeedUiState value = this.$uiState$delegate.getValue();
            SnapshotStateList<FeedUnit> snapshotStateList = this.$feedItems;
            SnapshotStateList<FeedUnit> snapshotStateList2 = this.$infiniteItems;
            boolean z = this.$isEditorRevealed;
            boolean z2 = this.$showInstructionsCard;
            String str = this.$promptDisplayText;
            Function0<Unit> function0 = this.$onInstructionsEditClick;
            Function0<Unit> function02 = this.$onInstructionsGotItClick;
            C1805ArO value2 = this.$promptText$delegate.getValue();
            boolean zA65 = bfm.A65(this.$promptText$delegate);
            MutableState<C1805ArO> mutableState = this.$promptText$delegate;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new FeedTabScreenKt$FeedTabScreen$10$1$1(mutableState);
                bfm.Ai0(objAaT);
            }
            G0U g0u = (G0U) objAaT;
            boolean z3 = this.$promptSaveEnabled;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$editorRevealed$delegate, bfm.A65(this.$promptText$delegate) | bfm.A67(this.$viewModel));
            FeedViewModel feedViewModel = this.$viewModel;
            MutableState<C1805ArO> mutableState2 = this.$promptText$delegate;
            MutableState<Boolean> mutableState3 = this.$editorRevealed$delegate;
            Object objAaT2 = bfm.AaT();
            if (zA1R || objAaT2 == C78N.A00) {
                objAaT2 = new FeedTabScreenKt$FeedTabScreen$10$2$1(feedViewModel, mutableState2, mutableState3);
                bfm.Ai0(objAaT2);
            }
            Function0 function03 = (Function0) objAaT2;
            Function0<Unit> function04 = this.$dismissEditor;
            boolean zA67 = bfm.A67(this.$viewModel);
            FeedViewModel feedViewModel2 = this.$viewModel;
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == C78N.A00) {
                objAaT3 = new FeedTabScreenKt$FeedTabScreen$10$3$1(feedViewModel2);
                bfm.Ai0(objAaT3);
            }
            Function0 function05 = (Function0) objAaT3;
            boolean zA672 = bfm.A67(this.$viewModel);
            FeedViewModel feedViewModel3 = this.$viewModel;
            Object objAaT4 = bfm.AaT();
            if (zA672 || objAaT4 == C78N.A00) {
                objAaT4 = new FeedTabScreenKt$FeedTabScreen$10$4$1(feedViewModel3);
                bfm.Ai0(objAaT4);
            }
            Function0 function06 = (Function0) objAaT4;
            FeedViewModel feedViewModel4 = this.$viewModel;
            boolean zA673 = bfm.A67(feedViewModel4);
            Object objAaT5 = bfm.AaT();
            if (zA673 || objAaT5 == C78N.A00) {
                objAaT5 = new FeedTabScreenKt$FeedTabScreen$10$5$1(feedViewModel4);
                bfm.Ai0(objAaT5);
            }
            Function0 function07 = (Function0) ((InterfaceC7353EnQ) objAaT5);
            FeedViewModel feedViewModel5 = this.$viewModel;
            boolean zA674 = bfm.A67(feedViewModel5);
            Object objAaT6 = bfm.AaT();
            if (zA674 || objAaT6 == C78N.A00) {
                objAaT6 = new FeedTabScreenKt$FeedTabScreen$10$6$1(feedViewModel5);
                bfm.Ai0(objAaT6);
            }
            Function0 function08 = (Function0) ((InterfaceC7353EnQ) objAaT6);
            boolean zA675 = bfm.A67(this.$viewModel);
            FeedViewModel feedViewModel6 = this.$viewModel;
            Object objAaT7 = bfm.AaT();
            if (zA675 || objAaT7 == C78N.A00) {
                objAaT7 = new FeedTabScreenKt$FeedTabScreen$10$7$1(feedViewModel6);
                bfm.Ai0(objAaT7);
            }
            G0V g0v = (G0V) objAaT7;
            boolean zA676 = bfm.A67(this.$viewModel);
            FeedViewModel feedViewModel7 = this.$viewModel;
            Object objAaT8 = bfm.AaT();
            if (zA676 || objAaT8 == C78N.A00) {
                objAaT8 = new FeedTabScreenKt$FeedTabScreen$10$8$1(feedViewModel7);
                bfm.Ai0(objAaT8);
            }
            G0V g0v2 = (G0V) objAaT8;
            boolean zA1R2 = AnonymousClass001.A1R(bfm, this.$discussErrorMessage, AnonymousClass001.A1T(bfm, this.$navigator, AnonymousClass001.A1R(bfm, this.$discussPostEyebrow, bfm.A67(this.$viewModel))));
            FeedViewModel feedViewModel8 = this.$viewModel;
            String str2 = this.$discussPostEyebrow;
            AuraNavigator auraNavigator = this.$navigator;
            String str3 = this.$discussErrorMessage;
            Object objAaT9 = bfm.AaT();
            if (zA1R2 || objAaT9 == C78N.A00) {
                objAaT9 = new FeedTabScreenKt$FeedTabScreen$10$9$1(feedViewModel8, str2, auraNavigator, str3);
                bfm.Ai0(objAaT9);
            }
            G0V g0v3 = (G0V) objAaT9;
            boolean zA677 = bfm.A67(this.$viewModel);
            FeedViewModel feedViewModel9 = this.$viewModel;
            Object objAaT10 = bfm.AaT();
            if (zA677 || objAaT10 == C78N.A00) {
                objAaT10 = new FeedTabScreenKt$FeedTabScreen$10$10$1(feedViewModel9);
                bfm.Ai0(objAaT10);
            }
            G0V g0v4 = (G0V) objAaT10;
            FeedViewModel feedViewModel10 = this.$viewModel;
            boolean zA678 = bfm.A67(feedViewModel10);
            Object objAaT11 = bfm.AaT();
            if (zA678 || objAaT11 == C78N.A00) {
                objAaT11 = new FeedTabScreenKt$FeedTabScreen$10$11$1(feedViewModel10);
                bfm.Ai0(objAaT11);
            }
            FeedTabScreenKt.m830FeedTabContent2bowSr8(value, snapshotStateList, snapshotStateList2, f, z, z2, str, function0, function02, value2, g0u, z3, function03, function04, function05, function06, function07, function08, g0v, g0v2, g0v3, g0v4, (G0V) ((InterfaceC7353EnQ) objAaT11), this.$listState, C10G.A01, bfm, FeedViewModel.FeedUiState.$stable | ((iA04 << 9) & 7168), 0, RuntimeInternals.IOPRIO_BACKGROUND, 0);
            Object objAaT12 = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState4 = (MutableState) AnonymousClass005.A0g(bfm, objAaT12, obj, false);
            Boolean boolValueOf = Boolean.valueOf(this.$uiState$delegate.getValue().isOpeningUnit);
            boolean zA652 = bfm.A65(this.$uiState$delegate);
            C1BO<FeedViewModel.FeedUiState> c1bo = this.$uiState$delegate;
            Object objAaT13 = bfm.AaT();
            if (zA652 || objAaT13 == obj) {
                objAaT13 = new FeedTabScreenKt$FeedTabScreen$10$12$1(c1bo, mutableState4, null);
                bfm.Ai0(objAaT13);
            }
            AnonymousClass001.A18(bfm, objAaT13, boolValueOf);
            if (MutableState.A0A(mutableState4)) {
                bfm.AgE(661893564);
                FeedTabScreenKt.FeedOpeningUnitOverlay(null, bfm, 0, 1);
            } else {
                bfm.AgE(661930082);
            }
            AnonymousClass001.A1D(bfm);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedTabScreenKt$FeedTabScreen$11, reason: invalid class name */
    public final class AnonymousClass11 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FeedViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(FeedViewModel feedViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = feedViewModel;
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
            FeedTabScreenKt.FeedTabScreen(this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.feed.view.FeedTabScreenKt$FeedUnitListItem$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $absolutePosition;
        public final /* synthetic */ Function0<Float> $glowAlpha;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<FeedUnit, Integer, Unit> $onComment;
        public final /* synthetic */ G0V<FeedUnit, Integer, Unit> $onDelete;
        public final /* synthetic */ G0V<FeedUnit, Integer, Unit> $onDislike;
        public final /* synthetic */ G0V<FeedUnit, Integer, Unit> $onLike;
        public final /* synthetic */ G0V<FeedUnitViewportContext, Boolean, Unit> $onUnitVisibilityChanged;
        public final /* synthetic */ Function0<Integer> $totalCount;
        public final /* synthetic */ FeedUnit $unit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(FeedUnit feedUnit, int i, Function0<Integer> function0, Function0<Float> function02, G0V<? super FeedUnit, ? super Integer, Unit> g0v, G0V<? super FeedUnit, ? super Integer, Unit> g0v2, G0V<? super FeedUnit, ? super Integer, Unit> g0v3, G0V<? super FeedUnit, ? super Integer, Unit> g0v4, G0V<? super FeedUnitViewportContext, ? super Boolean, Unit> g0v5, BRg bRg, int i2, int i3) {
            super(2);
            this.$unit = feedUnit;
            this.$absolutePosition = i;
            this.$totalCount = function0;
            this.$glowAlpha = function02;
            this.$onLike = g0v;
            this.$onDislike = g0v2;
            this.$onComment = g0v3;
            this.$onDelete = g0v4;
            this.$onUnitVisibilityChanged = g0v5;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FeedTabScreenKt.FeedUnitListItem(this.$unit, this.$absolutePosition, this.$totalCount, this.$glowAlpha, this.$onLike, this.$onDislike, this.$onComment, this.$onDelete, this.$onUnitVisibilityChanged, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void FeedOpeningUnitOverlay(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-870966759);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12027e);
            BRg bRgA01 = C1b8.A01(AnonymousClass001.A0T(bRg2), AnonymousClass002.A0c(bfm).scrim);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT, obj);
            C1YD c1yd = new C1YD(0);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = FeedTabScreenKt$FeedOpeningUnitOverlay$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            BRg bRgA012 = C0v5.A01(null, interfaceC1072AWd, bRgA01, c1yd, null, (Function0) objAaT2, true);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == obj) {
                objAaT3 = new FeedTabScreenKt$FeedOpeningUnitOverlay$3$1(strA01);
                bfm.Ai0(objAaT3);
            }
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A02(C2VU.A09, AnonymousClass001.A0X(bRgA012, objAaT3), false), null, 0L, bfm, 0, 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0115  */
    /* renamed from: FeedList-t-11g6c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m827FeedListt11g6c(com.facebook.aura.feed.model.FeedViewModel.FeedUiState r63, androidx.compose.runtime.snapshots.SnapshotStateList<com.facebook.aura.feed.repo.FeedUnit> r64, androidx.compose.runtime.snapshots.SnapshotStateList<com.facebook.aura.feed.repo.FeedUnit> r65, float r66, boolean r67, java.lang.String r68, kotlin.jvm.functions.Function0<kotlin.Unit> r69, kotlin.jvm.functions.Function0<kotlin.Unit> r70, kotlin.jvm.functions.Function0<kotlin.Unit> r71, kotlin.jvm.functions.Function0<kotlin.Unit> r72, X.G0V<? super com.facebook.aura.feed.repo.FeedUnit, ? super java.lang.Integer, kotlin.Unit> r73, X.G0V<? super com.facebook.aura.feed.repo.FeedUnit, ? super java.lang.Integer, kotlin.Unit> r74, X.G0V<? super com.facebook.aura.feed.repo.FeedUnit, ? super java.lang.Integer, kotlin.Unit> r75, X.G0V<? super com.facebook.aura.feed.repo.FeedUnit, ? super java.lang.Integer, kotlin.Unit> r76, X.G0V<? super com.facebook.aura.feed.repo.FeedUnitViewportContext, ? super java.lang.Boolean, kotlin.Unit> r77, androidx.compose.foundation.lazy.LazyListState r78, X.BRg r79, X.BFM r80, int r81, int r82, int r83) {
        /*
            Method dump skipped, instructions count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.view.FeedTabScreenKt.m827FeedListt11g6c(com.facebook.aura.feed.model.FeedViewModel$FeedUiState, androidx.compose.runtime.snapshots.SnapshotStateList, androidx.compose.runtime.snapshots.SnapshotStateList, float, boolean, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0V, X.G0V, X.G0V, X.G0V, X.G0V, androidx.compose.foundation.lazy.LazyListState, X.BRg, X.BFM, int, int, int):void");
    }

    /* renamed from: FeedLoadingState--orJrPs, reason: not valid java name */
    public static final void m829FeedLoadingStateorJrPs(float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1099683576);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA04 |= 48;
        } else if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 19, 18), bfm, iA04)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12027c);
            BRg bRgA04 = C3U4.A04(AnonymousClass001.A0T(bRg2), f);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new FeedTabScreenKt$FeedLoadingState$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new FeedTabScreenKt$FeedLoadingState$3(f, bRg2, i, i2);
        }
    }

    public static final void FeedPost(FeedUnit feedUnit, int i, Function0<Float> function0, G0V<? super FeedUnit, ? super Integer, Unit> g0v, G0V<? super FeedUnit, ? super Integer, Unit> g0v2, G0V<? super FeedUnit, ? super Integer, Unit> g0v3, G0V<? super FeedUnit, ? super Integer, Unit> g0v4, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRgA0P = bRg;
        bfm.AgG(330178458);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, feedUnit) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0v);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0v2);
        }
        if ((196608 & i2) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0v3);
        }
        if ((1572864 & i2) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, g0v4);
        }
        int i4 = i3 & 128;
        int iA0k = 12582912;
        if (i4 != 0) {
            iA0d |= iA0k;
        } else if ((i2 & 12582912) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRgA0P);
            iA0d |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1E(iA0d), bfm, iA0d)) {
            if (i4 != 0) {
                bRgA0P = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRgA0P.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A02, 0);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i5 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, i5);
            boolean zA1M = AnonymousClass004.A1M(iA0d);
            int i6 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1Q = AnonymousClass002.A1Q(i6, 32) | zA1M;
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = new FeedTabScreenKt$FeedPost$1$1$1(g0v, i);
                bfm.Ai0(objAaT);
            }
            G0U g0u = (G0U) objAaT;
            boolean zA1Q2 = AnonymousClass002.A1Q(i6, 32) | AnonymousClass005.A1L(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA1Q2 || objAaT2 == C78N.A00) {
                objAaT2 = new FeedTabScreenKt$FeedPost$1$2$1(g0v2, i);
                bfm.Ai0(objAaT2);
            }
            G0U g0u2 = (G0U) objAaT2;
            boolean zA1Q3 = AnonymousClass002.A1Q(i6, 32) | AnonymousClass007.A1H(iA0d);
            Object objAaT3 = bfm.AaT();
            if (zA1Q3 || objAaT3 == C78N.A00) {
                objAaT3 = new FeedTabScreenKt$FeedPost$1$3$1(g0v3, i);
                bfm.Ai0(objAaT3);
            }
            G0U g0u3 = (G0U) objAaT3;
            boolean zA1Q4 = AnonymousClass002.A1Q(i6, 32) | AnonymousClass005.A1B(iA0d);
            Object objAaT4 = bfm.AaT();
            if (zA1Q4 || objAaT4 == C78N.A00) {
                objAaT4 = new FeedTabScreenKt$FeedPost$1$4$1(g0v4, i);
                bfm.Ai0(objAaT4);
            }
            BS0 bs0 = BRg.A00;
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            FeedUnitRowKt.FeedUnitRow(feedUnit, i, g0u, g0u2, g0u3, (G0U) objAaT4, HatchHighlightGlowKt.m2317highlightGlowuQhol8o(bs0, function0, AnonymousClass001.A0f(bfm, akh).accent, 0.0f, FeedGlowTopLift, new B6A(C06G.A0K(bfm, akh)), bfm, ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 27654, 0), bfm, iA0d & 126, 0);
            C1b8.A04(bfm, C10G.A04(c1062ATq, FeedDividerHeight), C06G.A0E(bfm, akh));
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118892(feedUnit, i, function0, g0v, g0v2, g0v3, g0v4, bRgA0P, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FeedTabScreen(com.facebook.aura.feed.model.FeedViewModel r69, X.BRg r70, X.BFM r71, int r72, int r73) {
        /*
            Method dump skipped, instructions count: 1280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.view.FeedTabScreenKt.FeedTabScreen(com.facebook.aura.feed.model.FeedViewModel, X.BRg, X.BFM, int, int):void");
    }

    public static final void FeedUnitListItem(FeedUnit feedUnit, int i, Function0<Integer> function0, Function0<Float> function02, G0V<? super FeedUnit, ? super Integer, Unit> g0v, G0V<? super FeedUnit, ? super Integer, Unit> g0v2, G0V<? super FeedUnit, ? super Integer, Unit> g0v3, G0V<? super FeedUnit, ? super Integer, Unit> g0v4, G0V<? super FeedUnitViewportContext, ? super Boolean, Unit> g0v5, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRgA0P = bRg;
        bfm.AgG(1073087679);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, feedUnit) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function02);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0v);
        }
        if ((196608 & i2) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0v2);
        }
        if ((1572864 & i2) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, g0v3);
        }
        if ((12582912 & i2) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, g0v4);
        }
        if ((i2 & 100663296) == 0) {
            iA0d |= AnonymousClass004.A0b(bfm, g0v5);
        }
        int i4 = i3 & 512;
        int iA0m = 805306368;
        if (i4 != 0) {
            iA0d |= iA0m;
        } else if ((i2 & 805306368) == 0) {
            iA0m = AnonymousClass004.A0m(bfm, bRgA0P);
            iA0d |= iA0m;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 306783379, 306783378), bfm, iA0d)) {
            if (i4 != 0) {
                bRgA0P = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0P);
            boolean zA1F = AnonymousClass004.A1F(iA0d) | AnonymousClass004.A1I(iA0d) | AnonymousClass004.A1K(iA0d) | AnonymousClass007.A1G(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1F || objAaT == C78N.A00) {
                objAaT = new FeedTabScreenKt$FeedUnitListItem$1$1(feedUnit, i, function0, g0v5);
                bfm.Ai0(objAaT);
            }
            BRg bRgA00 = BPc.A00(bRgA0R, EnumC10573Huf.A06, (G0U) objAaT, 0.75f, 0L);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            if (i > 0) {
                bfm.AgE(-1029595783);
                C01N.A06(bfm, BRg.A00);
            } else {
                bfm.AgE(-1029545811);
            }
            BBI.A0R(bbi, false);
            int i5 = iA0d >> 3;
            FeedPost(feedUnit, i, function02, g0v, g0v2, g0v3, g0v4, null, bfm, AnonymousClass001.A05(i5, AnonymousClass004.A02(i5, AnonymousClass002.A08(i5, iA0d & 126))), 128);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(feedUnit, i, function0, function02, g0v, g0v2, g0v3, g0v4, g0v5, bRgA0P, i2, i3);
        }
    }

    public static final String feedContentType(FeedUnit feedUnit) {
        if (feedUnit instanceof FeedTextUnit) {
            return FeedTextContentType;
        }
        if (feedUnit instanceof FeedHeroImageUnit) {
            return FeedHeroImageContentType;
        }
        if (feedUnit instanceof FeedCarouselUnit) {
            return FeedCarouselContentType;
        }
        if (feedUnit instanceof FeedWidgetUnit) {
            return FeedWidgetContentType;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final FeedbackTarget feedUnitFeedbackTarget(String str) {
        return new FeedbackTarget(FeedbackEntityType.FEED_UNIT, str, "feed", AGH.A0E());
    }

    public static final void stageFeedDiscussion(FeedUnit feedUnit, String str) {
        HatchPendingDiscussionItem.INSTANCE.setPendingDiscussionItem(HatchMessageKt.createAttachmentHandleForDiscussionItem(feedUnit.getId(), DiscussionItemType.FeedCard), null);
        HatchPendingMessage.INSTANCE.setPendingContextChip(HatchStringUtils.INSTANCE.feedDiscussionPreview(feedUnit.getTitle(), feedUnit.getBodyMarkdown()), str, AGH.A0E());
        HatchComposerEntryPoint hatchComposerEntryPoint = HatchComposerEntryPoint.FEED_CARD;
        String id = feedUnit.getId();
        HatchPendingMessage.pendingEntryPoint = hatchComposerEntryPoint;
        HatchPendingMessage.pendingEntryPointOriginId = id;
    }

    public static final void FeedFeedbackPromptEffect(FeedViewModel feedViewModel, G0U<? super String, Unit> g0u, BFM bfm, int i) {
        bfm.AgG(-1320613657);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(feedViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0u);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            MutableState mutableStateA00 = C1er.A00(bfm, g0u);
            Unit unit = Unit.INSTANCE;
            if ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(feedViewModel))) {
                z = true;
            }
            boolean zA1W = AnonymousClass002.A1W(bfm, mutableStateA00, bfm.A67(contextA0H), z);
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = new FeedTabScreenKt$FeedFeedbackPromptEffect$1$1(feedViewModel, contextA0H, mutableStateA00, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, unit);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(feedViewModel, g0u, i);
        }
    }

    public static final void FeedNavigationEffects(FeedViewModel feedViewModel, String str, String str2, int i, SnapshotStateList<FeedUnit> snapshotStateList, SnapshotStateList<FeedUnit> snapshotStateList2, LazyListState lazyListState, int i2, BFM bfm, int i3) {
        bfm.AgG(1439531105);
        int iA05 = (i3 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(feedViewModel, bfm, i3) ? 1 : 0) | i3 : i3;
        if ((i3 & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i3 & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i3 & 3072) == 0) {
            iA05 |= AnonymousClass007.A06(bfm, i);
        }
        if ((i3 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, snapshotStateList);
        }
        if ((i3 & 196608) == 0) {
            iA05 |= AnonymousClass004.A0i(bfm, snapshotStateList2);
        }
        if ((i3 & 1572864) == 0) {
            iA05 |= AnonymousClass004.A0j(bfm, lazyListState);
        }
        if ((i3 & 12582912) == 0) {
            iA05 |= AnonymousClass004.A0J(bfm, i2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 4793491, 4793490), bfm, iA05)) {
            View viewA0J = AnonymousClass001.A0J(bfm);
            int i4 = 3670016 & iA05;
            boolean zA1T = AnonymousClass001.A1T(bfm, viewA0J, AnonymousClass002.A1Q(i4, 1048576));
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new FeedTabScreenKt$FeedNavigationEffects$1$1(lazyListState, viewA0J, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, lazyListState);
            C1BO c1boA02 = C2CK.A02(bfm, HatchPendingFeedUnit.events);
            MutableState mutableStateA00 = C1er.A00(bfm, c1boA02.getValue());
            Unit unit = Unit.INSTANCE;
            int i5 = iA05 & 14;
            boolean zA1S = AnonymousClass004.A1S(bfm, mutableStateA00, viewA0J, i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(feedViewModel)));
            Object objAaT2 = bfm.AaT();
            if (zA1S || objAaT2 == C78N.A00) {
                objAaT2 = new FeedTabScreenKt$FeedNavigationEffects$2$1(feedViewModel, mutableStateA00, viewA0J);
                bfm.Ai0(objAaT2);
            }
            C7bA.A05(bfm, null, unit, (G0U) objAaT2, 6, 2);
            Object value = c1boA02.getValue();
            boolean zA65 = bfm.A65(c1boA02) | (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(feedViewModel)));
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == C78N.A00) {
                objAaT3 = new FeedTabScreenKt$FeedNavigationEffects$3$1(c1boA02, feedViewModel);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A17(bfm, objAaT3, value);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12027d);
            boolean zA652 = bfm.A65(strA01) | (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(feedViewModel)));
            Object objAaT4 = bfm.AaT();
            if (zA652 || objAaT4 == C78N.A00) {
                objAaT4 = new FeedTabScreenKt$FeedNavigationEffects$4$1(feedViewModel, strA01, null);
                bfm.Ai0(objAaT4);
            }
            AnonymousClass001.A18(bfm, objAaT4, strA01);
            int i6 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA18 = AnonymousClass003.A18(i6);
            Object objAaT5 = bfm.AaT();
            if (zA18 || objAaT5 == C78N.A00) {
                objAaT5 = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT5;
            boolean zA1Q = AnonymousClass002.A1Q(i4, 1048576) | AnonymousClass003.A18(i6);
            Object objAaT6 = bfm.AaT();
            if (zA1Q || objAaT6 == C78N.A00) {
                objAaT6 = AnonymousClass002.A0K(bfm, null, new FeedTabScreenKt$FeedNavigationEffects$isAnchoredUnitVisible$2$1(str, lazyListState));
            }
            C1BO c1bo = (C1BO) objAaT6;
            Boolean boolValueOf = Boolean.valueOf(C1BO.A0F(c1bo));
            boolean zA1P = AnonymousClass003.A1P(bfm, c1bo, mutableState, AnonymousClass003.A18(i6)) | (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(feedViewModel)));
            Object objAaT7 = bfm.AaT();
            if (zA1P || objAaT7 == C78N.A00) {
                objAaT7 = new FeedTabScreenKt$FeedNavigationEffects$5$1(str, feedViewModel, c1bo, mutableState, null);
                bfm.Ai0(objAaT7);
            }
            AnonymousClass001.A1A(bfm, objAaT7, str, boolValueOf);
            Object[] objArr = new Object[0];
            Object objAaT8 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT8 == obj) {
                objAaT8 = FeedTabScreenKt$FeedNavigationEffects$handledScrollToUnitToken$2$1.INSTANCE;
                bfm.Ai0(objAaT8);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT8, objArr);
            Integer numValueOf = Integer.valueOf(i);
            boolean zA1R = AnonymousClass001.A1R(bfm, mutableStateA0N, AnonymousClass004.A1M(iA05)) | AnonymousClass005.A1L(iA05) | AnonymousClass004.A1K(iA05) | AnonymousClass007.A1H(iA05) | AnonymousClass002.A1Q(i4, 1048576) | ((29360128 & iA05) == 8388608);
            Object objAaT9 = bfm.AaT();
            if (zA1R || objAaT9 == obj) {
                objAaT9 = new FeedTabScreenKt$FeedNavigationEffects$6$1(i, snapshotStateList, snapshotStateList2, lazyListState, i2, mutableStateA0N, str2, null);
                bfm.Ai0(objAaT9);
            }
            AnonymousClass001.A18(bfm, objAaT9, numValueOf);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass7(feedViewModel, str, str2, i, snapshotStateList, snapshotStateList2, lazyListState, i2, i3);
        }
    }

    public static final /* synthetic */ HatchPendingFeedUnit.Event access$FeedNavigationEffects$lambda$1(C1BO c1bo) {
        return (HatchPendingFeedUnit.Event) c1bo.getValue();
    }

    public static final /* synthetic */ HatchPendingFeedUnit.Event access$FeedNavigationEffects$lambda$2(C1BO c1bo) {
        return (HatchPendingFeedUnit.Event) c1bo.getValue();
    }

    public static final /* synthetic */ FeedViewModel.FeedUiState access$FeedTabScreen$lambda$0(C1BO c1bo) {
        return (FeedViewModel.FeedUiState) c1bo.getValue();
    }

    public static final /* synthetic */ C1805ArO access$FeedTabScreen$lambda$5(MutableState mutableState) {
        return (C1805ArO) mutableState.getValue();
    }

    public static final FeedUnitViewportContext feedCardViewportContext(FeedUnit feedUnit, int i, int i2) {
        String id = feedUnit.getId();
        C0924AIa c0924AIa = new C0924AIa();
        c0924AIa.put("total_count", String.valueOf(i2));
        c0924AIa.put(HatchMetadataKey.FEED_CARD_ID.getValue(), feedUnit.getId());
        FeedIdeaAction ideaAction = feedUnit.getIdeaAction();
        if (ideaAction != null) {
            c0924AIa.put(HatchMetadataKey.IDEA_CARD_ID.getValue(), ideaAction.ideaId);
        }
        c0924AIa.putAll(FeedUnitRowKt.editionLogMetadata(feedUnit));
        return new FeedUnitViewportContext(id, i, AIW.A0K(c0924AIa));
    }

    public static final String formatNextEditionTime(long j) {
        String str = DateFormat.getInstanceForSkeleton("j", Locale.getDefault()).format(new Date(j));
        C7384Etj.A0U(str);
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0183  */
    /* renamed from: FeedListWithReveal-_-neDeU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m828FeedListWithReveal_neDeU(com.facebook.aura.feed.model.FeedViewModel.FeedUiState r81, androidx.compose.runtime.snapshots.SnapshotStateList<com.facebook.aura.feed.repo.FeedUnit> r82, androidx.compose.runtime.snapshots.SnapshotStateList<com.facebook.aura.feed.repo.FeedUnit> r83, float r84, boolean r85, boolean r86, java.lang.String r87, kotlin.jvm.functions.Function0<kotlin.Unit> r88, kotlin.jvm.functions.Function0<kotlin.Unit> r89, X.C1805ArO r90, X.G0U<? super X.C1805ArO, kotlin.Unit> r91, boolean r92, kotlin.jvm.functions.Function0<kotlin.Unit> r93, kotlin.jvm.functions.Function0<kotlin.Unit> r94, kotlin.jvm.functions.Function0<kotlin.Unit> r95, kotlin.jvm.functions.Function0<kotlin.Unit> r96, kotlin.jvm.functions.Function0<kotlin.Unit> r97, X.G0V<? super com.facebook.aura.feed.repo.FeedUnit, ? super java.lang.Integer, kotlin.Unit> r98, X.G0V<? super com.facebook.aura.feed.repo.FeedUnit, ? super java.lang.Integer, kotlin.Unit> r99, X.G0V<? super com.facebook.aura.feed.repo.FeedUnit, ? super java.lang.Integer, kotlin.Unit> r100, X.G0V<? super com.facebook.aura.feed.repo.FeedUnit, ? super java.lang.Integer, kotlin.Unit> r101, X.G0V<? super com.facebook.aura.feed.repo.FeedUnitViewportContext, ? super java.lang.Boolean, kotlin.Unit> r102, androidx.compose.foundation.lazy.LazyListState r103, X.BRg r104, X.BFM r105, int r106, int r107, int r108, int r109) {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.view.FeedTabScreenKt.m828FeedListWithReveal_neDeU(com.facebook.aura.feed.model.FeedViewModel$FeedUiState, androidx.compose.runtime.snapshots.SnapshotStateList, androidx.compose.runtime.snapshots.SnapshotStateList, float, boolean, boolean, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.ArO, X.G0U, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0V, X.G0V, X.G0V, X.G0V, X.G0V, androidx.compose.foundation.lazy.LazyListState, X.BRg, X.BFM, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0189  */
    /* renamed from: FeedTabContent-2bowSr8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m830FeedTabContent2bowSr8(com.facebook.aura.feed.model.FeedViewModel.FeedUiState r67, androidx.compose.runtime.snapshots.SnapshotStateList<com.facebook.aura.feed.repo.FeedUnit> r68, androidx.compose.runtime.snapshots.SnapshotStateList<com.facebook.aura.feed.repo.FeedUnit> r69, float r70, boolean r71, boolean r72, java.lang.String r73, kotlin.jvm.functions.Function0<kotlin.Unit> r74, kotlin.jvm.functions.Function0<kotlin.Unit> r75, X.C1805ArO r76, X.G0U<? super X.C1805ArO, kotlin.Unit> r77, boolean r78, kotlin.jvm.functions.Function0<kotlin.Unit> r79, kotlin.jvm.functions.Function0<kotlin.Unit> r80, kotlin.jvm.functions.Function0<kotlin.Unit> r81, kotlin.jvm.functions.Function0<kotlin.Unit> r82, kotlin.jvm.functions.Function0<kotlin.Unit> r83, kotlin.jvm.functions.Function0<kotlin.Unit> r84, X.G0V<? super com.facebook.aura.feed.repo.FeedUnit, ? super java.lang.Integer, kotlin.Unit> r85, X.G0V<? super com.facebook.aura.feed.repo.FeedUnit, ? super java.lang.Integer, kotlin.Unit> r86, X.G0V<? super com.facebook.aura.feed.repo.FeedUnit, ? super java.lang.Integer, kotlin.Unit> r87, X.G0V<? super com.facebook.aura.feed.repo.FeedUnit, ? super java.lang.Integer, kotlin.Unit> r88, X.G0V<? super com.facebook.aura.feed.repo.FeedUnitViewportContext, ? super java.lang.Boolean, kotlin.Unit> r89, androidx.compose.foundation.lazy.LazyListState r90, X.BRg r91, X.BFM r92, int r93, int r94, int r95, int r96) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.view.FeedTabScreenKt.m830FeedTabContent2bowSr8(com.facebook.aura.feed.model.FeedViewModel$FeedUiState, androidx.compose.runtime.snapshots.SnapshotStateList, androidx.compose.runtime.snapshots.SnapshotStateList, float, boolean, boolean, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.ArO, X.G0U, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0V, X.G0V, X.G0V, X.G0V, X.G0V, androidx.compose.foundation.lazy.LazyListState, X.BRg, X.BFM, int, int, int, int):void");
    }
}
