package com.facebook.aura.partners.voice.screen;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C0dx;
import X.C1BO;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentStateReason;
import com.facebook.aura.partners.voice.prefs.VoiceAvatarExpandedView;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceAvatarTakeoverKt$rememberCallAvatarPanelToggle$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
    public final /* synthetic */ C0dx $haptic;
    public final /* synthetic */ HatchStatusPillMetrics $metrics;
    public final /* synthetic */ C1BO<VoiceAvatarExpandedView> $rememberedSize;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceAvatarTakeoverKt$rememberCallAvatarPanelToggle$1$1(C0dx c0dx, AbstractC3358CGz abstractC3358CGz, VoiceAvatarFullScreenState voiceAvatarFullScreenState, HatchStatusPillMetrics hatchStatusPillMetrics, C1BO<? extends VoiceAvatarExpandedView> c1bo) {
        super(0);
        this.$haptic = c0dx;
        this.$userSession = abstractC3358CGz;
        this.$fullScreen = voiceAvatarFullScreenState;
        this.$metrics = hatchStatusPillMetrics;
        this.$rememberedSize = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$haptic.AXr(AuraHaptics.BUTTON_TAP);
        VoiceCallStateHolder companion = VoiceCallStateHolder.Companion.getInstance(this.$userSession);
        companion.noteEmbodimentStateReason(VoiceEmbodimentStateReason.TAP);
        if (this.$fullScreen.getActive()) {
            VoiceAvatarTakeoverKt.logEmbodimentExpandToggle(companion, false);
            this.$fullScreen.collapse(this.$metrics, true);
        } else if (this.$metrics.getAvatarExpanded()) {
            VoiceAvatarTakeoverKt.logEmbodimentExpandToggle(companion, false);
            this.$metrics.setAvatarExpanded(false);
        } else {
            VoiceAvatarTakeoverKt.logEmbodimentExpandToggle(companion, true);
            VoiceAvatarTakeoverKt.openFromAvatar(this.$fullScreen, this.$metrics, this.$rememberedSize.getValue());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
