package com.facebook.aura.permissions.defaults;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PermissionDefaultMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PermissionDefaultMode[] $VALUES;
    public static final PermissionDefaultMode ALWAYS_ASK;
    public static final PermissionDefaultMode AUTO_ALLOW;
    public static final Companion Companion;
    public final String wireValue;

    static {
        PermissionDefaultMode permissionDefaultMode = new PermissionDefaultMode("AUTO_ALLOW", 0, "auto_allow");
        AUTO_ALLOW = permissionDefaultMode;
        PermissionDefaultMode permissionDefaultMode2 = new PermissionDefaultMode("ALWAYS_ASK", 1, "always_ask");
        ALWAYS_ASK = permissionDefaultMode2;
        PermissionDefaultMode[] permissionDefaultModeArr = {permissionDefaultMode, permissionDefaultMode2};
        $VALUES = permissionDefaultModeArr;
        $ENTRIES = C3cG.A0w(permissionDefaultModeArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final PermissionDefaultMode fromWire(String str) {
            PermissionDefaultMode next;
            Iterator<PermissionDefaultMode> it = PermissionDefaultMode.getEntries().iterator();
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
            PermissionDefaultMode permissionDefaultMode = next;
            return permissionDefaultMode == null ? PermissionDefaultMode.AUTO_ALLOW : permissionDefaultMode;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<PermissionDefaultMode> getEntries() {
        return $ENTRIES;
    }

    public static PermissionDefaultMode valueOf(String str) {
        return (PermissionDefaultMode) Enum.valueOf(PermissionDefaultMode.class, str);
    }

    public static PermissionDefaultMode[] values() {
        return (PermissionDefaultMode[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public PermissionDefaultMode(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
