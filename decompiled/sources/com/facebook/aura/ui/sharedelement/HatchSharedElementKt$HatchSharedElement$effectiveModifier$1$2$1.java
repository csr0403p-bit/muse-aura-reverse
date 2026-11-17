package com.facebook.aura.ui.sharedelement;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchSharedElementKt$HatchSharedElement$effectiveModifier$1$2$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ HatchSharedTransitionContext $context;
    public final /* synthetic */ SharedElementClipParticipant $participant;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSharedElementKt$HatchSharedElement$effectiveModifier$1$2$1(HatchSharedTransitionContext hatchSharedTransitionContext, SharedElementClipParticipant sharedElementClipParticipant) {
        super(0);
        this.$context = hatchSharedTransitionContext;
        this.$participant = sharedElementClipParticipant;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.$context.clipRegistry.scaleFor(this.$participant));
    }
}
