package com.facebook.aura.conversation.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchSentTurn extends C06G {
    public static final int $stable = 0;
    public final String messageId;
    public final String requestId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSentTurn) {
                HatchSentTurn hatchSentTurn = (HatchSentTurn) obj;
                if (!C7384Etj.areEqual(this.requestId, hatchSentTurn.requestId) || !C7384Etj.areEqual(this.messageId, hatchSentTurn.messageId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchSentTurn copy$default(HatchSentTurn hatchSentTurn, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchSentTurn.requestId;
        }
        if ((i & 2) != 0) {
            str2 = hatchSentTurn.messageId;
        }
        AnonymousClass003.A0u(str, str2);
        return new HatchSentTurn(str, str2);
    }

    public final String component1() {
        return this.requestId;
    }

    public final String component2() {
        return this.messageId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.messageId, AnonymousClass001.A0G(this.requestId));
    }

    public HatchSentTurn(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.requestId = str;
        this.messageId = str2;
    }

    public final HatchSentTurn copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HatchSentTurn(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
