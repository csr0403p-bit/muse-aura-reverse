package com.hatch.browser.protocol;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class TaskPageGroupControlChange {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public TaskPageGroupControlState control;
    public TaskPageGroupControlRevision revision;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TaskPageGroupControlChange) {
                TaskPageGroupControlChange taskPageGroupControlChange = (TaskPageGroupControlChange) obj;
                if (!C7384Etj.areEqual(this.revision, taskPageGroupControlChange.revision) || this.control != taskPageGroupControlChange.control) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setControl(TaskPageGroupControlState taskPageGroupControlState) {
        C7384Etj.A0Y(taskPageGroupControlState, 0);
        this.control = taskPageGroupControlState;
    }

    public final void setRevision(TaskPageGroupControlRevision taskPageGroupControlRevision) {
        C7384Etj.A0Y(taskPageGroupControlRevision, 0);
        this.revision = taskPageGroupControlRevision;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ TaskPageGroupControlChange copy$default(TaskPageGroupControlChange taskPageGroupControlChange, TaskPageGroupControlRevision taskPageGroupControlRevision, TaskPageGroupControlState taskPageGroupControlState, int i, Object obj) {
        if ((i & 1) != 0) {
            taskPageGroupControlRevision = taskPageGroupControlChange.revision;
        }
        if ((i & 2) != 0) {
            taskPageGroupControlState = taskPageGroupControlChange.control;
        }
        AnonymousClass003.A0u(taskPageGroupControlRevision, taskPageGroupControlState);
        return new TaskPageGroupControlChange(taskPageGroupControlRevision, taskPageGroupControlState);
    }

    public final TaskPageGroupControlRevision component1() {
        return this.revision;
    }

    public final TaskPageGroupControlState component2() {
        return this.control;
    }

    public final TaskPageGroupControlState getControl() {
        return this.control;
    }

    public final TaskPageGroupControlRevision getRevision() {
        return this.revision;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.control, AnonymousClass005.A0E(this.revision));
    }

    public String toString() {
        return C3cJ.A0L(this.control, ", control=", C3cG.A0f(this.revision, "TaskPageGroupControlChange(revision="));
    }

    public TaskPageGroupControlChange(TaskPageGroupControlRevision taskPageGroupControlRevision, TaskPageGroupControlState taskPageGroupControlState) {
        AnonymousClass003.A0u(taskPageGroupControlRevision, taskPageGroupControlState);
        this.revision = taskPageGroupControlRevision;
        this.control = taskPageGroupControlState;
    }

    public final TaskPageGroupControlChange copy(TaskPageGroupControlRevision taskPageGroupControlRevision, TaskPageGroupControlState taskPageGroupControlState) {
        AnonymousClass003.A0u(taskPageGroupControlRevision, taskPageGroupControlState);
        return new TaskPageGroupControlChange(taskPageGroupControlRevision, taskPageGroupControlState);
    }
}
