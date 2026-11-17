package com.facebook.aura.uicontrol;

import X.BLW;
import X.C7384Etj;
import com.facebook.aura.uicontrol.UiAction;
import com.facebook.aura.utils.HatchUtil;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class UiCommandRegistryKt {
    public static final boolean isGatedOff(UiAction uiAction) {
        String str;
        C7384Etj.A0Y(uiAction, 0);
        if (uiAction.equals(UiAction.NavigateInviteFriends.INSTANCE)) {
            str = UiCommandSpecsKt.UI_NAVIGATE_INVITE_FRIENDS;
        } else {
            if (!uiAction.equals(UiAction.NavigateHomeLinkOrder.INSTANCE)) {
                return false;
            }
            str = UiCommandSpecsKt.UI_NAVIGATE_HOME_LINK_ORDER;
        }
        return gatedOffUiCommandIds().contains(str);
    }

    public static final Set<String> gatedOffUiCommandIds() {
        HatchUtil hatchUtil = HatchUtil.INSTANCE;
        return BLW.A05(!hatchUtil.isInviteFriendsEnabled() ? UiCommandSpecsKt.UI_NAVIGATE_INVITE_FRIENDS : null, hatchUtil.isLinkDeviceOrderingEnabled() ? null : UiCommandSpecsKt.UI_NAVIGATE_HOME_LINK_ORDER);
    }
}
