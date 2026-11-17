package com.facebook.aura.status.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C7384Etj;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.status.view.HatchAnimatedBotAvatarKt$AvatarStatusVideoCrossfade$1$1", f = "HatchAnimatedBotAvatar.kt", l = {426, 443}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchAnimatedBotAvatarKt$AvatarStatusVideoCrossfade$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnIdlePreparationFinished$delegate;
    public final /* synthetic */ MutableState<AvatarVideoPresentation> $established$delegate;
    public final /* synthetic */ MutableState<AvatarVideoPresentation> $incoming$delegate;
    public final /* synthetic */ MutableState<Boolean> $incomingReady$delegate;
    public final /* synthetic */ boolean $isPlaying;
    public final /* synthetic */ AuraDrawableSource $placeholderImage;
    public final /* synthetic */ boolean $playbackPaused;
    public final /* synthetic */ boolean $retainVideoUntilReady;
    public final /* synthetic */ MutableState<Boolean> $revealImage$delegate;
    public final /* synthetic */ boolean $shouldDeferVideoChanges;
    public final /* synthetic */ AvatarVideoPresentation $target;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAnimatedBotAvatarKt$AvatarStatusVideoCrossfade$1$1(boolean z, boolean z2, boolean z3, AvatarVideoPresentation avatarVideoPresentation, AuraDrawableSource auraDrawableSource, boolean z4, MutableState<Boolean> mutableState, MutableState<AvatarVideoPresentation> mutableState2, MutableState<Boolean> mutableState3, MutableState<AvatarVideoPresentation> mutableState4, C1BO<? extends Function0<Unit>> c1bo, HtJ<? super HatchAnimatedBotAvatarKt$AvatarStatusVideoCrossfade$1$1> htJ) {
        super(2, htJ);
        this.$isPlaying = z;
        this.$playbackPaused = z2;
        this.$shouldDeferVideoChanges = z3;
        this.$target = avatarVideoPresentation;
        this.$placeholderImage = auraDrawableSource;
        this.$retainVideoUntilReady = z4;
        this.$revealImage$delegate = mutableState;
        this.$incoming$delegate = mutableState2;
        this.$incomingReady$delegate = mutableState3;
        this.$established$delegate = mutableState4;
        this.$currentOnIdlePreparationFinished$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAnimatedBotAvatarKt$AvatarStatusVideoCrossfade$1$1(this.$isPlaying, this.$playbackPaused, this.$shouldDeferVideoChanges, this.$target, this.$placeholderImage, this.$retainVideoUntilReady, this.$revealImage$delegate, this.$incoming$delegate, this.$incomingReady$delegate, this.$established$delegate, this.$currentOnIdlePreparationFinished$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$isPlaying && !this.$playbackPaused) {
                if (this.$shouldDeferVideoChanges) {
                    MutableState.A09(false, this.$revealImage$delegate);
                } else {
                    AvatarVideoPresentation avatarVideoPresentation = this.$target;
                    if (avatarVideoPresentation == null) {
                        this.$incoming$delegate.Af8(null);
                        MutableState.A09(false, this.$incomingReady$delegate);
                        if (this.$placeholderImage != null && !this.$retainVideoUntilReady) {
                            MutableState.A09(true, this.$revealImage$delegate);
                            this.label = 1;
                            if (C7Bq.A01(300L, this) == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                            this.$established$delegate.Af8(null);
                        }
                    } else {
                        boolean zEquals = avatarVideoPresentation.equals(this.$established$delegate.getValue());
                        MutableState<AvatarVideoPresentation> mutableState = this.$incoming$delegate;
                        if (zEquals) {
                            mutableState.Af8(null);
                            MutableState.A09(false, this.$incomingReady$delegate);
                            MutableState.A09(false, this.$revealImage$delegate);
                            if (this.$target.callCropTopFraction != null) {
                                C1BO.A0D(this.$currentOnIdlePreparationFinished$delegate);
                            }
                        } else {
                            if (!C7384Etj.areEqual(mutableState.getValue(), this.$target)) {
                                this.$incoming$delegate.Af8(this.$target);
                                MutableState.A09(false, this.$incomingReady$delegate);
                            }
                            MutableState.A09(false, this.$revealImage$delegate);
                            this.label = 2;
                            if (C7Bq.A01(1500L, this) == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                            if (!this.$retainVideoUntilReady) {
                                MutableState.A09(true, this.$revealImage$delegate);
                            }
                        }
                    }
                }
            }
        } else if (i == 1) {
            Hwg.A00(obj);
            this.$established$delegate.Af8(null);
        } else {
            if (i != 2) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (!this.$retainVideoUntilReady && C7384Etj.areEqual(this.$incoming$delegate.getValue(), this.$target) && !MutableState.A0A((MutableState) this.$incomingReady$delegate) && this.$placeholderImage != null) {
                MutableState.A09(true, this.$revealImage$delegate);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchAnimatedBotAvatarKt$AvatarStatusVideoCrossfade$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
