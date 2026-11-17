package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.G0V;
import com.facebook.aura.model.TextWithButtonCta;
import com.facebook.aura.model.TextWithButtonPresentation;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchTextWithButtonCardKt$HatchComplimentarySubscriptionCard$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C1D3 $containerShape;
    public final /* synthetic */ TextWithButtonPresentation $data;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0V<Integer, TextWithButtonCta, Unit> $onButtonClick;
    public final /* synthetic */ String $presentationId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTextWithButtonCardKt$HatchComplimentarySubscriptionCard$4(TextWithButtonPresentation textWithButtonPresentation, String str, BRg bRg, long j, C1D3 c1d3, G0V<? super Integer, ? super TextWithButtonCta, Unit> g0v, int i, int i2) {
        super(2);
        this.$data = textWithButtonPresentation;
        this.$presentationId = str;
        this.$modifier = bRg;
        this.$backgroundColor = j;
        this.$containerShape = c1d3;
        this.$onButtonClick = g0v;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        HatchTextWithButtonCardKt.m665HatchComplimentarySubscriptionCardfWhpE4E(this.$data, this.$presentationId, this.$modifier, this.$backgroundColor, this.$containerShape, this.$onButtonClick, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
