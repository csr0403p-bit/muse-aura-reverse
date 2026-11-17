package com.facebook.aura.skills.repo;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;

/* loaded from: classes3.dex */
public final class TaskPermissionMethod extends C06G {
    public final String key;
    public final String label;
    public final ConnectorPermissionMode mode;
    public final AHD<ConnectorPermissionMode> modeOptions;
    public final ConnectorPermissionMode overrideMode;
    public final String sourceLabel;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TaskPermissionMethod) {
                TaskPermissionMethod taskPermissionMethod = (TaskPermissionMethod) obj;
                if (!C7384Etj.areEqual(this.key, taskPermissionMethod.key) || !C7384Etj.areEqual(this.label, taskPermissionMethod.label) || this.mode != taskPermissionMethod.mode || !C7384Etj.areEqual(this.modeOptions, taskPermissionMethod.modeOptions) || !C7384Etj.areEqual(this.sourceLabel, taskPermissionMethod.sourceLabel) || this.overrideMode != taskPermissionMethod.overrideMode) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaskPermissionMethod copy$default(TaskPermissionMethod taskPermissionMethod, String str, String str2, ConnectorPermissionMode connectorPermissionMode, AHD ahd, String str3, ConnectorPermissionMode connectorPermissionMode2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskPermissionMethod.key;
        }
        if ((i & 2) != 0) {
            str2 = taskPermissionMethod.label;
        }
        if ((i & 4) != 0) {
            connectorPermissionMode = taskPermissionMethod.mode;
        }
        if ((i & 8) != 0) {
            ahd = taskPermissionMethod.modeOptions;
        }
        if ((i & 16) != 0) {
            str3 = taskPermissionMethod.sourceLabel;
        }
        if ((i & 32) != 0) {
            connectorPermissionMode2 = taskPermissionMethod.overrideMode;
        }
        return taskPermissionMethod.copy(str, str2, connectorPermissionMode, ahd, str3, connectorPermissionMode2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.label;
    }

    public final ConnectorPermissionMode component3() {
        return this.mode;
    }

    public final AHD<ConnectorPermissionMode> component4() {
        return this.modeOptions;
    }

    public final String component5() {
        return this.sourceLabel;
    }

    public final ConnectorPermissionMode component6() {
        return this.overrideMode;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLabel() {
        return this.label;
    }

    public final ConnectorPermissionMode getMode() {
        return this.mode;
    }

    public final AHD<ConnectorPermissionMode> getModeOptions() {
        return this.modeOptions;
    }

    public final ConnectorPermissionMode getOverrideMode() {
        return this.overrideMode;
    }

    public final String getSourceLabel() {
        return this.sourceLabel;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.modeOptions, AnonymousClass005.A0F(this.mode, AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.key)))) + AnonymousClass006.A0G(this.sourceLabel)) * 31) + C3cH.A02(this.overrideMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaskPermissionMethod(String str, String str2, ConnectorPermissionMode connectorPermissionMode, AHD<? extends ConnectorPermissionMode> ahd, String str3, ConnectorPermissionMode connectorPermissionMode2) {
        AnonymousClass005.A14(str, str2, connectorPermissionMode, ahd);
        this.key = str;
        this.label = str2;
        this.mode = connectorPermissionMode;
        this.modeOptions = ahd;
        this.sourceLabel = str3;
        this.overrideMode = connectorPermissionMode2;
    }

    public final TaskPermissionMethod copy(String str, String str2, ConnectorPermissionMode connectorPermissionMode, AHD<? extends ConnectorPermissionMode> ahd, String str3, ConnectorPermissionMode connectorPermissionMode2) {
        AnonymousClass005.A14(str, str2, connectorPermissionMode, ahd);
        return new TaskPermissionMethod(str, str2, connectorPermissionMode, ahd, str3, connectorPermissionMode2);
    }

    public String toString() {
        return super.toString();
    }
}
