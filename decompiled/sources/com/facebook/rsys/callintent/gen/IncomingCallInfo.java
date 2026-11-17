package com.facebook.rsys.callintent.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8926Fti;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class IncomingCallInfo {
    public static G50<IncomingCallInfo> CONVERTER = C8926Fti.A00(26);
    public static long sMcfTypeId;
    public final CallMetadata callMetadata;
    public final Long incomingInviteServerTime;
    public final String incomingInviteTransactionId;
    public final boolean isVideo;
    public final McfReference messageContext;
    public final String receiverId;
    public final String sharedCallIdentifier;

    public static native IncomingCallInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IncomingCallInfo) {
                IncomingCallInfo incomingCallInfo = (IncomingCallInfo) obj;
                if (this.receiverId.equals(incomingCallInfo.receiverId)) {
                    McfReference mcfReference = this.messageContext;
                    McfReference mcfReference2 = incomingCallInfo.messageContext;
                    if (mcfReference != null ? mcfReference.equals(mcfReference2) : mcfReference2 == null) {
                        CallMetadata callMetadata = this.callMetadata;
                        CallMetadata callMetadata2 = incomingCallInfo.callMetadata;
                        if (callMetadata == null) {
                            if (callMetadata2 != null) {
                                return false;
                            }
                        } else if (callMetadata.equals(callMetadata2)) {
                        }
                        String str = this.sharedCallIdentifier;
                        String str2 = incomingCallInfo.sharedCallIdentifier;
                        if (str == null) {
                            if (str2 != null) {
                                return false;
                            }
                        } else if (str.equals(str2)) {
                        }
                        if (this.incomingInviteTransactionId.equals(incomingCallInfo.incomingInviteTransactionId)) {
                            Long l = this.incomingInviteServerTime;
                            Long l2 = incomingCallInfo.incomingInviteServerTime;
                            if (l == null) {
                                if (l2 != null) {
                                    return false;
                                }
                            } else if (l.equals(l2)) {
                            }
                            if (this.isVideo == incomingCallInfo.isVideo) {
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
        return ((AnonymousClass005.A0I(this.incomingInviteTransactionId, (((((BV8.A0B(this.receiverId) + AnonymousClass006.A0D(this.messageContext)) * 31) + AnonymousClass006.A0D(this.callMetadata)) * 31) + AnonymousClass006.A0G(this.sharedCallIdentifier)) * 31) + C3cH.A02(this.incomingInviteServerTime)) * 31) + (this.isVideo ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("IncomingCallInfo{receiverId=");
        sbA0x.append(this.receiverId);
        sbA0x.append(",messageContext=");
        sbA0x.append(this.messageContext);
        sbA0x.append(",callMetadata=");
        sbA0x.append(this.callMetadata);
        sbA0x.append(",sharedCallIdentifier=");
        sbA0x.append(this.sharedCallIdentifier);
        sbA0x.append(",incomingInviteTransactionId=");
        sbA0x.append(this.incomingInviteTransactionId);
        sbA0x.append(",incomingInviteServerTime=");
        sbA0x.append(this.incomingInviteServerTime);
        sbA0x.append(",isVideo=");
        return AbstractC7610F5x.A0y(sbA0x, this.isVideo);
    }

    public IncomingCallInfo(String str, McfReference mcfReference, CallMetadata callMetadata, String str2, String str3, Long l, boolean z) {
        str.getClass();
        str3.getClass();
        this.receiverId = str;
        this.messageContext = mcfReference;
        this.callMetadata = callMetadata;
        this.sharedCallIdentifier = str2;
        this.incomingInviteTransactionId = str3;
        this.incomingInviteServerTime = l;
        this.isVideo = z;
    }
}
