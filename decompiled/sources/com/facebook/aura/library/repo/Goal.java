package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class Goal extends C06G {
    public final String createdAt;
    public final String description;
    public final String emoji;
    public final Long fixedPosition;
    public final String id;
    public final String imageUrl;
    public final Boolean isThread;
    public final String momentum;
    public final GoalMomentumStatus momentumStatus;
    public final String parentGoalId;
    public final String sessionId;
    public final Integer sortOrder;
    public final GoalStatus status;
    public final List<Goal> subGoals;
    public final String summary;
    public final String title;

    public final Goal copy(String str, String str2, String str3, String str4, GoalMomentumStatus goalMomentumStatus, String str5, String str6, String str7, String str8, String str9, Integer num, Long l, List<Goal> list, String str10, Boolean bool, GoalStatus goalStatus) {
        C7384Etj.A0Y(str, 0);
        return new Goal(str, str2, str3, str4, goalMomentumStatus, str5, str6, str7, str8, str9, num, l, list, str10, bool, goalStatus);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Goal) {
                Goal goal = (Goal) obj;
                if (!C7384Etj.areEqual(this.id, goal.id) || !C7384Etj.areEqual(this.title, goal.title) || !C7384Etj.areEqual(this.summary, goal.summary) || !C7384Etj.areEqual(this.momentum, goal.momentum) || this.momentumStatus != goal.momentumStatus || !C7384Etj.areEqual(this.description, goal.description) || !C7384Etj.areEqual(this.emoji, goal.emoji) || !C7384Etj.areEqual(this.imageUrl, goal.imageUrl) || !C7384Etj.areEqual(this.createdAt, goal.createdAt) || !C7384Etj.areEqual(this.parentGoalId, goal.parentGoalId) || !C7384Etj.areEqual(this.sortOrder, goal.sortOrder) || !C7384Etj.areEqual(this.fixedPosition, goal.fixedPosition) || !C7384Etj.areEqual(this.subGoals, goal.subGoals) || !C7384Etj.areEqual(this.sessionId, goal.sessionId) || !C7384Etj.areEqual(this.isThread, goal.isThread) || this.status != goal.status) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ Goal copy$default(Goal goal, String str, String str2, String str3, String str4, GoalMomentumStatus goalMomentumStatus, String str5, String str6, String str7, String str8, String str9, Integer num, Long l, List list, String str10, Boolean bool, GoalStatus goalStatus, int i, Object obj) {
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        GoalMomentumStatus goalMomentumStatus2 = goalMomentumStatus;
        String str15 = str5;
        String str16 = str6;
        String str17 = str7;
        String str18 = str8;
        String str19 = str9;
        Integer num2 = num;
        Long l2 = l;
        List list2 = list;
        String str20 = str10;
        Boolean bool2 = bool;
        GoalStatus goalStatus2 = goalStatus;
        if ((i & 1) != 0) {
            str11 = goal.id;
        }
        if ((i & 2) != 0) {
            str12 = goal.title;
        }
        if ((i & 4) != 0) {
            str13 = goal.summary;
        }
        if ((i & 8) != 0) {
            str14 = goal.momentum;
        }
        if ((i & 16) != 0) {
            goalMomentumStatus2 = goal.momentumStatus;
        }
        if ((i & 32) != 0) {
            str15 = goal.description;
        }
        if ((i & 64) != 0) {
            str16 = goal.emoji;
        }
        if ((i & 128) != 0) {
            str17 = goal.imageUrl;
        }
        if ((i & 256) != 0) {
            str18 = goal.createdAt;
        }
        if ((i & 512) != 0) {
            str19 = goal.parentGoalId;
        }
        if ((i & 1024) != 0) {
            num2 = goal.sortOrder;
        }
        if ((i & 2048) != 0) {
            l2 = goal.fixedPosition;
        }
        if ((i & 4096) != 0) {
            list2 = goal.subGoals;
        }
        if ((i & 8192) != 0) {
            str20 = goal.sessionId;
        }
        if ((i & 16384) != 0) {
            bool2 = goal.isThread;
        }
        if ((i & 32768) != 0) {
            goalStatus2 = goal.status;
        }
        String str21 = str14;
        return goal.copy(str11, str12, str13, str21, goalMomentumStatus2, str15, str16, str17, str18, str19, num2, l2, list2, str20, bool2, goalStatus2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.parentGoalId;
    }

    public final Integer component11() {
        return this.sortOrder;
    }

    public final Long component12() {
        return this.fixedPosition;
    }

    public final List<Goal> component13() {
        return this.subGoals;
    }

    public final String component14() {
        return this.sessionId;
    }

    public final Boolean component15() {
        return this.isThread;
    }

    public final GoalStatus component16() {
        return this.status;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.summary;
    }

    public final String component4() {
        return this.momentum;
    }

    public final GoalMomentumStatus component5() {
        return this.momentumStatus;
    }

    public final String component6() {
        return this.description;
    }

    public final String component7() {
        return this.emoji;
    }

    public final String component8() {
        return this.imageUrl;
    }

    public final String component9() {
        return this.createdAt;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final Long getFixedPosition() {
        return this.fixedPosition;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getMomentum() {
        return this.momentum;
    }

    public final GoalMomentumStatus getMomentumStatus() {
        return this.momentumStatus;
    }

    public final String getParentGoalId() {
        return this.parentGoalId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final Integer getSortOrder() {
        return this.sortOrder;
    }

    public final GoalStatus getStatus() {
        return this.status;
    }

    public final List<Goal> getSubGoals() {
        return this.subGoals;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((AnonymousClass001.A0G(this.id) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.summary)) * 31) + AnonymousClass006.A0G(this.momentum)) * 31) + AnonymousClass006.A0D(this.momentumStatus)) * 31) + AnonymousClass006.A0G(this.description)) * 31) + AnonymousClass006.A0G(this.emoji)) * 31) + AnonymousClass006.A0G(this.imageUrl)) * 31) + AnonymousClass006.A0G(this.createdAt)) * 31) + AnonymousClass006.A0G(this.parentGoalId)) * 31) + AnonymousClass006.A0D(this.sortOrder)) * 31) + AnonymousClass006.A0D(this.fixedPosition)) * 31) + AnonymousClass006.A0D(this.subGoals)) * 31) + AnonymousClass006.A0G(this.sessionId)) * 31) + AnonymousClass006.A0D(this.isThread)) * 31) + C3cH.A02(this.status);
    }

    public final boolean isCompleted() {
        return AnonymousClass002.A1Z(this.status, GoalStatus.COMPLETED);
    }

    public final Boolean isThread() {
        return this.isThread;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ Goal(String str, String str2, String str3, String str4, GoalMomentumStatus goalMomentumStatus, String str5, String str6, String str7, String str8, String str9, Integer num, Long l, List list, String str10, Boolean bool, GoalStatus goalStatus, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : goalMomentumStatus, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : num, (i & 2048) != 0 ? null : l, (i & 4096) != 0 ? null : list, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : bool, (i & 32768) != 0 ? null : goalStatus);
    }

    public Goal(String str, String str2, String str3, String str4, GoalMomentumStatus goalMomentumStatus, String str5, String str6, String str7, String str8, String str9, Integer num, Long l, List<Goal> list, String str10, Boolean bool, GoalStatus goalStatus) {
        C7384Etj.A0Y(str, 0);
        this.id = str;
        this.title = str2;
        this.summary = str3;
        this.momentum = str4;
        this.momentumStatus = goalMomentumStatus;
        this.description = str5;
        this.emoji = str6;
        this.imageUrl = str7;
        this.createdAt = str8;
        this.parentGoalId = str9;
        this.sortOrder = num;
        this.fixedPosition = l;
        this.subGoals = list;
        this.sessionId = str10;
        this.isThread = bool;
        this.status = goalStatus;
    }
}
