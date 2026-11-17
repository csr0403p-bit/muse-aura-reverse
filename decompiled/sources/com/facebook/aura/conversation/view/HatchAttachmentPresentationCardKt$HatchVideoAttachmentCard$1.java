package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.model.HatchAttachmentFile;
import com.facebook.aura.model.VideoPresentationData;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAttachmentPresentationCardKt$HatchVideoAttachmentCard$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ InlineContentCallbacks $callbacks;
    public final /* synthetic */ VideoPresentationData $data;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ BRg $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAttachmentPresentationCardKt$HatchVideoAttachmentCard$1(VideoPresentationData videoPresentationData, String str, BRg bRg, InlineContentCallbacks inlineContentCallbacks) {
        super(2);
        this.$data = videoPresentationData;
        this.$messageId = str;
        this.$modifier = bRg;
        this.$callbacks = inlineContentCallbacks;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            HatchAttachmentPresentationCardKt.VideoAttachmentThumbnail(this.$data.videos.get(0), this.$messageId, this.$modifier, this.$callbacks, 0.0f, false, false, bfm, HatchAttachmentFile.$stable | (InlineContentCallbacks.$stable << 9), HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        } else {
            bfm.Afo();
        }
    }
}
