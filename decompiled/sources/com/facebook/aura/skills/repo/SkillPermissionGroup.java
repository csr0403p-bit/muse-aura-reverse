package com.facebook.aura.skills.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes.dex */
public final class SkillPermissionGroup extends C06G {
    public final String label;
    public final List<SkillPermissionMethod> methods;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SkillPermissionGroup) {
                SkillPermissionGroup skillPermissionGroup = (SkillPermissionGroup) obj;
                if (!C7384Etj.areEqual(this.label, skillPermissionGroup.label) || !C7384Etj.areEqual(this.methods, skillPermissionGroup.methods)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SkillPermissionGroup copy$default(SkillPermissionGroup skillPermissionGroup, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skillPermissionGroup.label;
        }
        if ((i & 2) != 0) {
            list = skillPermissionGroup.methods;
        }
        AnonymousClass003.A0u(str, list);
        return new SkillPermissionGroup(str, list);
    }

    public final String component1() {
        return this.label;
    }

    public final List<SkillPermissionMethod> component2() {
        return this.methods;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<SkillPermissionMethod> getMethods() {
        return this.methods;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.methods, AnonymousClass001.A0G(this.label));
    }

    public SkillPermissionGroup(String str, List<SkillPermissionMethod> list) {
        AnonymousClass003.A0u(str, list);
        this.label = str;
        this.methods = list;
    }

    public final SkillPermissionGroup copy(String str, List<SkillPermissionMethod> list) {
        AnonymousClass003.A0u(str, list);
        return new SkillPermissionGroup(str, list);
    }

    public String toString() {
        return super.toString();
    }
}
