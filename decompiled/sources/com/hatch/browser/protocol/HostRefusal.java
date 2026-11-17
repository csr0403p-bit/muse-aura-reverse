package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class HostRefusal {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HostRefusal[] $VALUES;
    public static final HostRefusal CONTROL_UNAVAILABLE;
    public static final Companion Companion;
    public static final HostRefusal POLICY_DENIED;
    public static final HostRefusal UNKNOWN_PAGE;
    public static final HostRefusal WRONG_TASK;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        HostRefusal hostRefusal = new HostRefusal("UNKNOWN_PAGE", 0);
        UNKNOWN_PAGE = hostRefusal;
        HostRefusal hostRefusal2 = new HostRefusal("WRONG_TASK", 1);
        WRONG_TASK = hostRefusal2;
        HostRefusal hostRefusal3 = new HostRefusal("CONTROL_UNAVAILABLE", 2);
        CONTROL_UNAVAILABLE = hostRefusal3;
        HostRefusal hostRefusal4 = new HostRefusal("POLICY_DENIED", 3);
        POLICY_DENIED = hostRefusal4;
        HostRefusal[] hostRefusalArr = {hostRefusal, hostRefusal2, hostRefusal3, hostRefusal4};
        $VALUES = hostRefusalArr;
        $ENTRIES = C3cG.A0w(hostRefusalArr);
        Companion = new Companion();
    }

    public static Ey9<HostRefusal> getEntries() {
        return $ENTRIES;
    }

    public static HostRefusal valueOf(String str) {
        return (HostRefusal) Enum.valueOf(HostRefusal.class, str);
    }

    public static HostRefusal[] values() {
        return (HostRefusal[]) $VALUES.clone();
    }

    public HostRefusal(String str, int i) {
    }
}
