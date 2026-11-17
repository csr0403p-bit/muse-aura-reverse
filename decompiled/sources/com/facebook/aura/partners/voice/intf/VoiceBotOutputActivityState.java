package com.facebook.aura.partners.voice.intf;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;

/* loaded from: classes2.dex */
public final class VoiceBotOutputActivityState extends C06G {
    public static final int $stable = 0;
    public final boolean active;
    public final long generation;
    public final long inactiveAtMs;

    public static /* synthetic */ VoiceBotOutputActivityState copy$default(VoiceBotOutputActivityState voiceBotOutputActivityState, boolean z, long j, long j2, int i, Object obj) {
        boolean z2 = z;
        long j3 = j;
        long j4 = j2;
        if ((i & 1) != 0) {
            z2 = voiceBotOutputActivityState.active;
        }
        if ((i & 2) != 0) {
            j3 = voiceBotOutputActivityState.generation;
        }
        if ((i & 4) != 0) {
            j4 = voiceBotOutputActivityState.inactiveAtMs;
        }
        return new VoiceBotOutputActivityState(z2, j3, j4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceBotOutputActivityState) {
                VoiceBotOutputActivityState voiceBotOutputActivityState = (VoiceBotOutputActivityState) obj;
                if (this.active != voiceBotOutputActivityState.active || this.generation != voiceBotOutputActivityState.generation || this.inactiveAtMs != voiceBotOutputActivityState.inactiveAtMs) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean component1() {
        return this.active;
    }

    public final long component2() {
        return this.generation;
    }

    public final long component3() {
        return this.inactiveAtMs;
    }

    public final VoiceBotOutputActivityState copy(boolean z, long j, long j2) {
        return new VoiceBotOutputActivityState(z, j, j2);
    }

    public final boolean getActive() {
        return this.active;
    }

    public final long getGeneration() {
        return this.generation;
    }

    public final long getInactiveAtMs() {
        return this.inactiveAtMs;
    }

    public int hashCode() {
        return AnonymousClass006.A06(this.generation, C0KA.A02(this.active)) + C3cG.A02(this.inactiveAtMs);
    }

    public VoiceBotOutputActivityState(boolean z, long j, long j2) {
        this.active = z;
        this.generation = j;
        this.inactiveAtMs = j2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceBotOutputActivityState(boolean z, long j, long j2, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? 0L : j, C3cH.A03(i & 4, j2));
    }

    public VoiceBotOutputActivityState() {
        this(false, 0L, 0L);
    }
}
