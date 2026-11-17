package com.facebook.aura.skills.viewmodel;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SkillPermissionsLoadingState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SkillPermissionsLoadingState[] $VALUES;
    public static final SkillPermissionsLoadingState ERROR;
    public static final SkillPermissionsLoadingState IDLE;
    public static final SkillPermissionsLoadingState LOADING;
    public static final SkillPermissionsLoadingState SUCCESS;

    static {
        SkillPermissionsLoadingState skillPermissionsLoadingState = new SkillPermissionsLoadingState("IDLE", 0);
        IDLE = skillPermissionsLoadingState;
        SkillPermissionsLoadingState skillPermissionsLoadingState2 = new SkillPermissionsLoadingState("LOADING", 1);
        LOADING = skillPermissionsLoadingState2;
        SkillPermissionsLoadingState skillPermissionsLoadingState3 = new SkillPermissionsLoadingState("SUCCESS", 2);
        SUCCESS = skillPermissionsLoadingState3;
        SkillPermissionsLoadingState skillPermissionsLoadingState4 = new SkillPermissionsLoadingState("ERROR", 3);
        ERROR = skillPermissionsLoadingState4;
        SkillPermissionsLoadingState[] skillPermissionsLoadingStateArr = {skillPermissionsLoadingState, skillPermissionsLoadingState2, skillPermissionsLoadingState3, skillPermissionsLoadingState4};
        $VALUES = skillPermissionsLoadingStateArr;
        $ENTRIES = C3cG.A0w(skillPermissionsLoadingStateArr);
    }

    public static Ey9<SkillPermissionsLoadingState> getEntries() {
        return $ENTRIES;
    }

    public static SkillPermissionsLoadingState valueOf(String str) {
        return (SkillPermissionsLoadingState) Enum.valueOf(SkillPermissionsLoadingState.class, str);
    }

    public static SkillPermissionsLoadingState[] values() {
        return (SkillPermissionsLoadingState[]) $VALUES.clone();
    }

    public SkillPermissionsLoadingState(String str, int i) {
    }
}
