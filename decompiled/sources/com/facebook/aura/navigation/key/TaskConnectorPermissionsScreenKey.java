package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass005;
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
public final class TaskConnectorPermissionsScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String connectorId;
    public final String connectorName;
    public final String taskId;
    public final String taskName;

    public final class Companion {
        public final C9hr<TaskConnectorPermissionsScreenKey> serializer() {
            return TaskConnectorPermissionsScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(TaskConnectorPermissionsScreenKey taskConnectorPermissionsScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(taskConnectorPermissionsScreenKey.taskId, c9iZ, 0);
        c9j5.AAV(taskConnectorPermissionsScreenKey.taskName, c9iZ, 1);
        c9j5.AAV(taskConnectorPermissionsScreenKey.connectorId, c9iZ, 2);
        c9j5.AAV(taskConnectorPermissionsScreenKey.connectorName, c9iZ, 3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TaskConnectorPermissionsScreenKey) {
                TaskConnectorPermissionsScreenKey taskConnectorPermissionsScreenKey = (TaskConnectorPermissionsScreenKey) obj;
                if (!C7384Etj.areEqual(this.taskId, taskConnectorPermissionsScreenKey.taskId) || !C7384Etj.areEqual(this.taskName, taskConnectorPermissionsScreenKey.taskName) || !C7384Etj.areEqual(this.connectorId, taskConnectorPermissionsScreenKey.connectorId) || !C7384Etj.areEqual(this.connectorName, taskConnectorPermissionsScreenKey.connectorName)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TaskConnectorPermissionsScreenKey copy$default(TaskConnectorPermissionsScreenKey taskConnectorPermissionsScreenKey, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskConnectorPermissionsScreenKey.taskId;
        }
        if ((i & 2) != 0) {
            str2 = taskConnectorPermissionsScreenKey.taskName;
        }
        if ((i & 4) != 0) {
            str3 = taskConnectorPermissionsScreenKey.connectorId;
        }
        if ((i & 8) != 0) {
            str4 = taskConnectorPermissionsScreenKey.connectorName;
        }
        return taskConnectorPermissionsScreenKey.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.taskId;
    }

    public final String component2() {
        return this.taskName;
    }

    public final String component3() {
        return this.connectorId;
    }

    public final String component4() {
        return this.connectorName;
    }

    public final String getConnectorId() {
        return this.connectorId;
    }

    public final String getConnectorName() {
        return this.connectorName;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final String getTaskName() {
        return this.taskName;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.connectorName, AnonymousClass005.A0I(this.connectorId, AnonymousClass005.A0I(this.taskName, AnonymousClass001.A0G(this.taskId))));
    }

    public TaskConnectorPermissionsScreenKey(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.taskId = str;
        this.taskName = str2;
        this.connectorId = str3;
        this.connectorName = str4;
    }

    public final TaskConnectorPermissionsScreenKey copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new TaskConnectorPermissionsScreenKey(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TaskConnectorPermissionsScreenKey(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(TaskConnectorPermissionsScreenKey$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.taskId = str;
        this.taskName = str2;
        this.connectorId = str3;
        this.connectorName = str4;
    }
}
