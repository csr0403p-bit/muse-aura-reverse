package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.library.model.ArtifactFile;
import com.facebook.aura.library.model.HatchLibraryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$LibraryTabContent$5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ HatchLibraryViewModel.UiState $libraryUiState;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<ArtifactFile, Unit> $onArtifactClick;
    public final /* synthetic */ Function0<Unit> $onArtifactDeleted;
    public final /* synthetic */ Function0<Unit> $onLoadMoreArtifacts;
    public final /* synthetic */ Function0<Unit> $onLoadMoreMedia;
    public final /* synthetic */ Function0<Unit> $onRetry;
    public final /* synthetic */ G0U<ArtifactFile, Unit> $onTogglePin;
    public final /* synthetic */ Function0<Unit> $onViewFinished;
    public final /* synthetic */ int $selectedTab;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ LibraryViewMode $viewMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchLibraryTabScreenKt$LibraryTabContent$5(HatchLibraryViewModel.UiState uiState, int i, LibraryViewMode libraryViewMode, G0U<? super ArtifactFile, Unit> g0u, Function0<Unit> function0, G0U<? super ArtifactFile, Unit> g0u2, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, float f, LazyListState lazyListState, BRg bRg, Function0<Unit> function05, int i2, int i3, int i4) {
        super(2);
        this.$libraryUiState = uiState;
        this.$selectedTab = i;
        this.$viewMode = libraryViewMode;
        this.$onArtifactClick = g0u;
        this.$onArtifactDeleted = function0;
        this.$onTogglePin = g0u2;
        this.$onLoadMoreMedia = function02;
        this.$onLoadMoreArtifacts = function03;
        this.$onRetry = function04;
        this.$topPadding = f;
        this.$listState = lazyListState;
        this.$modifier = bRg;
        this.$onViewFinished = function05;
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
        HatchLibraryTabScreenKt.m1173LibraryTabContentULtc_mU(this.$libraryUiState, this.$selectedTab, this.$viewMode, this.$onArtifactClick, this.$onArtifactDeleted, this.$onTogglePin, this.$onLoadMoreMedia, this.$onLoadMoreArtifacts, this.$onRetry, this.$topPadding, this.$listState, this.$modifier, this.$onViewFinished, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
