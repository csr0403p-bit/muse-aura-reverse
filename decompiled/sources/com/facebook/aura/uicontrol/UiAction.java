package com.facebook.aura.uicontrol;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C3cF;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface UiAction {

    /* loaded from: classes6.dex */
    public final class Contributed extends C06G implements UiAction {
        public final ContributedUiAction action;

        public Contributed(ContributedUiAction contributedUiAction) {
            C7384Etj.A0Y(contributedUiAction, 0);
            this.action = contributedUiAction;
        }

        public final Contributed copy(ContributedUiAction contributedUiAction) {
            C7384Etj.A0Y(contributedUiAction, 0);
            return new Contributed(contributedUiAction);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Contributed) && C7384Etj.areEqual(this.action, ((Contributed) obj).action));
        }

        public static /* synthetic */ Contributed copy$default(Contributed contributed, ContributedUiAction contributedUiAction, int i, Object obj) {
            if ((i & 1) != 0) {
                contributedUiAction = contributed.action;
            }
            C7384Etj.A0Y(contributedUiAction, 0);
            return new Contributed(contributedUiAction);
        }

        public final ContributedUiAction component1() {
            return this.action;
        }

        public final ContributedUiAction getAction() {
            return this.action;
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateActivityItem extends C06G implements Navigation {
        public final String activityId;

        public NavigateActivityItem(String str) {
            C7384Etj.A0Y(str, 0);
            this.activityId = str;
        }

        public final NavigateActivityItem copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new NavigateActivityItem(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof NavigateActivityItem) && C7384Etj.areEqual(this.activityId, ((NavigateActivityItem) obj).activityId));
        }

        public static /* synthetic */ NavigateActivityItem copy$default(NavigateActivityItem navigateActivityItem, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateActivityItem.activityId;
            }
            C7384Etj.A0Y(str, 0);
            return new NavigateActivityItem(str);
        }

        public final String component1() {
            return this.activityId;
        }

        public final String getActivityId() {
            return this.activityId;
        }

        public int hashCode() {
            return this.activityId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateActivityLog implements Navigation {
        public static final NavigateActivityLog INSTANCE = new NavigateActivityLog();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateActivityLog);
        }

        public String toString() {
            return "NavigateActivityLog";
        }

        public int hashCode() {
            return -656079083;
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateArtifacts implements Navigation {
        public static final NavigateArtifacts INSTANCE = new NavigateArtifacts();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateArtifacts);
        }

        public String toString() {
            return "NavigateArtifacts";
        }

        public int hashCode() {
            return 1420323393;
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateBack implements UiAction {
        public static final NavigateBack INSTANCE = new NavigateBack();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateBack);
        }

        public String toString() {
            return C3cF.A00(14);
        }

        public int hashCode() {
            return 576746375;
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateChat implements Navigation {
        public static final NavigateChat INSTANCE = new NavigateChat();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateChat);
        }

        public String toString() {
            return "NavigateChat";
        }

        public int hashCode() {
            return 576782840;
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateChatSession extends C06G implements Navigation {
        public final String sessionId;

        public NavigateChatSession(String str) {
            C7384Etj.A0Y(str, 0);
            this.sessionId = str;
        }

        public final NavigateChatSession copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new NavigateChatSession(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof NavigateChatSession) && C7384Etj.areEqual(this.sessionId, ((NavigateChatSession) obj).sessionId));
        }

        public static /* synthetic */ NavigateChatSession copy$default(NavigateChatSession navigateChatSession, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateChatSession.sessionId;
            }
            C7384Etj.A0Y(str, 0);
            return new NavigateChatSession(str);
        }

        public final String component1() {
            return this.sessionId;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public int hashCode() {
            return this.sessionId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateExplore implements Navigation {
        public static final NavigateExplore INSTANCE = new NavigateExplore();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateExplore);
        }

        public String toString() {
            return "NavigateExplore";
        }

        public int hashCode() {
            return 1020233715;
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateFeed implements Navigation {
        public static final NavigateFeed INSTANCE = new NavigateFeed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateFeed);
        }

        public String toString() {
            return "NavigateFeed";
        }

        public int hashCode() {
            return 576869438;
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateFeedUnit extends C06G implements Navigation {
        public final String unitId;

        public NavigateFeedUnit(String str) {
            C7384Etj.A0Y(str, 0);
            this.unitId = str;
        }

        public final NavigateFeedUnit copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new NavigateFeedUnit(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof NavigateFeedUnit) && C7384Etj.areEqual(this.unitId, ((NavigateFeedUnit) obj).unitId));
        }

        public static /* synthetic */ NavigateFeedUnit copy$default(NavigateFeedUnit navigateFeedUnit, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateFeedUnit.unitId;
            }
            C7384Etj.A0Y(str, 0);
            return new NavigateFeedUnit(str);
        }

        public final String component1() {
            return this.unitId;
        }

        public final String getUnitId() {
            return this.unitId;
        }

        public int hashCode() {
            return this.unitId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateGoals implements Navigation {
        public static final NavigateGoals INSTANCE = new NavigateGoals();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateGoals);
        }

        public String toString() {
            return "NavigateGoals";
        }

        public int hashCode() {
            return 704301344;
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateHomeLinkOrder implements Navigation {
        public static final NavigateHomeLinkOrder INSTANCE = new NavigateHomeLinkOrder();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateHomeLinkOrder);
        }

        public String toString() {
            return "NavigateHomeLinkOrder";
        }

        public int hashCode() {
            return -1981149515;
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateInviteFriends implements Navigation {
        public static final NavigateInviteFriends INSTANCE = new NavigateInviteFriends();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateInviteFriends);
        }

        public String toString() {
            return "NavigateInviteFriends";
        }

        public int hashCode() {
            return -763794516;
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateLibrary implements Navigation {
        public static final NavigateLibrary INSTANCE = new NavigateLibrary();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateLibrary);
        }

        public String toString() {
            return "NavigateLibrary";
        }

        public int hashCode() {
            return -1799376357;
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateLibraryItem extends C06G implements UiAction {
        public final String itemId;

        public NavigateLibraryItem(String str) {
            C7384Etj.A0Y(str, 0);
            this.itemId = str;
        }

        public final NavigateLibraryItem copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new NavigateLibraryItem(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof NavigateLibraryItem) && C7384Etj.areEqual(this.itemId, ((NavigateLibraryItem) obj).itemId));
        }

        public static /* synthetic */ NavigateLibraryItem copy$default(NavigateLibraryItem navigateLibraryItem, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateLibraryItem.itemId;
            }
            C7384Etj.A0Y(str, 0);
            return new NavigateLibraryItem(str);
        }

        public final String component1() {
            return this.itemId;
        }

        public final String getItemId() {
            return this.itemId;
        }

        public int hashCode() {
            return this.itemId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateMedia implements Navigation {
        public static final NavigateMedia INSTANCE = new NavigateMedia();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateMedia);
        }

        public String toString() {
            return "NavigateMedia";
        }

        public int hashCode() {
            return 709547332;
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateMemory implements Navigation {
        public static final NavigateMemory INSTANCE = new NavigateMemory();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateMemory);
        }

        public String toString() {
            return "NavigateMemory";
        }

        public int hashCode() {
            return 521405345;
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateMemoryItem extends C06G implements Navigation {
        public final String path;

        public NavigateMemoryItem(String str) {
            C7384Etj.A0Y(str, 0);
            this.path = str;
        }

        public final NavigateMemoryItem copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new NavigateMemoryItem(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof NavigateMemoryItem) && C7384Etj.areEqual(this.path, ((NavigateMemoryItem) obj).path));
        }

        public static /* synthetic */ NavigateMemoryItem copy$default(NavigateMemoryItem navigateMemoryItem, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateMemoryItem.path;
            }
            C7384Etj.A0Y(str, 0);
            return new NavigateMemoryItem(str);
        }

        public final String component1() {
            return this.path;
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            return this.path.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateProfile implements Navigation {
        public static final NavigateProfile INSTANCE = new NavigateProfile();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateProfile);
        }

        public String toString() {
            return "NavigateProfile";
        }

        public int hashCode() {
            return 2019956489;
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateScheduledTask extends C06G implements Navigation {
        public final String taskId;

        public NavigateScheduledTask(String str) {
            C7384Etj.A0Y(str, 0);
            this.taskId = str;
        }

        public final NavigateScheduledTask copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new NavigateScheduledTask(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof NavigateScheduledTask) && C7384Etj.areEqual(this.taskId, ((NavigateScheduledTask) obj).taskId));
        }

        public static /* synthetic */ NavigateScheduledTask copy$default(NavigateScheduledTask navigateScheduledTask, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateScheduledTask.taskId;
            }
            C7384Etj.A0Y(str, 0);
            return new NavigateScheduledTask(str);
        }

        public final String component1() {
            return this.taskId;
        }

        public final String getTaskId() {
            return this.taskId;
        }

        public int hashCode() {
            return this.taskId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateScheduledTasks implements Navigation {
        public static final NavigateScheduledTasks INSTANCE = new NavigateScheduledTasks();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateScheduledTasks);
        }

        public String toString() {
            return "NavigateScheduledTasks";
        }

        public int hashCode() {
            return 39900545;
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateSettings implements Navigation {
        public static final NavigateSettings INSTANCE = new NavigateSettings();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateSettings);
        }

        public String toString() {
            return "NavigateSettings";
        }

        public int hashCode() {
            return 631036611;
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateSettingsIdentity implements Navigation {
        public static final NavigateSettingsIdentity INSTANCE = new NavigateSettingsIdentity();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateSettingsIdentity);
        }

        public String toString() {
            return "NavigateSettingsIdentity";
        }

        public int hashCode() {
            return -66700127;
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateSpace extends C06G implements Navigation {
        public final String spaceSlug;

        public NavigateSpace(String str) {
            C7384Etj.A0Y(str, 0);
            this.spaceSlug = str;
        }

        public final NavigateSpace copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new NavigateSpace(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof NavigateSpace) && C7384Etj.areEqual(this.spaceSlug, ((NavigateSpace) obj).spaceSlug));
        }

        public static /* synthetic */ NavigateSpace copy$default(NavigateSpace navigateSpace, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateSpace.spaceSlug;
            }
            C7384Etj.A0Y(str, 0);
            return new NavigateSpace(str);
        }

        public final String component1() {
            return this.spaceSlug;
        }

        public final String getSpaceSlug() {
            return this.spaceSlug;
        }

        public int hashCode() {
            return this.spaceSlug.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateSpaceTab extends C06G implements Navigation {
        public final String spaceSlug;
        public final String tabId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof NavigateSpaceTab) {
                    NavigateSpaceTab navigateSpaceTab = (NavigateSpaceTab) obj;
                    if (!C7384Etj.areEqual(this.spaceSlug, navigateSpaceTab.spaceSlug) || !C7384Etj.areEqual(this.tabId, navigateSpaceTab.tabId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ NavigateSpaceTab copy$default(NavigateSpaceTab navigateSpaceTab, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateSpaceTab.spaceSlug;
            }
            if ((i & 2) != 0) {
                str2 = navigateSpaceTab.tabId;
            }
            AnonymousClass003.A0u(str, str2);
            return new NavigateSpaceTab(str, str2);
        }

        public final String component1() {
            return this.spaceSlug;
        }

        public final String component2() {
            return this.tabId;
        }

        public final String getSpaceSlug() {
            return this.spaceSlug;
        }

        public final String getTabId() {
            return this.tabId;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.tabId, AnonymousClass001.A0G(this.spaceSlug));
        }

        public NavigateSpaceTab(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.spaceSlug = str;
            this.tabId = str2;
        }

        public final NavigateSpaceTab copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new NavigateSpaceTab(str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateThreadCreate implements Navigation {
        public static final NavigateThreadCreate INSTANCE = new NavigateThreadCreate();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateThreadCreate);
        }

        public String toString() {
            return "NavigateThreadCreate";
        }

        public int hashCode() {
            return -1563346362;
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigateThreadSearch extends C06G implements Navigation {
        public final String query;

        public NavigateThreadSearch(String str) {
            C7384Etj.A0Y(str, 0);
            this.query = str;
        }

        public final NavigateThreadSearch copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new NavigateThreadSearch(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof NavigateThreadSearch) && C7384Etj.areEqual(this.query, ((NavigateThreadSearch) obj).query));
        }

        public static /* synthetic */ NavigateThreadSearch copy$default(NavigateThreadSearch navigateThreadSearch, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateThreadSearch.query;
            }
            C7384Etj.A0Y(str, 0);
            return new NavigateThreadSearch(str);
        }

        public final String component1() {
            return this.query;
        }

        public final String getQuery() {
            return this.query;
        }

        public int hashCode() {
            return this.query.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes6.dex */
    public interface Navigation extends UiAction {
    }

    /* loaded from: classes6.dex */
    public final class SetChatTheme extends C06G implements UiAction {
        public final String themeId;

        public SetChatTheme(String str) {
            C7384Etj.A0Y(str, 0);
            this.themeId = str;
        }

        public final SetChatTheme copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new SetChatTheme(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SetChatTheme) && C7384Etj.areEqual(this.themeId, ((SetChatTheme) obj).themeId));
        }

        public static /* synthetic */ SetChatTheme copy$default(SetChatTheme setChatTheme, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setChatTheme.themeId;
            }
            C7384Etj.A0Y(str, 0);
            return new SetChatTheme(str);
        }

        public final String component1() {
            return this.themeId;
        }

        public final String getThemeId() {
            return this.themeId;
        }

        public int hashCode() {
            return this.themeId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
