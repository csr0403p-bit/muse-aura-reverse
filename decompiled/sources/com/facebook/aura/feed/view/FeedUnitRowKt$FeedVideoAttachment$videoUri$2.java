package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.feed.repo.FeedUnit;
import com.facebook.aura.feed.repo.FeedVideo;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FeedUnitRowKt$FeedVideoAttachment$videoUri$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ FeedUnit $unit;
    public final /* synthetic */ FeedVideo $video;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedUnitRowKt$FeedVideoAttachment$videoUri$2(FeedUnit feedUnit, FeedVideo feedVideo, int i, BRg bRg, int i2, int i3) {
        super(2);
        this.$unit = feedUnit;
        this.$video = feedVideo;
        this.$absolutePosition = i;
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
        FeedUnitRowKt.FeedVideoAttachment(this.$unit, this.$video, this.$absolutePosition, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
