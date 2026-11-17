package com.facebook.aura.model;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchGatewayChatRole {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchGatewayChatRole[] $VALUES;
    public static final HatchGatewayChatRole ASSISTANT;
    public static final HatchGatewayChatRole USER;

    static {
        HatchGatewayChatRole hatchGatewayChatRole = new HatchGatewayChatRole("USER", 0);
        USER = hatchGatewayChatRole;
        HatchGatewayChatRole hatchGatewayChatRole2 = new HatchGatewayChatRole("ASSISTANT", 1);
        ASSISTANT = hatchGatewayChatRole2;
        HatchGatewayChatRole[] hatchGatewayChatRoleArr = {hatchGatewayChatRole, hatchGatewayChatRole2};
        $VALUES = hatchGatewayChatRoleArr;
        $ENTRIES = new F3w(hatchGatewayChatRoleArr);
    }

    public static Ey9<HatchGatewayChatRole> getEntries() {
        return $ENTRIES;
    }

    public static HatchGatewayChatRole valueOf(String str) {
        return (HatchGatewayChatRole) Enum.valueOf(HatchGatewayChatRole.class, str);
    }

    public static HatchGatewayChatRole[] values() {
        return (HatchGatewayChatRole[]) $VALUES.clone();
    }

    public HatchGatewayChatRole(String str, int i) {
    }
}
