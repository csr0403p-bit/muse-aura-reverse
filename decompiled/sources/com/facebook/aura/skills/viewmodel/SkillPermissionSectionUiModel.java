package com.facebook.aura.skills.viewmodel;

import X.AHD;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class SkillPermissionSectionUiModel extends C06G {
    public final AHD<SkillPermissionGroupUiModel> groups;
    public final String label;

    public SkillPermissionSectionUiModel(String str, AHD<SkillPermissionGroupUiModel> ahd) {
        C7384Etj.A0Y(ahd, 1);
        this.label = str;
        this.groups = ahd;
    }

    public final SkillPermissionSectionUiModel copy(String str, AHD<SkillPermissionGroupUiModel> ahd) {
        C7384Etj.A0Y(ahd, 1);
        return new SkillPermissionSectionUiModel(str, ahd);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SkillPermissionSectionUiModel) {
                SkillPermissionSectionUiModel skillPermissionSectionUiModel = (SkillPermissionSectionUiModel) obj;
                if (!C7384Etj.areEqual(this.label, skillPermissionSectionUiModel.label) || !C7384Etj.areEqual(this.groups, skillPermissionSectionUiModel.groups)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SkillPermissionSectionUiModel copy$default(SkillPermissionSectionUiModel skillPermissionSectionUiModel, String str, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skillPermissionSectionUiModel.label;
        }
        if ((i & 2) != 0) {
            ahd = skillPermissionSectionUiModel.groups;
        }
        C7384Etj.A0Y(ahd, 1);
        return new SkillPermissionSectionUiModel(str, ahd);
    }

    public final String component1() {
        return this.label;
    }

    public final AHD<SkillPermissionGroupUiModel> component2() {
        return this.groups;
    }

    public final AHD<SkillPermissionGroupUiModel> getGroups() {
        return this.groups;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.groups, AnonymousClass006.A0G(this.label) * 31);
    }

    public String toString() {
        return super.toString();
    }
}
