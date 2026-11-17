package com.facebook.aura.tabs;

import X.C7384Etj;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.navigation.key.ConnectionsScreenKey;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.navigation.key.ExploreScreenKey;
import com.facebook.aura.navigation.key.FeedScreenKey;
import com.facebook.aura.navigation.key.HatchGoalsTabScreenKey;
import com.facebook.aura.navigation.key.LibraryScreenKey;
import com.facebook.aura.uicontrol.UiAction;

/* loaded from: classes6.dex */
public abstract class TabBadgeViewModelKt {
    public static final long TAB_LIGHTUP_DURATION_MS = 5000;

    public static final FixedTab toFixedTab(UiAction uiAction) {
        if (C7384Etj.areEqual(uiAction, UiAction.NavigateChat.INSTANCE)) {
            return FixedTab.CHAT;
        }
        if (C7384Etj.areEqual(uiAction, UiAction.NavigateFeed.INSTANCE)) {
            return FixedTab.FEED;
        }
        if (C7384Etj.areEqual(uiAction, UiAction.NavigateExplore.INSTANCE)) {
            return FixedTab.IDEAS;
        }
        if (C7384Etj.areEqual(uiAction, UiAction.NavigateGoals.INSTANCE)) {
            return FixedTab.GOALS;
        }
        if (C7384Etj.areEqual(uiAction, UiAction.NavigateLibrary.INSTANCE)) {
            return FixedTab.LIBRARY;
        }
        return null;
    }

    public static final FixedTab toFixedTab(AuraTabRootNavKey auraTabRootNavKey) {
        if (auraTabRootNavKey instanceof ConversationTabScreenKey) {
            return FixedTab.CHAT;
        }
        if (auraTabRootNavKey instanceof FeedScreenKey) {
            return FixedTab.FEED;
        }
        if (auraTabRootNavKey instanceof ExploreScreenKey) {
            return FixedTab.IDEAS;
        }
        if (auraTabRootNavKey instanceof HatchGoalsTabScreenKey) {
            return FixedTab.GOALS;
        }
        if (auraTabRootNavKey instanceof LibraryScreenKey) {
            return FixedTab.LIBRARY;
        }
        if (auraTabRootNavKey instanceof ConnectionsScreenKey) {
            return FixedTab.CONNECTIONS;
        }
        return null;
    }
}
