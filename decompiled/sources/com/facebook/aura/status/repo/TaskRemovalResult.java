package com.facebook.aura.status.repo;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.R;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class TaskRemovalResult {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ TaskRemovalResult[] $VALUES;
    public static final TaskRemovalResult FAILED;
    public static final TaskRemovalResult FORBIDDEN;
    public static final TaskRemovalResult SUCCESS;
    public final int toastRes;

    static {
        TaskRemovalResult taskRemovalResult = new TaskRemovalResult("SUCCESS", 0, R.string._name_removed__res_0x7f12105f);
        SUCCESS = taskRemovalResult;
        TaskRemovalResult taskRemovalResult2 = new TaskRemovalResult("FORBIDDEN", 1, R.string._name_removed__res_0x7f12105e);
        FORBIDDEN = taskRemovalResult2;
        TaskRemovalResult taskRemovalResult3 = new TaskRemovalResult(CvmMigrationStatusJson.STAGE_FAILED, 2, R.string._name_removed__res_0x7f12105d);
        FAILED = taskRemovalResult3;
        TaskRemovalResult[] taskRemovalResultArr = {taskRemovalResult, taskRemovalResult2, taskRemovalResult3};
        $VALUES = taskRemovalResultArr;
        $ENTRIES = C3cG.A0w(taskRemovalResultArr);
    }

    public static Ey9<TaskRemovalResult> getEntries() {
        return $ENTRIES;
    }

    public static TaskRemovalResult valueOf(String str) {
        return (TaskRemovalResult) Enum.valueOf(TaskRemovalResult.class, str);
    }

    public static TaskRemovalResult[] values() {
        return (TaskRemovalResult[]) $VALUES.clone();
    }

    public final int getToastRes() {
        return this.toastRes;
    }

    public TaskRemovalResult(String str, int i, int i2) {
        this.toastRes = i2;
    }
}
