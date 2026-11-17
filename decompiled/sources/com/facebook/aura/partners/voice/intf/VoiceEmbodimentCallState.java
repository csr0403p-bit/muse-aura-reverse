package com.facebook.aura.partners.voice.intf;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cI;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentCallState extends C06G {
    public static final int $stable = 0;
    public final long generation;
    public final boolean rtcEverPainted;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceEmbodimentCallState) {
                VoiceEmbodimentCallState voiceEmbodimentCallState = (VoiceEmbodimentCallState) obj;
                if (this.generation != voiceEmbodimentCallState.generation || this.rtcEverPainted != voiceEmbodimentCallState.rtcEverPainted) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoiceEmbodimentCallState copy$default(VoiceEmbodimentCallState voiceEmbodimentCallState, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = voiceEmbodimentCallState.generation;
        }
        if ((i & 2) != 0) {
            z = voiceEmbodimentCallState.rtcEverPainted;
        }
        return new VoiceEmbodimentCallState(j, z);
    }

    public final long component1() {
        return this.generation;
    }

    public final boolean component2() {
        return this.rtcEverPainted;
    }

    public final VoiceEmbodimentCallState copy(long j, boolean z) {
        return new VoiceEmbodimentCallState(j, z);
    }

    public final long getGeneration() {
        return this.generation;
    }

    public final boolean getRtcEverPainted() {
        return this.rtcEverPainted;
    }

    public int hashCode() {
        return C0KA.A00(C3cI.A01(this.generation), this.rtcEverPainted);
    }

    public VoiceEmbodimentCallState(long j, boolean z) {
        this.generation = j;
        this.rtcEverPainted = z;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceEmbodimentCallState(long j, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? 0L : j, AnonymousClass001.A1Q(i, z));
    }

    public VoiceEmbodimentCallState() {
        this(0L, false);
    }
}
