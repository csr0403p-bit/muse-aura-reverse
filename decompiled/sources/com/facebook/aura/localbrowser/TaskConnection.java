package com.facebook.aura.localbrowser;

import X.C7384Etj;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class TaskConnection {
    public final long generation;
    public final Function0<Boolean> isCurrent;

    public TaskConnection(long j, Function0<Boolean> function0) {
        C7384Etj.A0Y(function0, 1);
        this.generation = j;
        this.isCurrent = function0;
    }

    public final long getGeneration() {
        return this.generation;
    }

    public final Function0<Boolean> isCurrent() {
        return this.isCurrent;
    }
}
