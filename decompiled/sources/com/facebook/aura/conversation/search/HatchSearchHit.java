package com.facebook.aura.conversation.search;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchSearchHit extends C06G {
    public static final int $stable = 0;
    public final String displayText;
    public final String messageId;
    public final long occurredAtMs;
    public final String role;
    public final String snippet;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSearchHit) {
                HatchSearchHit hatchSearchHit = (HatchSearchHit) obj;
                if (!C7384Etj.areEqual(this.messageId, hatchSearchHit.messageId) || !C7384Etj.areEqual(this.role, hatchSearchHit.role) || !C7384Etj.areEqual(this.snippet, hatchSearchHit.snippet) || !C7384Etj.areEqual(this.displayText, hatchSearchHit.displayText) || this.occurredAtMs != hatchSearchHit.occurredAtMs) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchSearchHit copy$default(HatchSearchHit hatchSearchHit, String str, String str2, String str3, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchSearchHit.messageId;
        }
        if ((i & 2) != 0) {
            str2 = hatchSearchHit.role;
        }
        if ((i & 4) != 0) {
            str3 = hatchSearchHit.snippet;
        }
        if ((i & 8) != 0) {
            str4 = hatchSearchHit.displayText;
        }
        if ((i & 16) != 0) {
            j = hatchSearchHit.occurredAtMs;
        }
        return hatchSearchHit.copy(str, str2, str3, str4, j);
    }

    public final String component1() {
        return this.messageId;
    }

    public final String component2() {
        return this.role;
    }

    public final String component3() {
        return this.snippet;
    }

    public final String component4() {
        return this.displayText;
    }

    public final long component5() {
        return this.occurredAtMs;
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final long getOccurredAtMs() {
        return this.occurredAtMs;
    }

    public final String getRole() {
        return this.role;
    }

    public final String getSnippet() {
        return this.snippet;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.occurredAtMs, AnonymousClass005.A0I(this.displayText, AnonymousClass005.A0I(this.snippet, AnonymousClass005.A0I(this.role, AnonymousClass001.A0G(this.messageId)))));
    }

    public HatchSearchHit(String str, String str2, String str3, String str4, long j) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.messageId = str;
        this.role = str2;
        this.snippet = str3;
        this.displayText = str4;
        this.occurredAtMs = j;
    }

    public final HatchSearchHit copy(String str, String str2, String str3, String str4, long j) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new HatchSearchHit(str, str2, str3, str4, j);
    }

    public String toString() {
        return super.toString();
    }
}
