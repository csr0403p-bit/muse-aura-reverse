package com.facebook.aura.agentpermission;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ApprovalHistoryLoadingState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ApprovalHistoryLoadingState[] $VALUES;
    public static final ApprovalHistoryLoadingState ERROR;
    public static final ApprovalHistoryLoadingState IDLE;
    public static final ApprovalHistoryLoadingState LOADING;
    public static final ApprovalHistoryLoadingState SUCCESS;

    static {
        ApprovalHistoryLoadingState approvalHistoryLoadingState = new ApprovalHistoryLoadingState("IDLE", 0);
        IDLE = approvalHistoryLoadingState;
        ApprovalHistoryLoadingState approvalHistoryLoadingState2 = new ApprovalHistoryLoadingState("LOADING", 1);
        LOADING = approvalHistoryLoadingState2;
        ApprovalHistoryLoadingState approvalHistoryLoadingState3 = new ApprovalHistoryLoadingState("SUCCESS", 2);
        SUCCESS = approvalHistoryLoadingState3;
        ApprovalHistoryLoadingState approvalHistoryLoadingState4 = new ApprovalHistoryLoadingState("ERROR", 3);
        ERROR = approvalHistoryLoadingState4;
        ApprovalHistoryLoadingState[] approvalHistoryLoadingStateArr = {approvalHistoryLoadingState, approvalHistoryLoadingState2, approvalHistoryLoadingState3, approvalHistoryLoadingState4};
        $VALUES = approvalHistoryLoadingStateArr;
        $ENTRIES = C3cG.A0w(approvalHistoryLoadingStateArr);
    }

    public static Ey9<ApprovalHistoryLoadingState> getEntries() {
        return $ENTRIES;
    }

    public static ApprovalHistoryLoadingState valueOf(String str) {
        return (ApprovalHistoryLoadingState) Enum.valueOf(ApprovalHistoryLoadingState.class, str);
    }

    public static ApprovalHistoryLoadingState[] values() {
        return (ApprovalHistoryLoadingState[]) $VALUES.clone();
    }

    public ApprovalHistoryLoadingState(String str, int i) {
    }
}
