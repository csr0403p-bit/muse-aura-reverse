package com.facebook.aura.skills.viewmodel;

import X.AGI;
import X.AHD;
import X.AHH;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C7384Etj;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import com.facebook.aura.skills.repo.SkillPermissionGroup;
import com.facebook.aura.skills.repo.SkillPermissionMethod;
import com.facebook.aura.skills.repo.SkillPermissionSection;
import com.facebook.aura.skills.repo.SkillPermissions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class SkillPermissionsViewModelKt {
    public static final SkillPermissionsUiState applyUpdatedMode(SkillPermissionsUiState skillPermissionsUiState, String str, ConnectorPermissionMode connectorPermissionMode) {
        AHD<SkillPermissionSectionUiModel> ahd = skillPermissionsUiState.sections;
        ArrayList arrayListA0m = AnonymousClass002.A0m(ahd);
        for (SkillPermissionSectionUiModel skillPermissionSectionUiModel : ahd) {
            AHD<SkillPermissionGroupUiModel> ahd2 = skillPermissionSectionUiModel.groups;
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(ahd2);
            for (SkillPermissionGroupUiModel skillPermissionGroupUiModel : ahd2) {
                AHD<SkillPermissionMethodUiModel> ahd3 = skillPermissionGroupUiModel.methods;
                ArrayList arrayListA0m3 = AnonymousClass002.A0m(ahd3);
                for (SkillPermissionMethodUiModel skillPermissionMethodUiModelCopy : ahd3) {
                    if (C7384Etj.areEqual(skillPermissionMethodUiModelCopy.key, str)) {
                        skillPermissionMethodUiModelCopy = skillPermissionMethodUiModelCopy.copy(skillPermissionMethodUiModelCopy.key, skillPermissionMethodUiModelCopy.label, connectorPermissionMode, skillPermissionMethodUiModelCopy.modeOptions, skillPermissionMethodUiModelCopy.restricted);
                    }
                    arrayListA0m3.add(skillPermissionMethodUiModelCopy);
                }
                AHH ahhA0C = AGI.A0C(arrayListA0m3);
                String str2 = skillPermissionGroupUiModel.label;
                AnonymousClass003.A0u(str2, ahhA0C);
                arrayListA0m2.add(new SkillPermissionGroupUiModel(str2, ahhA0C));
            }
            AHH ahhA0C2 = AGI.A0C(arrayListA0m2);
            String str3 = skillPermissionSectionUiModel.label;
            C7384Etj.A0Y(ahhA0C2, 1);
            arrayListA0m.add(new SkillPermissionSectionUiModel(str3, ahhA0C2));
        }
        return skillPermissionsUiState.copy(AGI.A0C(arrayListA0m), skillPermissionsUiState.loadingState, null, null, skillPermissionsUiState.isResetting);
    }

    public static final SkillPermissionGroupUiModel toUiModel(SkillPermissionGroup skillPermissionGroup) {
        String str = skillPermissionGroup.label;
        List<SkillPermissionMethod> list = skillPermissionGroup.methods;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<SkillPermissionMethod> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(toUiModel(it.next()));
        }
        return new SkillPermissionGroupUiModel(str, AGI.A0C(arrayListA0i));
    }

    public static final SkillPermissionsUiState toUiState(SkillPermissions skillPermissions) {
        List<SkillPermissionSection> list = skillPermissions.sections;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<SkillPermissionSection> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(toUiModel(it.next()));
        }
        return new SkillPermissionsUiState(AGI.A0C(arrayListA0i), SkillPermissionsLoadingState.SUCCESS, null, null, false);
    }

    public static final SkillPermissionSectionUiModel toUiModel(SkillPermissionSection skillPermissionSection) {
        String str = skillPermissionSection.label;
        List<SkillPermissionGroup> list = skillPermissionSection.groups;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<SkillPermissionGroup> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(toUiModel(it.next()));
        }
        return new SkillPermissionSectionUiModel(str, AGI.A0C(arrayListA0i));
    }

    public static final SkillPermissionMethodUiModel toUiModel(SkillPermissionMethod skillPermissionMethod) {
        return new SkillPermissionMethodUiModel(skillPermissionMethod.key, skillPermissionMethod.label, skillPermissionMethod.mode, AGI.A0C(skillPermissionMethod.modeOptions), skillPermissionMethod.restricted);
    }
}
