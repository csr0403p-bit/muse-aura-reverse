package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.FGI;
import X.G0V;
import com.facebook.aura.conversation.view.richcontent.HatchInlineImageData;
import com.facebook.aura.conversation.view.richcontent.HatchInlineImageKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAttachmentPresentationCardKt$HatchImageAttachmentCard$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ InlineContentCallbacks $callbacks;
    public final /* synthetic */ AHD<HatchInlineImageData> $images;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ BRg $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAttachmentPresentationCardKt$HatchImageAttachmentCard$1(AHD<HatchInlineImageData> ahd, BRg bRg, InlineContentCallbacks inlineContentCallbacks, String str) {
        super(2);
        this.$images = ahd;
        this.$modifier = bRg;
        this.$callbacks = inlineContentCallbacks;
        this.$messageId = str;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AHD<HatchInlineImageData> ahd = this.$images;
            BRg bRg = this.$modifier;
            InlineContentCallbacks inlineContentCallbacks = this.$callbacks;
            HatchInlineImageKt.m677HatchInlineImageGridtw_glAc(ahd, bRg, 0.0f, 0.0f, inlineContentCallbacks.onImageGridClick, inlineContentCallbacks.onImageError, FGI.A0M("lobster_media_", this.$messageId), true, bfm, HatchInlineImageData.$stable | 12585984, 4);
            return;
        }
        bfm.Afo();
    }
}
