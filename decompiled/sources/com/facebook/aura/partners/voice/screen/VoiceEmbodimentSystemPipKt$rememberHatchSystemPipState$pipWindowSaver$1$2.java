package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$pipWindowSaver$1$2 extends AbstractC7559F3s implements G0U<int[], HatchPipWindowMeasurement> {
    public static final VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$pipWindowSaver$1$2 INSTANCE = new VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$pipWindowSaver$1$2();

    public VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$pipWindowSaver$1$2() {
        super(1);
    }

    @Override // X.G0U
    public final HatchPipWindowMeasurement invoke(int[] iArr) {
        C7384Etj.A0Y(iArr, 0);
        return new HatchPipWindowMeasurement((iArr[1] & 4294967295L) | (iArr[0] << 32), iArr[2]);
    }
}
