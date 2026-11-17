package com.facebook.aura.pairs;

import X.AnonymousClass003;

/* loaded from: classes3.dex */
public final class SharedGoalTask {
    public static final int $stable = 0;
    public final String id;
    public final boolean isCompleted;
    public final String title;

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    public SharedGoalTask(String str, String str2, boolean z) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.title = str2;
        this.isCompleted = z;
    }
}
