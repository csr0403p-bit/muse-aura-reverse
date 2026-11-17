package com.facebook.aura.partners.voice.intf;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class VoiceEndCallRequest extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public static final String REASON_AUDIO_TAKEOVER = "audio_takeover";
    public static final String REASON_THREAD_DELETED = "thread_deleted";
    public final String activeCallId;
    public final String reason;
    public final String targetCallId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceEndCallRequest) {
                VoiceEndCallRequest voiceEndCallRequest = (VoiceEndCallRequest) obj;
                if (!C7384Etj.areEqual(this.activeCallId, voiceEndCallRequest.activeCallId) || !C7384Etj.areEqual(this.targetCallId, voiceEndCallRequest.targetCallId) || !C7384Etj.areEqual(this.reason, voiceEndCallRequest.reason)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoiceEndCallRequest copy$default(VoiceEndCallRequest voiceEndCallRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceEndCallRequest.activeCallId;
        }
        if ((i & 2) != 0) {
            str2 = voiceEndCallRequest.targetCallId;
        }
        if ((i & 4) != 0) {
            str3 = voiceEndCallRequest.reason;
        }
        return new VoiceEndCallRequest(str, str2, str3);
    }

    public final String component1() {
        return this.activeCallId;
    }

    public final String component2() {
        return this.targetCallId;
    }

    public final String component3() {
        return this.reason;
    }

    public final VoiceEndCallRequest copy(String str, String str2, String str3) {
        return new VoiceEndCallRequest(str, str2, str3);
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
        return (((AnonymousClass006.A0G(this.activeCallId) * 31) + AnonymousClass006.A0G(this.targetCallId)) * 31) + AnonymousClass005.A0H(this.reason);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public VoiceEndCallRequest(String str, String str2, String str3) {
        this.activeCallId = str;
        this.targetCallId = str2;
        this.reason = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceEndCallRequest(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public VoiceEndCallRequest() {
        this(null, null, null);
    }
}
