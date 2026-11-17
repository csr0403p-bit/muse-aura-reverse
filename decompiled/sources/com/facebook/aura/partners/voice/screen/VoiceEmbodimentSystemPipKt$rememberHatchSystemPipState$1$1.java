package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C1BO;
import androidx.activity.ComponentActivity;
import com.facebook.aura.lifecycle.AuraPictureInPicture;
import com.facebook.aura.partners.voice.api.VoiceSystemPipEvent;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$1$1 extends AbstractC7559F3s implements Function0<VoiceSystemPipEvent> {
    public final /* synthetic */ ComponentActivity $componentActivity;
    public final /* synthetic */ C1BO<Boolean> $currentAvatarEnabled$delegate;
    public final /* synthetic */ HatchSystemPipController $pipController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$1$1(ComponentActivity componentActivity, HatchSystemPipController hatchSystemPipController, C1BO<Boolean> c1bo) {
        super(0);
        this.$componentActivity = componentActivity;
        this.$pipController = hatchSystemPipController;
        this.$currentAvatarEnabled$delegate = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final VoiceSystemPipEvent invoke() {
        boolean zConsumeOutboundLaunch = AuraPictureInPicture.INSTANCE.consumeOutboundLaunch();
        ComponentActivity componentActivity = this.$componentActivity;
        return (componentActivity == null || !componentActivity.isInPictureInPictureMode()) ? zConsumeOutboundLaunch ? VoiceSystemPipEvent.PAUSED_OUTBOUND_LAUNCH : !VoiceGating.INSTANCE.isSystemPipEnabled() ? VoiceSystemPipEvent.PAUSED_GATE_DISABLED : this.$pipController == null ? VoiceSystemPipEvent.PAUSED_UNAVAILABLE : !C1BO.A0F(this.$currentAvatarEnabled$delegate) ? VoiceSystemPipEvent.PAUSED_SOURCE_HIDDEN : this.$pipController.autoEnterPauseEvent() : VoiceSystemPipEvent.PAUSED_IN_PIP;
    }
}
