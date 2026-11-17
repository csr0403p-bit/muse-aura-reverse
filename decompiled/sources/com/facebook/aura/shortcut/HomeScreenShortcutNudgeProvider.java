package com.facebook.aura.shortcut;

import com.facebook.aura.nudge.ConversationNudge;
import com.facebook.aura.nudge.ConversationNudgeProvider;

/* loaded from: classes3.dex */
public final class HomeScreenShortcutNudgeProvider implements ConversationNudgeProvider {
    public static final int $stable = 0;
    public static final HomeScreenShortcutNudgeProvider INSTANCE = new HomeScreenShortcutNudgeProvider();

    @Override // com.facebook.aura.nudge.ConversationNudgeProvider
    public ConversationNudge nudge() {
        return HomeScreenShortcutNudge.INSTANCE;
    }
}
