package com.facebook.aura.conversation.viewmodel;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ConversationScreenKey;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;

/* loaded from: classes.dex */
public final class ConversationSourceChatReturnKt$returnToSourceChat$sourceExists$1 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
    public final /* synthetic */ String $sessionId;

    @Override // X.G0U
    public final Boolean invoke(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        return Boolean.valueOf(auraNavKey instanceof ConversationScreenKey ? C7384Etj.areEqual(((ConversationScreenKey) auraNavKey).sessionId, this.$sessionId) : auraNavKey.equals(ConversationTabScreenKey.INSTANCE) ? "primary_session_id".equals(this.$sessionId) : false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationSourceChatReturnKt$returnToSourceChat$sourceExists$1(String str) {
        super(1);
        this.$sessionId = str;
    }
}
