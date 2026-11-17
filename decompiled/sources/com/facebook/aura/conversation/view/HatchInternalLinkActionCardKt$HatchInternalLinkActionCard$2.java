package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.G0V;
import com.facebook.aura.model.InternalLinkActionCardPresentation;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchInternalLinkActionCardKt$HatchInternalLinkActionCard$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ InternalLinkActionCardPresentation $card;
    public final /* synthetic */ C1D3 $containerShape;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ String $sourceSessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInternalLinkActionCardKt$HatchInternalLinkActionCard$2(InternalLinkActionCardPresentation internalLinkActionCardPresentation, BRg bRg, long j, C1D3 c1d3, String str, int i, int i2) {
        super(2);
        this.$card = internalLinkActionCardPresentation;
        this.$modifier = bRg;
        this.$backgroundColor = j;
        this.$containerShape = c1d3;
        this.$sourceSessionId = str;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchInternalLinkActionCardKt.m627HatchInternalLinkActionCardT042LqI(this.$card, this.$modifier, this.$backgroundColor, this.$containerShape, this.$sourceSessionId, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
