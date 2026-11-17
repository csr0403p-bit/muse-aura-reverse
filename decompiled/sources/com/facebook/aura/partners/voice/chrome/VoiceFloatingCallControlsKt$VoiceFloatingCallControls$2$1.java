package com.facebook.aura.partners.voice.chrome;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceFloatingCallControlsKt$VoiceFloatingCallControls$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchCallControlsMotion $motion;
    public final /* synthetic */ CallControlsPresentation $presentation;
    public final /* synthetic */ CallControlsPresentationState $presentationState;
    public final /* synthetic */ boolean $sidePanelRevealed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceFloatingCallControlsKt$VoiceFloatingCallControls$2$1(HatchCallControlsMotion hatchCallControlsMotion, CallControlsPresentation callControlsPresentation, boolean z, CallControlsPresentationState callControlsPresentationState) {
        super(0);
        this.$motion = hatchCallControlsMotion;
        this.$presentation = callControlsPresentation;
        this.$sidePanelRevealed = z;
        this.$presentationState = callControlsPresentationState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchCallControlsMotion hatchCallControlsMotion = this.$motion;
        CallControlsPresentation callControlsPresentation = this.$presentation;
        Float fValueOf = Float.valueOf(callControlsPresentation.captionReservationPx);
        if (!callControlsPresentation.captionReserved) {
            fValueOf = null;
        }
        hatchCallControlsMotion.captionReservation = fValueOf;
        hatchCallControlsMotion.holdDefaultPosition(this.$sidePanelRevealed);
        boolean z = this.$presentationState.visible;
        HatchCallControlsMotion hatchCallControlsMotion2 = this.$motion;
        if (z) {
            hatchCallControlsMotion2.updateBounds(this.$presentation.bounds);
        } else {
            hatchCallControlsMotion2.cancel();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
