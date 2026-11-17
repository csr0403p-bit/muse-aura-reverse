package com.facebook.aura.spaces.conversation;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.G0U;
import X.G0V;
import com.facebook.aura.model.SpaceConstructionStatus;
import com.facebook.aura.model.SpaceProposalPresentation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSpaceProposalCardKt$SpaceProposalCardContent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C1D3 $containerShape;
    public final /* synthetic */ String $imageUrl;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onBuild;
    public final /* synthetic */ Function0<Unit> $onOpenSpace;
    public final /* synthetic */ SpaceProposalPresentation $proposal;
    public final /* synthetic */ SpaceConstructionStatus $resolvedStatus;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSpaceProposalCardKt$SpaceProposalCardContent$2(BRg bRg, SpaceProposalPresentation spaceProposalPresentation, String str, long j, C1D3 c1d3, SpaceConstructionStatus spaceConstructionStatus, G0U<? super String, Unit> g0u, Function0<Unit> function0, int i, int i2) {
        super(2);
        this.$modifier = bRg;
        this.$proposal = spaceProposalPresentation;
        this.$imageUrl = str;
        this.$backgroundColor = j;
        this.$containerShape = c1d3;
        this.$resolvedStatus = spaceConstructionStatus;
        this.$onBuild = g0u;
        this.$onOpenSpace = function0;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchSpaceProposalCardKt.m2175SpaceProposalCardContent8r3B23s(this.$modifier, this.$proposal, this.$imageUrl, this.$backgroundColor, this.$containerShape, this.$resolvedStatus, this.$onBuild, this.$onOpenSpace, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
