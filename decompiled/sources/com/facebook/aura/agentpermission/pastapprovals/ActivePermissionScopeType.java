package com.facebook.aura.agentpermission.pastapprovals;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ActivePermissionScopeType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ActivePermissionScopeType[] $VALUES;
    public static final Companion Companion;
    public static final ActivePermissionScopeType FEED;
    public static final ActivePermissionScopeType IDEA;
    public static final ActivePermissionScopeType SCHEDULE;
    public static final ActivePermissionScopeType SPACE;
    public final String wireValue;

    static {
        ActivePermissionScopeType activePermissionScopeType = new ActivePermissionScopeType("SCHEDULE", 0, "schedule");
        SCHEDULE = activePermissionScopeType;
        ActivePermissionScopeType activePermissionScopeType2 = new ActivePermissionScopeType("SPACE", 1, "space");
        SPACE = activePermissionScopeType2;
        ActivePermissionScopeType activePermissionScopeType3 = new ActivePermissionScopeType("IDEA", 2, "idea");
        IDEA = activePermissionScopeType3;
        ActivePermissionScopeType activePermissionScopeType4 = new ActivePermissionScopeType("FEED", 3, "feed");
        FEED = activePermissionScopeType4;
        ActivePermissionScopeType[] activePermissionScopeTypeArr = {activePermissionScopeType, activePermissionScopeType2, activePermissionScopeType3, activePermissionScopeType4};
        $VALUES = activePermissionScopeTypeArr;
        $ENTRIES = C3cG.A0w(activePermissionScopeTypeArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final ActivePermissionScopeType fromWire(String str) {
            ActivePermissionScopeType next;
            Iterator<ActivePermissionScopeType> it = ActivePermissionScopeType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.getWireValue(), str)) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<ActivePermissionScopeType> getEntries() {
        return $ENTRIES;
    }

    public static ActivePermissionScopeType valueOf(String str) {
        return (ActivePermissionScopeType) Enum.valueOf(ActivePermissionScopeType.class, str);
    }

    public static ActivePermissionScopeType[] values() {
        return (ActivePermissionScopeType[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public ActivePermissionScopeType(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
