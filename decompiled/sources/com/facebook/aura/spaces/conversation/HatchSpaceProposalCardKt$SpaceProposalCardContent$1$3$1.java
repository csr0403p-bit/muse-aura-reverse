package com.facebook.aura.spaces.conversation;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.model.SpaceConstructionStatus;
import com.facebook.aura.model.SpaceProposalPresentation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSpaceProposalCardKt$SpaceProposalCardContent$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $buildCtaText;
    public final /* synthetic */ boolean $isReady;
    public final /* synthetic */ G0U<String, Unit> $onBuild;
    public final /* synthetic */ Function0<Unit> $onOpenSpace;
    public final /* synthetic */ G0U<String, Unit> $openSpace;
    public final /* synthetic */ SpaceProposalPresentation $proposal;
    public final /* synthetic */ SpaceConstructionStatus $resolvedStatus;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSpaceProposalCardKt$SpaceProposalCardContent$1$3$1(boolean z, SpaceProposalPresentation spaceProposalPresentation, SpaceConstructionStatus spaceConstructionStatus, G0U<? super String, Unit> g0u, String str, Function0<Unit> function0, G0U<? super String, Unit> g0u2) {
        super(0);
        this.$isReady = z;
        this.$proposal = spaceProposalPresentation;
        this.$resolvedStatus = spaceConstructionStatus;
        this.$onBuild = g0u;
        this.$buildCtaText = str;
        this.$onOpenSpace = function0;
        this.$openSpace = g0u2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (!this.$isReady) {
            if (this.$resolvedStatus == null) {
                this.$onBuild.invoke(this.$buildCtaText);
                return;
            }
            return;
        }
        String str = this.$proposal.slug;
        if (str != null) {
            Function0<Unit> function0 = this.$onOpenSpace;
            G0U<String, Unit> g0u = this.$openSpace;
            function0.invoke();
            g0u.invoke(str);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
