package com.facebook.aura.model;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes.dex */
public final class TaskRemoveResponse extends C06G {
    public static final int $stable = 8;
    public final List<String> removed;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof TaskRemoveResponse) && C7384Etj.areEqual(this.removed, ((TaskRemoveResponse) obj).removed));
    }

    public /* synthetic */ TaskRemoveResponse(List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : list);
    }

    public static /* synthetic */ TaskRemoveResponse copy$default(TaskRemoveResponse taskRemoveResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = taskRemoveResponse.removed;
        }
        return new TaskRemoveResponse(list);
    }

    public final List<String> component1() {
        return this.removed;
    }

    public final TaskRemoveResponse copy(List<String> list) {
        return new TaskRemoveResponse(list);
    }

    public final List<String> getRemoved() {
        return this.removed;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.removed);
    }

    public String toString() {
        return super.toString();
    }

    public TaskRemoveResponse(List<String> list) {
        this.removed = list;
    }

    public TaskRemoveResponse() {
        this(null);
    }
}
