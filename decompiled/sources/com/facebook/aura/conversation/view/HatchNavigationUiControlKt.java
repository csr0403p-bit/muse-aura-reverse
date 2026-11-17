package com.facebook.aura.conversation.view;

import X.AnonymousClass002;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.F0C;
import X.FGI;
import com.facebook.aura.R;
import com.facebook.aura.library.model.HatchPendingLibrarySegment;
import com.facebook.aura.library.model.LibrarySegment;
import com.facebook.aura.model.NavigationUiControl;
import com.facebook.aura.model.NavigationWidgetData;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationScreenKey;
import com.facebook.aura.navigation.key.ConversationSearchScreenKey;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.navigation.key.ExploreScreenKey;
import com.facebook.aura.navigation.key.FeedScreenKey;
import com.facebook.aura.navigation.key.HatchGoalsTabScreenKey;
import com.facebook.aura.navigation.key.HatchLinkOrderEntryPoint;
import com.facebook.aura.navigation.key.HatchLinkOrderSheetKey;
import com.facebook.aura.navigation.key.HatchSettingsPushScreenKey;
import com.facebook.aura.navigation.key.HatchStatusScreenKey;
import com.facebook.aura.navigation.key.HatchStatusTab;
import com.facebook.aura.navigation.key.InviteFriendScreenKey;
import com.facebook.aura.navigation.key.LibraryScreenKey;
import com.facebook.aura.nodes.HatchNodeClientKt;
import com.facebook.aura.status.viewmodel.HatchPendingScheduledTask;
import com.facebook.aura.uicontrol.UiAction;
import com.facebook.aura.uicontrol.UiActionKt;
import com.facebook.aura.uicontrol.UiActionParserKt;
import com.facebook.aura.uicontrol.UiCommandRegistryKt;

/* loaded from: classes6.dex */
public abstract class HatchNavigationUiControlKt {
    public static final boolean isHiddenOnThisClient(NavigationWidgetData navigationWidgetData) {
        C7384Etj.A0Y(navigationWidgetData, 0);
        NavigationUiControl navigationUiControl = navigationWidgetData.uiControl;
        UiAction uiAction = navigationUiControl != null ? toUiAction(navigationUiControl) : null;
        UiAction.NavigateHomeLinkOrder navigateHomeLinkOrder = UiAction.NavigateHomeLinkOrder.INSTANCE;
        return C7384Etj.areEqual(uiAction, navigateHomeLinkOrder) && UiCommandRegistryKt.isGatedOff(navigateHomeLinkOrder);
    }

    public static final int navigationLeadingIconRes(UiAction uiAction) {
        C7384Etj.A0Y(uiAction, 0);
        if (uiAction.equals(UiAction.NavigateThreadCreate.INSTANCE) || (uiAction instanceof UiAction.NavigateChatSession) || uiAction.equals(UiAction.NavigateChat.INSTANCE)) {
            return R.drawable.ai_speech_bubble_wght400_outline_24;
        }
        if (uiAction instanceof UiAction.NavigateThreadSearch) {
            return R.drawable.search_outline_24_wght600;
        }
        if (uiAction.equals(UiAction.NavigateLibrary.INSTANCE)) {
            return R.drawable.aura_files;
        }
        if (uiAction.equals(UiAction.NavigateArtifacts.INSTANCE)) {
            return R.drawable.four_squares_grid_wght400_outline_24;
        }
        if (uiAction.equals(UiAction.NavigateMedia.INSTANCE)) {
            return R.drawable.image_wght400_outline_24;
        }
        if (uiAction.equals(UiAction.NavigateExplore.INSTANCE)) {
            return R.drawable.aura_lightbulb_outline;
        }
        if (uiAction.equals(UiAction.NavigateFeed.INSTANCE) || (uiAction instanceof UiAction.NavigateFeedUnit)) {
            return R.drawable.compass_outline_24;
        }
        if (uiAction.equals(UiAction.NavigateGoals.INSTANCE)) {
            return R.drawable.ic_goal_document_outline_20;
        }
        if (uiAction.equals(UiAction.NavigateInviteFriends.INSTANCE)) {
            return R.drawable.meta_brand_design_system_icons_vector_two_people_outline_24;
        }
        if (uiAction.equals(UiAction.NavigateHomeLinkOrder.INSTANCE)) {
            return R.drawable.meta_icons_2_0_vector_housesignalfan_outline_24_wght400;
        }
        if (uiAction.equals(UiAction.NavigateSettings.INSTANCE)) {
            return R.drawable.aura_gear;
        }
        if (uiAction.equals(UiAction.NavigateProfile.INSTANCE)) {
            return R.drawable.robot_head_outline_32;
        }
        if (uiAction.equals(UiAction.NavigateActivityLog.INSTANCE)) {
            return R.drawable.aura_stats;
        }
        if (uiAction.equals(UiAction.NavigateScheduledTasks.INSTANCE)) {
            return R.drawable.hatch_file_types_calendar_40;
        }
        if (uiAction.equals(UiAction.NavigateSettingsIdentity.INSTANCE)) {
            return R.drawable.robot_head_outline_32;
        }
        if (uiAction instanceof UiAction.NavigateActivityItem) {
            return R.drawable.aura_stats;
        }
        if (uiAction instanceof UiAction.NavigateScheduledTask) {
            return R.drawable.hatch_file_types_calendar_40;
        }
        if ((uiAction instanceof UiAction.NavigateSpace) || (uiAction instanceof UiAction.NavigateSpaceTab)) {
            return R.drawable.four_squares_grid_wght400_outline_24;
        }
        if (uiAction.equals(UiAction.NavigateMemory.INSTANCE) || (uiAction instanceof UiAction.NavigateMemoryItem)) {
            return R.drawable.ic_goal_document_outline_20;
        }
        if (uiAction instanceof UiAction.NavigateLibraryItem) {
            return R.drawable.aura_files;
        }
        if (uiAction.equals(UiAction.NavigateBack.INSTANCE)) {
            throw C3cG.A0Q("Perform-only action has no navigation icon");
        }
        if (uiAction instanceof UiAction.SetChatTheme) {
            return R.drawable.palette;
        }
        if (!(uiAction instanceof UiAction.Contributed)) {
            throw C3cG.A0q();
        }
        Integer iconRes = ((UiAction.Contributed) uiAction).action.getIconRes();
        if (iconRes != null) {
            return iconRes.intValue();
        }
        throw C3cG.A0Q("Perform-only action has no navigation icon");
    }

    public static final boolean performUiActionNavigation(UiAction uiAction, AuraNavigator auraNavigator) {
        AuraNavKey hatchLinkOrderSheetKey;
        AuraNavKey hatchStatusScreenKey;
        HatchStatusTab hatchStatusTab;
        AuraNavKey auraNavKey;
        AuraNavKey auraNavKey2;
        LaunchFlag launchFlag;
        boolean zA1a = AnonymousClass002.A1a(uiAction, auraNavigator);
        if (!uiAction.equals(UiAction.NavigateThreadCreate.INSTANCE)) {
            if (uiAction.equals(UiAction.NavigateChat.INSTANCE)) {
                auraNavKey2 = ConversationTabScreenKey.INSTANCE;
                launchFlag = LaunchFlag.REPLACE_BACKSTACK;
            } else {
                if (uiAction instanceof UiAction.NavigateChatSession) {
                    auraNavigator.navigate(ConversationTabScreenKey.INSTANCE, LaunchFlag.REPLACE_BACKSTACK);
                    String str = ((UiAction.NavigateChatSession) uiAction).sessionId;
                    if (!"main".equals(str)) {
                        hatchLinkOrderSheetKey = new ConversationScreenKey(str, null, false, null, null, false);
                        auraNavigator.navigate(hatchLinkOrderSheetKey, false);
                        return zA1a;
                    }
                    return zA1a;
                }
                if (uiAction instanceof UiAction.NavigateThreadSearch) {
                    hatchStatusScreenKey = new ConversationSearchScreenKey(((UiAction.NavigateThreadSearch) uiAction).query);
                } else {
                    if (uiAction.equals(UiAction.NavigateExplore.INSTANCE)) {
                        auraNavKey = ExploreScreenKey.INSTANCE;
                    } else if (uiAction.equals(UiAction.NavigateFeed.INSTANCE)) {
                        auraNavKey = FeedScreenKey.INSTANCE;
                    } else if (uiAction.equals(UiAction.NavigateGoals.INSTANCE)) {
                        auraNavKey = HatchGoalsTabScreenKey.INSTANCE;
                    } else if (uiAction.equals(UiAction.NavigateLibrary.INSTANCE)) {
                        auraNavKey = LibraryScreenKey.INSTANCE;
                    } else if (uiAction.equals(UiAction.NavigateArtifacts.INSTANCE)) {
                        HatchPendingLibrarySegment.INSTANCE.request(LibrarySegment.ARTIFACTS);
                        auraNavKey = LibraryScreenKey.INSTANCE;
                    } else if (uiAction.equals(UiAction.NavigateMedia.INSTANCE)) {
                        HatchPendingLibrarySegment.INSTANCE.request(LibrarySegment.MEDIA);
                        auraNavKey = LibraryScreenKey.INSTANCE;
                    } else if (uiAction.equals(UiAction.NavigateSettings.INSTANCE)) {
                        hatchStatusScreenKey = new HatchSettingsPushScreenKey(null);
                    } else if (uiAction.equals(UiAction.NavigateProfile.INSTANCE)) {
                        hatchStatusScreenKey = new HatchStatusScreenKey(null, null, null, null);
                    } else {
                        if (uiAction.equals(UiAction.NavigateActivityLog.INSTANCE)) {
                            hatchStatusTab = HatchStatusTab.ACTIVITY;
                        } else if (uiAction.equals(UiAction.NavigateScheduledTasks.INSTANCE)) {
                            hatchStatusTab = HatchStatusTab.TASKS;
                        } else if (uiAction instanceof UiAction.NavigateScheduledTask) {
                            HatchPendingScheduledTask.INSTANCE.publish(((UiAction.NavigateScheduledTask) uiAction).taskId);
                            hatchStatusTab = HatchStatusTab.TASKS;
                        } else if (uiAction.equals(UiAction.NavigateSettingsIdentity.INSTANCE)) {
                            hatchStatusTab = HatchStatusTab.IDENTITY;
                        } else {
                            if (!uiAction.equals(UiAction.NavigateInviteFriends.INSTANCE)) {
                                if (uiAction.equals(UiAction.NavigateHomeLinkOrder.INSTANCE)) {
                                    boolean zIsGatedOff = UiCommandRegistryKt.isGatedOff(uiAction);
                                    zA1a = !zIsGatedOff;
                                    if (!zIsGatedOff) {
                                        F0C<C9hr<Object>>[] f0cArr = HatchLinkOrderSheetKey.$childSerializers;
                                        hatchLinkOrderSheetKey = new HatchLinkOrderSheetKey(HatchLinkOrderEntryPoint.AGENT);
                                        auraNavigator.navigate(hatchLinkOrderSheetKey, false);
                                        return zA1a;
                                    }
                                    return zA1a;
                                }
                                if ((uiAction instanceof UiAction.NavigateFeedUnit) || (uiAction instanceof UiAction.NavigateActivityItem) || (uiAction instanceof UiAction.NavigateSpace) || (uiAction instanceof UiAction.NavigateSpaceTab) || uiAction.equals(UiAction.NavigateMemory.INSTANCE) || (uiAction instanceof UiAction.NavigateMemoryItem) || (uiAction instanceof UiAction.NavigateLibraryItem) || uiAction.equals(UiAction.NavigateBack.INSTANCE) || (uiAction instanceof UiAction.SetChatTheme) || (uiAction instanceof UiAction.Contributed)) {
                                    return false;
                                }
                                throw C3cG.A0q();
                            }
                            hatchStatusScreenKey = InviteFriendScreenKey.INSTANCE;
                        }
                        hatchStatusScreenKey = new HatchStatusScreenKey(hatchStatusTab, null, null, null);
                    }
                    auraNavKey2 = auraNavKey;
                    launchFlag = LaunchFlag.BRING_TO_FRONT;
                }
            }
            auraNavigator.navigate(auraNavKey2, launchFlag);
            return zA1a;
        }
        auraNavigator.navigate(ConversationTabScreenKey.INSTANCE, LaunchFlag.REPLACE_BACKSTACK);
        hatchStatusScreenKey = new ConversationScreenKey(AnonymousClass002.A0k(), null, zA1a, null, null, false);
        auraNavigator.navigate(hatchStatusScreenKey, false);
        return zA1a;
    }

    public static final UiAction toUiAction(NavigationUiControl navigationUiControl) {
        UiAction uiActionUiActionForCommandId;
        C7384Etj.A0Y(navigationUiControl, 0);
        String string = navigationUiControl.params.toString();
        if (((!"chat".equals(navigationUiControl.target) || (uiActionUiActionForCommandId = UiActionParserKt.uiActionForCommandId(FGI.A0U(HatchNodeClientKt.UI_CONTROL_COMMAND_PREFIX, navigationUiControl.action, ".chat.session"), string)) == null) && (uiActionUiActionForCommandId = UiActionParserKt.uiActionForCommandId(FGI.A0d(HatchNodeClientKt.UI_CONTROL_COMMAND_PREFIX, navigationUiControl.action, ".", navigationUiControl.target), string)) == null) || !UiActionKt.isPerformOnly(uiActionUiActionForCommandId)) {
            return uiActionUiActionForCommandId;
        }
        return null;
    }
}
