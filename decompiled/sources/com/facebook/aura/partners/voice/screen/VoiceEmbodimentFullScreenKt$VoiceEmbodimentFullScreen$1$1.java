package com.facebook.aura.partners.voice.screen;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentStateReason;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreen$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
    public final /* synthetic */ HatchStatusPillMetrics $metrics;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentFullScreenKt$VoiceEmbodimentFullScreen$1$1(AbstractC3358CGz abstractC3358CGz, VoiceAvatarFullScreenState voiceAvatarFullScreenState, HatchStatusPillMetrics hatchStatusPillMetrics) {
        super(0);
        this.$userSession = abstractC3358CGz;
        this.$fullScreen = voiceAvatarFullScreenState;
        this.$metrics = hatchStatusPillMetrics;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        VoiceCallStateHolder.Companion.getInstance(this.$userSession).noteEmbodimentStateReason(VoiceEmbodimentStateReason.BACK);
        this.$fullScreen.collapse(this.$metrics, true);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
