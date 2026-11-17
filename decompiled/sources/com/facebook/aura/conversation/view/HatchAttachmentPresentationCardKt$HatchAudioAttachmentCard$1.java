package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.G0V;
import com.facebook.aura.model.AudioPresentationData;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAttachmentPresentationCardKt$HatchAudioAttachmentCard$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1D3 $containerShape;
    public final /* synthetic */ AudioPresentationData $data;
    public final /* synthetic */ long $headerColor;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ BRg $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAttachmentPresentationCardKt$HatchAudioAttachmentCard$1(AudioPresentationData audioPresentationData, String str, C1D3 c1d3, long j, BRg bRg, int i, int i2) {
        super(2);
        this.$data = audioPresentationData;
        this.$messageId = str;
        this.$containerShape = c1d3;
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
        HatchAttachmentPresentationCardKt.m530HatchAudioAttachmentCarduDo3WH8(this.$data, this.$messageId, this.$containerShape, this.$headerColor, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
