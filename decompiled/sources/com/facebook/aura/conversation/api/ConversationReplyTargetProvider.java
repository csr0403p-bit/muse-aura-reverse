package com.facebook.aura.conversation.api;

import com.facebook.aura.model.ReplyAttribution;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public interface ConversationReplyTargetProvider {
    ReplyAttribution.Context parse(JsonObject jsonObject);
}
