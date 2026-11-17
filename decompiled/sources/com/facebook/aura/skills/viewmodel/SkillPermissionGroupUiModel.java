package com.facebook.aura.skills.viewmodel;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class SkillPermissionGroupUiModel extends C06G {
    public final String label;
    public final AHD<SkillPermissionMethodUiModel> methods;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SkillPermissionGroupUiModel) {
                SkillPermissionGroupUiModel skillPermissionGroupUiModel = (SkillPermissionGroupUiModel) obj;
                if (!C7384Etj.areEqual(this.label, skillPermissionGroupUiModel.label) || !C7384Etj.areEqual(this.methods, skillPermissionGroupUiModel.methods)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SkillPermissionGroupUiModel copy$default(SkillPermissionGroupUiModel skillPermissionGroupUiModel, String str, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skillPermissionGroupUiModel.label;
        }
        if ((i & 2) != 0) {
            ahd = skillPermissionGroupUiModel.methods;
        }
        AnonymousClass003.A0u(str, ahd);
        return new SkillPermissionGroupUiModel(str, ahd);
    }

    public final String component1() {
        return this.label;
    }

    public final AHD<SkillPermissionMethodUiModel> component2() {
        return this.methods;
    }

    public final String getLabel() {
        return this.label;
    }

    public final AHD<SkillPermissionMethodUiModel> getMethods() {
        return this.methods;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.methods, AnonymousClass001.A0G(this.label));
    }

    public SkillPermissionGroupUiModel(String str, AHD<SkillPermissionMethodUiModel> ahd) {
        AnonymousClass003.A0u(str, ahd);
        this.label = str;
        this.methods = ahd;
    }

    public final SkillPermissionGroupUiModel copy(String str, AHD<SkillPermissionMethodUiModel> ahd) {
        AnonymousClass003.A0u(str, ahd);
        return new SkillPermissionGroupUiModel(str, ahd);
    }

    public String toString() {
        return super.toString();
    }
}
