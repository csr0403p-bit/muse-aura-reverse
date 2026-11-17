package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DM;
import X.G0U;
import X.G0V;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.navigation.HatchDragDismissState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaPage$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $containerSize;
    public final /* synthetic */ HatchDragDismissState $dragDismissState;
    public final /* synthetic */ boolean $isCurrentPage;
    public final /* synthetic */ boolean $isFullscreen;
    public final /* synthetic */ boolean $isMuted;
    public final /* synthetic */ boolean $isPlaying;
    public final /* synthetic */ ContentItem $item;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ G0U<Boolean, Unit> $onMutedChanged;
    public final /* synthetic */ Function0<Unit> $onPauseClick;
    public final /* synthetic */ Function0<Unit> $onPlayClick;
    public final /* synthetic */ G0U<Boolean, Unit> $onShowVideoControlsChanged;
    public final /* synthetic */ C1DM $shape;
    public final /* synthetic */ boolean $showVideoControls;
    public final /* synthetic */ ZoomState $zoomState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaViewerContentKt$MediaPage$3(ContentItem contentItem, boolean z, boolean z2, boolean z3, boolean z4, G0U<? super Boolean, Unit> g0u, boolean z5, HatchDragDismissState hatchDragDismissState, G0U<? super Boolean, Unit> g0u2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, C1DM c1dm, ZoomState zoomState, long j, BRg bRg, int i, int i2, int i3) {
        super(2);
        this.$item = contentItem;
        this.$isCurrentPage = z;
        this.$isPlaying = z2;
        this.$isFullscreen = z3;
        this.$isMuted = z4;
        this.$onMutedChanged = g0u;
        this.$showVideoControls = z5;
        this.$dragDismissState = hatchDragDismissState;
        this.$onShowVideoControlsChanged = g0u2;
        this.$onClick = function0;
        this.$onPauseClick = function02;
        this.$onPlayClick = function03;
        this.$shape = c1dm;
        this.$zoomState = zoomState;
        this.$containerSize = j;
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
        MediaViewerContentKt.m903MediaPageLUJyAio(this.$item, this.$isCurrentPage, this.$isPlaying, this.$isFullscreen, this.$isMuted, this.$onMutedChanged, this.$showVideoControls, this.$dragDismissState, this.$onShowVideoControlsChanged, this.$onClick, this.$onPauseClick, this.$onPlayClick, this.$shape, this.$zoomState, this.$containerSize, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
