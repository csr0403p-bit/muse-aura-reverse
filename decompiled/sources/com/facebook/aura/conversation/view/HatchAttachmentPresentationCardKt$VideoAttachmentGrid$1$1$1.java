package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C1062ATq;
import X.C10G;
import X.G0V;
import com.facebook.aura.model.HatchAttachmentFile;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAttachmentPresentationCardKt$VideoAttachmentGrid$1$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ InlineContentCallbacks $callbacks;
    public final /* synthetic */ boolean $isOverflowTile;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ HatchAttachmentFile $video;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAttachmentPresentationCardKt$VideoAttachmentGrid$1$1$1(HatchAttachmentFile hatchAttachmentFile, String str, InlineContentCallbacks inlineContentCallbacks, boolean z) {
        super(2);
        this.$video = hatchAttachmentFile;
        this.$messageId = str;
        this.$callbacks = inlineContentCallbacks;
        this.$isOverflowTile = z;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            HatchAttachmentFile hatchAttachmentFile = this.$video;
            String str = this.$messageId;
            C1062ATq c1062ATq = C10G.A01;
            InlineContentCallbacks inlineContentCallbacks = this.$callbacks;
            boolean z = !this.$isOverflowTile;
            HatchAttachmentPresentationCardKt.VideoAttachmentThumbnail(hatchAttachmentFile, str, c1062ATq, inlineContentCallbacks, 0.0f, z, z, bfm, (InlineContentCallbacks.$stable << 9) | HatchAttachmentFile.$stable | 384, 16);
            return;
        }
        bfm.Afo();
    }
}
