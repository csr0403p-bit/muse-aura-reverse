package com.facebook.aura.skills.viewmodel;

import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.C7384Etj;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.model.SkillState;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ConnectorCatalogPageViewModelKt {
    public static final String CONNECTED_CATEGORY_ID = "connected";

    public static final boolean isVisibleInConnectorCatalog(Skill skill, boolean z) {
        C7384Etj.A0Y(skill, 0);
        if (skill.state != SkillState.COMING_SOON) {
            return z || !skill.isCustom;
        }
        return false;
    }

    public static final AHD<ConnectorCatalogRowUiState> sortedByTitle(List<ConnectorCatalogRowUiState> list) {
        final Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        C7384Etj.A0V(comparator);
        return AGI.A0C(AbstractC0878AGe.A0c(list, new Comparator() { // from class: com.facebook.aura.skills.viewmodel.ConnectorCatalogPageViewModelKt$sortedByTitle$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return comparator.compare(((ConnectorCatalogRowUiState) t).title, ((ConnectorCatalogRowUiState) t2).title);
            }
        }));
    }
}
