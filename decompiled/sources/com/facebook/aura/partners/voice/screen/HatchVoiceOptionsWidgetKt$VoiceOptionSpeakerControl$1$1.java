package com.facebook.aura.partners.voice.screen;

import X.ANR;
import X.ANU;
import X.ANi;
import X.AQI;
import X.ASj;
import X.AbstractC1011APs;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C15k;
import X.C28s;
import X.C2HU;
import X.G0U;

/* loaded from: classes4.dex */
public final class HatchVoiceOptionsWidgetKt$VoiceOptionSpeakerControl$1$1 extends AbstractC7559F3s implements G0U<ANi<VoiceOptionGlyph>, ANU> {
    public static final HatchVoiceOptionsWidgetKt$VoiceOptionSpeakerControl$1$1 INSTANCE = new HatchVoiceOptionsWidgetKt$VoiceOptionSpeakerControl$1$1();

    public HatchVoiceOptionsWidgetKt$VoiceOptionSpeakerControl$1$1() {
        super(1);
    }

    @Override // X.G0U
    public final ANU invoke(ANi<VoiceOptionGlyph> aNi) {
        C28s c28s = C2HU.A01;
        AQI aqiA0P = AnonymousClass003.A0P(c28s, 150, 0);
        ASj aSj = new ASj(c28s, 150, 0);
        long j = C15k.A01;
        return ANR.A00(aqiA0P.A00(AbstractC1011APs.A05(aSj, 0.8f, j)), ASj.A00(c28s, 100, 0).A00(AbstractC1011APs.A0F(new ASj(c28s, 100, 0), 0.8f, j)));
    }
}
