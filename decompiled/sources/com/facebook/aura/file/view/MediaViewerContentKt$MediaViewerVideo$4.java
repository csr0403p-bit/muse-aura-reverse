package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import X.G0W;
import android.net.Uri;
import com.facebook.aura.common.video.HatchVideoPlayer;
import com.facebook.aura.file.view.api.ContentItem;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerVideo$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $containerSize;
    public final /* synthetic */ G0W<HatchVideoPlayer, BFM, Integer, Unit> $controls;
    public final /* synthetic */ boolean $cropToBounds;
    public final /* synthetic */ boolean $isCurrentPage;
    public final /* synthetic */ boolean $isMuted;
    public final /* synthetic */ boolean $isPlaying;
    public final /* synthetic */ ContentItem $item;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Uri $videoUri;
    public final /* synthetic */ ZoomState $zoomState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaViewerContentKt$MediaViewerVideo$4(ContentItem contentItem, Uri uri, boolean z, boolean z2, boolean z3, boolean z4, ZoomState zoomState, long j, BRg bRg, G0W<? super HatchVideoPlayer, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
        super(2);
        this.$item = contentItem;
        this.$videoUri = uri;
        this.$isCurrentPage = z;
        this.$isPlaying = z2;
        this.$isMuted = z3;
        this.$cropToBounds = z4;
        this.$zoomState = zoomState;
        this.$containerSize = j;
        this.$modifier = bRg;
        this.$controls = g0w;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        MediaViewerContentKt.m905MediaViewerVideolXbYAwQ(this.$item, this.$videoUri, this.$isCurrentPage, this.$isPlaying, this.$isMuted, this.$cropToBounds, this.$zoomState, this.$containerSize, this.$modifier, this.$controls, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
