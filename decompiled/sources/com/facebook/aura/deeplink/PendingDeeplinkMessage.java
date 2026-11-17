package com.facebook.aura.deeplink;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class PendingDeeplinkMessage extends C06G {
    public static final int $stable = 0;
    public final String messageId;
    public final String threadId;

    public PendingDeeplinkMessage(String str, String str2) {
        C7384Etj.A0Y(str2, 1);
        this.threadId = str;
        this.messageId = str2;
    }

    public final PendingDeeplinkMessage copy(String str, String str2) {
        C7384Etj.A0Y(str2, 1);
        return new PendingDeeplinkMessage(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PendingDeeplinkMessage) {
                PendingDeeplinkMessage pendingDeeplinkMessage = (PendingDeeplinkMessage) obj;
                if (!C7384Etj.areEqual(this.threadId, pendingDeeplinkMessage.threadId) || !C7384Etj.areEqual(this.messageId, pendingDeeplinkMessage.messageId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PendingDeeplinkMessage copy$default(PendingDeeplinkMessage pendingDeeplinkMessage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pendingDeeplinkMessage.threadId;
        }
        if ((i & 2) != 0) {
            str2 = pendingDeeplinkMessage.messageId;
        }
        C7384Etj.A0Y(str2, 1);
        return new PendingDeeplinkMessage(str, str2);
    }

    public final String component1() {
        return this.threadId;
    }

    public final String component2() {
        return this.messageId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.messageId, AnonymousClass006.A0G(this.threadId) * 31);
    }

    public String toString() {
        return super.toString();
    }
}
