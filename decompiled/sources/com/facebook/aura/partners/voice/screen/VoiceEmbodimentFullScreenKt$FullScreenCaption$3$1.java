package com.facebook.aura.partners.voice.screen;

import X.AaC;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentFullScreenKt$FullScreenCaption$3$1 extends AbstractC7559F3s implements G0U<AaC, Unit> {
    public final /* synthetic */ VoiceAvatarTakeoverState $takeoverState;
    public final /* synthetic */ CaptionBoundsWrite $written;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AaC aaC) {
        C7384Etj.A0Y(aaC, 0);
        this.$written.bounds = aaC;
        this.$takeoverState.setCaptionBounds(aaC);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentFullScreenKt$FullScreenCaption$3$1(CaptionBoundsWrite captionBoundsWrite, VoiceAvatarTakeoverState voiceAvatarTakeoverState) {
        super(1);
        this.$written = captionBoundsWrite;
        this.$takeoverState = voiceAvatarTakeoverState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AaC aaC) {
        invoke2(aaC);
        return Unit.INSTANCE;
    }
}
