package com.facebook.aura.conversation.data;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ChatHistoryFetchSuccess extends C06G implements ChatHistoryFetchResult {
    public final ChatHistoryResult result;

    public ChatHistoryFetchSuccess(ChatHistoryResult chatHistoryResult) {
        C7384Etj.A0Y(chatHistoryResult, 0);
        this.result = chatHistoryResult;
    }

    public final ChatHistoryFetchSuccess copy(ChatHistoryResult chatHistoryResult) {
        C7384Etj.A0Y(chatHistoryResult, 0);
        return new ChatHistoryFetchSuccess(chatHistoryResult);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ChatHistoryFetchSuccess) && C7384Etj.areEqual(this.result, ((ChatHistoryFetchSuccess) obj).result));
    }

    public static /* synthetic */ ChatHistoryFetchSuccess copy$default(ChatHistoryFetchSuccess chatHistoryFetchSuccess, ChatHistoryResult chatHistoryResult, int i, Object obj) {
        if ((i & 1) != 0) {
            chatHistoryResult = chatHistoryFetchSuccess.result;
        }
        C7384Etj.A0Y(chatHistoryResult, 0);
        return new ChatHistoryFetchSuccess(chatHistoryResult);
    }

    public final ChatHistoryResult component1() {
        return this.result;
    }

    public final ChatHistoryResult getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.result.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
