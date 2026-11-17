package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;

/* loaded from: classes2.dex */
public final class CallPortraitFraming extends C06G {
    public final String callId;
    public final VoiceEmbodimentMedia.ReferenceFraming framing;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallPortraitFraming) {
                CallPortraitFraming callPortraitFraming = (CallPortraitFraming) obj;
                if (!C7384Etj.areEqual(this.callId, callPortraitFraming.callId) || !C7384Etj.areEqual(this.framing, callPortraitFraming.framing)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CallPortraitFraming copy$default(CallPortraitFraming callPortraitFraming, String str, VoiceEmbodimentMedia.ReferenceFraming referenceFraming, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callPortraitFraming.callId;
        }
        if ((i & 2) != 0) {
            referenceFraming = callPortraitFraming.framing;
        }
        AnonymousClass003.A0u(str, referenceFraming);
        return new CallPortraitFraming(str, referenceFraming);
    }

    public final String component1() {
        return this.callId;
    }

    public final VoiceEmbodimentMedia.ReferenceFraming component2() {
        return this.framing;
    }

    public final String getCallId() {
        return this.callId;
    }

    public final VoiceEmbodimentMedia.ReferenceFraming getFraming() {
        return this.framing;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.framing, AnonymousClass001.A0G(this.callId));
    }

    public CallPortraitFraming(String str, VoiceEmbodimentMedia.ReferenceFraming referenceFraming) {
        AnonymousClass003.A0u(str, referenceFraming);
        this.callId = str;
        this.framing = referenceFraming;
    }

    public final CallPortraitFraming copy(String str, VoiceEmbodimentMedia.ReferenceFraming referenceFraming) {
        AnonymousClass003.A0u(str, referenceFraming);
        return new CallPortraitFraming(str, referenceFraming);
    }

    public String toString() {
        return super.toString();
    }
}
