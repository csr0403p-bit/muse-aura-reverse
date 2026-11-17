package com.facebook.aura.status.repo;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C3cI;
import X.C7384Etj;
import com.facebook.aura.model.HatchTaskEntry;
import com.facebook.aura.model.HatchTaskRunEntry;
import java.util.List;

/* loaded from: classes2.dex */
public final class TasksData extends C06G {
    public final boolean isLoading;
    public final List<HatchTaskRunEntry> runs;
    public final List<HatchTaskEntry> tasks;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TasksData) {
                TasksData tasksData = (TasksData) obj;
                if (!C7384Etj.areEqual(this.tasks, tasksData.tasks) || !C7384Etj.areEqual(this.runs, tasksData.runs) || this.isLoading != tasksData.isLoading) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TasksData copy$default(TasksData tasksData, List list, List list2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tasksData.tasks;
        }
        if ((i & 2) != 0) {
            list2 = tasksData.runs;
        }
        if ((i & 4) != 0) {
            z = tasksData.isLoading;
        }
        return tasksData.copy(list, list2, z);
    }

    public final List<HatchTaskEntry> component1() {
        return this.tasks;
    }

    public final List<HatchTaskRunEntry> component2() {
        return this.runs;
    }

    public final boolean component3() {
        return this.isLoading;
    }

    public final List<HatchTaskRunEntry> getRuns() {
        return this.runs;
    }

    public final List<HatchTaskEntry> getTasks() {
        return this.tasks;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.runs, AnonymousClass005.A0E(this.tasks)), this.isLoading);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public TasksData(List<HatchTaskEntry> list, List<HatchTaskRunEntry> list2, boolean z) {
        AnonymousClass003.A0u(list, list2);
        this.tasks = list;
        this.runs = list2;
        this.isLoading = z;
    }

    public final TasksData copy(List<HatchTaskEntry> list, List<HatchTaskRunEntry> list2, boolean z) {
        AnonymousClass003.A0u(list, list2);
        return new TasksData(list, list2, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TasksData(List list, List list2, boolean z, int i, C06H c06h) {
        this(C3cI.A10(list, i), C3cI.A11(list2, i), AnonymousClass005.A1O(i, z));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TasksData() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(c0881AGi, c0881AGi, false);
    }
}
