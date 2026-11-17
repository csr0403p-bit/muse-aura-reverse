package com.facebook.aura.library.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class GoalsPaginationJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String cursor;
    public final boolean hasNextPage;
    public final boolean has_next_page;
    public final String nextCursor;
    public final String next_cursor;

    public final class Companion {
        public final C9hr<GoalsPaginationJson> serializer() {
            return GoalsPaginationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(GoalsPaginationJson goalsPaginationJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || goalsPaginationJson.next_cursor != null) {
            c9j5.AAP(goalsPaginationJson.next_cursor, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || goalsPaginationJson.nextCursor != null) {
            c9j5.AAP(goalsPaginationJson.nextCursor, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || goalsPaginationJson.cursor != null) {
            c9j5.AAP(goalsPaginationJson.cursor, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || goalsPaginationJson.has_next_page) {
            c9j5.AA7(c9iZ, 3, goalsPaginationJson.has_next_page);
        }
        if (zAfR || goalsPaginationJson.hasNextPage) {
            c9j5.AA7(c9iZ, 4, goalsPaginationJson.hasNextPage);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalsPaginationJson) {
                GoalsPaginationJson goalsPaginationJson = (GoalsPaginationJson) obj;
                if (!C7384Etj.areEqual(this.next_cursor, goalsPaginationJson.next_cursor) || !C7384Etj.areEqual(this.nextCursor, goalsPaginationJson.nextCursor) || !C7384Etj.areEqual(this.cursor, goalsPaginationJson.cursor) || this.has_next_page != goalsPaginationJson.has_next_page || this.hasNextPage != goalsPaginationJson.hasNextPage) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GoalsPaginationJson copy$default(GoalsPaginationJson goalsPaginationJson, String str, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goalsPaginationJson.next_cursor;
        }
        if ((i & 2) != 0) {
            str2 = goalsPaginationJson.nextCursor;
        }
        if ((i & 4) != 0) {
            str3 = goalsPaginationJson.cursor;
        }
        if ((i & 8) != 0) {
            z = goalsPaginationJson.has_next_page;
        }
        if ((i & 16) != 0) {
            z2 = goalsPaginationJson.hasNextPage;
        }
        return goalsPaginationJson.copy(str, str2, str3, z, z2);
    }

    public final String component1() {
        return this.next_cursor;
    }

    public final String component2() {
        return this.nextCursor;
    }

    public final String component3() {
        return this.cursor;
    }

    public final boolean component4() {
        return this.has_next_page;
    }

    public final boolean component5() {
        return this.hasNextPage;
    }

    public final GoalsPaginationJson copy(String str, String str2, String str3, boolean z, boolean z2) {
        return new GoalsPaginationJson(str, str2, str3, z, z2);
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    public final boolean getHas_next_page() {
        return this.has_next_page;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final String getNext_cursor() {
        return this.next_cursor;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(((((AnonymousClass006.A0G(this.next_cursor) * 31) + AnonymousClass006.A0G(this.nextCursor)) * 31) + AnonymousClass005.A0H(this.cursor)) * 31, this.has_next_page), this.hasNextPage);
    }

    public final boolean resolvedHasNextPage() {
        return this.has_next_page || this.hasNextPage || resolvedNextCursor() != null;
    }

    public final String resolvedNextCursor() {
        String str = this.next_cursor;
        if (str != null && !C7BY.A0j(str)) {
            return str;
        }
        String str2 = this.nextCursor;
        if (str2 != null && !C7BY.A0j(str2)) {
            return str2;
        }
        String str3 = this.cursor;
        if (str3 == null || C7BY.A0j(str3)) {
            return null;
        }
        return str3;
    }

    public GoalsPaginationJson(String str, String str2, String str3, boolean z, boolean z2) {
        this.next_cursor = str;
        this.nextCursor = str2;
        this.cursor = str3;
        this.has_next_page = z;
        this.hasNextPage = z2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GoalsPaginationJson(String str, String str2, String str3, boolean z, boolean z2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, AnonymousClass005.A1P(i, z), C3cI.A1S(i, z2));
    }

    public /* synthetic */ GoalsPaginationJson(int i, String str, String str2, String str3, boolean z, boolean z2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.next_cursor = null;
        } else {
            this.next_cursor = str;
        }
        if ((i & 2) == 0) {
            this.nextCursor = null;
        } else {
            this.nextCursor = str2;
        }
        if ((i & 4) == 0) {
            this.cursor = null;
        } else {
            this.cursor = str3;
        }
        if ((i & 8) == 0) {
            this.has_next_page = false;
        } else {
            this.has_next_page = z;
        }
        if ((i & 16) == 0) {
            this.hasNextPage = false;
        } else {
            this.hasNextPage = z2;
        }
    }

    public GoalsPaginationJson() {
        this(null, null, null, false, false);
    }
}
