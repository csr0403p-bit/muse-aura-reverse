package com.facebook.aura.partners.voice.screen;

import X.C7384Etj;
import X.InterfaceC2178B0w;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;

/* loaded from: classes4.dex */
public final class VoiceDragHandleStill {
    public static final int $stable = 8;
    public final VoiceEmbodimentMedia.ReferenceFraming framing;
    public final InterfaceC2178B0w still;

    public VoiceDragHandleStill(InterfaceC2178B0w interfaceC2178B0w, VoiceEmbodimentMedia.ReferenceFraming referenceFraming) {
        C7384Etj.A0Y(interfaceC2178B0w, 0);
        this.still = interfaceC2178B0w;
        this.framing = referenceFraming;
    }

    public final VoiceEmbodimentMedia.ReferenceFraming getFraming() {
        return this.framing;
    }

    public final InterfaceC2178B0w getStill() {
        return this.still;
    }
}
