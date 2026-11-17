package com.facebook.aura.localbrowser.core;

import X.C7384Etj;
import com.hatch.browser.protocol.TaskPageGroupControlState;

/* loaded from: classes6.dex */
public final class BrowserEngineGroupControl {
    public static final int $stable = 0;
    public final TaskPageGroupControlState control;
    public final long revision;

    public BrowserEngineGroupControl(long j, TaskPageGroupControlState taskPageGroupControlState) {
        C7384Etj.A0Y(taskPageGroupControlState, 1);
        this.revision = j;
        this.control = taskPageGroupControlState;
    }

    public final TaskPageGroupControlState getControl() {
        return this.control;
    }

    public final long getRevision() {
        return this.revision;
    }
}
