package com.facebook.rsys.call.gen;

import X.AbstractC7609F5w;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8926Fti;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callinfo.gen.UserProfile;

/* loaded from: classes6.dex */
public class CallParticipant {
    public static G50<CallParticipant> CONVERTER = C8926Fti.A00(13);
    public static long sMcfTypeId;
    public final String aliasId;
    public final boolean isCaller;
    public final boolean isService;
    public final ParticipantMediaState mediaState;
    public final String representativeId;
    public final Long sctpNodeId;
    public final int state;
    public final String userId;
    public final UserProfile userProfile;
    public final String username;

    public static native CallParticipant createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallParticipant) {
                CallParticipant callParticipant = (CallParticipant) obj;
                if (this.userId.equals(callParticipant.userId)) {
                    String str = this.representativeId;
                    String str2 = callParticipant.representativeId;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        String str3 = this.aliasId;
                        String str4 = callParticipant.aliasId;
                        if (str3 == null) {
                            if (str4 != null) {
                                return false;
                            }
                        } else if (str3.equals(str4)) {
                        }
                        String str5 = this.username;
                        String str6 = callParticipant.username;
                        if (str5 == null) {
                            if (str6 != null) {
                                return false;
                            }
                        } else if (str5.equals(str6)) {
                        }
                        if (this.userProfile.equals(callParticipant.userProfile) && this.isCaller == callParticipant.isCaller && this.isService == callParticipant.isService && this.mediaState.equals(callParticipant.mediaState) && this.state == callParticipant.state) {
                            Long l = this.sctpNodeId;
                            Long l2 = callParticipant.sctpNodeId;
                            if (l == null) {
                                if (l2 != null) {
                                    return false;
                                }
                            } else if (l.equals(l2)) {
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
        return ((AnonymousClass005.A0F(this.mediaState, (((AnonymousClass005.A0F(this.userProfile, (((((BV8.A0B(this.userId) + AnonymousClass006.A0G(this.representativeId)) * 31) + AnonymousClass006.A0G(this.aliasId)) * 31) + AnonymousClass006.A0G(this.username)) * 31) + (this.isCaller ? 1 : 0)) * 31) + (this.isService ? 1 : 0)) * 31) + this.state) * 31) + C3cH.A02(this.sctpNodeId);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("CallParticipant{userId=");
        sbA0x.append(this.userId);
        sbA0x.append(",representativeId=");
        sbA0x.append(this.representativeId);
        sbA0x.append(",aliasId=");
        sbA0x.append(this.aliasId);
        sbA0x.append(",username=");
        sbA0x.append(this.username);
        sbA0x.append(",userProfile=");
        sbA0x.append(this.userProfile);
        sbA0x.append(",isCaller=");
        sbA0x.append(this.isCaller);
        sbA0x.append(",isService=");
        sbA0x.append(this.isService);
        sbA0x.append(",mediaState=");
        sbA0x.append(this.mediaState);
        sbA0x.append(",state=");
        sbA0x.append(this.state);
        sbA0x.append(",sctpNodeId=");
        return BV8.A0v(this.sctpNodeId, sbA0x);
    }

    public CallParticipant(String str, String str2, String str3, String str4, UserProfile userProfile, boolean z, boolean z2, ParticipantMediaState participantMediaState, int i, Long l) {
        AbstractC7609F5w.A1H(str, userProfile, participantMediaState);
        this.userId = str;
        this.representativeId = str2;
        this.aliasId = str3;
        this.username = str4;
        this.userProfile = userProfile;
        this.isCaller = z;
        this.isService = z2;
        this.mediaState = participantMediaState;
        this.state = i;
        this.sctpNodeId = l;
    }
}
