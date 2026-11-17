package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class GoalUpdate extends C06G {
    public final String createdAt;
    public final String description;
    public final String effectiveAt;
    public final String goalId;
    public final String summary;
    public final String title;
    public final String updateId;

    public static /* synthetic */ GoalUpdate copy$default(GoalUpdate goalUpdate, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        if ((i & 1) != 0) {
            str8 = goalUpdate.updateId;
        }
        if ((i & 2) != 0) {
            str9 = goalUpdate.goalId;
        }
        if ((i & 4) != 0) {
            str10 = goalUpdate.title;
        }
        if ((i & 8) != 0) {
            str11 = goalUpdate.summary;
        }
        if ((i & 16) != 0) {
            str12 = goalUpdate.description;
        }
        if ((i & 32) != 0) {
            str13 = goalUpdate.effectiveAt;
        }
        if ((i & 64) != 0) {
            str14 = goalUpdate.createdAt;
        }
        AnonymousClass005.A0x(str8, str9, str10);
        return new GoalUpdate(str8, str9, str10, str11, str12, str13, str14);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalUpdate) {
                GoalUpdate goalUpdate = (GoalUpdate) obj;
                if (!C7384Etj.areEqual(this.updateId, goalUpdate.updateId) || !C7384Etj.areEqual(this.goalId, goalUpdate.goalId) || !C7384Etj.areEqual(this.title, goalUpdate.title) || !C7384Etj.areEqual(this.summary, goalUpdate.summary) || !C7384Etj.areEqual(this.description, goalUpdate.description) || !C7384Etj.areEqual(this.effectiveAt, goalUpdate.effectiveAt) || !C7384Etj.areEqual(this.createdAt, goalUpdate.createdAt)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ GoalUpdate(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, C06H c06h) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }

    public final String component1() {
        return this.updateId;
    }

    public final String component2() {
        return this.goalId;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.summary;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.effectiveAt;
    }

    public final String component7() {
        return this.createdAt;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEffectiveAt() {
        return this.effectiveAt;
    }

    public final String getGoalId() {
        return this.goalId;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUpdateId() {
        return this.updateId;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0I(this.title, AnonymousClass005.A0I(this.goalId, AnonymousClass001.A0G(this.updateId))) + AnonymousClass006.A0G(this.summary)) * 31) + AnonymousClass006.A0G(this.description)) * 31) + AnonymousClass006.A0G(this.effectiveAt)) * 31) + AnonymousClass005.A0H(this.createdAt);
    }

    public final GoalUpdate copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AnonymousClass005.A0x(str, str2, str3);
        return new GoalUpdate(str, str2, str3, str4, str5, str6, str7);
    }

    public String toString() {
        return super.toString();
    }

    public GoalUpdate(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AnonymousClass005.A0x(str, str2, str3);
        this.updateId = str;
        this.goalId = str2;
        this.title = str3;
        this.summary = str4;
        this.description = str5;
        this.effectiveAt = str6;
        this.createdAt = str7;
    }
}
