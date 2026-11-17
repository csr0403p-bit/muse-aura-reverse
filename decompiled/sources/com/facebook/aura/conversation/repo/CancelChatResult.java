package com.facebook.aura.conversation.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class CancelChatResult extends C06G {
    public final boolean cancelled;
    public final String messageId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CancelChatResult) {
                CancelChatResult cancelChatResult = (CancelChatResult) obj;
                if (this.cancelled != cancelChatResult.cancelled || !C7384Etj.areEqual(this.messageId, cancelChatResult.messageId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CancelChatResult copy$default(CancelChatResult cancelChatResult, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cancelChatResult.cancelled;
        }
        if ((i & 2) != 0) {
            str = cancelChatResult.messageId;
        }
        return new CancelChatResult(z, str);
    }

    public final boolean component1() {
        return this.cancelled;
    }

    public final String component2() {
        return this.messageId;
    }

    public final CancelChatResult copy(boolean z, String str) {
        return new CancelChatResult(z, str);
    }

    public final boolean getCancelled() {
        return this.cancelled;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        return C0KA.A02(this.cancelled) + AnonymousClass006.A0G(this.messageId);
    }

    public CancelChatResult(boolean z, String str) {
        this.cancelled = z;
        this.messageId = str;
    }

    public String toString() {
        return super.toString();
    }
}
