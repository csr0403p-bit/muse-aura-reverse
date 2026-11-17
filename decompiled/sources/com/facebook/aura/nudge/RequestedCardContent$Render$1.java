package com.facebook.aura.nudge;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class RequestedCardContent$Render$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C1D3 $containerShape;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ RequestedCardContent $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestedCardContent$Render$1(RequestedCardContent requestedCardContent, BRg bRg, long j, C1D3 c1d3, int i) {
        super(2);
        this.$tmp0_rcvr = requestedCardContent;
        this.$modifier = bRg;
        this.$backgroundColor = j;
        this.$containerShape = c1d3;
        this.$$changed = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        this.$tmp0_rcvr.mo719RenderiJQMabo(this.$modifier, this.$backgroundColor, this.$containerShape, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
