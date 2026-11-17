package com.facebook.aura.startup.appjob;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ScopeFilter {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ScopeFilter[] $VALUES;
    public static final ScopeFilter ALL_PROCESSES_ONLY;
    public static final ScopeFilter FOREGROUND_SERVICE;
    public static final ScopeFilter FULL;

    static {
        ScopeFilter scopeFilter = new ScopeFilter("ALL_PROCESSES_ONLY", 0);
        ALL_PROCESSES_ONLY = scopeFilter;
        ScopeFilter scopeFilter2 = new ScopeFilter("FOREGROUND_SERVICE", 1);
        FOREGROUND_SERVICE = scopeFilter2;
        ScopeFilter scopeFilter3 = new ScopeFilter("FULL", 2);
        FULL = scopeFilter3;
        ScopeFilter[] scopeFilterArr = {scopeFilter, scopeFilter2, scopeFilter3};
        $VALUES = scopeFilterArr;
        $ENTRIES = C3cG.A0w(scopeFilterArr);
    }

    public static Ey9<ScopeFilter> getEntries() {
        return $ENTRIES;
    }

    public static ScopeFilter valueOf(String str) {
        return (ScopeFilter) Enum.valueOf(ScopeFilter.class, str);
    }

    public static ScopeFilter[] values() {
        return (ScopeFilter[]) $VALUES.clone();
    }

    public ScopeFilter(String str, int i) {
    }
}
