package com.facebook.aura.partners.voice.ui;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C8j4;
import com.facebook.aura.model.AgentActivityStatus;

/* loaded from: classes4.dex */
public final class VoiceEmbodimentMediaReducerInput extends C06G {
    public static final int $stable = 8;
    public final EmbodimentClip activityClip;
    public final AgentActivityStatus activityStatus;
    public final long botOutputActivityGeneration;
    public final long botOutputInactiveAtMs;
    public final long elapsedRealtimeMs;
    public final EmbodimentClip generatedIdleClip;
    public final boolean isBotOutputActive;
    public final boolean isBotSpeaking;
    public final boolean lifecycleResumed;
    public final boolean liveRtcEnabled;
    public final long outputTailHoldMs;
    public final VoiceEmbodimentPaintedFlags paintedFlags;
    public final boolean stillAvailable;
    public final boolean videoStateSwapEnabled;
    public final long workingEntryDwellMs;

    public VoiceEmbodimentMediaReducerInput(AgentActivityStatus agentActivityStatus, long j, EmbodimentClip embodimentClip, EmbodimentClip embodimentClip2, boolean z, boolean z2, VoiceEmbodimentPaintedFlags voiceEmbodimentPaintedFlags, boolean z3, boolean z4, boolean z5, boolean z6, long j2, long j3, long j4, long j5) {
        AnonymousClass002.A1E(agentActivityStatus, 0, voiceEmbodimentPaintedFlags);
        this.activityStatus = agentActivityStatus;
        this.elapsedRealtimeMs = j;
        this.activityClip = embodimentClip;
        this.generatedIdleClip = embodimentClip2;
        this.lifecycleResumed = z;
        this.stillAvailable = z2;
        this.paintedFlags = voiceEmbodimentPaintedFlags;
        this.liveRtcEnabled = z3;
        this.videoStateSwapEnabled = z4;
        this.isBotSpeaking = z5;
        this.isBotOutputActive = z6;
        this.botOutputActivityGeneration = j2;
        this.botOutputInactiveAtMs = j3;
        this.workingEntryDwellMs = j4;
        this.outputTailHoldMs = j5;
    }

    public final VoiceEmbodimentMediaReducerInput copy(AgentActivityStatus agentActivityStatus, long j, EmbodimentClip embodimentClip, EmbodimentClip embodimentClip2, boolean z, boolean z2, VoiceEmbodimentPaintedFlags voiceEmbodimentPaintedFlags, boolean z3, boolean z4, boolean z5, boolean z6, long j2, long j3, long j4, long j5) {
        AnonymousClass002.A1E(agentActivityStatus, 0, voiceEmbodimentPaintedFlags);
        return new VoiceEmbodimentMediaReducerInput(agentActivityStatus, j, embodimentClip, embodimentClip2, z, z2, voiceEmbodimentPaintedFlags, z3, z4, z5, z6, j2, j3, j4, j5);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceEmbodimentMediaReducerInput) {
                VoiceEmbodimentMediaReducerInput voiceEmbodimentMediaReducerInput = (VoiceEmbodimentMediaReducerInput) obj;
                if (this.activityStatus != voiceEmbodimentMediaReducerInput.activityStatus || this.elapsedRealtimeMs != voiceEmbodimentMediaReducerInput.elapsedRealtimeMs || !C7384Etj.areEqual(this.activityClip, voiceEmbodimentMediaReducerInput.activityClip) || !C7384Etj.areEqual(this.generatedIdleClip, voiceEmbodimentMediaReducerInput.generatedIdleClip) || this.lifecycleResumed != voiceEmbodimentMediaReducerInput.lifecycleResumed || this.stillAvailable != voiceEmbodimentMediaReducerInput.stillAvailable || !C7384Etj.areEqual(this.paintedFlags, voiceEmbodimentMediaReducerInput.paintedFlags) || this.liveRtcEnabled != voiceEmbodimentMediaReducerInput.liveRtcEnabled || this.videoStateSwapEnabled != voiceEmbodimentMediaReducerInput.videoStateSwapEnabled || this.isBotSpeaking != voiceEmbodimentMediaReducerInput.isBotSpeaking || this.isBotOutputActive != voiceEmbodimentMediaReducerInput.isBotOutputActive || this.botOutputActivityGeneration != voiceEmbodimentMediaReducerInput.botOutputActivityGeneration || this.botOutputInactiveAtMs != voiceEmbodimentMediaReducerInput.botOutputInactiveAtMs || this.workingEntryDwellMs != voiceEmbodimentMediaReducerInput.workingEntryDwellMs || this.outputTailHoldMs != voiceEmbodimentMediaReducerInput.outputTailHoldMs) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoiceEmbodimentMediaReducerInput copy$default(VoiceEmbodimentMediaReducerInput voiceEmbodimentMediaReducerInput, AgentActivityStatus agentActivityStatus, long j, EmbodimentClip embodimentClip, EmbodimentClip embodimentClip2, boolean z, boolean z2, VoiceEmbodimentPaintedFlags voiceEmbodimentPaintedFlags, boolean z3, boolean z4, boolean z5, boolean z6, long j2, long j3, long j4, long j5, int i, Object obj) {
        AgentActivityStatus agentActivityStatus2 = agentActivityStatus;
        long j6 = j;
        EmbodimentClip embodimentClip3 = embodimentClip;
        EmbodimentClip embodimentClip4 = embodimentClip2;
        boolean z7 = z;
        boolean z8 = z2;
        VoiceEmbodimentPaintedFlags voiceEmbodimentPaintedFlags2 = voiceEmbodimentPaintedFlags;
        boolean z9 = z3;
        boolean z10 = z4;
        boolean z11 = z5;
        boolean z12 = z6;
        long j7 = j2;
        long j8 = j3;
        long j9 = j4;
        long j10 = j5;
        if ((i & 1) != 0) {
            agentActivityStatus2 = voiceEmbodimentMediaReducerInput.activityStatus;
        }
        if ((i & 2) != 0) {
            j6 = voiceEmbodimentMediaReducerInput.elapsedRealtimeMs;
        }
        if ((i & 4) != 0) {
            embodimentClip3 = voiceEmbodimentMediaReducerInput.activityClip;
        }
        if ((i & 8) != 0) {
            embodimentClip4 = voiceEmbodimentMediaReducerInput.generatedIdleClip;
        }
        if ((i & 16) != 0) {
            z7 = voiceEmbodimentMediaReducerInput.lifecycleResumed;
        }
        if ((i & 32) != 0) {
            z8 = voiceEmbodimentMediaReducerInput.stillAvailable;
        }
        if ((i & 64) != 0) {
            voiceEmbodimentPaintedFlags2 = voiceEmbodimentMediaReducerInput.paintedFlags;
        }
        if ((i & 128) != 0) {
            z9 = voiceEmbodimentMediaReducerInput.liveRtcEnabled;
        }
        if ((i & 256) != 0) {
            z10 = voiceEmbodimentMediaReducerInput.videoStateSwapEnabled;
        }
        if ((i & 512) != 0) {
            z11 = voiceEmbodimentMediaReducerInput.isBotSpeaking;
        }
        if ((i & 1024) != 0) {
            z12 = voiceEmbodimentMediaReducerInput.isBotOutputActive;
        }
        if ((i & 2048) != 0) {
            j7 = voiceEmbodimentMediaReducerInput.botOutputActivityGeneration;
        }
        if ((i & 4096) != 0) {
            j8 = voiceEmbodimentMediaReducerInput.botOutputInactiveAtMs;
        }
        if ((i & 8192) != 0) {
            j9 = voiceEmbodimentMediaReducerInput.workingEntryDwellMs;
        }
        if ((i & 16384) != 0) {
            j10 = voiceEmbodimentMediaReducerInput.outputTailHoldMs;
        }
        VoiceEmbodimentPaintedFlags voiceEmbodimentPaintedFlags3 = voiceEmbodimentPaintedFlags2;
        boolean z13 = z9;
        return voiceEmbodimentMediaReducerInput.copy(agentActivityStatus2, j6, embodimentClip3, embodimentClip4, z7, z8, voiceEmbodimentPaintedFlags3, z13, z10, z11, z12, j7, j8, j9, j10);
    }

    public final AgentActivityStatus component1() {
        return this.activityStatus;
    }

    public final boolean component10() {
        return this.isBotSpeaking;
    }

    public final boolean component11() {
        return this.isBotOutputActive;
    }

    public final long component12() {
        return this.botOutputActivityGeneration;
    }

    public final long component13() {
        return this.botOutputInactiveAtMs;
    }

    public final long component14() {
        return this.workingEntryDwellMs;
    }

    public final long component15() {
        return this.outputTailHoldMs;
    }

    public final long component2() {
        return this.elapsedRealtimeMs;
    }

    public final EmbodimentClip component3() {
        return this.activityClip;
    }

    public final EmbodimentClip component4() {
        return this.generatedIdleClip;
    }

    public final boolean component5() {
        return this.lifecycleResumed;
    }

    public final boolean component6() {
        return this.stillAvailable;
    }

    public final VoiceEmbodimentPaintedFlags component7() {
        return this.paintedFlags;
    }

    public final boolean component8() {
        return this.liveRtcEnabled;
    }

    public final boolean component9() {
        return this.videoStateSwapEnabled;
    }

    public final EmbodimentClip getActivityClip() {
        return this.activityClip;
    }

    public final AgentActivityStatus getActivityStatus() {
        return this.activityStatus;
    }

    public final long getBotOutputActivityGeneration() {
        return this.botOutputActivityGeneration;
    }

    public final long getBotOutputInactiveAtMs() {
        return this.botOutputInactiveAtMs;
    }

    public final long getElapsedRealtimeMs() {
        return this.elapsedRealtimeMs;
    }

    public final EmbodimentClip getGeneratedIdleClip() {
        return this.generatedIdleClip;
    }

    public final boolean getLifecycleResumed() {
        return this.lifecycleResumed;
    }

    public final boolean getLiveRtcEnabled() {
        return this.liveRtcEnabled;
    }

    public final long getOutputTailHoldMs() {
        return this.outputTailHoldMs;
    }

    public final VoiceEmbodimentPaintedFlags getPaintedFlags() {
        return this.paintedFlags;
    }

    public final boolean getStillAvailable() {
        return this.stillAvailable;
    }

    public final boolean getVideoStateSwapEnabled() {
        return this.videoStateSwapEnabled;
    }

    public final long getWorkingEntryDwellMs() {
        return this.workingEntryDwellMs;
    }

    public int hashCode() {
        return C8j4.A0B(this.outputTailHoldMs, AnonymousClass006.A06(this.workingEntryDwellMs, AnonymousClass006.A06(this.botOutputInactiveAtMs, AnonymousClass006.A06(this.botOutputActivityGeneration, C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.paintedFlags, C0KA.A01(C0KA.A01((((AnonymousClass006.A06(this.elapsedRealtimeMs, AnonymousClass005.A0E(this.activityStatus)) + AnonymousClass006.A0D(this.activityClip)) * 31) + C3cH.A02(this.generatedIdleClip)) * 31, this.lifecycleResumed), this.stillAvailable)), this.liveRtcEnabled), this.videoStateSwapEnabled), this.isBotSpeaking), this.isBotOutputActive)))));
    }

    public final boolean isBotOutputActive() {
        return this.isBotOutputActive;
    }

    public final boolean isBotSpeaking() {
        return this.isBotSpeaking;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceEmbodimentMediaReducerInput(AgentActivityStatus agentActivityStatus, long j, EmbodimentClip embodimentClip, EmbodimentClip embodimentClip2, boolean z, boolean z2, VoiceEmbodimentPaintedFlags voiceEmbodimentPaintedFlags, boolean z3, boolean z4, boolean z5, boolean z6, long j2, long j3, long j4, long j5, int i, C06H c06h) {
        this(agentActivityStatus, j, embodimentClip, embodimentClip2, z, z2, voiceEmbodimentPaintedFlags, C60Q.A1Q(i & 128, z3), C3cG.A1K(i & 256, z4), C3cG.A1K(i & 512, z5), C3cG.A1K(i & 1024, z6), C3cH.A03(i & 2048, j2), C3cH.A03(i & 4096, j3), C3cH.A03(i & 8192, j4), C3cH.A03(i & 16384, j5));
    }
}
