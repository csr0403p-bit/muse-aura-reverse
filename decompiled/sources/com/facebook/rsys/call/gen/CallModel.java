package com.facebook.rsys.call.gen;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C60O;
import X.C8926Fti;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.call.datamessage.gen.DataMessage;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.callinfo.gen.CallInfo;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes6.dex */
public class CallModel {
    public static G50<CallModel> CONVERTER = C8926Fti.A00(11);
    public static long sMcfTypeId;
    public final boolean acceptRemoteVideoEnabled;
    public final long callAnsweredTimestampMs;
    public final long callConnectedTimestampMs;
    public final CallContext callContext;
    public final long callCreatedTimestampMs;
    public final long callEndedTimestampMs;
    public final CallInfo callInfo;
    public final int callStartedWithCamera;
    public final String callTrigger;
    public final boolean canSendMultipleVideoStreams;
    public final boolean canSendScreenshareStream;
    public final String clientEndpointId;
    public final int connectionQuality;
    public final int inCallState;
    public final ArrayList<DataMessage> initialDataMessages;
    public final int initialDirection;
    public final boolean inviteRequestedVideo;
    public final boolean joinAttemptSent;
    public final int joinMode;
    public final boolean maxParticipantsReached;
    public final int mediaConnectionState;
    public final ArrayList<CallNotification> notifications;
    public final long numSuccessfulRejoins;
    public final long rejoinAttempts;
    public final long rejoinTotalAttempts;
    public final ArrayList<CallParticipant> remoteParticipants;
    public final int requiredVideoEscalationConsent;
    public final CallParticipant selfParticipant;
    public final CallParticipant serviceParticipant;
    public final String sharedCallId;
    public final boolean supportsSctp;
    public final int transferState;
    public final Map<String, byte[]> userCapabilities;

    public static native CallModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallModel) {
                CallModel callModel = (CallModel) obj;
                if (this.inCallState == callModel.inCallState && this.callCreatedTimestampMs == callModel.callCreatedTimestampMs && this.callAnsweredTimestampMs == callModel.callAnsweredTimestampMs && this.callConnectedTimestampMs == callModel.callConnectedTimestampMs && this.callEndedTimestampMs == callModel.callEndedTimestampMs && this.inviteRequestedVideo == callModel.inviteRequestedVideo && this.acceptRemoteVideoEnabled == callModel.acceptRemoteVideoEnabled && this.requiredVideoEscalationConsent == callModel.requiredVideoEscalationConsent && this.callStartedWithCamera == callModel.callStartedWithCamera && this.selfParticipant.equals(callModel.selfParticipant) && this.remoteParticipants.equals(callModel.remoteParticipants) && this.serviceParticipant.equals(callModel.serviceParticipant) && this.callContext.equals(callModel.callContext) && this.callInfo.equals(callModel.callInfo) && this.maxParticipantsReached == callModel.maxParticipantsReached && this.canSendMultipleVideoStreams == callModel.canSendMultipleVideoStreams && this.canSendScreenshareStream == callModel.canSendScreenshareStream) {
                    String str = this.sharedCallId;
                    String str2 = callModel.sharedCallId;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        if (this.notifications.equals(callModel.notifications)) {
                            Map<String, byte[]> map = this.userCapabilities;
                            Map<String, byte[]> map2 = callModel.userCapabilities;
                            if (map == null) {
                                if (map2 != null) {
                                    return false;
                                }
                            } else if (map.equals(map2)) {
                            }
                            ArrayList<DataMessage> arrayList = this.initialDataMessages;
                            ArrayList<DataMessage> arrayList2 = callModel.initialDataMessages;
                            if (arrayList == null) {
                                if (arrayList2 != null) {
                                    return false;
                                }
                            } else if (arrayList.equals(arrayList2)) {
                            }
                            if (this.connectionQuality == callModel.connectionQuality && this.initialDirection == callModel.initialDirection && this.rejoinAttempts == callModel.rejoinAttempts && this.rejoinTotalAttempts == callModel.rejoinTotalAttempts && this.numSuccessfulRejoins == callModel.numSuccessfulRejoins && this.transferState == callModel.transferState && this.joinMode == callModel.joinMode && this.clientEndpointId.equals(callModel.clientEndpointId) && this.supportsSctp == callModel.supportsSctp && this.mediaConnectionState == callModel.mediaConnectionState && this.joinAttemptSent == callModel.joinAttemptSent) {
                                String str3 = this.callTrigger;
                                String str4 = callModel.callTrigger;
                                if (str3 == null) {
                                    if (str4 != null) {
                                        return false;
                                    }
                                } else if (!str3.equals(str4)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iA0F = AnonymousClass005.A0F(this.notifications, (((((((AnonymousClass005.A0F(this.callInfo, AnonymousClass005.A0F(this.callContext, AnonymousClass005.A0F(this.serviceParticipant, AnonymousClass005.A0F(this.remoteParticipants, AnonymousClass005.A0F(this.selfParticipant, (((((((AnonymousClass006.A06(this.callEndedTimestampMs, AnonymousClass006.A06(this.callConnectedTimestampMs, AnonymousClass006.A06(this.callAnsweredTimestampMs, AnonymousClass006.A06(this.callCreatedTimestampMs, (527 + this.inCallState) * 31)))) + (this.inviteRequestedVideo ? 1 : 0)) * 31) + (this.acceptRemoteVideoEnabled ? 1 : 0)) * 31) + this.requiredVideoEscalationConsent) * 31) + this.callStartedWithCamera) * 31))))) + (this.maxParticipantsReached ? 1 : 0)) * 31) + (this.canSendMultipleVideoStreams ? 1 : 0)) * 31) + (this.canSendScreenshareStream ? 1 : 0)) * 31) + AnonymousClass006.A0G(this.sharedCallId)) * 31);
        Map<String, byte[]> map = this.userCapabilities;
        return ((((((AnonymousClass005.A0I(this.clientEndpointId, (((AnonymousClass006.A06(this.numSuccessfulRejoins, AnonymousClass006.A06(this.rejoinTotalAttempts, AnonymousClass006.A06(this.rejoinAttempts, (((((((iA0F + (map == null ? 0 : map.hashCode())) * 31) + AnonymousClass006.A0D(this.initialDataMessages)) * 31) + this.connectionQuality) * 31) + this.initialDirection) * 31))) + this.transferState) * 31) + this.joinMode) * 31) + (this.supportsSctp ? 1 : 0)) * 31) + this.mediaConnectionState) * 31) + (this.joinAttemptSent ? 1 : 0)) * 31) + AnonymousClass005.A0H(this.callTrigger);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("CallModel{");
        FGI.A0w("inCallState=", sbA0x, this.inCallState);
        FGI.A0x(",callCreatedTimestampMs=", sbA0x, this.callCreatedTimestampMs);
        FGI.A0x(",callAnsweredTimestampMs=", sbA0x, this.callAnsweredTimestampMs);
        FGI.A0x(",callConnectedTimestampMs=", sbA0x, this.callConnectedTimestampMs);
        FGI.A0x(",callEndedTimestampMs=", sbA0x, this.callEndedTimestampMs);
        FGI.A0y(",inviteRequestedVideo=", sbA0x, this.inviteRequestedVideo);
        FGI.A0y(",acceptRemoteVideoEnabled=", sbA0x, this.acceptRemoteVideoEnabled);
        FGI.A0w(",requiredVideoEscalationConsent=", sbA0x, this.requiredVideoEscalationConsent);
        FGI.A0w(",callStartedWithCamera=", sbA0x, this.callStartedWithCamera);
        AbstractC7609F5w.A1I(this.selfParticipant, C60O.A0x(",selfParticipant="), sbA0x);
        AbstractC7609F5w.A1I(this.remoteParticipants, C60O.A0x(",remoteParticipants="), sbA0x);
        AbstractC7609F5w.A1I(this.serviceParticipant, C60O.A0x(",serviceParticipant="), sbA0x);
        AbstractC7609F5w.A1I(this.callContext, C60O.A0x(",callContext="), sbA0x);
        AbstractC7609F5w.A1I(this.callInfo, C60O.A0x(",callInfo="), sbA0x);
        FGI.A0y(",maxParticipantsReached=", sbA0x, this.maxParticipantsReached);
        FGI.A0y(",canSendMultipleVideoStreams=", sbA0x, this.canSendMultipleVideoStreams);
        FGI.A0y(",canSendScreenshareStream=", sbA0x, this.canSendScreenshareStream);
        FGI.A0v(",sharedCallId=", this.sharedCallId, sbA0x);
        AbstractC7609F5w.A1I(this.notifications, C60O.A0x(",notifications="), sbA0x);
        AbstractC7609F5w.A1I(this.userCapabilities, C60O.A0x(",userCapabilities="), sbA0x);
        AbstractC7609F5w.A1I(this.initialDataMessages, C60O.A0x(",initialDataMessages="), sbA0x);
        FGI.A0w(",connectionQuality=", sbA0x, this.connectionQuality);
        FGI.A0w(",initialDirection=", sbA0x, this.initialDirection);
        FGI.A0x(",rejoinAttempts=", sbA0x, this.rejoinAttempts);
        FGI.A0x(",rejoinTotalAttempts=", sbA0x, this.rejoinTotalAttempts);
        FGI.A0x(",numSuccessfulRejoins=", sbA0x, this.numSuccessfulRejoins);
        FGI.A0w(",transferState=", sbA0x, this.transferState);
        FGI.A0w(",joinMode=", sbA0x, this.joinMode);
        FGI.A0v(",clientEndpointId=", this.clientEndpointId, sbA0x);
        FGI.A0y(",supportsSctp=", sbA0x, this.supportsSctp);
        FGI.A0w(",mediaConnectionState=", sbA0x, this.mediaConnectionState);
        FGI.A0y(",joinAttemptSent=", sbA0x, this.joinAttemptSent);
        return AbstractC7610F5x.A0w(FGI.A0M(",callTrigger=", this.callTrigger), sbA0x);
    }

    public CallModel(int i, long j, long j2, long j3, long j4, boolean z, boolean z2, int i2, int i3, CallParticipant callParticipant, ArrayList<CallParticipant> arrayList, CallParticipant callParticipant2, CallContext callContext, CallInfo callInfo, boolean z3, boolean z4, boolean z5, String str, ArrayList<CallNotification> arrayList2, Map<String, byte[]> map, ArrayList<DataMessage> arrayList3, int i4, int i5, long j5, long j6, long j7, int i6, int i7, String str2, boolean z6, int i8, boolean z7, String str3) {
        AbstractC7609F5w.A1H(callParticipant, arrayList, callParticipant2);
        AbstractC7609F5w.A1H(callContext, callInfo, arrayList2);
        str2.getClass();
        this.inCallState = i;
        this.callCreatedTimestampMs = j;
        this.callAnsweredTimestampMs = j2;
        this.callConnectedTimestampMs = j3;
        this.callEndedTimestampMs = j4;
        this.inviteRequestedVideo = z;
        this.acceptRemoteVideoEnabled = z2;
        this.requiredVideoEscalationConsent = i2;
        this.callStartedWithCamera = i3;
        this.selfParticipant = callParticipant;
        this.remoteParticipants = arrayList;
        this.serviceParticipant = callParticipant2;
        this.callContext = callContext;
        this.callInfo = callInfo;
        this.maxParticipantsReached = z3;
        this.canSendMultipleVideoStreams = z4;
        this.canSendScreenshareStream = z5;
        this.sharedCallId = str;
        this.notifications = arrayList2;
        this.userCapabilities = map;
        this.initialDataMessages = arrayList3;
        this.connectionQuality = i4;
        this.initialDirection = i5;
        this.rejoinAttempts = j5;
        this.rejoinTotalAttempts = j6;
        this.numSuccessfulRejoins = j7;
        this.transferState = i6;
        this.joinMode = i7;
        this.clientEndpointId = str2;
        this.supportsSctp = z6;
        this.mediaConnectionState = i8;
        this.joinAttemptSent = z7;
        this.callTrigger = str3;
    }
}
