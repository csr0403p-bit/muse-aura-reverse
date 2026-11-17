package com.facebook.aura.skills.viewmodel;

import X.C7BY;
import com.facebook.aura.agentpermission.LocalDeviceConnector;
import com.facebook.aura.skills.model.Skill;

/* loaded from: classes.dex */
public abstract class HatchConnectorSearchViewModelKt {
    public static final long SEARCH_DEBOUNCE_MS = 300;

    public static final boolean matches(Skill skill, String str) {
        String str2 = skill.displayName;
        if (str2.length() == 0) {
            str2 = skill.id;
        }
        return C7BY.A0q(str2, str, true) || C7BY.A0q(skill.description, str, true);
    }

    public static final boolean matches(LocalDeviceConnector localDeviceConnector, String str) {
        String str2 = localDeviceConnector.displayTitle;
        if (str2.length() == 0) {
            str2 = localDeviceConnector.connectorId;
        }
        if (C7BY.A0q(str2, str, true) || C7BY.A0q(localDeviceConnector.subtitle, str, true)) {
            return true;
        }
        return false;
    }
}
