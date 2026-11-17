package com.facebook.aura.tabs;

import X.C7384Etj;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.navigation.key.ConversationScreenKey;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.navigation.key.DemotedTabScreenKey;
import com.facebook.aura.navigation.key.PeerSpaceScreenKey;
import com.facebook.aura.navigation.key.SpacesModalScreenKey;
import com.facebook.aura.ui.adaptive.AuraSidePanelPresentation;
import com.facebook.aura.utils.HatchUtils;

/* loaded from: classes.dex */
public abstract class HatchSidePanelEntryKt {
    public static final boolean isSidePanelAvailableOn(AuraTabRootNavKey auraTabRootNavKey, AuraSidePanelPresentation auraSidePanelPresentation) {
        C7384Etj.A0Y(auraSidePanelPresentation, 1);
        return (auraTabRootNavKey instanceof ConversationTabScreenKey) || isSidePanelTabsVisible(auraSidePanelPresentation);
    }

    public static final boolean isSidePanelOfferedBy(AuraNavKey auraNavKey, AuraSidePanelPresentation auraSidePanelPresentation) {
        C7384Etj.A0Y(auraSidePanelPresentation, 1);
        if (auraNavKey instanceof ConversationScreenKey) {
            if (((ConversationScreenKey) auraNavKey).isOpenedFromArchive) {
                return false;
            }
        } else if (!(auraNavKey instanceof DemotedTabScreenKey)) {
            if (auraNavKey instanceof SpacesModalScreenKey) {
                return ((SpacesModalScreenKey) auraNavKey).fromNavigation;
            }
            if (auraNavKey instanceof PeerSpaceScreenKey) {
                return ((PeerSpaceScreenKey) auraNavKey).fromNavigation;
            }
            if (auraNavKey instanceof AuraTabRootNavKey) {
                return isSidePanelAvailableOn((AuraTabRootNavKey) auraNavKey, auraSidePanelPresentation);
            }
            return false;
        }
        return true;
    }

    public static final boolean isSidePanelTabsVisible(AuraSidePanelPresentation auraSidePanelPresentation) {
        C7384Etj.A0Y(auraSidePanelPresentation, 0);
        return auraSidePanelPresentation.getFloatsOverScreen() || auraSidePanelPresentation.getDocksBesidePages() || HatchUtils.INSTANCE.isTabSortingEnabled();
    }

    public static /* synthetic */ boolean isSidePanelAvailableOn$default(AuraTabRootNavKey auraTabRootNavKey, AuraSidePanelPresentation auraSidePanelPresentation, int i, Object obj) {
        if ((i & 2) != 0) {
            auraSidePanelPresentation = AuraSidePanelPresentation.PushAside;
        }
        return isSidePanelAvailableOn(auraTabRootNavKey, auraSidePanelPresentation);
    }

    public static final boolean isSidePanelDockedOn(AuraNavKey auraNavKey) {
        return (auraNavKey instanceof AuraTabRootNavKey) || isSidePanelOfferedBy(auraNavKey, AuraSidePanelPresentation.PushAside);
    }

    public static /* synthetic */ boolean isSidePanelOfferedBy$default(AuraNavKey auraNavKey, AuraSidePanelPresentation auraSidePanelPresentation, int i, Object obj) {
        if ((i & 2) != 0) {
            auraSidePanelPresentation = AuraSidePanelPresentation.PushAside;
        }
        return isSidePanelOfferedBy(auraNavKey, auraSidePanelPresentation);
    }
}
