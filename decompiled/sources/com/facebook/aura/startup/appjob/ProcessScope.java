package com.facebook.aura.startup.appjob;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ProcessScope {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ProcessScope[] $VALUES;
    public static final ProcessScope ALL_PROCESSES;
    public static final ProcessScope FOREGROUND_ONLY;
    public static final ProcessScope FOREGROUND_OR_SERVICE;

    static {
        ProcessScope processScope = new ProcessScope("ALL_PROCESSES", 0);
        ALL_PROCESSES = processScope;
        ProcessScope processScope2 = new ProcessScope("FOREGROUND_OR_SERVICE", 1);
        FOREGROUND_OR_SERVICE = processScope2;
        ProcessScope processScope3 = new ProcessScope("FOREGROUND_ONLY", 2);
        FOREGROUND_ONLY = processScope3;
        ProcessScope[] processScopeArr = {processScope, processScope2, processScope3};
        $VALUES = processScopeArr;
        $ENTRIES = C3cG.A0w(processScopeArr);
    }

    public static Ey9<ProcessScope> getEntries() {
        return $ENTRIES;
    }

    public static ProcessScope valueOf(String str) {
        return (ProcessScope) Enum.valueOf(ProcessScope.class, str);
    }

    public static ProcessScope[] values() {
        return (ProcessScope[]) $VALUES.clone();
    }

    public ProcessScope(String str, int i) {
    }
}
