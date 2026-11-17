package com.facebook.aura.conversation.viewmodel;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;

/* loaded from: classes.dex */
public abstract class ConversationSourceChatReturnKt {
    public static final boolean returnToSourceChat(AuraNavigator auraNavigator, AuraNavKey auraNavKey, String str, G0U<? super String, Boolean> g0u, G0U<? super AuraNavKey, Boolean> g0u2) {
        C7384Etj.A0Y(auraNavigator, 0);
        AnonymousClass005.A12(auraNavKey, g0u, g0u2, 1);
        if (C7384Etj.areEqual(auraNavigator.currentKey(true), auraNavKey)) {
            if (str == null) {
                str = "primary_session_id";
            }
            if (auraNavigator.isInBackStack(new ConversationSourceChatReturnKt$returnToSourceChat$sourceExists$1(str)) && AnonymousClass003.A1X(str, g0u)) {
                auraNavigator.back();
                auraNavigator.popAll(g0u2);
                return true;
            }
        }
        return false;
    }
}
