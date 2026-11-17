package com.facebook.aura.pairs;

import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchModule;
import com.facebook.aura.main.api.TimeSpentModuleProvider;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ConnectionsAddPermissionSheetKey;
import com.facebook.aura.navigation.key.ConnectionsAddSheetKey;
import com.facebook.aura.navigation.key.ConnectionsModalScreenKey;
import com.facebook.aura.navigation.key.ConnectionsReceivedItemSheetKey;
import com.facebook.aura.navigation.key.ConnectionsRuleEditorSheetKey;
import com.facebook.aura.navigation.key.ConnectionsScreenKey;
import com.facebook.aura.navigation.key.ConnectionsShareSheetKey;
import com.facebook.aura.navigation.key.ConnectionsShareStatusSheetKey;
import com.facebook.aura.navigation.key.ConnectionsSheetKey;
import com.facebook.aura.navigation.key.PairsAcceptLinkSheetKey;
import com.facebook.aura.navigation.key.PairsAcceptPreferencesSheetKey;
import com.facebook.aura.navigation.key.PairsHistoryScreenKey;
import com.facebook.aura.navigation.key.PairsStatusSheetKey;
import com.facebook.aura.navigation.key.PeerGoalScreenKey;

/* loaded from: classes.dex */
public final class PairsTimeSpentModules implements TimeSpentModuleProvider {
    public static final int $stable = 0;
    public static final PairsTimeSpentModules INSTANCE = new PairsTimeSpentModules();

    @Override // com.facebook.aura.main.api.TimeSpentModuleProvider
    public HatchModule moduleFor(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        if ((auraNavKey instanceof ConnectionsScreenKey) || (auraNavKey instanceof ConnectionsModalScreenKey)) {
            return HatchModule.HATCH_CONNECTIONS;
        }
        if (auraNavKey instanceof ConnectionsAddSheetKey) {
            return HatchModule.HATCH_CONNECTIONS_ADD;
        }
        if (auraNavKey instanceof ConnectionsSheetKey) {
            return HatchModule.HATCH_CONNECTION_DETAIL;
        }
        if (auraNavKey instanceof ConnectionsRuleEditorSheetKey) {
            return HatchModule.HATCH_CONNECTION_RULE_EDITOR;
        }
        if (auraNavKey instanceof ConnectionsAddPermissionSheetKey) {
            return HatchModule.HATCH_CONNECTION_ADD_PERMISSION;
        }
        if (auraNavKey instanceof ConnectionsShareSheetKey) {
            return HatchModule.HATCH_CONNECTIONS_SHARE;
        }
        if (auraNavKey instanceof PairsHistoryScreenKey) {
            return HatchModule.HATCH_CONNECTION_HISTORY;
        }
        if (auraNavKey instanceof PairsStatusSheetKey) {
            return HatchModule.HATCH_CONNECTION_PAIRING_STATUS;
        }
        if (auraNavKey instanceof PairsAcceptLinkSheetKey) {
            return HatchModule.HATCH_CONNECTION_ACCEPT_INVITE;
        }
        if (auraNavKey instanceof PairsAcceptPreferencesSheetKey) {
            return HatchModule.HATCH_CONNECTION_ACCEPT_LEVEL;
        }
        if (auraNavKey instanceof ConnectionsShareStatusSheetKey) {
            return HatchModule.HATCH_CONNECTIONS_SHARE_STATUS;
        }
        if (auraNavKey instanceof ConnectionsReceivedItemSheetKey) {
            return HatchModule.HATCH_CONNECTIONS_RECEIVED_ITEM;
        }
        if (auraNavKey instanceof PeerGoalScreenKey) {
            return HatchModule.HATCH_SHARED_GOAL;
        }
        return null;
    }
}
