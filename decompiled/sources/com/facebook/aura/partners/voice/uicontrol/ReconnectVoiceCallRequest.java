package com.facebook.aura.partners.voice.uicontrol;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class ReconnectVoiceCallRequest extends C06G {
    public final String reason;
    public final String rootCallServerInfoData;
    public final String targetCallId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReconnectVoiceCallRequest) {
                ReconnectVoiceCallRequest reconnectVoiceCallRequest = (ReconnectVoiceCallRequest) obj;
                if (!C7384Etj.areEqual(this.reason, reconnectVoiceCallRequest.reason) || !C7384Etj.areEqual(this.targetCallId, reconnectVoiceCallRequest.targetCallId) || !C7384Etj.areEqual(this.rootCallServerInfoData, reconnectVoiceCallRequest.rootCallServerInfoData)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ReconnectVoiceCallRequest copy$default(ReconnectVoiceCallRequest reconnectVoiceCallRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reconnectVoiceCallRequest.reason;
        }
        if ((i & 2) != 0) {
            str2 = reconnectVoiceCallRequest.targetCallId;
        }
        if ((i & 4) != 0) {
            str3 = reconnectVoiceCallRequest.rootCallServerInfoData;
        }
        return new ReconnectVoiceCallRequest(str, str2, str3);
    }

    public final String component1() {
        return this.reason;
    }

    public final String component2() {
        return this.targetCallId;
    }

    public final String component3() {
        return this.rootCallServerInfoData;
    }

    public final ReconnectVoiceCallRequest copy(String str, String str2, String str3) {
        return new ReconnectVoiceCallRequest(str, str2, str3);
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRootCallServerInfoData() {
        return this.rootCallServerInfoData;
    }

    public final String getTargetCallId() {
        return this.targetCallId;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.reason) * 31) + AnonymousClass006.A0G(this.targetCallId)) * 31) + AnonymousClass005.A0H(this.rootCallServerInfoData);
    }

    public ReconnectVoiceCallRequest(String str, String str2, String str3) {
        this.reason = str;
        this.targetCallId = str2;
        this.rootCallServerInfoData = str3;
    }

    public String toString() {
        return super.toString();
    }
}
