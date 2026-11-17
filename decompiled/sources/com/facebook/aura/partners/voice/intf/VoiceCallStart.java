package com.facebook.aura.partners.voice.intf;

import X.C06H;
import X.C3cH;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes2.dex */
public final class VoiceCallStart {
    public static final int $stable = 8;
    public final Map<String, String> attribution;
    public final VoiceCallEntryPoint entryPoint;

    public VoiceCallStart(VoiceCallEntryPoint voiceCallEntryPoint, Map<String, String> map) {
        C7384Etj.A0Y(map, 1);
        this.entryPoint = voiceCallEntryPoint;
        this.attribution = map;
    }

    public final Map<String, String> getAttribution() {
        return this.attribution;
    }

    public final VoiceCallEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public /* synthetic */ VoiceCallStart(VoiceCallEntryPoint voiceCallEntryPoint, Map map, int i, C06H c06h) {
        this(voiceCallEntryPoint, C3cH.A0o(map, i & 2));
    }
}
