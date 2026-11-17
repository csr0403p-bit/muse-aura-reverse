package com.facebook.aura.email;

import X.C7384Etj;
import com.facebook.aura.conversation.api.ConversationReplyTargetProvider;
import com.facebook.aura.email.model.EmailReplyTargetJsonKt;
import com.facebook.aura.model.ReplyAttribution;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class EmailReplyTargetProvider implements ConversationReplyTargetProvider {
    public static final int $stable = 0;
    public static final EmailReplyTargetProvider INSTANCE = new EmailReplyTargetProvider();

    @Override // com.facebook.aura.conversation.api.ConversationReplyTargetProvider
    public ReplyAttribution.Context parse(JsonObject jsonObject) {
        C7384Etj.A0Y(jsonObject, 0);
        return EmailReplyTargetJsonKt.parseEmailReplyTarget(jsonObject);
    }
}
