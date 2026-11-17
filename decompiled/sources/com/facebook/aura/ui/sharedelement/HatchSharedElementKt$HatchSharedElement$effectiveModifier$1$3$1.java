package com.facebook.aura.ui.sharedelement;

import X.AbstractC7559F3s;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchSharedElementKt$HatchSharedElement$effectiveModifier$1$3$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ HatchSharedTransitionContext $context;
    public final /* synthetic */ SharedElementClipParticipant $participant;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Acj(this.$context.clipRegistry.shouldSuppressForInteractiveTransform(this.$participant) ? 0.0f : 1.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSharedElementKt$HatchSharedElement$effectiveModifier$1$3$1(HatchSharedTransitionContext hatchSharedTransitionContext, SharedElementClipParticipant sharedElementClipParticipant) {
        super(1);
        this.$context = hatchSharedTransitionContext;
        this.$participant = sharedElementClipParticipant;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
