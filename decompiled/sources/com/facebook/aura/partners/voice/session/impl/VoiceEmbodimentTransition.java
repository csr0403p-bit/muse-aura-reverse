package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass005;
import X.C7384Etj;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentStateReason;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentTransition {
    public final String fromMedia;
    public final String fromPlacement;
    public final long prevStateMs;
    public final VoiceEmbodimentStateReason reason;
    public final int seq;
    public final long sinceConnectMs;
    public final String toMedia;
    public final String toPlacement;

    public VoiceEmbodimentTransition(int i, long j, String str, String str2, String str3, String str4, VoiceEmbodimentStateReason voiceEmbodimentStateReason, long j2) {
        AnonymousClass005.A16(str, str2, str3, str4, 2);
        C7384Etj.A0Y(voiceEmbodimentStateReason, 6);
        this.seq = i;
        this.sinceConnectMs = j;
        this.fromPlacement = str;
        this.toPlacement = str2;
        this.fromMedia = str3;
        this.toMedia = str4;
        this.reason = voiceEmbodimentStateReason;
        this.prevStateMs = j2;
    }

    public final String getFromMedia() {
        return this.fromMedia;
    }

    public final String getFromPlacement() {
        return this.fromPlacement;
    }

    public final long getPrevStateMs() {
        return this.prevStateMs;
    }

    public final VoiceEmbodimentStateReason getReason() {
        return this.reason;
    }

    public final int getSeq() {
        return this.seq;
    }

    public final long getSinceConnectMs() {
        return this.sinceConnectMs;
    }

    public final String getToMedia() {
        return this.toMedia;
    }

    public final String getToPlacement() {
        return this.toPlacement;
    }
}
