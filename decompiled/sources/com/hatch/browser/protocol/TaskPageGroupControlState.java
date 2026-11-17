package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class TaskPageGroupControlState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ TaskPageGroupControlState[] $VALUES;
    public static final TaskPageGroupControlState AUTOMATION;
    public static final Companion Companion;
    public static final TaskPageGroupControlState HUMAN;
    public static final TaskPageGroupControlState STOPPED;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        TaskPageGroupControlState taskPageGroupControlState = new TaskPageGroupControlState("AUTOMATION", 0);
        AUTOMATION = taskPageGroupControlState;
        TaskPageGroupControlState taskPageGroupControlState2 = new TaskPageGroupControlState("HUMAN", 1);
        HUMAN = taskPageGroupControlState2;
        TaskPageGroupControlState taskPageGroupControlState3 = new TaskPageGroupControlState("STOPPED", 2);
        STOPPED = taskPageGroupControlState3;
        TaskPageGroupControlState[] taskPageGroupControlStateArr = {taskPageGroupControlState, taskPageGroupControlState2, taskPageGroupControlState3};
        $VALUES = taskPageGroupControlStateArr;
        $ENTRIES = C3cG.A0w(taskPageGroupControlStateArr);
        Companion = new Companion();
    }

    public static Ey9<TaskPageGroupControlState> getEntries() {
        return $ENTRIES;
    }

    public static TaskPageGroupControlState valueOf(String str) {
        return (TaskPageGroupControlState) Enum.valueOf(TaskPageGroupControlState.class, str);
    }

    public static TaskPageGroupControlState[] values() {
        return (TaskPageGroupControlState[]) $VALUES.clone();
    }

    public TaskPageGroupControlState(String str, int i) {
    }
}
