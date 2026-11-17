package com.facebook.aura.pairs;

/* loaded from: classes3.dex */
public abstract class SharedGoalViewModelKt {
    public static final String TAG = "SharedGoalViewModel";

    public static final SharedGoalEditJson toJson(SharedGoalChange sharedGoalChange, String str) {
        String str2 = sharedGoalChange.mutationId;
        String str3 = sharedGoalChange.title;
        String str4 = sharedGoalChange.summary;
        SharedGoalStatus sharedGoalStatus = sharedGoalChange.status;
        return new SharedGoalEditJson(str2, str, str3, str4, sharedGoalStatus != null ? sharedGoalStatus.getWire() : null, sharedGoalChange.reason, sharedGoalChange.taskId, sharedGoalChange.taskTitle, sharedGoalChange.completed, sharedGoalChange.removeTask);
    }

    public static final SharedGoalProblem toProblem(SharedGoalException sharedGoalException, SharedGoalProblem sharedGoalProblem) {
        Integer num = sharedGoalException.httpCode;
        if (num == null) {
            return sharedGoalProblem;
        }
        int iIntValue = num.intValue();
        return iIntValue == 403 ? SharedGoalProblem.NO_ACCESS : iIntValue == 404 ? SharedGoalProblem.MISSING : iIntValue == 429 ? SharedGoalProblem.RATE_LIMITED : iIntValue == 503 ? SharedGoalProblem.HOST_UNAVAILABLE : sharedGoalProblem;
    }
}
