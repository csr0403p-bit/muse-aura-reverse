package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.model.HatchAttachmentFile;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAttachmentPresentationCardKt$VideoAttachmentFannedStack$frontCard$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ InlineContentCallbacks $callbacks;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ AHD<HatchAttachmentFile> $videos;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAttachmentPresentationCardKt$VideoAttachmentFannedStack$frontCard$1(AHD<HatchAttachmentFile> ahd, String str, BRg bRg, InlineContentCallbacks inlineContentCallbacks, int i, int i2) {
        super(2);
        this.$videos = ahd;
        this.$messageId = str;
        this.$modifier = bRg;
        this.$callbacks = inlineContentCallbacks;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchAttachmentPresentationCardKt.VideoAttachmentFannedStack(this.$videos, this.$messageId, this.$modifier, this.$callbacks, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
