package com.facebook.aura.feed.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class FeedPrompt extends C06G {
    public static final int $stable = 0;
    public final long createdAtMs;
    public final String freeText;
    public final String fullPrompt;
    public final String id;
    public final String title;
    public final long updatedAtMs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedPrompt) {
                FeedPrompt feedPrompt = (FeedPrompt) obj;
                if (!C7384Etj.areEqual(this.id, feedPrompt.id) || !C7384Etj.areEqual(this.title, feedPrompt.title) || !C7384Etj.areEqual(this.freeText, feedPrompt.freeText) || !C7384Etj.areEqual(this.fullPrompt, feedPrompt.fullPrompt) || this.createdAtMs != feedPrompt.createdAtMs || this.updatedAtMs != feedPrompt.updatedAtMs) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedPrompt copy$default(FeedPrompt feedPrompt, String str, String str2, String str3, String str4, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedPrompt.id;
        }
        if ((i & 2) != 0) {
            str2 = feedPrompt.title;
        }
        if ((i & 4) != 0) {
            str3 = feedPrompt.freeText;
        }
        if ((i & 8) != 0) {
            str4 = feedPrompt.fullPrompt;
        }
        if ((i & 16) != 0) {
            j = feedPrompt.createdAtMs;
        }
        if ((i & 32) != 0) {
            j2 = feedPrompt.updatedAtMs;
        }
        return feedPrompt.copy(str, str2, str3, str4, j, j2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.freeText;
    }

    public final String component4() {
        return this.fullPrompt;
    }

    public final long component5() {
        return this.createdAtMs;
    }

    public final long component6() {
        return this.updatedAtMs;
    }

    public final long getCreatedAtMs() {
        return this.createdAtMs;
    }

    public final String getFreeText() {
        return this.freeText;
    }

    public final String getFullPrompt() {
        return this.fullPrompt;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final long getUpdatedAtMs() {
        return this.updatedAtMs;
    }

    public int hashCode() {
        int iA06 = AnonymousClass006.A06(this.createdAtMs, AnonymousClass005.A0I(this.fullPrompt, AnonymousClass005.A0I(this.freeText, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.id)))));
        long j = this.updatedAtMs;
        return iA06 + ((int) (j ^ (j >>> 32)));
    }

    public FeedPrompt(String str, String str2, String str3, String str4, long j, long j2) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.id = str;
        this.title = str2;
        this.freeText = str3;
        this.fullPrompt = str4;
        this.createdAtMs = j;
        this.updatedAtMs = j2;
    }

    public final FeedPrompt copy(String str, String str2, String str3, String str4, long j, long j2) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new FeedPrompt(str, str2, str3, str4, j, j2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeedPrompt(String str, String str2, String str3, String str4, long j, long j2, int i, C06H c06h) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4, j, j2);
    }
}
