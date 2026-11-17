package com.facebook.aura.partners.voice.intf;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class ActiveAppAudioCall extends C06G {
    public static final int $stable = 0;
    public final String callId;
    public final String threadId;

    public ActiveAppAudioCall(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.callId = str;
        this.threadId = str2;
    }

    public final ActiveAppAudioCall copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new ActiveAppAudioCall(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActiveAppAudioCall) {
                ActiveAppAudioCall activeAppAudioCall = (ActiveAppAudioCall) obj;
                if (!C7384Etj.areEqual(this.callId, activeAppAudioCall.callId) || !C7384Etj.areEqual(this.threadId, activeAppAudioCall.threadId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActiveAppAudioCall copy$default(ActiveAppAudioCall activeAppAudioCall, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activeAppAudioCall.callId;
        }
        if ((i & 2) != 0) {
            str2 = activeAppAudioCall.threadId;
        }
        C7384Etj.A0Y(str, 0);
        return new ActiveAppAudioCall(str, str2);
    }

    public final String component1() {
        return this.callId;
    }

    public final String component2() {
        return this.threadId;
    }

    public final String getCallId() {
        return this.callId;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.callId) + AnonymousClass006.A0G(this.threadId);
    }

    public String toString() {
        return super.toString();
    }
}
