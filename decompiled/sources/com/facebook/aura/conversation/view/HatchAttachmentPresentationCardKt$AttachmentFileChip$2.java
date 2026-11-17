package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DM;
import X.G0V;
import com.facebook.aura.model.HatchAttachmentFile;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAttachmentPresentationCardKt$AttachmentFileChip$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1DM $containerShape;
    public final /* synthetic */ HatchAttachmentFile $file;
    public final /* synthetic */ long $headerColor;
    public final /* synthetic */ boolean $isSlides;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0V<String, String, Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAttachmentPresentationCardKt$AttachmentFileChip$2(HatchAttachmentFile hatchAttachmentFile, boolean z, G0V<? super String, ? super String, Unit> g0v, C1DM c1dm, long j, BRg bRg, int i, int i2) {
        super(2);
        this.$file = hatchAttachmentFile;
        this.$isSlides = z;
        this.$onClick = g0v;
        this.$containerShape = c1dm;
        this.$headerColor = j;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchAttachmentPresentationCardKt.m529AttachmentFileChipFHprtrg(this.$file, this.$isSlides, this.$onClick, this.$containerShape, this.$headerColor, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
