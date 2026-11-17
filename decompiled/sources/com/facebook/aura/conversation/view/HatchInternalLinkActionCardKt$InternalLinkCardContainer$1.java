package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C07C;
import X.C1D3;
import X.G0V;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchInternalLinkActionCardKt$InternalLinkCardContainer$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C1D3 $containerShape;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
    public final /* synthetic */ BRg $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchInternalLinkActionCardKt$InternalLinkCardContainer$1(long j, C1D3 c1d3, BRg bRg, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
        super(2);
        this.$backgroundColor = j;
        this.$containerShape = c1d3;
        this.$modifier = bRg;
        this.$content = g0w;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchInternalLinkActionCardKt.m629InternalLinkCardContainereuL9pac(this.$backgroundColor, this.$containerShape, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
