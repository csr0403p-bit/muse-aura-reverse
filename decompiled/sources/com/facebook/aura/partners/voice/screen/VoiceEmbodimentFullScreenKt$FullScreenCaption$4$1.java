package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C7384Etj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentFullScreenKt$FullScreenCaption$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ VoiceAvatarTakeoverState $takeoverState;
    public final /* synthetic */ CaptionBoundsWrite $written;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentFullScreenKt$FullScreenCaption$4$1(VoiceAvatarTakeoverState voiceAvatarTakeoverState, CaptionBoundsWrite captionBoundsWrite) {
        super(0);
        this.$takeoverState = voiceAvatarTakeoverState;
        this.$written = captionBoundsWrite;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (C7384Etj.areEqual(this.$takeoverState.getCaptionBounds(), this.$written.bounds)) {
            this.$takeoverState.setCaptionBounds(null);
        }
        this.$written.bounds = null;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
