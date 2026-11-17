package com.facebook.aura.spaces.menu;

import X.AnonymousClass003;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.spaces.menu.SpaceMenuLogOrigin;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class SpaceMenuAnalytics {
    public static final int $stable = 0;
    public static final String ARTIFACT_TYPE_SPACE = "space";
    public static final SpaceMenuAnalytics INSTANCE = new SpaceMenuAnalytics();
    public static final Map<String, String> LIBRARY_SPACE_METADATA = AnonymousClass006.A10(HatchMetadataKey.ARTIFACT_TYPE.getValue(), "space");

    private final void logLibraryRow(HatchComponent hatchComponent, boolean z) {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.LIBRARY;
        HatchScreen hatchScreen = HatchScreen.LIBRARY_HOME;
        Map<String, String> map = LIBRARY_SPACE_METADATA;
        if (z) {
            hatchInteractionLogger.logDismiss(hatchSurface, null, hatchScreen, hatchComponent, null, map);
        } else {
            hatchInteractionLogger.logClick(hatchSurface, null, hatchScreen, hatchComponent, null, map, null);
        }
    }

    public final void logChatCardClick(HatchScreen hatchScreen, HatchComponent hatchComponent, Map<String, String> map, String str) {
        AnonymousClass003.A0u(hatchScreen, hatchComponent);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.DOT_MENU, hatchScreen, hatchComponent, str, map, null);
    }

    public final void logDeleteCancel$fbandroid_express_aura_java_com_facebook_aura_spaces_menu_menu(SpaceMenuLogOrigin spaceMenuLogOrigin, boolean z) {
        C7384Etj.A0Y(spaceMenuLogOrigin, 0);
        logDialog(spaceMenuLogOrigin, spaceMenuLogOrigin instanceof SpaceMenuLogOrigin.SpacePage ? HatchComponent.CLOSE_BUTTON : HatchComponent.DELETE_CANCEL_BUTTON, z, true);
    }

    public final void logDeleteConfirm$fbandroid_express_aura_java_com_facebook_aura_spaces_menu_menu(SpaceMenuLogOrigin spaceMenuLogOrigin) {
        C7384Etj.A0Y(spaceMenuLogOrigin, 0);
        logDialog(spaceMenuLogOrigin, spaceMenuLogOrigin instanceof SpaceMenuLogOrigin.SpacePage ? HatchComponent.DELETE_BUTTON : HatchComponent.DELETE_CONFIRM_BUTTON, false, true);
    }

    public final void logMoveToSpacesCancel$fbandroid_express_aura_java_com_facebook_aura_spaces_menu_menu(SpaceMenuLogOrigin spaceMenuLogOrigin, boolean z) {
        C7384Etj.A0Y(spaceMenuLogOrigin, 0);
        logDialog(spaceMenuLogOrigin, HatchComponent.CANCEL_BUTTON, z, false);
    }

    public final void logMoveToSpacesConfirm$fbandroid_express_aura_java_com_facebook_aura_spaces_menu_menu(SpaceMenuLogOrigin spaceMenuLogOrigin) {
        C7384Etj.A0Y(spaceMenuLogOrigin, 0);
        logDialog(spaceMenuLogOrigin, HatchComponent.CONFIRM_BUTTON, false, false);
    }

    public final void logOptionClick$fbandroid_express_aura_java_com_facebook_aura_spaces_menu_menu(SpaceMenuLogOrigin spaceMenuLogOrigin, int i, boolean z) {
        HatchComponent hatchComponent;
        C7384Etj.A0Y(spaceMenuLogOrigin, 0);
        if (i == 0) {
            hatchComponent = HatchComponent.SHARE_BUTTON;
        } else if (i == 1) {
            hatchComponent = HatchComponent.ADD_SHORTCUT_BUTTON;
        } else if (i == 2) {
            hatchComponent = HatchComponent.DELETE_BUTTON;
        } else if (i == 3) {
            hatchComponent = z ? HatchComponent.UNPIN_BUTTON : HatchComponent.PIN_BUTTON;
        } else if (i == 4) {
            hatchComponent = HatchComponent.DOWNLOAD_BUTTON;
        } else if (i == 5) {
            hatchComponent = HatchComponent.CHANGE_ICON_BUTTON;
        } else if (i != 8) {
            return;
        } else {
            hatchComponent = HatchComponent.RENAME_BUTTON;
        }
        if (spaceMenuLogOrigin.equals(SpaceMenuLogOrigin.LibraryRow.INSTANCE)) {
            logLibraryRow(hatchComponent, false);
            return;
        }
        if (spaceMenuLogOrigin instanceof SpaceMenuLogOrigin.SpacePage) {
            logSpacePageClick(hatchComponent, ((SpaceMenuLogOrigin.SpacePage) spaceMenuLogOrigin).spaceId);
        } else {
            if (!(spaceMenuLogOrigin instanceof SpaceMenuLogOrigin.ChatCard)) {
                throw new NoWhenBranchMatchedException();
            }
            SpaceMenuLogOrigin.ChatCard chatCard = (SpaceMenuLogOrigin.ChatCard) spaceMenuLogOrigin;
            logChatCardClick(chatCard.screen, hatchComponent, spaceIdMetadata(chatCard.spaceId), null);
        }
    }

    public final void logRenameCancel$fbandroid_express_aura_java_com_facebook_aura_spaces_menu_menu(SpaceMenuLogOrigin spaceMenuLogOrigin, boolean z) {
        C7384Etj.A0Y(spaceMenuLogOrigin, 0);
        logDialog(spaceMenuLogOrigin, HatchComponent.RENAME_CANCEL_BUTTON, z, false);
    }

    public final void logRenameConfirm$fbandroid_express_aura_java_com_facebook_aura_spaces_menu_menu(SpaceMenuLogOrigin spaceMenuLogOrigin) {
        C7384Etj.A0Y(spaceMenuLogOrigin, 0);
        logDialog(spaceMenuLogOrigin, HatchComponent.RENAME_CONFIRM_BUTTON, false, false);
    }

    public final void logSpacePageClick(HatchComponent hatchComponent, String str) {
        AnonymousClass006.A0b(hatchComponent).logClick(HatchSurface.NAV_BAR, HatchSubsurface.TAB_SPACE, HatchScreen.NAV_BAR_EXPANDED, hatchComponent, null, spaceIdMetadata(str), null);
    }

    private final void logDialog(SpaceMenuLogOrigin spaceMenuLogOrigin, HatchComponent hatchComponent, boolean z, boolean z2) {
        if (C7384Etj.areEqual(spaceMenuLogOrigin, SpaceMenuLogOrigin.LibraryRow.INSTANCE)) {
            logLibraryRow(hatchComponent, z);
            return;
        }
        if (!(spaceMenuLogOrigin instanceof SpaceMenuLogOrigin.SpacePage)) {
            if (!(spaceMenuLogOrigin instanceof SpaceMenuLogOrigin.ChatCard)) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (z2) {
            logSpacesHomeAlert(hatchComponent, ((SpaceMenuLogOrigin.SpacePage) spaceMenuLogOrigin).spaceId, z);
        } else if (z) {
            HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.NAV_BAR, HatchSubsurface.TAB_SPACE, HatchScreen.NAV_BAR_EXPANDED, hatchComponent, null, spaceIdMetadata(((SpaceMenuLogOrigin.SpacePage) spaceMenuLogOrigin).spaceId));
        } else {
            logSpacePageClick(hatchComponent, ((SpaceMenuLogOrigin.SpacePage) spaceMenuLogOrigin).spaceId);
        }
    }

    private final Map<String, String> spaceIdMetadata(String str) {
        if (str != null) {
            return AnonymousClass007.A0c(HatchMetadataKey.SPACE_ID, str);
        }
        return null;
    }

    private final void logSpacesHomeAlert(HatchComponent hatchComponent, String str, boolean z) {
        Map<String, String> mapSpaceIdMetadata = spaceIdMetadata(str);
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.SPACES;
        HatchSubsurface hatchSubsurface = HatchSubsurface.SPACES_CAROUSEL;
        HatchScreen hatchScreen = HatchScreen.SPACES_HOME;
        if (z) {
            hatchInteractionLogger.logDismiss(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, mapSpaceIdMetadata);
        } else {
            hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, mapSpaceIdMetadata, null);
        }
    }
}
