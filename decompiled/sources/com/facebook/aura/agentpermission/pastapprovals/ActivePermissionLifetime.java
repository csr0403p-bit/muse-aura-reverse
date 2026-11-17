package com.facebook.aura.agentpermission.pastapprovals;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ActivePermissionLifetime {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ActivePermissionLifetime[] $VALUES;
    public static final Companion Companion;
    public static final ActivePermissionLifetime DURABLE;
    public static final ActivePermissionLifetime SESSION;
    public static final ActivePermissionLifetime TODAY;
    public final String wireValue;

    static {
        ActivePermissionLifetime activePermissionLifetime = new ActivePermissionLifetime("DURABLE", 0, "durable");
        DURABLE = activePermissionLifetime;
        ActivePermissionLifetime activePermissionLifetime2 = new ActivePermissionLifetime("SESSION", 1, "session");
        SESSION = activePermissionLifetime2;
        ActivePermissionLifetime activePermissionLifetime3 = new ActivePermissionLifetime("TODAY", 2, "today");
        TODAY = activePermissionLifetime3;
        ActivePermissionLifetime[] activePermissionLifetimeArr = {activePermissionLifetime, activePermissionLifetime2, activePermissionLifetime3};
        $VALUES = activePermissionLifetimeArr;
        $ENTRIES = C3cG.A0w(activePermissionLifetimeArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final ActivePermissionLifetime fromWire(String str) {
            ActivePermissionLifetime next;
            Iterator<ActivePermissionLifetime> it = ActivePermissionLifetime.getEntries().iterator();
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

    public static Ey9<ActivePermissionLifetime> getEntries() {
        return $ENTRIES;
    }

    public static ActivePermissionLifetime valueOf(String str) {
        return (ActivePermissionLifetime) Enum.valueOf(ActivePermissionLifetime.class, str);
    }

    public static ActivePermissionLifetime[] values() {
        return (ActivePermissionLifetime[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public ActivePermissionLifetime(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
