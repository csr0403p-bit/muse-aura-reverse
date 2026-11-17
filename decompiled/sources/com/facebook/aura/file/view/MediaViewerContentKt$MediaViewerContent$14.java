package com.facebook.aura.file.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.navigation.AuraNavKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerContent$14 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$changed2;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $bottomAction;
    public final /* synthetic */ int $initialIndex;
    public final /* synthetic */ boolean $interactiveDismissEnabled;
    public final /* synthetic */ boolean $isFullscreen;
    public final /* synthetic */ boolean $isMuted;
    public final /* synthetic */ boolean $isPlaybackEnabled;
    public final /* synthetic */ boolean $isUserPaused;
    public final /* synthetic */ AHD<ContentItem> $items;
    public final /* synthetic */ boolean $lockFullscreen;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<ContentItem, Unit> $onCopyClick;
    public final /* synthetic */ G0U<ContentItem, Unit> $onDeleteClick;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ G0U<ContentItem, Unit> $onDownloadClick;
    public final /* synthetic */ G0U<Boolean, Unit> $onFullscreenChanged;
    public final /* synthetic */ G0U<Boolean, Unit> $onMutedChanged;
    public final /* synthetic */ G0U<Integer, Unit> $onPageChanged;
    public final /* synthetic */ G0U<ContentItem, Unit> $onReplyClick;
    public final /* synthetic */ G0U<ContentItem, Unit> $onShareClick;
    public final /* synthetic */ G0U<Boolean, Unit> $onUserPausedChanged;
    public final /* synthetic */ AuraNavKey $screenKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaViewerContentKt$MediaViewerContent$14(AuraNavKey auraNavKey, AHD<ContentItem> ahd, int i, long j, boolean z, boolean z2, G0U<? super Boolean, Unit> g0u, boolean z3, G0U<? super Boolean, Unit> g0u2, boolean z4, G0U<? super Boolean, Unit> g0u3, Function0<Unit> function0, G0U<? super ContentItem, Unit> g0u4, G0U<? super ContentItem, Unit> g0u5, G0U<? super ContentItem, Unit> g0u6, G0U<? super ContentItem, Unit> g0u7, G0U<? super ContentItem, Unit> g0u8, BRg bRg, G0U<? super Integer, Unit> g0u9, boolean z5, boolean z6, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, int i2, int i3, int i4, int i5) {
        super(2);
        this.$screenKey = auraNavKey;
        this.$items = ahd;
        this.$initialIndex = i;
        this.$backgroundColor = j;
        this.$isFullscreen = z;
        this.$interactiveDismissEnabled = z2;
        this.$onFullscreenChanged = g0u;
        this.$isUserPaused = z3;
        this.$onUserPausedChanged = g0u2;
        this.$isMuted = z4;
        this.$onMutedChanged = g0u3;
        this.$onDismiss = function0;
        this.$onDownloadClick = g0u4;
        this.$onReplyClick = g0u5;
        this.$onShareClick = g0u6;
        this.$onCopyClick = g0u7;
        this.$onDeleteClick = g0u8;
        this.$modifier = bRg;
        this.$onPageChanged = g0u9;
        this.$isPlaybackEnabled = z5;
        this.$lockFullscreen = z6;
        this.$bottomAction = g0w;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$changed2 = i4;
        this.$$default = i5;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        MediaViewerContentKt.m904MediaViewerContentWJFJby4(this.$screenKey, this.$items, this.$initialIndex, this.$backgroundColor, this.$isFullscreen, this.$interactiveDismissEnabled, this.$onFullscreenChanged, this.$isUserPaused, this.$onUserPausedChanged, this.$isMuted, this.$onMutedChanged, this.$onDismiss, this.$onDownloadClick, this.$onReplyClick, this.$onShareClick, this.$onCopyClick, this.$onDeleteClick, this.$modifier, this.$onPageChanged, this.$isPlaybackEnabled, this.$lockFullscreen, this.$bottomAction, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
    }
}
