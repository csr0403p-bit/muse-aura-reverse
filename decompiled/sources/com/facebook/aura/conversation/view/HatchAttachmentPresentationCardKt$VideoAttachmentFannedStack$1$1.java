package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C06G;
import X.C10G;
import X.C11U;
import X.C1b8;
import X.G0V;
import com.facebook.aura.model.HatchAttachmentFile;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAttachmentPresentationCardKt$VideoAttachmentFannedStack$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ InlineContentCallbacks $callbacks;
    public final /* synthetic */ HatchAttachmentFile $frontCard;
    public final /* synthetic */ String $messageId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAttachmentPresentationCardKt$VideoAttachmentFannedStack$1$1(HatchAttachmentFile hatchAttachmentFile, String str, InlineContentCallbacks inlineContentCallbacks) {
        super(2);
        this.$frontCard = hatchAttachmentFile;
        this.$messageId = str;
        this.$callbacks = inlineContentCallbacks;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            HatchAttachmentFile hatchAttachmentFile = this.$frontCard;
            String str = this.$messageId;
            BS0 bs0 = BRg.A00;
            float f = HatchAttachmentPresentationCardKt.FannedStackCardWidth;
            float f2 = HatchAttachmentPresentationCardKt.FannedStackCardHeight;
            HatchAttachmentPresentationCardKt.VideoAttachmentThumbnail(hatchAttachmentFile, str, C1b8.A01(C11U.A03(C10G.A0C(bs0, f, f2), C06G.A0R(bfm)), AnonymousClass002.A0c(bfm).border), this.$callbacks, f / f2, false, false, bfm, HatchAttachmentFile.$stable | RuntimeInternals.IOPRIO_BACKGROUND | (InlineContentCallbacks.$stable << 9), 96);
            return;
        }
        bfm.Afo();
    }
}
