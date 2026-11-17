package com.facebook.aura.partners.voice.screen;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.partners.voice.prefs.VoiceAvatarExpandedView;
import com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class VoiceEmbodimentDragHandleKt$rememberVoiceEmbodimentResize$resize$1$1 extends C7438Evz implements G0U<VoiceAvatarExpandedView, Unit> {
    public VoiceEmbodimentDragHandleKt$rememberVoiceEmbodimentResize$resize$1$1(Object obj) {
        super(1, obj, VoiceCallViewModel.class, "onAvatarSizeUsed", "onAvatarSizeUsed(Lcom/facebook/aura/partners/voice/prefs/VoiceAvatarExpandedView;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(VoiceAvatarExpandedView voiceAvatarExpandedView) {
        ((VoiceCallViewModel) AnonymousClass006.A0o(voiceAvatarExpandedView, this)).onAvatarSizeUsed(voiceAvatarExpandedView);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(VoiceAvatarExpandedView voiceAvatarExpandedView) {
        invoke2(voiceAvatarExpandedView);
        return Unit.INSTANCE;
    }
}
