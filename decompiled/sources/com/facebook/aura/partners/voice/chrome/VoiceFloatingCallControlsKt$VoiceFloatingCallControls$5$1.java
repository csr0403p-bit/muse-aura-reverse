package com.facebook.aura.partners.voice.chrome;

import X.AXN;
import X.Ab3;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C1BO;
import X.C2ae;
import X.G0U;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceFloatingCallControlsKt$VoiceFloatingCallControls$5$1 extends AbstractC7559F3s implements G0U<AXN, C2ae> {
    public final /* synthetic */ C1BO<Float> $captionLift;
    public final /* synthetic */ HatchCallControlsMotion $motion;
    public final /* synthetic */ CallControlsPresentation $presentation;
    public final /* synthetic */ Function0<Float> $surfaceLeft;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceFloatingCallControlsKt$VoiceFloatingCallControls$5$1(HatchCallControlsMotion hatchCallControlsMotion, C1BO<Float> c1bo, CallControlsPresentation callControlsPresentation, Function0<Float> function0) {
        super(1);
        this.$motion = hatchCallControlsMotion;
        this.$captionLift = c1bo;
        this.$presentation = callControlsPresentation;
        this.$surfaceLeft = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C2ae invoke(AXN axn) {
        return new C2ae(m1711invokeBjo55l4(axn));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m1711invokeBjo55l4(AXN axn) {
        float fA01;
        long jM1703getPositionF1C5BW0 = this.$motion.m1703getPositionF1C5BW0();
        float fA012 = C1BO.A01(this.$captionLift);
        if (fA012 > 0.0f) {
            float f = this.$motion.topLimitAbove(this.$presentation.captionReservationPx, AnonymousClass001.A00(jM1703getPositionF1C5BW0));
            float fA013 = AnonymousClass001.A01(jM1703getPositionF1C5BW0, 4294967295L);
            float f2 = fA013 - f;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            fA01 = fA013 - (fA012 * f2);
        } else {
            fA01 = AnonymousClass001.A01(jM1703getPositionF1C5BW0, 4294967295L);
        }
        return (Ab3.A01(AnonymousClass003.A04(this.$surfaceLeft)) << 32) | (4294967295L & Ab3.A01(fA01));
    }
}
