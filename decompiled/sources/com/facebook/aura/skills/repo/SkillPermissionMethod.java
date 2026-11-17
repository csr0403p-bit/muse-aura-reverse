package com.facebook.aura.skills.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import java.util.List;

/* loaded from: classes.dex */
public final class SkillPermissionMethod extends C06G {
    public final String key;
    public final String label;
    public final ConnectorPermissionMode mode;
    public final List<ConnectorPermissionMode> modeOptions;
    public final boolean restricted;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SkillPermissionMethod) {
                SkillPermissionMethod skillPermissionMethod = (SkillPermissionMethod) obj;
                if (!C7384Etj.areEqual(this.key, skillPermissionMethod.key) || this.mode != skillPermissionMethod.mode || !C7384Etj.areEqual(this.modeOptions, skillPermissionMethod.modeOptions) || !C7384Etj.areEqual(this.label, skillPermissionMethod.label) || this.restricted != skillPermissionMethod.restricted) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkillPermissionMethod copy$default(SkillPermissionMethod skillPermissionMethod, String str, ConnectorPermissionMode connectorPermissionMode, List list, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skillPermissionMethod.key;
        }
        if ((i & 2) != 0) {
            connectorPermissionMode = skillPermissionMethod.mode;
        }
        if ((i & 4) != 0) {
            list = skillPermissionMethod.modeOptions;
        }
        if ((i & 8) != 0) {
            str2 = skillPermissionMethod.label;
        }
        if ((i & 16) != 0) {
            z = skillPermissionMethod.restricted;
        }
        return skillPermissionMethod.copy(str, connectorPermissionMode, list, str2, z);
    }

    public final String component1() {
        return this.key;
    }

    public final ConnectorPermissionMode component2() {
        return this.mode;
    }

    public final List<ConnectorPermissionMode> component3() {
        return this.modeOptions;
    }

    public final String component4() {
        return this.label;
    }

    public final boolean component5() {
        return this.restricted;
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

    public final List<ConnectorPermissionMode> getModeOptions() {
        return this.modeOptions;
    }

    public final boolean getRestricted() {
        return this.restricted;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.label, AnonymousClass005.A0F(this.modeOptions, AnonymousClass005.A0F(this.mode, AnonymousClass001.A0G(this.key)))), this.restricted);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkillPermissionMethod(String str, ConnectorPermissionMode connectorPermissionMode, List<? extends ConnectorPermissionMode> list, String str2, boolean z) {
        AnonymousClass005.A14(str, connectorPermissionMode, list, str2);
        this.key = str;
        this.mode = connectorPermissionMode;
        this.modeOptions = list;
        this.label = str2;
        this.restricted = z;
    }

    public final SkillPermissionMethod copy(String str, ConnectorPermissionMode connectorPermissionMode, List<? extends ConnectorPermissionMode> list, String str2, boolean z) {
        AnonymousClass005.A14(str, connectorPermissionMode, list, str2);
        return new SkillPermissionMethod(str, connectorPermissionMode, list, str2, z);
    }

    public String toString() {
        return super.toString();
    }
}
