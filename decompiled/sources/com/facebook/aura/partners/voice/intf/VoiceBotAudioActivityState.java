package com.facebook.aura.partners.voice.intf;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;

/* loaded from: classes2.dex */
public final class VoiceBotAudioActivityState extends C06G {
    public static final int $stable = 0;
    public final boolean active;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof VoiceBotAudioActivityState) && this.active == ((VoiceBotAudioActivityState) obj).active);
    }

    public static /* synthetic */ VoiceBotAudioActivityState copy$default(VoiceBotAudioActivityState voiceBotAudioActivityState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = voiceBotAudioActivityState.active;
        }
        return new VoiceBotAudioActivityState(z);
    }

    public final boolean component1() {
        return this.active;
    }

    public final VoiceBotAudioActivityState copy(boolean z) {
        return new VoiceBotAudioActivityState(z);
    }

    public final boolean getActive() {
        return this.active;
    }

    public int hashCode() {
        return this.active ? 1231 : 1237;
    }

    public /* synthetic */ VoiceBotAudioActivityState(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public String toString() {
        return super.toString();
    }

    public VoiceBotAudioActivityState(boolean z) {
        this.active = z;
    }

    public VoiceBotAudioActivityState() {
        this(false);
    }
}
