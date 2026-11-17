package com.facebook.aura.skills.viewmodel;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;

/* loaded from: classes3.dex */
public final class SkillPermissionMethodUiModel extends C06G {
    public final String key;
    public final String label;
    public final ConnectorPermissionMode mode;
    public final AHD<ConnectorPermissionMode> modeOptions;
    public final boolean restricted;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SkillPermissionMethodUiModel) {
                SkillPermissionMethodUiModel skillPermissionMethodUiModel = (SkillPermissionMethodUiModel) obj;
                if (!C7384Etj.areEqual(this.key, skillPermissionMethodUiModel.key) || !C7384Etj.areEqual(this.label, skillPermissionMethodUiModel.label) || this.mode != skillPermissionMethodUiModel.mode || !C7384Etj.areEqual(this.modeOptions, skillPermissionMethodUiModel.modeOptions) || this.restricted != skillPermissionMethodUiModel.restricted) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkillPermissionMethodUiModel copy$default(SkillPermissionMethodUiModel skillPermissionMethodUiModel, String str, String str2, ConnectorPermissionMode connectorPermissionMode, AHD ahd, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skillPermissionMethodUiModel.key;
        }
        if ((i & 2) != 0) {
            str2 = skillPermissionMethodUiModel.label;
        }
        if ((i & 4) != 0) {
            connectorPermissionMode = skillPermissionMethodUiModel.mode;
        }
        if ((i & 8) != 0) {
            ahd = skillPermissionMethodUiModel.modeOptions;
        }
        if ((i & 16) != 0) {
            z = skillPermissionMethodUiModel.restricted;
        }
        return skillPermissionMethodUiModel.copy(str, str2, connectorPermissionMode, ahd, z);
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

    public final AHD<ConnectorPermissionMode> getModeOptions() {
        return this.modeOptions;
    }

    public final boolean getRestricted() {
        return this.restricted;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.modeOptions, AnonymousClass005.A0F(this.mode, AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.key)))), this.restricted);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkillPermissionMethodUiModel(String str, String str2, ConnectorPermissionMode connectorPermissionMode, AHD<? extends ConnectorPermissionMode> ahd, boolean z) {
        AnonymousClass005.A14(str, str2, connectorPermissionMode, ahd);
        this.key = str;
        this.label = str2;
        this.mode = connectorPermissionMode;
        this.modeOptions = ahd;
        this.restricted = z;
    }

    public final SkillPermissionMethodUiModel copy(String str, String str2, ConnectorPermissionMode connectorPermissionMode, AHD<? extends ConnectorPermissionMode> ahd, boolean z) {
        AnonymousClass005.A14(str, str2, connectorPermissionMode, ahd);
        return new SkillPermissionMethodUiModel(str, str2, connectorPermissionMode, ahd, z);
    }

    public String toString() {
        return super.toString();
    }
}
