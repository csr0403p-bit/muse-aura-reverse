package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import com.facebook.aura.model.AgentActivityStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$EmbodimentMediaControllerInputEffect$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ EmbodimentClip $activityClip;
    public final /* synthetic */ boolean $activityCoverReady;
    public final /* synthetic */ AgentActivityStatus $agentActivityStatus;
    public final /* synthetic */ long $botOutputActivityGeneration;
    public final /* synthetic */ long $botOutputInactiveAtMs;
    public final /* synthetic */ VoiceEmbodimentMediaController $controller;
    public final /* synthetic */ EmbodimentClip $generatedIdleClip;
    public final /* synthetic */ boolean $hasLiveRtc;
    public final /* synthetic */ boolean $isBotOutputActive;
    public final /* synthetic */ boolean $isBotSpeaking;
    public final /* synthetic */ boolean $liveRtcEnabled;
    public final /* synthetic */ boolean $liveRtcReady;
    public final /* synthetic */ long $outputTailHoldMs;
    public final /* synthetic */ boolean $rtcCovering;
    public final /* synthetic */ boolean $rtcEverPaintedInCall;
    public final /* synthetic */ boolean $stillCovering;
    public final /* synthetic */ String $stillKey;
    public final /* synthetic */ boolean $videoStateSwapEnabled;
    public final /* synthetic */ long $workingEntryDwellMs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentMediaKt$EmbodimentMediaControllerInputEffect$1$1(VoiceEmbodimentMediaController voiceEmbodimentMediaController, boolean z, boolean z2, AgentActivityStatus agentActivityStatus, EmbodimentClip embodimentClip, EmbodimentClip embodimentClip2, boolean z3, String str, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, long j, long j2, long j3, long j4) {
        super(0);
        this.$controller = voiceEmbodimentMediaController;
        this.$hasLiveRtc = z;
        this.$liveRtcReady = z2;
        this.$agentActivityStatus = agentActivityStatus;
        this.$activityClip = embodimentClip;
        this.$generatedIdleClip = embodimentClip2;
        this.$rtcEverPaintedInCall = z3;
        this.$stillKey = str;
        this.$rtcCovering = z4;
        this.$stillCovering = z5;
        this.$activityCoverReady = z6;
        this.$videoStateSwapEnabled = z7;
        this.$liveRtcEnabled = z8;
        this.$isBotSpeaking = z9;
        this.$isBotOutputActive = z10;
        this.$botOutputActivityGeneration = j;
        this.$botOutputInactiveAtMs = j2;
        this.$workingEntryDwellMs = j3;
        this.$outputTailHoldMs = j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2() {
        /*
            r36 = this;
            r1 = r36
            com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaController r14 = r1.$controller
            boolean r0 = r1.$hasLiveRtc
            if (r0 == 0) goto Le
            boolean r0 = r1.$liveRtcReady
            r19 = 1
            if (r0 != 0) goto L10
        Le:
            r19 = 0
        L10:
            com.facebook.aura.model.AgentActivityStatus r0 = r1.$agentActivityStatus
            r16 = r0
            com.facebook.aura.partners.voice.ui.EmbodimentClip r0 = r1.$activityClip
            r17 = r0
            com.facebook.aura.partners.voice.ui.EmbodimentClip r0 = r1.$generatedIdleClip
            r18 = r0
            boolean r0 = r1.$rtcEverPaintedInCall
            r20 = r0
            java.lang.String r0 = r1.$stillKey
            r21 = r0
            boolean r0 = r1.$rtcCovering
            r22 = r0
            boolean r15 = r1.$stillCovering
            boolean r13 = r1.$activityCoverReady
            boolean r12 = r1.$videoStateSwapEnabled
            boolean r11 = r1.$liveRtcEnabled
            boolean r10 = r1.$isBotSpeaking
            boolean r9 = r1.$isBotOutputActive
            long r7 = r1.$botOutputActivityGeneration
            long r5 = r1.$botOutputInactiveAtMs
            long r3 = r1.$workingEntryDwellMs
            long r1 = r1.$outputTailHoldMs
            com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaControllerInput r0 = new com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaControllerInput
            r31 = r5
            r33 = r3
            r35 = r1
            r23 = r15
            r24 = r13
            r25 = r12
            r26 = r11
            r27 = r10
            r28 = r9
            r29 = r7
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r35)
            r14.updateInput(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt$EmbodimentMediaControllerInputEffect$1$1.invoke2():void");
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
