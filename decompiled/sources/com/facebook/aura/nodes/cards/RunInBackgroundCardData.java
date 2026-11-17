package com.facebook.aura.nodes.cards;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class RunInBackgroundCardData extends C06G implements HatchNodeCardData {
    public static final int $stable = 0;
    public final String taskSummary;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RunInBackgroundCardData) && C7384Etj.areEqual(this.taskSummary, ((RunInBackgroundCardData) obj).taskSummary));
    }

    public static /* synthetic */ RunInBackgroundCardData copy$default(RunInBackgroundCardData runInBackgroundCardData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = runInBackgroundCardData.taskSummary;
        }
        return new RunInBackgroundCardData(str);
    }

    public final String component1() {
        return this.taskSummary;
    }

    public final RunInBackgroundCardData copy(String str) {
        return new RunInBackgroundCardData(str);
    }

    public final String getTaskSummary() {
        return this.taskSummary;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.taskSummary);
    }

    public /* synthetic */ RunInBackgroundCardData(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public String toString() {
        return super.toString();
    }

    public RunInBackgroundCardData(String str) {
        this.taskSummary = str;
    }

    public RunInBackgroundCardData() {
        this(null);
    }
}
