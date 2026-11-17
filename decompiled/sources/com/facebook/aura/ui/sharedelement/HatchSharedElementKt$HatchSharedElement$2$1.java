package com.facebook.aura.ui.sharedelement;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchSharedElementKt$HatchSharedElement$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $currentlyEnabled;
    public final /* synthetic */ boolean $isTransitionActive;
    public final /* synthetic */ SharedElementParticipation $participation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSharedElementKt$HatchSharedElement$2$1(SharedElementParticipation sharedElementParticipation, boolean z, boolean z2) {
        super(0);
        this.$participation = sharedElementParticipation;
        this.$currentlyEnabled = z;
        this.$isTransitionActive = z2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$participation.updateAfterComposition(this.$currentlyEnabled, this.$isTransitionActive);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
