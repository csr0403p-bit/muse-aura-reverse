package com.facebook.aura.partners.voice.ui;

import X.A3q;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60Q;
import X.C7384Etj;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import java.util.Set;

/* loaded from: classes4.dex */
public final class VoiceEmbodimentMediaReducerState extends C06G {
    public static final int $stable = 8;
    public final EmbodimentClip activeClip;
    public final int activeClipLoadGeneration;
    public final boolean activeClipReady;
    public final int activeClipRetryCount;
    public final boolean activityCoverCaptureRequested;
    public final long activityObservedAtMs;
    public final boolean activityPresentationSuppressed;
    public final boolean activityQualified;
    public final boolean avatarVideoReady;
    public final boolean botOutputActive;
    public final long botOutputActivityGeneration;
    public final boolean clipSelected;
    public final long clipSelectedAtMs;
    public final Set<String> failedVideoUris;
    public final boolean holdOutgoingActivityClip;
    public final Long nextWakeAtMs;
    public final EmbodimentClipKind observedActivityKind;
    public final Long outputTailEndsAtMs;
    public final VoiceEmbodimentPresentationTarget presentationTarget;
    public final boolean prewarmActivityVideoWhileCovered;
    public final Long prewarmStartedAtMs;
    public final boolean prewarmTimedOut;
    public final EmbodimentClipKind qualifiedActivityKind;
    public final Long replacementCoverWaitStartedAtMs;
    public final boolean retainRtcCoverDuringActivityLoad;
    public final Long retryAtMs;
    public final boolean retryPending;
    public final boolean rtcRenderable;
    public final boolean stillPainted;
    public final EmbodimentClip targetClip;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceEmbodimentMediaReducerState) {
                VoiceEmbodimentMediaReducerState voiceEmbodimentMediaReducerState = (VoiceEmbodimentMediaReducerState) obj;
                if (this.observedActivityKind != voiceEmbodimentMediaReducerState.observedActivityKind || this.activityObservedAtMs != voiceEmbodimentMediaReducerState.activityObservedAtMs || this.qualifiedActivityKind != voiceEmbodimentMediaReducerState.qualifiedActivityKind || this.activityQualified != voiceEmbodimentMediaReducerState.activityQualified || this.botOutputActive != voiceEmbodimentMediaReducerState.botOutputActive || this.botOutputActivityGeneration != voiceEmbodimentMediaReducerState.botOutputActivityGeneration || !C7384Etj.areEqual(this.outputTailEndsAtMs, voiceEmbodimentMediaReducerState.outputTailEndsAtMs) || this.activityPresentationSuppressed != voiceEmbodimentMediaReducerState.activityPresentationSuppressed || !C7384Etj.areEqual(this.activeClip, voiceEmbodimentMediaReducerState.activeClip) || this.activeClipReady != voiceEmbodimentMediaReducerState.activeClipReady || this.avatarVideoReady != voiceEmbodimentMediaReducerState.avatarVideoReady || this.clipSelected != voiceEmbodimentMediaReducerState.clipSelected || this.clipSelectedAtMs != voiceEmbodimentMediaReducerState.clipSelectedAtMs || this.activeClipRetryCount != voiceEmbodimentMediaReducerState.activeClipRetryCount || this.activeClipLoadGeneration != voiceEmbodimentMediaReducerState.activeClipLoadGeneration || this.retryPending != voiceEmbodimentMediaReducerState.retryPending || !C7384Etj.areEqual(this.retryAtMs, voiceEmbodimentMediaReducerState.retryAtMs) || !C7384Etj.areEqual(this.prewarmStartedAtMs, voiceEmbodimentMediaReducerState.prewarmStartedAtMs) || this.prewarmTimedOut != voiceEmbodimentMediaReducerState.prewarmTimedOut || !C7384Etj.areEqual(this.failedVideoUris, voiceEmbodimentMediaReducerState.failedVideoUris) || this.retainRtcCoverDuringActivityLoad != voiceEmbodimentMediaReducerState.retainRtcCoverDuringActivityLoad || !C7384Etj.areEqual(this.replacementCoverWaitStartedAtMs, voiceEmbodimentMediaReducerState.replacementCoverWaitStartedAtMs) || this.activityCoverCaptureRequested != voiceEmbodimentMediaReducerState.activityCoverCaptureRequested || !C7384Etj.areEqual(this.targetClip, voiceEmbodimentMediaReducerState.targetClip) || this.presentationTarget != voiceEmbodimentMediaReducerState.presentationTarget || this.rtcRenderable != voiceEmbodimentMediaReducerState.rtcRenderable || this.stillPainted != voiceEmbodimentMediaReducerState.stillPainted || this.holdOutgoingActivityClip != voiceEmbodimentMediaReducerState.holdOutgoingActivityClip || this.prewarmActivityVideoWhileCovered != voiceEmbodimentMediaReducerState.prewarmActivityVideoWhileCovered || !C7384Etj.areEqual(this.nextWakeAtMs, voiceEmbodimentMediaReducerState.nextWakeAtMs)) {
                }
            }
            return false;
        }
        return true;
    }

    public final EmbodimentClipKind component1() {
        return this.observedActivityKind;
    }

    public final boolean component10() {
        return this.activeClipReady;
    }

    public final boolean component11() {
        return this.avatarVideoReady;
    }

    public final boolean component12() {
        return this.clipSelected;
    }

    public final long component13() {
        return this.clipSelectedAtMs;
    }

    public final int component14() {
        return this.activeClipRetryCount;
    }

    public final int component15() {
        return this.activeClipLoadGeneration;
    }

    public final boolean component16() {
        return this.retryPending;
    }

    public final Long component17() {
        return this.retryAtMs;
    }

    public final Long component18() {
        return this.prewarmStartedAtMs;
    }

    public final boolean component19() {
        return this.prewarmTimedOut;
    }

    public final long component2() {
        return this.activityObservedAtMs;
    }

    public final Set<String> component20() {
        return this.failedVideoUris;
    }

    public final boolean component21() {
        return this.retainRtcCoverDuringActivityLoad;
    }

    public final Long component22() {
        return this.replacementCoverWaitStartedAtMs;
    }

    public final boolean component23() {
        return this.activityCoverCaptureRequested;
    }

    public final EmbodimentClip component24() {
        return this.targetClip;
    }

    public final VoiceEmbodimentPresentationTarget component25() {
        return this.presentationTarget;
    }

    public final boolean component26() {
        return this.rtcRenderable;
    }

    public final boolean component27() {
        return this.stillPainted;
    }

    public final boolean component28() {
        return this.holdOutgoingActivityClip;
    }

    public final boolean component29() {
        return this.prewarmActivityVideoWhileCovered;
    }

    public final EmbodimentClipKind component3() {
        return this.qualifiedActivityKind;
    }

    public final Long component30() {
        return this.nextWakeAtMs;
    }

    public final boolean component4() {
        return this.activityQualified;
    }

    public final boolean component5() {
        return this.botOutputActive;
    }

    public final long component6() {
        return this.botOutputActivityGeneration;
    }

    public final Long component7() {
        return this.outputTailEndsAtMs;
    }

    public final boolean component8() {
        return this.activityPresentationSuppressed;
    }

    public final EmbodimentClip component9() {
        return this.activeClip;
    }

    public final EmbodimentClip getActiveClip() {
        return this.activeClip;
    }

    public final int getActiveClipLoadGeneration() {
        return this.activeClipLoadGeneration;
    }

    public final boolean getActiveClipReady() {
        return this.activeClipReady;
    }

    public final int getActiveClipRetryCount() {
        return this.activeClipRetryCount;
    }

    public final boolean getActivityCoverCaptureRequested() {
        return this.activityCoverCaptureRequested;
    }

    public final long getActivityObservedAtMs() {
        return this.activityObservedAtMs;
    }

    public final boolean getActivityPresentationSuppressed() {
        return this.activityPresentationSuppressed;
    }

    public final boolean getActivityQualified() {
        return this.activityQualified;
    }

    public final boolean getAvatarVideoReady() {
        return this.avatarVideoReady;
    }

    public final boolean getBotOutputActive() {
        return this.botOutputActive;
    }

    public final long getBotOutputActivityGeneration() {
        return this.botOutputActivityGeneration;
    }

    public final boolean getClipSelected() {
        return this.clipSelected;
    }

    public final long getClipSelectedAtMs() {
        return this.clipSelectedAtMs;
    }

    public final Set<String> getFailedVideoUris() {
        return this.failedVideoUris;
    }

    public final boolean getHoldOutgoingActivityClip() {
        return this.holdOutgoingActivityClip;
    }

    public final Long getNextWakeAtMs() {
        return this.nextWakeAtMs;
    }

    public final EmbodimentClipKind getObservedActivityKind() {
        return this.observedActivityKind;
    }

    public final Long getOutputTailEndsAtMs() {
        return this.outputTailEndsAtMs;
    }

    public final VoiceEmbodimentPresentationTarget getPresentationTarget() {
        return this.presentationTarget;
    }

    public final boolean getPrewarmActivityVideoWhileCovered() {
        return this.prewarmActivityVideoWhileCovered;
    }

    public final Long getPrewarmStartedAtMs() {
        return this.prewarmStartedAtMs;
    }

    public final boolean getPrewarmTimedOut() {
        return this.prewarmTimedOut;
    }

    public final EmbodimentClipKind getQualifiedActivityKind() {
        return this.qualifiedActivityKind;
    }

    public final Long getReplacementCoverWaitStartedAtMs() {
        return this.replacementCoverWaitStartedAtMs;
    }

    public final boolean getRetainRtcCoverDuringActivityLoad() {
        return this.retainRtcCoverDuringActivityLoad;
    }

    public final Long getRetryAtMs() {
        return this.retryAtMs;
    }

    public final boolean getRetryPending() {
        return this.retryPending;
    }

    public final boolean getRtcRenderable() {
        return this.rtcRenderable;
    }

    public final boolean getStillPainted() {
        return this.stillPainted;
    }

    public final EmbodimentClip getTargetClip() {
        return this.targetClip;
    }

    public int hashCode() {
        return C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.presentationTarget, (C0KA.A01((C0KA.A01(AnonymousClass005.A0F(this.failedVideoUris, C0KA.A01((((C0KA.A01((((AnonymousClass006.A06(this.clipSelectedAtMs, C0KA.A01(C0KA.A01(C0KA.A01((C0KA.A01((AnonymousClass006.A06(this.botOutputActivityGeneration, C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.qualifiedActivityKind, AnonymousClass006.A06(this.activityObservedAtMs, AnonymousClass005.A0E(this.observedActivityKind))), this.activityQualified), this.botOutputActive)) + AnonymousClass006.A0D(this.outputTailEndsAtMs)) * 31, this.activityPresentationSuppressed) + AnonymousClass006.A0D(this.activeClip)) * 31, this.activeClipReady), this.avatarVideoReady), this.clipSelected)) + this.activeClipRetryCount) * 31) + this.activeClipLoadGeneration) * 31, this.retryPending) + AnonymousClass006.A0D(this.retryAtMs)) * 31) + AnonymousClass006.A0D(this.prewarmStartedAtMs)) * 31, this.prewarmTimedOut)), this.retainRtcCoverDuringActivityLoad) + AnonymousClass006.A0D(this.replacementCoverWaitStartedAtMs)) * 31, this.activityCoverCaptureRequested) + AnonymousClass006.A0D(this.targetClip)) * 31), this.rtcRenderable), this.stillPainted), this.holdOutgoingActivityClip), this.prewarmActivityVideoWhileCovered) + C3cH.A02(this.nextWakeAtMs);
    }

    public final VoiceEmbodimentMediaReducerState copy(EmbodimentClipKind embodimentClipKind, long j, EmbodimentClipKind embodimentClipKind2, boolean z, boolean z2, long j2, Long l, boolean z3, EmbodimentClip embodimentClip, boolean z4, boolean z5, boolean z6, long j3, int i, int i2, boolean z7, Long l2, Long l3, boolean z8, Set<String> set, boolean z9, Long l4, boolean z10, EmbodimentClip embodimentClip2, VoiceEmbodimentPresentationTarget voiceEmbodimentPresentationTarget, boolean z11, boolean z12, boolean z13, boolean z14, Long l5) {
        AnonymousClass003.A0v(embodimentClipKind, embodimentClipKind2);
        C7384Etj.A0Y(set, 19);
        C7384Etj.A0Y(voiceEmbodimentPresentationTarget, 24);
        return new VoiceEmbodimentMediaReducerState(embodimentClipKind, j, embodimentClipKind2, z, z2, j2, l, z3, embodimentClip, z4, z5, z6, j3, i, i2, z7, l2, l3, z8, set, z9, l4, z10, embodimentClip2, voiceEmbodimentPresentationTarget, z11, z12, z13, z14, l5);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceEmbodimentMediaReducerState(EmbodimentClipKind embodimentClipKind, long j, EmbodimentClipKind embodimentClipKind2, boolean z, boolean z2, long j2, Long l, boolean z3, EmbodimentClip embodimentClip, boolean z4, boolean z5, boolean z6, long j3, int i, int i2, boolean z7, Long l2, Long l3, boolean z8, Set set, boolean z9, Long l4, boolean z10, EmbodimentClip embodimentClip2, VoiceEmbodimentPresentationTarget voiceEmbodimentPresentationTarget, boolean z11, boolean z12, boolean z13, boolean z14, Long l5, int i3, C06H c06h) {
        this((i3 & 1) != 0 ? EmbodimentClipKind.NONE : embodimentClipKind, C3cH.A03(i3 & 2, j), (i3 & 4) != 0 ? EmbodimentClipKind.NONE : embodimentClipKind2, C60Q.A1Q(i3 & 8, z), C3cI.A1S(i3, z2), C3cH.A03(i3 & 32, j2), (i3 & 64) != 0 ? null : l, C3cH.A1N(i3, z3), (i3 & 256) != 0 ? null : embodimentClip, C3cG.A1K(i3 & 512, z4), C3cG.A1K(i3 & 1024, z5), C3cG.A1K(i3 & 2048, z6), C3cH.A03(i3 & 4096, j3), (i3 & 8192) != 0 ? 0 : i, (i3 & 16384) != 0 ? 0 : i2, C3cH.A1L(i3, 32768, z7), (i3 & 65536) != 0 ? null : l2, (i3 & 131072) != 0 ? null : l3, C3cH.A1L(i3, 262144, z8), (i3 & 524288) != 0 ? A3q.A00 : set, C3cH.A1L(i3, 1048576, z9), (i3 & 2097152) != 0 ? null : l4, C3cH.A1L(i3, 4194304, z10), (i3 & 8388608) != 0 ? null : embodimentClip2, (i3 & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0 ? VoiceEmbodimentPresentationTarget.FALLBACK : voiceEmbodimentPresentationTarget, C3cH.A1L(i3, 33554432, z11), C3cH.A1L(i3, 67108864, z12), C3cH.A1L(i3, 134217728, z13), C3cH.A1L(i3, 268435456, z14), (i3 & 536870912) != 0 ? null : l5);
    }

    public static /* synthetic */ VoiceEmbodimentMediaReducerState copy$default(VoiceEmbodimentMediaReducerState voiceEmbodimentMediaReducerState, EmbodimentClipKind embodimentClipKind, long j, EmbodimentClipKind embodimentClipKind2, boolean z, boolean z2, long j2, Long l, boolean z3, EmbodimentClip embodimentClip, boolean z4, boolean z5, boolean z6, long j3, int i, int i2, boolean z7, Long l2, Long l3, boolean z8, Set set, boolean z9, Long l4, boolean z10, EmbodimentClip embodimentClip2, VoiceEmbodimentPresentationTarget voiceEmbodimentPresentationTarget, boolean z11, boolean z12, boolean z13, boolean z14, Long l5, int i3, Object obj) {
        long j4 = j;
        EmbodimentClipKind embodimentClipKind3 = embodimentClipKind2;
        boolean z15 = z;
        boolean z16 = z2;
        long j5 = j2;
        Long l6 = l;
        boolean z17 = z3;
        EmbodimentClip embodimentClip3 = embodimentClip;
        boolean z18 = z4;
        boolean z19 = z5;
        boolean z20 = z6;
        EmbodimentClipKind embodimentClipKind4 = embodimentClipKind;
        long j6 = j3;
        int i4 = i;
        int i5 = i2;
        boolean z21 = z7;
        boolean z22 = z11;
        boolean z23 = z12;
        boolean z24 = z13;
        boolean z25 = z14;
        Long l7 = l2;
        Long l8 = l3;
        boolean z26 = z8;
        Set set2 = set;
        boolean z27 = z9;
        Long l9 = l4;
        boolean z28 = z10;
        EmbodimentClip embodimentClip4 = embodimentClip2;
        VoiceEmbodimentPresentationTarget voiceEmbodimentPresentationTarget2 = voiceEmbodimentPresentationTarget;
        Long l10 = l5;
        if ((i3 & 1) != 0) {
            embodimentClipKind4 = voiceEmbodimentMediaReducerState.observedActivityKind;
        }
        if ((i3 & 2) != 0) {
            j4 = voiceEmbodimentMediaReducerState.activityObservedAtMs;
        }
        if ((i3 & 4) != 0) {
            embodimentClipKind3 = voiceEmbodimentMediaReducerState.qualifiedActivityKind;
        }
        if ((i3 & 8) != 0) {
            z15 = voiceEmbodimentMediaReducerState.activityQualified;
        }
        if ((i3 & 16) != 0) {
            z16 = voiceEmbodimentMediaReducerState.botOutputActive;
        }
        if ((i3 & 32) != 0) {
            j5 = voiceEmbodimentMediaReducerState.botOutputActivityGeneration;
        }
        if ((i3 & 64) != 0) {
            l6 = voiceEmbodimentMediaReducerState.outputTailEndsAtMs;
        }
        if ((i3 & 128) != 0) {
            z17 = voiceEmbodimentMediaReducerState.activityPresentationSuppressed;
        }
        if ((i3 & 256) != 0) {
            embodimentClip3 = voiceEmbodimentMediaReducerState.activeClip;
        }
        if ((i3 & 512) != 0) {
            z18 = voiceEmbodimentMediaReducerState.activeClipReady;
        }
        if ((i3 & 1024) != 0) {
            z19 = voiceEmbodimentMediaReducerState.avatarVideoReady;
        }
        if ((i3 & 2048) != 0) {
            z20 = voiceEmbodimentMediaReducerState.clipSelected;
        }
        if ((i3 & 4096) != 0) {
            j6 = voiceEmbodimentMediaReducerState.clipSelectedAtMs;
        }
        if ((i3 & 8192) != 0) {
            i4 = voiceEmbodimentMediaReducerState.activeClipRetryCount;
        }
        if ((i3 & 16384) != 0) {
            i5 = voiceEmbodimentMediaReducerState.activeClipLoadGeneration;
        }
        if ((32768 & i3) != 0) {
            z21 = voiceEmbodimentMediaReducerState.retryPending;
        }
        if ((i3 & 65536) != 0) {
            l7 = voiceEmbodimentMediaReducerState.retryAtMs;
        }
        if ((i3 & 131072) != 0) {
            l8 = voiceEmbodimentMediaReducerState.prewarmStartedAtMs;
        }
        if ((i3 & 262144) != 0) {
            z26 = voiceEmbodimentMediaReducerState.prewarmTimedOut;
        }
        if ((i3 & 524288) != 0) {
            set2 = voiceEmbodimentMediaReducerState.failedVideoUris;
        }
        if ((i3 & 1048576) != 0) {
            z27 = voiceEmbodimentMediaReducerState.retainRtcCoverDuringActivityLoad;
        }
        if ((i3 & 2097152) != 0) {
            l9 = voiceEmbodimentMediaReducerState.replacementCoverWaitStartedAtMs;
        }
        if ((i3 & 4194304) != 0) {
            z28 = voiceEmbodimentMediaReducerState.activityCoverCaptureRequested;
        }
        if ((i3 & 8388608) != 0) {
            embodimentClip4 = voiceEmbodimentMediaReducerState.targetClip;
        }
        if ((i3 & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            voiceEmbodimentPresentationTarget2 = voiceEmbodimentMediaReducerState.presentationTarget;
        }
        if ((i3 & 33554432) != 0) {
            z22 = voiceEmbodimentMediaReducerState.rtcRenderable;
        }
        if ((i3 & 67108864) != 0) {
            z23 = voiceEmbodimentMediaReducerState.stillPainted;
        }
        if ((i3 & 134217728) != 0) {
            z24 = voiceEmbodimentMediaReducerState.holdOutgoingActivityClip;
        }
        if ((i3 & 268435456) != 0) {
            z25 = voiceEmbodimentMediaReducerState.prewarmActivityVideoWhileCovered;
        }
        if ((i3 & 536870912) != 0) {
            l10 = voiceEmbodimentMediaReducerState.nextWakeAtMs;
        }
        return voiceEmbodimentMediaReducerState.copy(embodimentClipKind4, j4, embodimentClipKind3, z15, z16, j5, l6, z17, embodimentClip3, z18, z19, z20, j6, i4, i5, z21, l7, l8, z26, set2, z27, l9, z28, embodimentClip4, voiceEmbodimentPresentationTarget2, z22, z23, z24, z25, l10);
    }

    public VoiceEmbodimentMediaReducerState(EmbodimentClipKind embodimentClipKind, long j, EmbodimentClipKind embodimentClipKind2, boolean z, boolean z2, long j2, Long l, boolean z3, EmbodimentClip embodimentClip, boolean z4, boolean z5, boolean z6, long j3, int i, int i2, boolean z7, Long l2, Long l3, boolean z8, Set<String> set, boolean z9, Long l4, boolean z10, EmbodimentClip embodimentClip2, VoiceEmbodimentPresentationTarget voiceEmbodimentPresentationTarget, boolean z11, boolean z12, boolean z13, boolean z14, Long l5) {
        AnonymousClass003.A0v(embodimentClipKind, embodimentClipKind2);
        C7384Etj.A0Y(set, 19);
        C7384Etj.A0Y(voiceEmbodimentPresentationTarget, 24);
        this.observedActivityKind = embodimentClipKind;
        this.activityObservedAtMs = j;
        this.qualifiedActivityKind = embodimentClipKind2;
        this.activityQualified = z;
        this.botOutputActive = z2;
        this.botOutputActivityGeneration = j2;
        this.outputTailEndsAtMs = l;
        this.activityPresentationSuppressed = z3;
        this.activeClip = embodimentClip;
        this.activeClipReady = z4;
        this.avatarVideoReady = z5;
        this.clipSelected = z6;
        this.clipSelectedAtMs = j3;
        this.activeClipRetryCount = i;
        this.activeClipLoadGeneration = i2;
        this.retryPending = z7;
        this.retryAtMs = l2;
        this.prewarmStartedAtMs = l3;
        this.prewarmTimedOut = z8;
        this.failedVideoUris = set;
        this.retainRtcCoverDuringActivityLoad = z9;
        this.replacementCoverWaitStartedAtMs = l4;
        this.activityCoverCaptureRequested = z10;
        this.targetClip = embodimentClip2;
        this.presentationTarget = voiceEmbodimentPresentationTarget;
        this.rtcRenderable = z11;
        this.stillPainted = z12;
        this.holdOutgoingActivityClip = z13;
        this.prewarmActivityVideoWhileCovered = z14;
        this.nextWakeAtMs = l5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VoiceEmbodimentMediaReducerState() {
        EmbodimentClipKind embodimentClipKind = EmbodimentClipKind.NONE;
        this(embodimentClipKind, 0L, embodimentClipKind, true, false, 0L, null, false, null, false, false, false, 0L, 0, 0, false, null, null, false, A3q.A00, false, null, false, null, VoiceEmbodimentPresentationTarget.FALLBACK, false, false, false, false, null);
    }
}
