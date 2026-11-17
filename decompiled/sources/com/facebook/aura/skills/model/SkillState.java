package com.facebook.aura.skills.model;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SkillState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SkillState[] $VALUES;
    public static final SkillState COMING_SOON;
    public static final SkillState CONNECTED;
    public static final SkillState DISCONNECTED;

    static {
        SkillState skillState = new SkillState("CONNECTED", 0);
        CONNECTED = skillState;
        SkillState skillState2 = new SkillState("DISCONNECTED", 1);
        DISCONNECTED = skillState2;
        SkillState skillState3 = new SkillState("COMING_SOON", 2);
        COMING_SOON = skillState3;
        SkillState[] skillStateArr = {skillState, skillState2, skillState3};
        $VALUES = skillStateArr;
        $ENTRIES = new F3w(skillStateArr);
    }

    public static Ey9<SkillState> getEntries() {
        return $ENTRIES;
    }

    public static SkillState valueOf(String str) {
        return (SkillState) Enum.valueOf(SkillState.class, str);
    }

    public static SkillState[] values() {
        return (SkillState[]) $VALUES.clone();
    }

    public SkillState(String str, int i) {
    }
}
