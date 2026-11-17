package com.facebook.aura.partners.voice.screen;

import X.AQY;
import X.AaC;
import X.AbstractC7559F3s;
import X.C2J7;
import X.C2Un;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC1497Ak4;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$8$2$1 extends AbstractC7559F3s implements G0U<InterfaceC1497Ak4, Unit> {
    public final /* synthetic */ HatchStatusPillMetrics $metrics;
    public final /* synthetic */ boolean $ownsDragHandleTone;
    public final /* synthetic */ AtomicReference<AaC> $placedHalfScreenMedia;
    public final /* synthetic */ VoiceAvatarTakeoverState $takeoverState;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC1497Ak4 interfaceC1497Ak4) {
        C7384Etj.A0Y(interfaceC1497Ak4, 0);
        if (this.$ownsDragHandleTone && this.$metrics.getAvatarPanelProgress() == 1.0f && this.$takeoverState.fullScreen.getProgress() == 0.0f) {
            AaC aaCA00 = C2Un.A00(C2Un.A02(C2J7.A00(interfaceC1497Ak4.APr(0L), AQY.A01(interfaceC1497Ak4.AKd()))));
            this.$placedHalfScreenMedia.set(aaCA00);
            this.$takeoverState.setHalfScreenMediaBounds$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen(aaCA00);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$8$2$1(boolean z, HatchStatusPillMetrics hatchStatusPillMetrics, VoiceAvatarTakeoverState voiceAvatarTakeoverState, AtomicReference<AaC> atomicReference) {
        super(1);
        this.$ownsDragHandleTone = z;
        this.$metrics = hatchStatusPillMetrics;
        this.$takeoverState = voiceAvatarTakeoverState;
        this.$placedHalfScreenMedia = atomicReference;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1497Ak4 interfaceC1497Ak4) {
        invoke2(interfaceC1497Ak4);
        return Unit.INSTANCE;
    }
}
