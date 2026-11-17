package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.feed.repo.FeedUnit;
import com.facebook.aura.feed.repo.FeedUnitViewportContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedList$5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ SnapshotStateList<FeedUnit> $feedItems;
    public final /* synthetic */ SnapshotStateList<FeedUnit> $infiniteItems;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0V<FeedUnit, Integer, Unit> $onComment;
    public final /* synthetic */ G0V<FeedUnit, Integer, Unit> $onDelete;
    public final /* synthetic */ G0V<FeedUnit, Integer, Unit> $onDislike;
    public final /* synthetic */ Function0<Unit> $onInstructionsEditClick;
    public final /* synthetic */ Function0<Unit> $onInstructionsGotItClick;
    public final /* synthetic */ G0V<FeedUnit, Integer, Unit> $onLike;
    public final /* synthetic */ Function0<Unit> $onLoadNext;
    public final /* synthetic */ Function0<Unit> $onLoadPrevious;
    public final /* synthetic */ G0V<FeedUnitViewportContext, Boolean, Unit> $onUnitVisibilityChanged;
    public final /* synthetic */ String $promptDisplayText;
    public final /* synthetic */ boolean $showInstructionsCard;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ FeedViewModel.FeedUiState $uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedTabScreenKt$FeedList$5(FeedViewModel.FeedUiState feedUiState, SnapshotStateList<FeedUnit> snapshotStateList, SnapshotStateList<FeedUnit> snapshotStateList2, float f, boolean z, String str, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, G0V<? super FeedUnit, ? super Integer, Unit> g0v, G0V<? super FeedUnit, ? super Integer, Unit> g0v2, G0V<? super FeedUnit, ? super Integer, Unit> g0v3, G0V<? super FeedUnit, ? super Integer, Unit> g0v4, G0V<? super FeedUnitViewportContext, ? super Boolean, Unit> g0v5, LazyListState lazyListState, BRg bRg, int i, int i2, int i3) {
        super(2);
        this.$uiState = feedUiState;
        this.$feedItems = snapshotStateList;
        this.$infiniteItems = snapshotStateList2;
        this.$topPadding = f;
        this.$showInstructionsCard = z;
        this.$promptDisplayText = str;
        this.$onInstructionsEditClick = function0;
        this.$onInstructionsGotItClick = function02;
        this.$onLoadNext = function03;
        this.$onLoadPrevious = function04;
        this.$onLike = g0v;
        this.$onDislike = g0v2;
        this.$onComment = g0v3;
        this.$onDelete = g0v4;
        this.$onUnitVisibilityChanged = g0v5;
        this.$listState = lazyListState;
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
        FeedTabScreenKt.m827FeedListt11g6c(this.$uiState, this.$feedItems, this.$infiniteItems, this.$topPadding, this.$showInstructionsCard, this.$promptDisplayText, this.$onInstructionsEditClick, this.$onInstructionsGotItClick, this.$onLoadNext, this.$onLoadPrevious, this.$onLike, this.$onDislike, this.$onComment, this.$onDelete, this.$onUnitVisibilityChanged, this.$listState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
