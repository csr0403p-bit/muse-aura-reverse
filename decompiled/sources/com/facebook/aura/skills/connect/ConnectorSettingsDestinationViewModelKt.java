package com.facebook.aura.skills.connect;

import X.AbstractC0878AGe;
import X.C7384Etj;
import com.facebook.aura.skills.model.ConnectorCatalogPage;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.model.SkillKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class ConnectorSettingsDestinationViewModelKt {
    public static final ConnectorSettingsDestination destinationFor(ConnectorCatalogPage connectorCatalogPage, String str) {
        String strNormalizedSkillId = SkillKt.normalizedSkillId(str);
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(connectorCatalogPage.featured, connectorCatalogPage.connectors);
        if (!(arrayListA0P instanceof Collection) || !arrayListA0P.isEmpty()) {
            Iterator it = arrayListA0P.iterator();
            while (it.hasNext()) {
                if (C7384Etj.areEqual(SkillKt.normalizedSkillId(((Skill) it.next()).id), strNormalizedSkillId)) {
                    return ConnectorSettingsDestination.WALLET;
                }
            }
        }
        return ConnectorSettingsDestination.CONNECTORS;
    }
}
