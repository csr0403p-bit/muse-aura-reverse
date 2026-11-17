package com.facebook.aura.conversation.view;

import X.AnonymousClass003;
import X.AnonymousClass006;
import com.facebook.aura.conversation.common.HatchPendingMessage;
import com.facebook.aura.navigation.AuraNavigator;

/* loaded from: classes.dex */
public abstract class HatchConversationComposerActionsKt {
    public static final void openMainChatComposer(String str, AuraNavigator auraNavigator) {
        AnonymousClass003.A0u(str, auraNavigator);
        HatchPendingMessage hatchPendingMessage = HatchPendingMessage.INSTANCE;
        hatchPendingMessage.setPendingComposerText(str, null);
        hatchPendingMessage.notifyMainChatAssistLaunch();
        AnonymousClass006.A1D(auraNavigator);
    }
}
