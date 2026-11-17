package com.facebook.aura.utils;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BV5;
import X.BzK;
import X.C31u;
import X.C3cG;
import X.C4JM;
import X.C7BY;
import X.InterfaceC7359EnW;
import android.app.Application;
import com.facebook.aura.common.prefs.HatchDeveloperPrefs;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.utils.MC;

/* loaded from: classes5.dex */
public final class HatchUtil {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties;
    public static final int $stable = 0;
    public static final String BUBBLE_BG_OPACITY_KEY = "bubble_bg_opacity";
    public static final String DATA_CONTROLS_PRIVACY_FALLBACK_URL = "https://www.facebook.com/privacy/genai";
    public static final HatchUtil INSTANCE;
    public static final long MILLIS_PER_DAY = 86400000;
    public static final String TYPING_INDICATOR_STATE_OFF = "off";
    public static final String TYPING_INDICATOR_STATE_ON = "on";
    public static final C31u _inAppReviewCooldownDays$delegate;
    public static final C31u _inAppReviewFeedLikeCount$delegate;
    public static final C31u _inAppReviewGoalCount$delegate;
    public static final C31u _inAppReviewIdeaCount$delegate;
    public static final C31u _inAppReviewMinAppDays$delegate;
    public static final C31u _inAppReviewResponseCount$delegate;
    public static final C31u _isArtifactSharingEnabled$delegate;
    public static final C31u _isChatReactionAnimationEnabled$delegate;
    public static final C31u _isCustomEmojiEnabled$delegate;
    public static final C31u _isDesktopTabEnabled$delegate;
    public static final C31u _isFirstPartyLinkPreviewEnabled$delegate;
    public static final C31u _isGoalsDragAndDropEnabled$delegate;
    public static final C31u _isGoalsSortAutomaticallyEnabled$delegate;
    public static final C31u _isImageOptionsMultiSelectEnabled$delegate;
    public static final C31u _isInAppReviewEnabled$delegate;
    public static final C31u _isInternalSettingsEnabled$delegate;
    public static final C31u _isSharingInviteToInstagramStoryEnabled$delegate;
    public static final C31u _isThirdPartyLinkPreviewEnabled$delegate;
    public static final C31u _isTrackingToGoalsDragEnabled$delegate;
    public static final C31u _isViewerEmployee$delegate;
    public static final C31u _isWatchAppPromoEnabled$delegate;
    public static final C31u _isWatchAppPromoSheetEnabled$delegate;
    public static final C31u _isWidgetWebViewIsolationDisabled$delegate;
    public static final C31u _showReactionBarAtPressPosition$delegate;
    public static final C31u _showTabSortingHint$delegate;
    public static final C31u _unmuteDisconnectedOnSend$delegate;
    public static final C31u _watchAppPromoInstalledUsersMode$delegate;
    public static final C31u _watchAppPromoPromptCount$delegate;
    public static final C31u dataControlsPrivacyUrlRaw$delegate;
    public static final C31u disconnectedBotStatusMuteSeconds$delegate;
    public static final C31u inviteStoryCodeTextRaw$delegate;
    public static final C31u isAgeVerificationEnabled$delegate;
    public static final boolean isAlphaDisconnectConnectorLearnMoreLinkRemovalEnabled = true;
    public static final boolean isAlphaHelpCenterLinkRemovalEnabled = false;
    public static final boolean isAlphaResetHatchLearnMoreLinkRemovalEnabled = true;
    public static final C31u isAppUpdateCheckEnabled$delegate;
    public static final C31u isConnectionsTabEnabled$delegate;
    public static final C31u isFeedEnabledByConfig$delegate;
    public static final C31u isGoalsTrackingSectionEnabled$delegate;
    public static final C31u isHatchLinksSettingsEnabled$delegate;
    public static final C31u isInviteFriendsEnabled$delegate;
    public static final C31u isLinkCommunityDevicesEnabled$delegate;
    public static final C31u isLinkDeviceOrderingEnabled$delegate;
    public static final C31u isLinkOtaForced$delegate;
    public static final C31u isLinkSdkTokenForwardingEnabled$delegate;
    public static final C31u isMarkdownSoftLineBreakReflowEnabled$delegate;
    public static final C31u isMessengerChannelEnabled$delegate;
    public static final C31u isNativeDataExportEnabled$delegate;
    public static final C31u isOfflineMessageQueueEnabled$delegate;
    public static final boolean isPullToRefreshLoaderEnabled = false;
    public static final C31u isRecordingSwipeableEnabled$delegate;
    public static final C31u isRedeemInviteEnabled$delegate;
    public static final C31u isResetHatchEnabled$delegate;
    public static final C31u isScratchToRevealCodeEnabled$delegate;
    public static final C31u isShareAvatarEnabled$delegate;
    public static final C31u isSharedArtifactReportEnabled$delegate;
    public static final C31u isSideChatBotStatusEnabled$delegate;
    public static final C31u isSubscriptionEnabled$delegate;
    public static final C31u isSvmToCvmActivationFlowEnabled$delegate;
    public static final boolean isVoiceDictationEnabled = true;
    public static final C31u isWearableConsentEnabled$delegate;
    public static final C31u isWearableDevicePageEnabled$delegate;
    public static final C31u isWebViewFileRenderingEnabled$delegate;
    public static final C31u linkFleetManagerUrl$delegate;
    public static final C31u linkOtaMinFirmwareVersion$delegate;
    public static final C31u linkOtaUrl$delegate;
    public static final C31u linkTosUrl$delegate;
    public static final C31u messengerMinVersion$delegate;
    public static final C31u metaHomeLinkSupportUrlRaw$delegate;
    public static final C31u playStoreMinVersionForceUpdate$delegate;
    public static final C31u shouldModelLockHideComposer$delegate;
    public static final C31u subscriptionOptOutDisclaimer$delegate;
    public static final C31u subscriptionOptOutWorkplaceGroupUrl$delegate;
    public static final C31u typingIndicatorShowStateRaw$delegate;

    static {
        InterfaceC7359EnW<Object>[] interfaceC7359EnWArr = new InterfaceC7359EnW[69];
        System.arraycopy(new InterfaceC7359EnW[]{C3cG.A0y(HatchUtil.class, "_isChatReactionAnimationEnabled", "get_isChatReactionAnimationEnabled()Z"), C3cG.A0y(HatchUtil.class, "_showReactionBarAtPressPosition", "get_showReactionBarAtPressPosition()Z"), C3cG.A0y(HatchUtil.class, "disconnectedBotStatusMuteSeconds", "getDisconnectedBotStatusMuteSeconds()J"), C3cG.A0y(HatchUtil.class, "_unmuteDisconnectedOnSend", "get_unmuteDisconnectedOnSend()Z"), C3cG.A0y(HatchUtil.class, "_isImageOptionsMultiSelectEnabled", "get_isImageOptionsMultiSelectEnabled()Z"), C3cG.A0y(HatchUtil.class, "_isWidgetWebViewIsolationDisabled", "get_isWidgetWebViewIsolationDisabled()Z"), C3cG.A0y(HatchUtil.class, "_showTabSortingHint", "get_showTabSortingHint()Z"), C3cG.A0y(HatchUtil.class, "_isFirstPartyLinkPreviewEnabled", "get_isFirstPartyLinkPreviewEnabled()Z"), C3cG.A0y(HatchUtil.class, "_isThirdPartyLinkPreviewEnabled", "get_isThirdPartyLinkPreviewEnabled()Z"), C3cG.A0y(HatchUtil.class, "_isCustomEmojiEnabled", "get_isCustomEmojiEnabled()Z"), C3cG.A0y(HatchUtil.class, "_isViewerEmployee", "get_isViewerEmployee()Z"), C3cG.A0y(HatchUtil.class, "dataControlsPrivacyUrlRaw", "getDataControlsPrivacyUrlRaw()Ljava/lang/String;"), C3cG.A0y(HatchUtil.class, "metaHomeLinkSupportUrlRaw", "getMetaHomeLinkSupportUrlRaw()Ljava/lang/String;"), C3cG.A0y(HatchUtil.class, "_isInternalSettingsEnabled", "get_isInternalSettingsEnabled()Z"), C3cG.A0y(HatchUtil.class, "isHatchLinksSettingsEnabled", "isHatchLinksSettingsEnabled()Z"), C3cG.A0y(HatchUtil.class, "isWearableDevicePageEnabled", "isWearableDevicePageEnabled()Z"), C3cG.A0y(HatchUtil.class, "linkOtaMinFirmwareVersion", "getLinkOtaMinFirmwareVersion()Ljava/lang/String;"), C3cG.A0y(HatchUtil.class, "linkOtaUrl", "getLinkOtaUrl()Ljava/lang/String;"), C3cG.A0y(HatchUtil.class, "linkFleetManagerUrl", "getLinkFleetManagerUrl()Ljava/lang/String;"), C3cG.A0y(HatchUtil.class, "linkTosUrl", "getLinkTosUrl()Ljava/lang/String;"), C3cG.A0y(HatchUtil.class, "isLinkDeviceOrderingEnabled", "isLinkDeviceOrderingEnabled()Z"), C3cG.A0y(HatchUtil.class, "isLinkOtaForced", "isLinkOtaForced()Z"), C3cG.A0y(HatchUtil.class, "isLinkCommunityDevicesEnabled", "isLinkCommunityDevicesEnabled()Z"), C3cG.A0y(HatchUtil.class, "isLinkSdkTokenForwardingEnabled", "isLinkSdkTokenForwardingEnabled()Z"), C3cG.A0y(HatchUtil.class, "isRecordingSwipeableEnabled", "isRecordingSwipeableEnabled()Z"), C3cG.A0y(HatchUtil.class, "isWebViewFileRenderingEnabled", "isWebViewFileRenderingEnabled()Z"), C3cG.A0y(HatchUtil.class, "isShareAvatarEnabled", "isShareAvatarEnabled()Z")}, 0, interfaceC7359EnWArr, 0, 27);
        System.arraycopy(new InterfaceC7359EnW[]{C3cG.A0y(HatchUtil.class, "isOfflineMessageQueueEnabled", "isOfflineMessageQueueEnabled()Z"), C3cG.A0y(HatchUtil.class, "isResetHatchEnabled", "isResetHatchEnabled()Z"), C3cG.A0y(HatchUtil.class, "isNativeDataExportEnabled", "isNativeDataExportEnabled()Z"), C3cG.A0y(HatchUtil.class, "isSharedArtifactReportEnabled", "isSharedArtifactReportEnabled()Z"), C3cG.A0y(HatchUtil.class, "_isArtifactSharingEnabled", "get_isArtifactSharingEnabled()Z"), C3cG.A0y(HatchUtil.class, "isAppUpdateCheckEnabled", "isAppUpdateCheckEnabled()Z"), C3cG.A0y(HatchUtil.class, "playStoreMinVersionForceUpdate", "getPlayStoreMinVersionForceUpdate()Ljava/lang/String;"), C3cG.A0y(HatchUtil.class, "inviteStoryCodeTextRaw", "getInviteStoryCodeTextRaw()Ljava/lang/String;"), C3cG.A0y(HatchUtil.class, "_isInAppReviewEnabled", "get_isInAppReviewEnabled()Z"), C3cG.A0y(HatchUtil.class, "_inAppReviewCooldownDays", "get_inAppReviewCooldownDays()I"), C3cG.A0y(HatchUtil.class, "_inAppReviewResponseCount", "get_inAppReviewResponseCount()I"), C3cG.A0y(HatchUtil.class, "_inAppReviewFeedLikeCount", "get_inAppReviewFeedLikeCount()I"), C3cG.A0y(HatchUtil.class, "_inAppReviewGoalCount", "get_inAppReviewGoalCount()I"), C3cG.A0y(HatchUtil.class, "_inAppReviewIdeaCount", "get_inAppReviewIdeaCount()I"), C3cG.A0y(HatchUtil.class, "_inAppReviewMinAppDays", "get_inAppReviewMinAppDays()I"), C3cG.A0y(HatchUtil.class, "_isWatchAppPromoEnabled", "get_isWatchAppPromoEnabled()Z"), C3cG.A0y(HatchUtil.class, "_watchAppPromoPromptCount", "get_watchAppPromoPromptCount()I"), C3cG.A0y(HatchUtil.class, "_isWatchAppPromoSheetEnabled", "get_isWatchAppPromoSheetEnabled()Z"), C3cG.A0y(HatchUtil.class, "_watchAppPromoInstalledUsersMode", "get_watchAppPromoInstalledUsersMode()I"), C3cG.A0y(HatchUtil.class, "_isDesktopTabEnabled", "get_isDesktopTabEnabled()Z"), C3cG.A0y(HatchUtil.class, "isInviteFriendsEnabled", "isInviteFriendsEnabled()Z"), C3cG.A0y(HatchUtil.class, "isRedeemInviteEnabled", "isRedeemInviteEnabled()Z"), C3cG.A0y(HatchUtil.class, "_isSharingInviteToInstagramStoryEnabled", "get_isSharingInviteToInstagramStoryEnabled()Z"), C3cG.A0y(HatchUtil.class, "isScratchToRevealCodeEnabled", "isScratchToRevealCodeEnabled()Z"), C3cG.A0y(HatchUtil.class, "shouldModelLockHideComposer", "getShouldModelLockHideComposer()Z"), C3cG.A0y(HatchUtil.class, "isAgeVerificationEnabled", "isAgeVerificationEnabled()Z"), C3cG.A0y(HatchUtil.class, "isSvmToCvmActivationFlowEnabled", "isSvmToCvmActivationFlowEnabled()Z")}, 0, interfaceC7359EnWArr, 27, 27);
        System.arraycopy(new InterfaceC7359EnW[]{C3cG.A0y(HatchUtil.class, "isWearableConsentEnabled", "isWearableConsentEnabled()Z"), C3cG.A0y(HatchUtil.class, "isSubscriptionEnabled", "isSubscriptionEnabled()Z"), C3cG.A0y(HatchUtil.class, "subscriptionOptOutDisclaimer", "getSubscriptionOptOutDisclaimer()Ljava/lang/String;"), C3cG.A0y(HatchUtil.class, "subscriptionOptOutWorkplaceGroupUrl", "getSubscriptionOptOutWorkplaceGroupUrl()Ljava/lang/String;"), C3cG.A0y(HatchUtil.class, "isMessengerChannelEnabled", "isMessengerChannelEnabled()Z"), C3cG.A0y(HatchUtil.class, "messengerMinVersion", "getMessengerMinVersion()I"), C3cG.A0y(HatchUtil.class, "isFeedEnabledByConfig", "isFeedEnabledByConfig()Z"), C3cG.A0y(HatchUtil.class, "isConnectionsTabEnabled", "isConnectionsTabEnabled()Z"), C3cG.A0y(HatchUtil.class, "isGoalsTrackingSectionEnabled", "isGoalsTrackingSectionEnabled()Z"), C3cG.A0y(HatchUtil.class, "_isGoalsDragAndDropEnabled", "get_isGoalsDragAndDropEnabled()Z"), C3cG.A0y(HatchUtil.class, "_isTrackingToGoalsDragEnabled", "get_isTrackingToGoalsDragEnabled()Z"), C3cG.A0y(HatchUtil.class, "_isGoalsSortAutomaticallyEnabled", "get_isGoalsSortAutomaticallyEnabled()Z"), C3cG.A0y(HatchUtil.class, "isSideChatBotStatusEnabled", "isSideChatBotStatusEnabled()Z"), C3cG.A0y(HatchUtil.class, "isMarkdownSoftLineBreakReflowEnabled", "isMarkdownSoftLineBreakReflowEnabled()Z"), C3cG.A0y(HatchUtil.class, "typingIndicatorShowStateRaw", "getTypingIndicatorShowStateRaw()Ljava/lang/String;")}, 0, interfaceC7359EnWArr, 54, 15);
        $$delegatedProperties = interfaceC7359EnWArr;
        INSTANCE = new HatchUtil();
        _isChatReactionAnimationEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_reaction_animation);
        _showReactionBarAtPressPosition$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_message_bubble.show_reaction_bar_at_press_position);
        disconnectedBotStatusMuteSeconds$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigLong(MC.hatch_message_bubble.disconnected_bot_status_mute_sec);
        _unmuteDisconnectedOnSend$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_message_bubble.unmute_disconnected_on_send);
        _isImageOptionsMultiSelectEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_message_bubble.image_options_multi_select_enabled);
        _isWidgetWebViewIsolationDisabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_s722426_mitigation.disable_widget_webview_isolation);
        _showTabSortingHint$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_side_panel.show_tab_sorting_hint);
        _isFirstPartyLinkPreviewEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_message_bubble.link_1p_preview_enabled);
        _isThirdPartyLinkPreviewEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_message_bubble.link_3p_preview_enabled);
        _isCustomEmojiEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_custom_emoji);
        _isViewerEmployee$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_employee.is_viewer_employee);
        dataControlsPrivacyUrlRaw$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_android.data_controls_privacy_url);
        metaHomeLinkSupportUrlRaw$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_legal_urls_sessionless.home_device_help_url);
        _isInternalSettingsEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_internal_settings);
        isHatchLinksSettingsEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_hatch_links_settings);
        isWearableDevicePageEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.wearable_device_page_enabled);
        linkOtaMinFirmwareVersion$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_link.ota_min_firmware_version);
        linkOtaUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_link.ota_url);
        linkFleetManagerUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_link.fleet_manager_url);
        linkTosUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_link.link_tos_url);
        isLinkDeviceOrderingEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_link.device_ordering_enabled);
        isLinkOtaForced$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_link.ota_force);
        isLinkCommunityDevicesEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_link.community_devices);
        isLinkSdkTokenForwardingEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_link.sdk_token_forwarding_enabled);
        isRecordingSwipeableEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_swipeable_recording);
        isWebViewFileRenderingEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.file_webview_enabled);
        isShareAvatarEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.is_share_avatar_enabled);
        isOfflineMessageQueueEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_offline_message_queue);
        isResetHatchEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_reset_hatch);
        isNativeDataExportEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_native_data_export);
        isSharedArtifactReportEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_shared_artifact_report);
        _isArtifactSharingEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.artifact_sharing_enabled);
        isAppUpdateCheckEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_app_update_check);
        playStoreMinVersionForceUpdate$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_android.play_store_min_version_force_update);
        inviteStoryCodeTextRaw$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_android.invite_story_code_text);
        _isInAppReviewEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_googleplay_review.review_enabled);
        _inAppReviewCooldownDays$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_googleplay_review.cooldown_days);
        _inAppReviewResponseCount$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_googleplay_review.response_count);
        _inAppReviewFeedLikeCount$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_googleplay_review.feed_likes_count);
        _inAppReviewGoalCount$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_googleplay_review.goal_count);
        _inAppReviewIdeaCount$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_googleplay_review.idea_count);
        _inAppReviewMinAppDays$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_googleplay_review.min_app_days);
        _isWatchAppPromoEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_wear.watch_promotion_on_phone);
        _watchAppPromoPromptCount$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_android_wear.watch_promotion_prompt_count);
        _isWatchAppPromoSheetEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_wear.watch_promotion_bottomsheet);
        _watchAppPromoInstalledUsersMode$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_android_wear.watch_promotion_for_installed_users_int);
        _isDesktopTabEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_activity_screen.desktop_tab_enabled);
        isInviteFriendsEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_gtm.invite_enabled);
        isRedeemInviteEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_gtm.redeem_invite_enabled);
        _isSharingInviteToInstagramStoryEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_gtm.enable_sharing_invite_to_ig_story);
        isScratchToRevealCodeEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_gtm.is_scratch_to_reveal_code_enabled);
        shouldModelLockHideComposer$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_cvm.model_lock_should_hide_composer);
        isAgeVerificationEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_onboarding_abra.enable_age_verification);
        isSvmToCvmActivationFlowEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_cvm.svm_to_cvm_activation_flows);
        isWearableConsentEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_onboarding_abra.enable_wearable_consent);
        isSubscriptionEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_native_subscription_flow);
        subscriptionOptOutDisclaimer$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_android_subscription.opt_out_disclaimer);
        subscriptionOptOutWorkplaceGroupUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_android_subscription.opt_out_workplace_group);
        isMessengerChannelEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.show_messenger_channel);
        messengerMinVersion$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_android.messenger_min_version);
        isFeedEnabledByConfig$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_feed);
        isConnectionsTabEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_side_panel.agent_to_agent_tab);
        isGoalsTrackingSectionEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_visual_refresh.goals_tracking_section_enabled);
        _isGoalsDragAndDropEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.goals_sorting_enabled);
        _isTrackingToGoalsDragEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.tracking_to_goals_enabled);
        _isGoalsSortAutomaticallyEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.goals_sort_automatically_enabled);
        isSideChatBotStatusEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_conversation_threads_bot_status);
        isMarkdownSoftLineBreakReflowEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_markdown_soft_line_break_reflow);
        typingIndicatorShowStateRaw$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_android.typing_indicator_show_state);
    }

    private final String getDataControlsPrivacyUrlRaw() {
        return BV5.A0m(this, dataControlsPrivacyUrlRaw$delegate, $$delegatedProperties, 11);
    }

    private final long getDisconnectedBotStatusMuteSeconds() {
        return C3cG.A05(disconnectedBotStatusMuteSeconds$delegate.getValue(this, $$delegatedProperties[2]));
    }

    private final String getInviteStoryCodeTextRaw() {
        return BV5.A0m(this, inviteStoryCodeTextRaw$delegate, $$delegatedProperties, 34);
    }

    private final String getMetaHomeLinkSupportUrlRaw() {
        return BV5.A0m(this, metaHomeLinkSupportUrlRaw$delegate, $$delegatedProperties, 12);
    }

    private final String getTypingIndicatorShowStateRaw() {
        return BV5.A0m(this, typingIndicatorShowStateRaw$delegate, $$delegatedProperties, 68);
    }

    private final int get_inAppReviewCooldownDays() {
        return BV5.A05(this, _inAppReviewCooldownDays$delegate, $$delegatedProperties, 36);
    }

    private final int get_inAppReviewFeedLikeCount() {
        return BV5.A05(this, _inAppReviewFeedLikeCount$delegate, $$delegatedProperties, 38);
    }

    private final int get_inAppReviewGoalCount() {
        return BV5.A05(this, _inAppReviewGoalCount$delegate, $$delegatedProperties, 39);
    }

    private final int get_inAppReviewIdeaCount() {
        return BV5.A05(this, _inAppReviewIdeaCount$delegate, $$delegatedProperties, 40);
    }

    private final int get_inAppReviewMinAppDays() {
        return BV5.A05(this, _inAppReviewMinAppDays$delegate, $$delegatedProperties, 41);
    }

    private final int get_inAppReviewResponseCount() {
        return BV5.A05(this, _inAppReviewResponseCount$delegate, $$delegatedProperties, 37);
    }

    private final boolean get_isArtifactSharingEnabled() {
        return C31u.A01(this, _isArtifactSharingEnabled$delegate, $$delegatedProperties, 31);
    }

    private final boolean get_isChatReactionAnimationEnabled() {
        return C31u.A01(this, _isChatReactionAnimationEnabled$delegate, $$delegatedProperties, 0);
    }

    private final boolean get_isCustomEmojiEnabled() {
        return C31u.A01(this, _isCustomEmojiEnabled$delegate, $$delegatedProperties, 9);
    }

    private final boolean get_isDesktopTabEnabled() {
        return C31u.A01(this, _isDesktopTabEnabled$delegate, $$delegatedProperties, 46);
    }

    private final boolean get_isFirstPartyLinkPreviewEnabled() {
        return C31u.A01(this, _isFirstPartyLinkPreviewEnabled$delegate, $$delegatedProperties, 7);
    }

    private final boolean get_isGoalsDragAndDropEnabled() {
        return C31u.A01(this, _isGoalsDragAndDropEnabled$delegate, $$delegatedProperties, 63);
    }

    private final boolean get_isGoalsSortAutomaticallyEnabled() {
        return C31u.A01(this, _isGoalsSortAutomaticallyEnabled$delegate, $$delegatedProperties, 65);
    }

    private final boolean get_isImageOptionsMultiSelectEnabled() {
        return C31u.A01(this, _isImageOptionsMultiSelectEnabled$delegate, $$delegatedProperties, 4);
    }

    private final boolean get_isInAppReviewEnabled() {
        return C31u.A01(this, _isInAppReviewEnabled$delegate, $$delegatedProperties, 35);
    }

    private final boolean get_isInternalSettingsEnabled() {
        return C31u.A01(this, _isInternalSettingsEnabled$delegate, $$delegatedProperties, 13);
    }

    private final boolean get_isSharingInviteToInstagramStoryEnabled() {
        return C31u.A01(this, _isSharingInviteToInstagramStoryEnabled$delegate, $$delegatedProperties, 49);
    }

    private final boolean get_isThirdPartyLinkPreviewEnabled() {
        return C31u.A01(this, _isThirdPartyLinkPreviewEnabled$delegate, $$delegatedProperties, 8);
    }

    private final boolean get_isTrackingToGoalsDragEnabled() {
        return C31u.A01(this, _isTrackingToGoalsDragEnabled$delegate, $$delegatedProperties, 64);
    }

    private final boolean get_isViewerEmployee() {
        return C31u.A01(this, _isViewerEmployee$delegate, $$delegatedProperties, 10);
    }

    private final boolean get_isWatchAppPromoEnabled() {
        return C31u.A01(this, _isWatchAppPromoEnabled$delegate, $$delegatedProperties, 42);
    }

    private final boolean get_isWatchAppPromoSheetEnabled() {
        return C31u.A01(this, _isWatchAppPromoSheetEnabled$delegate, $$delegatedProperties, 44);
    }

    private final boolean get_isWidgetWebViewIsolationDisabled() {
        return C31u.A01(this, _isWidgetWebViewIsolationDisabled$delegate, $$delegatedProperties, 5);
    }

    private final boolean get_showReactionBarAtPressPosition() {
        return C31u.A01(this, _showReactionBarAtPressPosition$delegate, $$delegatedProperties, 1);
    }

    private final boolean get_showTabSortingHint() {
        return C31u.A01(this, _showTabSortingHint$delegate, $$delegatedProperties, 6);
    }

    private final boolean get_unmuteDisconnectedOnSend() {
        return C31u.A01(this, _unmuteDisconnectedOnSend$delegate, $$delegatedProperties, 3);
    }

    private final int get_watchAppPromoInstalledUsersMode() {
        return BV5.A05(this, _watchAppPromoInstalledUsersMode$delegate, $$delegatedProperties, 45);
    }

    private final int get_watchAppPromoPromptCount() {
        return BV5.A05(this, _watchAppPromoPromptCount$delegate, $$delegatedProperties, 43);
    }

    private final boolean isFeedEnabledByConfig() {
        return C31u.A01(this, isFeedEnabledByConfig$delegate, $$delegatedProperties, 60);
    }

    private final boolean isTestBuild() {
        return false;
    }

    public final int getBubbleBgOpacity() {
        return HatchPrefsStore.INSTANCE.internalPrefs().getInt(BUBBLE_BG_OPACITY_KEY, -1);
    }

    public final String getLinkFleetManagerUrl() {
        return BV5.A0m(this, linkFleetManagerUrl$delegate, $$delegatedProperties, 18);
    }

    public final String getLinkOtaMinFirmwareVersion() {
        return BV5.A0m(this, linkOtaMinFirmwareVersion$delegate, $$delegatedProperties, 16);
    }

    public final String getLinkOtaUrl() {
        return BV5.A0m(this, linkOtaUrl$delegate, $$delegatedProperties, 17);
    }

    public final String getLinkTosUrl() {
        return BV5.A0m(this, linkTosUrl$delegate, $$delegatedProperties, 19);
    }

    public final int getMessengerMinVersion() {
        return BV5.A05(this, messengerMinVersion$delegate, $$delegatedProperties, 59);
    }

    public final String getPlayStoreMinVersionForceUpdate() {
        return BV5.A0m(this, playStoreMinVersionForceUpdate$delegate, $$delegatedProperties, 33);
    }

    public final boolean getShouldModelLockHideComposer() {
        return C31u.A01(this, shouldModelLockHideComposer$delegate, $$delegatedProperties, 51);
    }

    public final String getSubscriptionOptOutDisclaimer() {
        return BV5.A0m(this, subscriptionOptOutDisclaimer$delegate, $$delegatedProperties, 56);
    }

    public final String getSubscriptionOptOutWorkplaceGroupUrl() {
        return BV5.A0m(this, subscriptionOptOutWorkplaceGroupUrl$delegate, $$delegatedProperties, 57);
    }

    public final boolean getUseSnpDebugTransparencyPolicy() {
        boolean z = HatchDeveloperPrefs.cachedIsFeedEnabled;
        return false;
    }

    public final boolean isActivationEnabled() {
        return true;
    }

    public final boolean isAgeVerificationEnabled() {
        return C31u.A01(this, isAgeVerificationEnabled$delegate, $$delegatedProperties, 52);
    }

    public final boolean isAppUpdateCheckEnabled() {
        return C31u.A01(this, isAppUpdateCheckEnabled$delegate, $$delegatedProperties, 32);
    }

    public final boolean isAuraApp() {
        Application application = C4JM.A00;
        return application != null && application.getPackageName().startsWith("com.facebook.aura");
    }

    public final boolean isConnectionsTabEnabled() {
        return C31u.A01(this, isConnectionsTabEnabled$delegate, $$delegatedProperties, 61);
    }

    public final boolean isFeedEnabled() {
        return HatchDeveloperPrefs.cachedIsFeedEnabled || isFeedEnabledByConfig();
    }

    public final boolean isGoalsTrackingSectionEnabled() {
        return C31u.A01(this, isGoalsTrackingSectionEnabled$delegate, $$delegatedProperties, 62);
    }

    public final boolean isHatchLinksSettingsEnabled() {
        return C31u.A01(this, isHatchLinksSettingsEnabled$delegate, $$delegatedProperties, 14);
    }

    public final boolean isInternalSettingsEnabled() {
        return HatchLeakPreventionUtil.INSTANCE.isLeakPreventionHashCorrect() && get_isInternalSettingsEnabled();
    }

    public final boolean isInviteFriendsEnabled() {
        return C31u.A01(this, isInviteFriendsEnabled$delegate, $$delegatedProperties, 47);
    }

    public final boolean isLinkCommunityDevicesEnabled() {
        return C31u.A01(this, isLinkCommunityDevicesEnabled$delegate, $$delegatedProperties, 22);
    }

    public final boolean isLinkDeviceOrderingEnabled() {
        return C31u.A01(this, isLinkDeviceOrderingEnabled$delegate, $$delegatedProperties, 20);
    }

    public final boolean isLinkOtaForced() {
        return C31u.A01(this, isLinkOtaForced$delegate, $$delegatedProperties, 21);
    }

    public final boolean isLinkSdkTokenForwardingEnabled() {
        return C31u.A01(this, isLinkSdkTokenForwardingEnabled$delegate, $$delegatedProperties, 23);
    }

    public final boolean isMarkdownSoftLineBreakReflowEnabled() {
        return C31u.A01(this, isMarkdownSoftLineBreakReflowEnabled$delegate, $$delegatedProperties, 67);
    }

    public final boolean isMessengerChannelEnabled() {
        return C31u.A01(this, isMessengerChannelEnabled$delegate, $$delegatedProperties, 58);
    }

    public final boolean isNativeDataExportEnabled() {
        return C31u.A01(this, isNativeDataExportEnabled$delegate, $$delegatedProperties, 29);
    }

    public final boolean isOfflineMessageQueueEnabled() {
        return C31u.A01(this, isOfflineMessageQueueEnabled$delegate, $$delegatedProperties, 27);
    }

    public final boolean isRecordingSwipeableEnabled() {
        return C31u.A01(this, isRecordingSwipeableEnabled$delegate, $$delegatedProperties, 24);
    }

    public final boolean isRedeemInviteEnabled() {
        return C31u.A01(this, isRedeemInviteEnabled$delegate, $$delegatedProperties, 48);
    }

    public final boolean isResetHatchEnabled() {
        return C31u.A01(this, isResetHatchEnabled$delegate, $$delegatedProperties, 28);
    }

    public final boolean isScratchToRevealCodeEnabled() {
        return C31u.A01(this, isScratchToRevealCodeEnabled$delegate, $$delegatedProperties, 50);
    }

    public final boolean isShareAvatarEnabled() {
        return C31u.A01(this, isShareAvatarEnabled$delegate, $$delegatedProperties, 26);
    }

    public final boolean isSharedArtifactReportEnabled() {
        return C31u.A01(this, isSharedArtifactReportEnabled$delegate, $$delegatedProperties, 30);
    }

    public final boolean isSideChatBotStatusEnabled() {
        return C31u.A01(this, isSideChatBotStatusEnabled$delegate, $$delegatedProperties, 66);
    }

    public final boolean isSubscriptionEnabled() {
        return C31u.A01(this, isSubscriptionEnabled$delegate, $$delegatedProperties, 55);
    }

    public final boolean isSvmToCvmActivationFlowEnabled() {
        return C31u.A01(this, isSvmToCvmActivationFlowEnabled$delegate, $$delegatedProperties, 53);
    }

    public final boolean isViewerEmployee() {
        return HatchLeakPreventionUtil.INSTANCE.isLeakPreventionHashCorrect() && get_isViewerEmployee();
    }

    public final boolean isWearableConsentEnabled() {
        return C31u.A01(this, isWearableConsentEnabled$delegate, $$delegatedProperties, 54);
    }

    public final boolean isWearableDevicePageEnabled() {
        return C31u.A01(this, isWearableDevicePageEnabled$delegate, $$delegatedProperties, 15);
    }

    public final boolean isWebViewFileRenderingEnabled() {
        return C31u.A01(this, isWebViewFileRenderingEnabled$delegate, $$delegatedProperties, 25);
    }

    public final long disconnectedBotStatusMuteMs() {
        return getDisconnectedBotStatusMuteSeconds() * 1000;
    }

    public final String getDataControlsPrivacyUrl() {
        String dataControlsPrivacyUrlRaw = getDataControlsPrivacyUrlRaw();
        return C7BY.A0j(dataControlsPrivacyUrlRaw) ? "https://www.facebook.com/privacy/genai" : dataControlsPrivacyUrlRaw;
    }

    public final String getInviteStoryCodeText() {
        return AnonymousClass002.A0l(getInviteStoryCodeTextRaw());
    }

    public final String getMetaHomeLinkSupportUrl() {
        String strA0l = AnonymousClass002.A0l(getMetaHomeLinkSupportUrlRaw());
        if (strA0l.length() == 0) {
            return null;
        }
        return strA0l;
    }

    public final String getTypingIndicatorShowState() {
        String strA0u = AnonymousClass001.A0u(AnonymousClass002.A0l(getTypingIndicatorShowStateRaw()));
        return strA0u.length() == 0 ? TYPING_INDICATOR_STATE_ON : strA0u;
    }

    public final long inAppReviewCooldownMs() {
        int i = get_inAppReviewCooldownDays();
        if (i < 0) {
            i = 0;
        }
        return i * 86400000;
    }

    public final long inAppReviewFeedLikeCount() {
        int i = get_inAppReviewFeedLikeCount();
        if (i < 0) {
            i = 0;
        }
        return i;
    }

    public final long inAppReviewGoalCount() {
        int i = get_inAppReviewGoalCount();
        if (i < 0) {
            i = 0;
        }
        return i;
    }

    public final long inAppReviewIdeaCount() {
        int i = get_inAppReviewIdeaCount();
        if (i < 0) {
            i = 0;
        }
        return i;
    }

    public final long inAppReviewMinAppDays() {
        int i = get_inAppReviewMinAppDays();
        if (i < 0) {
            i = 0;
        }
        return i;
    }

    public final long inAppReviewResponseCount() {
        int i = get_inAppReviewResponseCount();
        if (i < 0) {
            i = 0;
        }
        return i;
    }

    public final boolean isArtifactSharingEnabled() {
        return get_isArtifactSharingEnabled();
    }

    public final boolean isChatReactionAnimationEnabled() {
        return get_isChatReactionAnimationEnabled();
    }

    public final boolean isCustomEmojiEnabled() {
        return get_isCustomEmojiEnabled();
    }

    public final boolean isDesktopTabEnabled() {
        return get_isDesktopTabEnabled();
    }

    public final boolean isFirstPartyLinkPreviewEnabled() {
        return get_isFirstPartyLinkPreviewEnabled();
    }

    public final boolean isGoalsDragAndDropEnabled() {
        return get_isGoalsDragAndDropEnabled();
    }

    public final boolean isGoalsSortAutomaticallyEnabled() {
        return get_isGoalsSortAutomaticallyEnabled();
    }

    public final boolean isHatchEnabled() {
        return isAuraApp();
    }

    public final boolean isImageOptionsMultiSelectEnabled() {
        return get_isImageOptionsMultiSelectEnabled();
    }

    public final boolean isInAppReviewEnabled() {
        return get_isInAppReviewEnabled();
    }

    public final boolean isSharingInviteToInstagramStoryEnabled() {
        return get_isSharingInviteToInstagramStoryEnabled();
    }

    public final boolean isThirdPartyLinkPreviewEnabled() {
        return get_isThirdPartyLinkPreviewEnabled();
    }

    public final boolean isTrackingToGoalsDragEnabled() {
        return get_isTrackingToGoalsDragEnabled();
    }

    public final boolean isWatchAppPromoEnabled() {
        return get_isWatchAppPromoEnabled();
    }

    public final boolean isWatchAppPromoSheetEnabled() {
        return get_isWatchAppPromoSheetEnabled();
    }

    public final boolean isWidgetWebViewIsolationEnabled() {
        return !get_isWidgetWebViewIsolationDisabled();
    }

    public final void setBubbleBgOpacity(int i) {
        BzK bzKA01 = BzK.A01();
        bzKA01.AYo(BUBBLE_BG_OPACITY_KEY, i);
        bzKA01.apply();
    }

    public final boolean showReactionBarAtPressPosition() {
        return get_showReactionBarAtPressPosition();
    }

    public final boolean showTabSortingHint() {
        return get_showTabSortingHint();
    }

    public final boolean unmuteDisconnectedOnSend() {
        return get_unmuteDisconnectedOnSend();
    }

    public final int watchAppPromoInstalledUsersMode() {
        return get_watchAppPromoInstalledUsersMode();
    }

    public final long watchAppPromoPromptCount() {
        int i = get_watchAppPromoPromptCount();
        if (i < 0) {
            i = 0;
        }
        return i;
    }
}
