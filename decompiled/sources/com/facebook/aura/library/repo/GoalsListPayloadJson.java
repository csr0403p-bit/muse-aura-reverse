package com.facebook.aura.library.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class GoalsListPayloadJson extends C06G {
    public final String cursor;
    public final List<GoalJson> goals;
    public final boolean hasNextPage;
    public final boolean has_next_page;
    public final String nextCursor;
    public final String next_cursor;
    public final GoalsPaginationJson pagination;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, GoalsListPayloadJson$Companion$$childSerializers$1.INSTANCE), null, null, null, null, null, null};

    public final class Companion {
        public final C9hr<GoalsListPayloadJson> serializer() {
            return GoalsListPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public GoalsListPayloadJson() {
        this(C0881AGi.A00, null, null, null, null, false, false);
    }

    public final GoalsListPayloadJson copy(List<GoalJson> list, GoalsPaginationJson goalsPaginationJson, String str, String str2, String str3, boolean z, boolean z2) {
        C7384Etj.A0Y(list, 0);
        return new GoalsListPayloadJson(list, goalsPaginationJson, str, str2, str3, z, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalsListPayloadJson) {
                GoalsListPayloadJson goalsListPayloadJson = (GoalsListPayloadJson) obj;
                if (!C7384Etj.areEqual(this.goals, goalsListPayloadJson.goals) || !C7384Etj.areEqual(this.pagination, goalsListPayloadJson.pagination) || !C7384Etj.areEqual(this.next_cursor, goalsListPayloadJson.next_cursor) || !C7384Etj.areEqual(this.nextCursor, goalsListPayloadJson.nextCursor) || !C7384Etj.areEqual(this.cursor, goalsListPayloadJson.cursor) || this.has_next_page != goalsListPayloadJson.has_next_page || this.hasNextPage != goalsListPayloadJson.hasNextPage) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GoalsListPayloadJson copy$default(GoalsListPayloadJson goalsListPayloadJson, List list, GoalsPaginationJson goalsPaginationJson, String str, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = goalsListPayloadJson.goals;
        }
        if ((i & 2) != 0) {
            goalsPaginationJson = goalsListPayloadJson.pagination;
        }
        if ((i & 4) != 0) {
            str = goalsListPayloadJson.next_cursor;
        }
        if ((i & 8) != 0) {
            str2 = goalsListPayloadJson.nextCursor;
        }
        if ((i & 16) != 0) {
            str3 = goalsListPayloadJson.cursor;
        }
        if ((i & 32) != 0) {
            z = goalsListPayloadJson.has_next_page;
        }
        if ((i & 64) != 0) {
            z2 = goalsListPayloadJson.hasNextPage;
        }
        return goalsListPayloadJson.copy(list, goalsPaginationJson, str, str2, str3, z, z2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(GoalsListPayloadJson goalsListPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(goalsListPayloadJson.goals)) {
            c9j5.AAQ(goalsListPayloadJson.goals, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || goalsListPayloadJson.pagination != null) {
            c9j5.AAP(goalsListPayloadJson.pagination, GoalsPaginationJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || goalsListPayloadJson.next_cursor != null) {
            c9j5.AAP(goalsListPayloadJson.next_cursor, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || goalsListPayloadJson.nextCursor != null) {
            c9j5.AAP(goalsListPayloadJson.nextCursor, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || goalsListPayloadJson.cursor != null) {
            c9j5.AAP(goalsListPayloadJson.cursor, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || goalsListPayloadJson.has_next_page) {
            c9j5.AA7(c9iZ, 5, goalsListPayloadJson.has_next_page);
        }
        if (zAfR || goalsListPayloadJson.hasNextPage) {
            c9j5.AA7(c9iZ, 6, goalsListPayloadJson.hasNextPage);
        }
    }

    public final List<GoalJson> component1() {
        return this.goals;
    }

    public final GoalsPaginationJson component2() {
        return this.pagination;
    }

    public final String component3() {
        return this.next_cursor;
    }

    public final String component4() {
        return this.nextCursor;
    }

    public final String component5() {
        return this.cursor;
    }

    public final boolean component6() {
        return this.has_next_page;
    }

    public final boolean component7() {
        return this.hasNextPage;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final List<GoalJson> getGoals() {
        return this.goals;
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

    public final GoalsPaginationJson getPagination() {
        return this.pagination;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01((((((((AnonymousClass005.A0E(this.goals) + AnonymousClass006.A0D(this.pagination)) * 31) + AnonymousClass006.A0G(this.next_cursor)) * 31) + AnonymousClass006.A0G(this.nextCursor)) * 31) + AnonymousClass005.A0H(this.cursor)) * 31, this.has_next_page), this.hasNextPage);
    }

    public final boolean resolvedHasNextPage() {
        GoalsPaginationJson goalsPaginationJson = this.pagination;
        return (goalsPaginationJson != null && goalsPaginationJson.resolvedHasNextPage()) || this.has_next_page || this.hasNextPage || resolvedNextCursor() != null;
    }

    public final String resolvedNextCursor() {
        String strResolvedNextCursor;
        GoalsPaginationJson goalsPaginationJson = this.pagination;
        if ((goalsPaginationJson != null && (strResolvedNextCursor = goalsPaginationJson.resolvedNextCursor()) != null) || ((strResolvedNextCursor = this.next_cursor) != null && !C7BY.A0j(strResolvedNextCursor))) {
            return strResolvedNextCursor;
        }
        String str = this.nextCursor;
        if (str != null && !C7BY.A0j(str)) {
            return str;
        }
        String str2 = this.cursor;
        if (str2 == null || C7BY.A0j(str2)) {
            return null;
        }
        return str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GoalsListPayloadJson(int i, List list, GoalsPaginationJson goalsPaginationJson, String str, String str2, String str3, boolean z, boolean z2, C2hx c2hx) {
        this.goals = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.pagination = null;
        } else {
            this.pagination = goalsPaginationJson;
        }
        if ((i & 4) == 0) {
            this.next_cursor = null;
        } else {
            this.next_cursor = str;
        }
        if ((i & 8) == 0) {
            this.nextCursor = null;
        } else {
            this.nextCursor = str2;
        }
        if ((i & 16) == 0) {
            this.cursor = null;
        } else {
            this.cursor = str3;
        }
        if ((i & 32) == 0) {
            this.has_next_page = false;
        } else {
            this.has_next_page = z;
        }
        if ((i & 64) == 0) {
            this.hasNextPage = false;
        } else {
            this.hasNextPage = z2;
        }
    }

    public GoalsListPayloadJson(List<GoalJson> list, GoalsPaginationJson goalsPaginationJson, String str, String str2, String str3, boolean z, boolean z2) {
        C7384Etj.A0Y(list, 0);
        this.goals = list;
        this.pagination = goalsPaginationJson;
        this.next_cursor = str;
        this.nextCursor = str2;
        this.cursor = str3;
        this.has_next_page = z;
        this.hasNextPage = z2;
    }

    public /* synthetic */ GoalsListPayloadJson(List list, GoalsPaginationJson goalsPaginationJson, String str, String str2, String str3, boolean z, boolean z2, int i, C06H c06h) {
        this(C3cI.A10(list, i), (i & 2) != 0 ? null : goalsPaginationJson, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z, C3cH.A1M(i, z2));
    }
}
