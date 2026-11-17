package com.facebook.rsys.outgoingcallconfig.gen;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.call.datamessage.gen.DataMessage;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.transport.gen.SignalingProtocolParams;
import com.facebook.rtc.fbwebrtc.overlayconfig.overlayconfiglayer.OverlayConfigLayerInterface;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class OutgoingCallConfig {
    public static G50<OutgoingCallConfig> CONVERTER = C8922Fte.A00(9);
    public static long sMcfTypeId;
    public final boolean acceptRemoteVideoEnabled;
    public final String appId;
    public final CallContext callContext;
    public final OverlayConfigLayerInterface callLevelOverlayConfigLayer;
    public final int cryptoE2eeMode;
    public final ArrayList<DataMessage> initialDataMessages;
    public final int joinMode;
    public final String localCallId;
    public final ArrayList<StateSyncMessage> pregeneratedStateSyncMessages;
    public final int signalingProtocol;
    public final SignalingProtocolParams signalingProtocolParams;
    public final boolean startWithAudio;
    public final boolean startWithVideo;
    public final String trigger;
    public final ArrayList<String> userIDsToRing;

    public static native OutgoingCallConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OutgoingCallConfig) {
                OutgoingCallConfig outgoingCallConfig = (OutgoingCallConfig) obj;
                String str = this.localCallId;
                String str2 = outgoingCallConfig.localCallId;
                if (str != null ? str.equals(str2) : str2 == null) {
                    if (this.appId.equals(outgoingCallConfig.appId) && this.callContext.equals(outgoingCallConfig.callContext) && this.userIDsToRing.equals(outgoingCallConfig.userIDsToRing) && this.startWithAudio == outgoingCallConfig.startWithAudio && this.startWithVideo == outgoingCallConfig.startWithVideo && this.acceptRemoteVideoEnabled == outgoingCallConfig.acceptRemoteVideoEnabled && this.trigger.equals(outgoingCallConfig.trigger)) {
                        ArrayList<DataMessage> arrayList = this.initialDataMessages;
                        ArrayList<DataMessage> arrayList2 = outgoingCallConfig.initialDataMessages;
                        if (arrayList == null) {
                            if (arrayList2 != null) {
                                return false;
                            }
                        } else if (arrayList.equals(arrayList2)) {
                        }
                        if (this.cryptoE2eeMode == outgoingCallConfig.cryptoE2eeMode && this.joinMode == outgoingCallConfig.joinMode && this.signalingProtocol == outgoingCallConfig.signalingProtocol) {
                            OverlayConfigLayerInterface overlayConfigLayerInterface = this.callLevelOverlayConfigLayer;
                            OverlayConfigLayerInterface overlayConfigLayerInterface2 = outgoingCallConfig.callLevelOverlayConfigLayer;
                            if (overlayConfigLayerInterface == null) {
                                if (overlayConfigLayerInterface2 != null) {
                                    return false;
                                }
                            } else if (overlayConfigLayerInterface.equals(overlayConfigLayerInterface2)) {
                            }
                            ArrayList<StateSyncMessage> arrayList3 = this.pregeneratedStateSyncMessages;
                            ArrayList<StateSyncMessage> arrayList4 = outgoingCallConfig.pregeneratedStateSyncMessages;
                            if (arrayList3 == null) {
                                if (arrayList4 != null) {
                                    return false;
                                }
                            } else if (arrayList3.equals(arrayList4)) {
                            }
                            SignalingProtocolParams signalingProtocolParams = this.signalingProtocolParams;
                            SignalingProtocolParams signalingProtocolParams2 = outgoingCallConfig.signalingProtocolParams;
                            if (signalingProtocolParams == null) {
                                if (signalingProtocolParams2 != null) {
                                    return false;
                                }
                            } else if (signalingProtocolParams.equals(signalingProtocolParams2)) {
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
        return ((((((((((((AnonymousClass005.A0I(this.trigger, (((((AnonymousClass005.A0F(this.userIDsToRing, AnonymousClass005.A0F(this.callContext, AnonymousClass005.A0I(this.appId, AbstractC7608F5v.A02(AnonymousClass006.A0G(this.localCallId))))) + (this.startWithAudio ? 1 : 0)) * 31) + (this.startWithVideo ? 1 : 0)) * 31) + (this.acceptRemoteVideoEnabled ? 1 : 0)) * 31) + AnonymousClass006.A0D(this.initialDataMessages)) * 31) + this.cryptoE2eeMode) * 31) + this.joinMode) * 31) + this.signalingProtocol) * 31) + AnonymousClass006.A0D(this.callLevelOverlayConfigLayer)) * 31) + AnonymousClass006.A0D(this.pregeneratedStateSyncMessages)) * 31) + C3cH.A02(this.signalingProtocolParams);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("OutgoingCallConfig{localCallId=");
        sbA0x.append(this.localCallId);
        sbA0x.append(",appId=");
        sbA0x.append(this.appId);
        sbA0x.append(",callContext=");
        sbA0x.append(this.callContext);
        sbA0x.append(",userIDsToRing=");
        sbA0x.append(this.userIDsToRing);
        sbA0x.append(",startWithAudio=");
        sbA0x.append(this.startWithAudio);
        sbA0x.append(",startWithVideo=");
        sbA0x.append(this.startWithVideo);
        sbA0x.append(",acceptRemoteVideoEnabled=");
        sbA0x.append(this.acceptRemoteVideoEnabled);
        sbA0x.append(",trigger=");
        sbA0x.append(this.trigger);
        sbA0x.append(",initialDataMessages=");
        sbA0x.append(this.initialDataMessages);
        sbA0x.append(",cryptoE2eeMode=");
        sbA0x.append(this.cryptoE2eeMode);
        sbA0x.append(",joinMode=");
        sbA0x.append(this.joinMode);
        sbA0x.append(",signalingProtocol=");
        sbA0x.append(this.signalingProtocol);
        sbA0x.append(",callLevelOverlayConfigLayer=");
        sbA0x.append(this.callLevelOverlayConfigLayer);
        sbA0x.append(",pregeneratedStateSyncMessages=");
        sbA0x.append(this.pregeneratedStateSyncMessages);
        sbA0x.append(",signalingProtocolParams=");
        return BV8.A0v(this.signalingProtocolParams, sbA0x);
    }

    public OutgoingCallConfig(String str, String str2, CallContext callContext, ArrayList<String> arrayList, boolean z, boolean z2, boolean z3, String str3, ArrayList<DataMessage> arrayList2, int i, int i2, int i3, OverlayConfigLayerInterface overlayConfigLayerInterface, ArrayList<StateSyncMessage> arrayList3, SignalingProtocolParams signalingProtocolParams) {
        AbstractC7609F5w.A1H(str2, callContext, arrayList);
        str3.getClass();
        this.localCallId = str;
        this.appId = str2;
        this.callContext = callContext;
        this.userIDsToRing = arrayList;
        this.startWithAudio = z;
        this.startWithVideo = z2;
        this.acceptRemoteVideoEnabled = z3;
        this.trigger = str3;
        this.initialDataMessages = arrayList2;
        this.cryptoE2eeMode = i;
        this.joinMode = i2;
        this.signalingProtocol = i3;
        this.callLevelOverlayConfigLayer = overlayConfigLayerInterface;
        this.pregeneratedStateSyncMessages = arrayList3;
        this.signalingProtocolParams = signalingProtocolParams;
    }
}
