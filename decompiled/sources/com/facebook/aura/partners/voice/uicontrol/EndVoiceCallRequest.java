package com.facebook.aura.partners.voice.uicontrol;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class EndVoiceCallRequest extends C06G {
    public final String activeCallId;
    public final String reason;
    public final String targetCallId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EndVoiceCallRequest) {
                EndVoiceCallRequest endVoiceCallRequest = (EndVoiceCallRequest) obj;
                if (!C7384Etj.areEqual(this.reason, endVoiceCallRequest.reason) || !C7384Etj.areEqual(this.activeCallId, endVoiceCallRequest.activeCallId) || !C7384Etj.areEqual(this.targetCallId, endVoiceCallRequest.targetCallId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EndVoiceCallRequest copy$default(EndVoiceCallRequest endVoiceCallRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = endVoiceCallRequest.reason;
        }
        if ((i & 2) != 0) {
            str2 = endVoiceCallRequest.activeCallId;
        }
        if ((i & 4) != 0) {
            str3 = endVoiceCallRequest.targetCallId;
        }
        return new EndVoiceCallRequest(str, str2, str3);
    }

    public final String component1() {
        return this.reason;
    }

    public final String component2() {
        return this.activeCallId;
    }

    public final String component3() {
        return this.targetCallId;
    }

    public final EndVoiceCallRequest copy(String str, String str2, String str3) {
        return new EndVoiceCallRequest(str, str2, str3);
    }

    public final String getActiveCallId() {
        return this.activeCallId;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getTargetCallId() {
        return this.targetCallId;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.reason) * 31) + AnonymousClass006.A0G(this.activeCallId)) * 31) + AnonymousClass005.A0H(this.targetCallId);
    }

    public EndVoiceCallRequest(String str, String str2, String str3) {
        this.reason = str;
        this.activeCallId = str2;
        this.targetCallId = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EndVoiceCallRequest(String str, String str2, String str3, int i, C06H c06h) {
        this(str, str2, AnonymousClass006.A0t(i, str3));
    }
}
