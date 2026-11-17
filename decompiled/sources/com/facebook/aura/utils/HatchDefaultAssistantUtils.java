package com.facebook.aura.utils;

import X.BzK;
import X.C3cI;
import X.C7384Etj;
import android.app.role.RoleManager;
import android.content.Context;
import com.facebook.aura.common.prefs.HatchPrefsStore;

/* loaded from: classes2.dex */
public final class HatchDefaultAssistantUtils {
    public static final int $stable = 0;
    public static final String ELIGIBLE_KEY = "eligible_for_default_assistant";
    public static final String EXTRA_ASSIST_SIDE_CHAT_IS_NEW = "com.facebook.aura.extra.ASSIST_SIDE_CHAT_IS_NEW";
    public static final String EXTRA_ASSIST_SIDE_CHAT_SESSION_ID = "com.facebook.aura.extra.ASSIST_SIDE_CHAT_SESSION_ID";
    public static final HatchDefaultAssistantUtils INSTANCE = new HatchDefaultAssistantUtils();
    public static final String SIDE_CHAT_KEY = "default_assistant_conversations_in_side_chat";

    public final boolean shouldShowDefaultAssistantPrompt(Context context) {
        C7384Etj.A0Y(context, 0);
        return HatchPrefsStore.INSTANCE.internalPrefs().getBoolean(ELIGIBLE_KEY, false) && !isAlreadyDefaultAssistant(context);
    }

    private final boolean isAlreadyDefaultAssistant(Context context) {
        RoleManager roleManager = (RoleManager) context.getSystemService(RoleManager.class);
        if (roleManager != null) {
            return roleManager.isRoleHeld("android.app.role.ASSISTANT");
        }
        return false;
    }

    public final boolean isSideChatForDefaultAssistantEnabled() {
        return HatchPrefsStore.INSTANCE.internalPrefs().getBoolean(SIDE_CHAT_KEY, false);
    }

    public final void markEligibleForDefaultAssistantPrompt() {
        C3cI.A1H(HatchPrefsStore.INSTANCE.internalPrefs().A9q(), ELIGIBLE_KEY);
    }

    public final void recordDefaultAssistantPromptShown() {
        BzK bzKA9q = HatchPrefsStore.INSTANCE.internalPrefs().A9q();
        bzKA9q.A0A(ELIGIBLE_KEY, false);
        bzKA9q.apply();
    }

    public final void setSideChatForDefaultAssistantEnabled(boolean z) {
        BzK bzKA9q = HatchPrefsStore.INSTANCE.internalPrefs().A9q();
        bzKA9q.A0A(SIDE_CHAT_KEY, z);
        bzKA9q.apply();
    }
}
