package com.facebook.aura.appupdate;

import com.facebook.aura.nudge.ConversationNudge;
import com.facebook.aura.nudge.ConversationNudgeProvider;

/* loaded from: classes3.dex */
public final class AppUpdateNudgeProvider implements ConversationNudgeProvider {
    public static final int $stable = 0;
    public static final AppUpdateNudgeProvider INSTANCE = new AppUpdateNudgeProvider();

    @Override // com.facebook.aura.nudge.ConversationNudgeProvider
    public ConversationNudge nudge() {
        return AppUpdateNudge.INSTANCE;
    }
}
