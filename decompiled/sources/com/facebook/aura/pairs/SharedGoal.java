package com.facebook.aura.pairs;

import X.AnonymousClass003;
import X.AnonymousClass005;
import java.util.List;

/* loaded from: classes3.dex */
public final class SharedGoal {
    public static final int $stable = 8;
    public final int completedTasks;
    public final String id;
    public final String revision;
    public final SharedGoalStatus status;
    public final String summary;
    public final List<SharedGoalTask> tasks;
    public final String title;
    public final int totalTasks;

    public final int getCompletedTasks() {
        return this.completedTasks;
    }

    public final String getId() {
        return this.id;
    }

    public final String getRevision() {
        return this.revision;
    }

    public final SharedGoalStatus getStatus() {
        return this.status;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final List<SharedGoalTask> getTasks() {
        return this.tasks;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTotalTasks() {
        return this.totalTasks;
    }

    public SharedGoal(String str, String str2, String str3, SharedGoalStatus sharedGoalStatus, String str4, List<SharedGoalTask> list, int i, int i2) {
        AnonymousClass005.A0x(str, str2, str3);
        AnonymousClass003.A0y(str4, list);
        this.id = str;
        this.title = str2;
        this.summary = str3;
        this.status = sharedGoalStatus;
        this.revision = str4;
        this.tasks = list;
        this.totalTasks = i;
        this.completedTasks = i2;
    }
}
