package com.facebook.aura.model;

import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes.dex */
public final class TaskListResponse extends C06G {
    public static final int $stable = 8;
    public final List<HatchTaskEntry> tasks;

    public TaskListResponse(List<HatchTaskEntry> list) {
        C7384Etj.A0Y(list, 0);
        this.tasks = list;
    }

    public final TaskListResponse copy(List<HatchTaskEntry> list) {
        C7384Etj.A0Y(list, 0);
        return new TaskListResponse(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof TaskListResponse) && C7384Etj.areEqual(this.tasks, ((TaskListResponse) obj).tasks));
    }

    public static /* synthetic */ TaskListResponse copy$default(TaskListResponse taskListResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = taskListResponse.tasks;
        }
        C7384Etj.A0Y(list, 0);
        return new TaskListResponse(list);
    }

    public final List<HatchTaskEntry> component1() {
        return this.tasks;
    }

    public final List<HatchTaskEntry> getTasks() {
        return this.tasks;
    }

    public int hashCode() {
        return this.tasks.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
