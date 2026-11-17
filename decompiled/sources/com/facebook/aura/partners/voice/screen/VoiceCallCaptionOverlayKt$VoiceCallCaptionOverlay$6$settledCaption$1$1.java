package com.facebook.aura.partners.voice.screen;

import X.AaC;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceCallCaptionOverlayKt$VoiceCallCaptionOverlay$6$settledCaption$1$1 extends AbstractC7559F3s implements G0U<AaC, Unit> {
    public final /* synthetic */ C1BO<Integer> $animatedChromeInset;
    public final /* synthetic */ C1BO<Integer> $chromeBottomInset$delegate;
    public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
    public final /* synthetic */ VoiceAvatarTakeoverState $takeoverState;
    public final /* synthetic */ CaptionBoundsWrite $written;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AaC aaC) {
        C7384Etj.A0Y(aaC, 0);
        if (AnonymousClass001.A0F(this.$animatedChromeInset.getValue()) == AnonymousClass001.A0F(this.$chromeBottomInset$delegate.getValue())) {
            CaptionBoundsWrite captionBoundsWrite = this.$written;
            if (!this.$fullScreen.getActive()) {
                aaC = null;
            }
            captionBoundsWrite.bounds = aaC;
            this.$takeoverState.setCaptionBounds(this.$written.bounds);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCaptionOverlayKt$VoiceCallCaptionOverlay$6$settledCaption$1$1(C1BO<Integer> c1bo, CaptionBoundsWrite captionBoundsWrite, VoiceAvatarTakeoverState voiceAvatarTakeoverState, C1BO<Integer> c1bo2, VoiceAvatarFullScreenState voiceAvatarFullScreenState) {
        super(1);
        this.$animatedChromeInset = c1bo;
        this.$written = captionBoundsWrite;
        this.$takeoverState = voiceAvatarTakeoverState;
        this.$chromeBottomInset$delegate = c1bo2;
        this.$fullScreen = voiceAvatarFullScreenState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AaC aaC) {
        invoke2(aaC);
        return Unit.INSTANCE;
    }
}
