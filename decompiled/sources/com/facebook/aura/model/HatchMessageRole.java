package com.facebook.aura.model;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchMessageRole {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchMessageRole[] $VALUES;
    public static final HatchMessageRole AGENT;
    public static final HatchMessageRole USER;

    static {
        HatchMessageRole hatchMessageRole = new HatchMessageRole("USER", 0);
        USER = hatchMessageRole;
        HatchMessageRole hatchMessageRole2 = new HatchMessageRole("AGENT", 1);
        AGENT = hatchMessageRole2;
        HatchMessageRole[] hatchMessageRoleArr = {hatchMessageRole, hatchMessageRole2};
        $VALUES = hatchMessageRoleArr;
        $ENTRIES = new F3w(hatchMessageRoleArr);
    }

    public static Ey9<HatchMessageRole> getEntries() {
        return $ENTRIES;
    }

    public static HatchMessageRole valueOf(String str) {
        return (HatchMessageRole) Enum.valueOf(HatchMessageRole.class, str);
    }

    public static HatchMessageRole[] values() {
        return (HatchMessageRole[]) $VALUES.clone();
    }

    public HatchMessageRole(String str, int i) {
    }
}
