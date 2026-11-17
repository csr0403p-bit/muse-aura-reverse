package com.facebook.aura.partners.voice.intf;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class OtherCallBlockedStart extends C06G {
    public static final int $stable = 0;
    public final String threadId;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof OtherCallBlockedStart) && C7384Etj.areEqual(this.threadId, ((OtherCallBlockedStart) obj).threadId));
    }

    public static /* synthetic */ OtherCallBlockedStart copy$default(OtherCallBlockedStart otherCallBlockedStart, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = otherCallBlockedStart.threadId;
        }
        return new OtherCallBlockedStart(str);
    }

    public final String component1() {
        return this.threadId;
    }

    public final OtherCallBlockedStart copy(String str) {
        return new OtherCallBlockedStart(str);
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.threadId);
    }

    public OtherCallBlockedStart(String str) {
        this.threadId = str;
    }

    public String toString() {
        return super.toString();
    }
}
