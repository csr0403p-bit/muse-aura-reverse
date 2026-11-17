package com.facebook.aura.conversation.data;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchSearchHit extends C06G {
    public final String displayText;
    public final boolean isThread;
    public final String messageId;
    public final long occurredAtMs;
    public final String role;
    public final Long rowId;
    public final Long seq;
    public final String sessionId;
    public final String snippet;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSearchHit) {
                HatchSearchHit hatchSearchHit = (HatchSearchHit) obj;
                if (!C7384Etj.areEqual(this.messageId, hatchSearchHit.messageId) || !C7384Etj.areEqual(this.role, hatchSearchHit.role) || !C7384Etj.areEqual(this.snippet, hatchSearchHit.snippet) || !C7384Etj.areEqual(this.displayText, hatchSearchHit.displayText) || this.occurredAtMs != hatchSearchHit.occurredAtMs || this.isThread != hatchSearchHit.isThread || !C7384Etj.areEqual(this.sessionId, hatchSearchHit.sessionId) || !C7384Etj.areEqual(this.title, hatchSearchHit.title) || !C7384Etj.areEqual(this.rowId, hatchSearchHit.rowId) || !C7384Etj.areEqual(this.seq, hatchSearchHit.seq)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchSearchHit copy$default(HatchSearchHit hatchSearchHit, String str, String str2, String str3, String str4, long j, boolean z, String str5, String str6, Long l, Long l2, int i, Object obj) {
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
        if ((i & 32) != 0) {
            z = hatchSearchHit.isThread;
        }
        if ((i & 64) != 0) {
            str5 = hatchSearchHit.sessionId;
        }
        if ((i & 128) != 0) {
            str6 = hatchSearchHit.title;
        }
        if ((i & 256) != 0) {
            l = hatchSearchHit.rowId;
        }
        if ((i & 512) != 0) {
            l2 = hatchSearchHit.seq;
        }
        return hatchSearchHit.copy(str, str2, str3, str4, j, z, str5, str6, l, l2);
    }

    public final String component1() {
        return this.messageId;
    }

    public final Long component10() {
        return this.seq;
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

    public final boolean component6() {
        return this.isThread;
    }

    public final String component7() {
        return this.sessionId;
    }

    public final String component8() {
        return this.title;
    }

    public final Long component9() {
        return this.rowId;
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

    public final Long getRowId() {
        return this.rowId;
    }

    public final Long getSeq() {
        return this.seq;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getSnippet() {
        return this.snippet;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((((C0KA.A01(AnonymousClass006.A06(this.occurredAtMs, AnonymousClass005.A0I(this.displayText, AnonymousClass005.A0I(this.snippet, AnonymousClass005.A0I(this.role, AnonymousClass001.A0G(this.messageId))))), this.isThread) + AnonymousClass006.A0G(this.sessionId)) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0D(this.rowId)) * 31) + C06G.A04(this.seq);
    }

    public final boolean isThread() {
        return this.isThread;
    }

    public /* synthetic */ HatchSearchHit(String str, String str2, String str3, String str4, long j, boolean z, String str5, String str6, Long l, Long l2, int i, C06H c06h) {
        this(str, str2, str3, str4, j, AnonymousClass002.A1R(i, z), (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : l2);
    }

    public final HatchSearchHit copy(String str, String str2, String str3, String str4, long j, boolean z, String str5, String str6, Long l, Long l2) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new HatchSearchHit(str, str2, str3, str4, j, z, str5, str6, l, l2);
    }

    public String toString() {
        return super.toString();
    }

    public HatchSearchHit(String str, String str2, String str3, String str4, long j, boolean z, String str5, String str6, Long l, Long l2) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.messageId = str;
        this.role = str2;
        this.snippet = str3;
        this.displayText = str4;
        this.occurredAtMs = j;
        this.isThread = z;
        this.sessionId = str5;
        this.title = str6;
        this.rowId = l;
        this.seq = l2;
    }
}
