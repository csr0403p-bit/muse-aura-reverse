package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C1bi;
import X.G0V;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$pipWindowSaver$1$1 extends AbstractC7559F3s implements G0V<C1bi, HatchPipWindowMeasurement, int[]> {
    public static final VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$pipWindowSaver$1$1 INSTANCE = new VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$pipWindowSaver$1$1();

    public VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$pipWindowSaver$1$1() {
        super(2);
    }

    @Override // X.G0V
    public final int[] invoke(C1bi c1bi, HatchPipWindowMeasurement hatchPipWindowMeasurement) {
        if (hatchPipWindowMeasurement != null) {
            long j = hatchPipWindowMeasurement.appWindowSize;
            return new int[]{(int) (j >> 32), AnonymousClass002.A09(j), hatchPipWindowMeasurement.pipWindowSide};
        }
        return null;
    }
}
