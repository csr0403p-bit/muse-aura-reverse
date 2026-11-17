package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class TaskPermissionsScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String taskId;
    public final String taskName;

    public final class Companion {
        public final C9hr<TaskPermissionsScreenKey> serializer() {
            return TaskPermissionsScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(TaskPermissionsScreenKey taskPermissionsScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(taskPermissionsScreenKey.taskId, c9iZ, 0);
        c9j5.AAV(taskPermissionsScreenKey.taskName, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TaskPermissionsScreenKey) {
                TaskPermissionsScreenKey taskPermissionsScreenKey = (TaskPermissionsScreenKey) obj;
                if (!C7384Etj.areEqual(this.taskId, taskPermissionsScreenKey.taskId) || !C7384Etj.areEqual(this.taskName, taskPermissionsScreenKey.taskName)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TaskPermissionsScreenKey copy$default(TaskPermissionsScreenKey taskPermissionsScreenKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskPermissionsScreenKey.taskId;
        }
        if ((i & 2) != 0) {
            str2 = taskPermissionsScreenKey.taskName;
        }
        AnonymousClass003.A0u(str, str2);
        return new TaskPermissionsScreenKey(str, str2);
    }

    public final String component1() {
        return this.taskId;
    }

    public final String component2() {
        return this.taskName;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final String getTaskName() {
        return this.taskName;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.taskName, AnonymousClass001.A0G(this.taskId));
    }

    public TaskPermissionsScreenKey(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.taskId = str;
        this.taskName = str2;
    }

    public final TaskPermissionsScreenKey copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new TaskPermissionsScreenKey(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TaskPermissionsScreenKey(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(TaskPermissionsScreenKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.taskId = str;
        this.taskName = str2;
    }
}
