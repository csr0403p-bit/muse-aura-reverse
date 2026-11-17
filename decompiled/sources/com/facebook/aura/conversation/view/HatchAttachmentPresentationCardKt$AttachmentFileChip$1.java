package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt;
import com.facebook.aura.model.HatchAttachmentFile;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAttachmentPresentationCardKt$AttachmentFileChip$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ HatchAttachmentFile $file;
    public final /* synthetic */ boolean $isSlides;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0V<String, String, Unit> $onClick;
    public final /* synthetic */ String $url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAttachmentPresentationCardKt$AttachmentFileChip$1(HatchAttachmentFile hatchAttachmentFile, String str, boolean z, G0V<? super String, ? super String, Unit> g0v, BRg bRg) {
        super(2);
        this.$file = hatchAttachmentFile;
        this.$url = str;
        this.$isSlides = z;
        this.$onClick = g0v;
        this.$modifier = bRg;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            HatchAttachmentFile hatchAttachmentFile = this.$file;
            HatchAuraMarkdownProvidersKt.FileChipWithPreview(hatchAttachmentFile.label, this.$url, hatchAttachmentFile.mime, this.$isSlides, this.$onClick, ComposableSingletons$HatchAttachmentPresentationCardKt.lambda$1546420932, this.$modifier, false, false, bfm, 113442816, 0);
            return;
        }
        bfm.Afo();
    }
}
