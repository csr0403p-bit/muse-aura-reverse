package com.facebook.aura.agentpermission;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AgentPermissionMessageEditorError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AgentPermissionMessageEditorError[] $VALUES;
    public static final AgentPermissionMessageEditorError BODY_TOO_LONG;
    public static final AgentPermissionMessageEditorError EMPTY_MESSAGE;
    public static final AgentPermissionMessageEditorError INVALID_MESSAGE;
    public static final AgentPermissionMessageEditorError SAVE_FAILED;
    public static final AgentPermissionMessageEditorError SUBJECT_TOO_LONG;

    static {
        AgentPermissionMessageEditorError agentPermissionMessageEditorError = new AgentPermissionMessageEditorError("SAVE_FAILED", 0);
        SAVE_FAILED = agentPermissionMessageEditorError;
        AgentPermissionMessageEditorError agentPermissionMessageEditorError2 = new AgentPermissionMessageEditorError("INVALID_MESSAGE", 1);
        INVALID_MESSAGE = agentPermissionMessageEditorError2;
        AgentPermissionMessageEditorError agentPermissionMessageEditorError3 = new AgentPermissionMessageEditorError("SUBJECT_TOO_LONG", 2);
        SUBJECT_TOO_LONG = agentPermissionMessageEditorError3;
        AgentPermissionMessageEditorError agentPermissionMessageEditorError4 = new AgentPermissionMessageEditorError("BODY_TOO_LONG", 3);
        BODY_TOO_LONG = agentPermissionMessageEditorError4;
        AgentPermissionMessageEditorError agentPermissionMessageEditorError5 = new AgentPermissionMessageEditorError("EMPTY_MESSAGE", 4);
        EMPTY_MESSAGE = agentPermissionMessageEditorError5;
        AgentPermissionMessageEditorError[] agentPermissionMessageEditorErrorArr = {agentPermissionMessageEditorError, agentPermissionMessageEditorError2, agentPermissionMessageEditorError3, agentPermissionMessageEditorError4, agentPermissionMessageEditorError5};
        $VALUES = agentPermissionMessageEditorErrorArr;
        $ENTRIES = C3cG.A0w(agentPermissionMessageEditorErrorArr);
    }

    public static Ey9<AgentPermissionMessageEditorError> getEntries() {
        return $ENTRIES;
    }

    public static AgentPermissionMessageEditorError valueOf(String str) {
        return (AgentPermissionMessageEditorError) Enum.valueOf(AgentPermissionMessageEditorError.class, str);
    }

    public static AgentPermissionMessageEditorError[] values() {
        return (AgentPermissionMessageEditorError[]) $VALUES.clone();
    }

    public AgentPermissionMessageEditorError(String str, int i) {
    }
}
