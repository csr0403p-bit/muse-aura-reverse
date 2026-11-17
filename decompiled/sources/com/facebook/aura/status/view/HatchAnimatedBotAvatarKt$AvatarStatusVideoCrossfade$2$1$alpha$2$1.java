package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchAnimatedBotAvatarKt$AvatarStatusVideoCrossfade$2$1$alpha$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<AvatarVideoPresentation> $established$delegate;
    public final /* synthetic */ MutableState<AvatarVideoPresentation> $incoming$delegate;
    public final /* synthetic */ MutableState<Boolean> $incomingReady$delegate;
    public final /* synthetic */ AvatarVideoPresentation $presentation;
    public final /* synthetic */ MutableState<Boolean> $revealImage$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAnimatedBotAvatarKt$AvatarStatusVideoCrossfade$2$1$alpha$2$1(AvatarVideoPresentation avatarVideoPresentation, MutableState<AvatarVideoPresentation> mutableState, MutableState<Boolean> mutableState2, MutableState<AvatarVideoPresentation> mutableState3, MutableState<Boolean> mutableState4) {
        super(0);
        this.$presentation = avatarVideoPresentation;
        this.$incoming$delegate = mutableState;
        this.$incomingReady$delegate = mutableState2;
        this.$established$delegate = mutableState3;
        this.$revealImage$delegate = mutableState4;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (MutableState.A0B(this.$incoming$delegate, this.$presentation) && MutableState.A0A((MutableState) this.$incomingReady$delegate)) {
            this.$established$delegate.Af8(this.$presentation);
            this.$incoming$delegate.Af8(null);
            MutableState.A09(false, this.$incomingReady$delegate);
            MutableState.A09(false, this.$revealImage$delegate);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
