package com.facebook.rsys.log.gen;

import X.AbstractC7609F5w;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV7;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8925Fth;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class CallSummaryInfo {
    public static G50<CallSummaryInfo> CONVERTER = C8925Fth.A00(40);
    public static long sMcfTypeId;
    public final Long autoRejoinCount;
    public final Long autoRejoinSuccessfulCount;
    public final Long batteryEndLevel;
    public final Long batteryStartLevel;
    public final long callAnsweredTime;
    public final long callConnectedTime;
    public final long callCreatedTime;
    public final long callEndedTime;
    public final String callTrigger;
    public final String clientSessionId;
    public final String coldStartReason;
    public final Long deviceShutdownTime;
    public final String endCallAppState;
    public final String endCallReason;
    public final String endCallSubreason;
    public final Long engineCreatedTime;
    public final Boolean inviteRequestedVideo;
    public final Boolean isAutomation;
    public final boolean isCaller;
    public final Boolean isConnectedEnd;
    public final String joinMode;
    public final Long joinableCompleteTime;
    public final String joiningContext;
    public final long lastUpdatedTime;
    public final String localCallId;
    public final Long localVideoDuration;
    public final Long maxConcurrentConnectedParticipant;
    public final Long mediaGateBlockedFrameCount;
    public final String peerId;
    public final Boolean remoteEnded;
    public final Long remoteVideoDuration;
    public final Long rtcActorId;
    public final String sharedCallId;
    public final Long signalingProtocol;
    public final long steadyTime;
    public final long systemTime;
    public final String videoEscalationStatus;
    public final Boolean wasDeviceCharged;
    public final Boolean wearableAudioEnabled;
    public final Boolean wearableVideoEnabled;
    public final String webDeviceId;
    public final String webrtcVersion;

    public class Builder {
        public Long autoRejoinCount;
        public Long autoRejoinSuccessfulCount;
        public Long batteryEndLevel;
        public Long batteryStartLevel;
        public long callAnsweredTime;
        public long callConnectedTime;
        public long callCreatedTime;
        public long callEndedTime;
        public String callTrigger;
        public String clientSessionId;
        public String coldStartReason;
        public Long deviceShutdownTime;
        public String endCallAppState;
        public String endCallReason;
        public String endCallSubreason;
        public Long engineCreatedTime;
        public Boolean inviteRequestedVideo;
        public Boolean isAutomation;
        public boolean isCaller;
        public Boolean isConnectedEnd;
        public String joinMode;
        public Long joinableCompleteTime;
        public String joiningContext;
        public long lastUpdatedTime;
        public String localCallId;
        public Long localVideoDuration;
        public Long maxConcurrentConnectedParticipant;
        public Long mediaGateBlockedFrameCount;
        public String peerId;
        public Boolean remoteEnded;
        public Long remoteVideoDuration;
        public Long rtcActorId;
        public String sharedCallId;
        public Long signalingProtocol;
        public long steadyTime;
        public long systemTime;
        public String videoEscalationStatus;
        public Boolean wasDeviceCharged;
        public Boolean wearableAudioEnabled;
        public Boolean wearableVideoEnabled;
        public String webDeviceId;
        public String webrtcVersion;

        public CallSummaryInfo build() {
            return new CallSummaryInfo(this);
        }
    }

    public static native CallSummaryInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    /* JADX WARN: Code restructure failed: missing block: B:213:0x022d, code lost:
    
        if (r1.equals(r0) != false) goto L214;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rsys.log.gen.CallSummaryInfo.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((AnonymousClass005.A0I(this.callTrigger, AnonymousClass006.A06(this.lastUpdatedTime, (AnonymousClass006.A06(this.callEndedTime, AnonymousClass006.A06(this.callConnectedTime, AnonymousClass006.A06(this.callAnsweredTime, (AnonymousClass006.A06(this.callCreatedTime, AnonymousClass006.A06(this.steadyTime, AnonymousClass006.A06(this.systemTime, (BV8.A0B(this.localCallId) + AnonymousClass006.A0G(this.sharedCallId)) * 31))) + AnonymousClass006.A0D(this.engineCreatedTime)) * 31))) + AnonymousClass006.A0D(this.joinableCompleteTime)) * 31)) + (this.isCaller ? 1 : 0)) * 31) + AnonymousClass006.A0G(this.peerId)) * 31) + AnonymousClass006.A0G(this.endCallReason)) * 31) + AnonymousClass006.A0D(this.remoteEnded)) * 31) + AnonymousClass006.A0D(this.inviteRequestedVideo)) * 31) + AnonymousClass006.A0D(this.mediaGateBlockedFrameCount)) * 31) + AnonymousClass006.A0G(this.videoEscalationStatus)) * 31) + AnonymousClass006.A0D(this.localVideoDuration)) * 31) + AnonymousClass006.A0D(this.remoteVideoDuration)) * 31) + AnonymousClass006.A0D(this.batteryStartLevel)) * 31) + AnonymousClass006.A0D(this.batteryEndLevel)) * 31) + AnonymousClass006.A0D(this.wasDeviceCharged)) * 31) + AnonymousClass006.A0G(this.joiningContext)) * 31) + AnonymousClass006.A0G(this.webDeviceId)) * 31) + AnonymousClass006.A0G(this.endCallSubreason)) * 31) + AnonymousClass006.A0G(this.coldStartReason)) * 31) + AnonymousClass006.A0D(this.isConnectedEnd)) * 31) + AnonymousClass006.A0D(this.deviceShutdownTime)) * 31) + AnonymousClass006.A0D(this.maxConcurrentConnectedParticipant)) * 31) + AnonymousClass006.A0D(this.rtcActorId)) * 31) + AnonymousClass006.A0D(this.autoRejoinCount)) * 31) + AnonymousClass006.A0G(this.joinMode)) * 31) + AnonymousClass006.A0D(this.autoRejoinSuccessfulCount)) * 31) + AnonymousClass006.A0G(this.webrtcVersion)) * 31) + AnonymousClass006.A0G(this.clientSessionId)) * 31) + AnonymousClass006.A0G(this.endCallAppState)) * 31) + AnonymousClass006.A0D(this.isAutomation)) * 31) + AnonymousClass006.A0D(this.signalingProtocol)) * 31) + AnonymousClass006.A0D(this.wearableAudioEnabled)) * 31) + C3cH.A02(this.wearableVideoEnabled);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("CallSummaryInfo{");
        FGI.A0v("localCallId=", this.localCallId, sbA0x);
        FGI.A0v(",sharedCallId=", this.sharedCallId, sbA0x);
        FGI.A0x(",systemTime=", sbA0x, this.systemTime);
        FGI.A0x(",steadyTime=", sbA0x, this.steadyTime);
        FGI.A0x(",callCreatedTime=", sbA0x, this.callCreatedTime);
        AbstractC7609F5w.A1I(this.engineCreatedTime, C60O.A0x(",engineCreatedTime="), sbA0x);
        FGI.A0x(",callAnsweredTime=", sbA0x, this.callAnsweredTime);
        FGI.A0x(",callConnectedTime=", sbA0x, this.callConnectedTime);
        FGI.A0x(",callEndedTime=", sbA0x, this.callEndedTime);
        AbstractC7609F5w.A1I(this.joinableCompleteTime, C60O.A0x(",joinableCompleteTime="), sbA0x);
        FGI.A0x(",lastUpdatedTime=", sbA0x, this.lastUpdatedTime);
        FGI.A0v(",callTrigger=", this.callTrigger, sbA0x);
        FGI.A0y(",isCaller=", sbA0x, this.isCaller);
        FGI.A0v(",peerId=", this.peerId, sbA0x);
        FGI.A0v(",endCallReason=", this.endCallReason, sbA0x);
        AbstractC7609F5w.A1I(this.remoteEnded, C60O.A0x(",remoteEnded="), sbA0x);
        AbstractC7609F5w.A1I(this.inviteRequestedVideo, C60O.A0x(",inviteRequestedVideo="), sbA0x);
        AbstractC7609F5w.A1I(this.mediaGateBlockedFrameCount, C60O.A0x(",mediaGateBlockedFrameCount="), sbA0x);
        FGI.A0v(",videoEscalationStatus=", this.videoEscalationStatus, sbA0x);
        AbstractC7609F5w.A1I(this.localVideoDuration, C60O.A0x(",localVideoDuration="), sbA0x);
        AbstractC7609F5w.A1I(this.remoteVideoDuration, C60O.A0x(",remoteVideoDuration="), sbA0x);
        AbstractC7609F5w.A1I(this.batteryStartLevel, C60O.A0x(",batteryStartLevel="), sbA0x);
        AbstractC7609F5w.A1I(this.batteryEndLevel, C60O.A0x(",batteryEndLevel="), sbA0x);
        AbstractC7609F5w.A1I(this.wasDeviceCharged, C60O.A0x(",wasDeviceCharged="), sbA0x);
        FGI.A0v(",joiningContext=", this.joiningContext, sbA0x);
        FGI.A0v(",webDeviceId=", this.webDeviceId, sbA0x);
        FGI.A0v(",endCallSubreason=", this.endCallSubreason, sbA0x);
        FGI.A0v(",coldStartReason=", this.coldStartReason, sbA0x);
        AbstractC7609F5w.A1I(this.isConnectedEnd, C60O.A0x(",isConnectedEnd="), sbA0x);
        AbstractC7609F5w.A1I(this.deviceShutdownTime, C60O.A0x(",deviceShutdownTime="), sbA0x);
        AbstractC7609F5w.A1I(this.maxConcurrentConnectedParticipant, C60O.A0x(",maxConcurrentConnectedParticipant="), sbA0x);
        AbstractC7609F5w.A1I(this.rtcActorId, C60O.A0x(",rtcActorId="), sbA0x);
        AbstractC7609F5w.A1I(this.autoRejoinCount, C60O.A0x(",autoRejoinCount="), sbA0x);
        FGI.A0v(",joinMode=", this.joinMode, sbA0x);
        AbstractC7609F5w.A1I(this.autoRejoinSuccessfulCount, C60O.A0x(",autoRejoinSuccessfulCount="), sbA0x);
        FGI.A0v(",webrtcVersion=", this.webrtcVersion, sbA0x);
        FGI.A0v(",clientSessionId=", this.clientSessionId, sbA0x);
        FGI.A0v(",endCallAppState=", this.endCallAppState, sbA0x);
        AbstractC7609F5w.A1I(this.isAutomation, C60O.A0x(",isAutomation="), sbA0x);
        AbstractC7609F5w.A1I(this.signalingProtocol, C60O.A0x(",signalingProtocol="), sbA0x);
        AbstractC7609F5w.A1I(this.wearableAudioEnabled, C60O.A0x(",wearableAudioEnabled="), sbA0x);
        AbstractC7609F5w.A1I(this.wearableVideoEnabled, C60O.A0x(",wearableVideoEnabled="), sbA0x);
        return BV7.A11(sbA0x);
    }

    public CallSummaryInfo(Builder builder) {
        builder.localCallId.getClass();
        builder.callTrigger.getClass();
        this.localCallId = builder.localCallId;
        this.sharedCallId = builder.sharedCallId;
        this.systemTime = builder.systemTime;
        this.steadyTime = builder.steadyTime;
        this.callCreatedTime = builder.callCreatedTime;
        this.engineCreatedTime = builder.engineCreatedTime;
        this.callAnsweredTime = builder.callAnsweredTime;
        this.callConnectedTime = builder.callConnectedTime;
        this.callEndedTime = builder.callEndedTime;
        this.joinableCompleteTime = builder.joinableCompleteTime;
        this.lastUpdatedTime = builder.lastUpdatedTime;
        this.callTrigger = builder.callTrigger;
        this.isCaller = builder.isCaller;
        this.peerId = builder.peerId;
        this.endCallReason = builder.endCallReason;
        this.remoteEnded = builder.remoteEnded;
        this.inviteRequestedVideo = builder.inviteRequestedVideo;
        this.mediaGateBlockedFrameCount = builder.mediaGateBlockedFrameCount;
        this.videoEscalationStatus = builder.videoEscalationStatus;
        this.localVideoDuration = builder.localVideoDuration;
        this.remoteVideoDuration = builder.remoteVideoDuration;
        this.batteryStartLevel = builder.batteryStartLevel;
        this.batteryEndLevel = builder.batteryEndLevel;
        this.wasDeviceCharged = builder.wasDeviceCharged;
        this.joiningContext = builder.joiningContext;
        this.webDeviceId = builder.webDeviceId;
        this.endCallSubreason = builder.endCallSubreason;
        this.coldStartReason = builder.coldStartReason;
        this.isConnectedEnd = builder.isConnectedEnd;
        this.deviceShutdownTime = builder.deviceShutdownTime;
        this.maxConcurrentConnectedParticipant = builder.maxConcurrentConnectedParticipant;
        this.rtcActorId = builder.rtcActorId;
        this.autoRejoinCount = builder.autoRejoinCount;
        this.joinMode = builder.joinMode;
        this.autoRejoinSuccessfulCount = builder.autoRejoinSuccessfulCount;
        this.webrtcVersion = builder.webrtcVersion;
        this.clientSessionId = builder.clientSessionId;
        this.endCallAppState = builder.endCallAppState;
        this.isAutomation = builder.isAutomation;
        this.signalingProtocol = builder.signalingProtocol;
        this.wearableAudioEnabled = builder.wearableAudioEnabled;
        this.wearableVideoEnabled = builder.wearableVideoEnabled;
    }
}
