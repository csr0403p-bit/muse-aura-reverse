package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C1BO;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchAnimatedBotAvatarKt$AvatarStatusVideoCrossfade$2$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnIdlePreparationFinished$delegate;
    public final /* synthetic */ MutableState<AvatarVideoPresentation> $established$delegate;
    public final /* synthetic */ MutableState<AvatarVideoPresentation> $incoming$delegate;
    public final /* synthetic */ AuraDrawableSource $placeholderImage;
    public final /* synthetic */ AvatarVideoPresentation $presentation;
    public final /* synthetic */ boolean $retainVideoUntilReady;
    public final /* synthetic */ MutableState<Boolean> $revealImage$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAnimatedBotAvatarKt$AvatarStatusVideoCrossfade$2$1$3$1(AuraDrawableSource auraDrawableSource, boolean z, AvatarVideoPresentation avatarVideoPresentation, MutableState<AvatarVideoPresentation> mutableState, MutableState<Boolean> mutableState2, MutableState<AvatarVideoPresentation> mutableState3, C1BO<? extends Function0<Unit>> c1bo) {
        super(0);
        this.$placeholderImage = auraDrawableSource;
        this.$retainVideoUntilReady = z;
        this.$presentation = avatarVideoPresentation;
        this.$established$delegate = mutableState;
        this.$revealImage$delegate = mutableState2;
        this.$incoming$delegate = mutableState3;
        this.$currentOnIdlePreparationFinished$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(this.$placeholderImage != null && (!this.$retainVideoUntilReady || this.$established$delegate.getValue() == null), this.$revealImage$delegate);
        if (!MutableState.A0B(this.$incoming$delegate, this.$presentation) || this.$presentation.callCropTopFraction == null) {
            return;
        }
        C1BO.A0D(this.$currentOnIdlePreparationFinished$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
