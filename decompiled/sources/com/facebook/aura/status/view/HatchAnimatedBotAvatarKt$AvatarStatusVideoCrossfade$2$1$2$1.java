package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C1BO;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchAnimatedBotAvatarKt$AvatarStatusVideoCrossfade$2$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnIdlePreparationFinished$delegate;
    public final /* synthetic */ MutableState<AvatarVideoPresentation> $incoming$delegate;
    public final /* synthetic */ MutableState<Boolean> $incomingReady$delegate;
    public final /* synthetic */ AvatarVideoPresentation $presentation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAnimatedBotAvatarKt$AvatarStatusVideoCrossfade$2$1$2$1(AvatarVideoPresentation avatarVideoPresentation, MutableState<AvatarVideoPresentation> mutableState, MutableState<Boolean> mutableState2, C1BO<? extends Function0<Unit>> c1bo) {
        super(0);
        this.$presentation = avatarVideoPresentation;
        this.$incoming$delegate = mutableState;
        this.$incomingReady$delegate = mutableState2;
        this.$currentOnIdlePreparationFinished$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (MutableState.A0B(this.$incoming$delegate, this.$presentation)) {
            MutableState.A09(true, this.$incomingReady$delegate);
            if (this.$presentation.callCropTopFraction != null) {
                C1BO.A0D(this.$currentOnIdlePreparationFinished$delegate);
            }
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
