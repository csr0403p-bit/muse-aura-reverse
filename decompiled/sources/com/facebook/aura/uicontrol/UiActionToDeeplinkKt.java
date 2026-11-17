package com.facebook.aura.uicontrol;

import X.AnonymousClass001;
import X.C06827l3;
import X.C3cG;
import X.C60N;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.uicontrol.UiAction;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* loaded from: classes6.dex */
public abstract class UiActionToDeeplinkKt {
    public static final C06827l3 WORKSPACE_PATH_REGEX = C06827l3.A02(".*\\.[A-Za-z0-9]+$");

    public static final String libraryItemPathDeeplinkUri(String str) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0M("hatch://library/item?id=", URLEncoder.encode(str, HatchWebPageParserKt.UTF_8));
    }

    public static final boolean looksLikeWorkspacePath(String str) {
        C7384Etj.A0Y(str, 0);
        return C7BY.A0k(str, '/') || WORKSPACE_PATH_REGEX.A08(str);
    }

    public static final String toDeeplinkUriString(UiAction.Navigation navigation) throws UnsupportedEncodingException {
        String strEncode;
        String strA00;
        StringBuilder sbA0x;
        C7384Etj.A0Y(navigation, 0);
        if (navigation.equals(UiAction.NavigateThreadCreate.INSTANCE)) {
            return "hatch://thread/new";
        }
        if (navigation instanceof UiAction.NavigateChatSession) {
            strEncode = ((UiAction.NavigateChatSession) navigation).sessionId;
            strA00 = C60N.A00(23);
        } else {
            if (navigation.equals(UiAction.NavigateChat.INSTANCE)) {
                return "hatch://thread/main";
            }
            if (navigation instanceof UiAction.NavigateThreadSearch) {
                strEncode = URLEncoder.encode(((UiAction.NavigateThreadSearch) navigation).query, HatchWebPageParserKt.UTF_8);
                strA00 = "hatch://search?q=";
            } else {
                if (navigation.equals(UiAction.NavigateLibrary.INSTANCE)) {
                    return "hatch://library";
                }
                if (navigation.equals(UiAction.NavigateArtifacts.INSTANCE)) {
                    return "hatch://library?tab=artifacts";
                }
                if (navigation.equals(UiAction.NavigateMedia.INSTANCE)) {
                    return "hatch://library?tab=media";
                }
                if (navigation.equals(UiAction.NavigateExplore.INSTANCE)) {
                    return "hatch://explore";
                }
                if (navigation.equals(UiAction.NavigateFeed.INSTANCE)) {
                    return "hatch://feed";
                }
                if (navigation instanceof UiAction.NavigateFeedUnit) {
                    strEncode = URLEncoder.encode(((UiAction.NavigateFeedUnit) navigation).unitId, HatchWebPageParserKt.UTF_8);
                    strA00 = "hatch://feed?unit_id=";
                } else {
                    if (navigation.equals(UiAction.NavigateGoals.INSTANCE)) {
                        return "hatch://goals";
                    }
                    if (navigation.equals(UiAction.NavigateInviteFriends.INSTANCE)) {
                        return "hatch://invite_friends";
                    }
                    if (navigation.equals(UiAction.NavigateHomeLinkOrder.INSTANCE)) {
                        return "hatch://home_link_order?entry_point=agent";
                    }
                    if (navigation.equals(UiAction.NavigateSettings.INSTANCE)) {
                        return "hatch://settings";
                    }
                    if (navigation.equals(UiAction.NavigateProfile.INSTANCE)) {
                        return "hatch://status";
                    }
                    if (navigation.equals(UiAction.NavigateActivityLog.INSTANCE)) {
                        return "hatch://status?tab=activity";
                    }
                    if (navigation.equals(UiAction.NavigateScheduledTasks.INSTANCE)) {
                        return "hatch://status?tab=tasks";
                    }
                    if (navigation.equals(UiAction.NavigateSettingsIdentity.INSTANCE)) {
                        return "hatch://status?tab=identity";
                    }
                    if (navigation instanceof UiAction.NavigateActivityItem) {
                        strEncode = URLEncoder.encode(((UiAction.NavigateActivityItem) navigation).activityId, HatchWebPageParserKt.UTF_8);
                        strA00 = "hatch://activity/";
                    } else if (navigation instanceof UiAction.NavigateScheduledTask) {
                        strEncode = URLEncoder.encode(((UiAction.NavigateScheduledTask) navigation).taskId, HatchWebPageParserKt.UTF_8);
                        strA00 = "hatch://task/";
                    } else {
                        if (navigation instanceof UiAction.NavigateSpace) {
                            strEncode = URLEncoder.encode(((UiAction.NavigateSpace) navigation).spaceSlug, HatchWebPageParserKt.UTF_8);
                            sbA0x = C60O.A0x("hatch://space/");
                            return AnonymousClass001.A0v(strEncode, sbA0x);
                        }
                        if (navigation instanceof UiAction.NavigateSpaceTab) {
                            UiAction.NavigateSpaceTab navigateSpaceTab = (UiAction.NavigateSpaceTab) navigation;
                            return FGI.A0d("hatch://space/", URLEncoder.encode(navigateSpaceTab.spaceSlug, HatchWebPageParserKt.UTF_8), "?tab=", URLEncoder.encode(navigateSpaceTab.tabId, HatchWebPageParserKt.UTF_8));
                        }
                        if (navigation.equals(UiAction.NavigateMemory.INSTANCE)) {
                            return "hatch://memory";
                        }
                        if (!(navigation instanceof UiAction.NavigateMemoryItem)) {
                            throw C3cG.A0q();
                        }
                        strEncode = URLEncoder.encode(((UiAction.NavigateMemoryItem) navigation).path, HatchWebPageParserKt.UTF_8);
                        strA00 = "hatch://memory?path=";
                    }
                }
            }
        }
        sbA0x = C60O.A0x(strA00);
        return AnonymousClass001.A0v(strEncode, sbA0x);
    }
}
