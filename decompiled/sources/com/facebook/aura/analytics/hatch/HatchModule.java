package com.facebook.aura.analytics.hatch;

import X.Ey9;
import X.F3w;
import com.facebook.aura.activation.view.AuraActivationScreenKt;
import com.facebook.aura.feed.view.FeedUnitRowKt;
import com.facebook.aura.library.view.HatchLibraryTabScreenKt;
import com.facebook.aura.notifications.push.AuraNotificationChannels;
import com.facebook.aura.settings.HatchSettingsScreenKt;
import com.facebook.aura.spaces.view.HatchSpacesModalScreenKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchModule {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchModule[] $VALUES;
    public static final HatchModule HATCH_ARTIFACT_VIEWER;
    public static final HatchModule HATCH_CHAT;
    public static final HatchModule HATCH_CONNECTIONS;
    public static final HatchModule HATCH_CONNECTIONS_ADD;
    public static final HatchModule HATCH_CONNECTIONS_RECEIVED_ITEM;
    public static final HatchModule HATCH_CONNECTIONS_SHARE;
    public static final HatchModule HATCH_CONNECTIONS_SHARE_STATUS;
    public static final HatchModule HATCH_CONNECTION_ACCEPT_INVITE;
    public static final HatchModule HATCH_CONNECTION_ACCEPT_LEVEL;
    public static final HatchModule HATCH_CONNECTION_ADD_PERMISSION;
    public static final HatchModule HATCH_CONNECTION_DETAIL;
    public static final HatchModule HATCH_CONNECTION_HISTORY;
    public static final HatchModule HATCH_CONNECTION_PAIRING_STATUS;
    public static final HatchModule HATCH_CONNECTION_RULE_EDITOR;
    public static final HatchModule HATCH_CVM_SWITCH;
    public static final HatchModule HATCH_DEVICE_PAIRING;
    public static final HatchModule HATCH_FEED;
    public static final HatchModule HATCH_FEEDBACK;
    public static final HatchModule HATCH_GOALS;
    public static final HatchModule HATCH_GOALS_COMPLETED;
    public static final HatchModule HATCH_GOAL_DETAILS;
    public static final HatchModule HATCH_IDEAS;
    public static final HatchModule HATCH_LIBRARY;
    public static final HatchModule HATCH_LIBRARY_ARTIFACTS;
    public static final HatchModule HATCH_LIBRARY_MEDIA;
    public static final HatchModule HATCH_MEDIA_VIEWER;
    public static final HatchModule HATCH_MODEL_PICKER;
    public static final HatchModule HATCH_NEW_CHAT;
    public static final HatchModule HATCH_ONBOARDING;
    public static final HatchModule HATCH_PEER_SPACE;
    public static final HatchModule HATCH_PROFILE;
    public static final HatchModule HATCH_SEARCH;
    public static final HatchModule HATCH_SETTINGS;
    public static final HatchModule HATCH_SHARED_GOAL;
    public static final HatchModule HATCH_SPACES;
    public static final HatchModule HATCH_STATUS;
    public static final HatchModule HATCH_VOICE_MODE;
    public static final HatchModule WATCH_APPROVAL;
    public static final HatchModule WATCH_AVATAR_MENU;
    public static final HatchModule WATCH_BUG_REPORT;
    public static final HatchModule WATCH_CALL;
    public static final HatchModule WATCH_CHAT;
    public static final HatchModule WATCH_HOME;
    public static final HatchModule WATCH_KEYBOARD;
    public static final HatchModule WATCH_SETTINGS;
    public static final HatchModule WATCH_SETUP;
    public static final HatchModule WATCH_VOICE;
    public final String moduleClassName;
    public final String moduleName;

    static {
        HatchModule hatchModule = new HatchModule("HATCH_CHAT", 0, AuraNotificationChannels.CHAT_NOTIF_ID, "HatchConversationScreen");
        HATCH_CHAT = hatchModule;
        HatchModule hatchModule2 = new HatchModule("HATCH_NEW_CHAT", 1, "hatch_new_chat", "HatchConversationScreen");
        HATCH_NEW_CHAT = hatchModule2;
        HatchModule hatchModule3 = new HatchModule("HATCH_LIBRARY", 2, "hatch_library", HatchLibraryTabScreenKt.TAG);
        HATCH_LIBRARY = hatchModule3;
        HatchModule hatchModule4 = new HatchModule("HATCH_LIBRARY_MEDIA", 3, "hatch_library_media", "MediaGalleryScreen");
        HATCH_LIBRARY_MEDIA = hatchModule4;
        HatchModule hatchModule5 = new HatchModule("HATCH_LIBRARY_ARTIFACTS", 4, "hatch_library_artifacts", "ArtifactsDetailScreen");
        HATCH_LIBRARY_ARTIFACTS = hatchModule5;
        HatchModule hatchModule6 = new HatchModule("HATCH_GOALS", 5, "hatch_goals", "HatchGoalsTabScreen");
        HATCH_GOALS = hatchModule6;
        HatchModule hatchModule7 = new HatchModule("HATCH_GOAL_DETAILS", 6, "hatch_goal_details", "GoalDetailScreen");
        HATCH_GOAL_DETAILS = hatchModule7;
        HatchModule hatchModule8 = new HatchModule("HATCH_GOALS_COMPLETED", 7, "hatch_goals_completed", "GoalsCompletedScreen");
        HATCH_GOALS_COMPLETED = hatchModule8;
        HatchModule hatchModule9 = new HatchModule("HATCH_SETTINGS", 8, "hatch_settings", HatchSettingsScreenKt.TAG);
        HATCH_SETTINGS = hatchModule9;
        HatchModule hatchModule10 = new HatchModule("HATCH_PROFILE", 9, "hatch_profile", "HatchProfileScreen");
        HATCH_PROFILE = hatchModule10;
        HatchModule hatchModule11 = new HatchModule("HATCH_SEARCH", 10, "hatch_search", "HatchSearchScreen");
        HATCH_SEARCH = hatchModule11;
        HatchModule hatchModule12 = new HatchModule("HATCH_VOICE_MODE", 11, "hatch_voice_mode", "HatchVoiceModeScreen");
        HATCH_VOICE_MODE = hatchModule12;
        HatchModule hatchModule13 = new HatchModule("HATCH_MEDIA_VIEWER", 12, "hatch_media_viewer", "ContentViewerScreen");
        HATCH_MEDIA_VIEWER = hatchModule13;
        HatchModule hatchModule14 = new HatchModule("HATCH_ARTIFACT_VIEWER", 13, "hatch_artifact_viewer", "ContentViewerScreen");
        HATCH_ARTIFACT_VIEWER = hatchModule14;
        HatchModule hatchModule15 = new HatchModule("HATCH_ONBOARDING", 14, "hatch_onboarding", AuraActivationScreenKt.TAG);
        HATCH_ONBOARDING = hatchModule15;
        HatchModule hatchModule16 = new HatchModule("HATCH_STATUS", 15, "hatch_status", "HatchStatusScreen");
        HATCH_STATUS = hatchModule16;
        HatchModule hatchModule17 = new HatchModule("HATCH_MODEL_PICKER", 16, "hatch_model_picker", "HatchModelPickerSheet");
        HATCH_MODEL_PICKER = hatchModule17;
        HatchModule hatchModule18 = new HatchModule("HATCH_DEVICE_PAIRING", 17, "hatch_device_pairing", "HatchDevicePairingScreen");
        HATCH_DEVICE_PAIRING = hatchModule18;
        HatchModule hatchModule19 = new HatchModule("HATCH_FEEDBACK", 18, "hatch_feedback", "HatchFeedbackScreen");
        HATCH_FEEDBACK = hatchModule19;
        HatchModule hatchModule20 = new HatchModule("HATCH_SPACES", 19, "hatch_spaces", HatchSpacesModalScreenKt.TAG);
        HATCH_SPACES = hatchModule20;
        HatchModule hatchModule21 = new HatchModule("HATCH_FEED", 20, FeedUnitRowKt.FeedVideoSurfaceTag, "FeedTabScreen");
        HATCH_FEED = hatchModule21;
        HatchModule hatchModule22 = new HatchModule("HATCH_IDEAS", 21, "hatch_ideas", "HatchIdeasTabScreen");
        HATCH_IDEAS = hatchModule22;
        HatchModule hatchModule23 = new HatchModule("HATCH_CVM_SWITCH", 22, "hatch_cvm_switch", "ConfidentialVmSwitchIntroScreen");
        HATCH_CVM_SWITCH = hatchModule23;
        HatchModule hatchModule24 = new HatchModule("HATCH_CONNECTIONS", 23, "hatch_connections", "ConnectionsTabScreen");
        HATCH_CONNECTIONS = hatchModule24;
        HatchModule hatchModule25 = new HatchModule("HATCH_CONNECTIONS_ADD", 24, "hatch_connections_add", "ConnectionsAddScreen");
        HATCH_CONNECTIONS_ADD = hatchModule25;
        HatchModule hatchModule26 = new HatchModule("HATCH_CONNECTION_DETAIL", 25, "hatch_connection_detail", "ConnectionsSheetScreen");
        HATCH_CONNECTION_DETAIL = hatchModule26;
        HatchModule hatchModule27 = new HatchModule("HATCH_CONNECTION_RULE_EDITOR", 26, "hatch_connection_rule_editor", "ConnectionsRuleEditorScreen");
        HATCH_CONNECTION_RULE_EDITOR = hatchModule27;
        HatchModule hatchModule28 = new HatchModule("HATCH_CONNECTION_ADD_PERMISSION", 27, "hatch_connection_add_permission", "ConnectionsAddPermissionScreen");
        HATCH_CONNECTION_ADD_PERMISSION = hatchModule28;
        HatchModule hatchModule29 = new HatchModule("HATCH_CONNECTIONS_SHARE", 28, "hatch_connections_share", "ConnectionsShareScreen");
        HATCH_CONNECTIONS_SHARE = hatchModule29;
        HatchModule hatchModule30 = new HatchModule("HATCH_CONNECTION_HISTORY", 29, "hatch_connection_history", "PairsHistoryScreen");
        HATCH_CONNECTION_HISTORY = hatchModule30;
        HatchModule hatchModule31 = new HatchModule("HATCH_PEER_SPACE", 30, "hatch_peer_space", "PeerSpaceScreen");
        HATCH_PEER_SPACE = hatchModule31;
        HatchModule hatchModule32 = new HatchModule("HATCH_CONNECTION_PAIRING_STATUS", 31, "hatch_connection_pairing_status", "PairsStatusScreen");
        HATCH_CONNECTION_PAIRING_STATUS = hatchModule32;
        HatchModule hatchModule33 = new HatchModule("HATCH_CONNECTION_ACCEPT_INVITE", 32, "hatch_connection_accept_invite", "PairsAcceptLinkScreen");
        HATCH_CONNECTION_ACCEPT_INVITE = hatchModule33;
        HatchModule hatchModule34 = new HatchModule("HATCH_CONNECTION_ACCEPT_LEVEL", 33, "hatch_connection_accept_level", "PairsAcceptPreferencesScreen");
        HATCH_CONNECTION_ACCEPT_LEVEL = hatchModule34;
        HatchModule hatchModule35 = new HatchModule("HATCH_CONNECTIONS_SHARE_STATUS", 34, "hatch_connections_share_status", "ConnectionsShareStatusScreen");
        HATCH_CONNECTIONS_SHARE_STATUS = hatchModule35;
        HatchModule hatchModule36 = new HatchModule("HATCH_CONNECTIONS_RECEIVED_ITEM", 35, "hatch_connections_received_item", "ConnectionsReceivedItemScreen");
        HATCH_CONNECTIONS_RECEIVED_ITEM = hatchModule36;
        HatchModule hatchModule37 = new HatchModule("HATCH_SHARED_GOAL", 36, "hatch_shared_goal", "SharedGoalScreen");
        HATCH_SHARED_GOAL = hatchModule37;
        HatchModule hatchModule38 = new HatchModule("WATCH_SETUP", 37, "watch_setup", "WatchSessionGate");
        WATCH_SETUP = hatchModule38;
        HatchModule hatchModule39 = new HatchModule("WATCH_HOME", 38, "watch_home", "WatchHomeScreen");
        WATCH_HOME = hatchModule39;
        HatchModule hatchModule40 = new HatchModule("WATCH_CHAT", 39, "watch_chat", "WatchConversationScreen");
        WATCH_CHAT = hatchModule40;
        HatchModule hatchModule41 = new HatchModule("WATCH_KEYBOARD", 40, "watch_keyboard", "WatchKeyboardScreen");
        WATCH_KEYBOARD = hatchModule41;
        HatchModule hatchModule42 = new HatchModule("WATCH_VOICE", 41, "watch_voice", "WatchDictationScreen");
        WATCH_VOICE = hatchModule42;
        HatchModule hatchModule43 = new HatchModule("WATCH_CALL", 42, "watch_call", "WatchCallScreen");
        WATCH_CALL = hatchModule43;
        HatchModule hatchModule44 = new HatchModule("WATCH_AVATAR_MENU", 43, "watch_avatar_menu", "WatchAvatarMenuScreen");
        WATCH_AVATAR_MENU = hatchModule44;
        HatchModule hatchModule45 = new HatchModule("WATCH_SETTINGS", 44, "watch_settings", "WatchSettingsScreen");
        WATCH_SETTINGS = hatchModule45;
        HatchModule hatchModule46 = new HatchModule("WATCH_BUG_REPORT", 45, "watch_bug_report", "WatchBugReportScreen");
        WATCH_BUG_REPORT = hatchModule46;
        HatchModule hatchModule47 = new HatchModule("WATCH_APPROVAL", 46, "watch_approval", "WatchApprovalDialog");
        WATCH_APPROVAL = hatchModule47;
        HatchModule[] hatchModuleArr = new HatchModule[47];
        System.arraycopy(new HatchModule[]{hatchModule, hatchModule2, hatchModule3, hatchModule4, hatchModule5, hatchModule6, hatchModule7, hatchModule8, hatchModule9, hatchModule10, hatchModule11, hatchModule12, hatchModule13, hatchModule14, hatchModule15, hatchModule16, hatchModule17, hatchModule18, hatchModule19, hatchModule20, hatchModule21, hatchModule22, hatchModule23, hatchModule24, hatchModule25, hatchModule26, hatchModule27}, 0, hatchModuleArr, 0, 27);
        System.arraycopy(new HatchModule[]{hatchModule28, hatchModule29, hatchModule30, hatchModule31, hatchModule32, hatchModule33, hatchModule34, hatchModule35, hatchModule36, hatchModule37, hatchModule38, hatchModule39, hatchModule40, hatchModule41, hatchModule42, hatchModule43, hatchModule44, hatchModule45, hatchModule46, hatchModule47}, 0, hatchModuleArr, 27, 20);
        $VALUES = hatchModuleArr;
        $ENTRIES = new F3w(hatchModuleArr);
    }

    public static Ey9<HatchModule> getEntries() {
        return $ENTRIES;
    }

    public static HatchModule valueOf(String str) {
        return (HatchModule) Enum.valueOf(HatchModule.class, str);
    }

    public static HatchModule[] values() {
        return (HatchModule[]) $VALUES.clone();
    }

    public final String getModuleClassName() {
        return this.moduleClassName;
    }

    public final String getModuleName() {
        return this.moduleName;
    }

    public HatchModule(String str, int i, String str2, String str3) {
        this.moduleName = str2;
        this.moduleClassName = str3;
    }
}
