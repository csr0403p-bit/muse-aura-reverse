package com.facebook.aura.status.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class TaskRunsResponsePayload extends C06G {
    public final List<TaskRunResponseEntry> runs;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, TaskRunsResponsePayload$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<TaskRunsResponsePayload> serializer() {
            return TaskRunsResponsePayload$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof TaskRunsResponsePayload) && C7384Etj.areEqual(this.runs, ((TaskRunsResponsePayload) obj).runs));
    }

    public static /* synthetic */ TaskRunsResponsePayload copy$default(TaskRunsResponsePayload taskRunsResponsePayload, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = taskRunsResponsePayload.runs;
        }
        return new TaskRunsResponsePayload(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(TaskRunsResponsePayload taskRunsResponsePayload, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || taskRunsResponsePayload.runs != null) {
            c9j5.AAP(taskRunsResponsePayload.runs, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<TaskRunResponseEntry> component1() {
        return this.runs;
    }

    public final TaskRunsResponsePayload copy(List<TaskRunResponseEntry> list) {
        return new TaskRunsResponsePayload(list);
    }

    public final List<TaskRunResponseEntry> getRuns() {
        return this.runs;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.runs);
    }

    public /* synthetic */ TaskRunsResponsePayload(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.runs = null;
        } else {
            this.runs = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public TaskRunsResponsePayload(List<TaskRunResponseEntry> list) {
        this.runs = list;
    }

    public /* synthetic */ TaskRunsResponsePayload(List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : list);
    }

    public TaskRunsResponsePayload() {
        this(null);
    }
}
