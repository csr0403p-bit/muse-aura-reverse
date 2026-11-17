package com.facebook.aura.conversation.api;

import X.AnonymousClass005;
import com.facebook.aura.email.EmailReplyTargetProvider;
import com.facebook.aura.model.ReplyAttribution;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public class ConversationReplyTargetProviderStatic {
    public static ReplyAttribution.Context parse(int i, JsonObject jsonObject) {
        if (i == 0) {
            return EmailReplyTargetProvider.INSTANCE.parse(jsonObject);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
