package com.facebook.aura.skills.viewmodel;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SkillAccountsAction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SkillAccountsAction[] $VALUES;
    public static final SkillAccountsAction ADD_ACCOUNT;
    public static final SkillAccountsAction MANAGE_ACCOUNTS;
    public static final SkillAccountsAction NONE;

    static {
        SkillAccountsAction skillAccountsAction = new SkillAccountsAction(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0);
        NONE = skillAccountsAction;
        SkillAccountsAction skillAccountsAction2 = new SkillAccountsAction("MANAGE_ACCOUNTS", 1);
        MANAGE_ACCOUNTS = skillAccountsAction2;
        SkillAccountsAction skillAccountsAction3 = new SkillAccountsAction("ADD_ACCOUNT", 2);
        ADD_ACCOUNT = skillAccountsAction3;
        SkillAccountsAction[] skillAccountsActionArr = {skillAccountsAction, skillAccountsAction2, skillAccountsAction3};
        $VALUES = skillAccountsActionArr;
        $ENTRIES = C3cG.A0w(skillAccountsActionArr);
    }

    public static Ey9<SkillAccountsAction> getEntries() {
        return $ENTRIES;
    }

    public static SkillAccountsAction valueOf(String str) {
        return (SkillAccountsAction) Enum.valueOf(SkillAccountsAction.class, str);
    }

    public static SkillAccountsAction[] values() {
        return (SkillAccountsAction[]) $VALUES.clone();
    }

    public SkillAccountsAction(String str, int i) {
    }
}
