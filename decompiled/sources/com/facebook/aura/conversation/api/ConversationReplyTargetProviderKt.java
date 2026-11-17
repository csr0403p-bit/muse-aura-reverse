package com.facebook.aura.conversation.api;

import X.AnonymousClass005;
import X.C7384Etj;
import com.facebook.aura.email.EmailReplyTargetProvider;
import com.facebook.aura.model.ReplyAttribution;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class ConversationReplyTargetProviderKt {
    public static final ReplyAttribution.Context parseConversationReplyTarget(JsonObject jsonObject) {
        C7384Etj.A0Y(jsonObject, 0);
        int i = new int[]{0}[0];
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        ReplyAttribution.Context context = EmailReplyTargetProvider.INSTANCE.parse(jsonObject);
        if (context == null) {
            return null;
        }
        return context;
    }
}
