package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DM;
import X.G0V;
import com.facebook.aura.model.HatchMediaLayout;
import com.facebook.aura.model.VideoPresentationData;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAttachmentPresentationCardKt$HatchVideoAttachmentCard$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ InlineContentCallbacks $callbacks;
    public final /* synthetic */ C1DM $containerShape;
    public final /* synthetic */ VideoPresentationData $data;
    public final /* synthetic */ long $headerColor;
    public final /* synthetic */ HatchMediaLayout $layout;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ BRg $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAttachmentPresentationCardKt$HatchVideoAttachmentCard$3(VideoPresentationData videoPresentationData, String str, C1DM c1dm, long j, BRg bRg, HatchMediaLayout hatchMediaLayout, InlineContentCallbacks inlineContentCallbacks, int i, int i2) {
        super(2);
        this.$data = videoPresentationData;
        this.$messageId = str;
        this.$containerShape = c1dm;
        this.$headerColor = j;
        this.$modifier = bRg;
        this.$layout = hatchMediaLayout;
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
        HatchAttachmentPresentationCardKt.m534HatchVideoAttachmentCardhYmLsZ8(this.$data, this.$messageId, this.$containerShape, this.$headerColor, this.$modifier, this.$layout, this.$callbacks, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
