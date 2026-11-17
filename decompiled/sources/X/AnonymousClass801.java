package X;

import android.content.Context;
import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.accessv2.AuraAccessLibraryPublishActivationHandler;
import com.facebook.aura.accessv2.AuraAccessLibraryPublisher;
import com.facebook.aura.activation.model.ActivationStepLogging;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.ageverification.AgeStepInfoSheetEntryProvider;
import com.facebook.aura.ageverification.AgeVerificationSignOutCleanup;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.analytics.hatch.HatchDeviceInfoBackgroundTrigger;
import com.facebook.aura.analytics.hatch.HatchDeviceInfoLogger;
import com.facebook.aura.analytics.impl.AnalyticsIdentityActivationHandler;
import com.facebook.aura.appappearance.AppAppearanceUiCommandProvider;
import com.facebook.aura.appreview.HatchInAppReviewSendHook;
import com.facebook.aura.appupdate.AppUpdateNudgeProvider;
import com.facebook.aura.appupdate.AppUpdateStartupJob;
import com.facebook.aura.assist.DefaultAssistantNudgeProvider;
import com.facebook.aura.audio.HatchAudioCacheSignOutCleanup;
import com.facebook.aura.browsertask.conversation.BrowserSignInPushCapability;
import com.facebook.aura.browsertask.conversation.BrowserTaskDeeplinkRouteProvider;
import com.facebook.aura.browsertask.conversation.BrowserTaskPresentationCardRendererProvider;
import com.facebook.aura.browsertask.navigation.BrowserTaskUiCommandProvider;
import com.facebook.aura.bugreport.AuraHtmlDiagnosticsBugReportContributor;
import com.facebook.aura.bugreport.AuraNetworkLogBugReportContributor;
import com.facebook.aura.ccv.accountlink.HatchFOAAccountLinkDeeplinkRouteProvider;
import com.facebook.aura.ccv.accountlink.HatchFOAAccountLinkEntryProvider;
import com.facebook.aura.channels.connect.ChannelConnectDeeplinkRouteProvider;
import com.facebook.aura.channels.connect.ChannelConnectEntryProvider;
import com.facebook.aura.commands.alarm.AlarmDismissAllHandler;
import com.facebook.aura.commands.alarm.AlarmDismissHandler;
import com.facebook.aura.commands.alarm.AlarmListHandler;
import com.facebook.aura.commands.alarm.AlarmSetHandler;
import com.facebook.aura.commands.alarm.AlarmUpdateHandler;
import com.facebook.aura.commands.alarm.AlarmsDataSource;
import com.facebook.aura.commands.alarm.ReminderDismissAllHandler;
import com.facebook.aura.commands.alarm.ReminderDismissHandler;
import com.facebook.aura.commands.alarm.ReminderListHandler;
import com.facebook.aura.commands.alarm.ReminderSetHandler;
import com.facebook.aura.commands.alarm.ReminderSnoozeHandler;
import com.facebook.aura.commands.alarm.ReminderUpdateHandler;
import com.facebook.aura.commands.alarm.RemindersDataSource;
import com.facebook.aura.commands.app.AppInfoHandler;
import com.facebook.aura.commands.app.AppUpdateCheckHandler;
import com.facebook.aura.commands.app.AppUpdateStartHandler;
import com.facebook.aura.commands.app.AssistantSetDefaultHandler;
import com.facebook.aura.commands.app.ShortcutAddHomeHandler;
import com.facebook.aura.commands.background.BackgroundSessionHandler;
import com.facebook.aura.commands.battery.BatteryGetHandler;
import com.facebook.aura.commands.calendar.CalendarDataSource;
import com.facebook.aura.commands.calendar.CalendarEventsCreateHandler;
import com.facebook.aura.commands.calendar.CalendarEventsDeleteHandler;
import com.facebook.aura.commands.calendar.CalendarEventsUpdateHandler;
import com.facebook.aura.commands.calendar.CalendarRemindersListHandler;
import com.facebook.aura.commands.calendar.CalendarRemindersRemoveHandler;
import com.facebook.aura.commands.calendar.CalendarRemindersSetHandler;
import com.facebook.aura.commands.calendar.CalendarSearchHandler;
import com.facebook.aura.commands.calllogs.CallLogDataSource;
import com.facebook.aura.commands.calllogs.CallLogSearchHandler;
import com.facebook.aura.commands.contacts.ContactsCreateHandler;
import com.facebook.aura.commands.contacts.ContactsDataSource;
import com.facebook.aura.commands.contacts.ContactsDeleteHandler;
import com.facebook.aura.commands.contacts.ContactsSearchHandler;
import com.facebook.aura.commands.contacts.ContactsUpdateHandler;
import com.facebook.aura.commands.geofence.GeofenceListHandler;
import com.facebook.aura.commands.geofence.GeofenceRemoveHandler;
import com.facebook.aura.commands.geofence.GeofenceSetHandler;
import com.facebook.aura.commands.geofence.GeofencesDataSource;
import com.facebook.aura.commands.health.HealthDataSource;
import com.facebook.aura.commands.health.HealthSyncStartupJob;
import com.facebook.aura.commands.invite.InviteUpsellHandler;
import com.facebook.aura.commands.location.LocationDataSource;
import com.facebook.aura.commands.location.LocationGetHandler;
import com.facebook.aura.commands.network.NetworkStateHandler;
import com.facebook.aura.commands.notifications.NotificationFilterBugReportContributor;
import com.facebook.aura.commands.notifications.NotificationsActionHandler;
import com.facebook.aura.commands.notifications.NotificationsDataSource;
import com.facebook.aura.commands.notifications.NotificationsGetHandler;
import com.facebook.aura.commands.phone.PhoneCallHandler;
import com.facebook.aura.commands.photos.PhotosSearchHandler;
import com.facebook.aura.commands.photos.PhotosUploadHandler;
import com.facebook.aura.commands.photos.PhotosUploadStatusHandler;
import com.facebook.aura.commands.sms.MessageAttachmentGetHandler;
import com.facebook.aura.commands.sms.MessageDraftHandler;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.commands.sms.MessageSearchHandler;
import com.facebook.aura.commands.sms.MessageSendHandler;
import com.facebook.aura.commands.sms.SmsDataSource;
import com.facebook.aura.commands.subscriptions.SubscriptionsUpgradeHandler;
import com.facebook.aura.common.prefs.AuraPrefsSignOutCleanupHandler;
import com.facebook.aura.composer.camera.HatchCameraSignOutCleanup;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.confidentialvm.model.ConfidentialVmEligibilityListener;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmGatewayEventHandler;
import com.facebook.aura.confidentialvm.signout.ConfidentialVmSignOutCleanupHandler;
import com.facebook.aura.confidentialvm.view.ConfidentialVmDeeplinkRouteProvider;
import com.facebook.aura.confidentialvm.view.ConfidentialVmUpsellCardActionProvider;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchCleanupHandler;
import com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityIntegration;
import com.facebook.aura.conversation.common.HatchPendingMessage;
import com.facebook.aura.conversation.repo.HatchConversationRetainedSizes;
import com.facebook.aura.conversation.view.FlightOfferBookingRequestCleanupHandler;
import com.facebook.aura.conversation.view.FlightOfferDetailHolderCleanupHandler;
import com.facebook.aura.conversation.viewmodel.HatchComposerDraftKeysSignOutCleanup;
import com.facebook.aura.conversation.viewmodel.HatchPendingDiscussionItem;
import com.facebook.aura.conversation.widget.api.ConversationCardRenderer;
import com.facebook.aura.conversation.widget.api.ConversationPresentationActionContributor;
import com.facebook.aura.conversation.widget.api.ConversationPresentationCardRenderer;
import com.facebook.aura.conversation.widget.api.ConversationWidgetRenderer;
import com.facebook.aura.crashreporting.AuraCrashManagerLateStartupJob;
import com.facebook.aura.deeplink.AuraDeeplinkRouteSpec;
import com.facebook.aura.devices.entries.DevicesDeeplinkRouteProvider;
import com.facebook.aura.devices.entries.HatchLinkOrderEntryProvider;
import com.facebook.aura.devices.entries.HatchLinkPairingSheetEntryProvider;
import com.facebook.aura.devices.link.startup.DeviceRepairCheckJob;
import com.facebook.aura.devices.link.startup.LinkDeviceKeyRevocationJob;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.email.EmailAvailabilityStartupJob;
import com.facebook.aura.email.EmailDeeplinkRouteProvider;
import com.facebook.aura.email.EmailSetupInternalSettings;
import com.facebook.aura.email.entries.EmailEntryProvider;
import com.facebook.aura.email.view.EmailSettingsCapabilityProvider;
import com.facebook.aura.email.view.EmailSetupCapabilityProvider;
import com.facebook.aura.explore.uicontrol.IdeaUiCommandProvider;
import com.facebook.aura.explore.view.ExploreDeeplinkRouteProvider;
import com.facebook.aura.feed.repo.FeedGatewayEventHandler;
import com.facebook.aura.feed.view.FeedDeeplinkRouteProvider;
import com.facebook.aura.file.utils.HatchSharedCacheSignOutCleanup;
import com.facebook.aura.file.view.ContentViewerDataHolderCleanupHandler;
import com.facebook.aura.flights.FlightResultsEntryProvider;
import com.facebook.aura.gateway.HatchGatewayRetainedSizes;
import com.facebook.aura.gateway.intf.HatchLiveVmList;
import com.facebook.aura.gateway.service.HatchGatewayBackgroundedListener;
import com.facebook.aura.gateway.service.NodeCommandSignOutCleanup;
import com.facebook.aura.gateway.service.RunInBackgroundStartupJob;
import com.facebook.aura.gateway.store.VmSwitchCleanupType;
import com.facebook.aura.globaleffects.HatchVmRestartReplacementHandler;
import com.facebook.aura.graphql.AuraGraphQLSignOutCleanupHandler;
import com.facebook.aura.handoff.impl.entries.HandoffDeeplinkRoutes;
import com.facebook.aura.hotels.HotelBrowseEntryProvider;
import com.facebook.aura.hotels.HotelResultsKindProvider;
import com.facebook.aura.hotels.HotelResultsRendererProvider;
import com.facebook.aura.library.uicontrol.GoalUiCommandProvider;
import com.facebook.aura.localbrowser.LocalBrowserCapabilities;
import com.facebook.aura.localbrowser.LocalBrowserEngineCacheCleanup;
import com.facebook.aura.localbrowser.LocalBrowserEngineDownloadJob;
import com.facebook.aura.localbrowser.LocalBrowserInternalSettingsContributor;
import com.facebook.aura.localbrowser.LocalBrowserProfileActivationHandler;
import com.facebook.aura.localbrowser.LocalBrowserWakePushObserver;
import com.facebook.aura.login.nativeflow.HatchTempTokenProvider;
import com.facebook.aura.login.nativeflow.NativeLoginPrefetch;
import com.facebook.aura.marketplacemap.HatchMarketplaceMapWidgetRendererProvider;
import com.facebook.aura.marketplacemap.MarketplaceMapFullscreenEntryProvider;
import com.facebook.aura.memory.AuraCacheRetainedSizes;
import com.facebook.aura.memory.AuraCacheSignOutCleanup;
import com.facebook.aura.modellock.ModelLockAppealFileCleanup;
import com.facebook.aura.modellock.ModelLockGatewayEventHandler;
import com.facebook.aura.modellock.ModelLockVmSwitchCleanup;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.entries.ActivationEntryProvider;
import com.facebook.aura.navigation.entries.ActivationSettingsEntryProvider;
import com.facebook.aura.navigation.entries.ActivePermissionsEntryProvider;
import com.facebook.aura.navigation.entries.AgentComputerScreenEntryProvider;
import com.facebook.aura.navigation.entries.AgentPermissionEntryProvider;
import com.facebook.aura.navigation.entries.ApiKeyAuthEntryProvider;
import com.facebook.aura.navigation.entries.AppAppearanceSettingsEntryProvider;
import com.facebook.aura.navigation.entries.AppInfoEntryProvider;
import com.facebook.aura.navigation.entries.AppLockOverlayEntryProvider;
import com.facebook.aura.navigation.entries.AppUpdateHardBlockEntryProvider;
import com.facebook.aura.navigation.entries.ArchivedSideChatsEntryProvider;
import com.facebook.aura.navigation.entries.ArtifactsDetailEntryProvider;
import com.facebook.aura.navigation.entries.AuraInternalStatusSettingsEntryProvider;
import com.facebook.aura.navigation.entries.AuraSubscriptionSheetEntryProvider;
import com.facebook.aura.navigation.entries.BiometricsSettingsEntryProvider;
import com.facebook.aura.navigation.entries.BugReportEntryProvider;
import com.facebook.aura.navigation.entries.CancelEncryptionEntryProvider;
import com.facebook.aura.navigation.entries.ChannelsSettingsEntryProvider;
import com.facebook.aura.navigation.entries.ConfidentialVmRegisterPinEntryProvider;
import com.facebook.aura.navigation.entries.ConfidentialVmSwitchEntryProvider;
import com.facebook.aura.navigation.entries.ConnectedDevicesEntryProvider;
import com.facebook.aura.navigation.entries.ConnectorCatalogEntryProvider;
import com.facebook.aura.navigation.entries.ConnectorPermissionsEntryProvider;
import com.facebook.aura.navigation.entries.ConnectorPermissionsListEntryProvider;
import com.facebook.aura.navigation.entries.ContactSupportEntryProvider;
import com.facebook.aura.navigation.entries.ContentViewerEntryProvider;
import com.facebook.aura.navigation.entries.ConversationEntryProvider;
import com.facebook.aura.navigation.entries.ConversationSearchScreenEntryProvider;
import com.facebook.aura.navigation.entries.CustomConnectorAuthEntryProvider;
import com.facebook.aura.navigation.entries.DataPrivacySettingsEntryProvider;
import com.facebook.aura.navigation.entries.DefaultAssistantSettingsEntryProvider;
import com.facebook.aura.navigation.entries.DeviceDetailsEntryProvider;
import com.facebook.aura.navigation.entries.DevicePermissionsSettingsEntryProvider;
import com.facebook.aura.navigation.entries.DisconnectConfirmationEntryProvider;
import com.facebook.aura.navigation.entries.EncryptionEntryProvider;
import com.facebook.aura.navigation.entries.ExploreEntryProvider;
import com.facebook.aura.navigation.entries.ExploreIdeaCardDetailEntryProvider;
import com.facebook.aura.navigation.entries.FeedEntryProvider;
import com.facebook.aura.navigation.entries.FeedStatusSheetEntryProvider;
import com.facebook.aura.navigation.entries.FeedbackWriteEntryProvider;
import com.facebook.aura.navigation.entries.FlightOfferDetailsEntryProvider;
import com.facebook.aura.navigation.entries.FolderViewerEntryProvider;
import com.facebook.aura.navigation.entries.GoalCreationBottomSheetEntryProvider;
import com.facebook.aura.navigation.entries.GoalDetailEntryProvider;
import com.facebook.aura.navigation.entries.GoalsCompletedEntryProvider;
import com.facebook.aura.navigation.entries.GoalsEntryProvider;
import com.facebook.aura.navigation.entries.GraduationEntryProvider;
import com.facebook.aura.navigation.entries.HatchCheckpointOverlayEntryProvider;
import com.facebook.aura.navigation.entries.HatchFeedbackSheetEntryProvider;
import com.facebook.aura.navigation.entries.HatchFullscreenMapEntryProvider;
import com.facebook.aura.navigation.entries.HatchPausedOverlayEntryProvider;
import com.facebook.aura.navigation.entries.HatchPlaceDetailsSheetEntryProvider;
import com.facebook.aura.navigation.entries.HatchShareSheetEntryProvider;
import com.facebook.aura.navigation.entries.HatchSkillDetailEntryProvider;
import com.facebook.aura.navigation.entries.HatchStatusEntryProvider;
import com.facebook.aura.navigation.entries.HatchSurveySheetEntryProvider;
import com.facebook.aura.navigation.entries.HelpSupportSettingsEntryProvider;
import com.facebook.aura.navigation.entries.IdeaWidgetDetailEntryProvider;
import com.facebook.aura.navigation.entries.ImportMemoryToHatchEntryProvider;
import com.facebook.aura.navigation.entries.InternalSettingsAuxEntryProvider;
import com.facebook.aura.navigation.entries.InternalSettingsEntryProvider;
import com.facebook.aura.navigation.entries.InviteFriendEntryProvider;
import com.facebook.aura.navigation.entries.LegalSafetySettingsEntryProvider;
import com.facebook.aura.navigation.entries.LegalWebPageEntryProvider;
import com.facebook.aura.navigation.entries.LibraryEntryProvider;
import com.facebook.aura.navigation.entries.LocalBrowserEntryProvider;
import com.facebook.aura.navigation.entries.LocalConnectorConsentEntryProvider;
import com.facebook.aura.navigation.entries.LoggedOutBugReportEntryProvider;
import com.facebook.aura.navigation.entries.LoggedOutSettingsEntryProvider;
import com.facebook.aura.navigation.entries.MCDebugEntryProvider;
import com.facebook.aura.navigation.entries.ManageAccountSettingsEntryProvider;
import com.facebook.aura.navigation.entries.MediaGalleryEntryProvider;
import com.facebook.aura.navigation.entries.MessengerPinEntryProvider;
import com.facebook.aura.navigation.entries.MessengerResetPinEntryProvider;
import com.facebook.aura.navigation.entries.MessengerSettingsEntryProvider;
import com.facebook.aura.navigation.entries.MicPermissionDeniedOverlayEntryProvider;
import com.facebook.aura.navigation.entries.ModelLockSupportSheetEntryProvider;
import com.facebook.aura.navigation.entries.NativeLoginEntryProvider;
import com.facebook.aura.navigation.entries.NodeDebugEntryProvider;
import com.facebook.aura.navigation.entries.NotificationsSettingsEntryProvider;
import com.facebook.aura.navigation.entries.OnboardingGateEntryProvider;
import com.facebook.aura.navigation.entries.OnboardingUiFlowEntryProvider;
import com.facebook.aura.navigation.entries.OnboardingVariantSheetEntryProvider;
import com.facebook.aura.navigation.entries.PairsDeeplinkRoutes;
import com.facebook.aura.navigation.entries.PairsEntryProvider;
import com.facebook.aura.navigation.entries.PasswordAuthEntryProvider;
import com.facebook.aura.navigation.entries.PermissionDetailEntryProvider;
import com.facebook.aura.navigation.entries.PermissionsSettingsEntryProvider;
import com.facebook.aura.navigation.entries.PublishArtifactSheetEntryProvider;
import com.facebook.aura.navigation.entries.PublishSpaceSheetEntryProvider;
import com.facebook.aura.navigation.entries.RecipientPermissionsEntryProvider;
import com.facebook.aura.navigation.entries.RedeemComplimentarySubscriptionEntryProvider;
import com.facebook.aura.navigation.entries.RedeemInviteCodeEntryProvider;
import com.facebook.aura.navigation.entries.RichFormatEntryProvider;
import com.facebook.aura.navigation.entries.SecureStorageEntryProvider;
import com.facebook.aura.navigation.entries.SettingsEntryProvider;
import com.facebook.aura.navigation.entries.SharedContentEntryProvider;
import com.facebook.aura.navigation.entries.SkillConnectEntryProvider;
import com.facebook.aura.navigation.entries.SpaceInviteEntryProvider;
import com.facebook.aura.navigation.entries.SpaceMenuSheetEntryProvider;
import com.facebook.aura.navigation.entries.SpacesModalEntryProvider;
import com.facebook.aura.navigation.entries.StorageRecoveryEntryProvider;
import com.facebook.aura.navigation.entries.TaskPermissionsEntryProvider;
import com.facebook.aura.navigation.entries.TelegramSettingsEntryProvider;
import com.facebook.aura.navigation.entries.VmDisabledEntryProvider;
import com.facebook.aura.navigation.entries.VmUnavailableOverlayEntryProvider;
import com.facebook.aura.navigation.entries.WalletSettingsEntryProvider;
import com.facebook.aura.navigation.entries.WalletSetupSheetEntryProvider;
import com.facebook.aura.navigation.entries.WhatsAppCompanionEntryProvider;
import com.facebook.aura.navigation.entries.WhatsAppSettingsEntryProvider;
import com.facebook.aura.network.traffic.nts.HatchTrafficNetworkTelemetryServicesStartupJob;
import com.facebook.aura.network.transport.HatchVmInboundTrafficSignOutCleanup;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.nodes.cards.NodePermissionCardRendererProvider;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.datasource.DataSource;
import com.facebook.aura.nodes.datasource.NodeSyncBaselineSignOutCleanup;
import com.facebook.aura.nodes.json.ClientRegisterCapabilitiesParamsJson;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import com.facebook.aura.notifications.push.AuraFcmTokenSignOutCleanup;
import com.facebook.aura.notifications.push.AuraPushNotificationData;
import com.facebook.aura.notifications.push.HatchChatPushHistoryPrefetchObserver;
import com.facebook.aura.notifications.push.VmLockedVisiblePushObserver;
import com.facebook.aura.nudge.ConversationNudge;
import com.facebook.aura.nudge.NudgeActionCardRendererProvider;
import com.facebook.aura.onboarding.FirstChatSendHook;
import com.facebook.aura.pairs.ConnectionsTabStartupJob;
import com.facebook.aura.pairs.PairsGatewayEventHandler;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppOpenedListener;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger;
import com.facebook.aura.partners.voice.api.VoiceCatalogSignOutCleanup;
import com.facebook.aura.partners.voice.avatar.HatchCallIdleVideoSignOutCleanup;
import com.facebook.aura.partners.voice.callvolume.CallVolumeUiCommandProvider;
import com.facebook.aura.partners.voice.chrome.VoiceConversationPresentationActionProvider;
import com.facebook.aura.partners.voice.entries.HatchVoiceAnnouncementSheetEntryProvider;
import com.facebook.aura.partners.voice.entries.HatchVoiceNuxSheetEntryProvider;
import com.facebook.aura.partners.voice.entries.VoiceControlsSettingsEntryProvider;
import com.facebook.aura.partners.voice.entries.VoiceDeeplinkRouteProvider;
import com.facebook.aura.partners.voice.entries.VoiceInternalSettingsEntryProvider;
import com.facebook.aura.partners.voice.entries.VoiceSelectionListEntryProvider;
import com.facebook.aura.partners.voice.entries.VoiceSelectionListSheetEntryProvider;
import com.facebook.aura.partners.voice.impl.HatchVoiceOptionsWidgetRendererProvider;
import com.facebook.aura.partners.voice.impl.VoiceNodeCapabilityContributor;
import com.facebook.aura.partners.voice.shortcut.VoiceCallShortcut;
import com.facebook.aura.partners.voice.startup.HatchEmbodimentPrewarmStartupJob;
import com.facebook.aura.partners.voice.startup.HatchEmbodimentReadinessSeedStartupJob;
import com.facebook.aura.partners.voice.uicontrol.VoiceUiCommandProvider;
import com.facebook.aura.partners.wearables.entries.WearablesLinkingEntryProvider;
import com.facebook.aura.partners.wearables.linking.WearablesDeeplinkRouteProvider;
import com.facebook.aura.playground.navigation.entries.ItchEntryProvider;
import com.facebook.aura.preloads.HatchPreloadsAppOpenedListener;
import com.facebook.aura.rentalcars.RentalCarEntryProvider;
import com.facebook.aura.settings.HatchDataExportStatus;
import com.facebook.aura.settings.internal.api.InternalSettingsFeatureEntry;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.shopping.entries.ProductDetailsEntryProvider;
import com.facebook.aura.shopping.entries.ProductItemsEntryProvider;
import com.facebook.aura.shopping.entries.ShoppingCartEntryProvider;
import com.facebook.aura.shopping.repo.HatchProductDetailsVmSwitchCleanup;
import com.facebook.aura.shopping.view.ShoppingPresentationCardRendererProvider;
import com.facebook.aura.shopping.view.ShoppingProductInlineEntityIntegrationProvider;
import com.facebook.aura.shortcut.HomeScreenShortcutNudgeProvider;
import com.facebook.aura.shortcut.HomeScreenShortcutPersonalizationCleanup;
import com.facebook.aura.spaces.conversation.SharedSpaceWidgetKindProvider;
import com.facebook.aura.spaces.conversation.SharedSpaceWidgetRendererProvider;
import com.facebook.aura.spaces.conversation.SpaceBuildCompletedWidgetRendererProvider;
import com.facebook.aura.spaces.conversation.SpacesPresentationCardRendererProvider;
import com.facebook.aura.spaces.repo.SpacesGatewayEventHandler;
import com.facebook.aura.spaces.view.SpacesDeeplinkRouteProvider;
import com.facebook.aura.spacesharing.impl.SpaceShareUiCommandProvider;
import com.facebook.aura.startup.HatchUploadsCacheCleanupJob;
import com.facebook.aura.startup.analytics.AnalyticsIdentityStartupJob;
import com.facebook.aura.startup.analytics.AnalyticsModeStateSignOutCleanupHandler;
import com.facebook.aura.startup.analytics.AnalyticsModeStateStartupJob;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionedStartupJob;
import com.facebook.aura.startup.appjob.SessionlessStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import com.facebook.aura.startup.appreview.HatchInAppReviewDayCountStartupJob;
import com.facebook.aura.startup.attribution.HatchAttributionStartupJob;
import com.facebook.aura.startup.battery.AuraBatteryStartupJob;
import com.facebook.aura.startup.chattheme.HatchChatThemesStartupJob;
import com.facebook.aura.startup.checkpoint.HatchCheckpointProbeStartupJob;
import com.facebook.aura.startup.conversation.HatchConversationPrefetchStartupJob;
import com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob;
import com.facebook.aura.startup.fdid.AuraFamilyDeviceIdStartupJob;
import com.facebook.aura.startup.firstrun.HatchFirstRunStateStartupJob;
import com.facebook.aura.startup.fresco.AuraFrescoStartupJob;
import com.facebook.aura.startup.gateway.HatchGatewayConnectStartupJob;
import com.facebook.aura.startup.gateway.HatchProactiveSyncCatchUpJob;
import com.facebook.aura.startup.gateway.HatchVmWakeStartupJob;
import com.facebook.aura.startup.geofence.GeofenceReregisterStartupJob;
import com.facebook.aura.startup.graduation.HatchGraduationStartupJob;
import com.facebook.aura.startup.invite.HatchInviteBadgeStartupJob;
import com.facebook.aura.startup.login.NativeLoginPrefetchStartupJob;
import com.facebook.aura.startup.login.RefreshTokenMigrationStartupJob;
import com.facebook.aura.startup.mobileconfig.AuraMobileConfigsFetchStartupJob;
import com.facebook.aura.startup.mobileconfig.AuraSessionlessMobileConfigsFetchStartupJob;
import com.facebook.aura.startup.network.AuraNetworkMonitorStartupJob;
import com.facebook.aura.startup.onboarding.AuraNonBlockingOnboardingJob;
import com.facebook.aura.startup.onboarding.HatchDeferredDeeplinkStartupJob;
import com.facebook.aura.startup.onboarding.HatchInviteCodeRedeemStartupJob;
import com.facebook.aura.startup.onboardingassets.OnboardingAssetsStartupJob;
import com.facebook.aura.startup.permissions.HatchPermissionDefaultsPrefetchJob;
import com.facebook.aura.startup.preloads.HatchPreloadsFppStartupJob;
import com.facebook.aura.startup.preloads.HatchPreloadsTosAcceptStartupJob;
import com.facebook.aura.startup.processtext.AuraProcessTextStartupJob;
import com.facebook.aura.startup.push.AuraPushTokenStartupJob;
import com.facebook.aura.startup.qpl.AuraQplStartupCompleteJob;
import com.facebook.aura.startup.reminder.AlarmReregisterStartupJob;
import com.facebook.aura.startup.reminder.ReminderReregisterStartupJob;
import com.facebook.aura.startup.session.HatchPrimarySessionStartupJob;
import com.facebook.aura.startup.sessioninit.HatchSessionInitStartupJob;
import com.facebook.aura.startup.sharesheet.HatchShareRecipientsPrefetchStartupJob;
import com.facebook.aura.startup.userdata.AuraUserDataBackgroundRefreshJob;
import com.facebook.aura.startup.userdata.AuraUserDataStartupJob;
import com.facebook.aura.startup.video.HatchVideoStackPrewarmStartupJob;
import com.facebook.aura.startup.vms.FetchVmsStartupJob;
import com.facebook.aura.subscription.view.SubscriptionDeeplinkRouteProvider;
import com.facebook.aura.survey.HatchSurveyController;
import com.facebook.aura.survey.HatchSurveyStartupJob;
import com.facebook.aura.uicontrol.UiCommandContributor;
import com.facebook.aura.vmbrowser.runtime.BrowserInputFocusGatewayEventHandler;
import com.facebook.aura.watchhandoff.WatchAppPromoNudgeProvider;
import com.facebook.aura.watchhandoff.WatchAppPromoSendHook;
import com.facebook.aura.watchhandoff.WatchAppPromoSheetNudgeProvider;
import com.facebook.aura.watchhandoff.WatchConnectedLoggingStartupJob;
import com.facebook.aura.watchhandoff.WatchSessionHandoffLink;
import com.facebook.aura.watchhandoff.WatchSessionVmSwitchNotifier;
import com.facebook.aura.wearablebroadcast.HatchWearablePushObserver;
import com.facebook.aura.webview.HtmlWebViewPoolRetainedSizes;
import com.facebook.aura.widgets.AgentWidgetBackgroundedListener;
import com.facebook.aura.widgets.WidgetAppOpenedListener;
import com.facebook.aura.widgets.WidgetSignOutCleanup;
import com.facebook.aura.widgets.WidgetsStartupJob;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;
import org.maplibre.android.R;

/* renamed from: X.801, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass801 {
    public static ConversationInlineEntityIntegration A00(int i) {
        if (i == 0) {
            return ShoppingProductInlineEntityIntegrationProvider.INSTANCE.integration();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static ConversationCardRenderer A01(int i) {
        if (i == 0) {
            return NudgeActionCardRendererProvider.INSTANCE.renderer();
        }
        if (i == 1) {
            return NodePermissionCardRendererProvider.INSTANCE.renderer();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static ConversationPresentationActionContributor A02(int i) {
        if (i == 0) {
            return ConfidentialVmUpsellCardActionProvider.INSTANCE.contributor();
        }
        if (i == 1) {
            return VoiceConversationPresentationActionProvider.INSTANCE.contributor();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static ConversationPresentationCardRenderer A03(int i) {
        if (i == 0) {
            return BrowserTaskPresentationCardRendererProvider.INSTANCE.renderer();
        }
        if (i == 1) {
            return ShoppingPresentationCardRendererProvider.INSTANCE.renderer();
        }
        if (i == 2) {
            return SpacesPresentationCardRendererProvider.INSTANCE.renderer();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static ConversationWidgetRenderer A04(int i) {
        if (i == 0) {
            return HotelResultsRendererProvider.INSTANCE.renderer();
        }
        if (i == 1) {
            return HatchMarketplaceMapWidgetRendererProvider.INSTANCE.renderer();
        }
        if (i == 2) {
            return HatchVoiceOptionsWidgetRendererProvider.INSTANCE.renderer();
        }
        if (i == 3) {
            return SharedSpaceWidgetRendererProvider.INSTANCE.renderer();
        }
        if (i == 4) {
            return SpaceBuildCompletedWidgetRendererProvider.INSTANCE.renderer();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static ClientRegisterCapabilitiesParamsJson A07(int i, ClientRegisterCapabilitiesParamsJson clientRegisterCapabilitiesParamsJson, AbstractC3358CGz abstractC3358CGz, long j) {
        if (i == 0) {
            return LocalBrowserCapabilities.INSTANCE.contribute(clientRegisterCapabilitiesParamsJson, abstractC3358CGz, j);
        }
        if (i == 1) {
            return BrowserSignInPushCapability.INSTANCE.contribute(clientRegisterCapabilitiesParamsJson, abstractC3358CGz, j);
        }
        if (i == 2) {
            return VoiceNodeCapabilityContributor.INSTANCE.contribute(clientRegisterCapabilitiesParamsJson, abstractC3358CGz, j);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static ConversationNudge A09(int i) {
        if (i == 0) {
            return HomeScreenShortcutNudgeProvider.INSTANCE.nudge();
        }
        if (i == 1) {
            return AppUpdateNudgeProvider.INSTANCE.nudge();
        }
        if (i == 2) {
            return DefaultAssistantNudgeProvider.INSTANCE.nudge();
        }
        if (i == 3) {
            return WatchAppPromoNudgeProvider.INSTANCE.nudge();
        }
        if (i == 4) {
            return WatchAppPromoSheetNudgeProvider.INSTANCE.nudge();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static File A0L(int i, Context context, AbstractC3358CGz abstractC3358CGz, File file) {
        if (i == 0) {
            return AuraHtmlDiagnosticsBugReportContributor.INSTANCE.collectAttachment(context, abstractC3358CGz, file);
        }
        if (i == 1) {
            return AuraNetworkLogBugReportContributor.INSTANCE.collectAttachment(context, abstractC3358CGz, file);
        }
        if (i == 2) {
            return NotificationFilterBugReportContributor.INSTANCE.collectAttachment(context, abstractC3358CGz, file);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static String A0M(int i) {
        if (i == 0) {
            return EmailSettingsCapabilityProvider.INSTANCE.kind();
        }
        if (i == 1) {
            return EmailSetupCapabilityProvider.INSTANCE.kind();
        }
        if (i == 2) {
            return HotelResultsKindProvider.INSTANCE.kind();
        }
        if (i == 3) {
            return SharedSpaceWidgetKindProvider.INSTANCE.kind();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static String A0N(int i, Context context, AbstractC3358CGz abstractC3358CGz) {
        if (i == 0) {
            return AuraHtmlDiagnosticsBugReportContributor.INSTANCE.summarySection(context, abstractC3358CGz);
        }
        if (i == 1) {
            return AuraNetworkLogBugReportContributor.INSTANCE.summarySection(context, abstractC3358CGz);
        }
        if (i == 2) {
            return NotificationFilterBugReportContributor.INSTANCE.summarySection(context, abstractC3358CGz);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static List<InternalSettingsFeatureEntry> A0P(int i) {
        if (i == 0) {
            return LocalBrowserInternalSettingsContributor.INSTANCE.entries();
        }
        if (i == 1) {
            return EmailSetupInternalSettings.INSTANCE.entries();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static Map<String, Long> A0S(int i, AbstractC3358CGz abstractC3358CGz) {
        if (i == 0) {
            return HatchConversationRetainedSizes.INSTANCE.retainedSizes(abstractC3358CGz);
        }
        if (i == 1) {
            return AuraCacheRetainedSizes.INSTANCE.retainedSizes(abstractC3358CGz);
        }
        if (i == 2) {
            return HatchGatewayRetainedSizes.INSTANCE.retainedSizes(abstractC3358CGz);
        }
        if (i == 3) {
            return HtmlWebViewPoolRetainedSizes.INSTANCE.retainedSizes(abstractC3358CGz);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static void A0T(int i) {
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        HatchDeviceInfoBackgroundTrigger.INSTANCE.onAnalyticsEventReceived();
    }

    public static void A0V(int i) {
        if (i == 0) {
            HatchDeviceInfoLogger.INSTANCE.onAppBackgrounded();
            return;
        }
        if (i == 1) {
            HatchGatewayBackgroundedListener.INSTANCE.onAppBackgrounded();
        } else if (i == 2) {
            MAHatchNativeAuthAppStartLogger.INSTANCE.onAppBackgrounded();
        } else {
            if (i != 3) {
                throw AnonymousClass005.A0c(i);
            }
            AgentWidgetBackgroundedListener.INSTANCE.onAppBackgrounded();
        }
    }

    public static void A0W(int i, Context context) {
        if (i == 0) {
            LocalBrowserEngineCacheCleanup.INSTANCE.onAppOpened(context);
            return;
        }
        if (i == 1) {
            HatchPreloadsAppOpenedListener.INSTANCE.onAppOpened(context);
        } else if (i == 2) {
            MAHatchNativeAuthAppOpenedListener.INSTANCE.onAppOpened(context);
        } else {
            if (i != 3) {
                throw AnonymousClass005.A0c(i);
            }
            WidgetAppOpenedListener.INSTANCE.onAppOpened(context);
        }
    }

    public static void A0X(int i, Context context, AbstractC3358CGz abstractC3358CGz) {
        if (i == 0) {
            FirstChatSendHook.INSTANCE.onUserSentMessage(context, abstractC3358CGz);
        } else if (i == 1) {
            HatchInAppReviewSendHook.INSTANCE.onUserSentMessage(context, abstractC3358CGz);
        } else {
            if (i != 2) {
                throw AnonymousClass005.A0c(i);
            }
            WatchAppPromoSendHook.INSTANCE.onUserSentMessage(context, abstractC3358CGz);
        }
    }

    public static void A0Y(int i, C5rn<AuraNavKey> c5rn) {
        if (i == 0) {
            LoggedOutBugReportEntryProvider.INSTANCE.provideEntry(c5rn);
        } else if (i == 1) {
            LoggedOutSettingsEntryProvider.INSTANCE.provideEntry(c5rn);
        } else {
            if (i != 2) {
                throw AnonymousClass005.A0c(i);
            }
            NativeLoginEntryProvider.INSTANCE.provideEntry(c5rn);
        }
    }

    public static void A0a(int i, AuraPushNotificationData auraPushNotificationData) {
        if (i == 0) {
            LocalBrowserWakePushObserver.INSTANCE.onPushReceived(auraPushNotificationData);
            return;
        }
        if (i == 1) {
            HatchChatPushHistoryPrefetchObserver.INSTANCE.onPushReceived(auraPushNotificationData);
        } else if (i == 2) {
            VmLockedVisiblePushObserver.INSTANCE.onPushReceived(auraPushNotificationData);
        } else {
            if (i != 3) {
                throw AnonymousClass005.A0c(i);
            }
            HatchWearablePushObserver.INSTANCE.onPushReceived(auraPushNotificationData);
        }
    }

    public static void A0b(int i, AbstractC3358CGz abstractC3358CGz) {
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        HatchVmRestartReplacementHandler.INSTANCE.onVmReplaced(abstractC3358CGz);
    }

    public static void A0c(int i, AbstractC3358CGz abstractC3358CGz, HatchLiveVmList hatchLiveVmList) {
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        ConfidentialVmEligibilityListener.INSTANCE.onLiveVmList(abstractC3358CGz, hatchLiveVmList);
    }

    public static void A0d(int i, AbstractC3358CGz abstractC3358CGz, VmSwitchCleanupType vmSwitchCleanupType) {
        if (i == 0) {
            ConfidentialVmSwitchCleanupHandler.INSTANCE.onVmSwitch(abstractC3358CGz, vmSwitchCleanupType);
        } else if (i == 1) {
            ModelLockVmSwitchCleanup.INSTANCE.onVmSwitch(abstractC3358CGz, vmSwitchCleanupType);
        } else {
            if (i != 2) {
                throw AnonymousClass005.A0c(i);
            }
            HatchProductDetailsVmSwitchCleanup.INSTANCE.onVmSwitch(abstractC3358CGz, vmSwitchCleanupType);
        }
    }

    public static void A0e(int i, String str) {
        if (i == 0) {
            AuraAccessLibraryPublishActivationHandler.INSTANCE.onActivating(str);
        } else if (i == 1) {
            AnalyticsIdentityActivationHandler.INSTANCE.onActivating(str);
        } else {
            if (i != 2) {
                throw AnonymousClass005.A0c(i);
            }
            LocalBrowserProfileActivationHandler.INSTANCE.onActivating(str);
        }
    }

    public static boolean A0g(int i) {
        return i == 13318 || i == 13322 || i == 13330 || i == 13332 || i == 13340 || i == 15775 || i == 16526 || i == 24727 || i == 25546;
    }

    public static boolean A0i(int i) {
        return i == 13326 || i == 13336 || i == 16586 || i == 16927;
    }

    public static boolean A0j(int i, AbstractC3358CGz abstractC3358CGz) {
        if (i == 0) {
            return EmailSettingsCapabilityProvider.INSTANCE.supportsStandalonePresentation(abstractC3358CGz);
        }
        if (i == 1) {
            return EmailSetupCapabilityProvider.INSTANCE.supportsStandalonePresentation(abstractC3358CGz);
        }
        if (i == 2) {
            return HotelResultsKindProvider.INSTANCE.supportsStandalonePresentation(abstractC3358CGz);
        }
        if (i == 3) {
            return SharedSpaceWidgetKindProvider.INSTANCE.supportsStandalonePresentation(abstractC3358CGz);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static boolean A0k(int i, String str, JsonObject jsonObject, AbstractC3358CGz abstractC3358CGz) {
        if (i == 0) {
            return ConfidentialVmGatewayEventHandler.INSTANCE.handle(str, jsonObject, abstractC3358CGz);
        }
        if (i == 1) {
            return ModelLockGatewayEventHandler.INSTANCE.handle(str, jsonObject, abstractC3358CGz);
        }
        if (i == 2) {
            return FeedGatewayEventHandler.INSTANCE.handle(str, jsonObject, abstractC3358CGz);
        }
        if (i == 3) {
            return PairsGatewayEventHandler.INSTANCE.handle(str, jsonObject, abstractC3358CGz);
        }
        if (i == 4) {
            return SpacesGatewayEventHandler.INSTANCE.handle(str, jsonObject, abstractC3358CGz);
        }
        if (i == 5) {
            return BrowserInputFocusGatewayEventHandler.INSTANCE.handle(str, jsonObject, abstractC3358CGz);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] A0l() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32};
    }

    public static int[] A0m() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    }

    public static int[] A0n() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE, 102, 103, 104, 105, 106, 107, MinidumpReader.MODULE_FULL_SIZE, 109, 110, 111, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126};
    }

    public static int[] A0o() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    public static int[] A0p() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46};
    }

    public static int[] A0q() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47};
    }

    public static int[] A0r() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    public static NodeCommandId A05(int i) {
        switch (i) {
            case 0:
                return AlarmDismissAllHandler.INSTANCE.getCommandId();
            case 1:
                return AlarmDismissHandler.INSTANCE.getCommandId();
            case 2:
                return AlarmListHandler.INSTANCE.getCommandId();
            case 3:
                return AlarmSetHandler.INSTANCE.getCommandId();
            case 4:
                return AlarmUpdateHandler.INSTANCE.getCommandId();
            case 5:
                return ReminderDismissAllHandler.INSTANCE.getCommandId();
            case 6:
                return ReminderDismissHandler.INSTANCE.getCommandId();
            case 7:
                return ReminderListHandler.INSTANCE.getCommandId();
            case 8:
                return ReminderSetHandler.INSTANCE.getCommandId();
            case 9:
                return ReminderSnoozeHandler.INSTANCE.getCommandId();
            case 10:
                return ReminderUpdateHandler.INSTANCE.getCommandId();
            case 11:
                return NetworkStateHandler.INSTANCE.getCommandId();
            case 12:
                return ContactsCreateHandler.INSTANCE.getCommandId();
            case 13:
                return ContactsDeleteHandler.INSTANCE.getCommandId();
            case 14:
                return ContactsSearchHandler.INSTANCE.getCommandId();
            case 15:
                return ContactsUpdateHandler.INSTANCE.getCommandId();
            case 16:
                return NotificationsActionHandler.INSTANCE.getCommandId();
            case 17:
                return NotificationsGetHandler.INSTANCE.getCommandId();
            case 18:
                return AppInfoHandler.INSTANCE.getCommandId();
            case 19:
                return AppUpdateCheckHandler.INSTANCE.getCommandId();
            case 20:
                return AppUpdateStartHandler.INSTANCE.getCommandId();
            case 21:
                return AssistantSetDefaultHandler.INSTANCE.getCommandId();
            case 22:
                return ShortcutAddHomeHandler.INSTANCE.getCommandId();
            case 23:
                return BackgroundSessionHandler.INSTANCE.getCommandId();
            case 24:
                return BatteryGetHandler.INSTANCE.getCommandId();
            case 25:
                return CalendarEventsCreateHandler.INSTANCE.getCommandId();
            case 26:
                return CalendarEventsDeleteHandler.INSTANCE.getCommandId();
            case 27:
                return CalendarEventsUpdateHandler.INSTANCE.getCommandId();
            case 28:
                return CalendarRemindersListHandler.INSTANCE.getCommandId();
            case 29:
                return CalendarRemindersRemoveHandler.INSTANCE.getCommandId();
            case 30:
                return CalendarRemindersSetHandler.INSTANCE.getCommandId();
            case 31:
                return CalendarSearchHandler.INSTANCE.getCommandId();
            case 32:
                return CallLogSearchHandler.INSTANCE.getCommandId();
            case 33:
                return GeofenceListHandler.INSTANCE.getCommandId();
            case 34:
                return GeofenceRemoveHandler.INSTANCE.getCommandId();
            case 35:
                return GeofenceSetHandler.INSTANCE.getCommandId();
            case 36:
                return InviteUpsellHandler.INSTANCE.getCommandId();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return LocationGetHandler.INSTANCE.getCommandId();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return PhoneCallHandler.INSTANCE.getCommandId();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return PhotosSearchHandler.INSTANCE.getCommandId();
            case 40:
                return PhotosUploadHandler.INSTANCE.getCommandId();
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return PhotosUploadStatusHandler.INSTANCE.getCommandId();
            case 42:
                return MessageAttachmentGetHandler.INSTANCE.getCommandId();
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return MessageDraftHandler.INSTANCE.getCommandId();
            case 44:
                return MessageSearchHandler.INSTANCE.getCommandId();
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return MessageSendHandler.INSTANCE.getCommandId();
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return SubscriptionsUpgradeHandler.INSTANCE.getCommandId();
            default:
                throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
        }
    }

    public static DataSource A06(int i) {
        switch (i) {
            case 0:
                return AlarmsDataSource.INSTANCE;
            case 1:
                return RemindersDataSource.INSTANCE;
            case 2:
                return ContactsDataSource.INSTANCE;
            case 3:
                return NotificationsDataSource.INSTANCE;
            case 4:
                return CalendarDataSource.INSTANCE;
            case 5:
                return CallLogDataSource.INSTANCE;
            case 6:
                return GeofencesDataSource.INSTANCE;
            case 7:
                return HealthDataSource.INSTANCE;
            case 8:
                return LocationDataSource.INSTANCE;
            case 9:
                return SmsDataSource.INSTANCE;
            default:
                throw AnonymousClass005.A0c(i);
        }
    }

    public static HatchNodeCommandHandler A08(int i) {
        switch (i) {
            case 0:
                return AlarmDismissAllHandler.INSTANCE;
            case 1:
                return AlarmDismissHandler.INSTANCE;
            case 2:
                return AlarmListHandler.INSTANCE;
            case 3:
                return AlarmSetHandler.INSTANCE;
            case 4:
                return AlarmUpdateHandler.INSTANCE;
            case 5:
                return ReminderDismissAllHandler.INSTANCE;
            case 6:
                return ReminderDismissHandler.INSTANCE;
            case 7:
                return ReminderListHandler.INSTANCE;
            case 8:
                return ReminderSetHandler.INSTANCE;
            case 9:
                return ReminderSnoozeHandler.INSTANCE;
            case 10:
                return ReminderUpdateHandler.INSTANCE;
            case 11:
                return NetworkStateHandler.INSTANCE;
            case 12:
                return ContactsCreateHandler.INSTANCE;
            case 13:
                return ContactsDeleteHandler.INSTANCE;
            case 14:
                return ContactsSearchHandler.INSTANCE;
            case 15:
                return ContactsUpdateHandler.INSTANCE;
            case 16:
                return NotificationsActionHandler.INSTANCE;
            case 17:
                return NotificationsGetHandler.INSTANCE;
            case 18:
                return AppInfoHandler.INSTANCE;
            case 19:
                return AppUpdateCheckHandler.INSTANCE;
            case 20:
                return AppUpdateStartHandler.INSTANCE;
            case 21:
                return AssistantSetDefaultHandler.INSTANCE;
            case 22:
                return ShortcutAddHomeHandler.INSTANCE;
            case 23:
                return BackgroundSessionHandler.INSTANCE;
            case 24:
                return BatteryGetHandler.INSTANCE;
            case 25:
                return CalendarEventsCreateHandler.INSTANCE;
            case 26:
                return CalendarEventsDeleteHandler.INSTANCE;
            case 27:
                return CalendarEventsUpdateHandler.INSTANCE;
            case 28:
                return CalendarRemindersListHandler.INSTANCE;
            case 29:
                return CalendarRemindersRemoveHandler.INSTANCE;
            case 30:
                return CalendarRemindersSetHandler.INSTANCE;
            case 31:
                return CalendarSearchHandler.INSTANCE;
            case 32:
                return CallLogSearchHandler.INSTANCE;
            case 33:
                return GeofenceListHandler.INSTANCE;
            case 34:
                return GeofenceRemoveHandler.INSTANCE;
            case 35:
                return GeofenceSetHandler.INSTANCE;
            case 36:
                return InviteUpsellHandler.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return LocationGetHandler.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return PhoneCallHandler.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return PhotosSearchHandler.INSTANCE;
            case 40:
                return PhotosUploadHandler.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return PhotosUploadStatusHandler.INSTANCE;
            case 42:
                return MessageAttachmentGetHandler.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return MessageDraftHandler.INSTANCE;
            case 44:
                return MessageSearchHandler.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return MessageSendHandler.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return SubscriptionsUpgradeHandler.INSTANCE;
            default:
                throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
        }
    }

    public static AppJobId A0A(int i) {
        switch (i) {
            case 0:
                return AppJobId.CRASH_MANAGER_LATE;
            case 1:
                return AppJobId.CLEANUP_UPLOADS_CACHE;
            case 2:
                return AppJobId.BATTERY_METRICS;
            case 3:
                return AppJobId.FAMILY_DEVICE_ID_SYNC;
            case 4:
                return AppJobId.FIRST_RUN_STATE;
            case 5:
                return AppJobId.FRESCO;
            case 6:
                return AppJobId.NATIVE_LOGIN_PREFETCH;
            case 7:
                return AppJobId.FETCH_SESSIONLESS_MOBILE_CONFIGS;
            case 8:
                return AppJobId.NETWORK_MONITOR;
            case 9:
                return AppJobId.PREFETCH_ONBOARDING_ASSETS;
            case 10:
                return AppJobId.QPL_STARTUP_COMPLETE;
            default:
                throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
        }
    }

    public static AppJobKey A0B(int i) {
        switch (i) {
            case 0:
                return LocalBrowserEngineDownloadJob.INSTANCE.getJobId();
            case 1:
                return AppJobId.RUN_IN_BACKGROUND_SERVICE;
            case 2:
                HatchConversationPrefetchStartupJob hatchConversationPrefetchStartupJob = HatchConversationPrefetchStartupJob.INSTANCE;
                return AppJobId.CONVERSATION_PREFETCH;
            case 3:
                return AppJobId.APP_UPDATE_CHECK;
            case 4:
                return AppJobId.HEALTH_SYNC;
            case 5:
                return DeviceRepairCheckJob.INSTANCE.getJobId();
            case 6:
                return LinkDeviceKeyRevocationJob.INSTANCE.getJobId();
            case 7:
                return EmailAvailabilityStartupJob.INSTANCE.getJobId();
            case 8:
                return AppJobId.TRAFFIC_NTS;
            case 9:
                return AppJobId.CONNECTIONS_TAB;
            case 10:
                return HatchEmbodimentPrewarmStartupJob.INSTANCE.getJobId();
            case 11:
                return HatchEmbodimentReadinessSeedStartupJob.INSTANCE.getJobId();
            case 12:
                return AppJobId.ANALYTICS_IDENTITY;
            case 13:
                return AppJobId.ANALYTICS_MODE_STATE;
            case 14:
                return AppJobId.IN_APP_REVIEW_DAY_COUNT;
            case 15:
                return AppJobId.PAID_ADS_ATTRIBUTION;
            case 16:
                return AppJobId.CHAT_THEMES_FETCH;
            case 17:
                return AppJobId.CHECKPOINT_STATUS_PROBE;
            case 18:
                return AppJobId.TAB_PREFETCH_COORDINATOR;
            case 19:
                return AppJobId.GATEWAY_CONNECT;
            case 20:
                return AppJobId.PROACTIVE_SYNC_CATCH_UP;
            case 21:
                return AppJobId.WAKE_VM;
            case 22:
                return AppJobId.GEOFENCE_REREGISTER;
            case 23:
                return AppJobId.GRADUATION_FETCH;
            case 24:
                return AppJobId.INVITE_BADGE_FETCH;
            case 25:
                return AppJobId.REFRESH_TOKEN_MIGRATION;
            case 26:
                return AppJobId.FETCH_MOBILE_CONFIGS;
            case 27:
                return AppJobId.NON_BLOCKING_ONBOARDING;
            case 28:
                return AppJobId.DEFERRED_DEEPLINK_SUBMISSION;
            case 29:
                return AppJobId.INVITE_CODE_SILENT_REDEEM;
            case 30:
                return AppJobId.FETCH_PERMISSION_DEFAULTS;
            case 31:
                return AppJobId.PRELOADS_FPP_REPORT;
            case 32:
                return AppJobId.PRELOADS_TOS_ACCEPT;
            case 33:
                return AppJobId.PROCESS_TEXT_SETUP;
            case 34:
                return AppJobId.PUSH_TOKEN_REGISTRATION;
            case 35:
                return AppJobId.ALARM_REREGISTER;
            case 36:
                return AppJobId.REMINDER_REREGISTER;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return AppJobId.PRIMARY_SESSION_FETCH;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return AppJobId.SESSION_INIT;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return AppJobId.SHARE_RECIPIENTS_PREFETCH;
            case 40:
                return AppJobId.BACKGROUND_REFRESH_USER_DATA;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return AppJobId.FETCH_USER_DATA;
            case 42:
                return AppJobId.VIDEO_STACK_PREWARM;
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return AppJobId.FETCH_VMS;
            case 44:
                return AppJobId.SURVEY_CHECK;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return WatchConnectedLoggingStartupJob.INSTANCE.getJobId();
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return AppJobId.WATCH_SESSION_SYNC;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                return AppJobId.HOME_SCREEN_WIDGETS_SETUP;
            default:
                throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
        }
    }

    public static ProcessScope A0C(int i) {
        switch (i) {
            case 0:
                return LocalBrowserEngineDownloadJob.INSTANCE.getProcessScope();
            case 1:
                return RunInBackgroundStartupJob.INSTANCE.getProcessScope();
            case 2:
                return HatchConversationPrefetchStartupJob.INSTANCE.getProcessScope();
            case 3:
                return AppUpdateStartupJob.INSTANCE.getProcessScope();
            case 4:
                return HealthSyncStartupJob.INSTANCE.getProcessScope();
            case 5:
                return DeviceRepairCheckJob.INSTANCE.getProcessScope();
            case 6:
                return LinkDeviceKeyRevocationJob.INSTANCE.getProcessScope();
            case 7:
                return EmailAvailabilityStartupJob.INSTANCE.getProcessScope();
            case 8:
                return HatchTrafficNetworkTelemetryServicesStartupJob.INSTANCE.getProcessScope();
            case 9:
                return ConnectionsTabStartupJob.INSTANCE.getProcessScope();
            case 10:
                return HatchEmbodimentPrewarmStartupJob.INSTANCE.getProcessScope();
            case 11:
                return HatchEmbodimentReadinessSeedStartupJob.INSTANCE.getProcessScope();
            case 12:
                return AnalyticsIdentityStartupJob.INSTANCE.getProcessScope();
            case 13:
                return AnalyticsModeStateStartupJob.INSTANCE.getProcessScope();
            case 14:
                return HatchInAppReviewDayCountStartupJob.INSTANCE.getProcessScope();
            case 15:
                return HatchAttributionStartupJob.INSTANCE.getProcessScope();
            case 16:
                return HatchChatThemesStartupJob.INSTANCE.getProcessScope();
            case 17:
                return HatchCheckpointProbeStartupJob.INSTANCE.getProcessScope();
            case 18:
                return HatchTabPrefetchCoordinatorStartupJob.INSTANCE.getProcessScope();
            case 19:
                return HatchGatewayConnectStartupJob.INSTANCE.getProcessScope();
            case 20:
                return HatchProactiveSyncCatchUpJob.INSTANCE.getProcessScope();
            case 21:
                return HatchVmWakeStartupJob.INSTANCE.getProcessScope();
            case 22:
                return GeofenceReregisterStartupJob.INSTANCE.getProcessScope();
            case 23:
                return HatchGraduationStartupJob.INSTANCE.getProcessScope();
            case 24:
                return HatchInviteBadgeStartupJob.INSTANCE.getProcessScope();
            case 25:
                return RefreshTokenMigrationStartupJob.INSTANCE.getProcessScope();
            case 26:
                return AuraMobileConfigsFetchStartupJob.INSTANCE.getProcessScope();
            case 27:
                return AuraNonBlockingOnboardingJob.INSTANCE.getProcessScope();
            case 28:
                return HatchDeferredDeeplinkStartupJob.INSTANCE.getProcessScope();
            case 29:
                return HatchInviteCodeRedeemStartupJob.INSTANCE.getProcessScope();
            case 30:
                return HatchPermissionDefaultsPrefetchJob.INSTANCE.getProcessScope();
            case 31:
                return HatchPreloadsFppStartupJob.INSTANCE.getProcessScope();
            case 32:
                return HatchPreloadsTosAcceptStartupJob.INSTANCE.getProcessScope();
            case 33:
                return AuraProcessTextStartupJob.INSTANCE.getProcessScope();
            case 34:
                return AuraPushTokenStartupJob.INSTANCE.getProcessScope();
            case 35:
                return AlarmReregisterStartupJob.INSTANCE.getProcessScope();
            case 36:
                return ReminderReregisterStartupJob.INSTANCE.getProcessScope();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return HatchPrimarySessionStartupJob.INSTANCE.getProcessScope();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return HatchSessionInitStartupJob.INSTANCE.getProcessScope();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return HatchShareRecipientsPrefetchStartupJob.INSTANCE.getProcessScope();
            case 40:
                return AuraUserDataBackgroundRefreshJob.INSTANCE.getProcessScope();
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return AuraUserDataStartupJob.INSTANCE.getProcessScope();
            case 42:
                return HatchVideoStackPrewarmStartupJob.INSTANCE.getProcessScope();
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return FetchVmsStartupJob.INSTANCE.getProcessScope();
            case 44:
                return HatchSurveyStartupJob.INSTANCE.getProcessScope();
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return WatchConnectedLoggingStartupJob.INSTANCE.getProcessScope();
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return WatchSessionVmSwitchNotifier.INSTANCE.getProcessScope();
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                return WidgetsStartupJob.INSTANCE.getProcessScope();
            default:
                throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
        }
    }

    public static ProcessScope A0D(int i) {
        switch (i) {
            case 0:
                return AuraCrashManagerLateStartupJob.INSTANCE.getProcessScope();
            case 1:
                return HatchUploadsCacheCleanupJob.INSTANCE.getProcessScope();
            case 2:
                return AuraBatteryStartupJob.INSTANCE.getProcessScope();
            case 3:
                return AuraFamilyDeviceIdStartupJob.INSTANCE.getProcessScope();
            case 4:
                return HatchFirstRunStateStartupJob.INSTANCE.getProcessScope();
            case 5:
                return AuraFrescoStartupJob.INSTANCE.getProcessScope();
            case 6:
                return NativeLoginPrefetchStartupJob.INSTANCE.getProcessScope();
            case 7:
                return AuraSessionlessMobileConfigsFetchStartupJob.INSTANCE.getProcessScope();
            case 8:
                return AuraNetworkMonitorStartupJob.INSTANCE.getProcessScope();
            case 9:
                return OnboardingAssetsStartupJob.INSTANCE.getProcessScope();
            case 10:
                return AuraQplStartupCompleteJob.INSTANCE.getProcessScope();
            default:
                throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
        }
    }

    public static ResumePolicy A0E(int i) {
        switch (i) {
            case 0:
                return LocalBrowserEngineDownloadJob.INSTANCE.getResumePolicy();
            case 1:
                return RunInBackgroundStartupJob.INSTANCE.getResumePolicy();
            case 2:
                return HatchConversationPrefetchStartupJob.INSTANCE.getResumePolicy();
            case 3:
                return AppUpdateStartupJob.INSTANCE.getResumePolicy();
            case 4:
                return HealthSyncStartupJob.INSTANCE.getResumePolicy();
            case 5:
                return DeviceRepairCheckJob.INSTANCE.getResumePolicy();
            case 6:
                return LinkDeviceKeyRevocationJob.INSTANCE.getResumePolicy();
            case 7:
                return EmailAvailabilityStartupJob.INSTANCE.getResumePolicy();
            case 8:
                return HatchTrafficNetworkTelemetryServicesStartupJob.INSTANCE.getResumePolicy();
            case 9:
                return ConnectionsTabStartupJob.INSTANCE.getResumePolicy();
            case 10:
                return HatchEmbodimentPrewarmStartupJob.INSTANCE.getResumePolicy();
            case 11:
                return HatchEmbodimentReadinessSeedStartupJob.INSTANCE.getResumePolicy();
            case 12:
                return AnalyticsIdentityStartupJob.INSTANCE.getResumePolicy();
            case 13:
                return AnalyticsModeStateStartupJob.INSTANCE.getResumePolicy();
            case 14:
                return HatchInAppReviewDayCountStartupJob.INSTANCE.getResumePolicy();
            case 15:
                return HatchAttributionStartupJob.INSTANCE.getResumePolicy();
            case 16:
                return HatchChatThemesStartupJob.INSTANCE.getResumePolicy();
            case 17:
                return HatchCheckpointProbeStartupJob.INSTANCE.getResumePolicy();
            case 18:
                return HatchTabPrefetchCoordinatorStartupJob.INSTANCE.getResumePolicy();
            case 19:
                return HatchGatewayConnectStartupJob.INSTANCE.getResumePolicy();
            case 20:
                return HatchProactiveSyncCatchUpJob.INSTANCE.getResumePolicy();
            case 21:
                return HatchVmWakeStartupJob.INSTANCE.getResumePolicy();
            case 22:
                return GeofenceReregisterStartupJob.INSTANCE.getResumePolicy();
            case 23:
                return HatchGraduationStartupJob.INSTANCE.getResumePolicy();
            case 24:
                return HatchInviteBadgeStartupJob.INSTANCE.getResumePolicy();
            case 25:
                return RefreshTokenMigrationStartupJob.INSTANCE.getResumePolicy();
            case 26:
                return AuraMobileConfigsFetchStartupJob.INSTANCE.getResumePolicy();
            case 27:
                return AuraNonBlockingOnboardingJob.INSTANCE.getResumePolicy();
            case 28:
                return HatchDeferredDeeplinkStartupJob.INSTANCE.getResumePolicy();
            case 29:
                return HatchInviteCodeRedeemStartupJob.INSTANCE.getResumePolicy();
            case 30:
                return HatchPermissionDefaultsPrefetchJob.INSTANCE.getResumePolicy();
            case 31:
                return HatchPreloadsFppStartupJob.INSTANCE.getResumePolicy();
            case 32:
                return HatchPreloadsTosAcceptStartupJob.INSTANCE.getResumePolicy();
            case 33:
                return AuraProcessTextStartupJob.INSTANCE.getResumePolicy();
            case 34:
                return AuraPushTokenStartupJob.INSTANCE.getResumePolicy();
            case 35:
                return AlarmReregisterStartupJob.INSTANCE.getResumePolicy();
            case 36:
                return ReminderReregisterStartupJob.INSTANCE.getResumePolicy();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return HatchPrimarySessionStartupJob.INSTANCE.getResumePolicy();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return HatchSessionInitStartupJob.INSTANCE.getResumePolicy();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return HatchShareRecipientsPrefetchStartupJob.INSTANCE.getResumePolicy();
            case 40:
                return AuraUserDataBackgroundRefreshJob.INSTANCE.getResumePolicy();
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return AuraUserDataStartupJob.INSTANCE.getResumePolicy();
            case 42:
                return HatchVideoStackPrewarmStartupJob.INSTANCE.getResumePolicy();
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return FetchVmsStartupJob.INSTANCE.getResumePolicy();
            case 44:
                return HatchSurveyStartupJob.INSTANCE.getResumePolicy();
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return WatchConnectedLoggingStartupJob.INSTANCE.getResumePolicy();
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return WatchSessionVmSwitchNotifier.INSTANCE.getResumePolicy();
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                return WidgetsStartupJob.INSTANCE.getResumePolicy();
            default:
                throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
        }
    }

    public static ResumePolicy A0F(int i) {
        switch (i) {
            case 0:
                return AuraCrashManagerLateStartupJob.INSTANCE.getResumePolicy();
            case 1:
                return HatchUploadsCacheCleanupJob.INSTANCE.getResumePolicy();
            case 2:
                return AuraBatteryStartupJob.INSTANCE.getResumePolicy();
            case 3:
                return AuraFamilyDeviceIdStartupJob.INSTANCE.getResumePolicy();
            case 4:
                return HatchFirstRunStateStartupJob.INSTANCE.getResumePolicy();
            case 5:
                return AuraFrescoStartupJob.INSTANCE.getResumePolicy();
            case 6:
                return NativeLoginPrefetchStartupJob.INSTANCE.getResumePolicy();
            case 7:
                return AuraSessionlessMobileConfigsFetchStartupJob.INSTANCE.getResumePolicy();
            case 8:
                return AuraNetworkMonitorStartupJob.INSTANCE.getResumePolicy();
            case 9:
                return OnboardingAssetsStartupJob.INSTANCE.getResumePolicy();
            case 10:
                return AuraQplStartupCompleteJob.INSTANCE.getResumePolicy();
            default:
                throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
        }
    }

    public static SessionedStartupJob A0G(int i) {
        switch (i) {
            case 0:
                return LocalBrowserEngineDownloadJob.INSTANCE;
            case 1:
                return RunInBackgroundStartupJob.INSTANCE;
            case 2:
                return HatchConversationPrefetchStartupJob.INSTANCE;
            case 3:
                return AppUpdateStartupJob.INSTANCE;
            case 4:
                return HealthSyncStartupJob.INSTANCE;
            case 5:
                return DeviceRepairCheckJob.INSTANCE;
            case 6:
                return LinkDeviceKeyRevocationJob.INSTANCE;
            case 7:
                return EmailAvailabilityStartupJob.INSTANCE;
            case 8:
                return HatchTrafficNetworkTelemetryServicesStartupJob.INSTANCE;
            case 9:
                return ConnectionsTabStartupJob.INSTANCE;
            case 10:
                return HatchEmbodimentPrewarmStartupJob.INSTANCE;
            case 11:
                return HatchEmbodimentReadinessSeedStartupJob.INSTANCE;
            case 12:
                return AnalyticsIdentityStartupJob.INSTANCE;
            case 13:
                return AnalyticsModeStateStartupJob.INSTANCE;
            case 14:
                return HatchInAppReviewDayCountStartupJob.INSTANCE;
            case 15:
                return HatchAttributionStartupJob.INSTANCE;
            case 16:
                return HatchChatThemesStartupJob.INSTANCE;
            case 17:
                return HatchCheckpointProbeStartupJob.INSTANCE;
            case 18:
                return HatchTabPrefetchCoordinatorStartupJob.INSTANCE;
            case 19:
                return HatchGatewayConnectStartupJob.INSTANCE;
            case 20:
                return HatchProactiveSyncCatchUpJob.INSTANCE;
            case 21:
                return HatchVmWakeStartupJob.INSTANCE;
            case 22:
                return GeofenceReregisterStartupJob.INSTANCE;
            case 23:
                return HatchGraduationStartupJob.INSTANCE;
            case 24:
                return HatchInviteBadgeStartupJob.INSTANCE;
            case 25:
                return RefreshTokenMigrationStartupJob.INSTANCE;
            case 26:
                return AuraMobileConfigsFetchStartupJob.INSTANCE;
            case 27:
                return AuraNonBlockingOnboardingJob.INSTANCE;
            case 28:
                return HatchDeferredDeeplinkStartupJob.INSTANCE;
            case 29:
                return HatchInviteCodeRedeemStartupJob.INSTANCE;
            case 30:
                return HatchPermissionDefaultsPrefetchJob.INSTANCE;
            case 31:
                return HatchPreloadsFppStartupJob.INSTANCE;
            case 32:
                return HatchPreloadsTosAcceptStartupJob.INSTANCE;
            case 33:
                return AuraProcessTextStartupJob.INSTANCE;
            case 34:
                return AuraPushTokenStartupJob.INSTANCE;
            case 35:
                return AlarmReregisterStartupJob.INSTANCE;
            case 36:
                return ReminderReregisterStartupJob.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return HatchPrimarySessionStartupJob.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return HatchSessionInitStartupJob.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return HatchShareRecipientsPrefetchStartupJob.INSTANCE;
            case 40:
                return AuraUserDataBackgroundRefreshJob.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return AuraUserDataStartupJob.INSTANCE;
            case 42:
                return HatchVideoStackPrewarmStartupJob.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return FetchVmsStartupJob.INSTANCE;
            case 44:
                return HatchSurveyStartupJob.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return WatchConnectedLoggingStartupJob.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return WatchSessionVmSwitchNotifier.INSTANCE;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                return WidgetsStartupJob.INSTANCE;
            default:
                throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
        }
    }

    public static SessionlessStartupJob A0H(int i) {
        switch (i) {
            case 0:
                return AuraCrashManagerLateStartupJob.INSTANCE;
            case 1:
                return HatchUploadsCacheCleanupJob.INSTANCE;
            case 2:
                return AuraBatteryStartupJob.INSTANCE;
            case 3:
                return AuraFamilyDeviceIdStartupJob.INSTANCE;
            case 4:
                return HatchFirstRunStateStartupJob.INSTANCE;
            case 5:
                return AuraFrescoStartupJob.INSTANCE;
            case 6:
                return NativeLoginPrefetchStartupJob.INSTANCE;
            case 7:
                return AuraSessionlessMobileConfigsFetchStartupJob.INSTANCE;
            case 8:
                return AuraNetworkMonitorStartupJob.INSTANCE;
            case 9:
                return OnboardingAssetsStartupJob.INSTANCE;
            case 10:
                return AuraQplStartupCompleteJob.INSTANCE;
            default:
                throw AnonymousClass005.A0c(i);
        }
    }

    public static StartupPhase A0I(int i) {
        switch (i) {
            case 0:
                return LocalBrowserEngineDownloadJob.INSTANCE.getPhase();
            case 1:
                return RunInBackgroundStartupJob.INSTANCE.getPhase();
            case 2:
                return HatchConversationPrefetchStartupJob.INSTANCE.getPhase();
            case 3:
                return AppUpdateStartupJob.INSTANCE.getPhase();
            case 4:
                return HealthSyncStartupJob.INSTANCE.getPhase();
            case 5:
                return DeviceRepairCheckJob.INSTANCE.getPhase();
            case 6:
                return LinkDeviceKeyRevocationJob.INSTANCE.getPhase();
            case 7:
                return EmailAvailabilityStartupJob.INSTANCE.getPhase();
            case 8:
                return HatchTrafficNetworkTelemetryServicesStartupJob.INSTANCE.getPhase();
            case 9:
                return ConnectionsTabStartupJob.INSTANCE.getPhase();
            case 10:
                return HatchEmbodimentPrewarmStartupJob.INSTANCE.getPhase();
            case 11:
                return HatchEmbodimentReadinessSeedStartupJob.INSTANCE.getPhase();
            case 12:
                return AnalyticsIdentityStartupJob.INSTANCE.getPhase();
            case 13:
                return AnalyticsModeStateStartupJob.INSTANCE.getPhase();
            case 14:
                return HatchInAppReviewDayCountStartupJob.INSTANCE.getPhase();
            case 15:
                return HatchAttributionStartupJob.INSTANCE.getPhase();
            case 16:
                return HatchChatThemesStartupJob.INSTANCE.getPhase();
            case 17:
                return HatchCheckpointProbeStartupJob.INSTANCE.getPhase();
            case 18:
                return HatchTabPrefetchCoordinatorStartupJob.INSTANCE.getPhase();
            case 19:
                return HatchGatewayConnectStartupJob.INSTANCE.getPhase();
            case 20:
                return HatchProactiveSyncCatchUpJob.INSTANCE.getPhase();
            case 21:
                return HatchVmWakeStartupJob.INSTANCE.getPhase();
            case 22:
                return GeofenceReregisterStartupJob.INSTANCE.getPhase();
            case 23:
                return HatchGraduationStartupJob.INSTANCE.getPhase();
            case 24:
                return HatchInviteBadgeStartupJob.INSTANCE.getPhase();
            case 25:
                return RefreshTokenMigrationStartupJob.INSTANCE.getPhase();
            case 26:
                return AuraMobileConfigsFetchStartupJob.INSTANCE.getPhase();
            case 27:
                return AuraNonBlockingOnboardingJob.INSTANCE.getPhase();
            case 28:
                return HatchDeferredDeeplinkStartupJob.INSTANCE.getPhase();
            case 29:
                return HatchInviteCodeRedeemStartupJob.INSTANCE.getPhase();
            case 30:
                return HatchPermissionDefaultsPrefetchJob.INSTANCE.getPhase();
            case 31:
                return HatchPreloadsFppStartupJob.INSTANCE.getPhase();
            case 32:
                return HatchPreloadsTosAcceptStartupJob.INSTANCE.getPhase();
            case 33:
                return AuraProcessTextStartupJob.INSTANCE.getPhase();
            case 34:
                return AuraPushTokenStartupJob.INSTANCE.getPhase();
            case 35:
                return AlarmReregisterStartupJob.INSTANCE.getPhase();
            case 36:
                return ReminderReregisterStartupJob.INSTANCE.getPhase();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return HatchPrimarySessionStartupJob.INSTANCE.getPhase();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return HatchSessionInitStartupJob.INSTANCE.getPhase();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return HatchShareRecipientsPrefetchStartupJob.INSTANCE.getPhase();
            case 40:
                return AuraUserDataBackgroundRefreshJob.INSTANCE.getPhase();
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return AuraUserDataStartupJob.INSTANCE.getPhase();
            case 42:
                return HatchVideoStackPrewarmStartupJob.INSTANCE.getPhase();
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return FetchVmsStartupJob.INSTANCE.getPhase();
            case 44:
                return HatchSurveyStartupJob.INSTANCE.getPhase();
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return WatchConnectedLoggingStartupJob.INSTANCE.getPhase();
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return WatchSessionVmSwitchNotifier.INSTANCE.getPhase();
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                return WidgetsStartupJob.INSTANCE.getPhase();
            default:
                throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
        }
    }

    public static StartupPhase A0J(int i) {
        switch (i) {
            case 0:
                return AuraCrashManagerLateStartupJob.INSTANCE.getPhase();
            case 1:
                return HatchUploadsCacheCleanupJob.INSTANCE.getPhase();
            case 2:
                return AuraBatteryStartupJob.INSTANCE.getPhase();
            case 3:
                return AuraFamilyDeviceIdStartupJob.INSTANCE.getPhase();
            case 4:
                return HatchFirstRunStateStartupJob.INSTANCE.getPhase();
            case 5:
                return AuraFrescoStartupJob.INSTANCE.getPhase();
            case 6:
                return NativeLoginPrefetchStartupJob.INSTANCE.getPhase();
            case 7:
                return AuraSessionlessMobileConfigsFetchStartupJob.INSTANCE.getPhase();
            case 8:
                return AuraNetworkMonitorStartupJob.INSTANCE.getPhase();
            case 9:
                return OnboardingAssetsStartupJob.INSTANCE.getPhase();
            case 10:
                return AuraQplStartupCompleteJob.INSTANCE.getPhase();
            default:
                throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
        }
    }

    public static UiCommandContributor A0K(int i) {
        switch (i) {
            case 0:
                return BrowserTaskUiCommandProvider.INSTANCE.contributor();
            case 1:
                return AppAppearanceUiCommandProvider.INSTANCE.contributor();
            case 2:
                return IdeaUiCommandProvider.INSTANCE.contributor();
            case 3:
                return GoalUiCommandProvider.INSTANCE.contributor();
            case 4:
                return CallVolumeUiCommandProvider.INSTANCE.contributor();
            case 5:
                return VoiceUiCommandProvider.INSTANCE.contributor();
            case 6:
                return SpaceShareUiCommandProvider.INSTANCE.contributor();
            default:
                throw AnonymousClass005.A0c(i);
        }
    }

    public static List<AuraDeeplinkRouteSpec> A0O(int i) {
        switch (i) {
            case 0:
                return ExploreDeeplinkRouteProvider.INSTANCE.routeSpecs();
            case 1:
                return SubscriptionDeeplinkRouteProvider.INSTANCE.routeSpecs();
            case 2:
                return BrowserTaskDeeplinkRouteProvider.INSTANCE.routeSpecs();
            case 3:
                return HatchFOAAccountLinkDeeplinkRouteProvider.INSTANCE.routeSpecs();
            case 4:
                return ChannelConnectDeeplinkRouteProvider.INSTANCE.routeSpecs();
            case 5:
                return ConfidentialVmDeeplinkRouteProvider.INSTANCE.routeSpecs();
            case 6:
                return DevicesDeeplinkRouteProvider.INSTANCE.routeSpecs();
            case 7:
                return EmailDeeplinkRouteProvider.INSTANCE.routeSpecs();
            case 8:
                return FeedDeeplinkRouteProvider.INSTANCE.routeSpecs();
            case 9:
                return HandoffDeeplinkRoutes.INSTANCE.routeSpecs();
            case 10:
                return PairsDeeplinkRoutes.INSTANCE.routeSpecs();
            case 11:
                return VoiceDeeplinkRouteProvider.INSTANCE.routeSpecs();
            case 12:
                return WearablesDeeplinkRouteProvider.INSTANCE.routeSpecs();
            case 13:
                return SpacesDeeplinkRouteProvider.INSTANCE.routeSpecs();
            default:
                throw AnonymousClass005.A0c(i);
        }
    }

    public static List<AppJobId> A0Q(int i) {
        switch (i) {
            case 0:
                return LocalBrowserEngineDownloadJob.INSTANCE.getDependsOn();
            case 1:
                return RunInBackgroundStartupJob.INSTANCE.getDependsOn();
            case 2:
                return HatchConversationPrefetchStartupJob.INSTANCE.getDependsOn();
            case 3:
                return AppUpdateStartupJob.INSTANCE.getDependsOn();
            case 4:
                return HealthSyncStartupJob.INSTANCE.getDependsOn();
            case 5:
                return DeviceRepairCheckJob.INSTANCE.getDependsOn();
            case 6:
                return LinkDeviceKeyRevocationJob.INSTANCE.getDependsOn();
            case 7:
                return EmailAvailabilityStartupJob.INSTANCE.getDependsOn();
            case 8:
                return HatchTrafficNetworkTelemetryServicesStartupJob.INSTANCE.getDependsOn();
            case 9:
                return ConnectionsTabStartupJob.INSTANCE.getDependsOn();
            case 10:
                return HatchEmbodimentPrewarmStartupJob.INSTANCE.getDependsOn();
            case 11:
                return HatchEmbodimentReadinessSeedStartupJob.INSTANCE.getDependsOn();
            case 12:
                return AnalyticsIdentityStartupJob.INSTANCE.getDependsOn();
            case 13:
                return AnalyticsModeStateStartupJob.INSTANCE.getDependsOn();
            case 14:
                return HatchInAppReviewDayCountStartupJob.INSTANCE.getDependsOn();
            case 15:
                return HatchAttributionStartupJob.INSTANCE.getDependsOn();
            case 16:
                return HatchChatThemesStartupJob.INSTANCE.getDependsOn();
            case 17:
                return HatchCheckpointProbeStartupJob.INSTANCE.getDependsOn();
            case 18:
                return HatchTabPrefetchCoordinatorStartupJob.INSTANCE.getDependsOn();
            case 19:
                return HatchGatewayConnectStartupJob.INSTANCE.getDependsOn();
            case 20:
                return HatchProactiveSyncCatchUpJob.INSTANCE.getDependsOn();
            case 21:
                return HatchVmWakeStartupJob.INSTANCE.getDependsOn();
            case 22:
                return GeofenceReregisterStartupJob.INSTANCE.getDependsOn();
            case 23:
                return HatchGraduationStartupJob.INSTANCE.getDependsOn();
            case 24:
                return HatchInviteBadgeStartupJob.INSTANCE.getDependsOn();
            case 25:
                return RefreshTokenMigrationStartupJob.INSTANCE.getDependsOn();
            case 26:
                return AuraMobileConfigsFetchStartupJob.INSTANCE.getDependsOn();
            case 27:
                return AuraNonBlockingOnboardingJob.INSTANCE.getDependsOn();
            case 28:
                return HatchDeferredDeeplinkStartupJob.INSTANCE.getDependsOn();
            case 29:
                return HatchInviteCodeRedeemStartupJob.INSTANCE.getDependsOn();
            case 30:
                return HatchPermissionDefaultsPrefetchJob.INSTANCE.getDependsOn();
            case 31:
                return HatchPreloadsFppStartupJob.INSTANCE.getDependsOn();
            case 32:
                return HatchPreloadsTosAcceptStartupJob.INSTANCE.getDependsOn();
            case 33:
                return AuraProcessTextStartupJob.INSTANCE.getDependsOn();
            case 34:
                return AuraPushTokenStartupJob.INSTANCE.getDependsOn();
            case 35:
                return AlarmReregisterStartupJob.INSTANCE.getDependsOn();
            case 36:
                return ReminderReregisterStartupJob.INSTANCE.getDependsOn();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return HatchPrimarySessionStartupJob.INSTANCE.getDependsOn();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return HatchSessionInitStartupJob.INSTANCE.getDependsOn();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return HatchShareRecipientsPrefetchStartupJob.INSTANCE.getDependsOn();
            case 40:
                return AuraUserDataBackgroundRefreshJob.INSTANCE.getDependsOn();
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return AuraUserDataStartupJob.INSTANCE.getDependsOn();
            case 42:
                return HatchVideoStackPrewarmStartupJob.INSTANCE.getDependsOn();
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return FetchVmsStartupJob.INSTANCE.getDependsOn();
            case 44:
                return HatchSurveyStartupJob.INSTANCE.getDependsOn();
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return WatchConnectedLoggingStartupJob.INSTANCE.getDependsOn();
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return WatchSessionVmSwitchNotifier.INSTANCE.getDependsOn();
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                return WidgetsStartupJob.INSTANCE.getDependsOn();
            default:
                throw AnonymousClass005.A0c(i);
        }
    }

    public static List<AppJobId> A0R(int i) {
        switch (i) {
            case 0:
                return AuraCrashManagerLateStartupJob.INSTANCE.getDependsOn();
            case 1:
                return HatchUploadsCacheCleanupJob.INSTANCE.getDependsOn();
            case 2:
                return AuraBatteryStartupJob.INSTANCE.getDependsOn();
            case 3:
                return AuraFamilyDeviceIdStartupJob.INSTANCE.getDependsOn();
            case 4:
                return HatchFirstRunStateStartupJob.INSTANCE.getDependsOn();
            case 5:
                return AuraFrescoStartupJob.INSTANCE.getDependsOn();
            case 6:
                return NativeLoginPrefetchStartupJob.INSTANCE.getDependsOn();
            case 7:
                return AuraSessionlessMobileConfigsFetchStartupJob.INSTANCE.getDependsOn();
            case 8:
                return AuraNetworkMonitorStartupJob.INSTANCE.getDependsOn();
            case 9:
                return OnboardingAssetsStartupJob.INSTANCE.getDependsOn();
            case 10:
                return AuraQplStartupCompleteJob.INSTANCE.getDependsOn();
            default:
                throw AnonymousClass005.A0c(i);
        }
    }

    public static void A0U(int i) {
        switch (i) {
            case 0:
                AuraAccessLibraryPublisher.INSTANCE.cleanup();
                return;
            case 1:
                ActivationStepLogging.INSTANCE.cleanup();
                return;
            case 2:
                AgeVerificationSignOutCleanup.INSTANCE.cleanup();
                return;
            case 3:
                AgeCheckFunnelLogging.INSTANCE.cleanup();
                return;
            case 4:
                HatchAudioCacheSignOutCleanup.INSTANCE.cleanup();
                return;
            case 5:
                AuraPrefsSignOutCleanupHandler.INSTANCE.cleanup();
                return;
            case 6:
                HatchCameraSignOutCleanup.INSTANCE.cleanup();
                return;
            case 7:
                HatchPendingMessage.INSTANCE.cleanup();
                return;
            case 8:
                HatchComposerDraftKeysSignOutCleanup.INSTANCE.cleanup();
                return;
            case 9:
                HatchPendingDiscussionItem.INSTANCE.cleanup();
                return;
            case 10:
                HatchSharedCacheSignOutCleanup.INSTANCE.cleanup();
                return;
            case 11:
                NodeSyncBaselineSignOutCleanup.INSTANCE.cleanup();
                return;
            case 12:
                AuraCacheSignOutCleanup.INSTANCE.cleanup();
                return;
            case 13:
                HatchVmInboundTrafficSignOutCleanup.INSTANCE.cleanup();
                return;
            case 14:
                ContentViewerDataHolderCleanupHandler.INSTANCE.cleanup();
                return;
            case 15:
                NodeCommandSignOutCleanup.INSTANCE.cleanup();
                return;
            case 16:
                ModelLockAppealFileCleanup.INSTANCE.cleanup();
                return;
            case 17:
                AuraFcmTokenSignOutCleanup.INSTANCE.cleanup();
                return;
            case 18:
                HatchDataExportStatus.INSTANCE.cleanup();
                return;
            case 19:
                HomeScreenShortcutPersonalizationCleanup.INSTANCE.cleanup();
                return;
            case 20:
                FlightOfferBookingRequestCleanupHandler.INSTANCE.cleanup();
                return;
            case 21:
                FlightOfferDetailHolderCleanupHandler.INSTANCE.cleanup();
                return;
            case 22:
                ConfidentialVmSignOutCleanupHandler.INSTANCE.cleanup();
                return;
            case 23:
                AuraGraphQLSignOutCleanupHandler.INSTANCE.cleanup();
                return;
            case 24:
                HatchTempTokenProvider.INSTANCE.cleanup();
                return;
            case 25:
                NativeLoginPrefetch.INSTANCE.cleanup();
                return;
            case 26:
                VoiceCatalogSignOutCleanup.INSTANCE.cleanup();
                return;
            case 27:
                HatchCallIdleVideoSignOutCleanup.INSTANCE.cleanup();
                return;
            case 28:
                VoiceCallShortcut.INSTANCE.cleanup();
                return;
            case 29:
                AnalyticsModeStateSignOutCleanupHandler.INSTANCE.cleanup();
                return;
            case 30:
                HatchSurveyController.INSTANCE.cleanup();
                return;
            case 31:
                WatchSessionHandoffLink.INSTANCE.cleanup();
                return;
            case 32:
                WidgetSignOutCleanup.INSTANCE.cleanup();
                return;
            default:
                throw AnonymousClass005.A0c(i);
        }
    }

    public static void A0Z(int i, C5rn<AuraNavKey> c5rn) {
        switch (i) {
            case 0:
                AgeStepInfoSheetEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 1:
                HatchFOAAccountLinkEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 2:
                ChannelConnectEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 3:
                HatchLinkOrderEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 4:
                HatchLinkPairingSheetEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 5:
                EmailEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 6:
                FlightResultsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 7:
                HotelBrowseEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 8:
                LocalBrowserEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 9:
                HatchFullscreenMapEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 10:
                HatchPlaceDetailsSheetEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 11:
                MarketplaceMapFullscreenEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 12:
                ActivationEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 13:
                ActivationSettingsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 14:
                ActivePermissionsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 15:
                AgentComputerScreenEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 16:
                AgentPermissionEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 17:
                ApiKeyAuthEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 18:
                AppAppearanceSettingsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 19:
                AppInfoEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 20:
                AppLockOverlayEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 21:
                AppUpdateHardBlockEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 22:
                ArchivedSideChatsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 23:
                ArtifactsDetailEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 24:
                AuraInternalStatusSettingsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 25:
                AuraSubscriptionSheetEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 26:
                BiometricsSettingsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 27:
                BugReportEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 28:
                CancelEncryptionEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 29:
                ChannelsSettingsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 30:
                ConfidentialVmRegisterPinEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 31:
                ConfidentialVmSwitchEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 32:
                ConnectedDevicesEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 33:
                ConnectorCatalogEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 34:
                ConnectorPermissionsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 35:
                ConnectorPermissionsListEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 36:
                ContactSupportEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                ContentViewerEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                ConversationEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                ConversationSearchScreenEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 40:
                CustomConnectorAuthEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                DataPrivacySettingsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 42:
                DefaultAssistantSettingsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                DeviceDetailsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 44:
                DevicePermissionsSettingsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                DisconnectConfirmationEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                EncryptionEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                ExploreEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 48:
                ExploreIdeaCardDetailEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                FeedEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 50:
                FeedStatusSheetEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case R.styleable.maplibre_MapView_maplibre_uiTiltGestures /* 51 */:
                FeedbackWriteEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 52:
                FlightOfferDetailsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 53:
                FolderViewerEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 54:
                GoalCreationBottomSheetEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 55:
                GoalDetailEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 56:
                GoalsCompletedEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 57:
                GoalsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 58:
                GraduationEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 59:
                HatchCheckpointOverlayEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 60:
                HatchFeedbackSheetEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 61:
                HatchPausedOverlayEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX /* 62 */:
                HatchShareSheetEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 63:
                HatchSkillDetailEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 64:
                HatchStatusEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE /* 65 */:
                HatchSurveySheetEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 66:
                HelpSupportSettingsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case MessageDraftSenderKt.UNICODE_MULTIPART_CHARS /* 67 */:
                IdeaWidgetDetailEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 68:
                ImportMemoryToHatchEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 69:
                InternalSettingsAuxEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS /* 70 */:
                InternalSettingsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 71:
                InviteFriendEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 72:
                LegalSafetySettingsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 73:
                LegalWebPageEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 74:
                LibraryEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 75:
                LocalConnectorConsentEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case HatchIdeaShareImageRenderer.TEXT_LEFT /* 76 */:
                MCDebugEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX /* 77 */:
                ManageAccountSettingsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 78:
                MediaGalleryEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 79:
                MessengerPinEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 80:
                MessengerResetPinEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 81:
                MessengerSettingsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 82:
                MicPermissionDeniedOverlayEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 83:
                ModelLockSupportSheetEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 84:
                NodeDebugEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case ImageCompressor.IMAGE_COMPRESSION_QUALITY /* 85 */:
                NotificationsSettingsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 86:
                OnboardingGateEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 87:
                OnboardingUiFlowEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 88:
                OnboardingVariantSheetEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 89:
                PasswordAuthEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 90:
                PermissionDetailEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 91:
                PermissionsSettingsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case AuraWaitlistConfettiKt.StandardParticleCount /* 92 */:
                PublishArtifactSheetEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 93:
                PublishSpaceSheetEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 94:
                RecipientPermissionsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case SelfieSnapshotKt.SELFIE_JPEG_QUALITY /* 95 */:
                RedeemComplimentarySubscriptionEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 96:
                RedeemInviteCodeEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 97:
                RichFormatEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 98:
                SecureStorageEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 99:
                SettingsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 100:
                SharedContentEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE /* 101 */:
                SkillConnectEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 102:
                SpaceInviteEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 103:
                SpaceMenuSheetEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 104:
                SpacesModalEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 105:
                StorageRecoveryEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 106:
                TaskPermissionsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 107:
                TelegramSettingsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case MinidumpReader.MODULE_FULL_SIZE /* 108 */:
                VmDisabledEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 109:
                VmUnavailableOverlayEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 110:
                WalletSettingsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 111:
                WalletSetupSheetEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX /* 112 */:
                WhatsAppCompanionEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 113:
                WhatsAppSettingsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 114:
                PairsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 115:
                HatchVoiceAnnouncementSheetEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 116:
                HatchVoiceNuxSheetEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 117:
                VoiceControlsSettingsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 118:
                VoiceInternalSettingsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 119:
                VoiceSelectionListEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 120:
                VoiceSelectionListSheetEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 121:
                WearablesLinkingEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 122:
                ItchEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 123:
                RentalCarEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 124:
                ProductDetailsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 125:
                ProductItemsEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            case 126:
                ShoppingCartEntryProvider.INSTANCE.provideEntry(c5rn);
                return;
            default:
                throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
        }
    }

    public static boolean A0f(int i) {
        switch (i) {
            case 13317:
            case 13320:
            case 13323:
            case 13327:
            case 13329:
            case 13334:
            case 13335:
            case 13666:
            case 13708:
            case 13797:
            case 14093:
            case 15728:
            case 15778:
            case 16111:
            case 16160:
            case 16260:
            case 16444:
            case 16584:
            case 16675:
            case 17184:
            case 23990:
            case 24966:
            case 25261:
                return true;
            default:
                return false;
        }
    }

    public static boolean A0h(int i) {
        switch (i) {
            case 13313:
            case 13337:
            case 13538:
            case 13566:
            case 13615:
            case 13656:
            case 13688:
            case 13762:
            case 13768:
            case 13774:
            case 13914:
            case 13981:
            case 14001:
            case 15833:
            case 16310:
            case 16515:
            case 16529:
            case 16913:
            case 23426:
                return true;
            default:
                return false;
        }
    }
}
