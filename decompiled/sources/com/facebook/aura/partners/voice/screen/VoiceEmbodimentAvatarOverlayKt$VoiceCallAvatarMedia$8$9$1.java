package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C3cI;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentCallState;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentVisibleMedia;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$8$9$1 extends AbstractC7559F3s implements G0U<VoiceEmbodimentVisibleMedia, Unit> {
    public final /* synthetic */ C1BO<VoiceEmbodimentCallState> $callState$delegate;
    public final /* synthetic */ VoiceCallStateHolder $stateHolder;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(VoiceEmbodimentVisibleMedia voiceEmbodimentVisibleMedia) {
        C7384Etj.A0Y(voiceEmbodimentVisibleMedia, 0);
        this.$stateHolder.setEmbodimentVisibleMedia(C3cI.A03(this.$callState$delegate), voiceEmbodimentVisibleMedia);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$8$9$1(VoiceCallStateHolder voiceCallStateHolder, C1BO<VoiceEmbodimentCallState> c1bo) {
        super(1);
        this.$stateHolder = voiceCallStateHolder;
        this.$callState$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(VoiceEmbodimentVisibleMedia voiceEmbodimentVisibleMedia) {
        invoke2(voiceEmbodimentVisibleMedia);
        return Unit.INSTANCE;
    }
}
