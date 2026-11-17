package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1805ArO;
import X.G0U;
import X.G0V;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.feed.repo.FeedUnit;
import com.facebook.aura.feed.repo.FeedUnitViewportContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedTabContent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$changed2;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $editorRevealed;
    public final /* synthetic */ SnapshotStateList<FeedUnit> $feedItems;
    public final /* synthetic */ SnapshotStateList<FeedUnit> $infiniteItems;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0V<FeedUnit, Integer, Unit> $onComment;
    public final /* synthetic */ G0V<FeedUnit, Integer, Unit> $onDelete;
    public final /* synthetic */ G0V<FeedUnit, Integer, Unit> $onDislike;
    public final /* synthetic */ Function0<Unit> $onDismissEditor;
    public final /* synthetic */ Function0<Unit> $onInstructionsEditClick;
    public final /* synthetic */ Function0<Unit> $onInstructionsGotItClick;
    public final /* synthetic */ G0V<FeedUnit, Integer, Unit> $onLike;
    public final /* synthetic */ Function0<Unit> $onLoadNext;
    public final /* synthetic */ Function0<Unit> $onLoadPrevious;
    public final /* synthetic */ G0U<C1805ArO, Unit> $onPromptTextChange;
    public final /* synthetic */ Function0<Unit> $onRefresh;
    public final /* synthetic */ Function0<Unit> $onRetry;
    public final /* synthetic */ Function0<Unit> $onSavePrompt;
    public final /* synthetic */ G0V<FeedUnitViewportContext, Boolean, Unit> $onUnitVisibilityChanged;
    public final /* synthetic */ String $promptDisplayText;
    public final /* synthetic */ boolean $promptSaveEnabled;
    public final /* synthetic */ C1805ArO $promptText;
    public final /* synthetic */ boolean $showInstructionsCard;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ FeedViewModel.FeedUiState $uiState;

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedTabScreenKt$FeedTabContent$2(FeedViewModel.FeedUiState feedUiState, SnapshotStateList<FeedUnit> snapshotStateList, SnapshotStateList<FeedUnit> snapshotStateList2, float f, boolean z, boolean z2, String str, Function0<Unit> function0, Function0<Unit> function02, C1805ArO c1805ArO, G0U<? super C1805ArO, Unit> g0u, boolean z3, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, Function0<Unit> function08, G0V<? super FeedUnit, ? super Integer, Unit> g0v, G0V<? super FeedUnit, ? super Integer, Unit> g0v2, G0V<? super FeedUnit, ? super Integer, Unit> g0v3, G0V<? super FeedUnit, ? super Integer, Unit> g0v4, G0V<? super FeedUnitViewportContext, ? super Boolean, Unit> g0v5, LazyListState lazyListState, BRg bRg, int i, int i2, int i3, int i4) {
        super(2);
        this.$uiState = feedUiState;
        this.$feedItems = snapshotStateList;
        this.$infiniteItems = snapshotStateList2;
        this.$topPadding = f;
        this.$editorRevealed = z;
        this.$showInstructionsCard = z2;
        this.$promptDisplayText = str;
        this.$onInstructionsEditClick = function0;
        this.$onInstructionsGotItClick = function02;
        this.$promptText = c1805ArO;
        this.$onPromptTextChange = g0u;
        this.$promptSaveEnabled = z3;
        this.$onSavePrompt = function03;
        this.$onDismissEditor = function04;
        this.$onRefresh = function05;
        this.$onRetry = function06;
        this.$onLoadNext = function07;
        this.$onLoadPrevious = function08;
        this.$onLike = g0v;
        this.$onDislike = g0v2;
        this.$onComment = g0v3;
        this.$onDelete = g0v4;
        this.$onUnitVisibilityChanged = g0v5;
        this.$listState = lazyListState;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$changed2 = i3;
        this.$$default = i4;
    }

    public final void invoke(BFM bfm, int i) {
        FeedTabScreenKt.m830FeedTabContent2bowSr8(this.$uiState, this.$feedItems, this.$infiniteItems, this.$topPadding, this.$editorRevealed, this.$showInstructionsCard, this.$promptDisplayText, this.$onInstructionsEditClick, this.$onInstructionsGotItClick, this.$promptText, this.$onPromptTextChange, this.$promptSaveEnabled, this.$onSavePrompt, this.$onDismissEditor, this.$onRefresh, this.$onRetry, this.$onLoadNext, this.$onLoadPrevious, this.$onLike, this.$onDislike, this.$onComment, this.$onDelete, this.$onUnitVisibilityChanged, this.$listState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
    }
}
