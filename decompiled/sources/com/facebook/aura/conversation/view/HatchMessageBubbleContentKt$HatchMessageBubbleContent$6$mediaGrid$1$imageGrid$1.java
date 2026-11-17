package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.FGI;
import X.G0W;
import com.facebook.aura.conversation.view.richcontent.HatchInlineImageData;
import com.facebook.aura.conversation.view.richcontent.HatchInlineImageKt;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchMessageBubbleContentKt$HatchMessageBubbleContent$6$mediaGrid$1$imageGrid$1 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
    public final /* synthetic */ InlineContentCallbacks $inlineContentCallbacks;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ AHD<HatchInlineImageData> $userMediaImages;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageBubbleContentKt$HatchMessageBubbleContent$6$mediaGrid$1$imageGrid$1(AHD<HatchInlineImageData> ahd, InlineContentCallbacks inlineContentCallbacks, HatchMessageUiModel hatchMessageUiModel) {
        super(3);
        this.$userMediaImages = ahd;
        this.$inlineContentCallbacks = inlineContentCallbacks;
        this.$message = hatchMessageUiModel;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
        invoke(bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BRg bRg, BFM bfm, int i) {
        int iA0d;
        C7384Etj.A0Y(bRg, 0);
        if ((i & 6) == 0) {
            iA0d = AnonymousClass004.A0d(bfm, bRg) | i;
        } else {
            iA0d = i;
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            AHD<HatchInlineImageData> ahd = this.$userMediaImages;
            float f = HatchMessageBubbleContentKt.UserMediaSingleImageSize;
            InlineContentCallbacks inlineContentCallbacks = this.$inlineContentCallbacks;
            HatchInlineImageKt.m677HatchInlineImageGridtw_glAc(ahd, bRg, f, 0.0f, inlineContentCallbacks.onImageGridClick, inlineContentCallbacks.onImageError, FGI.A0M("lobster_media_", this.$message.id), true, bfm, 12586368 | HatchInlineImageData.$stable | ((iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
            return;
        }
        bfm.Afo();
    }
}
