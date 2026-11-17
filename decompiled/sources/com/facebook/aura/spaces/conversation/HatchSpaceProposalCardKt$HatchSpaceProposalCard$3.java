package com.facebook.aura.spaces.conversation;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.G0U;
import X.G0V;
import com.facebook.aura.model.SpaceProposalPresentation;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSpaceProposalCardKt$HatchSpaceProposalCard$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C1D3 $containerShape;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onSendMessage;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ SpaceProposalPresentation $proposal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSpaceProposalCardKt$HatchSpaceProposalCard$3(SpaceProposalPresentation spaceProposalPresentation, String str, BRg bRg, long j, C1D3 c1d3, G0U<? super String, Unit> g0u, int i, int i2) {
        super(2);
        this.$proposal = spaceProposalPresentation;
        this.$presentationId = str;
        this.$modifier = bRg;
        this.$backgroundColor = j;
        this.$containerShape = c1d3;
        this.$onSendMessage = g0u;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchSpaceProposalCardKt.m2174HatchSpaceProposalCardfWhpE4E(this.$proposal, this.$presentationId, this.$modifier, this.$backgroundColor, this.$containerShape, this.$onSendMessage, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
