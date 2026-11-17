package com.facebook.aura.conversation.repo;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class SubAgentActivityState extends C06G {
    public final long startedAtMs;
    public final SubAgentActivityStatus status;
    public final List<SubAgentTaskInfo> tasks;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SubAgentActivityState) {
                SubAgentActivityState subAgentActivityState = (SubAgentActivityState) obj;
                if (this.status != subAgentActivityState.status || !C7384Etj.areEqual(this.tasks, subAgentActivityState.tasks) || this.startedAtMs != subAgentActivityState.startedAtMs) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubAgentActivityState copy$default(SubAgentActivityState subAgentActivityState, SubAgentActivityStatus subAgentActivityStatus, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            subAgentActivityStatus = subAgentActivityState.status;
        }
        if ((i & 2) != 0) {
            list = subAgentActivityState.tasks;
        }
        if ((i & 4) != 0) {
            j = subAgentActivityState.startedAtMs;
        }
        return subAgentActivityState.copy(subAgentActivityStatus, list, j);
    }

    public final SubAgentActivityStatus component1() {
        return this.status;
    }

    public final List<SubAgentTaskInfo> component2() {
        return this.tasks;
    }

    public final long component3() {
        return this.startedAtMs;
    }

    public final long getStartedAtMs() {
        return this.startedAtMs;
    }

    public final SubAgentActivityStatus getStatus() {
        return this.status;
    }

    public final List<SubAgentTaskInfo> getTasks() {
        return this.tasks;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.startedAtMs, AnonymousClass005.A0F(this.tasks, AnonymousClass005.A0E(this.status)));
    }

    public SubAgentActivityState(SubAgentActivityStatus subAgentActivityStatus, List<SubAgentTaskInfo> list, long j) {
        AnonymousClass003.A0u(subAgentActivityStatus, list);
        this.status = subAgentActivityStatus;
        this.tasks = list;
        this.startedAtMs = j;
    }

    public final SubAgentActivityState copy(SubAgentActivityStatus subAgentActivityStatus, List<SubAgentTaskInfo> list, long j) {
        AnonymousClass003.A0u(subAgentActivityStatus, list);
        return new SubAgentActivityState(subAgentActivityStatus, list, j);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SubAgentActivityState(SubAgentActivityStatus subAgentActivityStatus, List list, long j, int i, C06H c06h) {
        this(subAgentActivityStatus, list, (i & 4) != 0 ? 0L : j);
    }
}
