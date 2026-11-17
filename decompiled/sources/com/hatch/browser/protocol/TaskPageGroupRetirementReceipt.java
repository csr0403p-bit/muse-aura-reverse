package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C7384Etj;
import X.C8j5;

/* loaded from: classes6.dex */
public final class TaskPageGroupRetirementReceipt {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public boolean retired;
    public boolean settled;
    public BrowserTaskBinding task;

    public TaskPageGroupRetirementReceipt(BrowserTaskBinding browserTaskBinding, boolean z, boolean z2) {
        C7384Etj.A0Y(browserTaskBinding, 0);
        this.task = browserTaskBinding;
        this.retired = z;
        this.settled = z2;
    }

    public final TaskPageGroupRetirementReceipt copy(BrowserTaskBinding browserTaskBinding, boolean z, boolean z2) {
        C7384Etj.A0Y(browserTaskBinding, 0);
        return new TaskPageGroupRetirementReceipt(browserTaskBinding, z, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TaskPageGroupRetirementReceipt) {
                TaskPageGroupRetirementReceipt taskPageGroupRetirementReceipt = (TaskPageGroupRetirementReceipt) obj;
                if (!C7384Etj.areEqual(this.task, taskPageGroupRetirementReceipt.task) || this.retired != taskPageGroupRetirementReceipt.retired || this.settled != taskPageGroupRetirementReceipt.settled) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setTask(BrowserTaskBinding browserTaskBinding) {
        C7384Etj.A0Y(browserTaskBinding, 0);
        this.task = browserTaskBinding;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ TaskPageGroupRetirementReceipt copy$default(TaskPageGroupRetirementReceipt taskPageGroupRetirementReceipt, BrowserTaskBinding browserTaskBinding, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            browserTaskBinding = taskPageGroupRetirementReceipt.task;
        }
        if ((i & 2) != 0) {
            z = taskPageGroupRetirementReceipt.retired;
        }
        if ((i & 4) != 0) {
            z2 = taskPageGroupRetirementReceipt.settled;
        }
        return taskPageGroupRetirementReceipt.copy(browserTaskBinding, z, z2);
    }

    public final BrowserTaskBinding component1() {
        return this.task;
    }

    public final boolean component2() {
        return this.retired;
    }

    public final boolean component3() {
        return this.settled;
    }

    public final boolean getRetired() {
        return this.retired;
    }

    public final boolean getSettled() {
        return this.settled;
    }

    public final BrowserTaskBinding getTask() {
        return this.task;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass005.A0E(this.task), this.retired), this.settled);
    }

    public final void setRetired(boolean z) {
        this.retired = z;
    }

    public final void setSettled(boolean z) {
        this.settled = z;
    }

    public String toString() {
        BrowserTaskBinding browserTaskBinding = this.task;
        boolean z = this.retired;
        boolean z2 = this.settled;
        StringBuilder sbA0f = C3cG.A0f(browserTaskBinding, "TaskPageGroupRetirementReceipt(task=");
        sbA0f.append(", retired=");
        sbA0f.append(z);
        return C8j5.A0W(", settled=", sbA0f, z2);
    }
}
