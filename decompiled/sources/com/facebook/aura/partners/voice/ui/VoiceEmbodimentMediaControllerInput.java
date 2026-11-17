package com.facebook.aura.partners.voice.ui;

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
public final class VoiceEmbodimentMediaControllerInput extends C06G {
    public static final int $stable = 8;
    public final EmbodimentClip activityClip;
    public final boolean activityCoverReady;
    public final AgentActivityStatus activityStatus;
    public final long botOutputActivityGeneration;
    public final long botOutputInactiveAtMs;
    public final EmbodimentClip generatedIdleClip;
    public final boolean isBotOutputActive;
    public final boolean isBotSpeaking;
    public final boolean liveRtcEnabled;
    public final long outputTailHoldMs;
    public final boolean rtcEverPaintedInCall;
    public final boolean rtcFullyOpaque;
    public final boolean rtcReady;
    public final boolean stillFullyOpaque;
    public final String stillKey;
    public final boolean videoStateSwapEnabled;
    public final long workingEntryDwellMs;

    public final VoiceEmbodimentMediaControllerInput copy(AgentActivityStatus agentActivityStatus, EmbodimentClip embodimentClip, EmbodimentClip embodimentClip2, boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, long j, long j2, long j3, long j4) {
        C7384Etj.A0Y(agentActivityStatus, 0);
        return new VoiceEmbodimentMediaControllerInput(agentActivityStatus, embodimentClip, embodimentClip2, z, z2, str, z3, z4, z5, z6, z7, z8, z9, j, j2, j3, j4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceEmbodimentMediaControllerInput) {
                VoiceEmbodimentMediaControllerInput voiceEmbodimentMediaControllerInput = (VoiceEmbodimentMediaControllerInput) obj;
                if (this.activityStatus != voiceEmbodimentMediaControllerInput.activityStatus || !C7384Etj.areEqual(this.activityClip, voiceEmbodimentMediaControllerInput.activityClip) || !C7384Etj.areEqual(this.generatedIdleClip, voiceEmbodimentMediaControllerInput.generatedIdleClip) || this.rtcReady != voiceEmbodimentMediaControllerInput.rtcReady || this.rtcEverPaintedInCall != voiceEmbodimentMediaControllerInput.rtcEverPaintedInCall || !C7384Etj.areEqual(this.stillKey, voiceEmbodimentMediaControllerInput.stillKey) || this.rtcFullyOpaque != voiceEmbodimentMediaControllerInput.rtcFullyOpaque || this.stillFullyOpaque != voiceEmbodimentMediaControllerInput.stillFullyOpaque || this.activityCoverReady != voiceEmbodimentMediaControllerInput.activityCoverReady || this.videoStateSwapEnabled != voiceEmbodimentMediaControllerInput.videoStateSwapEnabled || this.liveRtcEnabled != voiceEmbodimentMediaControllerInput.liveRtcEnabled || this.isBotSpeaking != voiceEmbodimentMediaControllerInput.isBotSpeaking || this.isBotOutputActive != voiceEmbodimentMediaControllerInput.isBotOutputActive || this.botOutputActivityGeneration != voiceEmbodimentMediaControllerInput.botOutputActivityGeneration || this.botOutputInactiveAtMs != voiceEmbodimentMediaControllerInput.botOutputInactiveAtMs || this.workingEntryDwellMs != voiceEmbodimentMediaControllerInput.workingEntryDwellMs || this.outputTailHoldMs != voiceEmbodimentMediaControllerInput.outputTailHoldMs) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ VoiceEmbodimentMediaControllerInput(AgentActivityStatus agentActivityStatus, EmbodimentClip embodimentClip, EmbodimentClip embodimentClip2, boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, long j, long j2, long j3, long j4, int i, C06H c06h) {
        this(agentActivityStatus, embodimentClip, embodimentClip2, z, z2, str, z3, z4, C3cG.A1K(i & 256, z5), C3cG.A1K(i & 512, z6), C60Q.A1Q(i & 1024, z7), C3cG.A1K(i & 2048, z8), C3cG.A1K(i & 4096, z9), C3cH.A03(i & 8192, j), C3cH.A03(i & 16384, j2), C3cH.A03(32768 & i, j3), C3cH.A03(i & 65536, j4));
    }

    public static /* synthetic */ VoiceEmbodimentMediaControllerInput copy$default(VoiceEmbodimentMediaControllerInput voiceEmbodimentMediaControllerInput, AgentActivityStatus agentActivityStatus, EmbodimentClip embodimentClip, EmbodimentClip embodimentClip2, boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, long j, long j2, long j3, long j4, int i, Object obj) {
        AgentActivityStatus agentActivityStatus2 = agentActivityStatus;
        EmbodimentClip embodimentClip3 = embodimentClip;
        EmbodimentClip embodimentClip4 = embodimentClip2;
        boolean z10 = z;
        boolean z11 = z2;
        String str2 = str;
        boolean z12 = z3;
        boolean z13 = z4;
        boolean z14 = z5;
        boolean z15 = z6;
        boolean z16 = z7;
        boolean z17 = z8;
        boolean z18 = z9;
        long j5 = j;
        long j6 = j2;
        long j7 = j3;
        long j8 = j4;
        if ((i & 1) != 0) {
            agentActivityStatus2 = voiceEmbodimentMediaControllerInput.activityStatus;
        }
        if ((i & 2) != 0) {
            embodimentClip3 = voiceEmbodimentMediaControllerInput.activityClip;
        }
        if ((i & 4) != 0) {
            embodimentClip4 = voiceEmbodimentMediaControllerInput.generatedIdleClip;
        }
        if ((i & 8) != 0) {
            z10 = voiceEmbodimentMediaControllerInput.rtcReady;
        }
        if ((i & 16) != 0) {
            z11 = voiceEmbodimentMediaControllerInput.rtcEverPaintedInCall;
        }
        if ((i & 32) != 0) {
            str2 = voiceEmbodimentMediaControllerInput.stillKey;
        }
        if ((i & 64) != 0) {
            z12 = voiceEmbodimentMediaControllerInput.rtcFullyOpaque;
        }
        if ((i & 128) != 0) {
            z13 = voiceEmbodimentMediaControllerInput.stillFullyOpaque;
        }
        if ((i & 256) != 0) {
            z14 = voiceEmbodimentMediaControllerInput.activityCoverReady;
        }
        if ((i & 512) != 0) {
            z15 = voiceEmbodimentMediaControllerInput.videoStateSwapEnabled;
        }
        if ((i & 1024) != 0) {
            z16 = voiceEmbodimentMediaControllerInput.liveRtcEnabled;
        }
        if ((i & 2048) != 0) {
            z17 = voiceEmbodimentMediaControllerInput.isBotSpeaking;
        }
        if ((i & 4096) != 0) {
            z18 = voiceEmbodimentMediaControllerInput.isBotOutputActive;
        }
        if ((i & 8192) != 0) {
            j5 = voiceEmbodimentMediaControllerInput.botOutputActivityGeneration;
        }
        if ((i & 16384) != 0) {
            j6 = voiceEmbodimentMediaControllerInput.botOutputInactiveAtMs;
        }
        if ((i & 32768) != 0) {
            j7 = voiceEmbodimentMediaControllerInput.workingEntryDwellMs;
        }
        if ((i & 65536) != 0) {
            j8 = voiceEmbodimentMediaControllerInput.outputTailHoldMs;
        }
        boolean z19 = z14;
        boolean z20 = z15;
        boolean z21 = z16;
        boolean z22 = z17;
        boolean z23 = z18;
        return voiceEmbodimentMediaControllerInput.copy(agentActivityStatus2, embodimentClip3, embodimentClip4, z10, z11, str2, z12, z13, z19, z20, z21, z22, z23, j5, j6, j7, j8);
    }

    public final AgentActivityStatus component1() {
        return this.activityStatus;
    }

    public final boolean component10() {
        return this.videoStateSwapEnabled;
    }

    public final boolean component11() {
        return this.liveRtcEnabled;
    }

    public final boolean component12() {
        return this.isBotSpeaking;
    }

    public final boolean component13() {
        return this.isBotOutputActive;
    }

    public final long component14() {
        return this.botOutputActivityGeneration;
    }

    public final long component15() {
        return this.botOutputInactiveAtMs;
    }

    public final long component16() {
        return this.workingEntryDwellMs;
    }

    public final long component17() {
        return this.outputTailHoldMs;
    }

    public final EmbodimentClip component2() {
        return this.activityClip;
    }

    public final EmbodimentClip component3() {
        return this.generatedIdleClip;
    }

    public final boolean component4() {
        return this.rtcReady;
    }

    public final boolean component5() {
        return this.rtcEverPaintedInCall;
    }

    public final String component6() {
        return this.stillKey;
    }

    public final boolean component7() {
        return this.rtcFullyOpaque;
    }

    public final boolean component8() {
        return this.stillFullyOpaque;
    }

    public final boolean component9() {
        return this.activityCoverReady;
    }

    public final EmbodimentClip getActivityClip() {
        return this.activityClip;
    }

    public final boolean getActivityCoverReady() {
        return this.activityCoverReady;
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

    public final EmbodimentClip getGeneratedIdleClip() {
        return this.generatedIdleClip;
    }

    public final boolean getLiveRtcEnabled() {
        return this.liveRtcEnabled;
    }

    public final long getOutputTailHoldMs() {
        return this.outputTailHoldMs;
    }

    public final boolean getRtcEverPaintedInCall() {
        return this.rtcEverPaintedInCall;
    }

    public final boolean getRtcFullyOpaque() {
        return this.rtcFullyOpaque;
    }

    public final boolean getRtcReady() {
        return this.rtcReady;
    }

    public final boolean getStillFullyOpaque() {
        return this.stillFullyOpaque;
    }

    public final String getStillKey() {
        return this.stillKey;
    }

    public final boolean getVideoStateSwapEnabled() {
        return this.videoStateSwapEnabled;
    }

    public final long getWorkingEntryDwellMs() {
        return this.workingEntryDwellMs;
    }

    public int hashCode() {
        return C8j4.A0B(this.outputTailHoldMs, AnonymousClass006.A06(this.workingEntryDwellMs, AnonymousClass006.A06(this.botOutputInactiveAtMs, AnonymousClass006.A06(this.botOutputActivityGeneration, C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01((C0KA.A01(C0KA.A01((((AnonymousClass005.A0E(this.activityStatus) + AnonymousClass006.A0D(this.activityClip)) * 31) + AnonymousClass006.A0D(this.generatedIdleClip)) * 31, this.rtcReady), this.rtcEverPaintedInCall) + AnonymousClass005.A0H(this.stillKey)) * 31, this.rtcFullyOpaque), this.stillFullyOpaque), this.activityCoverReady), this.videoStateSwapEnabled), this.liveRtcEnabled), this.isBotSpeaking), this.isBotOutputActive)))));
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

    public VoiceEmbodimentMediaControllerInput(AgentActivityStatus agentActivityStatus, EmbodimentClip embodimentClip, EmbodimentClip embodimentClip2, boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, long j, long j2, long j3, long j4) {
        C7384Etj.A0Y(agentActivityStatus, 0);
        this.activityStatus = agentActivityStatus;
        this.activityClip = embodimentClip;
        this.generatedIdleClip = embodimentClip2;
        this.rtcReady = z;
        this.rtcEverPaintedInCall = z2;
        this.stillKey = str;
        this.rtcFullyOpaque = z3;
        this.stillFullyOpaque = z4;
        this.activityCoverReady = z5;
        this.videoStateSwapEnabled = z6;
        this.liveRtcEnabled = z7;
        this.isBotSpeaking = z8;
        this.isBotOutputActive = z9;
        this.botOutputActivityGeneration = j;
        this.botOutputInactiveAtMs = j2;
        this.workingEntryDwellMs = j3;
        this.outputTailHoldMs = j4;
    }
}
