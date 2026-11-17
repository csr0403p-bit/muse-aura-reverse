package com.facebook.aura.conversation.repo;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ThreadsView {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ThreadsView[] $VALUES;
    public static final ThreadsView ACTIVE;
    public static final ThreadsView ARCHIVED;

    static {
        ThreadsView threadsView = new ThreadsView("ACTIVE", 0);
        ACTIVE = threadsView;
        ThreadsView threadsView2 = new ThreadsView("ARCHIVED", 1);
        ARCHIVED = threadsView2;
        ThreadsView[] threadsViewArr = {threadsView, threadsView2};
        $VALUES = threadsViewArr;
        $ENTRIES = new F3w(threadsViewArr);
    }

    public static Ey9<ThreadsView> getEntries() {
        return $ENTRIES;
    }

    public static ThreadsView valueOf(String str) {
        return (ThreadsView) Enum.valueOf(ThreadsView.class, str);
    }

    public static ThreadsView[] values() {
        return (ThreadsView[]) $VALUES.clone();
    }

    public ThreadsView(String str, int i) {
    }
}
