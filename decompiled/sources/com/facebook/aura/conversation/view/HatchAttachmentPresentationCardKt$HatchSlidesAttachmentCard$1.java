package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DM;
import X.G0V;
import com.facebook.aura.model.SlidesPresentationData;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAttachmentPresentationCardKt$HatchSlidesAttachmentCard$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ InlineContentCallbacks $callbacks;
    public final /* synthetic */ C1DM $containerShape;
    public final /* synthetic */ SlidesPresentationData $data;
    public final /* synthetic */ long $headerColor;
    public final /* synthetic */ BRg $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAttachmentPresentationCardKt$HatchSlidesAttachmentCard$1(SlidesPresentationData slidesPresentationData, C1DM c1dm, long j, BRg bRg, InlineContentCallbacks inlineContentCallbacks, int i, int i2) {
        super(2);
        this.$data = slidesPresentationData;
        this.$containerShape = c1dm;
        this.$headerColor = j;
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
        HatchAttachmentPresentationCardKt.m533HatchSlidesAttachmentCardT042LqI(this.$data, this.$containerShape, this.$headerColor, this.$modifier, this.$callbacks, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
