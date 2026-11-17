package com.facebook.aura.tabs;

import X.AnonymousClass002;
import X.C06H;
import X.Ey9;
import X.F3w;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchClientCvmTab;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.navigation.key.ConnectionsModalScreenKey;
import com.facebook.aura.navigation.key.ConnectionsScreenKey;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.navigation.key.DemotedTabScreenKey;
import com.facebook.aura.navigation.key.ExploreModalScreenKey;
import com.facebook.aura.navigation.key.ExploreScreenKey;
import com.facebook.aura.navigation.key.FeedModalScreenKey;
import com.facebook.aura.navigation.key.FeedScreenKey;
import com.facebook.aura.navigation.key.HatchGoalsModalScreenKey;
import com.facebook.aura.navigation.key.HatchGoalsTabScreenKey;
import com.facebook.aura.navigation.key.LibraryModalScreenKey;
import com.facebook.aura.navigation.key.LibraryScreenKey;
import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class FixedTab {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FixedTab[] $VALUES;
    public static final FixedTab CHAT;
    public static final FixedTab CONNECTIONS;
    public static final FixedTab FEED;
    public static final FixedTab GOALS;
    public static final FixedTab IDEAS;
    public static final FixedTab LIBRARY;
    public final Integer attentionIconRes;
    public final int contentDescriptionResId;
    public final HatchClientCvmTab cvmTab;
    public final HatchComponent logComponent;
    public final DemotedTabScreenKey modalNavKey;
    public final AuraTabRootNavKey navKey;
    public final String navigationId;
    public final int selectedIconRes;
    public final Integer selectedStateDescriptionResId;
    public final String testTag;
    public final int unselectedIconRes;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FixedTab.values().length];
            try {
                AnonymousClass002.A13(FixedTab.CHAT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(FixedTab.FEED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(FixedTab.IDEAS, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(FixedTab.GOALS, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(FixedTab.CONNECTIONS, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(FixedTab.LIBRARY, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ FixedTab(String str, int i, String str2, String str3, int i2, Integer num, int i3, int i4, HatchComponent hatchComponent, HatchClientCvmTab hatchClientCvmTab, AuraTabRootNavKey auraTabRootNavKey, DemotedTabScreenKey demotedTabScreenKey, Integer num2, int i5, C06H c06h) {
        this(str, i, str2, str3, i2, num, i3, i4, hatchComponent, hatchClientCvmTab, auraTabRootNavKey, (i5 & 512) != 0 ? null : demotedTabScreenKey, (i5 & 1024) != 0 ? null : num2);
    }

    public static Ey9<FixedTab> getEntries() {
        return $ENTRIES;
    }

    public static FixedTab valueOf(String str) {
        return (FixedTab) Enum.valueOf(FixedTab.class, str);
    }

    public static FixedTab[] values() {
        return (FixedTab[]) $VALUES.clone();
    }

    public final Integer getAttentionIconRes() {
        return this.attentionIconRes;
    }

    public final int getContentDescriptionResId() {
        return this.contentDescriptionResId;
    }

    public final HatchClientCvmTab getCvmTab() {
        return this.cvmTab;
    }

    public final HatchComponent getLogComponent() {
        return this.logComponent;
    }

    public final DemotedTabScreenKey getModalNavKey() {
        return this.modalNavKey;
    }

    public final AuraTabRootNavKey getNavKey() {
        return this.navKey;
    }

    public final String getNavigationId() {
        return this.navigationId;
    }

    public final int getSelectedIconRes() {
        return this.selectedIconRes;
    }

    public final Integer getSelectedStateDescriptionResId() {
        return this.selectedStateDescriptionResId;
    }

    public final String getTestTag() {
        return this.testTag;
    }

    public final int getUnselectedIconRes() {
        return this.unselectedIconRes;
    }

    public final boolean matches(AuraTabRootNavKey auraTabRootNavKey) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (ordinal()) {
            case 0:
                return auraTabRootNavKey instanceof ConversationTabScreenKey;
            case 1:
                return auraTabRootNavKey instanceof FeedScreenKey;
            case 2:
                return auraTabRootNavKey instanceof ExploreScreenKey;
            case 3:
                return auraTabRootNavKey instanceof HatchGoalsTabScreenKey;
            case 4:
                return auraTabRootNavKey instanceof ConnectionsScreenKey;
            case 5:
                return auraTabRootNavKey instanceof LibraryScreenKey;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String str = "CHAT";
        int i = 0;
        String str2 = "chat";
        String str3 = "hatch-fixed-tab-chat";
        FixedTab fixedTab = new FixedTab(str, i, str2, str3, R.string._name_removed__res_0x7f12054d, null, R.drawable.aura_tab_chat_filled_24, R.drawable.aura_tab_chat_outline_24, HatchComponent.TAB_CHAT, HatchClientCvmTab.CHAT, ConversationTabScreenKey.INSTANCE, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1536, 0 == true ? 1 : 0);
        CHAT = fixedTab;
        int i2 = 1024;
        FixedTab fixedTab2 = new FixedTab("FEED", 1, "feed", "hatch-fixed-tab-feed", R.string._name_removed__res_0x7f120551, 0 == true ? 1 : 0, R.drawable.aura_tab_feed_filled_24, R.drawable.aura_tab_feed_outline_24, HatchComponent.TAB_FEED, HatchClientCvmTab.FEED, FeedScreenKey.INSTANCE, FeedModalScreenKey.INSTANCE, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        FEED = fixedTab2;
        FixedTab fixedTab3 = new FixedTab("IDEAS", 2, "explore", "hatch-fixed-tab-ideas", R.string._name_removed__res_0x7f120553, 0 == true ? 1 : 0, R.drawable.aura_tab_ideas_filled_24, R.drawable.aura_tab_ideas_outline_24, HatchComponent.TAB_IDEAS, HatchClientCvmTab.IDEAS, ExploreScreenKey.INSTANCE, ExploreModalScreenKey.INSTANCE, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        IDEAS = fixedTab3;
        FixedTab fixedTab4 = new FixedTab("GOALS", 3, "goals", "hatch-fixed-tab-goals", R.string._name_removed__res_0x7f120552, 0 == true ? 1 : 0, R.drawable.aura_tab_goals_filled_24, R.drawable.aura_tab_goals_outline_24, HatchComponent.TAB_GOALS, HatchClientCvmTab.GOALS, HatchGoalsTabScreenKey.INSTANCE, HatchGoalsModalScreenKey.INSTANCE, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        GOALS = fixedTab4;
        FixedTab fixedTab5 = new FixedTab("CONNECTIONS", 4, "connections", "hatch-fixed-tab-connections", R.string._name_removed__res_0x7f12054e, null, R.drawable.aura_connections_outline_24, R.drawable.aura_connections_outline_24, HatchComponent.TAB_CONNECTIONS, HatchClientCvmTab.CONNECTIONS, ConnectionsScreenKey.INSTANCE, ConnectionsModalScreenKey.INSTANCE, Integer.valueOf(R.drawable.aura_connections_waving_outline_24));
        CONNECTIONS = fixedTab5;
        FixedTab fixedTab6 = new FixedTab("LIBRARY", 5, "library", "hatch-fixed-tab-library", R.string._name_removed__res_0x7f120555, 0 == true ? 1 : 0, R.drawable.aura_tab_library_filled_24, R.drawable.aura_tab_library_outline_24, HatchComponent.TAB_LIBRARY, HatchClientCvmTab.LIBRARY, LibraryScreenKey.INSTANCE, LibraryModalScreenKey.INSTANCE, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        LIBRARY = fixedTab6;
        FixedTab[] fixedTabArr = {fixedTab, fixedTab2, fixedTab3, fixedTab4, fixedTab5, fixedTab6};
        $VALUES = fixedTabArr;
        $ENTRIES = new F3w(fixedTabArr);
    }

    public FixedTab(String str, int i, String str2, String str3, int i2, Integer num, int i3, int i4, HatchComponent hatchComponent, HatchClientCvmTab hatchClientCvmTab, AuraTabRootNavKey auraTabRootNavKey, DemotedTabScreenKey demotedTabScreenKey, Integer num2) {
        this.navigationId = str2;
        this.testTag = str3;
        this.contentDescriptionResId = i2;
        this.selectedStateDescriptionResId = num;
        this.selectedIconRes = i3;
        this.unselectedIconRes = i4;
        this.logComponent = hatchComponent;
        this.cvmTab = hatchClientCvmTab;
        this.navKey = auraTabRootNavKey;
        this.modalNavKey = demotedTabScreenKey;
        this.attentionIconRes = num2;
    }
}
