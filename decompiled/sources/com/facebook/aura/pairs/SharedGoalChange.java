package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class SharedGoalChange extends C06G {
    public static final int $stable = 0;
    public final Boolean completed;
    public final String mutationId;
    public final String reason;
    public final Boolean removeTask;
    public final SharedGoalStatus status;
    public final String summary;
    public final String taskId;
    public final String taskTitle;
    public final String title;

    public SharedGoalChange(String str, String str2, String str3, SharedGoalStatus sharedGoalStatus, String str4, String str5, String str6, Boolean bool, Boolean bool2) {
        C7384Etj.A0Y(str, 0);
        this.mutationId = str;
        this.title = str2;
        this.summary = str3;
        this.status = sharedGoalStatus;
        this.reason = str4;
        this.taskId = str5;
        this.taskTitle = str6;
        this.completed = bool;
        this.removeTask = bool2;
    }

    public final SharedGoalChange copy(String str, String str2, String str3, SharedGoalStatus sharedGoalStatus, String str4, String str5, String str6, Boolean bool, Boolean bool2) {
        C7384Etj.A0Y(str, 0);
        return new SharedGoalChange(str, str2, str3, sharedGoalStatus, str4, str5, str6, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SharedGoalChange) {
                SharedGoalChange sharedGoalChange = (SharedGoalChange) obj;
                if (!C7384Etj.areEqual(this.mutationId, sharedGoalChange.mutationId) || !C7384Etj.areEqual(this.title, sharedGoalChange.title) || !C7384Etj.areEqual(this.summary, sharedGoalChange.summary) || this.status != sharedGoalChange.status || !C7384Etj.areEqual(this.reason, sharedGoalChange.reason) || !C7384Etj.areEqual(this.taskId, sharedGoalChange.taskId) || !C7384Etj.areEqual(this.taskTitle, sharedGoalChange.taskTitle) || !C7384Etj.areEqual(this.completed, sharedGoalChange.completed) || !C7384Etj.areEqual(this.removeTask, sharedGoalChange.removeTask)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SharedGoalChange copy$default(SharedGoalChange sharedGoalChange, String str, String str2, String str3, SharedGoalStatus sharedGoalStatus, String str4, String str5, String str6, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharedGoalChange.mutationId;
        }
        if ((i & 2) != 0) {
            str2 = sharedGoalChange.title;
        }
        if ((i & 4) != 0) {
            str3 = sharedGoalChange.summary;
        }
        if ((i & 8) != 0) {
            sharedGoalStatus = sharedGoalChange.status;
        }
        if ((i & 16) != 0) {
            str4 = sharedGoalChange.reason;
        }
        if ((i & 32) != 0) {
            str5 = sharedGoalChange.taskId;
        }
        if ((i & 64) != 0) {
            str6 = sharedGoalChange.taskTitle;
        }
        if ((i & 128) != 0) {
            bool = sharedGoalChange.completed;
        }
        if ((i & 256) != 0) {
            bool2 = sharedGoalChange.removeTask;
        }
        return sharedGoalChange.copy(str, str2, str3, sharedGoalStatus, str4, str5, str6, bool, bool2);
    }

    public final String component1() {
        return this.mutationId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.summary;
    }

    public final SharedGoalStatus component4() {
        return this.status;
    }

    public final String component5() {
        return this.reason;
    }

    public final String component6() {
        return this.taskId;
    }

    public final String component7() {
        return this.taskTitle;
    }

    public final Boolean component8() {
        return this.completed;
    }

    public final Boolean component9() {
        return this.removeTask;
    }

    public final Boolean getCompleted() {
        return this.completed;
    }

    public final String getMutationId() {
        return this.mutationId;
    }

    public final String getReason() {
        return this.reason;
    }

    public final Boolean getRemoveTask() {
        return this.removeTask;
    }

    public final SharedGoalStatus getStatus() {
        return this.status;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final String getTaskTitle() {
        return this.taskTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((((((((((((AnonymousClass001.A0G(this.mutationId) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.summary)) * 31) + AnonymousClass006.A0D(this.status)) * 31) + AnonymousClass006.A0G(this.reason)) * 31) + AnonymousClass006.A0G(this.taskId)) * 31) + AnonymousClass006.A0G(this.taskTitle)) * 31) + AnonymousClass006.A0D(this.completed)) * 31) + C3cH.A02(this.removeTask);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SharedGoalChange(String str, String str2, String str3, SharedGoalStatus sharedGoalStatus, String str4, String str5, String str6, Boolean bool, Boolean bool2, int i, C06H c06h) {
        this((i & 1) != 0 ? AnonymousClass002.A0k() : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : sharedGoalStatus, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : bool2);
    }

    public SharedGoalChange() {
        this(AnonymousClass002.A0k(), null, null, null, null, null, null, null, null);
    }
}
