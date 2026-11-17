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
public final class TasksResponsePayload extends C06G {
    public final List<TaskResponseEntry> schedules;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, TasksResponsePayload$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<TasksResponsePayload> serializer() {
            return TasksResponsePayload$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof TasksResponsePayload) && C7384Etj.areEqual(this.schedules, ((TasksResponsePayload) obj).schedules));
    }

    public static /* synthetic */ TasksResponsePayload copy$default(TasksResponsePayload tasksResponsePayload, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tasksResponsePayload.schedules;
        }
        return new TasksResponsePayload(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(TasksResponsePayload tasksResponsePayload, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || tasksResponsePayload.schedules != null) {
            c9j5.AAP(tasksResponsePayload.schedules, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<TaskResponseEntry> component1() {
        return this.schedules;
    }

    public final TasksResponsePayload copy(List<TaskResponseEntry> list) {
        return new TasksResponsePayload(list);
    }

    public final List<TaskResponseEntry> getSchedules() {
        return this.schedules;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.schedules);
    }

    public /* synthetic */ TasksResponsePayload(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.schedules = null;
        } else {
            this.schedules = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public TasksResponsePayload(List<TaskResponseEntry> list) {
        this.schedules = list;
    }

    public /* synthetic */ TasksResponsePayload(List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : list);
    }

    public TasksResponsePayload() {
        this(null);
    }
}
