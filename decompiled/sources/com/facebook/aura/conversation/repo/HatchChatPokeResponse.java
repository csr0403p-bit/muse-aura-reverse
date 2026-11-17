package com.facebook.aura.conversation.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HatchChatPokeResponse extends C06G {
    public final String channel;
    public final boolean isThread;
    public final String sessionId;
    public final String streamOwnerMessageId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchChatPokeResponse) {
                HatchChatPokeResponse hatchChatPokeResponse = (HatchChatPokeResponse) obj;
                if (!C7384Etj.areEqual(this.streamOwnerMessageId, hatchChatPokeResponse.streamOwnerMessageId) || !C7384Etj.areEqual(this.channel, hatchChatPokeResponse.channel) || !C7384Etj.areEqual(this.sessionId, hatchChatPokeResponse.sessionId) || this.isThread != hatchChatPokeResponse.isThread) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchChatPokeResponse copy$default(HatchChatPokeResponse hatchChatPokeResponse, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchChatPokeResponse.streamOwnerMessageId;
        }
        if ((i & 2) != 0) {
            str2 = hatchChatPokeResponse.channel;
        }
        if ((i & 4) != 0) {
            str3 = hatchChatPokeResponse.sessionId;
        }
        if ((i & 8) != 0) {
            z = hatchChatPokeResponse.isThread;
        }
        AnonymousClass005.A0x(str, str2, str3);
        return new HatchChatPokeResponse(str, str2, str3, z);
    }

    public final String component1() {
        return this.streamOwnerMessageId;
    }

    public final String component2() {
        return this.channel;
    }

    public final String component3() {
        return this.sessionId;
    }

    public final boolean component4() {
        return this.isThread;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getStreamOwnerMessageId() {
        return this.streamOwnerMessageId;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.sessionId, AnonymousClass005.A0I(this.channel, AnonymousClass001.A0G(this.streamOwnerMessageId))), this.isThread);
    }

    public final boolean isThread() {
        return this.isThread;
    }

    public HatchChatPokeResponse(String str, String str2, String str3, boolean z) {
        AnonymousClass005.A0x(str, str2, str3);
        this.streamOwnerMessageId = str;
        this.channel = str2;
        this.sessionId = str3;
        this.isThread = z;
    }

    public final HatchChatPokeResponse copy(String str, String str2, String str3, boolean z) {
        AnonymousClass005.A0x(str, str2, str3);
        return new HatchChatPokeResponse(str, str2, str3, z);
    }

    public String toString() {
        return super.toString();
    }
}
