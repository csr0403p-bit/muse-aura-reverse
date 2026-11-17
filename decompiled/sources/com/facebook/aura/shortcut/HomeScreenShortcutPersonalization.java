package com.facebook.aura.shortcut;

import X.C7384Etj;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.nudge.ConversationNudgeCoordinator;

/* loaded from: classes2.dex */
public final class HomeScreenShortcutPersonalization {
    public static final int $stable = 0;
    public static final HomeScreenShortcutPersonalization INSTANCE = new HomeScreenShortcutPersonalization();
    public static volatile boolean isPersonalizedInSession;

    public final void consumeRename() {
        isPersonalizedInSession = false;
    }

    public final boolean isPersonalized(String str) {
        C7384Etj.A0Y(str, 0);
        return str.length() > 0 && !str.equalsIgnoreCase(HatchAppName.value);
    }

    public final void onPersonalizedInSession() {
        isPersonalizedInSession = true;
        ConversationNudgeCoordinator.INSTANCE.requestEvaluation();
    }

    public final boolean isPersonalizedInSession() {
        return isPersonalizedInSession;
    }
}
