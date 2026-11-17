package com.facebook.aura.feed.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FeedPaginationJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String next_cursor;
    public final String prev_cursor;

    public final class Companion {
        public final C9hr<FeedPaginationJson> serializer() {
            return FeedPaginationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_feed_repo_repo(FeedPaginationJson feedPaginationJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || feedPaginationJson.next_cursor != null) {
            c9j5.AAP(feedPaginationJson.next_cursor, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || feedPaginationJson.prev_cursor != null) {
            c9j5.AAP(feedPaginationJson.prev_cursor, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedPaginationJson) {
                FeedPaginationJson feedPaginationJson = (FeedPaginationJson) obj;
                if (!C7384Etj.areEqual(this.next_cursor, feedPaginationJson.next_cursor) || !C7384Etj.areEqual(this.prev_cursor, feedPaginationJson.prev_cursor)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedPaginationJson copy$default(FeedPaginationJson feedPaginationJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedPaginationJson.next_cursor;
        }
        if ((i & 2) != 0) {
            str2 = feedPaginationJson.prev_cursor;
        }
        return new FeedPaginationJson(str, str2);
    }

    public final String component1() {
        return this.next_cursor;
    }

    public final String component2() {
        return this.prev_cursor;
    }

    public final FeedPaginationJson copy(String str, String str2) {
        return new FeedPaginationJson(str, str2);
    }

    public final String getNext_cursor() {
        return this.next_cursor;
    }

    public final String getPrev_cursor() {
        return this.prev_cursor;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.next_cursor) * 31) + AnonymousClass005.A0H(this.prev_cursor);
    }

    public FeedPaginationJson(String str, String str2) {
        this.next_cursor = str;
        this.prev_cursor = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FeedPaginationJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.next_cursor = null;
        } else {
            this.next_cursor = str;
        }
        if ((i & 2) == 0) {
            this.prev_cursor = null;
        } else {
            this.prev_cursor = str2;
        }
    }

    public /* synthetic */ FeedPaginationJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public FeedPaginationJson() {
        this(null, null);
    }
}
