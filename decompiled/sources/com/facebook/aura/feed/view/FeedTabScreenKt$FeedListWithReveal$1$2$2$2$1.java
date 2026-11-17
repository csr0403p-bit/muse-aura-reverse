package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C10G;
import X.C7384Etj;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.feed.repo.FeedUnit;
import com.facebook.aura.feed.repo.FeedUnitViewportContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedListWithReveal$1$2$2$2$1 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
    public final /* synthetic */ boolean $editorRevealed;
    public final /* synthetic */ SnapshotStateList<FeedUnit> $feedItems;
    public final /* synthetic */ SnapshotStateList<FeedUnit> $infiniteItems;
    public final /* synthetic */ LazyListState $listState;
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
    public FeedTabScreenKt$FeedListWithReveal$1$2$2$2$1(FeedViewModel.FeedUiState feedUiState, SnapshotStateList<FeedUnit> snapshotStateList, SnapshotStateList<FeedUnit> snapshotStateList2, boolean z, float f, boolean z2, String str, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, G0V<? super FeedUnit, ? super Integer, Unit> g0v, G0V<? super FeedUnit, ? super Integer, Unit> g0v2, G0V<? super FeedUnit, ? super Integer, Unit> g0v3, G0V<? super FeedUnit, ? super Integer, Unit> g0v4, G0V<? super FeedUnitViewportContext, ? super Boolean, Unit> g0v5, LazyListState lazyListState) {
        super(3);
        this.$uiState = feedUiState;
        this.$feedItems = snapshotStateList;
        this.$infiniteItems = snapshotStateList2;
        this.$editorRevealed = z;
        this.$topPadding = f;
        this.$showInstructionsCard = z2;
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
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
        invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
        float f;
        C7384Etj.A0Y(interfaceC05151eP, 0);
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            FeedViewModel.FeedUiState feedUiState = this.$uiState;
            SnapshotStateList<FeedUnit> snapshotStateList = this.$feedItems;
            SnapshotStateList<FeedUnit> snapshotStateList2 = this.$infiniteItems;
            boolean z2 = this.$editorRevealed;
            if (z2) {
                f = FeedTabScreenKt.FeedRevealSpacing;
            } else {
                f = this.$topPadding;
            }
            if (this.$showInstructionsCard && !z2) {
                z = true;
            }
            FeedTabScreenKt.m827FeedListt11g6c(feedUiState, snapshotStateList, snapshotStateList2, f, z, this.$promptDisplayText, this.$onInstructionsEditClick, this.$onInstructionsGotItClick, this.$onLoadNext, this.$onLoadPrevious, this.$onLike, this.$onDislike, this.$onComment, this.$onDelete, this.$onUnitVisibilityChanged, this.$listState, C10G.A01, bfm, FeedViewModel.FeedUiState.$stable, 1572864, 0);
            return;
        }
        bfm.Afo();
    }
}
