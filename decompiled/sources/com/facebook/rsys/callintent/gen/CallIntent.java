package com.facebook.rsys.callintent.gen;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8926Fti;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.outgoingcallconfig.gen.OutgoingCallConfig;
import com.facebook.rsys.overlayconfigmanager.OverlayConfigManagerHolder;

/* loaded from: classes6.dex */
public class CallIntent {
    public static G50<CallIntent> CONVERTER = C8926Fti.A00(22);
    public static long sMcfTypeId;
    public final String appId;
    public final CallContext callContext;
    public final Long connectionId;
    public final String connectionLoggingId;
    public final IncomingCallInfo incomingCallInfo;
    public final String localCallId;
    public final OutgoingCallConfig outgoingCallConfig;
    public final OverlayConfigManagerHolder overlayConfigManager;
    public final Object signalingSessionHolder;

    public static native CallIntent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallIntent) {
                CallIntent callIntent = (CallIntent) obj;
                if (this.localCallId.equals(callIntent.localCallId) && this.appId.equals(callIntent.appId) && this.callContext.equals(callIntent.callContext)) {
                    OutgoingCallConfig outgoingCallConfig = this.outgoingCallConfig;
                    OutgoingCallConfig outgoingCallConfig2 = callIntent.outgoingCallConfig;
                    if (outgoingCallConfig != null ? outgoingCallConfig.equals(outgoingCallConfig2) : outgoingCallConfig2 == null) {
                        IncomingCallInfo incomingCallInfo = this.incomingCallInfo;
                        IncomingCallInfo incomingCallInfo2 = callIntent.incomingCallInfo;
                        if (incomingCallInfo == null) {
                            if (incomingCallInfo2 != null) {
                                return false;
                            }
                        } else if (incomingCallInfo.equals(incomingCallInfo2)) {
                        }
                        Object obj2 = this.signalingSessionHolder;
                        Object obj3 = callIntent.signalingSessionHolder;
                        if (obj2 == null) {
                            if (obj3 != null) {
                                return false;
                            }
                        } else if (obj2.equals(obj3)) {
                        }
                        OverlayConfigManagerHolder overlayConfigManagerHolder = this.overlayConfigManager;
                        OverlayConfigManagerHolder overlayConfigManagerHolder2 = callIntent.overlayConfigManager;
                        if (overlayConfigManagerHolder == null) {
                            if (overlayConfigManagerHolder2 != null) {
                                return false;
                            }
                        } else if (overlayConfigManagerHolder.equals(overlayConfigManagerHolder2)) {
                        }
                        Long l = this.connectionId;
                        Long l2 = callIntent.connectionId;
                        if (l == null) {
                            if (l2 != null) {
                                return false;
                            }
                        } else if (l.equals(l2)) {
                        }
                        String str = this.connectionLoggingId;
                        String str2 = callIntent.connectionLoggingId;
                        if (str == null) {
                            if (str2 != null) {
                                return false;
                            }
                        } else if (str.equals(str2)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((AnonymousClass005.A0F(this.callContext, AnonymousClass005.A0I(this.appId, BV8.A0B(this.localCallId))) + AnonymousClass006.A0D(this.outgoingCallConfig)) * 31) + AnonymousClass006.A0D(this.incomingCallInfo)) * 31) + AnonymousClass006.A0D(this.signalingSessionHolder)) * 31) + AnonymousClass006.A0D(this.overlayConfigManager)) * 31) + AnonymousClass006.A0D(this.connectionId)) * 31) + AnonymousClass005.A0H(this.connectionLoggingId);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("CallIntent{localCallId=");
        sbA0x.append(this.localCallId);
        sbA0x.append(",appId=");
        sbA0x.append(this.appId);
        sbA0x.append(",callContext=");
        sbA0x.append(this.callContext);
        sbA0x.append(",outgoingCallConfig=");
        sbA0x.append(this.outgoingCallConfig);
        sbA0x.append(",incomingCallInfo=");
        sbA0x.append(this.incomingCallInfo);
        sbA0x.append(",signalingSessionHolder=");
        sbA0x.append(this.signalingSessionHolder);
        sbA0x.append(",overlayConfigManager=");
        sbA0x.append(this.overlayConfigManager);
        sbA0x.append(",connectionId=");
        sbA0x.append(this.connectionId);
        sbA0x.append(",connectionLoggingId=");
        return AbstractC7610F5x.A0w(this.connectionLoggingId, sbA0x);
    }

    public CallIntent(String str, String str2, CallContext callContext, OutgoingCallConfig outgoingCallConfig, IncomingCallInfo incomingCallInfo, Object obj, OverlayConfigManagerHolder overlayConfigManagerHolder, Long l, String str3) {
        AbstractC7609F5w.A1H(str, str2, callContext);
        this.localCallId = str;
        this.appId = str2;
        this.callContext = callContext;
        this.outgoingCallConfig = outgoingCallConfig;
        this.incomingCallInfo = incomingCallInfo;
        this.signalingSessionHolder = obj;
        this.overlayConfigManager = overlayConfigManagerHolder;
        this.connectionId = l;
        this.connectionLoggingId = str3;
    }
}
